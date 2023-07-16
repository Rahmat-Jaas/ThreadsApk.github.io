package com.google.android.gms.fido.sourcedevice;

import X.C122167Ky;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class SourceDirectTransferResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(71);
    public final Status A00;
    public final int A01;

    public SourceDirectTransferResult(Status status, int i) {
        this.A00 = status;
        this.A01 = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A0D(parcel, this.A00, 1, i, false);
        C122167Ky.A08(parcel, 2, this.A01);
        C122167Ky.A05(parcel, A002);
    }
}
