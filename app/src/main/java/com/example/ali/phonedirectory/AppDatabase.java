package com.example.ali.phonedirectory;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@Database(entities = {Data.class},version = 1,exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
 /*   private static final String DB_NAME="vt.db";
    private static volatile AppDatabase instance;

    static synchronized AppDatabase getInstance(Context c){
        if (instance==null)
            instance=create(c);
        return instance;
    }
    private static AppDatabase create(final Context context){
        return Room.databaseBuilder(
                context,
                AppDatabase.class,
                DB_NAME).build();
    }*/

    public abstract DataDao getDao();


}
