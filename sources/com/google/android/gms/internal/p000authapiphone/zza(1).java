package com.google.android.gms.internal.p000authapiphone;

import X.C14030oh;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zza  reason: invalid package */
public abstract class zza extends Binder implements IInterface {
    public zza() {
        int A03 = C14030oh.A03(-988422594);
        attachInterface(this, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
        C14030oh.A0A(-1652669150, A03);
    }

    public final IBinder asBinder() {
        C14030oh.A0A(-848440143, C14030oh.A03(976510229));
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTransact(int r8, android.os.Parcel r9, android.os.Parcel r10, int r11) {
        /*
            r7 = this;
            r0 = 758171821(0x2d30c8ad, float:1.0049001E-11)
            int r6 = X.C14030oh.A03(r0)
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r8 <= r0) goto L_0x001a
            boolean r0 = super.onTransact(r8, r9, r10, r11)
            if (r0 == 0) goto L_0x001d
            r4 = 1
            r0 = -1073723979(0xffffffffc00045b5, float:-2.0042546)
        L_0x0016:
            X.C14030oh.A0A(r0, r6)
            return r4
        L_0x001a:
            X.C86144wL.A1A(r7, r9)
        L_0x001d:
            r1 = r7
            com.google.android.gms.internal.auth-api-phone.zzm r1 = (com.google.android.gms.internal.p000authapiphone.zzm) r1
            r0 = -178077453(0xfffffffff562c0f3, float:-2.8744447E32)
            int r5 = X.C14030oh.A03(r0)
            r4 = 1
            if (r8 != r4) goto L_0x0051
            android.os.Parcelable$Creator r0 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r3 = X.C86104wH.A0F(r9, r0)
            com.google.android.gms.common.api.Status r3 = (com.google.android.gms.common.api.Status) r3
            com.google.android.gms.internal.auth-api-phone.zzab r1 = (com.google.android.gms.internal.p000authapiphone.zzab) r1
            r0 = -1248181606(0xffffffffb59a429a, float:-1.1493278E-6)
            int r2 = X.C14030oh.A03(r0)
            X.6rN r1 = r1.A00
            r0 = 0
            X.C99316Iy.A00(r3, r1, r0)
            r0 = 1907046207(0x71ab373f, float:1.6956392E30)
            X.C14030oh.A0A(r0, r2)
            r0 = -1285346404(0xffffffffb3632b9c, float:-5.289222E-8)
        L_0x004a:
            X.C14030oh.A0A(r0, r5)
            r0 = 607384468(0x2433f394, float:3.9020756E-17)
            goto L_0x0016
        L_0x0051:
            r4 = 0
            r0 = -1640242318(0xffffffff9e3be372, float:-9.946732E-21)
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000authapiphone.zza.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
