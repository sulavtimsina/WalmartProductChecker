
package com.example.sulavtimsina.walmartproductchecker.Product;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BestMarketplacePrice {

    @SerializedName("twoThreeDayShippingRate")
    @Expose
    public Double twoThreeDayShippingRate;
    @SerializedName("availableOnline")
    @Expose
    public Boolean availableOnline;
    @SerializedName("clearance")
    @Expose
    public Boolean clearance;

}
