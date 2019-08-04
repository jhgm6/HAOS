package com.scsj.haos.common.domain;

import java.util.Date;

public class Room {
    private String roomnum;

    private String type;

    private Date intime;

    private Date outtime;

    private Boolean isused;

    public String getRoomnum() {
        return roomnum;
    }

    public void setRoomnum(String roomnum) {
        this.roomnum = roomnum == null ? null : roomnum.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getIntime() {
        return intime;
    }

    public void setIntime(Date intime) {
        this.intime = intime;
    }

    public Date getOuttime() {
        return outtime;
    }

    public void setOuttime(Date outtime) {
        this.outtime = outtime;
    }

    public Boolean getIsused() {
        return isused;
    }

    public void setIsused(Boolean isused) {
        this.isused = isused;
    }
}