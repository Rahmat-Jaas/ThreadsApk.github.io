package com.google.android.gms.internal.auth;

import X.C122167Ky;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzcb extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(92);
    public String A00;
    public final int A01;

    public zzcb(int i, String str) {
        this.A01 = i;
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 1, this.A01);
        C122167Ky.A0E(parcel, this.A00, A002);
    }

    public zzcb() {
        this.A01 = 1;
    }
}
