package X;

/* renamed from: X.4Fm  reason: invalid class name and case insensitive filesystem */
public final class C70624Fm implements C85894vw {
    public final String BLz() {
        return "client_definition_validator_timing";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (r0.longValue() > r16) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        if (r3 != null) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        r0 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
        if (r0 == null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0022, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        if (r0.longValue() > r16) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        if (r7 == null) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        if (r7.longValue() >= (r16 - r18)) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        if (r6 == null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        if (r5 == null) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003e, code lost:
        if (r8 == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        if (r4 == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0042, code lost:
        if (r7 == null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0044, code lost:
        if (r0 == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004a, code lost:
        return X.C62573aJ.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004b, code lost:
        if (r5 != null) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004d, code lost:
        if (r7 == null) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004f, code lost:
        if (r0 != false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0051, code lost:
        r2 = "Promotion doesn't qualify based on the specified ttl";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0058, code lost:
        r2 = "Promotion timing specification is invalid";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x005b, code lost:
        r2 = "Promotion outside required start and end time";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0064, code lost:
        return new X.C62573aJ(r2, false, true);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C62573aJ DAL(android.content.Context r10, com.instagram.quickpromotion.intf.QuickPromotionSurface r11, X.C57833Cq r12, com.instagram.service.session.UserSession r13, java.util.Set r14, java.util.Set r15, long r16, long r18) {
        /*
            r9 = this;
            X.38p r3 = r12.A01
            if (r3 == 0) goto L_0x0056
            java.lang.Long r6 = r3.A01
        L_0x0006:
            if (r3 == 0) goto L_0x0054
            java.lang.Long r5 = r3.A00
        L_0x000a:
            java.lang.Long r7 = r12.A03
            if (r3 == 0) goto L_0x001b
            java.lang.Long r0 = r3.A01
            if (r0 == 0) goto L_0x001b
            long r1 = r0.longValue()
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            r8 = 1
            if (r0 <= 0) goto L_0x001e
        L_0x001b:
            r8 = 0
            if (r3 == 0) goto L_0x002b
        L_0x001e:
            java.lang.Long r0 = r3.A00
            if (r0 == 0) goto L_0x002b
            long r1 = r0.longValue()
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            r4 = 1
            if (r0 > 0) goto L_0x002c
        L_0x002b:
            r4 = 0
        L_0x002c:
            if (r7 == 0) goto L_0x0039
            long r2 = r7.longValue()
            long r16 = r16 - r18
            int r1 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            r0 = 1
            if (r1 >= 0) goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            if (r6 == 0) goto L_0x004b
            if (r5 == 0) goto L_0x0058
            if (r8 == 0) goto L_0x005b
            if (r4 == 0) goto L_0x005b
            if (r7 == 0) goto L_0x0046
            if (r0 == 0) goto L_0x005b
        L_0x0046:
            X.3aJ r3 = X.C62573aJ.A00()
            return r3
        L_0x004b:
            if (r5 != 0) goto L_0x0058
            if (r7 == 0) goto L_0x0058
            if (r0 != 0) goto L_0x0046
            java.lang.String r2 = "Promotion doesn't qualify based on the specified ttl"
            goto L_0x005d
        L_0x0054:
            r5 = 0
            goto L_0x000a
        L_0x0056:
            r6 = 0
            goto L_0x0006
        L_0x0058:
            java.lang.String r2 = "Promotion timing specification is invalid"
            goto L_0x005d
        L_0x005b:
            java.lang.String r2 = "Promotion outside required start and end time"
        L_0x005d:
            r1 = 0
            r0 = 1
            X.3aJ r3 = new X.3aJ
            r3.<init>(r2, r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70624Fm.DAL(android.content.Context, com.instagram.quickpromotion.intf.QuickPromotionSurface, X.3Cq, com.instagram.service.session.UserSession, java.util.Set, java.util.Set, long, long):X.3aJ");
    }
}
