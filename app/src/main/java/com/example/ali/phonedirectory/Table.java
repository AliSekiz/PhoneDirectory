package com.example.ali.phonedirectory;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "contacts")
public class Table {
    @ColumnInfo(name = "ImageId")
    private int imgId;

    @NonNull
    @ColumnInfo(name = "personName")
    private String personName;

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "personNumber")
    private int personNumber;

}
