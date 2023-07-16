package com.facebookpay.expresscheckout.models;

import X.AnonymousClass0ZV;
import X.C04220Ms;
import X.C18200wM;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.List;

public final class OffersList implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(32);
    @SerializedName("offersList")
    public final List<ECPOffer> A00;

    public OffersList(List list) {
        C04220Ms.A0B(list, 1);
        this.A00 = list;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        Iterator A0v = C18200wM.A0v(parcel, this.A00);
        while (A0v.hasNext()) {
            ((ECPOffer) A0v.next()).writeToParcel(parcel, i);
        }
    }

    public OffersList() {
        this(AnonymousClass0ZV.A00);
    }
}
