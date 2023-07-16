package com.google.android.gms.internal.vision;

import X.C122167Ky;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzfz extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(6);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;

    public zzfz(int i, int i2, int i3, long j, int i4) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A04 = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 1, this.A00);
        C122167Ky.A08(parcel, 2, this.A01);
        C122167Ky.A08(parcel, 3, this.A02);
        C122167Ky.A08(parcel, 4, this.A03);
        C122167Ky.A09(parcel, 5, this.A04);
        C122167Ky.A05(parcel, A002);
    }
}
