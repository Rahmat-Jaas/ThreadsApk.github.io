package com.instagram.api.schemas;

import X.AnonymousClass0wJ;
import X.AnonymousClass4WK;
import X.C18190wL;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ApiAdFormats implements Parcelable {
    UNRECOGNIZED("ApiAdFormats_unspecified");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        LinkedHashMap A0v2 = C18190wL.A0v(AnonymousClass4WK.A0M(r4));
        for (ApiAdFormats apiAdFormats : values()) {
            A0v2.put(apiAdFormats.A00, apiAdFormats);
        }
        A01 = A0v2;
        CREATOR = C86134wK.A0R(88);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ApiAdFormats(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass0wJ.A15(parcel, this);
    }
}
