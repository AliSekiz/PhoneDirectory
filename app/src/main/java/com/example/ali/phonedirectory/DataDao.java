package com.example.ali.phonedirectory;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.ArrayList;
import java.util.List;
//class ismi dao olamaz yoksa çakışıyor
@Dao
public interface DataDao {
    @Query("Select * From Contacts")
    List<Data> getData();

    @Query("Select * From Contacts Where personNumber Like :personNumber")
    Data getPerson(String personNumber);

    @Insert
    void insertData(Data... data);
    @Delete
    void deleteData(Data... data);
    @Update
    void updateData(Data... data);

}
