package com.instagram.model.shopping;

import X.C18180wK;
import X.C32572Cj;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape14S0000000_I2_14;

public class ProductTileProduct implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape14S0000000_I2_14(63);
    public FBProduct A00;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductTileProduct)) {
            return false;
        }
        return C32572Cj.A00(this.A00, ((ProductTileProduct) obj).A00);
    }

    public final int hashCode() {
        return C86124wJ.A0F(this.A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
    }

    public ProductTileProduct(Parcel parcel) {
        this.A00 = (FBProduct) C18180wK.A0A(parcel, FBProduct.class);
    }

    public ProductTileProduct(FBProduct fBProduct) {
        this.A00 = fBProduct;
    }

    public ProductTileProduct() {
    }
}
