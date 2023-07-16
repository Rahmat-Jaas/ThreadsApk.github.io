package com.instagram.model.shopping;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18190wL;
import X.C18200wM;
import X.C86104wH;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape14S0000000_I2_14;

public final class ProductAutoTagMetadata extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape14S0000000_I2_14(50);
    public final PointF A00;
    public final Float A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductAutoTagMetadata) {
                ProductAutoTagMetadata productAutoTagMetadata = (ProductAutoTagMetadata) obj;
                if (!C04220Ms.A0I(this.A01, productAutoTagMetadata.A01) || !C04220Ms.A0I(this.A00, productAutoTagMetadata.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        Float f = this.A01;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        parcel.writeParcelable(this.A00, i);
    }

    public final int hashCode() {
        return (AnonymousClass0wJ.A03(this.A01) * 31) + C18200wM.A07(this.A00);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("ProductAutoTagMetadata(confidenceLevel=");
        A0s.append(this.A01);
        A0s.append(", originalCoordinates=");
        return C86104wH.A0y(this.A00, A0s);
    }

    public ProductAutoTagMetadata(PointF pointF, Float f) {
        this.A01 = f;
        this.A00 = pointF;
    }
}
