package com.google.android.gms.common.internal;

import X.C122167Ky;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zax extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(10);
    public final int A00;
    public final int A01;
    public final int A02;
    public final Scope[] A03;

    public zax(Scope[] scopeArr, int i, int i2, int i3) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = scopeArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 1, this.A00);
        C122167Ky.A08(parcel, 2, this.A01);
        C122167Ky.A08(parcel, 3, this.A02);
        C122167Ky.A0M(parcel, this.A03, 4, i);
        C122167Ky.A05(parcel, A002);
    }
}
