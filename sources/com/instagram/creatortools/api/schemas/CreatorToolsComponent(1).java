package com.instagram.creatortools.api.schemas;

import X.AnonymousClass0wJ;
import X.AnonymousClass4WK;
import X.C18190wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape11S0000000_I2_11;
import java.util.LinkedHashMap;
import java.util.Map;

public enum CreatorToolsComponent implements Parcelable {
    UNRECOGNIZED("CreatorToolsComponent_unspecified"),
    COVER("cover"),
    PRODUCT_VALUE_PROPS("value_prop"),
    PRODUCT_ELIGIBILITY_CRITERIA("product_eligibility_criteria"),
    SECTION_HEADER("section_header"),
    INSIGHTS("insights"),
    MONETIZATION("monetization"),
    INSPIRATION("inspiration");
    
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
        for (CreatorToolsComponent creatorToolsComponent : values()) {
            A0v.put(creatorToolsComponent.A00, creatorToolsComponent);
        }
        A01 = A0v;
        CREATOR = new PCreatorCreatorShape11S0000000_I2_11(55);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    CreatorToolsComponent(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass0wJ.A15(parcel, this);
    }
}
