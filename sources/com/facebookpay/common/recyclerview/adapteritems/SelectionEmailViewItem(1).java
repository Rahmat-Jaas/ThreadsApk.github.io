package com.facebookpay.common.recyclerview.adapteritems;

import X.AnonymousClass0wJ;
import X.AnonymousClass69U;
import X.C04220Ms;
import X.C116826xc;
import X.C86104wH;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;

public final class SelectionEmailViewItem implements BaseSelectionCheckoutItem {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(87);
    public Integer A00;
    public String A01;
    public String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final AnonymousClass69U A07;

    public final void Cpe(Integer num) {
        C04220Ms.A0B(num, 0);
        this.A00 = num;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        C86104wH.A1B(parcel, this.A07);
        parcel.writeString(C116826xc.A01(this.A00));
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeString(this.A03);
    }

    public final AnonymousClass69U AqR() {
        return this.A07;
    }

    public final Integer BA9() {
        return this.A00;
    }

    public final String getId() {
        return this.A04;
    }

    public SelectionEmailViewItem(AnonymousClass69U r1, Integer num, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        AnonymousClass0wJ.A1O(r1, num);
        AnonymousClass0wJ.A1R(str, str2);
        this.A07 = r1;
        this.A00 = num;
        this.A04 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A06 = z;
        this.A05 = z2;
        this.A03 = str4;
    }
}
