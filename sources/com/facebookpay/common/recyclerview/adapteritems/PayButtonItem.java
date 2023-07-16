package com.facebookpay.common.recyclerview.adapteritems;

import X.AnonymousClass69U;
import X.C04220Ms;
import X.C86104wH;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;

public final class PayButtonItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(72);
    public final CurrencyAmount A00;
    public final AnonymousClass69U A01;
    public final String A02;
    public final boolean A03;

    public PayButtonItem(CurrencyAmount currencyAmount, AnonymousClass69U r3, String str, boolean z) {
        C04220Ms.A0B(r3, 1);
        this.A01 = r3;
        this.A00 = currencyAmount;
        this.A03 = z;
        this.A02 = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        C86104wH.A1B(parcel, this.A01);
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeString(this.A02);
    }

    public final AnonymousClass69U AqR() {
        return this.A01;
    }
}
