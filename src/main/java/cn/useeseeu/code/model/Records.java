package cn.useeseeu.code.model;

import java.io.Serializable;

public class Records implements Serializable {
    private String id;
    private Integer count;

    public Records() {
    }

    public Records(String id, Integer count) {
        this.id = id;
        this.count = count;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Records{" +
                "id='" + id + '\'' +
                ", count=" + count +
                '}';
    }
}
