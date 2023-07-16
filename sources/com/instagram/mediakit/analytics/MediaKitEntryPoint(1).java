package com.instagram.mediakit.analytics;

import X.C18190wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape13S0000000_I2_13;

public enum MediaKitEntryPoint implements Parcelable {
    BRANDED_CONTENT_SETTINGS("bc_settings"),
    DEV_OPTIONS("dev_options"),
    DIRECT_XMA("direct_xma"),
    EXTERNAL_LINK("external_link"),
    PRO_DASH_TIP("pro_dash_tip"),
    PROFILE("profile"),
    QP("qp"),
    UNKNOWN("unknown");
    
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = new PCreatorCreatorShape13S0000000_I2_13(29);
    }

    /* access modifiers changed from: public */
    MediaKitEntryPoint(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18190wL.A15(parcel, this);
    }
}
