package com.scsj.haos.common.domain;

public class RoomType {
    private Integer id;

    private String type;

    private Float price;

    private String matids;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getMatids() {
        return matids;
    }

    public void setMatids(String matids) {
        this.matids = matids == null ? null : matids.trim();
    }
}