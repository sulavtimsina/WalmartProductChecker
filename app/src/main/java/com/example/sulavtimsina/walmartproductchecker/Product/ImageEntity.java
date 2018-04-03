
package com.example.sulavtimsina.walmartproductchecker.Product;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ImageEntity {

    @SerializedName("thumbnailImage")
    @Expose
    public String thumbnailImage;
    @SerializedName("mediumImage")
    @Expose
    public String mediumImage;
    @SerializedName("largeImage")
    @Expose
    public String largeImage;
    @SerializedName("entityType")
    @Expose
    public String entityType;

}
