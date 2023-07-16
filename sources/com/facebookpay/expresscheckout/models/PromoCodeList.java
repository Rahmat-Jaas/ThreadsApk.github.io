package com.facebookpay.expresscheckout.models;

import X.AnonymousClass0ZV;
import X.C04220Ms;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public final class PromoCodeList implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(37);
    @SerializedName("promoCodeList")
    public final List<String> A00;

    public PromoCodeList(List list) {
        C04220Ms.A0B(list, 1);
        this.A00 = list;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeStringList(this.A00);
    }

    public PromoCodeList() {
        this(AnonymousClass0ZV.A00);
    }
}
