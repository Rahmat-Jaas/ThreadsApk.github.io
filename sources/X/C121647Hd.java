package X;

import kotlin.jvm.internal.KtLambdaShape19S0301000_I2;

/* renamed from: X.7Hd  reason: invalid class name and case insensitive filesystem */
public final class C121647Hd {
    public static final boolean A01(C875353d r5, C875353d r6, AnonymousClass0YY r7, int i) {
        C875353d r3 = r6;
        AnonymousClass0YY r4 = r7;
        int i2 = i;
        if (A00(r5, r6, r7, i)) {
            return true;
        }
        return C18210wN.A1T((Boolean) AnonymousClass6EX.A00(r5, new KtLambdaShape19S0301000_I2(i2, 2, r3, r4, r5), i));
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0048 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0029  */
    public static final boolean A00(X.C875353d r9, X.C875353d r10, X.AnonymousClass0YY r11, int r12) {
        /*
            X.6Av r1 = r9.A00
            X.6Av r0 = X.AnonymousClass6Av.ActiveParent
            r3 = 0
            r7 = 1
            if (r1 != r0) goto L_0x00e0
            r1 = 16
            X.53d[] r0 = new X.C875353d[r1]
            X.84X r6 = X.AnonymousClass84X.A01(r0)
            r4 = 1024(0x400, float:1.435E-42)
            X.7YG r2 = r9.A03
            boolean r0 = r2.A08
            if (r0 == 0) goto L_0x00d9
            X.7YG[] r0 = new X.AnonymousClass7YG[r1]
            X.84X r1 = X.AnonymousClass84X.A01(r0)
            X.7YG r0 = r2.A02
            if (r0 == 0) goto L_0x0032
            r1.A0C(r0)
        L_0x0025:
            int r0 = r1.A00
            if (r0 == 0) goto L_0x0048
            X.7YG r2 = X.AnonymousClass84X.A02(r1, r0)
            int r0 = r2.A00
            r0 = r0 & r4
            if (r0 != 0) goto L_0x0036
        L_0x0032:
            X.C121847Ik.A05(r1, r2)
            goto L_0x0025
        L_0x0036:
            int r0 = r2.A01
            r0 = r0 & r4
            if (r0 == 0) goto L_0x0043
            boolean r0 = r2 instanceof X.C875353d
            if (r0 == 0) goto L_0x0025
            r6.A0C(r2)
            goto L_0x0025
        L_0x0043:
            X.7YG r2 = r2.A02
            if (r2 == 0) goto L_0x0025
            goto L_0x0036
        L_0x0048:
            X.83l r0 = X.C1365983l.A00
            r6.A0A(r0)
            boolean r8 = X.AnonymousClass0wJ.A1T(r12, r7)
            if (r8 == 0) goto L_0x0082
            int r0 = r6.A00
            int r0 = r0 - r7
            X.8bH r0 = X.AnonymousClass8bH.A02(r3, r0)
            int r5 = r0.A00
            int r4 = r0.A01
            if (r5 > r4) goto L_0x00b4
            r2 = 0
        L_0x0061:
            java.lang.Object[] r0 = r6.A01
            r0 = r0[r5]
            boolean r2 = X.C86134wK.A1a(r0, r10, r2)
            if (r5 == r4) goto L_0x00b4
            int r5 = r5 + 1
            if (r2 == 0) goto L_0x0061
            java.lang.Object[] r0 = r6.A01
            r1 = r0[r5]
            X.53d r1 = (X.C875353d) r1
            boolean r0 = X.AnonymousClass7FM.A03(r1)
            if (r0 == 0) goto L_0x0061
            boolean r0 = A03(r1, r11)
            if (r0 == 0) goto L_0x0061
            return r7
        L_0x0082:
            r0 = 2
            if (r12 != r0) goto L_0x00d2
            int r0 = r6.A00
            int r0 = r0 - r7
            X.8bH r0 = X.AnonymousClass8bH.A02(r3, r0)
            int r5 = r0.A00
            int r4 = r0.A01
            if (r5 > r4) goto L_0x00b4
            r2 = 0
        L_0x0093:
            java.lang.Object[] r0 = r6.A01
            r0 = r0[r4]
            boolean r2 = X.C86134wK.A1a(r0, r10, r2)
            if (r4 == r5) goto L_0x00b4
            int r4 = r4 + -1
            if (r2 == 0) goto L_0x0093
            java.lang.Object[] r0 = r6.A01
            r1 = r0[r4]
            X.53d r1 = (X.C875353d) r1
            boolean r0 = X.AnonymousClass7FM.A03(r1)
            if (r0 == 0) goto L_0x0093
            boolean r0 = A02(r1, r11)
            if (r0 == 0) goto L_0x0093
            return r7
        L_0x00b4:
            if (r8 != 0) goto L_0x00d1
            boolean r0 = X.C146948n8.A00(r9)
            if (r0 == 0) goto L_0x00d1
            r0 = 1024(0x400, float:1.435E-42)
            X.7YG r1 = X.C121847Ik.A00(r9, r0)
            boolean r0 = r1 instanceof X.C875353d
            if (r0 == 0) goto L_0x00d1
            if (r1 == 0) goto L_0x00d1
            java.lang.Object r0 = r11.invoke(r9)
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            return r0
        L_0x00d1:
            return r3
        L_0x00d2:
            java.lang.String r0 = "This function should only be used for 1-D focus search"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x00d9:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x00e0:
            java.lang.String r0 = "This function should only be used within a parent that has focus."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121647Hd.A00(X.53d, X.53d, X.0YY, int):boolean");
    }

    public static final boolean A02(C875353d r8, AnonymousClass0YY r9) {
        Object invoke;
        int ordinal = r8.A00.ordinal();
        if (ordinal == 1) {
            C875353d A01 = AnonymousClass7FM.A01(r8);
            if (A01 != null) {
                int ordinal2 = A01.A00.ordinal();
                if (ordinal2 == 1) {
                    if (!A02(A01, r9) && !A01(r8, A01, r9, 2)) {
                        if (!C146948n8.A00(A01)) {
                            return false;
                        }
                        invoke = r9.invoke(A01);
                    }
                    return true;
                } else if (ordinal2 == 0 || ordinal2 == 2) {
                    return A01(r8, A01, r9, 2);
                } else {
                    if (ordinal2 != 3) {
                        throw AnonymousClass4VZ.A00();
                    }
                    throw C18180wK.A0a("ActiveParent must have a focusedChild");
                }
            } else {
                throw C18180wK.A0a("ActiveParent must have a focusedChild");
            }
        } else if (ordinal == 0 || ordinal == 2) {
            return A04(r8, r9);
        } else {
            if (ordinal == 3) {
                if (!A04(r8, r9)) {
                    if (!C146948n8.A00(r8)) {
                        return false;
                    }
                    invoke = r9.invoke(r8);
                }
                return true;
            }
            throw AnonymousClass4VZ.A00();
        }
        if (AnonymousClass0wJ.A1X(invoke)) {
            return true;
        }
        return false;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0062 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    public static final boolean A03(X.C875353d r7, X.AnonymousClass0YY r8) {
        /*
            X.6Av r0 = r7.A00
            int r1 = r0.ordinal()
            r5 = 1
            if (r1 == r5) goto L_0x0085
            r0 = 0
            if (r1 == r0) goto L_0x0021
            r0 = 2
            if (r1 == r0) goto L_0x0021
            r0 = 3
            if (r1 != r0) goto L_0x0099
            boolean r0 = X.C146948n8.A00(r7)
            if (r0 == 0) goto L_0x0021
            java.lang.Object r0 = r8.invoke(r7)
            boolean r5 = X.AnonymousClass0wJ.A1X(r0)
        L_0x0020:
            return r5
        L_0x0021:
            r1 = 16
            X.53d[] r0 = new X.C875353d[r1]
            r5 = 0
            X.84X r6 = X.AnonymousClass84X.A01(r0)
            r3 = 1024(0x400, float:1.435E-42)
            X.7YG r2 = r7.A03
            boolean r0 = r2.A08
            if (r0 == 0) goto L_0x009e
            X.7YG[] r0 = new X.AnonymousClass7YG[r1]
            X.84X r1 = X.AnonymousClass84X.A01(r0)
            X.7YG r0 = r2.A02
            if (r0 == 0) goto L_0x004c
            r1.A0C(r0)
        L_0x003f:
            int r0 = r1.A00
            if (r0 == 0) goto L_0x0062
            X.7YG r2 = X.AnonymousClass84X.A02(r1, r0)
            int r0 = r2.A00
            r0 = r0 & r3
            if (r0 != 0) goto L_0x0050
        L_0x004c:
            X.C121847Ik.A05(r1, r2)
            goto L_0x003f
        L_0x0050:
            int r0 = r2.A01
            r0 = r0 & r3
            if (r0 == 0) goto L_0x005d
            boolean r0 = r2 instanceof X.C875353d
            if (r0 == 0) goto L_0x003f
            r6.A0C(r2)
            goto L_0x003f
        L_0x005d:
            X.7YG r2 = r2.A02
            if (r2 == 0) goto L_0x003f
            goto L_0x0050
        L_0x0062:
            X.83l r0 = X.C1365983l.A00
            r6.A0A(r0)
            int r4 = r6.A00
            if (r4 <= 0) goto L_0x0020
            java.lang.Object[] r3 = r6.A01
            r2 = 0
        L_0x006e:
            r1 = r3[r2]
            X.53d r1 = (X.C875353d) r1
            boolean r0 = X.AnonymousClass7FM.A03(r1)
            if (r0 == 0) goto L_0x0080
            boolean r0 = A03(r1, r8)
            if (r0 == 0) goto L_0x0080
            r5 = 1
            return r5
        L_0x0080:
            int r2 = r2 + 1
            if (r2 < r4) goto L_0x006e
            return r5
        L_0x0085:
            X.53d r1 = X.AnonymousClass7FM.A01(r7)
            if (r1 == 0) goto L_0x00a5
            boolean r0 = A03(r1, r8)
            if (r0 != 0) goto L_0x0020
            boolean r0 = A01(r7, r1, r8, r5)
            if (r0 != 0) goto L_0x0020
            r5 = 0
            return r5
        L_0x0099:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x009e:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x00a5:
            java.lang.String r0 = "ActiveParent must have a focusedChild"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121647Hd.A03(X.53d, X.0YY):boolean");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0046 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    public static final boolean A04(X.C875353d r7, X.AnonymousClass0YY r8) {
        /*
            r2 = 16
            X.53d[] r0 = new X.C875353d[r2]
            r6 = 0
            X.84X r5 = X.AnonymousClass84X.A01(r0)
            r3 = 1024(0x400, float:1.435E-42)
            X.7YG r1 = r7.A03
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x0068
            X.7YG[] r0 = new X.AnonymousClass7YG[r2]
            X.84X r2 = X.AnonymousClass84X.A01(r0)
            X.7YG r0 = r1.A02
            if (r0 == 0) goto L_0x0030
            r2.A0C(r0)
        L_0x001e:
            int r1 = r2.A00
            boolean r0 = X.C18180wK.A1V(r1)
            r4 = 1
            if (r0 == 0) goto L_0x0046
            X.7YG r1 = X.AnonymousClass84X.A02(r2, r1)
            int r0 = r1.A00
            r0 = r0 & r3
            if (r0 != 0) goto L_0x0034
        L_0x0030:
            X.C121847Ik.A05(r2, r1)
            goto L_0x001e
        L_0x0034:
            int r0 = r1.A01
            r0 = r0 & r3
            if (r0 == 0) goto L_0x0041
            boolean r0 = r1 instanceof X.C875353d
            if (r0 == 0) goto L_0x001e
            r5.A0C(r1)
            goto L_0x001e
        L_0x0041:
            X.7YG r1 = r1.A02
            if (r1 == 0) goto L_0x001e
            goto L_0x0034
        L_0x0046:
            X.83l r0 = X.C1365983l.A00
            r5.A0A(r0)
            int r3 = r5.A00
            if (r3 <= 0) goto L_0x0067
            int r3 = r3 - r4
            java.lang.Object[] r2 = r5.A01
        L_0x0052:
            r1 = r2[r3]
            X.53d r1 = (X.C875353d) r1
            boolean r0 = X.AnonymousClass7FM.A03(r1)
            if (r0 == 0) goto L_0x0063
            boolean r0 = A02(r1, r8)
            if (r0 == 0) goto L_0x0063
            return r4
        L_0x0063:
            int r3 = r3 + -1
            if (r3 >= 0) goto L_0x0052
        L_0x0067:
            return r6
        L_0x0068:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121647Hd.A04(X.53d, X.0YY):boolean");
    }
}
