package com.example.ali.phonedirectory;

public class DataModel {
    int imgId;
    String name,phoneNumber;

    public DataModel(int imgId, String name, String phoneNumber) {
        this.imgId = imgId;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
