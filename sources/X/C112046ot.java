package X;

/* renamed from: X.6ot  reason: invalid class name and case insensitive filesystem */
public final class C112046ot {
    public final AnonymousClass8dF A00;
    public final C106886fn A01;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        if (X.C04220Ms.A0I(r7.A02, r15.A02) == false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass7HD r14, X.AnonymousClass7HD r15) {
        /*
            r13 = this;
            X.6fn r0 = r13.A01
            java.util.concurrent.atomic.AtomicReference r0 = r0.A01
            java.lang.Object r0 = r0.get()
            boolean r0 = X.C04220Ms.A0I(r0, r13)
            if (r0 == 0) goto L_0x007d
            X.8dF r4 = r13.A00
            X.7Z5 r4 = (X.AnonymousClass7Z5) r4
            X.7HD r7 = r4.A02
            long r0 = r7.A00
            long r2 = r15.A00
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            boolean r0 = X.C18180wK.A1W(r5)
            r6 = 0
            if (r0 == 0) goto L_0x002c
            X.7Ia r1 = r7.A02
            X.7Ia r0 = r15.A02
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            r8 = 0
            if (r0 != 0) goto L_0x002d
        L_0x002c:
            r8 = 1
        L_0x002d:
            r4.A02 = r15
            java.util.List r5 = r4.A04
            int r7 = r5.size()
            r1 = 0
        L_0x0036:
            if (r1 >= r7) goto L_0x004b
            java.lang.Object r0 = r5.get(r1)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            java.lang.Object r0 = r0.get()
            X.7S0 r0 = (X.AnonymousClass7S0) r0
            if (r0 == 0) goto L_0x0048
            r0.A02 = r15
        L_0x0048:
            int r1 = r1 + 1
            goto L_0x0036
        L_0x004b:
            boolean r0 = X.C04220Ms.A0I(r14, r15)
            if (r0 == 0) goto L_0x0080
            if (r8 == 0) goto L_0x007d
            X.8dA r5 = r4.A09
            int r6 = X.C121767Ia.A01(r2)
            int r7 = X.C121767Ia.A00(r2)
            X.7HD r0 = r4.A02
            X.7Ia r0 = r0.A02
            r9 = -1
            if (r0 == 0) goto L_0x007e
            long r0 = r0.A00
            int r8 = X.C121767Ia.A01(r0)
            int r9 = X.C121767Ia.A00(r0)
        L_0x006e:
            X.7Yy r5 = (X.C123887Yy) r5
            X.0Oa r0 = r5.A02
            java.lang.Object r4 = r0.getValue()
            android.view.inputmethod.InputMethodManager r4 = (android.view.inputmethod.InputMethodManager) r4
            android.view.View r5 = r5.A00
            r4.updateSelection(r5, r6, r7, r8, r9)
        L_0x007d:
            return
        L_0x007e:
            r8 = -1
            goto L_0x006e
        L_0x0080:
            if (r14 == 0) goto L_0x00a4
            X.7yH r0 = r14.A01
            java.lang.String r1 = r0.A00
            X.7yH r0 = r15.A01
            java.lang.String r0 = r0.A00
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x00a0
            long r0 = r14.A00
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x00a4
            X.7Ia r1 = r14.A02
            X.7Ia r0 = r15.A02
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x00a4
        L_0x00a0:
            X.AnonymousClass7Z5.A01(r4)
            return
        L_0x00a4:
            int r2 = r5.size()
        L_0x00a8:
            if (r6 >= r2) goto L_0x007d
            java.lang.Object r0 = r5.get(r6)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            java.lang.Object r1 = r0.get()
            X.7S0 r1 = (X.AnonymousClass7S0) r1
            if (r1 == 0) goto L_0x0104
            X.7HD r8 = r4.A02
            X.8dA r3 = r4.A09
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x0104
            r1.A02 = r8
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x00dc
            int r10 = r1.A01
            android.view.inputmethod.ExtractedText r9 = X.AnonymousClass6FV.A00(r8)
            r7 = r3
            X.7Yy r7 = (X.C123887Yy) r7
            X.0Oa r0 = r7.A02
            java.lang.Object r1 = r0.getValue()
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            android.view.View r0 = r7.A00
            r1.updateExtractedText(r0, r10, r9)
        L_0x00dc:
            X.7Ia r0 = r8.A02
            r12 = -1
            if (r0 == 0) goto L_0x0107
            long r0 = r0.A00
            int r11 = X.C121767Ia.A01(r0)
            int r12 = X.C121767Ia.A00(r0)
        L_0x00eb:
            long r0 = r8.A00
            int r9 = X.C121767Ia.A01(r0)
            int r10 = X.C121767Ia.A00(r0)
            X.7Yy r3 = (X.C123887Yy) r3
            X.0Oa r0 = r3.A02
            java.lang.Object r7 = r0.getValue()
            android.view.inputmethod.InputMethodManager r7 = (android.view.inputmethod.InputMethodManager) r7
            android.view.View r8 = r3.A00
            r7.updateSelection(r8, r9, r10, r11, r12)
        L_0x0104:
            int r6 = r6 + 1
            goto L_0x00a8
        L_0x0107:
            r11 = -1
            goto L_0x00eb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112046ot.A00(X.7HD, X.7HD):void");
    }

    public C112046ot(AnonymousClass8dF r1, C106886fn r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
