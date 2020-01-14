package com.example.myroomexample

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "word_table")
public class Word(@PrimaryKey @ColumnInfo(name = "word") val word: String)