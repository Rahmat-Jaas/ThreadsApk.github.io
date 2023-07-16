package com.instagram.model.shopping.merchantfeed;

import X.C18180wK;
import X.C32572Cj;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape14S0000000_I2_14;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.ProductDetailsProductItemDict;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.model.shopping.productfeed.ProductTileMedia;

public class ProductThumbnail implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape14S0000000_I2_14(95);
    public ProductDetailsProductItemDict A00;
    public ProductTileMedia A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductTile)) {
            return false;
        }
        ProductThumbnail productThumbnail = (ProductThumbnail) obj;
        return C32572Cj.A00(this.A00, productThumbnail.A00) && C32572Cj.A00(this.A01, productThumbnail.A01);
    }

    public final int hashCode() {
        return C86124wJ.A0H(this.A00, this.A01);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }

    public ProductThumbnail(Parcel parcel) {
        this.A00 = (ProductDetailsProductItemDict) C18180wK.A0A(parcel, Product.class);
        this.A01 = (ProductTileMedia) C18180wK.A0A(parcel, ProductTileMedia.class);
    }

    public ProductThumbnail() {
    }
}
