package com.facebookpay.form.model;

import X.C04220Ms;
import X.C18200wM;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.locale.Country;
import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.List;

public final class FormCountry implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(74);
    @SerializedName("country")
    public final Country A00;
    @SerializedName("formFields")
    public final List<FormField> A01;

    public FormCountry(Country country, List list) {
        C04220Ms.A0B(country, 1);
        this.A00 = country;
        this.A01 = list;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        Iterator A0v = C18200wM.A0v(parcel, this.A01);
        while (A0v.hasNext()) {
            ((FormField) A0v.next()).writeToParcel(parcel, i);
        }
    }
}
