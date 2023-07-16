package com.facebookpay.paymentmethod.model;

import X.C04220Ms;
import X.C18180wK;
import X.C40307LcE;
import X.C86104wH;
import X.C86124wJ;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.impls.AlternativePaymentMethodImpl;

public final class APMCredential implements PaymentMethod {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(86);
    public final AlternativePaymentMethodImpl A00;
    public final C40307LcE A01;
    public final boolean A02;

    public APMCredential(AlternativePaymentMethodImpl alternativePaymentMethodImpl, C40307LcE lcE, boolean z) {
        C18180wK.A1P(alternativePaymentMethodImpl, 1, lcE);
        this.A00 = alternativePaymentMethodImpl;
        this.A02 = z;
        this.A01 = lcE;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeValue(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
        C86104wH.A1B(parcel, this.A01);
    }

    public final String Aal() {
        return C86144wL.A0s(this.A00, "credential_id");
    }

    public final C40307LcE Aam() {
        return this.A01;
    }

    public final String AnP() {
        return C86144wL.A0s(this.A00, "icon_url");
    }

    public final String BEm() {
        return C86144wL.A0s(this.A00, "email_address");
    }

    public final String BH2() {
        return C86144wL.A0s(this.A00, "credential_display_name");
    }
}
