package com.google.android.gms.safetynet;

import X.C122167Ky;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(32);
    public final int A00;
    public final long A01;
    public final HarmfulAppsData[] A02;
    public final boolean A03;

    public zzd(HarmfulAppsData[] harmfulAppsDataArr, int i, long j, boolean z) {
        this.A01 = j;
        this.A02 = harmfulAppsDataArr;
        this.A03 = z;
        this.A00 = !z ? -1 : i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A09(parcel, 2, this.A01);
        C122167Ky.A0M(parcel, this.A02, 3, i);
        C122167Ky.A08(parcel, 4, this.A00);
        C122167Ky.A0B(parcel, 5, this.A03);
        C122167Ky.A05(parcel, A002);
    }
}
