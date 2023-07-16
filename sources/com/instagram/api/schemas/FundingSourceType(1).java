package com.instagram.api.schemas;

import X.AnonymousClass0wJ;
import X.AnonymousClass4WK;
import X.C18190wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape7S0000000_I2_7;
import java.util.LinkedHashMap;
import java.util.Map;

public enum FundingSourceType implements Parcelable {
    UNRECOGNIZED("FundingSourceType_unspecified"),
    UNSET("UNSET"),
    CREDIT_CARD("CREDIT_CARD"),
    FACEBOOK_EXTENDED_CREDIT("FACEBOOK_EXTENDED_CREDIT"),
    ORDER("ORDER"),
    INVOICE("INVOICE"),
    FACEBOOK_TOKEN("FACEBOOK_TOKEN"),
    PAYPAL_TOKEN("PAYPAL_TOKEN"),
    PAYPAL_BILLING_AGREEMENT("PAYPAL_BILLING_AGREEMENT"),
    DIRECT_DEBIT("DIRECT_DEBIT"),
    DUMMY("DUMMY"),
    ALTPAY("ALTPAY");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0L(r4));
        for (FundingSourceType fundingSourceType : values()) {
            A0v.put(fundingSourceType.A00, fundingSourceType);
        }
        A01 = A0v;
        CREATOR = new PCreatorCreatorShape7S0000000_I2_7(86);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    FundingSourceType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass0wJ.A15(parcel, this);
    }
}
