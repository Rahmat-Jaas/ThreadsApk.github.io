package com.instagram.model.shopping.reels;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C144848jN;
import X.C18180wK;
import X.C18210wN;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape15S0000000_I2_15;

public final class ShoppingIncentiveMetadata extends AnonymousClass0Sf implements Parcelable, C144848jN {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape15S0000000_I2_15(37);
    public final String A00;
    public final String A01;

    public final ShoppingIncentiveMetadata D6H() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingIncentiveMetadata) {
                ShoppingIncentiveMetadata shoppingIncentiveMetadata = (ShoppingIncentiveMetadata) obj;
                if (!C04220Ms.A0I(this.A00, shoppingIncentiveMetadata.A00) || !C04220Ms.A0I(this.A01, shoppingIncentiveMetadata.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        return C18210wN.A05(this.A01, C18180wK.A03(this.A00));
    }

    public ShoppingIncentiveMetadata(String str, String str2) {
        AnonymousClass0wJ.A1O(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }
}
