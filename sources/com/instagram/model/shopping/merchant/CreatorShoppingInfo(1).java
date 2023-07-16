package com.instagram.model.shopping.merchant;

import X.AnonymousClass0Sf;
import X.C04220Ms;
import X.C18200wM;
import X.C21605BxB;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape14S0000000_I2_14;
import java.util.Iterator;
import java.util.List;

public final class CreatorShoppingInfo extends AnonymousClass0Sf implements Parcelable, C21605BxB {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape14S0000000_I2_14(92);
    public final List A00;

    public CreatorShoppingInfo(List list) {
        C04220Ms.A0B(list, 1);
        this.A00 = list;
    }

    public final CreatorShoppingInfo D62() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof CreatorShoppingInfo) && C04220Ms.A0I(this.A00, ((CreatorShoppingInfo) obj).A00));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        Iterator A0v = C18200wM.A0v(parcel, this.A00);
        while (A0v.hasNext()) {
            ((MicroMerchantDict) A0v.next()).writeToParcel(parcel, i);
        }
    }

    public final List AsI() {
        return this.A00;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
