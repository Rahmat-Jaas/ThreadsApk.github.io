package com.instagram.pendingmedia.model;

import X.C04220Ms;
import X.C18190wL;
import X.C86124wJ;
import android.os.Parcel;
import com.facebook.redex.PCreatorCreatorShape15S0000000_I2_15;

public final class SimpleUserStoryTarget implements UserStoryTarget {
    public static final PCreatorCreatorShape15S0000000_I2_15 CREATOR = new PCreatorCreatorShape15S0000000_I2_15(98);
    public String A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A00);
    }

    public final String BIu() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C18190wL.A1Y(this, obj)) {
            return false;
        }
        return C04220Ms.A0I(this.A00, ((SimpleUserStoryTarget) obj).A00);
    }

    public final int hashCode() {
        return C86124wJ.A0F(this.A00);
    }

    public SimpleUserStoryTarget(String str) {
        this.A00 = str;
    }

    public SimpleUserStoryTarget() {
        this((String) null);
    }
}
