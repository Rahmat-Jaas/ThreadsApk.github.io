package com.facebookpay.expresscheckout.models;

import X.C04220Ms;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

public final class ECPAvailabilityResponseParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(18);
    @SerializedName("defaultPaymentMethodFields")
    public final DefaultPaymentMethodFields A00;
    @SerializedName("isCacheAvailable")
    public final boolean A01;
    @SerializedName("isNUX")
    public final boolean A02;
    @SerializedName("apiVersion")
    public final int A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        DefaultPaymentMethodFields defaultPaymentMethodFields = this.A00;
        if (defaultPaymentMethodFields == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        defaultPaymentMethodFields.writeToParcel(parcel, i);
    }

    public ECPAvailabilityResponseParams(DefaultPaymentMethodFields defaultPaymentMethodFields, int i, boolean z, boolean z2) {
        this.A03 = i;
        this.A01 = z;
        this.A02 = z2;
        this.A00 = defaultPaymentMethodFields;
    }
}
