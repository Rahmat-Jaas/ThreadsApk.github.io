package com.facebookpay.common.recyclerview.adapteritems;

import X.AnonymousClass69U;
import X.C04220Ms;
import X.C86104wH;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.impls.PAYLinkableTextFragmentImpl;

public final class EmailOptInItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(69);
    public boolean A00;
    public final PAYLinkableTextFragmentImpl A01;
    public final String A02;
    public final AnonymousClass69U A03;

    public EmailOptInItem(PAYLinkableTextFragmentImpl pAYLinkableTextFragmentImpl, AnonymousClass69U r3, String str, boolean z) {
        C04220Ms.A0B(r3, 1);
        this.A03 = r3;
        this.A00 = z;
        this.A01 = pAYLinkableTextFragmentImpl;
        this.A02 = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        C86104wH.A1B(parcel, this.A03);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeValue(this.A01);
        parcel.writeString(this.A02);
    }

    public final AnonymousClass69U AqR() {
        return this.A03;
    }

    public EmailOptInItem() {
        this((PAYLinkableTextFragmentImpl) null, AnonymousClass69U.A0D, (String) null, false);
    }
}
