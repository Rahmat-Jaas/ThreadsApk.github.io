package com.google.android.gms.location;

import X.C122167Ky;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class LocationSettingsStates extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(17);
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public LocationSettingsStates(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A00 = z;
        this.A01 = z2;
        this.A02 = z3;
        this.A03 = z4;
        this.A04 = z5;
        this.A05 = z6;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A0B(parcel, 1, this.A00);
        C122167Ky.A0B(parcel, 2, this.A01);
        C122167Ky.A0B(parcel, 3, this.A02);
        C122167Ky.A0B(parcel, 4, this.A03);
        C122167Ky.A0B(parcel, 5, this.A04);
        C122167Ky.A0B(parcel, 6, this.A05);
        C122167Ky.A05(parcel, A002);
    }
}
