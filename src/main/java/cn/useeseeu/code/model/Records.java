package cn.useeseeu.code.model;

import java.io.Serializable;

public class Records implements Serializable {
    private String id;
    private int count;

    public Records() {
    }

    public Records(String id, int count) {
        this.id = id;
        this.count = count;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
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
