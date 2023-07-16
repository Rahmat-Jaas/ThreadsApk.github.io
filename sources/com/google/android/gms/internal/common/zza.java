package com.google.android.gms.internal.common;

import X.C14030oh;
import X.C86104wH;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class zza implements IInterface {
    public final IBinder A00;
    public final String A01;

    public zza(String str, IBinder iBinder) {
        int A03 = C14030oh.A03(-916451897);
        this.A00 = iBinder;
        this.A01 = str;
        C14030oh.A0A(-816241654, A03);
    }

    public final IBinder asBinder() {
        int A03 = C14030oh.A03(1190100001);
        IBinder iBinder = this.A00;
        C14030oh.A0A(-170944782, A03);
        return iBinder;
    }

    public final Parcel A00() {
        int A03 = C14030oh.A03(-24564629);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        C14030oh.A0A(1470833525, A03);
        return obtain;
    }

    public final Parcel A01(Parcel parcel, int i) {
        int A03 = C14030oh.A03(1026128298);
        parcel = Parcel.obtain();
        try {
            C86104wH.A19(this.A00, parcel, parcel, i);
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
            C14030oh.A0A(882642655, A03);
        }
    }
}
