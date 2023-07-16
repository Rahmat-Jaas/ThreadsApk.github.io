package com.instagram.shopping.model.destination.home;

import X.AnonymousClass0wJ;
import X.AnonymousClass4WK;
import X.C18190wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape16S0000000_I2_16;
import java.util.LinkedHashMap;
import java.util.Map;

public enum DestinationItemTextStyleType implements Parcelable {
    UNRECOGNIZED("DestinationItemTextStyleType_unspecified"),
    SECONDARY("secondary"),
    ERROR("error"),
    BODY_1("body_1"),
    BODY_1_EMPHASIZED("body_1_emphasized");
    
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
        for (DestinationItemTextStyleType destinationItemTextStyleType : values()) {
            A0v.put(destinationItemTextStyleType.A00, destinationItemTextStyleType);
        }
        A01 = A0v;
        CREATOR = new PCreatorCreatorShape16S0000000_I2_16(82);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    DestinationItemTextStyleType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass0wJ.A15(parcel, this);
    }
}
