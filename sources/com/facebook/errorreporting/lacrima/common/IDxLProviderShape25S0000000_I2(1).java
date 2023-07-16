package com.facebook.errorreporting.lacrima.common;

import X.C06010Xh;

public class IDxLProviderShape25S0000000_I2 extends C06010Xh {
    public final int A00;

    public IDxLProviderShape25S0000000_I2(int i) {
        this.A00 = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0094 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object A00() {
        /*
            r7 = this;
            int r0 = r7.A00
            if (r0 == 0) goto L_0x0007
            X.0Zx r0 = X.C06560Zx.A00
            return r0
        L_0x0007:
            java.lang.String r5 = "lacrima"
            r6 = 0
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ IOException -> 0x0087 }
            r2.<init>()     // Catch:{ IOException -> 0x0087 }
            java.lang.String r0 = "logcat"
            r2.add(r0)     // Catch:{ IOException -> 0x0087 }
            java.lang.String r0 = "-d"
            r2.add(r0)     // Catch:{ IOException -> 0x0087 }
            java.lang.String r0 = "-t"
            r2.add(r0)     // Catch:{ IOException -> 0x0087 }
            r0 = 200(0xc8, float:2.8E-43)
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x0087 }
            r2.add(r0)     // Catch:{ IOException -> 0x0087 }
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ IOException -> 0x0087 }
            int r0 = r2.size()     // Catch:{ IOException -> 0x0087 }
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ IOException -> 0x0087 }
            java.lang.Object[] r0 = r2.toArray(r0)     // Catch:{ IOException -> 0x0087 }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ IOException -> 0x0087 }
            java.lang.Process r1 = r1.exec(r0)     // Catch:{ IOException -> 0x0087 }
            if (r1 == 0) goto L_0x0092
            java.io.InputStream r0 = r1.getInputStream()     // Catch:{ IOException -> 0x0087 }
            if (r0 == 0) goto L_0x0092
            java.io.InputStream r1 = r1.getInputStream()     // Catch:{ IOException -> 0x0087 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0087 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0087 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0087 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0087 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x0087 }
            r4.<init>()     // Catch:{ IOException -> 0x0087 }
            r3 = 0
            r1 = 0
        L_0x0058:
            java.lang.String r0 = r2.readLine()     // Catch:{ IOException -> 0x0087 }
            if (r0 == 0) goto L_0x0069
            r4.add(r0)     // Catch:{ IOException -> 0x0087 }
            int r0 = r0.length()     // Catch:{ IOException -> 0x0087 }
            int r1 = r1 + r0
            int r1 = r1 + 1
            goto L_0x0058
        L_0x0069:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0087 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0087 }
        L_0x006e:
            int r0 = r4.size()     // Catch:{ IOException -> 0x0085 }
            if (r3 >= r0) goto L_0x0091
            java.lang.Object r0 = r4.get(r3)     // Catch:{ IOException -> 0x0085 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x0085 }
            r2.append(r0)     // Catch:{ IOException -> 0x0085 }
            java.lang.String r0 = "\n"
            r2.append(r0)     // Catch:{ IOException -> 0x0085 }
            int r3 = r3 + 1
            goto L_0x006e
        L_0x0085:
            r1 = move-exception
            goto L_0x0089
        L_0x0087:
            r1 = move-exception
            r2 = r6
        L_0x0089:
            X.C04790Pd.A00()
            java.lang.String r0 = "ErrorReportingCheck.collectLogcat could not retrieve data."
            X.AnonymousClass0LU.A0E(r5, r0, r1)
        L_0x0091:
            r6 = r2
        L_0x0092:
            if (r6 != 0) goto L_0x0097
            java.lang.String r0 = ""
            return r0
        L_0x0097:
            java.lang.String r0 = r6.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.errorreporting.lacrima.common.IDxLProviderShape25S0000000_I2.A00():java.lang.Object");
    }
}
