package com.facebookpay.common.recyclerview.adapteritems;

import X.AnonymousClass69U;
import X.C04220Ms;
import X.C86104wH;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;

public final class PuxReceiverHeaderItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(83);
    public final String A00;
    public final AnonymousClass69U A01;
    public final String A02;

    public PuxReceiverHeaderItem(AnonymousClass69U r2, String str, String str2) {
        C04220Ms.A0B(r2, 1);
        this.A01 = r2;
        this.A00 = str;
        this.A02 = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        C86104wH.A1B(parcel, this.A01);
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
    }

    public final AnonymousClass69U AqR() {
        return this.A01;
    }
}
