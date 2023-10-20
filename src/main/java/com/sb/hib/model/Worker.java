package com.sb.hib.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int wid;
    private String wname;

    public int getWid() {return wid;}

    public void setWid(int wid) {
        this.wid = wid;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

}
