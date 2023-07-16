package com.instagram.model.shopping.incentives.igfunded;

import X.AnonymousClass0Sf;
import X.C04220Ms;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape14S0000000_I2_14;

public final class SellerIncentiveBannerButton extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape14S0000000_I2_14(91);
    public final String A00;

    public SellerIncentiveBannerButton(String str) {
        C04220Ms.A0B(str, 1);
        this.A00 = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof SellerIncentiveBannerButton) && C04220Ms.A0I(this.A00, ((SellerIncentiveBannerButton) obj).A00));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
