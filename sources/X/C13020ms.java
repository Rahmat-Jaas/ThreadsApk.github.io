package X;

/* renamed from: X.0ms  reason: invalid class name and case insensitive filesystem */
public final class C13020ms implements C13310nP {
    public final AnonymousClass068 A00;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r0.isConnected() == false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean CsB(java.util.Map r7) {
        /*
            r6 = this;
            X.068 r1 = r6.A00
            android.net.NetworkInfo r0 = r1.A01()
            if (r0 == 0) goto L_0x000f
            boolean r0 = r0.isConnected()
            r5 = 1
            if (r0 != 0) goto L_0x001d
        L_0x000f:
            r5 = 0
            android.net.NetworkInfo r4 = r1.A01()
            java.lang.String r3 = "MqttNetworkManagerMonitor"
            if (r4 != 0) goto L_0x001e
            java.lang.String r0 = "no_info"
        L_0x001a:
            r7.put(r3, r0)
        L_0x001d:
            return r5
        L_0x001e:
            int r0 = r4.getType()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r0 = r4.getSubtype()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            android.net.NetworkInfo$State r0 = r4.getState()
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r1, r0}
            java.lang.String r1 = "%s_%s_%s"
            r0 = 0
            java.lang.String r0 = java.lang.String.format(r0, r1, r2)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13020ms.CsB(java.util.Map):boolean");
    }

    public C13020ms(AnonymousClass068 r1) {
        this.A00 = r1;
    }
}
