package com.google.android.gms.signin.internal;

import X.C122167Ky;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zav;

public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(39);
    public final int A00;
    public final ConnectionResult A01;
    public final zav A02;

    public zak(ConnectionResult connectionResult, zav zav, int i) {
        this.A00 = i;
        this.A01 = connectionResult;
        this.A02 = zav;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 1, this.A00);
        C122167Ky.A0D(parcel, this.A02, 3, i, C122167Ky.A0Q(parcel, this.A01, i));
        C122167Ky.A05(parcel, A002);
    }
}
