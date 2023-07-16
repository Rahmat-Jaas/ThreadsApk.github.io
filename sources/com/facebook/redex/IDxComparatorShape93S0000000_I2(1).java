package com.facebook.redex;

import java.util.Comparator;

public class IDxComparatorShape93S0000000_I2 implements Comparator {
    public final int A00;

    public IDxComparatorShape93S0000000_I2(int i) {
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d7, code lost:
        return r5 - r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return r7.compareTo(r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ int compare(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x00ce;
                case 1: goto L_0x0028;
                case 2: goto L_0x00b3;
                case 3: goto L_0x00a4;
                case 4: goto L_0x009a;
                case 5: goto L_0x008c;
                case 6: goto L_0x0066;
                case 7: goto L_0x00aa;
                case 8: goto L_0x0016;
                default: goto L_0x0005;
            }
        L_0x0005:
            android.content.pm.ResolveInfo r7 = (android.content.pm.ResolveInfo) r7
            android.content.pm.ResolveInfo r8 = (android.content.pm.ResolveInfo) r8
            android.content.pm.ActivityInfo r0 = r7.activityInfo
            java.lang.String r7 = r0.packageName
            android.content.pm.ActivityInfo r0 = r8.activityInfo
            java.lang.String r8 = r0.packageName
        L_0x0011:
            int r5 = r7.compareTo(r8)
        L_0x0015:
            return r5
        L_0x0016:
            java.io.File r7 = (java.io.File) r7
            java.io.File r8 = (java.io.File) r8
            long r3 = r7.lastModified()
            long r1 = r8.lastModified()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x005f
            r5 = -1
            return r5
        L_0x0028:
            java.io.File r7 = (java.io.File) r7
            java.io.File r8 = (java.io.File) r8
            long r3 = r7.lastModified()
            long r1 = r8.lastModified()
            r5 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0052
            java.lang.String r3 = r7.getName()
            java.lang.String r2 = r8.getName()
            int r1 = r3.length()
            int r0 = r2.length()
            if (r1 > r0) goto L_0x0015
            if (r0 > r1) goto L_0x0064
            int r5 = r2.compareTo(r3)
            return r5
        L_0x0052:
            long r3 = r7.lastModified()
            long r1 = r8.lastModified()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0064
            return r5
        L_0x005f:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r5 = 0
            if (r0 == 0) goto L_0x0015
        L_0x0064:
            r5 = 1
            return r5
        L_0x0066:
            java.io.File r7 = (java.io.File) r7
            java.io.File r8 = (java.io.File) r8
            java.lang.String r0 = r7.getName()
            java.lang.String r1 = "session_"
            boolean r0 = r0.startsWith(r1)
            r5 = r0 ^ 1
            java.lang.String r0 = r8.getName()
            boolean r0 = r0.startsWith(r1)
            r0 = r0 ^ 1
            int r5 = r5 - r0
            if (r5 != 0) goto L_0x0015
            java.lang.String r7 = r7.getName()
            java.lang.String r8 = r8.getName()
            goto L_0x0011
        L_0x008c:
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            java.lang.String r7 = r7.getName()
            java.lang.String r8 = r8.getName()
            goto L_0x0011
        L_0x009a:
            X.0Jw r7 = (X.C03600Jw) r7
            X.0Jw r8 = (X.C03600Jw) r8
            java.lang.String r7 = r7.A02
            java.lang.String r8 = r8.A02
            goto L_0x0011
        L_0x00a4:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x0011
        L_0x00aa:
            X.0UZ r7 = (X.AnonymousClass0UZ) r7
            X.0UZ r8 = (X.AnonymousClass0UZ) r8
            int r5 = r7.A01
            int r0 = r8.A01
            goto L_0x00d6
        L_0x00b3:
            android.util.Pair r7 = (android.util.Pair) r7
            android.util.Pair r8 = (android.util.Pair) r8
            java.lang.Object r0 = r7.second
            X.09R r0 = (X.AnonymousClass09R) r0
            double r4 = r0.A03
            double r0 = r0.A02
            double r4 = r4 + r0
            java.lang.Object r0 = r8.second
            X.09R r0 = (X.AnonymousClass09R) r0
            double r2 = r0.A03
            double r0 = r0.A02
            double r2 = r2 + r0
            int r5 = java.lang.Double.compare(r4, r2)
            return r5
        L_0x00ce:
            X.07I r7 = (X.AnonymousClass07I) r7
            X.07I r8 = (X.AnonymousClass07I) r8
            int r5 = r7.A04
            int r0 = r8.A04
        L_0x00d6:
            int r5 = r5 - r0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxComparatorShape93S0000000_I2.compare(java.lang.Object, java.lang.Object):int");
    }
}
