package com.facebook.redex;

import java.io.FileFilter;

public class IDxFFilterShape519S0100000_I2 implements FileFilter {
    public Object A00;
    public final int A01;

    public IDxFFilterShape519S0100000_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0083, code lost:
        r0 = r1.endsWith(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b3, code lost:
        r0 = r2.startsWith(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b7, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean accept(java.io.File r4) {
        /*
            r3 = this;
            int r0 = r3.A01
            switch(r0) {
                case 0: goto L_0x0010;
                case 1: goto L_0x001d;
                case 2: goto L_0x002a;
                case 3: goto L_0x0035;
                case 4: goto L_0x0048;
                case 5: goto L_0x0071;
                case 6: goto L_0x0088;
                case 7: goto L_0x009b;
                case 8: goto L_0x00bd;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r1 = r4.getName()
            java.lang.String r0 = "cpu[0-9]+"
            boolean r0 = r1.matches(r0)
            return r0
        L_0x0010:
            java.lang.String r1 = r4.getName()
            java.lang.String r0 = "MultiDex.lock"
            boolean r0 = r1.equals(r0)
            r0 = r0 ^ 1
            return r0
        L_0x001d:
            boolean r0 = r4.isDirectory()
            if (r0 != 0) goto L_0x00b9
            java.lang.String r1 = r4.getName()
            java.lang.String r0 = "_attach.txt"
            goto L_0x0083
        L_0x002a:
            java.lang.String r1 = r4.getName()
            java.lang.String r0 = ".dmp"
            boolean r0 = r1.endsWith(r0)
            return r0
        L_0x0035:
            java.lang.String r1 = r4.getName()
            java.lang.String r0 = "anr_report_"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x00bb
            java.lang.String r1 = r4.getName()
            java.lang.String r0 = ".dmp"
            goto L_0x0083
        L_0x0048:
            java.lang.Object r2 = r3.A00
            X.0ND r2 = (X.AnonymousClass0ND) r2
            if (r4 == 0) goto L_0x00bb
            java.lang.String r1 = r4.getName()
            java.lang.String r0 = r2.A00
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x005e
            X.0ND r0 = X.AnonymousClass0ND.LARGE_REPORT
            if (r2 != r0) goto L_0x00bb
        L_0x005e:
            java.lang.String r1 = r4.getName()
            java.lang.String r0 = "suppl_"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x00bb
            java.lang.String r1 = r4.getName()
            java.lang.String r0 = "_prop.txt"
            goto L_0x0083
        L_0x0071:
            java.lang.String r1 = r4.getName()
            java.lang.String r0 = "large_"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x00bb
            java.lang.String r1 = r4.getName()
            java.lang.String r0 = "_anr_prop.txt"
        L_0x0083:
            boolean r0 = r1.endsWith(r0)
            goto L_0x00b7
        L_0x0088:
            java.lang.Object r1 = r3.A00
            X.0ND r1 = (X.AnonymousClass0ND) r1
            if (r4 == 0) goto L_0x00bb
            boolean r0 = r4.isDirectory()
            if (r0 == 0) goto L_0x00bb
            java.lang.String r2 = r4.getName()
            java.lang.String r0 = r1.A00
            goto L_0x00b3
        L_0x009b:
            boolean r0 = r4.isDirectory()
            if (r0 == 0) goto L_0x00bb
            java.lang.String r1 = r4.getName()
            java.lang.String r0 = "session_"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x00b9
            java.lang.String r2 = r4.getName()
            java.lang.String r0 = "sess_"
        L_0x00b3:
            boolean r0 = r2.startsWith(r0)
        L_0x00b7:
            if (r0 == 0) goto L_0x00bb
        L_0x00b9:
            r0 = 1
            return r0
        L_0x00bb:
            r0 = 0
            return r0
        L_0x00bd:
            boolean r0 = r4.isFile()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxFFilterShape519S0100000_I2.accept(java.io.File):boolean");
    }
}
