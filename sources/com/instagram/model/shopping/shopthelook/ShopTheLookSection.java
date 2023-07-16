package com.instagram.model.shopping.shopthelook;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape15S0000000_I2_15;
import com.instagram.model.shopping.ProductDetailsProductItemDict;
import java.util.ArrayList;

public final class ShopTheLookSection implements Parcelable {
    public static final PCreatorCreatorShape15S0000000_I2_15 CREATOR = new PCreatorCreatorShape15S0000000_I2_15(40);
    public String A00;
    public ArrayList A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C04220Ms.A0B(parcel, 0);
        String str2 = this.A00;
        if (str2 != null) {
            parcel.writeString(str2);
            ArrayList arrayList = this.A01;
            if (arrayList != null) {
                parcel.writeTypedList(arrayList);
                return;
            }
            str = "products";
        } else {
            str = "header";
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public ShopTheLookSection(Parcel parcel) {
        String readString = parcel.readString();
        C04220Ms.A0A(readString);
        C04220Ms.A0B(readString, 0);
        this.A00 = readString;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        parcel.readArrayList(ProductDetailsProductItemDict.class.getClassLoader());
        this.A01 = A0v;
    }

    public ShopTheLookSection() {
    }
}
