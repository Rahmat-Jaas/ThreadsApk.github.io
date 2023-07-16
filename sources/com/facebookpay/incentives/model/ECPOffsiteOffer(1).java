package com.facebookpay.incentives.model;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C86114wI;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;

public final class ECPOffsiteOffer implements ECPIncentive {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(79);
    public final String A00;
    public final CurrencyAmount A01;
    public final Boolean A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A06);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeInt(C86114wI.A1W(parcel, this.A02) ? 1 : 0);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A01, i);
    }

    public final String BH2() {
        return this.A06;
    }

    public final String getId() {
        return this.A00;
    }

    public ECPOffsiteOffer(CurrencyAmount currencyAmount, Boolean bool, String str, String str2, String str3, String str4, String str5) {
        AnonymousClass0wJ.A1O(str, str2);
        this.A00 = str;
        this.A06 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A02 = bool;
        this.A03 = str5;
        this.A01 = currencyAmount;
    }
}
