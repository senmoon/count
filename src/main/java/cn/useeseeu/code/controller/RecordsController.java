package cn.useeseeu.code.controller;

import cn.useeseeu.code.mapper.RecordsMapper;
import cn.useeseeu.code.model.Records;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class RecordsController {
    @Resource
    private RecordsMapper mapper;

    private final static String ID = "1927da2878b64b7f82fd8a041beb9935";

    private Records insert() {
        Records records = new Records();
        QueryWrapper<Records> wrapper = new QueryWrapper<>();
        List<Records> list = mapper.selectList(wrapper);
        records.setId(ID);
        Integer count = 1;
        if (list.size() == 0) {
            records.setCount(count);
            mapper.insert(records);
        } else {
            Records r = list.get(0);
            count = r.getCount() + 1;
            records.setCount(count);
            mapper.updateById(records);
        }
        return records;
    }

    @RequestMapping("/")
    public String selectCount(Model model) {
        //Records records = insert();
        //model.addAttribute("records", records);
        return "index";
    }

    @ResponseBody
    @RequestMapping("/count")
    public int getCount() {
        insert();
        List<Records> records = mapper.selectList(new QueryWrapper<>());
        Records r = records.get(0);
        System.out.println(r.getCount());
        return r.getCount();
    }
}
