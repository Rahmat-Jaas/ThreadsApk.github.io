package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.3F9  reason: invalid class name */
public final class AnonymousClass3F9 {
    public String A00;
    public final C131607sT A01;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r2.equals("platform_ios") != false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
        if (r2.equals("platform_android") == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(java.lang.String r2) {
        /*
            r1 = this;
            r0 = 0
            X.C04220Ms.A0B(r2, r0)
            java.lang.String r0 = r1.A00
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x001b
            int r0 = r2.hashCode()
            switch(r0) {
                case -353984973: goto L_0x001c;
                case 155893313: goto L_0x0028;
                case 600515235: goto L_0x0031;
                default: goto L_0x0013;
            }
        L_0x0013:
            X.7sT r0 = r1.A01
            X.7ek r0 = r0.A00
            monitor-enter(r0)
            monitor-exit(r0)
        L_0x0019:
            r1.A00 = r2
        L_0x001b:
            return
        L_0x001c:
            java.lang.String r0 = "start_funnel"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0013
            java.lang.System.currentTimeMillis()
            goto L_0x0013
        L_0x0028:
            java.lang.String r0 = "platform_ios"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0013
            goto L_0x0019
        L_0x0031:
            java.lang.String r0 = "platform_android"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0019
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3F9.A00(java.lang.String):void");
    }

    public AnonymousClass3F9(UserSession userSession) {
        userSession.getUserId();
        C131607sT A002 = C131607sT.A00(userSession);
        C04220Ms.A06(A002);
        this.A01 = A002;
        C126197ek r0 = A002.A00;
        userSession.getUserId();
        synchronized (r0) {
        }
    }
}
