package com.instagram.business.insights.model;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape10S0000000_I2_10;

public final class DataPoint extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape10S0000000_I2_10(0);
    public final int A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DataPoint) {
                DataPoint dataPoint = (DataPoint) obj;
                if (this.A00 != dataPoint.A00 || !C04220Ms.A0I(this.A01, dataPoint.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        return (this.A00 * 31) + AnonymousClass0wJ.A06(this.A01);
    }

    public DataPoint(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }
}
