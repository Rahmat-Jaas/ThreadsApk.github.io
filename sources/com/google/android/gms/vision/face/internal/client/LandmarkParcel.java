package com.google.android.gms.vision.face.internal.client;

import X.C122167Ky;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class LandmarkParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(56);
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;

    public LandmarkParcel(int i, int i2, float f, float f2) {
        this.A03 = i;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 1, this.A03);
        C122167Ky.A04(parcel, this.A00, 2);
        C122167Ky.A04(parcel, this.A01, 3);
        C122167Ky.A08(parcel, 4, this.A02);
        C122167Ky.A05(parcel, A002);
    }
}
