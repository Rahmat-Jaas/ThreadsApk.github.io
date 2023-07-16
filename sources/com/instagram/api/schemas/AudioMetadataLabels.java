package com.instagram.api.schemas;

import X.AnonymousClass0wJ;
import X.AnonymousClass4WK;
import X.C18190wL;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum AudioMetadataLabels implements Parcelable {
    UNRECOGNIZED("AudioMetadataLabels_unspecified"),
    PRE_RELEASE("pre_release"),
    NEW_RELEASE("new_release");
    
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
        for (AudioMetadataLabels audioMetadataLabels : values()) {
            A0v.put(audioMetadataLabels.A00, audioMetadataLabels);
        }
        A01 = A0v;
        CREATOR = C86134wK.A0R(97);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    AudioMetadataLabels(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass0wJ.A15(parcel, this);
    }
}
