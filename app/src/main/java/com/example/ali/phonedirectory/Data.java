package com.example.ali.phonedirectory;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "Contacts")
public class Data {

  /*  @ColumnInfo(name = "imgId")
    private int imgId;*/

    @NonNull
    @ColumnInfo(name = "personName")
    private String personName;

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "personNumber")
    private String personNumber;

  /*  public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }*/

    @NonNull
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(@NonNull String personName) {
        this.personName = personName;
    }

    @NonNull
    public String getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(@NonNull String personNumber) {
        this.personNumber = personNumber;
    }
}
