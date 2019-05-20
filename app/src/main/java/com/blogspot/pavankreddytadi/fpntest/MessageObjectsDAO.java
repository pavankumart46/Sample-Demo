package com.blogspot.pavankreddytadi.fpntest;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface MessageObjectsDAO
{
    @Insert
    void insert(MessageObjects messageObjects);

    @Query("select * from allmessages")
    List<MessageObjects> getAllMessages();
}
