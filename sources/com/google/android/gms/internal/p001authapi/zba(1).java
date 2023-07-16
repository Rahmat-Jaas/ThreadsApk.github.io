package com.google.android.gms.internal.p001authapi;

import X.C14030oh;
import X.C86104wH;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.auth-api.zba  reason: invalid package */
public class zba implements IInterface {
    public final IBinder A00;
    public final String A01;

    public zba(String str, IBinder iBinder) {
        int A03 = C14030oh.A03(203213487);
        this.A00 = iBinder;
        this.A01 = str;
        C14030oh.A0A(496381104, A03);
    }

    public final IBinder asBinder() {
        int A03 = C14030oh.A03(250671105);
        IBinder iBinder = this.A00;
        C14030oh.A0A(1592559146, A03);
        return iBinder;
    }

    public final Parcel A00() {
        int A03 = C14030oh.A03(1625149835);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        C14030oh.A0A(-135530439, A03);
        return obtain;
    }

    public final void A01(Parcel parcel, int i) {
        int A03 = C14030oh.A03(-1096005477);
        Parcel obtain = Parcel.obtain();
        try {
            C86104wH.A19(this.A00, parcel, obtain, i);
        } finally {
            parcel.recycle();
            obtain.recycle();
            C14030oh.A0A(849984768, A03);
        }
    }
}
