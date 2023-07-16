package com.facebookpay.incentives.model;

import X.AnonymousClass0ZV;
import X.C04220Ms;
import X.C18200wM;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class IncentiveList implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(82);
    public final List A00;

    public IncentiveList(List list) {
        C04220Ms.A0B(list, 1);
        this.A00 = list;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        Iterator A0v = C18200wM.A0v(parcel, this.A00);
        while (A0v.hasNext()) {
            C86124wJ.A1F(parcel, A0v, i);
        }
    }

    public IncentiveList() {
        this(AnonymousClass0ZV.A00);
    }
}
