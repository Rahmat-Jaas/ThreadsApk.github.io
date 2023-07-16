package com.facebookpay.common.recyclerview.adapteritems;

import X.AnonymousClass0wJ;
import X.AnonymousClass69U;
import X.C04220Ms;
import X.C116826xc;
import X.C86104wH;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;

public final class SelectionNameViewItem implements BaseSelectionCheckoutItem {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(92);
    public Integer A00;
    public String A01;
    public String A02;
    public final AnonymousClass69U A03;
    public final String A04;

    public final void Cpe(Integer num) {
        C04220Ms.A0B(num, 0);
        this.A00 = num;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        C86104wH.A1B(parcel, this.A03);
        parcel.writeString(C116826xc.A01(this.A00));
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public final AnonymousClass69U AqR() {
        return this.A03;
    }

    public final Integer BA9() {
        return this.A00;
    }

    public final String getId() {
        return this.A04;
    }

    public SelectionNameViewItem(AnonymousClass69U r1, Integer num, String str, String str2, String str3) {
        AnonymousClass0wJ.A1O(r1, num);
        AnonymousClass0wJ.A1R(str, str2);
        this.A03 = r1;
        this.A00 = num;
        this.A04 = str;
        this.A01 = str2;
        this.A02 = str3;
    }
}
