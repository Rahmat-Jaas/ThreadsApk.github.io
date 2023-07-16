package com.google.android.gms.internal.common;

import X.C14030oh;
import X.C86144wL;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

public class zzb extends Binder implements IInterface {
    public boolean A03(int i, Parcel parcel, Parcel parcel2, int i2) {
        C14030oh.A0A(1990838751, C14030oh.A03(-589545027));
        return false;
    }

    public final IBinder asBinder() {
        C14030oh.A0A(-1755128171, C14030oh.A03(-877249015));
        return this;
    }

    public zzb(String str) {
        int A03 = C14030oh.A03(2129696633);
        attachInterface(this, str);
        C14030oh.A0A(871699425, A03);
    }

    public static IObjectWrapper A00(Parcel parcel, zza zza, int i) {
        Parcel A01 = zza.A01(parcel, i);
        IObjectWrapper A02 = IObjectWrapper.Stub.A02(A01.readStrongBinder());
        A01.recycle();
        return A02;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean A03;
        int i3;
        int A032 = C14030oh.A03(-190635185);
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                A03 = true;
                i3 = 1174896707;
            }
            A03 = A03(i, parcel, parcel2, i2);
            i3 = 484715494;
        } else {
            C86144wL.A1A(this, parcel);
            A03 = A03(i, parcel, parcel2, i2);
            i3 = 484715494;
        }
        C14030oh.A0A(i3, A032);
        return A03;
    }
}
