package com.example.cocktaillist.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Cocktail.class}, version = 1, exportSchema = false)
public abstract class LocalDB extends RoomDatabase {

    public abstract CocktailDAO cocktailDAO();
}
