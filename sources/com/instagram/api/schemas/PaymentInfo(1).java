package com.instagram.api.schemas;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C18200wM;
import X.C86164wN;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape8S0000000_I2_8;

public final class PaymentInfo extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape8S0000000_I2_8(78);
    public final PaymentMethod A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final boolean A04;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PaymentInfo) {
                PaymentInfo paymentInfo = (PaymentInfo) obj;
                if (!C04220Ms.A0I(this.A01, paymentInfo.A01) || !C04220Ms.A0I(this.A02, paymentInfo.A02) || !C04220Ms.A0I(this.A03, paymentInfo.A03) || this.A04 != paymentInfo.A04 || !C04220Ms.A0I(this.A00, paymentInfo.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        C18180wK.A0y(parcel, this.A01, 0, 1);
        C18180wK.A0y(parcel, this.A02, 0, 1);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeParcelable(this.A00, i);
    }

    public final int hashCode() {
        return (((((((AnonymousClass0wJ.A03(this.A01) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31) + AnonymousClass0wJ.A06(this.A03)) * 31) + (C86164wN.A1S(this.A04) ? 1 : 0)) * 31) + C18200wM.A07(this.A00);
    }

    public PaymentInfo(PaymentMethod paymentMethod, Integer num, Integer num2, String str, boolean z) {
        this.A01 = num;
        this.A02 = num2;
        this.A03 = str;
        this.A04 = z;
        this.A00 = paymentMethod;
    }
}
