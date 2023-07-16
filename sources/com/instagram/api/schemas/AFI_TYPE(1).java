package com.instagram.api.schemas;

import X.AnonymousClass0wJ;
import X.AnonymousClass4WK;
import X.C18190wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape6S0000000_I2_6;
import java.util.LinkedHashMap;
import java.util.Map;

public enum AFI_TYPE implements Parcelable {
    UNRECOGNIZED("AFI_TYPE_unspecified"),
    SEE_MORE_LESS("see_more_less"),
    DWELL_FEED_SEE_MORE_LESS("dwell_feed_see_more_less"),
    DWELL_REELS_SEE_MORE_LESS("dwell_reels_see_more_less");
    
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
        for (AFI_TYPE afi_type : values()) {
            A0v.put(afi_type.A00, afi_type);
        }
        A01 = A0v;
        CREATOR = new PCreatorCreatorShape6S0000000_I2_6(77);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    AFI_TYPE(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass0wJ.A15(parcel, this);
    }
}
