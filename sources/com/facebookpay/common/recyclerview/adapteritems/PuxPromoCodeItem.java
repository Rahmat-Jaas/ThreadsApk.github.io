package com.facebookpay.common.recyclerview.adapteritems;

import X.AnonymousClass69U;
import X.C04220Ms;
import X.C86104wH;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;

public final class PuxPromoCodeItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(82);
    public final String A00;
    public final boolean A01;
    public final AnonymousClass69U A02;

    public PuxPromoCodeItem(AnonymousClass69U r2, String str, boolean z) {
        C04220Ms.A0B(r2, 1);
        this.A02 = r2;
        this.A01 = z;
        this.A00 = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        C86104wH.A1B(parcel, this.A02);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeString(this.A00);
    }

    public final AnonymousClass69U AqR() {
        return this.A02;
    }
}
