package com.google.ar.core.dependencies;

import X.C14030oh;
import X.C86104wH;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class d implements IInterface {
    public final IBinder A00;
    public final String A01;

    public d(String str, IBinder iBinder) {
        int A03 = C14030oh.A03(1419323603);
        this.A00 = iBinder;
        this.A01 = str;
        C14030oh.A0A(2135762323, A03);
    }

    public final IBinder asBinder() {
        int A03 = C14030oh.A03(1107149806);
        IBinder iBinder = this.A00;
        C14030oh.A0A(2107740493, A03);
        return iBinder;
    }

    public final Parcel A00() {
        int A03 = C14030oh.A03(-1649703377);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        C14030oh.A0A(-1683797027, A03);
        return obtain;
    }

    public final Parcel A01(Parcel parcel, int i) {
        int A03 = C14030oh.A03(903492443);
        parcel = Parcel.obtain();
        try {
            C86104wH.A19(this.A00, parcel, parcel, i);
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
            C14030oh.A0A(730487945, A03);
        }
    }
}
