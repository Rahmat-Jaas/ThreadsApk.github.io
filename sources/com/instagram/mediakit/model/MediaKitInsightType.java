package com.instagram.mediakit.model;

import X.AnonymousClass0wJ;
import X.AnonymousClass4WK;
import X.C18190wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape13S0000000_I2_13;
import java.util.LinkedHashMap;
import java.util.Map;

public enum MediaKitInsightType implements Parcelable {
    UNRECOGNIZED("MediaKitInsightType_unspecified"),
    TOTAL_FOLLOWERS("TOTAL_FOLLOWERS"),
    POSTS_CREATED("POSTS_CREATED"),
    ACCOUNTS_ENGAGED("ACCOUNTS_ENGAGED"),
    ACCOUNTS_REACHED("ACCOUNTS_REACHED"),
    DATE_JOINED("DATE_JOINED");
    
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
        for (MediaKitInsightType mediaKitInsightType : values()) {
            A0v.put(mediaKitInsightType.A00, mediaKitInsightType);
        }
        A01 = A0v;
        CREATOR = new PCreatorCreatorShape13S0000000_I2_13(35);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    MediaKitInsightType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass0wJ.A15(parcel, this);
    }
}
