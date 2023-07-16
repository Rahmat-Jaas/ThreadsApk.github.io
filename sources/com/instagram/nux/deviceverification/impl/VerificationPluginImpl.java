package com.instagram.nux.deviceverification.impl;

import X.C102106Tv;
import X.C62213Xu;

public class VerificationPluginImpl extends C62213Xu {
    public C102106Tv A00;

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void startDeviceValidation(android.content.Context r11, java.lang.String r12) {
        /*
            r10 = this;
            X.6Tv r2 = new X.6Tv
            r2.<init>()
            r10.A00 = r2
            java.lang.String r1 = "c30a13e660cb14207917cd82bcef975e"
            com.instagram.strings.StringBridge$NativeStringBridge r0 = X.C103346Yv.A00
            java.lang.String r5 = r0.nativeGetInstagramString(r1)
            X.6es r4 = new X.6es
            r4.<init>(r2)
            long r0 = java.lang.System.currentTimeMillis()
            r8 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r8
            if (r12 != 0) goto L_0x001f
            java.lang.String r12 = "unknown"
        L_0x001f:
            java.lang.StringBuilder r3 = X.C18200wM.A0r()
            r3.append(r12)
            java.lang.String r2 = "|"
            r3.append(r2)
            r3.append(r0)
            java.lang.String r3 = X.C18180wK.A0i(r2, r3)
            r0 = 24
            byte[] r2 = new byte[r0]
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            r0.nextBytes(r2)
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            byte[] r0 = r3.getBytes()     // Catch:{ IOException -> 0x004e }
            r1.write(r0)     // Catch:{ IOException -> 0x004e }
            r1.write(r2)     // Catch:{ IOException -> 0x004e }
            goto L_0x0052
        L_0x004e:
            r7 = 0
        L_0x004f:
            java.lang.String r3 = "unknown"
            goto L_0x005d
        L_0x0052:
            byte[] r7 = r1.toByteArray()
            if (r7 == 0) goto L_0x004f
            r0 = 2
            java.lang.String r3 = android.util.Base64.encodeToString(r7, r0)
        L_0x005d:
            com.google.android.gms.common.GoogleApiAvailability r1 = com.google.android.gms.common.GoogleApiAvailability.A00
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r0 = r1.A02(r11, r0)
            if (r0 == 0) goto L_0x007f
            java.lang.String r1 = com.google.android.gms.common.ConnectionResult.A00(r0)
            java.lang.Integer r4 = X.AnonymousClass006.A0C
            java.lang.String r0 = "GOOGLE_PLAY_UNAVAILABLE: "
            java.lang.String r2 = X.AnonymousClass00U.A0L(r0, r1)
            X.KHr r1 = X.C38040KHr.A01
            X.45Q r0 = new X.45Q
            r0.<init>(r2, r4, r3)
            r1.CWx(r0)
            return
        L_0x007f:
            java.lang.String r2 = "VERIFICATION_PENDING: request time is "
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 / r8
            java.lang.String r6 = X.AnonymousClass00U.A08(r0, r2)
            java.lang.Integer r2 = X.AnonymousClass006.A00
            X.KHr r1 = X.C38040KHr.A01
            X.45Q r0 = new X.45Q
            r0.<init>(r6, r2, r3)
            r1.CWx(r0)
            X.5lC r0 = new X.5lC
            r0.<init>(r11)
            X.7AL r0 = r0.A05
            X.5qd r1 = new X.5qd
            r1.<init>(r0, r5, r7)
            r0.A07(r1)
            X.5lT r0 = new X.5lT
            r0.<init>()
            X.7HU r2 = X.AnonymousClass7CP.A01(r1, r0)
            X.7mL r0 = new X.7mL
            r0.<init>(r4, r3)
            java.util.concurrent.Executor r1 = X.C103456Zg.A00
            r2.A09(r0, r1)
            X.419 r0 = new X.419
            r0.<init>(r4, r3)
            r2.A08(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nux.deviceverification.impl.VerificationPluginImpl.startDeviceValidation(android.content.Context, java.lang.String):void");
    }
}
