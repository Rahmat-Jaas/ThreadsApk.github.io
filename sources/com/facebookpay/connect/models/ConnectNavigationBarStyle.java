package com.facebookpay.connect.models;

import X.AnonymousClass697;
import X.C04220Ms;
import X.C86104wH;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public enum ConnectNavigationBarStyle implements Parcelable {
    ;
    
    public static final Parcelable.Creator CREATOR = null;
    public final int A00;
    public final AnonymousClass697 A01;
    public final boolean A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        C86104wH.A1B(parcel, this);
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = C86124wJ.A0X(7);
    }
}
