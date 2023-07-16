package com.instagram.business.promote.model;

import X.C04220Ms;
import X.C86104wH;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape10S0000000_I2_10;

public enum LinkingAuthState implements Parcelable {
    NEW_AUTH("new_auth"),
    EXISTING_AUTH("existing_auth"),
    REMOVE_CAL_CACHED_TOKEN("remove_cal_cached_token"),
    REMOVE_CAL_NEW_AUTH("remove_cal_new_auth"),
    PRO2PRO_CACHED_TOKEN("pro2pro_cached_token"),
    PRO2PRO_NEW_AUTH("pro2pro_new_auth"),
    BUSINESS_TOKEN_OR_UNKNOWN("business_token_or_unknown");
    
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        C86104wH.A1B(parcel, this);
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = new PCreatorCreatorShape10S0000000_I2_10(24);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    LinkingAuthState(String str) {
        this.A00 = str;
    }
}
