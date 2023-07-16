package com.facebookpay.common.recyclerview.adapteritems;

import X.AnonymousClass69U;
import X.C04220Ms;
import X.C86104wH;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.impls.PAYLinkableTextFragmentImpl;

public final class AnonCheckoutToggleItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(65);
    public final PAYLinkableTextFragmentImpl A00;
    public final PAYLinkableTextFragmentImpl A01;
    public final boolean A02;
    public final AnonymousClass69U A03;

    public AnonCheckoutToggleItem(PAYLinkableTextFragmentImpl pAYLinkableTextFragmentImpl, PAYLinkableTextFragmentImpl pAYLinkableTextFragmentImpl2, AnonymousClass69U r4, boolean z) {
        C04220Ms.A0B(r4, 1);
        this.A03 = r4;
        this.A02 = z;
        this.A01 = pAYLinkableTextFragmentImpl;
        this.A00 = pAYLinkableTextFragmentImpl2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        C86104wH.A1B(parcel, this.A03);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeValue(this.A01);
        parcel.writeValue(this.A00);
    }

    public final AnonymousClass69U AqR() {
        return this.A03;
    }

    public AnonCheckoutToggleItem() {
        this((PAYLinkableTextFragmentImpl) null, (PAYLinkableTextFragmentImpl) null, AnonymousClass69U.A08, false);
    }
}
