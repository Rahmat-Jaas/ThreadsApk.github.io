package com.google.android.gms.internal.auth;

import X.C14030oh;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public abstract class zza extends Binder implements IInterface {
    public zza() {
        int A03 = C14030oh.A03(-341419014);
        attachInterface(this, "com.google.android.gms.auth.account.data.IGetTokenWithDetailsCallback");
        C14030oh.A0A(156042098, A03);
    }

    public final IBinder asBinder() {
        C14030oh.A0A(-497050468, C14030oh.A03(749514481));
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTransact(int r8, android.os.Parcel r9, android.os.Parcel r10, int r11) {
        /*
            r7 = this;
            r0 = 1650672243(0x62634273, float:1.0480498E21)
            int r4 = X.C14030oh.A03(r0)
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r8 <= r0) goto L_0x001a
            boolean r0 = super.onTransact(r8, r9, r10, r11)
            if (r0 == 0) goto L_0x001d
            r1 = 1
            r0 = 454599478(0x1b18a336, float:1.2625882E-22)
        L_0x0016:
            X.C14030oh.A0A(r0, r4)
            return r1
        L_0x001a:
            X.C86144wL.A1A(r7, r9)
        L_0x001d:
            r6 = r7
            com.google.android.gms.internal.auth.zzo r6 = (com.google.android.gms.internal.auth.zzo) r6
            r0 = 1676175382(0x63e86816, float:8.5742896E21)
            int r5 = X.C14030oh.A03(r0)
            r0 = 2
            if (r8 != r0) goto L_0x005f
            android.os.Parcelable$Creator r0 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r3 = X.C86104wH.A0F(r9, r0)
            com.google.android.gms.common.api.Status r3 = (com.google.android.gms.common.api.Status) r3
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            int r0 = r9.readInt()
            if (r0 != 0) goto L_0x005a
            r0 = 0
        L_0x003b:
            com.google.android.gms.internal.auth.zzy r6 = (com.google.android.gms.internal.auth.zzy) r6
            r1 = 1199549312(0x477fab80, float:65451.5)
            int r2 = X.C14030oh.A03(r1)
            X.6rN r1 = r6.A00
            X.C93255lG.A00(r3, r1, r0)
            r0 = -903692470(0xffffffffca22bf4a, float:-2666450.5)
            X.C14030oh.A0A(r0, r2)
            r1 = 1
            r0 = -963365759(0xffffffffc6943481, float:-18970.252)
        L_0x0053:
            X.C14030oh.A0A(r0, r5)
            r0 = 2031355976(0x79140848, float:4.8039244E34)
            goto L_0x0016
        L_0x005a:
            java.lang.Object r0 = r1.createFromParcel(r9)
            goto L_0x003b
        L_0x005f:
            r1 = 0
            r0 = -1631175116(0xffffffff9ec63e34, float:-2.0989792E-20)
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zza.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
