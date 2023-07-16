package com.google.android.gms.internal.vision;

import X.C122167Ky;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzao extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(5);
    public final zzab A00;
    public final String A01;
    public final String A02;
    public final float A03;
    public final zzab A04;
    public final boolean A05;
    public final zzal[] A06;

    public zzao(zzab zzab, zzab zzab2, String str, String str2, zzal[] zzalArr, float f, boolean z) {
        this.A06 = zzalArr;
        this.A00 = zzab;
        this.A04 = zzab2;
        this.A01 = str;
        this.A03 = f;
        this.A02 = str2;
        this.A05 = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A0M(parcel, this.A06, 2, i);
        C122167Ky.A0D(parcel, this.A00, 3, i, false);
        C122167Ky.A0D(parcel, this.A04, 4, i, false);
        C122167Ky.A0H(parcel, this.A01, 5, false);
        C122167Ky.A04(parcel, this.A03, 6);
        C122167Ky.A0H(parcel, this.A02, 7, false);
        C122167Ky.A0B(parcel, 8, this.A05);
        C122167Ky.A05(parcel, A002);
    }
}
