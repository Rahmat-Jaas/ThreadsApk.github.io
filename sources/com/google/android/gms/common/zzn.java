package com.google.android.gms.common;

import X.C122167Ky;
import X.C86124wJ;
import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(29);
    public final Context A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public zzn(IBinder iBinder, String str, boolean z, boolean z2, boolean z3) {
        this.A01 = str;
        this.A02 = z;
        this.A03 = z2;
        this.A00 = (Context) ObjectWrapper.A01(IObjectWrapper.Stub.A02(iBinder));
        this.A04 = z3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A0H(parcel, this.A01, 1, false);
        C122167Ky.A0B(parcel, 2, this.A02);
        C122167Ky.A0B(parcel, 3, this.A03);
        C122167Ky.A03(new ObjectWrapper(this.A00), parcel, 4);
        C122167Ky.A0B(parcel, 5, this.A04);
        C122167Ky.A05(parcel, A002);
    }
}
