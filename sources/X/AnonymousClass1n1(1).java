package X;

/* renamed from: X.1n1  reason: invalid class name */
public final class AnonymousClass1n1 extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1n1(C697249u r7) {
        super("runFBReauth", 370, 5, false, false);
        this.A00 = r7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        r6 = (X.AnonymousClass148) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001c, code lost:
        r1 = (X.AnonymousClass148) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void loggedRun() {
        /*
            r12 = this;
            X.49u r0 = r12.A00
            android.content.Context r3 = r0.A05
            com.instagram.service.session.UserSession r8 = r0.A06
            boolean r2 = X.AnonymousClass0wJ.A1Y(r3, r8)
            boolean r0 = X.C120647Bw.A00()
            if (r0 != 0) goto L_0x0041
            java.lang.String r0 = r8.getUserId()
            X.3aO r1 = X.C62603aO.A01(r0)
            boolean r0 = r1 instanceof X.AnonymousClass147
            if (r0 != 0) goto L_0x0033
            X.148 r1 = (X.AnonymousClass148) r1
            com.facebook.AccessToken r9 = r1.A00
            if (r9 == 0) goto L_0x0033
            X.3kN r0 = r1.A01
            if (r0 != 0) goto L_0x0033
            long r10 = java.lang.System.currentTimeMillis()
            java.lang.Integer r0 = r9.A00
            int r0 = r0.intValue()
            switch(r0) {
                case 1: goto L_0x0042;
                case 2: goto L_0x0042;
                case 3: goto L_0x0042;
                case 4: goto L_0x0042;
                case 5: goto L_0x0033;
                case 6: goto L_0x0042;
                case 7: goto L_0x0042;
                case 8: goto L_0x0042;
                default: goto L_0x0033;
            }
        L_0x0033:
            android.content.Context r0 = r3.getApplicationContext()
            X.1jG r1 = new X.1jG
            r1.<init>(r0)
            java.lang.Void[] r0 = new java.lang.Void[r2]
            r1.A02(r0)
        L_0x0041:
            return
        L_0x0042:
            java.util.Date r0 = r1.A02
            long r0 = r0.getTime()
            long r6 = r10 - r0
            r4 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0033
            java.util.Date r0 = r9.A05
            long r0 = r0.getTime()
            long r10 = r10 - r0
            r4 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0033
            java.lang.String r0 = r8.getUserId()
            X.3aO r6 = X.C62603aO.A01(r0)
            X.2r3 r4 = new X.2r3
            r4.<init>()
            boolean r0 = r6 instanceof X.AnonymousClass147
            if (r0 != 0) goto L_0x0033
            X.148 r6 = (X.AnonymousClass148) r6
            com.facebook.AccessToken r1 = r6.A00
            if (r1 == 0) goto L_0x0033
            java.lang.String r0 = r6.A05
            X.3kN r5 = new X.3kN
            r5.<init>(r1, r6, r4, r0)
            r6.A01 = r5
            android.content.Context r6 = X.C60943Re.A00
            java.util.List r0 = X.AnonymousClass3XO.A02
            java.util.Iterator r7 = r0.iterator()
        L_0x0087:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00d6
            java.lang.Object r1 = r7.next()
            X.3Wu r1 = (X.C62023Wu) r1
            android.content.Intent r4 = X.C18230wP.A0B()
            boolean r0 = r1 instanceof X.C207816b
            if (r0 == 0) goto L_0x00cc
            java.lang.String r1 = "com.facebook.wakizashi"
        L_0x009d:
            java.lang.String r0 = "com.facebook.katana.platform.TokenRefreshService"
            android.content.Intent r4 = r4.setClassName(r1, r0)
            if (r4 == 0) goto L_0x0087
            android.content.pm.PackageManager r1 = r6.getPackageManager()
            r0 = 0
            android.content.pm.ResolveInfo r0 = r1.resolveService(r4, r0)
            if (r0 == 0) goto L_0x0087
            android.content.pm.ServiceInfo r0 = r0.serviceInfo
            java.lang.String r0 = r0.packageName
            boolean r0 = X.C62023Wu.A00(r6, r0)
            if (r0 == 0) goto L_0x0087
            r0 = 1
            boolean r0 = r6.bindService(r4, r5, r0)
            if (r0 == 0) goto L_0x00d6
            X.148 r1 = r5.A03
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            r1.A02 = r0
            goto L_0x0033
        L_0x00cc:
            boolean r0 = r1 instanceof X.C207716a
            if (r0 == 0) goto L_0x00d3
            java.lang.String r1 = "com.facebook.orca"
            goto L_0x009d
        L_0x00d3:
            java.lang.String r1 = "com.facebook.katana"
            goto L_0x009d
        L_0x00d6:
            X.148 r1 = r5.A03
            X.3kN r0 = r1.A01
            if (r0 != r5) goto L_0x0033
            r0 = 0
            r1.A01 = r0
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1n1.loggedRun():void");
    }
}
