package com.facebookpay.connect.models;

import X.AnonymousClass0ZU;
import X.C04220Ms;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public final class ConnectLearnMoreConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(6);
    public final String A00;
    public final String A01;
    public final AnonymousClass0ZU A02;

    public ConnectLearnMoreConfig(String str, String str2, AnonymousClass0ZU r4) {
        C04220Ms.A0B(str, 1);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = r4;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeSerializable((Serializable) this.A02);
    }
}
