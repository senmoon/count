package cn.useeseeu.code.controller;

import cn.useeseeu.code.mapper.RecordsMapper;
import cn.useeseeu.code.model.Records;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class RecordsController {
    @Resource
    private RecordsMapper mapper;

    private final static String ID = "1927da2878b64b7f82fd8a041beb9935";

    @RequestMapping("/")
    public String selectCount(Model model) {
        Records records = new Records();
        QueryWrapper<Records> wrapper = new QueryWrapper<>();
        List<Records> list = mapper.selectList(wrapper);
        records.setId(ID);
        if (list.size() == 0) {
            records.setCount(1);
            mapper.insert(records);
        } else {
            Records r = list.get(0);
            int count = r.getCount();
            records.setCount(count + 1);
            mapper.updateById(records);
        }
        model.addAttribute("records", records);
        return "index";
    }
}
