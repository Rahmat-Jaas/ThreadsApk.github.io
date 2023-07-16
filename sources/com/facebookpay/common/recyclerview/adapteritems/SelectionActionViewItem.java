package com.facebookpay.common.recyclerview.adapteritems;

import X.AnonymousClass69U;
import X.C04220Ms;
import X.C143528gt;
import X.C18180wK;
import X.C86104wH;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;

public final class SelectionActionViewItem implements BaseCheckoutItem, C143528gt {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(86);
    public Integer A00;
    public String A01;
    public final Integer A02;
    public final AnonymousClass69U A03;
    public final String A04;

    public SelectionActionViewItem(AnonymousClass69U r2, Integer num, Integer num2, String str, String str2) {
        C04220Ms.A0B(r2, 1);
        this.A03 = r2;
        this.A02 = num;
        this.A04 = str;
        this.A01 = str2;
        this.A00 = num2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        C86104wH.A1B(parcel, this.A03);
        C18180wK.A0y(parcel, this.A02, 0, 1);
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        C18180wK.A0y(parcel, this.A00, 0, 1);
    }

    public final Integer AjU() {
        return this.A02;
    }

    public final AnonymousClass69U AqR() {
        return this.A03;
    }

    public SelectionActionViewItem() {
        this(AnonymousClass69U.A0g, (Integer) null, (Integer) null, (String) null, (String) null);
    }
}
