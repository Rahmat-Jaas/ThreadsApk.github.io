package com.instagram.discoverpeople.model;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape12S0000000_I2_12;

public final class FindPeopleButtonOverride implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape12S0000000_I2_12(17);
    public final String A00;
    public final String A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public FindPeopleButtonOverride(String str, String str2, String str3) {
        AnonymousClass0wJ.A1O(str, str2);
        C04220Ms.A0B(str3, 3);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
    }
}
