package com.facebookpay.form.fragment.model;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public final class FormDisplayEvent implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(68);
    public final String A00;
    public final String A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
    }

    public FormDisplayEvent(String str, String str2, String str3) {
        AnonymousClass0wJ.A1O(str, str2);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }
}
