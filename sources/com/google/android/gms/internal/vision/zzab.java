package com.google.android.gms.internal.vision;

import X.C122167Ky;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(0);
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;

    public zzab(int i, int i2, int i3, int i4, float f) {
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A04 = i4;
        this.A00 = f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 2, this.A01);
        C122167Ky.A08(parcel, 3, this.A02);
        C122167Ky.A08(parcel, 4, this.A03);
        C122167Ky.A08(parcel, 5, this.A04);
        C122167Ky.A04(parcel, this.A00, 6);
        C122167Ky.A05(parcel, A002);
    }
}
