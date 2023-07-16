package com.instagram.api.schemas;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape7S0000000_I2_7;

public final class CollectionButtonCustomization extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape7S0000000_I2_7(45);
    public final MiniShopColorCustomization A00;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof CollectionButtonCustomization) && C04220Ms.A0I(this.A00, ((CollectionButtonCustomization) obj).A00));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A03(this.A00);
    }

    public CollectionButtonCustomization(MiniShopColorCustomization miniShopColorCustomization) {
        this.A00 = miniShopColorCustomization;
    }
}
