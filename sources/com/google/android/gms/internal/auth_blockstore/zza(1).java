package com.google.android.gms.internal.auth_blockstore;

import X.C14030oh;
import X.C86104wH;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class zza implements IInterface {
    public final IBinder A00;

    public zza(IBinder iBinder) {
        int A03 = C14030oh.A03(-665896670);
        this.A00 = iBinder;
        C14030oh.A0A(1822895881, A03);
    }

    public final IBinder asBinder() {
        int A03 = C14030oh.A03(-354355501);
        IBinder iBinder = this.A00;
        C14030oh.A0A(1941155577, A03);
        return iBinder;
    }

    public final void A00(Parcel parcel, int i) {
        int A03 = C14030oh.A03(1610818168);
        Parcel obtain = Parcel.obtain();
        try {
            C86104wH.A19(this.A00, parcel, obtain, i);
        } finally {
            parcel.recycle();
            obtain.recycle();
            C14030oh.A0A(2056383776, A03);
        }
    }
}
