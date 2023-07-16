package com.facebookpay.common.recyclerview.adapteritems;

import X.AnonymousClass69U;
import X.C04220Ms;
import X.C86104wH;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.impls.PAYLinkableTextFragmentImpl;

public final class AnonCheckoutPuxLink implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(64);
    public final PAYLinkableTextFragmentImpl A00;
    public final AnonymousClass69U A01;

    public AnonCheckoutPuxLink(PAYLinkableTextFragmentImpl pAYLinkableTextFragmentImpl, AnonymousClass69U r3) {
        C04220Ms.A0B(r3, 1);
        this.A01 = r3;
        this.A00 = pAYLinkableTextFragmentImpl;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        C86104wH.A1B(parcel, this.A01);
        parcel.writeValue(this.A00);
    }

    public final AnonymousClass69U AqR() {
        return this.A01;
    }

    public AnonCheckoutPuxLink() {
        this((PAYLinkableTextFragmentImpl) null, AnonymousClass69U.A07);
    }
}
