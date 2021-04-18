package com.example.cocktaillist.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "cocktails")
public class Cocktail {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "cocktailId")
    private int id;

    @SerializedName("cocktailname")
    @ColumnInfo(name = "cocktailName")
    private String cocktailName;

    @SerializedName("ingredients")
    @ColumnInfo(name = "ingredients")
    private String ingredients;

    public int getId() {
        return id;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getCocktailName() {
        return cocktailName;
    }

    public void setCocktailName(String cocktailName) {
        this.cocktailName = cocktailName;
    }

    public void setId(int id) {
        this.id = id;
    }
}
