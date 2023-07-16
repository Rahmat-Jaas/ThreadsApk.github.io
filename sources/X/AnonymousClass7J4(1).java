package X;

import java.util.List;

/* renamed from: X.7J4  reason: invalid class name */
public final class AnonymousClass7J4 {
    public static final Object A00 = new C58823Hk("compositionLocalMap");
    public static final Object A01 = new C58823Hk("provider");
    public static final Object A02 = new C58823Hk("provider");
    public static final Object A03 = new C58823Hk("providers");
    public static final Object A04 = new C58823Hk("providerValues");
    public static final Object A05 = new C58823Hk("reference");
    public static final AnonymousClass0YM A06 = AnonymousClass8Zl.A00;
    public static final AnonymousClass0YM A07 = AnonymousClass8Zm.A00;
    public static final AnonymousClass0YM A08 = C140948Zn.A00;
    public static final AnonymousClass0YM A09 = C140958Zo.A00;
    public static final AnonymousClass0YM A0A = C140968Zp.A00;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004a, code lost:
        r2 = (X.AnonymousClass7WO) r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C142838fg r5, X.C122137Ks r6) {
        /*
            r4 = 0
            int[] r3 = r6.A0E
            int r2 = r6.A00
            int r0 = X.C122137Ks.A01(r6, r2)
            int r1 = X.C122137Ks.A03(r6, r3, r0)
            int r0 = X.C86154wM.A03(r0, r3)
            int r2 = r2 + r0
            int r0 = X.C122137Ks.A02(r6, r3, r2)
            X.844 r3 = new X.844
            r3.<init>(r6, r1, r0)
        L_0x001b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x005b
            java.lang.Object r2 = r3.next()
            boolean r0 = r2 instanceof X.C145718ky
            if (r0 == 0) goto L_0x003c
            r1 = r5
            X.7WI r1 = (X.AnonymousClass7WI) r1
            X.C04220Ms.A0B(r2, r4)
            java.util.List r0 = r1.A01
            if (r0 != 0) goto L_0x0039
            java.util.ArrayList r0 = X.AnonymousClass0wJ.A0v()
            r1.A01 = r0
        L_0x0039:
            r0.add(r2)
        L_0x003c:
            boolean r0 = r2 instanceof X.C145728kz
            if (r0 == 0) goto L_0x0046
            r0 = r2
            X.8kz r0 = (X.C145728kz) r0
            r5.ANW(r0)
        L_0x0046:
            boolean r0 = r2 instanceof X.AnonymousClass7WO
            if (r0 == 0) goto L_0x001b
            X.7WO r2 = (X.AnonymousClass7WO) r2
            X.7W5 r1 = r2.A03
            if (r1 == 0) goto L_0x001b
            r0 = 1
            r1.A04 = r0
            r0 = 0
            r2.A03 = r0
            r2.A04 = r0
            r2.A05 = r0
            goto L_0x001b
        L_0x005b:
            r6.A0T()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7J4.A01(X.8fg, X.7Ks):void");
    }

    public static final void A02(String str) {
        C04220Ms.A0B(str, 0);
        throw new C97666Ch(AnonymousClass00U.A0V("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void A04(boolean z) {
        if (!z) {
            A02("Check failed");
            throw null;
        }
    }

    public static final int A00(List list, int i) {
        int A0B = C86104wH.A0B(list);
        int i2 = 0;
        while (i2 <= A0B) {
            int i3 = (i2 + A0B) >>> 1;
            int A002 = C04220Ms.A00(((C108556iY) list.get(i3)).A01, i);
            if (A002 < 0) {
                i2 = i3 + 1;
            } else if (A002 <= 0) {
                return i3;
            } else {
                A0B = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final void A03(List list, int i, int i2) {
        int A002 = A00(list, i);
        if (A002 < 0) {
            A002 = -(A002 + 1);
        }
        while (A002 < list.size() && ((C108556iY) list.get(A002)).A01 < i2) {
            list.remove(A002);
        }
    }
}
