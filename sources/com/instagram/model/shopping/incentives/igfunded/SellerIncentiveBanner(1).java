package com.instagram.model.shopping.incentives.igfunded;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C18200wM;
import X.C86104wH;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape14S0000000_I2_14;
import java.util.Iterator;
import java.util.List;

public final class SellerIncentiveBanner extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape14S0000000_I2_14(89);
    public final long A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final List A05;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SellerIncentiveBanner) {
                SellerIncentiveBanner sellerIncentiveBanner = (SellerIncentiveBanner) obj;
                if (!C04220Ms.A0I(this.A03, sellerIncentiveBanner.A03) || !C04220Ms.A0I(this.A05, sellerIncentiveBanner.A05) || !C04220Ms.A0I(this.A01, sellerIncentiveBanner.A01) || this.A00 != sellerIncentiveBanner.A00 || !C04220Ms.A0I(this.A02, sellerIncentiveBanner.A02) || !C04220Ms.A0I(this.A04, sellerIncentiveBanner.A04)) {
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
        List list = this.A05;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0v = C18200wM.A0v(parcel, list);
            while (A0v.hasNext()) {
                ((SellerIncentiveBannerBottomSheetContent) A0v.next()).writeToParcel(parcel, i);
            }
        }
        C18180wK.A0y(parcel, this.A01, 0, 1);
        parcel.writeLong(this.A00);
        C18180wK.A0y(parcel, this.A02, 0, 1);
        parcel.writeString(this.A04);
    }

    public final int hashCode() {
        return ((C86104wH.A06(((((AnonymousClass0wJ.A06(this.A03) * 31) + AnonymousClass0wJ.A03(this.A05)) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31, this.A00) + AnonymousClass0wJ.A03(this.A02)) * 31) + C18200wM.A09(this.A04);
    }

    public SellerIncentiveBanner(Integer num, Integer num2, String str, String str2, List list, long j) {
        this.A03 = str;
        this.A05 = list;
        this.A01 = num;
        this.A00 = j;
        this.A02 = num2;
        this.A04 = str2;
    }
}
