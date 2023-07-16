package com.facebook.common.payments.paymentmethods.model;

import X.AnonymousClass0wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape1S0000000_I2_1;
import java.util.HashMap;
import java.util.Map;

public class AdditionalFields implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape1S0000000_I2_1(57);
    public final Map A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.A00);
    }

    public AdditionalFields(Parcel parcel) {
        HashMap A0y = AnonymousClass0wJ.A0y();
        parcel.readMap(A0y, Map.class.getClassLoader());
        this.A00 = A0y;
    }
}
