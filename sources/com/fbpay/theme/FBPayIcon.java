package com.fbpay.theme;

import X.C04220Ms;
import X.C86104wH;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public enum FBPayIcon implements Parcelable {
    CAMERA_SECONDARY(8, 14),
    LOADING_SPINNER(42, 33);
    
    public static final Parcelable.Creator CREATOR = null;
    public final int A00;
    public final int A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        C86104wH.A1B(parcel, this);
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = C86124wJ.A0Y(15);
    }

    /* access modifiers changed from: public */
    FBPayIcon(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
