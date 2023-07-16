package com.google.android.gms.auth.blockstore;

import X.C122167Ky;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class StoreBytesData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(93);
    public final String A00;
    public final boolean A01;
    public final byte[] A02;

    public StoreBytesData(String str, byte[] bArr, boolean z) {
        this.A02 = bArr;
        this.A01 = z;
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A0L(parcel, this.A02, 1, false);
        C122167Ky.A0B(parcel, 2, this.A01);
        C122167Ky.A0F(parcel, this.A00, A002, false);
    }
}
