package com.facebookpay.common.recyclerview.adapteritems;

import X.AnonymousClass69U;
import X.C04220Ms;
import X.C18230wP;
import X.C86104wH;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.paymentmethod.model.PaymentMethod;

public final class PuxPaymentMethodItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(80);
    public final AnonymousClass69U A00;
    public final PaymentMethod A01;
    public final Integer A02;
    public final boolean A03;
    public final boolean A04;

    public PuxPaymentMethodItem(AnonymousClass69U r2, PaymentMethod paymentMethod, Integer num, boolean z, boolean z2) {
        C04220Ms.A0B(r2, 1);
        this.A00 = r2;
        this.A01 = paymentMethod;
        this.A03 = z;
        this.A02 = num;
        this.A04 = z2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        C86104wH.A1B(parcel, this.A00);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(C18230wP.A02(parcel, this.A02));
        parcel.writeInt(this.A04 ? 1 : 0);
    }

    public final AnonymousClass69U AqR() {
        return this.A00;
    }

    public PuxPaymentMethodItem() {
        this(AnonymousClass69U.A0a, (PaymentMethod) null, (Integer) null, false, true);
    }
}
