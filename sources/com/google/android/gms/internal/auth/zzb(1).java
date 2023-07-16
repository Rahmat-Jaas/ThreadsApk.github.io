package com.google.android.gms.internal.auth;

import X.C14030oh;
import X.C86104wH;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class zzb implements IInterface {
    public final IBinder A00;
    public final String A01;

    public zzb(String str, IBinder iBinder) {
        int A03 = C14030oh.A03(974064274);
        this.A00 = iBinder;
        this.A01 = str;
        C14030oh.A0A(-1659229134, A03);
    }

    public final Parcel A00() {
        int A03 = C14030oh.A03(1220040507);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        C14030oh.A0A(1226449165, A03);
        return obtain;
    }

    public final Parcel A01(Parcel parcel, int i) {
        int A03 = C14030oh.A03(536043203);
        parcel = Parcel.obtain();
        try {
            C86104wH.A19(this.A00, parcel, parcel, i);
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
            C14030oh.A0A(167604417, A03);
        }
    }

    public final void A02(Parcel parcel, int i) {
        int A03 = C14030oh.A03(512851442);
        Parcel obtain = Parcel.obtain();
        try {
            C86104wH.A19(this.A00, parcel, obtain, i);
        } finally {
            parcel.recycle();
            obtain.recycle();
            C14030oh.A0A(1852516139, A03);
        }
    }

    public final IBinder asBinder() {
        int A03 = C14030oh.A03(178570651);
        IBinder iBinder = this.A00;
        C14030oh.A0A(-321684353, A03);
        return iBinder;
    }
}
