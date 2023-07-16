package com.facebookpay.expresscheckout.models;

import X.AnonymousClass69W;
import X.C04220Ms;
import X.C86104wH;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

public final class DefaultCreditCardFields implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(15);
    @SerializedName("cardType")
    public final AnonymousClass69W A00;
    @SerializedName("last4Digits")
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        AnonymousClass69W r1 = this.A00;
        if (r1 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            C86104wH.A1B(parcel, r1);
        }
        parcel.writeString(this.A01);
    }

    public DefaultCreditCardFields(AnonymousClass69W r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public DefaultCreditCardFields() {
        this((AnonymousClass69W) null, (String) null);
    }
}
