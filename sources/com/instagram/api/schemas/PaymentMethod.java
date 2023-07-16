package com.instagram.api.schemas;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18210wN;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape8S0000000_I2_8;

public final class PaymentMethod extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape8S0000000_I2_8(79);
    public final CreditCardAssociation A00;
    public final FundingSourceType A01;
    public final String A02;
    public final String A03;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PaymentMethod) {
                PaymentMethod paymentMethod = (PaymentMethod) obj;
                if (this.A00 != paymentMethod.A00 || this.A01 != paymentMethod.A01 || !C04220Ms.A0I(this.A02, paymentMethod.A02) || !C04220Ms.A0I(this.A03, paymentMethod.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }

    public final int hashCode() {
        int A04 = C18210wN.A04(this.A00);
        return C18210wN.A05(this.A03, (AnonymousClass0wJ.A05(this.A01, A04) + AnonymousClass0wJ.A06(this.A02)) * 31);
    }

    public PaymentMethod(CreditCardAssociation creditCardAssociation, FundingSourceType fundingSourceType, String str, String str2) {
        AnonymousClass0wJ.A1O(creditCardAssociation, fundingSourceType);
        C04220Ms.A0B(str2, 4);
        this.A00 = creditCardAssociation;
        this.A01 = fundingSourceType;
        this.A02 = str;
        this.A03 = str2;
    }
}
