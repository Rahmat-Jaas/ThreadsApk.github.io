package com.google.android.gms.internal.vision;

import X.C14030oh;
import X.C86104wH;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class zzb implements IInterface {
    public final String A00;
    public final IBinder A01;

    public zzb(String str, IBinder iBinder) {
        int A03 = C14030oh.A03(-1638587878);
        this.A01 = iBinder;
        this.A00 = str;
        C14030oh.A0A(-1751965058, A03);
    }

    public static Parcel A00(IInterface iInterface, zzb zzb) {
        int A03 = C14030oh.A03(-2046101151);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(zzb.A00);
        C14030oh.A0A(-2105106140, A03);
        obtain.writeStrongBinder(iInterface.asBinder());
        return obtain;
    }

    public final Parcel A01(Parcel parcel, int i) {
        int A03 = C14030oh.A03(1649271168);
        parcel = Parcel.obtain();
        try {
            C86104wH.A19(this.A01, parcel, parcel, i);
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
            C14030oh.A0A(1060249796, A03);
        }
    }

    public final IBinder asBinder() {
        int A03 = C14030oh.A03(1029853520);
        IBinder iBinder = this.A01;
        C14030oh.A0A(1436259827, A03);
        return iBinder;
    }
}
