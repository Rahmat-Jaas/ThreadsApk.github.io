package com.instagram.api.schemas;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18200wM;
import X.C21176Bq5;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape9S0000000_I2_9;
import java.util.Iterator;
import java.util.List;

public final class SellerBadgeDict extends AnonymousClass0Sf implements Parcelable, C21176Bq5 {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape9S0000000_I2_9(20);
    public final SellerBadgeType A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public final SellerBadgeDict D0X() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SellerBadgeDict) {
                SellerBadgeDict sellerBadgeDict = (SellerBadgeDict) obj;
                if (!C04220Ms.A0I(this.A01, sellerBadgeDict.A01) || !C04220Ms.A0I(this.A02, sellerBadgeDict.A02) || !C04220Ms.A0I(this.A03, sellerBadgeDict.A03) || this.A00 != sellerBadgeDict.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        List list = this.A03;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0v = C18200wM.A0v(parcel, list);
            while (A0v.hasNext()) {
                C86124wJ.A1F(parcel, A0v, i);
            }
        }
        parcel.writeParcelable(this.A00, i);
    }

    public final int hashCode() {
        return (((((AnonymousClass0wJ.A06(this.A01) * 31) + AnonymousClass0wJ.A06(this.A02)) * 31) + AnonymousClass0wJ.A03(this.A03)) * 31) + C18200wM.A07(this.A00);
    }

    public SellerBadgeDict(SellerBadgeType sellerBadgeType, String str, String str2, List list) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = list;
        this.A00 = sellerBadgeType;
    }
}
