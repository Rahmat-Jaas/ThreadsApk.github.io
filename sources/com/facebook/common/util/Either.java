package com.facebook.common.util;

import X.C143978hc;
import X.C32572Cj;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.redex.PCreatorCreatorShape1S0000000_I2_1;

public class Either implements C143978hc, Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape1S0000000_I2_1(62);
    public final boolean A00;
    public final Object A01;
    public final Object A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Either)) {
            return false;
        }
        return C32572Cj.A00(get(), ((Either) obj).get());
    }

    public final Object get() {
        if (this.A00) {
            return this.A01;
        }
        return this.A02;
    }

    public final String toString() {
        String str;
        if (this.A00) {
            str = "left";
        } else {
            str = "right";
        }
        return StringFormatUtil.formatStrLocaleSafe("Either.%s(%s)", str, String.valueOf(get()));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.A01);
        parcel.writeValue(this.A02);
        parcel.writeInt(this.A00 ? 1 : 0);
    }

    public Either(Object obj, Object obj2, boolean z) {
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = z;
    }

    public final int hashCode() {
        return C86124wJ.A0F(get());
    }
}
