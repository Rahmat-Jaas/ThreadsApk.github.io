package com.facebookpay.expresscheckout.models;

import X.AnonymousClass7BF;
import X.C04220Ms;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

public final class CheckoutResponse implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(13);
    @SerializedName("checkoutStatus")
    public final String A00;
    @SerializedName("paymentResponseParams")
    public final ECPPaymentResponseParams A01;
    @SerializedName("checkoutErrorReason")
    public final Integer A02;
    @SerializedName("checkoutErrorMessage")
    public final String A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A00);
        Integer num = this.A02;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(AnonymousClass7BF.A01(num));
        }
        parcel.writeString(this.A03);
        ECPPaymentResponseParams eCPPaymentResponseParams = this.A01;
        if (eCPPaymentResponseParams == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        eCPPaymentResponseParams.writeToParcel(parcel, i);
    }

    public CheckoutResponse(ECPPaymentResponseParams eCPPaymentResponseParams, Integer num, String str, String str2) {
        this.A00 = str;
        this.A02 = num;
        this.A03 = str2;
        this.A01 = eCPPaymentResponseParams;
    }

    public CheckoutResponse() {
        this((ECPPaymentResponseParams) null, (Integer) null, (String) null, (String) null);
    }
}
