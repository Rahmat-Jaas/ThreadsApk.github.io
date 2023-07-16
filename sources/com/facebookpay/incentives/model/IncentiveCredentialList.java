package com.facebookpay.incentives.model;

import X.AnonymousClass0ZV;
import X.C04220Ms;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class IncentiveCredentialList implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(81);
    public final List A00;

    public IncentiveCredentialList(List list) {
        C04220Ms.A0B(list, 1);
        this.A00 = list;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeStringList(this.A00);
    }

    public IncentiveCredentialList() {
        this(AnonymousClass0ZV.A00);
    }
}
