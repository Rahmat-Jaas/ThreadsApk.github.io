package com.instagram.api.schemas;

import X.AnonymousClass0Sf;
import X.C04220Ms;
import X.C18210wN;
import X.C86164wN;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape9S0000000_I2_9;

public final class ShoppingBrandWithProductsSubtitle extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape9S0000000_I2_9(26);
    public final String A00;
    public final boolean A01;

    public ShoppingBrandWithProductsSubtitle(boolean z, String str) {
        C04220Ms.A0B(str, 2);
        this.A01 = z;
        this.A00 = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingBrandWithProductsSubtitle) {
                ShoppingBrandWithProductsSubtitle shoppingBrandWithProductsSubtitle = (ShoppingBrandWithProductsSubtitle) obj;
                if (this.A01 != shoppingBrandWithProductsSubtitle.A01 || !C04220Ms.A0I(this.A00, shoppingBrandWithProductsSubtitle.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeString(this.A00);
    }

    public final int hashCode() {
        return C18210wN.A05(this.A00, (C86164wN.A1S(this.A01) ? 1 : 0) * true);
    }
}
