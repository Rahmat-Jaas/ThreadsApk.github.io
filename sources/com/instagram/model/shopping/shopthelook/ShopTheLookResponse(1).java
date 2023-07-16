package com.instagram.model.shopping.shopthelook;

import X.AnonymousClass1j3;
import X.C04220Ms;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape15S0000000_I2_15;
import java.util.ArrayList;

public final class ShopTheLookResponse extends AnonymousClass1j3 implements Parcelable {
    public static final PCreatorCreatorShape15S0000000_I2_15 CREATOR = new PCreatorCreatorShape15S0000000_I2_15(39);
    public ArrayList A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        ArrayList arrayList = this.A00;
        if (arrayList != null) {
            parcel.writeTypedList(arrayList);
        } else {
            C04220Ms.A0E("sections");
            throw null;
        }
    }

    public ShopTheLookResponse(Parcel parcel) {
        ArrayList createTypedArrayList = parcel.createTypedArrayList(ShopTheLookSection.CREATOR);
        C04220Ms.A0A(createTypedArrayList);
        C04220Ms.A0B(createTypedArrayList, 0);
        this.A00 = createTypedArrayList;
    }

    public ShopTheLookResponse() {
    }
}
