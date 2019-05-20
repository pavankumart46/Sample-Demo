package com.blogspot.pavankreddytadi.fpntest;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {MessageObjects.class},version = 1,exportSchema = false)
public abstract class MessagesDatabase extends RoomDatabase {
    public abstract MessageObjectsDAO messageObjectsDAO();
}
