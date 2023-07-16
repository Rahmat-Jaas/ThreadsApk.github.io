package com.fbpay.hub.paymentmethods.api;

import X.AnonymousClass3ZT;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public class FbPayBankAccount implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(1);
    public final String A00;

    public FbPayBankAccount(String str) {
        AnonymousClass3ZT.A02(str, "id");
        this.A00 = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof FbPayBankAccount) && AnonymousClass3ZT.A03(this.A00, ((FbPayBankAccount) obj).A00));
    }

    public final int hashCode() {
        return C86124wJ.A0E(this.A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }

    public FbPayBankAccount(Parcel parcel) {
        getClass().getClassLoader();
        this.A00 = parcel.readString();
    }
}
