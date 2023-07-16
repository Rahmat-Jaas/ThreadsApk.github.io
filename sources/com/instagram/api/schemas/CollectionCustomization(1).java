package com.instagram.api.schemas;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18200wM;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape7S0000000_I2_7;

public final class CollectionCustomization extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape7S0000000_I2_7(46);
    public final CollectionButtonCustomization A00;
    public final CollectionTitleCustomization A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CollectionCustomization) {
                CollectionCustomization collectionCustomization = (CollectionCustomization) obj;
                if (!C04220Ms.A0I(this.A00, collectionCustomization.A00) || !C04220Ms.A0I(this.A01, collectionCustomization.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }

    public final int hashCode() {
        return (AnonymousClass0wJ.A03(this.A00) * 31) + C18200wM.A07(this.A01);
    }

    public CollectionCustomization(CollectionButtonCustomization collectionButtonCustomization, CollectionTitleCustomization collectionTitleCustomization) {
        this.A00 = collectionButtonCustomization;
        this.A01 = collectionTitleCustomization;
    }
}
