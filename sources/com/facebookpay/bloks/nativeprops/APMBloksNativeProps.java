package com.facebookpay.bloks.nativeprops;

import X.AnonymousClass0YY;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18230wP;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;

public final class APMBloksNativeProps implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(59);
    public AnonymousClass0YY A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A05);
        parcel.writeString(this.A01);
        parcel.writeString(this.A04);
    }

    public APMBloksNativeProps(String str, String str2, String str3, String str4, String str5, String str6) {
        AnonymousClass0wJ.A1O(str, str2);
        AnonymousClass0wJ.A1R(str3, str4);
        C18230wP.A1R(str5, 5, str6);
        this.A06 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A05 = str4;
        this.A01 = str5;
        this.A04 = str6;
    }
}
