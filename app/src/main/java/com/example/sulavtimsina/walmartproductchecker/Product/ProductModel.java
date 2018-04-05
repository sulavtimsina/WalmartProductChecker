
package com.example.sulavtimsina.walmartproductchecker.Product;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProductModel {

    @SerializedName("itemId")
    @Expose
    public Integer itemId;
    @SerializedName("parentItemId")
    @Expose
    public Integer parentItemId;
    @SerializedName("name")
    @Expose
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    @SerializedName("msrp")
    @Expose
    public Integer msrp;
    @SerializedName("salePrice")
    @Expose
    public Double salePrice;
    @SerializedName("upc")
    @Expose
    public String upc;
    @SerializedName("categoryPath")
    @Expose
    public String categoryPath;
    @SerializedName("shortDescription")
    @Expose
    public String shortDescription;
    @SerializedName("longDescription")
    @Expose
    public String longDescription;
    @SerializedName("brandName")
    @Expose
    public String brandName;
    @SerializedName("thumbnailImage")
    @Expose
    public String thumbnailImage;
    @SerializedName("mediumImage")
    @Expose
    public String mediumImage;
    @SerializedName("largeImage")
    @Expose
    public String largeImage;
    @SerializedName("productTrackingUrl")
    @Expose
    public String productTrackingUrl;
    @SerializedName("ninetySevenCentShipping")
    @Expose
    public Boolean ninetySevenCentShipping;
    @SerializedName("standardShipRate")
    @Expose
    public Integer standardShipRate;
    @SerializedName("size")
    @Expose
    public String size;
    @SerializedName("color")
    @Expose
    public String color;
    @SerializedName("shipToStore")
    @Expose
    public Boolean shipToStore;
    @SerializedName("freeShipToStore")
    @Expose
    public Boolean freeShipToStore;
    @SerializedName("modelNumber")
    @Expose
    public String modelNumber;
    @SerializedName("productUrl")
    @Expose
    public String productUrl;
    @SerializedName("customerRating")
    @Expose
    public String customerRating;
    @SerializedName("numReviews")
    @Expose
    public Integer numReviews;
    @SerializedName("customerRatingImage")
    @Expose
    public String customerRatingImage;
    @SerializedName("bestMarketplacePrice")
    @Expose
    public BestMarketplacePrice bestMarketplacePrice;
    @SerializedName("categoryNode")
    @Expose
    public String categoryNode;
    @SerializedName("bundle")
    @Expose
    public Boolean bundle;
    @SerializedName("clearance")
    @Expose
    public Boolean clearance;
    @SerializedName("preOrder")
    @Expose
    public Boolean preOrder;
    @SerializedName("stock")
    @Expose
    public String stock;
    @SerializedName("attributes")
    @Expose
    public Attributes attributes;
    @SerializedName("addToCartUrl")
    @Expose
    public String addToCartUrl;
    @SerializedName("affiliateAddToCartUrl")
    @Expose
    public String affiliateAddToCartUrl;
    @SerializedName("freeShippingOver50Dollars")
    @Expose
    public Boolean freeShippingOver50Dollars;
    @SerializedName("giftOptions")
    @Expose
    public GiftOptions giftOptions;
    @SerializedName("imageEntities")
    @Expose
    public List<ImageEntity> imageEntities = null;
    @SerializedName("offerType")
    @Expose
    public String offerType;
    @SerializedName("isTwoDayShippingEligible")
    @Expose
    public Boolean isTwoDayShippingEligible;
    @SerializedName("availableOnline")
    @Expose
    public Boolean availableOnline;

}
