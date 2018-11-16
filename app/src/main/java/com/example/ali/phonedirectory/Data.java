package com.example.ali.phonedirectory;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "Contacts")
public class Data {
    @NonNull
    @ColumnInfo(name = "resim")
    private int resim;

    @NonNull
    @ColumnInfo(name = "personName")
    private String personName;

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "personNumber")
    private String personNumber;

    @NonNull
    public int getResim() {
        return resim;
    }

    public void setResim(@NonNull int resim) {
        this.resim = resim;
    }

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
