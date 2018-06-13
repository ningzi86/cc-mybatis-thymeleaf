package cn.golango.mybatis.dto;

import java.util.List;

public class ContentDto {

    public  int cid;
    public  String name;

    public List<String> cid3;

    public List<String> getCid3() {
        return cid3;
    }

    public void setCid3(List<String> cid3) {
        this.cid3 = cid3;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
