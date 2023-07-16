package com.facebookpay.common.recyclerview.adapteritems;

import X.AnonymousClass0ZV;
import X.AnonymousClass0wJ;
import X.AnonymousClass69U;
import X.C04220Ms;
import X.C86104wH;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class PuxIncentiveItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(78);
    public final List A00;
    public final AnonymousClass69U A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        C86104wH.A1B(parcel, this.A01);
        parcel.writeStringList(this.A00);
    }

    public final AnonymousClass69U AqR() {
        return this.A01;
    }

    public PuxIncentiveItem(AnonymousClass69U r1, List list) {
        AnonymousClass0wJ.A1O(r1, list);
        this.A01 = r1;
        this.A00 = list;
    }

    public PuxIncentiveItem() {
        this(AnonymousClass69U.A0Y, AnonymousClass0ZV.A00);
    }
}
