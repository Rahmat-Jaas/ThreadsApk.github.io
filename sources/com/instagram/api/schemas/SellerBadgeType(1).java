package com.instagram.api.schemas;

import X.AnonymousClass0wJ;
import X.AnonymousClass4WK;
import X.C18190wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape9S0000000_I2_9;
import java.util.LinkedHashMap;
import java.util.Map;

public enum SellerBadgeType implements Parcelable {
    UNRECOGNIZED("SellerBadgeType_unspecified"),
    POPULAR_BADGE_2022("POPULAR_BADGE_2022"),
    PREFERRED("PREFERRED");
    
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
        for (SellerBadgeType sellerBadgeType : values()) {
            A0v.put(sellerBadgeType.A00, sellerBadgeType);
        }
        A01 = A0v;
        CREATOR = new PCreatorCreatorShape9S0000000_I2_9(22);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    SellerBadgeType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass0wJ.A15(parcel, this);
    }
}
