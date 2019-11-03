package com.example.haikel.tpsqlite.model;

import java.io.Serializable;

public class Contact implements Serializable {

    private int id;
    private String name, tenLop;

    public Contact() { }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + tenLop;
    }
}
