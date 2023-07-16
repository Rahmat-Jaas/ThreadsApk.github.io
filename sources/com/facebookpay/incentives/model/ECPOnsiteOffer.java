package com.facebookpay.incentives.model;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C86104wH;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;

public final class ECPOnsiteOffer implements ECPIncentive {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(80);
    public final CurrencyAmount A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
    }

    public final String BH2() {
        return this.A05;
    }

    public final String getId() {
        return this.A03;
    }

    public ECPOnsiteOffer(CurrencyAmount currencyAmount, String str, String str2, String str3, String str4, String str5, boolean z) {
        AnonymousClass0wJ.A1O(str, str2);
        C04220Ms.A0B(str4, 5);
        C86104wH.A1P(str5, 6, currencyAmount);
        this.A03 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A06 = z;
        this.A01 = str4;
        this.A02 = str5;
        this.A00 = currencyAmount;
    }
}
