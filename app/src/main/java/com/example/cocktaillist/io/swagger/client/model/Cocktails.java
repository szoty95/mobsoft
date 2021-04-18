package com.example.cocktaillist.io.swagger.client.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




@ApiModel(description = "")
public class Cocktails   {
  
  @SerializedName("idDrink")
  private Long idDrink = null;
  
  @SerializedName("strDrink")
  private String strDrink = null;
  

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getIdDrink() {
    return idDrink;
  }
  public void setIdDrink(Long idDrink) {
    this.idDrink = idDrink;
  }

  
  /**
   * name of the cocktail
   **/
  @ApiModelProperty(value = "name of the cocktail")
  public String getStrDrink() {
    return strDrink;
  }
  public void setStrDrink(String strDrink) {
    this.strDrink = strDrink;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cocktails cocktails = (Cocktails) o;
    return Objects.equals(idDrink, cocktails.idDrink) &&
        Objects.equals(strDrink, cocktails.strDrink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idDrink, strDrink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cocktails {\n");
    
    sb.append("    idDrink: ").append(toIndentedString(idDrink)).append("\n");
    sb.append("    strDrink: ").append(toIndentedString(strDrink)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
