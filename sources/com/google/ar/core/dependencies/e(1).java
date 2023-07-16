package com.google.ar.core.dependencies;

import X.C14030oh;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public class e extends Binder implements IInterface {
    public final IBinder asBinder() {
        C14030oh.A0A(-1136289676, C14030oh.A03(69876731));
        return this;
    }

    public e(String str) {
        int A03 = C14030oh.A03(-1180111157);
        attachInterface(this, str);
        C14030oh.A0A(1299453729, A03);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTransact(int r9, android.os.Parcel r10, android.os.Parcel r11, int r12) {
        /*
            r8 = this;
            r0 = -44391118(0xfffffffffd5aa532, float:-1.816434E37)
            int r2 = X.C14030oh.A03(r0)
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r9 <= r0) goto L_0x001a
            boolean r0 = super.onTransact(r9, r10, r11, r12)
            if (r0 == 0) goto L_0x001d
            r0 = 1
            r1 = -625418614(0xffffffffdab8de8a, float:-2.601804E16)
        L_0x0016:
            X.C14030oh.A0A(r1, r2)
            return r0
        L_0x001a:
            X.C86144wL.A1A(r8, r10)
        L_0x001d:
            r6 = r8
            boolean r0 = r8 instanceof com.google.ar.core.dependencies.j
            if (r0 == 0) goto L_0x00bf
            com.google.ar.core.dependencies.j r6 = (com.google.ar.core.dependencies.j) r6
            r0 = 1143441509(0x44278865, float:670.13116)
            int r3 = X.C14030oh.A03(r0)
            r0 = 1
            if (r9 == r0) goto L_0x003f
            r0 = 2
            if (r9 == r0) goto L_0x0045
            r0 = 3
            if (r9 == r0) goto L_0x003f
            r0 = 1738217512(0x679b1828, float:1.4648248E24)
        L_0x0037:
            X.C14030oh.A0A(r0, r3)
            r0 = 0
        L_0x003b:
            r1 = 901232438(0x35b7b736, float:1.3687884E-6)
            goto L_0x0016
        L_0x003f:
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            X.C86164wN.A19(r10, r0)
            goto L_0x0086
        L_0x0045:
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r5 = X.C86104wH.A0F(r10, r0)
            android.os.BaseBundle r5 = (android.os.BaseBundle) r5
            com.google.ar.core.p r6 = (com.google.ar.core.p) r6
            r0 = -190924828(0xfffffffff49eb7e4, float:-1.0059969E32)
            int r4 = X.C14030oh.A03(r0)
            java.lang.String r1 = "error.code"
            r0 = -100
            int r7 = r5.getInt(r1, r0)
            r0 = -5
            java.lang.String r5 = "ARCore-InstallService"
            if (r7 == r0) goto L_0x00ad
            r0 = -3
            if (r7 == r0) goto L_0x009b
            if (r7 == 0) goto L_0x008e
            r0 = 33
            java.lang.StringBuilder r1 = X.C86114wI.A0s(r0)
            java.lang.String r0 = "requestInfo returned: "
            java.lang.String r0 = X.C86104wH.A10(r0, r1, r7)
            android.util.Log.e(r5, r0)
            X.82Q r0 = r6.A00
            X.6oW r1 = r0.A02
            X.68r r0 = X.C972668r.A06
            r1.A00(r0)
            r0 = -383192804(0xffffffffe928f11c, float:-1.2764884E25)
        L_0x0083:
            X.C14030oh.A0A(r0, r4)
        L_0x0086:
            r0 = 1049672645(0x3e90bbc5, float:0.28268257)
            X.C14030oh.A0A(r0, r3)
            r0 = 1
            goto L_0x003b
        L_0x008e:
            X.82Q r0 = r6.A00
            X.6oW r1 = r0.A02
            X.68r r0 = X.C972668r.A04
            r1.A00(r0)
            r0 = 949657793(0x389aa0c1, float:7.373235E-5)
            goto L_0x0083
        L_0x009b:
            java.lang.String r0 = "The Google Play application must be updated."
            android.util.Log.e(r5, r0)
            X.82Q r0 = r6.A00
            X.6oW r1 = r0.A02
            X.68r r0 = X.C972668r.A06
            r1.A00(r0)
            r0 = 1454721154(0x56b54882, float:9.9661512E13)
            goto L_0x0083
        L_0x00ad:
            java.lang.String r0 = "The device is not supported."
            android.util.Log.e(r5, r0)
            X.82Q r0 = r6.A00
            X.6oW r1 = r0.A02
            X.68r r0 = X.C972668r.A08
            r1.A00(r0)
            r0 = 1193096800(0x471d3660, float:40246.375)
            goto L_0x0083
        L_0x00bf:
            r0 = 386093931(0x1703536b, float:4.243367E-25)
            int r3 = X.C14030oh.A03(r0)
            r0 = 1564443734(0x5d3f8456, float:8.6251561E17)
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ar.core.dependencies.e.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
