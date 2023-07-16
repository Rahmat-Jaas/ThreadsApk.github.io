package com.facebookpay.common.recyclerview.adapteritems;

import X.AnonymousClass69U;
import X.C04220Ms;
import X.C18190wL;
import X.C86104wH;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;
import java.util.List;

public final class PuxOrderSummaryItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(79);
    public final int A00;
    public final CurrencyAmount A01;
    public final CurrencyAmount A02;
    public final AnonymousClass69U A03;
    public final String A04;
    public final List A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public PuxOrderSummaryItem(CurrencyAmount currencyAmount, CurrencyAmount currencyAmount2, AnonymousClass69U r4, String str, List list, int i, boolean z, boolean z2, boolean z3) {
        C04220Ms.A0B(r4, 1);
        C18190wL.A1S(list, 3, currencyAmount);
        C04220Ms.A0B(currencyAmount2, 6);
        this.A03 = r4;
        this.A04 = str;
        this.A05 = list;
        this.A00 = i;
        this.A02 = currencyAmount;
        this.A01 = currencyAmount2;
        this.A08 = z;
        this.A07 = z2;
        this.A06 = z3;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        C86104wH.A1B(parcel, this.A03);
        parcel.writeString(this.A04);
        parcel.writeStringList(this.A05);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
    }

    public final AnonymousClass69U AqR() {
        return this.A03;
    }
}
