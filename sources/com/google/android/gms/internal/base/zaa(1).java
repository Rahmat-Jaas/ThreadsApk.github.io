package com.google.android.gms.internal.base;

import X.C14030oh;
import X.C86104wH;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class zaa implements IInterface {
    public final IBinder A00;
    public final String A01;

    public zaa(String str, IBinder iBinder) {
        int A03 = C14030oh.A03(-1643773090);
        this.A00 = iBinder;
        this.A01 = str;
        C14030oh.A0A(-1832426573, A03);
    }

    public final IBinder asBinder() {
        int A03 = C14030oh.A03(-1832304334);
        IBinder iBinder = this.A00;
        C14030oh.A0A(-176232273, A03);
        return iBinder;
    }

    public final Parcel A00() {
        int A03 = C14030oh.A03(209746410);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        C14030oh.A0A(1497862639, A03);
        return obtain;
    }

    public final void A01(Parcel parcel, int i) {
        int A03 = C14030oh.A03(-1691246703);
        Parcel obtain = Parcel.obtain();
        try {
            C86104wH.A19(this.A00, parcel, obtain, i);
        } finally {
            parcel.recycle();
            obtain.recycle();
            C14030oh.A0A(-353042594, A03);
        }
    }
}
