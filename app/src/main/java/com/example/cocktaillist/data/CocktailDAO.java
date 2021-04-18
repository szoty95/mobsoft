package com.example.cocktaillist.data;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface CocktailDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<Cocktail> cocktails);

    @Query("SELECT * FROM " + "cocktails")
    List<Cocktail> getAll();
}
