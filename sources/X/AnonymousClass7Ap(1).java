package X;

/* renamed from: X.7Ap  reason: invalid class name */
public final class AnonymousClass7Ap {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1.A0A == null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.graphics.Region r6, X.AnonymousClass7HT r7, X.AnonymousClass7HT r8, java.util.Map r9) {
        /*
            X.7Y3 r1 = r8.A03
            boolean r0 = r1.A0N
            r4 = 1
            if (r0 == 0) goto L_0x000c
            X.8nO r0 = r1.A0A
            r2 = 0
            if (r0 != 0) goto L_0x000d
        L_0x000c:
            r2 = 1
        L_0x000d:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0019
            int r1 = r8.A02
            int r0 = r7.A02
            if (r1 != r0) goto L_0x001f
        L_0x0019:
            if (r2 == 0) goto L_0x0020
            boolean r0 = r8.A01
            if (r0 != 0) goto L_0x0020
        L_0x001f:
            return
        L_0x0020:
            X.7F6 r0 = r8.A05()
            float r0 = r0.A01
            int r3 = X.AnonymousClass8bA.A02(r0)
            X.7F6 r0 = r8.A05()
            float r0 = r0.A03
            int r2 = X.AnonymousClass8bA.A02(r0)
            X.7F6 r0 = r8.A05()
            float r0 = r0.A02
            int r1 = X.AnonymousClass8bA.A02(r0)
            X.7F6 r0 = r8.A05()
            float r0 = r0.A00
            int r0 = X.AnonymousClass8bA.A02(r0)
            android.graphics.Rect r5 = X.C86164wN.A0F(r3, r2, r1, r0)
            android.graphics.Region r1 = new android.graphics.Region
            r1.<init>()
            r1.set(r5)
            int r2 = r8.A02
            int r0 = r7.A02
            r3 = -1
            if (r2 != r0) goto L_0x005c
            r2 = -1
        L_0x005c:
            android.graphics.Region$Op r0 = android.graphics.Region.Op.INTERSECT
            boolean r0 = r1.op(r6, r1, r0)
            if (r0 == 0) goto L_0x008d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            android.graphics.Rect r1 = r1.getBounds()
            X.C04220Ms.A06(r1)
            X.6fi r0 = new X.6fi
            r0.<init>(r1, r8)
            r9.put(r2, r0)
            java.util.List r2 = r8.A0A()
            int r1 = X.C86144wL.A0C(r2, r4)
        L_0x007f:
            if (r3 >= r1) goto L_0x00c9
            java.lang.Object r0 = r2.get(r1)
            X.7HT r0 = (X.AnonymousClass7HT) r0
            A01(r6, r7, r0, r9)
            int r1 = r1 + -1
            goto L_0x007f
        L_0x008d:
            boolean r0 = r8.A01
            if (r0 == 0) goto L_0x00bb
            X.7HT r1 = r8.A08()
            if (r1 == 0) goto L_0x00b2
            X.7Y3 r0 = r1.A03
            boolean r0 = r0.A0N
            if (r0 != r4) goto L_0x00b2
            X.7F6 r3 = r1.A03()
        L_0x00a1:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            android.graphics.Rect r1 = X.AnonymousClass7F6.A00(r3)
        L_0x00a9:
            X.6fi r0 = new X.6fi
            r0.<init>(r1, r8)
            r9.put(r2, r0)
            return
        L_0x00b2:
            r1 = 0
            r0 = 1092616192(0x41200000, float:10.0)
            X.7F6 r3 = new X.7F6
            r3.<init>(r1, r1, r0, r0)
            goto L_0x00a1
        L_0x00bb:
            if (r2 != r3) goto L_0x001f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            android.graphics.Rect r1 = r1.getBounds()
            X.C04220Ms.A06(r1)
            goto L_0x00a9
        L_0x00c9:
            android.graphics.Region$Op r0 = android.graphics.Region.Op.REVERSE_DIFFERENCE
            r6.op(r5, r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7Ap.A01(android.graphics.Region, X.7HT, X.7HT, java.util.Map):void");
    }

    public static final AnonymousClass7Y3 A00(AnonymousClass7Y3 r1, AnonymousClass0YY r2) {
        do {
            r1 = r1.A09();
            if (r1 == null) {
                return null;
            }
        } while (!AnonymousClass0wJ.A1X(r2.invoke(r1)));
        return r1;
    }

    public static final boolean A02(AnonymousClass7HT r1) {
        return C18220wO.A1U(C115946wA.A01(r1.A07(), C103986b3.A03));
    }
}
