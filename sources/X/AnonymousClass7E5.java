package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.7E5  reason: invalid class name */
public final class AnonymousClass7E5 {
    public final C121187Eo A00;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        if (r0.length() == 0) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(android.view.View r13) {
        /*
            r12 = this;
            r5 = r13
            android.content.Context r4 = r13.getContext()
            X.7Eo r3 = r12.A00
            java.lang.Integer r0 = r3.A03
            if (r0 == 0) goto L_0x0012
            int r0 = r0.intValue()
            r13.setAccessibilityTraversalAfter(r0)
        L_0x0012:
            boolean r0 = r3.A04
            r9 = 0
            if (r0 == 0) goto L_0x0062
            java.lang.Integer r6 = r3.A02
            X.8n6 r0 = r3.A00
            if (r0 == 0) goto L_0x0060
            X.C04220Ms.A06(r4)
            java.lang.CharSequence r0 = r0.BEM(r4)
            if (r0 == 0) goto L_0x0060
            java.lang.String r7 = r0.toString()
        L_0x002a:
            X.8n6 r0 = r3.A00
            if (r0 == 0) goto L_0x003e
            X.C04220Ms.A06(r4)
            java.lang.CharSequence r0 = r0.BEM(r4)
            if (r0 == 0) goto L_0x003e
            int r0 = r0.length()
            r11 = 0
            if (r0 != 0) goto L_0x003f
        L_0x003e:
            r11 = 1
        L_0x003f:
            X.8n6 r0 = r3.A01
            if (r0 == 0) goto L_0x0050
            X.C04220Ms.A06(r4)
            java.lang.CharSequence r0 = r0.BEM(r4)
            if (r0 == 0) goto L_0x0050
            java.lang.String r9 = r0.toString()
        L_0x0050:
            boolean r10 = r3.A06
            r8 = 0
            r0 = 1
            X.C04220Ms.A0B(r6, r0)
            X.55g r4 = new X.55g
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            X.C006702y.A0C(r13, r4)
            return
        L_0x0060:
            r7 = r9
            goto L_0x002a
        L_0x0062:
            java.lang.Integer r2 = r3.A02
            r1 = 0
            X.8n6 r0 = r3.A01
            if (r0 == 0) goto L_0x0076
            X.C04220Ms.A06(r4)
            java.lang.CharSequence r0 = r0.BEM(r4)
            if (r0 == 0) goto L_0x0076
            java.lang.String r9 = r0.toString()
        L_0x0076:
            boolean r0 = r3.A05
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.C116836xd.A00(r13, r0, r2, r1, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7E5.A02(android.view.View):void");
    }

    public static void A00(C121187Eo r1, C109776kb r2) {
        r2.A01 = new AnonymousClass7E5(r1);
    }

    public static void A01(C121187Eo r1, AnonymousClass5iR r2, ImmutableList.Builder builder) {
        r2.A02 = new AnonymousClass7E5(r1);
        builder.add((Object) new C92465iX(r2));
    }

    public AnonymousClass7E5(C121187Eo r1) {
        this.A00 = r1;
    }
}
