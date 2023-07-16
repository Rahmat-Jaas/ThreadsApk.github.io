package com.facebookpay.common.recyclerview.adapteritems;

import X.AnonymousClass69U;
import X.C04220Ms;
import X.C86104wH;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;

public final class SelectionOfferViewItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(93);
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public boolean A05;
    public final AnonymousClass69U A06;

    public SelectionOfferViewItem(AnonymousClass69U r2, String str, String str2, String str3, String str4, String str5, boolean z) {
        C04220Ms.A0B(r2, 1);
        this.A06 = r2;
        this.A03 = str;
        this.A01 = str2;
        this.A04 = str3;
        this.A00 = str4;
        this.A02 = str5;
        this.A05 = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        C86104wH.A1B(parcel, this.A06);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeString(this.A04);
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A05 ? 1 : 0);
    }

    public final AnonymousClass69U AqR() {
        return this.A06;
    }

    public SelectionOfferViewItem() {
        this(AnonymousClass69U.A0k, (String) null, (String) null, (String) null, (String) null, (String) null, false);
    }
}
