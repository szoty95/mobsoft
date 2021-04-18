package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.Cocktails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CocktailsApi {
  
  /**
   * Returns the cocktail for the ID
   * 
   * @param i cocktail id
   * @return Call<List<Cocktails>>
   */
  
  @GET("lookup.php")
  Call<List<Cocktails>> getCocktailById(
    @Query("i") Long i
  );

  
  /**
   * Update an existing Cocktail
   * 
   * @param i cocktail id
   * @param body The Cocktail to create
   * @return Call<Void>
   */
  
  @PUT("lookup.php")
  Call<Void> updateCocktail(
    @Query("i") Long i, @Body Cocktails body
  );

  
  /**
   * Creates new cocktail
   * 
   * @param body The Cocktail to create
   * @return Call<Void>
   */
  
  @POST("lookup.php")
  Call<Void> createNewCocktail(
    @Body Cocktails body
  );

  
  /**
   * Deletes a Cocktail
   * 
   * @param i cocktail id
   * @return Call<Void>
   */
  
  @DELETE("lookup.php")
  Call<Void> deleteCocktail(
    @Query("i") Long i
  );

  
  /**
   * Returns a random cocktail
   * 
   * @return Call<List<Cocktails>>
   */
  
  @GET("random.php")
  Call<List<Cocktails>> getRandomCocktail();
    

  
}
