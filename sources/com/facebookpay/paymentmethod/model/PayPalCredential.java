package com.facebookpay.paymentmethod.model;

import X.C04220Ms;
import X.C40307LcE;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.impls.PaypalBAImpl;

public final class PayPalCredential implements PaymentMethod {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(88);
    public final PaypalBAImpl A00;
    public final String A01;
    public final boolean A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeValue(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeString(this.A01);
    }

    public final String Aal() {
        String stringValue;
        PaypalBAImpl paypalBAImpl = this.A00;
        if (paypalBAImpl != null && (stringValue = paypalBAImpl.getStringValue("credential_id")) != null) {
            return stringValue;
        }
        String str = this.A01;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final C40307LcE Aam() {
        return C40307LcE.A06;
    }

    public final String AnP() {
        String stringValue;
        PaypalBAImpl paypalBAImpl = this.A00;
        if (paypalBAImpl == null || (stringValue = paypalBAImpl.getStringValue("icon_url")) == null) {
            return "";
        }
        return stringValue;
    }

    public final String BEm() {
        String stringValue;
        PaypalBAImpl paypalBAImpl = this.A00;
        if (paypalBAImpl == null || (stringValue = paypalBAImpl.getStringValue("pp_subtitle")) == null) {
            return "";
        }
        return stringValue;
    }

    public final String BH2() {
        String stringValue;
        PaypalBAImpl paypalBAImpl = this.A00;
        if (paypalBAImpl == null || (stringValue = paypalBAImpl.getStringValue("pp_title")) == null) {
            return "";
        }
        return stringValue;
    }

    public PayPalCredential(PaypalBAImpl paypalBAImpl, String str, boolean z) {
        this.A00 = paypalBAImpl;
        this.A02 = z;
        this.A01 = str;
    }

    public PayPalCredential() {
        this((PaypalBAImpl) null, (String) null, false);
    }
}
