package com.google.android.gms.auth.api.accounttransfer;

import X.C122167Ky;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class DeviceMetaData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(63);
    public long A00;
    public boolean A01;
    public final boolean A02;
    public final int A03;

    public DeviceMetaData(int i, long j, boolean z, boolean z2) {
        this.A03 = i;
        this.A01 = z;
        this.A00 = j;
        this.A02 = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 1, this.A03);
        C122167Ky.A0B(parcel, 2, this.A01);
        C122167Ky.A09(parcel, 3, this.A00);
        C122167Ky.A0B(parcel, 4, this.A02);
        C122167Ky.A05(parcel, A002);
    }
}
