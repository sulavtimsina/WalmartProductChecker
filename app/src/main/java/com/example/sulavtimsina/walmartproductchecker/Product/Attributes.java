
package com.example.sulavtimsina.walmartproductchecker.Product;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Attributes {

    @SerializedName("chokingHazardWarning")
    @Expose
    public String chokingHazardWarning;
    @SerializedName("color")
    @Expose
    public String color;
    @SerializedName("mainimageurl")
    @Expose
    public String mainimageurl;

}
