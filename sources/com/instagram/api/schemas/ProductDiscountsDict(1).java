package com.instagram.api.schemas;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18200wM;
import X.C21166Bpv;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape8S0000000_I2_8;
import java.util.Iterator;
import java.util.List;

public final class ProductDiscountsDict extends AnonymousClass0Sf implements Parcelable, C21166Bpv {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape8S0000000_I2_8(89);
    public final List A00;

    public final ProductDiscountsDict D03() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof ProductDiscountsDict) && C04220Ms.A0I(this.A00, ((ProductDiscountsDict) obj).A00));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        List list = this.A00;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        Iterator A0v = C18200wM.A0v(parcel, list);
        while (A0v.hasNext()) {
            C86124wJ.A1F(parcel, A0v, i);
        }
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A03(this.A00);
    }

    public ProductDiscountsDict(List list) {
        this.A00 = list;
    }
}
