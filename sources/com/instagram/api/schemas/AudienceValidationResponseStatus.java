package com.instagram.api.schemas;

import X.AnonymousClass0wJ;
import X.AnonymousClass4WK;
import X.C18190wL;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum AudienceValidationResponseStatus implements Parcelable {
    UNRECOGNIZED("AudienceValidationResponseStatus_unspecified"),
    WARNING("WARNING"),
    ERROR("ERROR");
    
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
        for (AudienceValidationResponseStatus audienceValidationResponseStatus : values()) {
            A0v.put(audienceValidationResponseStatus.A00, audienceValidationResponseStatus);
        }
        A01 = A0v;
        CREATOR = C86134wK.A0R(94);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    AudienceValidationResponseStatus(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass0wJ.A15(parcel, this);
    }
}
