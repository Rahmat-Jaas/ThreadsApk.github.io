package com.facebookpay.common.recyclerview.adapteritems;

import X.AnonymousClass69U;
import X.C04220Ms;
import X.C116876xh;
import X.C116886xi;
import X.C86104wH;
import X.C86124wJ;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

public final class PuxPriceTableItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(81);
    public final Integer A00;
    public final Integer A01;
    public final ArrayList A02;
    public final AnonymousClass69U A03;

    public PuxPriceTableItem(AnonymousClass69U r2, Integer num, Integer num2, ArrayList arrayList) {
        C04220Ms.A0B(r2, 1);
        this.A03 = r2;
        this.A01 = num;
        this.A00 = num2;
        this.A02 = arrayList;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        C86104wH.A1B(parcel, this.A03);
        Integer num = this.A01;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(C116886xi.A01(num));
        }
        Integer num2 = this.A00;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(C116876xh.A01(num2));
        }
        Iterator A10 = C86124wJ.A10(parcel, this.A02);
        while (A10.hasNext()) {
            C86124wJ.A1F(parcel, A10, i);
        }
    }

    public final AnonymousClass69U AqR() {
        return this.A03;
    }
}
