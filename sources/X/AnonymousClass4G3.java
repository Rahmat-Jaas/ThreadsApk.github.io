package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.4G3  reason: invalid class name */
public final class AnonymousClass4G3 implements C82884qQ {
    public final UserSession A00;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0056, code lost:
        if (r9 <= r1) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0058, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006e, code lost:
        if (X.C696349j.A03(r6).A0G() < X.C63803iN.A03(X.AnonymousClass0TJ.A06, r6, 36597609604057785L)) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0070, code lost:
        if (r5 == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0087, code lost:
        if (((java.lang.System.currentTimeMillis() / 1000) - (X.AnonymousClass3WS.A01(r6).A0D() / 1000)) >= com.instagram.debug.devoptions.sandboxselector.SandboxRepository.CACHE_TTL) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008d, code lost:
        if (r3 <= r9) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0090, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0052, code lost:
        if (r9 < r3) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean CW4(X.C58743Gz r12) {
        /*
            r11 = this;
            X.3am r5 = X.C63043bN.A01
            com.instagram.service.session.UserSession r6 = r11.A00
            long r3 = r5.A05(r6)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0089
            android.content.SharedPreferences r1 = X.C28161tl.A04(r6)
            java.lang.String r0 = "take_a_break_nudge_last_seen_count"
            int r0 = X.C18190wL.A04(r1, r0)
            long r7 = (long) r0
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36597609604123322(0x82055500150aba, double:3.207813908168431E-306)
            long r3 = X.C63803iN.A03(r2, r6, r0)
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0089
            boolean r0 = r5.A08(r6)
            if (r0 != 0) goto L_0x0089
            long r9 = java.lang.System.currentTimeMillis()
            long r0 = X.AnonymousClass0wJ.A0A()
            long r9 = r9 - r0
            r7 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 / r7
            r0 = 36597609603992248(0x82055500130ab8, double:3.207813908085539E-306)
            long r3 = X.C63803iN.A03(r2, r6, r0)
            r0 = 36597609603926711(0x82055500120ab7, double:3.2078139080440933E-306)
            long r1 = X.C63803iN.A03(r2, r6, r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x008b
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0058
        L_0x0054:
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0090
        L_0x0058:
            r5 = 1
        L_0x0059:
            X.49j r0 = X.C696349j.A03(r6)
            long r3 = r0.A0G()
            X.0TJ r2 = X.AnonymousClass0TJ.A06
            r0 = 36597609604057785(0x82055500140ab9, double:3.207813908126985E-306)
            long r1 = X.C63803iN.A03(r2, r6, r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0089
            if (r5 == 0) goto L_0x0089
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 / r7
            X.1tl r0 = X.AnonymousClass3WS.A01(r6)
            long r0 = r0.A0D()
            long r0 = r0 / r7
            long r3 = r3 - r0
            r1 = 86400(0x15180, double:4.26873E-319)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 1
            if (r0 >= 0) goto L_0x008a
        L_0x0089:
            r1 = 0
        L_0x008a:
            return r1
        L_0x008b:
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x0090
            goto L_0x0054
        L_0x0090:
            r5 = 0
            goto L_0x0059
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4G3.CW4(X.3Gz):boolean");
    }

    public AnonymousClass4G3(UserSession userSession) {
        this.A00 = userSession;
    }
}
