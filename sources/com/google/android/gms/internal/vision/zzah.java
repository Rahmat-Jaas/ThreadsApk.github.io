package com.google.android.gms.internal.vision;

import X.C122167Ky;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(1);
    public final int A00;
    public final int A01;
    public final zzab A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final zzao[] A06;
    public final float A07;
    public final int A08;
    public final zzab A09;
    public final zzab A0A;

    public zzah(zzab zzab, zzab zzab2, zzab zzab3, String str, String str2, zzao[] zzaoArr, float f, int i, int i2, int i3, boolean z) {
        this.A06 = zzaoArr;
        this.A02 = zzab;
        this.A09 = zzab2;
        this.A0A = zzab3;
        this.A03 = str;
        this.A07 = f;
        this.A04 = str2;
        this.A08 = i;
        this.A05 = z;
        this.A00 = i2;
        this.A01 = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A0M(parcel, this.A06, 2, i);
        C122167Ky.A0D(parcel, this.A02, 3, i, false);
        C122167Ky.A0D(parcel, this.A09, 4, i, false);
        C122167Ky.A0D(parcel, this.A0A, 5, i, false);
        C122167Ky.A0H(parcel, this.A03, 6, false);
        C122167Ky.A04(parcel, this.A07, 7);
        C122167Ky.A0H(parcel, this.A04, 8, false);
        C122167Ky.A08(parcel, 9, this.A08);
        C122167Ky.A0B(parcel, 10, this.A05);
        C122167Ky.A08(parcel, 11, this.A00);
        C122167Ky.A08(parcel, 12, this.A01);
        C122167Ky.A05(parcel, A002);
    }
}
