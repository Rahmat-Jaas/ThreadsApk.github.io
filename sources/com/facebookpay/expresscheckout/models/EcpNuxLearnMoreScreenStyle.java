package com.facebookpay.expresscheckout.models;

import X.C04220Ms;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public final class EcpNuxLearnMoreScreenStyle implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(25);
    public final CharSequence A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        TextUtils.writeToParcel(this.A00, parcel, i);
    }

    public EcpNuxLearnMoreScreenStyle(CharSequence charSequence) {
        this.A00 = charSequence;
    }

    public EcpNuxLearnMoreScreenStyle() {
        this((CharSequence) null);
    }
}
