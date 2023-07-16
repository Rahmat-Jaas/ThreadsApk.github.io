package com.facebook.browser.lite.extensions.igcallextension;

import X.C04220Ms;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public final class IGCallExtensionModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(99);
    public final String A00;
    public final String A01;

    public IGCallExtensionModel(String str, String str2) {
        C04220Ms.A0B(str2, 2);
        this.A01 = str;
        this.A00 = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public IGCallExtensionModel(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
    }
}
