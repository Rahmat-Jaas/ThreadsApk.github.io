package com.instagram.barcelonaig.intf;

import X.AnonymousClass4WK;
import X.C18190wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape9S0000000_I2_9;
import java.util.LinkedHashMap;
import java.util.Map;

public enum GetApp$Type implements Parcelable {
    NOTIFICATION("notification"),
    OTHER_PROFILE("other_profile");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        CREATOR = new PCreatorCreatorShape9S0000000_I2_9(85);
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0L(r3));
        for (GetApp$Type getApp$Type : values()) {
            A0v.put(getApp$Type.A00, getApp$Type);
        }
        A01 = A0v;
    }

    /* access modifiers changed from: public */
    GetApp$Type(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18190wL.A15(parcel, this);
    }
}
