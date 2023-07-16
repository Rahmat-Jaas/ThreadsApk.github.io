package com.facebookpay.common.recyclerview.adapteritems;

import X.AnonymousClass69U;
import X.C04220Ms;
import X.C18190wL;
import X.C86104wH;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.expresscheckout.models.ItemDetails;

public final class PuxEntityItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(76);
    public final CurrencyAmount A00;
    public final ItemDetails A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final AnonymousClass69U A06;
    public final String A07;

    public PuxEntityItem(CurrencyAmount currencyAmount, AnonymousClass69U r3, ItemDetails itemDetails, String str, String str2, String str3, String str4, String str5) {
        C04220Ms.A0B(r3, 1);
        C18190wL.A1S(str2, 3, itemDetails);
        C04220Ms.A0B(currencyAmount, 7);
        this.A06 = r3;
        this.A07 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A01 = itemDetails;
        this.A05 = str4;
        this.A00 = currencyAmount;
        this.A03 = str5;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        C86104wH.A1B(parcel, this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A03);
    }

    public final AnonymousClass69U AqR() {
        return this.A06;
    }
}
