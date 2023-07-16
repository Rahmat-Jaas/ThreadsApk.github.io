package com.google.android.gms.internal.auth_blockstore;

import X.C14030oh;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public abstract class zzb extends Binder implements IInterface {
    public final IBinder asBinder() {
        C14030oh.A0A(-1811953677, C14030oh.A03(-2026300582));
        return this;
    }

    public zzb(String str) {
        int A03 = C14030oh.A03(-709917162);
        attachInterface(this, str);
        C14030oh.A0A(5853961, A03);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTransact(int r9, android.os.Parcel r10, android.os.Parcel r11, int r12) {
        /*
            r8 = this;
            r0 = -36567356(0xfffffffffdd206c4, float:-3.4896626E37)
            int r4 = X.C14030oh.A03(r0)
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r9 <= r0) goto L_0x001a
            boolean r0 = super.onTransact(r9, r10, r11, r12)
            if (r0 == 0) goto L_0x001d
            r6 = 1
            r0 = -1201329244(0xffffffffb8652ba4, float:-5.4638498E-5)
        L_0x0016:
            X.C14030oh.A0A(r0, r4)
            return r6
        L_0x001a:
            X.C86144wL.A1A(r8, r10)
        L_0x001d:
            r5 = r8
            boolean r0 = r8 instanceof com.google.android.gms.internal.auth_blockstore.zzm
            if (r0 == 0) goto L_0x0064
            com.google.android.gms.internal.auth_blockstore.zzm r5 = (com.google.android.gms.internal.auth_blockstore.zzm) r5
            r0 = 81411986(0x4da3f92, float:5.1309934E-36)
            int r7 = X.C14030oh.A03(r0)
            r6 = 1
            if (r9 != r6) goto L_0x005f
            android.os.Parcelable$Creator r0 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r3 = X.C86104wH.A0F(r10, r0)
            com.google.android.gms.common.api.Status r3 = (com.google.android.gms.common.api.Status) r3
            int r1 = r10.readInt()
            X.AnonymousClass7CS.A00(r10)
            com.google.android.gms.internal.auth_blockstore.zzu r5 = (com.google.android.gms.internal.auth_blockstore.zzu) r5
            r0 = 969333406(0x39c6da9e, float:3.7928385E-4)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            X.6rN r0 = r5.A00
            X.C99316Iy.A00(r3, r0, r1)
            r0 = 457067075(0x1b3e4a43, float:1.5740427E-22)
            X.C14030oh.A0A(r0, r2)
            r0 = 68497620(0x41530d4, float:1.7537287E-36)
        L_0x0058:
            X.C14030oh.A0A(r0, r7)
        L_0x005b:
            r0 = 1450982289(0x567c3b91, float:6.9333191E13)
            goto L_0x0016
        L_0x005f:
            r6 = 0
            r0 = -853772175(0xffffffffcd1c7871, float:-1.64071184E8)
            goto L_0x0058
        L_0x0064:
            boolean r0 = r8 instanceof com.google.android.gms.internal.auth_blockstore.zzk
            if (r0 == 0) goto L_0x00b4
            com.google.android.gms.internal.auth_blockstore.zzk r5 = (com.google.android.gms.internal.auth_blockstore.zzk) r5
            r0 = 1499518719(0x5960d6ff, float:3.95542409E15)
            int r6 = X.C14030oh.A03(r0)
            r0 = 1
            if (r9 == r0) goto L_0x00f2
            r0 = 2
            if (r9 == r0) goto L_0x007f
            r0 = -625242649(0xffffffffdabb8de7, float:-2.6395922E16)
            X.C14030oh.A0A(r0, r6)
            r6 = 0
            goto L_0x005b
        L_0x007f:
            android.os.Parcelable$Creator r0 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r3 = X.C86104wH.A0F(r10, r0)
            com.google.android.gms.common.api.Status r3 = (com.google.android.gms.common.api.Status) r3
            android.os.Parcelable$Creator r1 = com.google.android.gms.auth.blockstore.RetrieveBytesResponse.CREATOR
            int r0 = r10.readInt()
            if (r0 != 0) goto L_0x00af
            r0 = 0
        L_0x0090:
            X.AnonymousClass7CS.A00(r10)
            com.google.android.gms.internal.auth_blockstore.zzv r5 = (com.google.android.gms.internal.auth_blockstore.zzv) r5
            r1 = 1172786908(0x45e74edc, float:7401.8574)
            int r2 = X.C14030oh.A03(r1)
            X.6rN r1 = r5.A00
            X.C99316Iy.A00(r3, r1, r0)
            r0 = 1523190538(0x5aca0b0a, float:2.84350414E16)
            X.C14030oh.A0A(r0, r2)
            r0 = 199390045(0xbe2735d, float:8.722561E-32)
            X.C14030oh.A0A(r0, r6)
            r6 = 1
            goto L_0x005b
        L_0x00af:
            java.lang.Object r0 = r1.createFromParcel(r10)
            goto L_0x0090
        L_0x00b4:
            com.google.android.gms.internal.auth_blockstore.zzi r5 = (com.google.android.gms.internal.auth_blockstore.zzi) r5
            r0 = 309586204(0x1273e91c, float:7.696461E-28)
            int r7 = X.C14030oh.A03(r0)
            r6 = 1
            if (r9 != r6) goto L_0x00ec
            android.os.Parcelable$Creator r0 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r3 = X.C86104wH.A0F(r10, r0)
            com.google.android.gms.common.api.Status r3 = (com.google.android.gms.common.api.Status) r3
            boolean r1 = X.C86104wH.A1W(r10)
            X.AnonymousClass7CS.A00(r10)
            com.google.android.gms.internal.auth_blockstore.zzy r5 = (com.google.android.gms.internal.auth_blockstore.zzy) r5
            r0 = 1109666827(0x42242c0b, float:41.04301)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            X.6rN r0 = r5.A00
            X.C99316Iy.A00(r3, r0, r1)
            r0 = -2070289974(0xffffffff8499e1ca, float:-3.617748E-36)
            X.C14030oh.A0A(r0, r2)
            r0 = -1911967959(0xffffffff8e09af29, float:-1.697089E-30)
            goto L_0x0058
        L_0x00ec:
            r6 = 0
            r0 = 688817054(0x290e839e, float:3.1644494E-14)
            goto L_0x0058
        L_0x00f2:
            android.os.Parcelable$Creator r0 = com.google.android.gms.common.api.Status.CREATOR
            X.C86164wN.A19(r10, r0)
            r10.createByteArray()
            X.AnonymousClass7CS.A00(r10)
            r0 = -323253540(0xffffffffecbb8adc, float:-1.813799E27)
            int r2 = X.C14030oh.A03(r0)
            java.lang.UnsupportedOperationException r1 = X.C18240wQ.A0j()
            r0 = -363254742(0xffffffffea592c2a, float:-6.5636365E25)
            X.C14030oh.A0A(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth_blockstore.zzb.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
