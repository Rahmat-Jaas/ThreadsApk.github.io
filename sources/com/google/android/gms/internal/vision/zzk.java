package com.google.android.gms.internal.vision;

import X.C122167Ky;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(7);
    public int A00;
    public boolean A01;

    public zzk(int i, boolean z) {
        this.A00 = i;
        this.A01 = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 2, this.A00);
        C122167Ky.A0B(parcel, 3, this.A01);
        C122167Ky.A05(parcel, A002);
    }

    public zzk() {
    }
}
