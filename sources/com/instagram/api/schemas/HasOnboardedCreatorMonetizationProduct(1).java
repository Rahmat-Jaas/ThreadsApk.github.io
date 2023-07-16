package com.instagram.api.schemas;

import X.AnonymousClass0wJ;
import X.AnonymousClass4WK;
import X.C18190wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape7S0000000_I2_7;
import java.util.LinkedHashMap;
import java.util.Map;

public enum HasOnboardedCreatorMonetizationProduct implements Parcelable {
    UNRECOGNIZED("HasOnboardedCreatorMonetizationProduct_unspecified"),
    HAS_COMPLETED_ONBOARDING("has_completed_onboarding");
    
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
        for (HasOnboardedCreatorMonetizationProduct hasOnboardedCreatorMonetizationProduct : values()) {
            A0v.put(hasOnboardedCreatorMonetizationProduct.A00, hasOnboardedCreatorMonetizationProduct);
        }
        A01 = A0v;
        CREATOR = new PCreatorCreatorShape7S0000000_I2_7(95);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    HasOnboardedCreatorMonetizationProduct(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass0wJ.A15(parcel, this);
    }
}
