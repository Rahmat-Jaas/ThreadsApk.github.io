package com.google.android.gms.safetynet;

import X.C122167Ky;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class HarmfulAppsData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(31);
    public final int A00;
    public final String A01;
    public final byte[] A02;

    public HarmfulAppsData(byte[] bArr, int i, String str) {
        this.A01 = str;
        this.A02 = bArr;
        this.A00 = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A0L(parcel, this.A02, 3, C122167Ky.A0S(parcel, this.A01));
        C122167Ky.A08(parcel, 4, this.A00);
        C122167Ky.A05(parcel, A002);
    }
}
