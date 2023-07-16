package com.google.android.gms.safetynet;

import X.C122167Ky;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(33);
    public final String A00;

    public zzf(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C122167Ky.A0E(parcel, this.A00, C122167Ky.A00(parcel));
    }
}
