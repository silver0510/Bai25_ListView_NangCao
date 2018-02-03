package com.example.sinki.model;

import java.io.Serializable;

/**
 * Created by Sinki on 8/20/2017.
 */

public class DanhBa implements Serializable{
    private int ma;
    private String ten;
    private String phone;

    public DanhBa() {
    }
    public DanhBa(int ma, String ten, String phone) {
        this.ma = ma;
        this.ten = ten;
        this.phone = phone;
    }
    public int getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getPhone() {
        return phone;
    }


}
