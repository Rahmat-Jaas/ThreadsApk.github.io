package com.instagram.api.schemas;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18200wM;
import X.C2L;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape8S0000000_I2_8;

public final class ProductDiscountInformationDictImpl extends AnonymousClass0Sf implements Parcelable, C2L {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape8S0000000_I2_8(88);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public ProductDiscountInformationDictImpl(String str, String str2, String str3, String str4, String str5) {
        C04220Ms.A0B(str3, 3);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
    }

    public final ProductDiscountInformationDictImpl D02() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductDiscountInformationDictImpl) {
                ProductDiscountInformationDictImpl productDiscountInformationDictImpl = (ProductDiscountInformationDictImpl) obj;
                if (!C04220Ms.A0I(this.A00, productDiscountInformationDictImpl.A00) || !C04220Ms.A0I(this.A01, productDiscountInformationDictImpl.A01) || !C04220Ms.A0I(this.A02, productDiscountInformationDictImpl.A02) || !C04220Ms.A0I(this.A03, productDiscountInformationDictImpl.A03) || !C04220Ms.A0I(this.A04, productDiscountInformationDictImpl.A04)) {
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
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
    }

    public final String Ab1() {
        return this.A00;
    }

    public final String B9V() {
        return this.A04;
    }

    public final String getDescription() {
        return this.A01;
    }

    public final String getId() {
        return this.A02;
    }

    public final String getName() {
        return this.A03;
    }

    public final int hashCode() {
        return ((AnonymousClass0wJ.A07(this.A02, ((AnonymousClass0wJ.A06(this.A00) * 31) + AnonymousClass0wJ.A06(this.A01)) * 31) + AnonymousClass0wJ.A06(this.A03)) * 31) + C18200wM.A09(this.A04);
    }
}
