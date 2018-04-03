
package com.example.sulavtimsina.walmartproductchecker.Product;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GiftOptions {

    @SerializedName("allowGiftWrap")
    @Expose
    public Boolean allowGiftWrap;
    @SerializedName("allowGiftMessage")
    @Expose
    public Boolean allowGiftMessage;
    @SerializedName("allowGiftReceipt")
    @Expose
    public Boolean allowGiftReceipt;

}
