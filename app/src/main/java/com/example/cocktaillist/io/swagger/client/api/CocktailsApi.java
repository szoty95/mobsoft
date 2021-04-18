package com.example.cocktaillist.io.swagger.client.api;

import android.telecom.Call;

import com.example.cocktaillist.io.swagger.client.model.Cocktails;

import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;

public interface CocktailsApi {

  /**
   * Returns the cocktail for the ID
   *
   * @param i cocktail id
   * @return Call<List<Cocktails>>
   */

  @GET("lookup.php")
  Call getCocktailById(
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
  Call updateCocktail(
    @Query("i") Long i, @Body Cocktails body
  );

  
  /**
   * Creates new cocktail
   * 
   * @param body The Cocktail to create
   * @return Call<Void>
   */
  
  @POST("lookup.php")
  Call createNewCocktail(
    @Body Cocktails body
  );

  
  /**
   * Deletes a Cocktail
   * 
   * @param i cocktail id
   * @return Call<Void>
   */
  
  @DELETE("lookup.php")
  Call deleteCocktail(
    @Query("i") Long i
  );

  
  /**
   * Returns a random cocktail
   * 
   * @return Call<List<Cocktails>>
   */
  
  @GET("random.php")
  Call getRandomCocktail();
    

  
}
