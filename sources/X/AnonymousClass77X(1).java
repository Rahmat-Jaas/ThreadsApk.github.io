package X;

/* renamed from: X.77X  reason: invalid class name */
public final class AnonymousClass77X {
    public static final AnonymousClass77X A01 = new AnonymousClass77X();
    public static final AnonymousClass77X A02 = new AnonymousClass77X();
    public final AnonymousClass84X A00 = AnonymousClass84X.A01(new C147638pf[16]);

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x006d A[EDGE_INSN: B:42:0x006d->B:26:0x006d ?: BREAK  , SYNTHETIC] */
    public final boolean A00(X.AnonymousClass0YY r9) {
        /*
            r8 = this;
            r0 = 0
            X.C04220Ms.A0B(r9, r0)
            X.77X r0 = A02
            boolean r0 = r8.equals(r0)
            r0 = r0 ^ 1
            java.lang.String r1 = "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n"
            if (r0 == 0) goto L_0x008a
            X.77X r0 = A01
            boolean r0 = r8.equals(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0085
            X.84X r0 = r8.A00
            int r5 = r0.A00
            if (r5 == 0) goto L_0x007e
            r7 = 0
            if (r5 <= 0) goto L_0x0071
            java.lang.Object[] r4 = r0.A01
            r3 = 0
        L_0x0026:
            r1 = r4[r3]
            X.8pf r1 = (X.C147638pf) r1
            r6 = 1024(0x400, float:1.435E-42)
            r0 = r1
            X.7YG r0 = (X.AnonymousClass7YG) r0
            X.7YG r0 = r0.A03
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x0077
            r0 = 16
            X.7YG[] r0 = new X.AnonymousClass7YG[r0]
            X.84X r2 = X.AnonymousClass84X.A01(r0)
            X.7YG r1 = (X.AnonymousClass7YG) r1
            X.7YG r1 = r1.A03
            X.7YG r0 = r1.A02
            if (r0 == 0) goto L_0x0055
            r2.A0C(r0)
        L_0x0048:
            int r0 = r2.A00
            if (r0 == 0) goto L_0x006d
            X.7YG r1 = X.AnonymousClass84X.A02(r2, r0)
            int r0 = r1.A00
            r0 = r0 & r6
            if (r0 != 0) goto L_0x0059
        L_0x0055:
            X.C121847Ik.A05(r2, r1)
            goto L_0x0048
        L_0x0059:
            int r0 = r1.A01
            r0 = r0 & r6
            if (r0 == 0) goto L_0x0072
            boolean r0 = r1 instanceof X.C875353d
            if (r0 == 0) goto L_0x0048
            java.lang.Object r0 = r9.invoke(r1)
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 == 0) goto L_0x0048
            r7 = 1
        L_0x006d:
            int r3 = r3 + 1
            if (r3 < r5) goto L_0x0026
        L_0x0071:
            return r7
        L_0x0072:
            X.7YG r1 = r1.A02
            if (r1 == 0) goto L_0x0048
            goto L_0x0059
        L_0x0077:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x007e:
            java.lang.String r0 = "\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x0085:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x008a:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass77X.A00(X.0YY):boolean");
    }
}
