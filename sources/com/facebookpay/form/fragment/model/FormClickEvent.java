package com.facebookpay.form.fragment.model;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public final class FormClickEvent implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(67);
    public final String A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public FormClickEvent(String str, String str2) {
        AnonymousClass0wJ.A1O(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }
}
