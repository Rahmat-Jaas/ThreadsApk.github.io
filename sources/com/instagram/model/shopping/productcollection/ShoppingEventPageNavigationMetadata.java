package com.instagram.model.shopping.productcollection;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C18200wM;
import X.C18240wQ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape15S0000000_I2_15;

public final class ShoppingEventPageNavigationMetadata extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape15S0000000_I2_15(0);
    public final Integer A00;
    public final Integer A01;
    public final Long A02;
    public final String A03;
    public final boolean A04;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingEventPageNavigationMetadata) {
                ShoppingEventPageNavigationMetadata shoppingEventPageNavigationMetadata = (ShoppingEventPageNavigationMetadata) obj;
                if (!C04220Ms.A0I(this.A03, shoppingEventPageNavigationMetadata.A03) || this.A04 != shoppingEventPageNavigationMetadata.A04 || !C04220Ms.A0I(this.A02, shoppingEventPageNavigationMetadata.A02) || !C04220Ms.A0I(this.A00, shoppingEventPageNavigationMetadata.A00) || !C04220Ms.A0I(this.A01, shoppingEventPageNavigationMetadata.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A04 ? 1 : 0);
        Long l = this.A02;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            C18240wQ.A0v(parcel, l);
        }
        C18180wK.A0y(parcel, this.A00, 0, 1);
        C18180wK.A0y(parcel, this.A01, 0, 1);
    }

    public final int hashCode() {
        int A06 = AnonymousClass0wJ.A06(this.A03) * 31;
        boolean z = this.A04;
        if (z) {
            z = true;
        }
        return ((((((A06 + (z ? 1 : 0)) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + C18200wM.A07(this.A01);
    }

    public ShoppingEventPageNavigationMetadata(Integer num, Integer num2, Long l, String str, boolean z) {
        this.A03 = str;
        this.A04 = z;
        this.A02 = l;
        this.A00 = num;
        this.A01 = num2;
    }
}
