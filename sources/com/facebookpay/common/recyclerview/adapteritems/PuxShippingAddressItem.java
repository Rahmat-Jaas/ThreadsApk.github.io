package com.facebookpay.common.recyclerview.adapteritems;

import X.AnonymousClass69U;
import X.C04220Ms;
import X.C86104wH;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.shippingaddress.model.ShippingAddress;

public final class PuxShippingAddressItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(84);
    public final AnonymousClass69U A00;
    public final ShippingAddress A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public PuxShippingAddressItem(AnonymousClass69U r2, ShippingAddress shippingAddress, String str, String str2, String str3, boolean z) {
        C04220Ms.A0B(r2, 1);
        this.A00 = r2;
        this.A03 = str;
        this.A02 = str2;
        this.A04 = str3;
        this.A01 = shippingAddress;
        this.A05 = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        C86104wH.A1B(parcel, this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A05 ? 1 : 0);
    }

    public final AnonymousClass69U AqR() {
        return this.A00;
    }

    public PuxShippingAddressItem() {
        this(AnonymousClass69U.A0e, (ShippingAddress) null, (String) null, (String) null, (String) null, false);
    }
}
