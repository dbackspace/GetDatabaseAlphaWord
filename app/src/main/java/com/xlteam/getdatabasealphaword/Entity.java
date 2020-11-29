package com.xlteam.getdatabasealphaword;

import androidx.room.ColumnInfo;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@androidx.room.Entity(tableName = "wordDictionary")
public class Entity {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "word")
    private String word;

    public Entity(int id, String word) {
        this.id = id;
        this.word = word;
    }

    @Ignore
    public Entity(String word){
        this.word = word;
    }
}