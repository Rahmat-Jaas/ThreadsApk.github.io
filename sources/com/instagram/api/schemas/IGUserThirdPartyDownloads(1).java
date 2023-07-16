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

public enum IGUserThirdPartyDownloads implements Parcelable {
    UNRECOGNIZED("IGUserThirdPartyDownloads_unspecified"),
    NOT_SET("0"),
    ENABLED(RealtimeSubscription.GRAPHQL_MQTT_VERSION),
    DISABLED("2");
    
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
        for (IGUserThirdPartyDownloads iGUserThirdPartyDownloads : values()) {
            A0v.put(iGUserThirdPartyDownloads.A00, iGUserThirdPartyDownloads);
        }
        A01 = A0v;
        CREATOR = new PCreatorCreatorShape8S0000000_I2_8(17);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    IGUserThirdPartyDownloads(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass0wJ.A15(parcel, this);
    }
}
