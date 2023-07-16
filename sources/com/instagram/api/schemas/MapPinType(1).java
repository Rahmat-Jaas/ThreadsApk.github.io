package com.instagram.api.schemas;

import X.AnonymousClass0wJ;
import X.AnonymousClass4WK;
import X.C18190wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape8S0000000_I2_8;
import java.util.LinkedHashMap;
import java.util.Map;

public enum MapPinType implements Parcelable {
    UNRECOGNIZED("MapPinType_unspecified"),
    FEED("FEED"),
    STORY("STORY"),
    STICKER("STICKER"),
    SAVED_LOCATION("SAVED_LOCATION"),
    NO_LOCATION("NO_LOCATION"),
    NO_PIN("NO_PIN");
    
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
        for (MapPinType mapPinType : values()) {
            A0v.put(mapPinType.A00, mapPinType);
        }
        A01 = A0v;
        CREATOR = new PCreatorCreatorShape8S0000000_I2_8(39);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    MapPinType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass0wJ.A15(parcel, this);
    }
}
