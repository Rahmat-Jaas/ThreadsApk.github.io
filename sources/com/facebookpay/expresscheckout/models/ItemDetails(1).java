package com.facebookpay.expresscheckout.models;

import X.AnonymousClass006;
import X.C04220Ms;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public final class ItemDetails implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(30);
    public String A00;
    public final Integer A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C04220Ms.A0B(parcel, 0);
        if (this.A01.intValue() != 0) {
            str = "RESELLER";
        } else {
            str = "DEFAULT";
        }
        parcel.writeString(str);
        parcel.writeString(this.A00);
    }

    public ItemDetails(Integer num, String str) {
        this.A01 = num;
        this.A00 = str;
    }

    public ItemDetails() {
        this(AnonymousClass006.A00, (String) null);
    }
}
