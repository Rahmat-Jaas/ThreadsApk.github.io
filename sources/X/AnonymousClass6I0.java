package X;

/* renamed from: X.6I0  reason: invalid class name */
public final class AnonymousClass6I0 {
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008c, code lost:
        r2 = java.util.concurrent.TimeUnit.DAYS;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00cb, code lost:
        return new X.C112146p4(r2.toMillis(7), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f7, code lost:
        return new X.C112146p4(r3, X.C86164wN.A09(r5, r2, r6, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        throw X.C18180wK.A0a(X.AnonymousClass00U.A0L(r6, X.AnonymousClass000.A00(17)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C112146p4 A00(java.lang.String r6) {
        /*
            r0 = 0
            X.C04220Ms.A0B(r6, r0)
            int r0 = r6.hashCode()
            switch(r0) {
                case -1967750339: goto L_0x001a;
                case -1965127950: goto L_0x002a;
                case -1718308886: goto L_0x004e;
                case -1407726477: goto L_0x0071;
                case -756353034: goto L_0x0082;
                case -134728948: goto L_0x008f;
                case 1821777447: goto L_0x00b2;
                case 1841909060: goto L_0x00cc;
                default: goto L_0x000b;
            }
        L_0x000b:
            r0 = 17
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = X.AnonymousClass00U.A0L(r6, r0)
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x001a:
            java.lang.String r0 = "NETWORK_ONLY"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x000b
            r0 = 0
            X.6p4 r2 = new X.6p4
            r2.<init>(r0, r0)
            return r2
        L_0x002a:
            java.lang.String r0 = "APP_START_CREDENTIAL"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MINUTES
            com.instagram.service.session.UserSession r2 = X.AnonymousClass7HK.A00()
            X.0TJ r5 = X.AnonymousClass0TJ.A05
            r0 = 36597729862421217(0x82057100090ae1, double:3.207889960000261E-306)
            long r3 = X.C86164wN.A09(r5, r2, r6, r0)
            com.instagram.service.session.UserSession r2 = X.AnonymousClass7HK.A00()
            r0 = 36597729862355680(0x82057100080ae0, double:3.207889959958815E-306)
            goto L_0x00ee
        L_0x004e:
            java.lang.String r0 = "PRODUCT_SDK_DEFAULT_COMPONENT"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MINUTES
            com.instagram.service.session.UserSession r2 = X.AnonymousClass7HK.A00()
            X.0TJ r5 = X.AnonymousClass0TJ.A05
            r0 = 36597729862290143(0x82057100070adf, double:3.207889959917369E-306)
            long r3 = X.C86164wN.A09(r5, r2, r6, r0)
            com.instagram.service.session.UserSession r2 = X.AnonymousClass7HK.A00()
            r0 = 36597729861962460(0x82057100020adc, double:3.207889959710141E-306)
            goto L_0x00ee
        L_0x0071:
            java.lang.String r0 = "PERSISTENT_UP_TO_5_MINS"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MINUTES
            r0 = 5
            long r3 = r2.toMillis(r0)
            goto L_0x008c
        L_0x0082:
            java.lang.String r0 = "PERSISTENT_UP_TO_DATE"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x000b
            r3 = 0
        L_0x008c:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS
            goto L_0x00c0
        L_0x008f:
            java.lang.String r0 = "PRODUCT_SDK_CREDENTIAL"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MINUTES
            com.instagram.service.session.UserSession r2 = X.AnonymousClass7HK.A00()
            X.0TJ r5 = X.AnonymousClass0TJ.A05
            r0 = 36597729862224606(0x82057100060ade, double:3.2078899598759234E-306)
            long r3 = X.C86164wN.A09(r5, r2, r6, r0)
            com.instagram.service.session.UserSession r2 = X.AnonymousClass7HK.A00()
            r0 = 36597729861896923(0x82057100010adb, double:3.2078899596686954E-306)
            goto L_0x00ee
        L_0x00b2:
            java.lang.String r0 = "HIGHLY_PERSISTENT"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS
            long r3 = X.C86154wM.A08(r2)
        L_0x00c0:
            r0 = 7
            long r0 = r2.toMillis(r0)
            X.6p4 r2 = new X.6p4
            r2.<init>(r0, r3)
            return r2
        L_0x00cc:
            java.lang.String r0 = "APP_START_DEFAULT_COMPONENT"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MINUTES
            com.instagram.service.session.UserSession r2 = X.AnonymousClass7HK.A00()
            X.0TJ r5 = X.AnonymousClass0TJ.A05
            r0 = 36597729862159069(0x82057100050add, double:3.2078899598344776E-306)
            long r3 = X.C86164wN.A09(r5, r2, r6, r0)
            com.instagram.service.session.UserSession r2 = X.AnonymousClass7HK.A00()
            r0 = 36597729861831386(0x82057100000ada, double:3.2078899596272495E-306)
        L_0x00ee:
            long r0 = X.C86164wN.A09(r5, r2, r6, r0)
            X.6p4 r2 = new X.6p4
            r2.<init>(r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6I0.A00(java.lang.String):X.6p4");
    }
}
