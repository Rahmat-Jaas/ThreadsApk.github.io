package com.instagram.api.schemas;

import X.AnonymousClass0wJ;
import X.AnonymousClass4WK;
import X.C18190wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape9S0000000_I2_9;
import java.util.LinkedHashMap;
import java.util.Map;

public enum SellerBadgeSurfaces implements Parcelable {
    UNRECOGNIZED("SellerBadgeSurfaces_unspecified"),
    PDP_ABOUT_THIS_SHOP("PDP_ABOUT_THIS_SHOP"),
    PRODUCT_DESCRIPTION_PAGE("PRODUCT_DESCRIPTION_PAGE"),
    SHOP_TAB("SHOP_TAB"),
    SHOPS_DIRECTORY("SHOPS_DIRECTORY");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0L(r3));
        for (SellerBadgeSurfaces sellerBadgeSurfaces : values()) {
            A0v.put(sellerBadgeSurfaces.A00, sellerBadgeSurfaces);
        }
        A01 = A0v;
        CREATOR = new PCreatorCreatorShape9S0000000_I2_9(21);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    SellerBadgeSurfaces(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass0wJ.A15(parcel, this);
    }
}
