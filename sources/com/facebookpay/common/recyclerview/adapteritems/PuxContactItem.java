package com.facebookpay.common.recyclerview.adapteritems;

import X.AnonymousClass69U;
import X.C04220Ms;
import X.C143528gt;
import X.C18230wP;
import X.C86104wH;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;

public final class PuxContactItem implements BaseCheckoutItem, C143528gt {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(75);
    public final AnonymousClass69U A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public PuxContactItem(AnonymousClass69U r2, Integer num, String str, String str2, String str3, String str4, String str5, boolean z) {
        C04220Ms.A0B(r2, 1);
        this.A00 = r2;
        this.A01 = num;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A07 = z;
        this.A02 = str5;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        C86104wH.A1B(parcel, this.A00);
        parcel.writeInt(C18230wP.A02(parcel, this.A01));
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeString(this.A02);
    }

    public final Integer AjU() {
        return this.A01;
    }

    public final AnonymousClass69U AqR() {
        return this.A00;
    }

    public PuxContactItem() {
        this(AnonymousClass69U.A0V, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, false);
    }
}
