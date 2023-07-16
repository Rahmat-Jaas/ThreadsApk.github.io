package com.facebookpay.common.recyclerview.adapteritems;

import X.AnonymousClass0wJ;
import X.AnonymousClass69U;
import X.C04220Ms;
import X.C86104wH;
import X.C86144wL;
import X.C969767l;
import android.os.Parcel;
import android.os.Parcelable;

public final class PuxBannerItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(74);
    public final C969767l A00;
    public final String A01;
    public final AnonymousClass69U A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        C86104wH.A1B(parcel, this.A02);
        parcel.writeString(this.A01);
        C969767l r1 = this.A00;
        if (r1 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        C86104wH.A1B(parcel, r1);
    }

    public final AnonymousClass69U AqR() {
        return this.A02;
    }

    public PuxBannerItem(AnonymousClass69U r1, C969767l r2, String str) {
        AnonymousClass0wJ.A1O(r1, str);
        this.A02 = r1;
        this.A01 = str;
        this.A00 = r2;
    }
}
