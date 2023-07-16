package com.instagram.common.util.gradient;

import X.C04220Ms;
import X.C31163GhW;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape115S0000000_I2;

public final class BackgroundGradientColors implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape115S0000000_I2(19);
    public int A00;
    public int A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }

    public final BackgroundGradientColors A00(int i) {
        return new BackgroundGradientColors(C31163GhW.A06(this.A01, i), C31163GhW.A06(this.A00, i));
    }

    public BackgroundGradientColors(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public BackgroundGradientColors() {
        this(0, 0);
    }
}
