package com.google.android.gms.common.internal;

import X.C122167Ky;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class TelemetryData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(6);
    public List A00;
    public final int A01;

    public TelemetryData(List list, int i) {
        this.A01 = i;
        this.A00 = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 1, this.A01);
        C122167Ky.A0J(parcel, this.A00, 2, A002);
    }
}
