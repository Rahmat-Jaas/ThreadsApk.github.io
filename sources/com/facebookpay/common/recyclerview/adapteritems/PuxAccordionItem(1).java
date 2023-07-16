package com.facebookpay.common.recyclerview.adapteritems;

import X.AnonymousClass0wJ;
import X.AnonymousClass69U;
import X.AnonymousClass7Kx;
import X.C04220Ms;
import X.C108826j0;
import X.C18200wM;
import X.C86104wH;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class PuxAccordionItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(73);
    public final C108826j0 A00;
    public final AnonymousClass7Kx A01;
    public final List A02;
    public final boolean A03;
    public final AnonymousClass69U A04;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        C86104wH.A1B(parcel, this.A04);
        parcel.writeValue(this.A01);
        Iterator A0v = C18200wM.A0v(parcel, this.A02);
        while (A0v.hasNext()) {
            parcel.writeValue(A0v.next());
        }
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeValue(this.A00);
    }

    public final AnonymousClass69U AqR() {
        return this.A04;
    }

    public PuxAccordionItem(AnonymousClass69U r2, C108826j0 r3, AnonymousClass7Kx r4, List list, boolean z) {
        AnonymousClass0wJ.A1O(r2, r4);
        C04220Ms.A0B(list, 3);
        this.A04 = r2;
        this.A01 = r4;
        this.A02 = list;
        this.A03 = z;
        this.A00 = r3;
    }
}
