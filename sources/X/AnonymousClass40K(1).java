package X;

/* renamed from: X.40K  reason: invalid class name */
public final class AnonymousClass40K implements C83324rC {
    public final String DB3() {
        return "client_definition_validator_content";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        if (r3 != null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        if (r0.length() != 0) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (r1.A04 != false) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass3DC A8q(X.AnonymousClass3DQ r10, X.C81224nO r11) {
        /*
            r9 = this;
            X.AnonymousClass0wJ.A1N(r11, r10)
            X.18L r11 = (X.AnonymousClass18L) r11
            X.1u0 r5 = r11.A01
            boolean r0 = r5.A0H
            if (r0 != 0) goto L_0x00fe
            java.util.HashSet r2 = X.C18200wM.A0u()
            X.35r r0 = r11.A03
            X.1tt r8 = r0.A00
            X.3CQ r0 = r8.A01
            if (r0 == 0) goto L_0x00fb
            X.40f r3 = new X.40f
            r3.<init>(r0)
        L_0x001c:
            X.3Gy r0 = r5.A09
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "mip_banner_ig"
            boolean r0 = r1.equals(r0)
            r6 = 1
            if (r0 != 0) goto L_0x0034
            com.instagram.quickpromotion.intf.QuickPromotionSurface r1 = r5.A06
            com.instagram.quickpromotion.intf.QuickPromotionSurface r0 = com.instagram.quickpromotion.intf.QuickPromotionSurface.TOOLTIP
            if (r1 == r0) goto L_0x0034
            com.instagram.quickpromotion.intf.QuickPromotionSurface r0 = com.instagram.quickpromotion.intf.QuickPromotionSurface.FLOATING_BANNER
            if (r1 == r0) goto L_0x0034
            r6 = 0
        L_0x0034:
            java.lang.String r4 = "Primary Action url is null/empty"
            if (r6 == 0) goto L_0x005f
            if (r3 == 0) goto L_0x004d
        L_0x003a:
            X.3CQ r1 = r3.A00
            java.lang.String r0 = r1.A03
            if (r0 == 0) goto L_0x0046
            int r0 = r0.length()
            if (r0 != 0) goto L_0x004d
        L_0x0046:
            boolean r0 = r1.A04
            if (r0 != 0) goto L_0x004d
        L_0x004a:
            r2.add(r4)
        L_0x004d:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x00fe
            java.lang.String r1 = "invalidContent"
            X.40Z r0 = new X.40Z
            r0.<init>(r2, r1)
            X.3DC r0 = X.AnonymousClass3W5.A01(r0)
            return r0
        L_0x005f:
            X.1tw r0 = r8.A09
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x006d
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0072
        L_0x006d:
            java.lang.String r0 = "Title is null/empty"
            r2.add(r0)
        L_0x0072:
            boolean r0 = r5.A0J
            if (r0 != 0) goto L_0x00be
            X.3CQ r0 = r8.A01
            if (r0 == 0) goto L_0x00e2
            X.40f r7 = new X.40f
            r7.<init>(r0)
        L_0x007f:
            X.3CQ r0 = r8.A02
            if (r0 == 0) goto L_0x00e0
            X.40f r6 = new X.40f
            r6.<init>(r0)
        L_0x0088:
            X.3CQ r1 = r8.A00
            if (r1 == 0) goto L_0x00de
            X.40f r0 = new X.40f
            r0.<init>(r1)
        L_0x0091:
            X.4nP[] r0 = new X.C81234nP[]{r7, r6, r0}
            java.util.List r1 = X.C06750aI.A17(r0)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00c3
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x00c3
        L_0x00a3:
            com.instagram.quickpromotion.intf.QuickPromotionSurface r1 = r5.A06
            com.instagram.quickpromotion.intf.QuickPromotionSurface r0 = com.instagram.quickpromotion.intf.QuickPromotionSurface.BOTTOMSHEET
            if (r1 == r0) goto L_0x00be
            java.lang.String r1 = r5.A0D
            X.0Oa r0 = X.AnonymousClass31J.A00
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x00be
            java.lang.String r0 = "No button dismisses promotion"
            r2.add(r0)
        L_0x00be:
            if (r3 != 0) goto L_0x00e4
            java.lang.String r4 = "Primary Action is null"
            goto L_0x004a
        L_0x00c3:
            java.util.Iterator r1 = r1.iterator()
        L_0x00c7:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00a3
            java.lang.Object r0 = r1.next()
            X.4nP r0 = (X.C81234nP) r0
            if (r0 == 0) goto L_0x00c7
            X.40f r0 = (X.C677440f) r0
            X.3CQ r0 = r0.A00
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x00c7
            goto L_0x00be
        L_0x00de:
            r0 = 0
            goto L_0x0091
        L_0x00e0:
            r6 = 0
            goto L_0x0088
        L_0x00e2:
            r7 = 0
            goto L_0x007f
        L_0x00e4:
            X.3CQ r0 = r3.A00
            X.1tw r0 = r0.A00
            if (r0 == 0) goto L_0x00f4
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x00f4
            int r0 = r0.length()
            if (r0 != 0) goto L_0x003a
        L_0x00f4:
            java.lang.String r0 = "Primary Action title is null/empty"
            r2.add(r0)
            goto L_0x003a
        L_0x00fb:
            r3 = 0
            goto L_0x001c
        L_0x00fe:
            X.3DC r0 = X.AnonymousClass3W5.A00()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass40K.A8q(X.3DQ, X.4nO):X.3DC");
    }
}
