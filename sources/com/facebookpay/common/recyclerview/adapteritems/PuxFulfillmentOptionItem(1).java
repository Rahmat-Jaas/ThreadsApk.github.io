package com.facebookpay.common.recyclerview.adapteritems;

import X.AnonymousClass006;
import X.AnonymousClass69U;
import X.C04220Ms;
import X.C116876xh;
import X.C116886xi;
import X.C86104wH;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent;

public final class PuxFulfillmentOptionItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(77);
    public final AnonymousClass69U A00;
    public final FulfillmentOptionComponent A01;
    public final Integer A02;
    public final Integer A03;
    public final boolean A04;
    public final boolean A05;

    public PuxFulfillmentOptionItem(AnonymousClass69U r2, FulfillmentOptionComponent fulfillmentOptionComponent, Integer num, Integer num2, boolean z, boolean z2) {
        C04220Ms.A0B(r2, 1);
        this.A00 = r2;
        this.A01 = fulfillmentOptionComponent;
        this.A05 = z;
        this.A04 = z2;
        this.A03 = num;
        this.A02 = num2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        C86104wH.A1B(parcel, this.A00);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        Integer num = this.A03;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(C116886xi.A01(num));
        }
        Integer num2 = this.A02;
        if (num2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeString(C116876xh.A01(num2));
    }

    public final AnonymousClass69U AqR() {
        return this.A00;
    }

    public PuxFulfillmentOptionItem() {
        this(AnonymousClass69U.A0X, (FulfillmentOptionComponent) null, AnonymousClass006.A00, (Integer) null, false, false);
    }
}
