package com.google.android.gms.vision.face.internal.client;

import X.C122167Ky;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(55);
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public boolean A04;
    public boolean A05;

    public zzf(float f, int i, int i2, int i3, boolean z, boolean z2) {
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A04 = z;
        this.A05 = z2;
        this.A00 = f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 2, this.A01);
        C122167Ky.A08(parcel, 3, this.A02);
        C122167Ky.A08(parcel, 4, this.A03);
        C122167Ky.A0B(parcel, 5, this.A04);
        C122167Ky.A0B(parcel, 6, this.A05);
        C122167Ky.A04(parcel, this.A00, 7);
        C122167Ky.A05(parcel, A002);
    }

    public zzf() {
    }
}
