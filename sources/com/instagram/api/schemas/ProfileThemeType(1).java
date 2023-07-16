package com.instagram.api.schemas;

import X.AnonymousClass0wJ;
import X.AnonymousClass4WK;
import X.C18190wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape8S0000000_I2_8;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ProfileThemeType implements Parcelable {
    UNRECOGNIZED("ProfileThemeType_unspecified"),
    NONE("0"),
    COLOR_GRADIENT(RealtimeSubscription.GRAPHQL_MQTT_VERSION),
    THEME("2"),
    CUSTOM_IMAGE("3");
    
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
        for (ProfileThemeType profileThemeType : values()) {
            A0v.put(profileThemeType.A00, profileThemeType);
        }
        A01 = A0v;
        CREATOR = new PCreatorCreatorShape8S0000000_I2_8(95);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ProfileThemeType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass0wJ.A15(parcel, this);
    }
}
