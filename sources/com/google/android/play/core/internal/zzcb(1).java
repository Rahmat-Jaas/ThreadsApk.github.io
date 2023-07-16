package com.google.android.play.core.internal;

import X.C14030oh;

public abstract class zzcb extends zzl implements zzcc {
    public zzcb() {
        C14030oh.A0A(1339963654, C14030oh.A03(-1543786261));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x01a7, code lost:
        X.C14030oh.A0A(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x01aa, code lost:
        r1 = true;
        r0 = 1553094165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        X.C14030oh.A0A(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(int r10, android.os.Parcel r11, android.os.Parcel r12, int r13) {
        /*
            r9 = this;
            r0 = 142457011(0x87db8b3, float:7.635153E-34)
            int r4 = X.C14030oh.A03(r0)
            switch(r10) {
                case 2: goto L_0x0012;
                case 3: goto L_0x0035;
                case 4: goto L_0x0058;
                case 5: goto L_0x007b;
                case 6: goto L_0x009e;
                case 7: goto L_0x00e6;
                case 8: goto L_0x0105;
                case 9: goto L_0x0112;
                case 10: goto L_0x0130;
                case 11: goto L_0x014e;
                case 12: goto L_0x016c;
                case 13: goto L_0x018a;
                default: goto L_0x000a;
            }
        L_0x000a:
            r1 = 0
            r0 = 956143186(0x38fd9652, float:1.20919794E-4)
        L_0x000e:
            X.C14030oh.A0A(r0, r4)
            return r1
        L_0x0012:
            int r3 = r11.readInt()
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            X.C86104wH.A0F(r11, r0)
            r1 = r9
            com.google.android.play.core.splitinstall.zzbh r1 = (com.google.android.play.core.splitinstall.zzbh) r1
            r0 = 1096559467(0x415c2b6b, float:13.7606)
            int r5 = com.google.android.play.core.splitinstall.zzbh.A00(r1, r0)
            X.78d r2 = X.AnonymousClass75s.A02
            java.lang.Object[] r1 = X.C18210wN.A1X(r3)
            java.lang.String r0 = "onStartInstall(%d)"
            r2.A01(r0, r1)
            r0 = -914453389(0xffffffffc97e8c73, float:-1042631.2)
            goto L_0x01a7
        L_0x0035:
            int r3 = r11.readInt()
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            X.C86104wH.A0F(r11, r0)
            r1 = r9
            com.google.android.play.core.splitinstall.zzbh r1 = (com.google.android.play.core.splitinstall.zzbh) r1
            r0 = 1934057034(0x73475e4a, float:1.5795585E31)
            int r5 = com.google.android.play.core.splitinstall.zzbh.A00(r1, r0)
            X.78d r2 = X.AnonymousClass75s.A02
            java.lang.Object[] r1 = X.C18210wN.A1X(r3)
            java.lang.String r0 = "onCompleteInstall(%d)"
            r2.A01(r0, r1)
            r0 = 1781361505(0x6a2d6b61, float:5.2412812E25)
            goto L_0x01a7
        L_0x0058:
            int r3 = r11.readInt()
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            X.C86104wH.A0F(r11, r0)
            r1 = r9
            com.google.android.play.core.splitinstall.zzbh r1 = (com.google.android.play.core.splitinstall.zzbh) r1
            r0 = 1275983726(0x4c0df76e, float:3.7215672E7)
            int r5 = com.google.android.play.core.splitinstall.zzbh.A00(r1, r0)
            X.78d r2 = X.AnonymousClass75s.A02
            java.lang.Object[] r1 = X.C18210wN.A1X(r3)
            java.lang.String r0 = "onCancelInstall(%d)"
            r2.A01(r0, r1)
            r0 = 1659203996(0x62e5719c, float:2.1162454E21)
            goto L_0x01a7
        L_0x007b:
            int r3 = r11.readInt()
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            X.C86104wH.A0F(r11, r0)
            r1 = r9
            com.google.android.play.core.splitinstall.zzbh r1 = (com.google.android.play.core.splitinstall.zzbh) r1
            r0 = 1182649588(0x467dccf4, float:16243.238)
            int r5 = com.google.android.play.core.splitinstall.zzbh.A00(r1, r0)
            X.78d r2 = X.AnonymousClass75s.A02
            java.lang.Object[] r1 = X.C18210wN.A1X(r3)
            java.lang.String r0 = "onGetSession(%d)"
            r2.A01(r0, r1)
            r0 = 2057390965(0x7aa14b75, float:4.1874512E35)
            goto L_0x01a7
        L_0x009e:
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = X.C86104wH.A0F(r11, r0)
            android.os.BaseBundle r2 = (android.os.BaseBundle) r2
            r1 = r9
            com.google.android.play.core.splitinstall.zzbh r1 = (com.google.android.play.core.splitinstall.zzbh) r1
            r0 = -1631494501(0xffffffff9ec15e9b, float:-2.0473798E-20)
            int r5 = X.C14030oh.A03(r0)
            X.75s r0 = r1.A01
            X.7Eb r0 = r0.A00
            X.6oV r8 = r1.A00
            r0.A02(r8)
            java.lang.String r0 = "error_code"
            int r7 = r2.getInt(r0)
            X.78d r6 = X.AnonymousClass75s.A02
            java.lang.Object[] r3 = X.C18210wN.A1X(r7)
            java.lang.String r2 = "onError(%d)"
            java.lang.String r1 = "PlayCore"
            r0 = 6
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L_0x00d9
            java.lang.String r0 = r6.A00
            java.lang.String r0 = X.AnonymousClass78d.A00(r0, r2, r3)
            android.util.Log.e(r1, r0)
        L_0x00d9:
            X.5r7 r0 = new X.5r7
            r0.<init>(r7)
            r8.A00(r0)
            r0 = 883727599(0x34ac9cef, float:3.215168E-7)
            goto L_0x01a7
        L_0x00e6:
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            r11.createTypedArrayList(r0)
            r1 = r9
            com.google.android.play.core.splitinstall.zzbh r1 = (com.google.android.play.core.splitinstall.zzbh) r1
            r0 = 1015286713(0x3c840bb9, float:0.016118871)
            int r5 = com.google.android.play.core.splitinstall.zzbh.A00(r1, r0)
            X.78d r2 = X.AnonymousClass75s.A02
            java.lang.Object[] r1 = X.C86164wN.A1T()
            java.lang.String r0 = "onGetSessionStates"
            r2.A01(r0, r1)
            r0 = 1705113819(0x65a1f8db, float:9.561145E22)
            goto L_0x01a7
        L_0x0105:
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = X.C86104wH.A0F(r11, r0)
            android.os.Bundle r0 = (android.os.Bundle) r0
            r9.DC8(r0)
            goto L_0x01aa
        L_0x0112:
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            X.C86104wH.A0F(r11, r0)
            r1 = r9
            com.google.android.play.core.splitinstall.zzbh r1 = (com.google.android.play.core.splitinstall.zzbh) r1
            r0 = -1264042034(0xffffffffb4a83fce, float:-3.1338863E-7)
            int r5 = com.google.android.play.core.splitinstall.zzbh.A00(r1, r0)
            X.78d r2 = X.AnonymousClass75s.A02
            java.lang.Object[] r1 = X.C86164wN.A1T()
            java.lang.String r0 = "onDeferredInstall"
            r2.A01(r0, r1)
            r0 = 1820937059(0x6c894b63, float:1.3278307E27)
            goto L_0x01a7
        L_0x0130:
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            X.C86104wH.A0F(r11, r0)
            r1 = r9
            com.google.android.play.core.splitinstall.zzbh r1 = (com.google.android.play.core.splitinstall.zzbh) r1
            r0 = -116363309(0xfffffffff9106fd3, float:-4.6872426E34)
            int r5 = com.google.android.play.core.splitinstall.zzbh.A00(r1, r0)
            X.78d r2 = X.AnonymousClass75s.A02
            java.lang.Object[] r1 = X.C86164wN.A1T()
            java.lang.String r0 = "onGetSplitsForAppUpdate"
            r2.A01(r0, r1)
            r0 = 1512882556(0x5a2cc17c, float:1.21566086E16)
            goto L_0x01a7
        L_0x014e:
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            X.C86104wH.A0F(r11, r0)
            r1 = r9
            com.google.android.play.core.splitinstall.zzbh r1 = (com.google.android.play.core.splitinstall.zzbh) r1
            r0 = 171597811(0xa3a5ff3, float:8.97362E-33)
            int r5 = com.google.android.play.core.splitinstall.zzbh.A00(r1, r0)
            X.78d r2 = X.AnonymousClass75s.A02
            java.lang.Object[] r1 = X.C86164wN.A1T()
            java.lang.String r0 = "onCompleteInstallForAppUpdate"
            r2.A01(r0, r1)
            r0 = 1551966624(0x5c8121a0, float:2.90777945E17)
            goto L_0x01a7
        L_0x016c:
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            X.C86104wH.A0F(r11, r0)
            r1 = r9
            com.google.android.play.core.splitinstall.zzbh r1 = (com.google.android.play.core.splitinstall.zzbh) r1
            r0 = 678463550(0x2870883e, float:1.3352219E-14)
            int r5 = com.google.android.play.core.splitinstall.zzbh.A00(r1, r0)
            X.78d r2 = X.AnonymousClass75s.A02
            java.lang.Object[] r1 = X.C86164wN.A1T()
            java.lang.String r0 = "onDeferredLanguageInstall"
            r2.A01(r0, r1)
            r0 = 653500679(0x26f3a107, float:1.6905159E-15)
            goto L_0x01a7
        L_0x018a:
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            X.C86104wH.A0F(r11, r0)
            r1 = r9
            com.google.android.play.core.splitinstall.zzbh r1 = (com.google.android.play.core.splitinstall.zzbh) r1
            r0 = -1970025888(0xffffffff8a93ca60, float:-1.423171E-32)
            int r5 = com.google.android.play.core.splitinstall.zzbh.A00(r1, r0)
            X.78d r2 = X.AnonymousClass75s.A02
            java.lang.Object[] r1 = X.C86164wN.A1T()
            java.lang.String r0 = "onDeferredLanguageUninstall"
            r2.A01(r0, r1)
            r0 = -1647322115(0xffffffff9dcfdbfd, float:-5.5019906E-21)
        L_0x01a7:
            X.C14030oh.A0A(r0, r5)
        L_0x01aa:
            r1 = 1
            r0 = 1553094165(0x5c925615, float:3.29519958E17)
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.internal.zzcb.A01(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
