package com.instagram.model.reels.sponsored;

import X.AnonymousClass0wJ;
import X.AnonymousClass4WK;
import X.C18190wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.redex.PCreatorCreatorShape14S0000000_I2_14;
import java.util.LinkedHashMap;
import java.util.Map;

public enum AdsCardBackgroundType implements Parcelable {
    UNRECOGNIZED("AdsCardBackgroundType_unspecified"),
    NONE(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED),
    BLURRED_CROPPED_IMAGE("BLURRED_CROPPED_IMAGE"),
    PORTAL_COLOR_GRADIENT("PORTAL_COLOR_GRADIENT");
    
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
        for (AdsCardBackgroundType adsCardBackgroundType : values()) {
            A0v.put(adsCardBackgroundType.A00, adsCardBackgroundType);
        }
        A01 = A0v;
        CREATOR = new PCreatorCreatorShape14S0000000_I2_14(12);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    AdsCardBackgroundType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass0wJ.A15(parcel, this);
    }
}
