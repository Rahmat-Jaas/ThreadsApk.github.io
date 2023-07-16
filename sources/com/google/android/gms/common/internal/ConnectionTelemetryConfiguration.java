package com.google.android.gms.common.internal;

import X.C122167Ky;
import X.C86124wJ;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(15);
    public final int A00;
    public final RootTelemetryConfiguration A01;
    public final boolean A02;
    public final boolean A03;
    public final int[] A04;
    public final int[] A05;

    public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration, int[] iArr, int[] iArr2, int i, boolean z, boolean z2) {
        this.A01 = rootTelemetryConfiguration;
        this.A02 = z;
        this.A03 = z2;
        this.A04 = iArr;
        this.A00 = i;
        this.A05 = iArr2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A0D(parcel, this.A01, 1, i, false);
        C122167Ky.A0B(parcel, 2, this.A02);
        C122167Ky.A0B(parcel, 3, this.A03);
        C86144wL.A1B(parcel, this.A04, 4);
        C122167Ky.A08(parcel, 5, this.A00);
        C86144wL.A1B(parcel, this.A05, 6);
        C122167Ky.A05(parcel, A002);
    }
}
