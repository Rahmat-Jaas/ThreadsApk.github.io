package com.facebook.redex;

import X.C144618in;

public class IDxContinuationShape149S0000000_2_I2 implements C144618in {
    public final int A00;

    public IDxContinuationShape149S0000000_2_I2(int i) {
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007d, code lost:
        r2.close();
        r1 = new X.C95115yt(X.C18250wR.A0j(r1.toString()).getString("token"));
        r0 = 200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00bf, code lost:
        r0 = r5.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00c1, code lost:
        r1.mStatusCode = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c3, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object then(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.A00
            X.GJX r5 = (X.GJX) r5
            switch(r0) {
                case 0: goto L_0x0096;
                case 1: goto L_0x0007;
                case 2: goto L_0x0063;
                case 3: goto L_0x0007;
                case 4: goto L_0x0024;
                default: goto L_0x0007;
            }
        L_0x0007:
            X.8rm r0 = r5.A00()
            r0.getClass()
            java.io.InputStream r0 = r0.AUn()
            java.io.BufferedReader r2 = X.C86144wL.A0Y(r0)
            java.lang.StringBuilder r1 = X.C18200wM.A0r()
        L_0x001a:
            java.lang.String r0 = r2.readLine()
            if (r0 == 0) goto L_0x007d
            X.C86154wM.A1W(r1, r0)
            goto L_0x001a
        L_0x0024:
            r0 = 0
            X.C04220Ms.A0B(r5, r0)
            X.8rm r0 = r5.A00()
            if (r0 == 0) goto L_0x005e
            java.io.InputStream r0 = r0.AUn()
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            r3.<init>(r0)
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()
            r1 = 32
            kotlin.jvm.internal.KtLambdaShape166S0100000_I2_21 r0 = new kotlin.jvm.internal.KtLambdaShape166S0100000_I2_21
            r0.<init>(r2, r1)
            X.C120677Bz.A02(r3, r0)
            java.lang.String r0 = "\n"
            java.lang.String r0 = X.C18200wM.A0l(r0, r2)
            org.json.JSONObject r1 = X.C18250wR.A0j(r0)
            java.lang.String r0 = "token"
            java.lang.String r0 = r1.getString(r0)
            X.C04220Ms.A06(r0)
            X.5yw r1 = new X.5yw
            r1.<init>(r0)
            goto L_0x00bf
        L_0x005e:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x0063:
            X.8rm r0 = r5.A00()
            java.io.InputStream r0 = r0.AUn()
            java.io.BufferedReader r2 = X.C86144wL.A0Y(r0)
            java.lang.StringBuilder r1 = X.C18200wM.A0r()
        L_0x0073:
            java.lang.String r0 = r2.readLine()
            if (r0 == 0) goto L_0x007d
            X.C86154wM.A1W(r1, r0)
            goto L_0x0073
        L_0x007d:
            r2.close()
            java.lang.String r0 = r1.toString()
            org.json.JSONObject r1 = X.C18250wR.A0j(r0)
            java.lang.String r0 = "token"
            java.lang.String r0 = r1.getString(r0)
            X.5yt r1 = new X.5yt
            r1.<init>(r0)
            r0 = 200(0xc8, float:2.8E-43)
            goto L_0x00c1
        L_0x0096:
            X.8rm r0 = r5.A00()
            r0.getClass()
            java.io.InputStream r0 = r0.AUn()
            java.io.BufferedReader r2 = X.C86144wL.A0Y(r0)
            java.lang.StringBuilder r1 = X.C18200wM.A0r()
        L_0x00a9:
            java.lang.String r0 = r2.readLine()
            if (r0 == 0) goto L_0x00b3
            r1.append(r0)
            goto L_0x00a9
        L_0x00b3:
            r2.close()
            java.lang.String r0 = r1.toString()
            X.5ys r1 = new X.5ys
            r1.<init>(r0)
        L_0x00bf:
            int r0 = r5.A02
        L_0x00c1:
            r1.mStatusCode = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxContinuationShape149S0000000_2_I2.then(java.lang.Object):java.lang.Object");
    }
}
