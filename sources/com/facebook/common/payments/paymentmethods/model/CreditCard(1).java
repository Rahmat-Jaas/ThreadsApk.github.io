package com.facebook.common.payments.paymentmethods.model;

import X.C18180wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape1S0000000_I2_1;

public class CreditCard implements PaymentCredential {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape1S0000000_I2_1(58);
    public final AdditionalFields A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A06);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A00, i);
    }

    public CreditCard(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A06 = parcel.readString();
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A00 = (AdditionalFields) C18180wK.A0A(parcel, AdditionalFields.class);
    }
}
