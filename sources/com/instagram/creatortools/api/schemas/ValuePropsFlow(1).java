package com.instagram.creatortools.api.schemas;

import X.AnonymousClass0wJ;
import X.AnonymousClass4WK;
import X.C18190wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape11S0000000_I2_11;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ValuePropsFlow implements Parcelable {
    UNRECOGNIZED("ValuePropsFlow_unspecified"),
    PRODUCTS("products"),
    INSIGHTS("insights"),
    ACCOUNTS("accounts"),
    INSPIRATION("inspiration"),
    BONUSES("incentive_platform"),
    SUBSCRIPTION("fan_club_creator"),
    BADGES("badges_incentives"),
    CREATOR_MARKETPLACE("branded_content_deal_creator");
    
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
        for (ValuePropsFlow valuePropsFlow : values()) {
            A0v.put(valuePropsFlow.A00, valuePropsFlow);
        }
        A01 = A0v;
        CREATOR = new PCreatorCreatorShape11S0000000_I2_11(57);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ValuePropsFlow(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass0wJ.A15(parcel, this);
    }
}
