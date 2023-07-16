package com.facebookpay.expresscheckout.models;

import X.C04220Ms;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;

public final class ShippingOptions implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(39);
    @SerializedName("defaultSelection")
    public final String A00;
    @SerializedName("shippingOptionList")
    public final ArrayList<ShippingOption> A01;

    public ShippingOptions(String str, ArrayList arrayList) {
        C04220Ms.A0B(arrayList, 2);
        this.A00 = str;
        this.A01 = arrayList;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A00);
        Iterator A10 = C86124wJ.A10(parcel, this.A01);
        while (A10.hasNext()) {
            ((ShippingOption) A10.next()).writeToParcel(parcel, i);
        }
    }
}
