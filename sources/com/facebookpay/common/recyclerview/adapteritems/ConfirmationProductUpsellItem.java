package com.facebookpay.common.recyclerview.adapteritems;

import X.AnonymousClass0wJ;
import X.AnonymousClass69U;
import X.C04220Ms;
import X.C18190wL;
import X.C86104wH;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;

public final class ConfirmationProductUpsellItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(67);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final AnonymousClass69U A04;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        C86104wH.A1B(parcel, this.A04);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
    }

    public final AnonymousClass69U AqR() {
        return this.A04;
    }

    public ConfirmationProductUpsellItem(AnonymousClass69U r2, String str, String str2, String str3, String str4) {
        AnonymousClass0wJ.A1O(r2, str);
        C18190wL.A1S(str2, 3, str4);
        this.A04 = r2;
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A00 = str4;
    }
}
