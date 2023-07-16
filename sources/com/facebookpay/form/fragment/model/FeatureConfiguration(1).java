package com.facebookpay.form.fragment.model;

import X.C04220Ms;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public final class FeatureConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(66);
    public final boolean A00;
    public final boolean A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public FeatureConfiguration(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }

    public FeatureConfiguration() {
        this(false, false);
    }
}
