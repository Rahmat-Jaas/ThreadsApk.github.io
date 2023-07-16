package com.facebookpay.common.recyclerview.adapteritems;

import X.AnonymousClass69U;
import X.C04220Ms;
import X.C18200wM;
import X.C86104wH;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.impls.PAYLinkableTextFragmentImpl;
import java.util.Iterator;
import java.util.List;

public final class PuxTermsConditionItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(85);
    public final PAYLinkableTextFragmentImpl A00;
    public final PAYLinkableTextFragmentImpl A01;
    public final PAYLinkableTextFragmentImpl A02;
    public final PAYLinkableTextFragmentImpl A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final List A07;
    public final AnonymousClass69U A08;

    public PuxTermsConditionItem(PAYLinkableTextFragmentImpl pAYLinkableTextFragmentImpl, PAYLinkableTextFragmentImpl pAYLinkableTextFragmentImpl2, PAYLinkableTextFragmentImpl pAYLinkableTextFragmentImpl3, PAYLinkableTextFragmentImpl pAYLinkableTextFragmentImpl4, AnonymousClass69U r6, String str, String str2, List list, List list2) {
        C04220Ms.A0B(r6, 1);
        this.A08 = r6;
        this.A04 = str;
        this.A01 = pAYLinkableTextFragmentImpl;
        this.A05 = str2;
        this.A06 = list;
        this.A02 = pAYLinkableTextFragmentImpl2;
        this.A03 = pAYLinkableTextFragmentImpl3;
        this.A07 = list2;
        this.A00 = pAYLinkableTextFragmentImpl4;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        C86104wH.A1B(parcel, this.A08);
        parcel.writeString(this.A04);
        parcel.writeValue(this.A01);
        parcel.writeString(this.A05);
        parcel.writeStringList(this.A06);
        parcel.writeValue(this.A02);
        parcel.writeValue(this.A03);
        List list = this.A07;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0v = C18200wM.A0v(parcel, list);
            while (A0v.hasNext()) {
                parcel.writeValue(A0v.next());
            }
        }
        parcel.writeValue(this.A00);
    }

    public final AnonymousClass69U AqR() {
        return this.A08;
    }

    public PuxTermsConditionItem() {
        this((PAYLinkableTextFragmentImpl) null, (PAYLinkableTextFragmentImpl) null, (PAYLinkableTextFragmentImpl) null, (PAYLinkableTextFragmentImpl) null, AnonymousClass69U.A0f, (String) null, (String) null, (List) null, (List) null);
    }
}
