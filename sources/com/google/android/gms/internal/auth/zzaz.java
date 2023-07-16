package com.google.android.gms.internal.auth;

import X.C122167Ky;
import X.C13320nQ;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzaz extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(88);
    public final int A00;
    public final String A01;

    public zzaz(String str, int i) {
        C13320nQ.A01(str);
        this.A01 = str;
        this.A00 = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 1, 1);
        C122167Ky.A0H(parcel, this.A01, 2, false);
        C122167Ky.A06(parcel, this.A00, A002);
    }
}
