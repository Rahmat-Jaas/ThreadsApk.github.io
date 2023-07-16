package com.google.android.gms.internal.flags;

import X.C14030oh;
import X.C86144wL;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzb extends Binder implements IInterface {
    public abstract boolean A00(int i, Parcel parcel, Parcel parcel2, int i2);

    public zzb() {
        int A03 = C14030oh.A03(579507904);
        attachInterface(this, "com.google.android.gms.flags.IFlagProvider");
        C14030oh.A0A(-948036037, A03);
    }

    public IBinder asBinder() {
        C14030oh.A0A(-752924833, C14030oh.A03(829104579));
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean A00;
        int i3;
        int A03 = C14030oh.A03(2082162106);
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                A00 = true;
                i3 = -2144055115;
            }
            A00 = A00(i, parcel, parcel2, i2);
            i3 = -1923412358;
        } else {
            C86144wL.A1A(this, parcel);
            A00 = A00(i, parcel, parcel2, i2);
            i3 = -1923412358;
        }
        C14030oh.A0A(i3, A03);
        return A00;
    }
}
