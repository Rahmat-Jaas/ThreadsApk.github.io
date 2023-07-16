package com.instagram.model.shopping;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18210wN;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape14S0000000_I2_14;

public final class ProductMention extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape14S0000000_I2_14(59);
    public final int A00;
    public final int A01;
    public final ProductDetailsProductItemDict A02;
    public final String A03;
    public final String A04;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductMention) {
                ProductMention productMention = (ProductMention) obj;
                if (!C04220Ms.A0I(this.A02, productMention.A02) || !C04220Ms.A0I(this.A03, productMention.A03) || this.A00 != productMention.A00 || this.A01 != productMention.A01 || !C04220Ms.A0I(this.A04, productMention.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        this.A02.writeToParcel(parcel, i);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A04);
    }

    public final int hashCode() {
        int A042 = C18210wN.A04(this.A02);
        return C18210wN.A05(this.A04, (((AnonymousClass0wJ.A07(this.A03, A042) + this.A00) * 31) + this.A01) * 31);
    }

    public ProductMention(ProductDetailsProductItemDict productDetailsProductItemDict, String str, String str2, int i, int i2) {
        AnonymousClass0wJ.A1O(productDetailsProductItemDict, str);
        C04220Ms.A0B(str2, 5);
        this.A02 = productDetailsProductItemDict;
        this.A03 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = str2;
    }
}
