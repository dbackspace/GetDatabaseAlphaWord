package com.xlteam.getdatabasealphaword;

import androidx.room.Dao;
import androidx.room.Insert;

@Dao
public interface EntityDao {
    @Insert
    void insertWord(Entity word);
}
