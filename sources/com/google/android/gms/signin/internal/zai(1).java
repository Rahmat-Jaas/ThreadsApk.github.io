package com.google.android.gms.signin.internal;

import X.C122167Ky;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zat;

public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(38);
    public final int A00;
    public final zat A01;

    public zai(zat zat, int i) {
        this.A00 = i;
        this.A01 = zat;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 1, this.A00);
        C122167Ky.A0C(parcel, this.A01, 2, i, A002);
    }
}
