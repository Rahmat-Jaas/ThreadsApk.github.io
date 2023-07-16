package com.facebook.location.logging;

import X.C18190wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape1S0000000_I2_1;

public class MaxImpressionsPerInterval implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape1S0000000_I2_1(89);
    public final int A00;
    public final long A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MaxImpressionsPerInterval) {
                MaxImpressionsPerInterval maxImpressionsPerInterval = (MaxImpressionsPerInterval) obj;
                if (!(this.A01 == maxImpressionsPerInterval.A01 && this.A00 == maxImpressionsPerInterval.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((C18190wL.A02(this.A01) + 31) * 31) + this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeInt(this.A00);
    }

    public MaxImpressionsPerInterval(Parcel parcel) {
        getClass().getClassLoader();
        this.A01 = parcel.readLong();
        this.A00 = parcel.readInt();
    }
}
