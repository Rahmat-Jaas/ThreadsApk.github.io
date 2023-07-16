package com.google.android.gms.fido.fido2.api.common;

import X.C122167Ky;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(55);
    public final byte[] A00;
    public final byte[] A01;

    public zze(byte[] bArr, byte[] bArr2) {
        this.A00 = bArr;
        this.A01 = bArr2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A0L(parcel, this.A00, 1, false);
        C122167Ky.A0L(parcel, this.A01, 2, false);
        C122167Ky.A05(parcel, A002);
    }
}
