package com.google.android.gms.common.internal;

import X.C122167Ky;
import X.C86124wJ;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(14);
    public int A00;
    public Bundle A01;
    public ConnectionTelemetryConfiguration A02;
    public Feature[] A03;

    public zzj(Bundle bundle, ConnectionTelemetryConfiguration connectionTelemetryConfiguration, Feature[] featureArr, int i) {
        this.A01 = bundle;
        this.A03 = featureArr;
        this.A00 = i;
        this.A02 = connectionTelemetryConfiguration;
    }

    public zzj() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A02(this.A01, parcel, 1);
        C122167Ky.A0M(parcel, this.A03, 2, i);
        C122167Ky.A08(parcel, 3, this.A00);
        C122167Ky.A0D(parcel, this.A02, 4, i, false);
        C122167Ky.A05(parcel, A002);
    }
}
