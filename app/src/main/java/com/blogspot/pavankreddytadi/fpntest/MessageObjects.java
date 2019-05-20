package com.blogspot.pavankreddytadi.fpntest;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import java.sql.Timestamp;

@Entity(tableName = "allmessages")
public class MessageObjects
{
    @PrimaryKey(autoGenerate = true)
    int id;
    String title;
    String message;

    MessageObjects()
    {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
