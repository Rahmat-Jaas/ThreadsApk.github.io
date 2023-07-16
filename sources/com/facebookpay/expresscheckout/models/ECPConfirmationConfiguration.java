package com.facebookpay.expresscheckout.models;

import X.C04220Ms;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.confirmation.model.ECPConfirmationUpsellSection;

public final class ECPConfirmationConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(19);
    public final ECPConfirmationUpsellSection A00;
    public final String A01;

    public ECPConfirmationConfiguration(ECPConfirmationUpsellSection eCPConfirmationUpsellSection, String str) {
        C04220Ms.A0B(str, 2);
        this.A00 = eCPConfirmationUpsellSection;
        this.A01 = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
    }

    public ECPConfirmationConfiguration() {
        this((ECPConfirmationUpsellSection) null, "CLOSE");
    }
}
