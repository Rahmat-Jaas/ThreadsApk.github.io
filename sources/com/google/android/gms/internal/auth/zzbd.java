package com.google.android.gms.internal.auth;

import X.C122167Ky;
import X.C13320nQ;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzbd extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(90);
    public final String A00;
    public final byte[] A01;

    public zzbd(byte[] bArr, String str) {
        C13320nQ.A01(str);
        this.A00 = str;
        C13320nQ.A01(bArr);
        this.A01 = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 1, 1);
        C122167Ky.A0L(parcel, this.A01, 3, C122167Ky.A0S(parcel, this.A00));
        C122167Ky.A05(parcel, A002);
    }
}
