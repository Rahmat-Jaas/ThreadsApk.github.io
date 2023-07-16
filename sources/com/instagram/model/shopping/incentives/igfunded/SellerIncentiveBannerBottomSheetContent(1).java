package com.instagram.model.shopping.incentives.igfunded;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18200wM;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape14S0000000_I2_14;

public final class SellerIncentiveBannerBottomSheetContent extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape14S0000000_I2_14(90);
    public final String A00;
    public final String A01;
    public final String A02;

    public SellerIncentiveBannerBottomSheetContent(String str, String str2, String str3) {
        C04220Ms.A0B(str2, 2);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SellerIncentiveBannerBottomSheetContent) {
                SellerIncentiveBannerBottomSheetContent sellerIncentiveBannerBottomSheetContent = (SellerIncentiveBannerBottomSheetContent) obj;
                if (!C04220Ms.A0I(this.A00, sellerIncentiveBannerBottomSheetContent.A00) || !C04220Ms.A0I(this.A01, sellerIncentiveBannerBottomSheetContent.A01) || !C04220Ms.A0I(this.A02, sellerIncentiveBannerBottomSheetContent.A02)) {
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
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A07(this.A01, AnonymousClass0wJ.A06(this.A00) * 31) + C18200wM.A09(this.A02);
    }
}
