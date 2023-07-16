package com.instagram.business.promote.model;

import X.C18190wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape10S0000000_I2_10;

public enum HpiSessionStatus implements Parcelable {
    ASSIGNMENT_SCHEDULED,
    FINISHED,
    IN_PROGRESS,
    PENDING;
    
    public static final Parcelable.Creator CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = new PCreatorCreatorShape10S0000000_I2_10(21);
    }

    public final String toString() {
        return name();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18190wL.A15(parcel, this);
    }
}
