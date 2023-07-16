package com.instagram.api.schemas;

import X.AnonymousClass0Sf;
import X.C04220Ms;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape7S0000000_I2_7;

public final class CollectionTitleCustomization extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape7S0000000_I2_7(47);
    public final int A00;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof CollectionTitleCustomization) && this.A00 == ((CollectionTitleCustomization) obj).A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeInt(this.A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public CollectionTitleCustomization(int i) {
        this.A00 = i;
    }
}
