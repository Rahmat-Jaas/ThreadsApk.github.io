package X;

import com.facebook.react.uimanager.BaseViewManager;
import kotlin.jvm.internal.KtLambdaShape19S0301000_I2;

/* renamed from: X.7KH  reason: invalid class name */
public final class AnonymousClass7KH {
    public static final long A00(AnonymousClass7F6 r6, AnonymousClass7F6 r7, int i) {
        float f;
        float f2;
        boolean A1T;
        float f3;
        float f4;
        float f5;
        float f6;
        if (i == 3) {
            f = r6.A01;
            f2 = r7.A02;
        } else if (i == 4) {
            f = r7.A01;
            f2 = r6.A02;
        } else if (i == 5) {
            f = r6.A03;
            f2 = r7.A00;
        } else if (i == 6) {
            f = r7.A03;
            f2 = r6.A00;
        } else {
            throw C18180wK.A0a("This function should only be used for 2-D focus search");
        }
        long abs = (long) Math.abs(Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f - f2));
        if (i == 3) {
            A1T = true;
        } else {
            A1T = AnonymousClass0wJ.A1T(i, 4);
        }
        if (A1T) {
            float f7 = r6.A03;
            f3 = (float) 2;
            f4 = f7 + ((r6.A00 - f7) / f3);
            f5 = r7.A03;
            f6 = r7.A00;
        } else if (i == 5 || i == 6) {
            float f8 = r6.A01;
            f3 = (float) 2;
            f4 = f8 + ((r6.A02 - f8) / f3);
            f5 = r7.A01;
            f6 = r7.A02;
        } else {
            throw C18180wK.A0a("This function should only be used for 2-D focus search");
        }
        long A01 = (long) C86124wJ.A01(f4, f5 + ((f6 - f5) / f3));
        return (((long) 13) * abs * abs) + (A01 * A01);
    }

    public static final C875353d A01(AnonymousClass84X r12, AnonymousClass7F6 r13, int i) {
        AnonymousClass7F6 A02;
        if (AnonymousClass0wJ.A1T(i, 3)) {
            A02 = r13.A02((r13.A02 - r13.A01) + ((float) 1), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        } else if (i == 4) {
            A02 = r13.A02(-((r13.A02 - r13.A01) + ((float) 1)), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        } else if (i == 5) {
            A02 = r13.A02(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (r13.A00 - r13.A03) + ((float) 1));
        } else if (i == 6) {
            A02 = r13.A02(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, -((r13.A00 - r13.A03) + ((float) 1)));
        } else {
            throw C18180wK.A0a("This function should only be used for 2-D focus search");
        }
        C875353d r11 = null;
        int i2 = r12.A00;
        if (i2 > 0) {
            int i3 = 0;
            Object[] objArr = r12.A01;
            do {
                C875353d r6 = (C875353d) objArr[i3];
                if (AnonymousClass7FM.A03(r6)) {
                    AnonymousClass7F6 A022 = AnonymousClass7FM.A02(r6);
                    if (A08(A022, r13, i) && (!A08(A02, r13, i) || A09(r13, A022, A02, i) || (!A09(r13, A02, A022, i) && A00(r13, A022, i) < A00(r13, A02, i)))) {
                        r11 = r6;
                        A02 = A022;
                    }
                }
                i3++;
            } while (i3 < i2);
        }
        return r11;
    }

    public static final Boolean A02(C875353d r7, AnonymousClass0YY r8, int i) {
        boolean z;
        int ordinal = r7.A00.ordinal();
        if (ordinal == 1) {
            C875353d A01 = AnonymousClass7FM.A01(r7);
            if (A01 != null) {
                int ordinal2 = A01.A00.ordinal();
                if (ordinal2 == 1) {
                    Boolean A02 = A02(A01, r8, i);
                    if (!C18190wL.A1Z(A02, false)) {
                        return A02;
                    }
                    Object invoke = ((C123417Wv) A01.A06()).A09.invoke(new C114146sl(i));
                    if (C04220Ms.A0I(invoke, AnonymousClass77X.A02)) {
                        invoke = null;
                    }
                    AnonymousClass77X r2 = (AnonymousClass77X) invoke;
                    if (r2 != null) {
                        if (!r2.equals(AnonymousClass77X.A01)) {
                            return Boolean.valueOf(r2.A00(r8));
                        }
                        return null;
                    } else if (A01.A00 == AnonymousClass6Av.ActiveParent) {
                        A01 = AnonymousClass7FM.A00(A01);
                        if (A01 == null) {
                            throw C18180wK.A0a("ActiveParent must have a focusedChild");
                        }
                    } else {
                        throw C18180wK.A0a("Check failed.");
                    }
                } else if (!(ordinal2 == 0 || ordinal2 == 2)) {
                    if (ordinal2 != 3) {
                        throw AnonymousClass4VZ.A00();
                    }
                    throw C18180wK.A0a("ActiveParent must have a focusedChild");
                }
                z = A05(r7, A01, r8, i);
            } else {
                throw C18180wK.A0a("ActiveParent must have a focusedChild");
            }
        } else if (ordinal == 0 || ordinal == 2) {
            z = A06(r7, r8, i);
        } else if (ordinal != 3) {
            throw AnonymousClass4VZ.A00();
        } else if (C146948n8.A00(r7)) {
            return (Boolean) r8.invoke(r7);
        } else {
            return false;
        }
        return Boolean.valueOf(z);
    }

    public static final boolean A05(C875353d r5, C875353d r6, AnonymousClass0YY r7, int i) {
        C875353d r3 = r6;
        AnonymousClass0YY r4 = r7;
        int i2 = i;
        if (A04(r5, r6, r7, i)) {
            return true;
        }
        return C18210wN.A1T((Boolean) AnonymousClass6EX.A00(r5, new KtLambdaShape19S0301000_I2(i2, 3, r3, r4, r5), i));
    }

    public static final boolean A07(AnonymousClass7F6 r3, AnonymousClass7F6 r4, int i) {
        float f;
        float f2;
        if (AnonymousClass0wJ.A1T(i, 3) || i == 4) {
            if (r3.A00 <= r4.A03) {
                return false;
            }
            f = r3.A03;
            f2 = r4.A00;
        } else if (i != 5 && i != 6) {
            throw C18180wK.A0a("This function should only be used for 2-D focus search");
        } else if (r3.A02 <= r4.A01) {
            return false;
        } else {
            f = r3.A01;
            f2 = r4.A02;
        }
        if (f < f2) {
            return true;
        }
        return false;
    }

    public static final boolean A08(AnonymousClass7F6 r3, AnonymousClass7F6 r4, int i) {
        float f;
        float f2;
        float f3;
        float f4;
        if (AnonymousClass0wJ.A1T(i, 3)) {
            float f5 = r4.A02;
            float f6 = r3.A02;
            if (f5 <= f6 && r4.A01 < f6) {
                return false;
            }
            f3 = r4.A01;
            f4 = r3.A01;
        } else {
            if (i == 4) {
                float f7 = r4.A01;
                float f8 = r3.A01;
                if (f7 >= f8 && r4.A02 > f8) {
                    return false;
                }
                f = r4.A02;
                f2 = r3.A02;
            } else if (i == 5) {
                float f9 = r4.A00;
                float f10 = r3.A00;
                if (f9 <= f10 && r4.A03 < f10) {
                    return false;
                }
                f3 = r4.A03;
                f4 = r3.A03;
            } else if (i == 6) {
                float f11 = r4.A03;
                float f12 = r3.A03;
                if (f11 >= f12 && r4.A00 > f12) {
                    return false;
                }
                f = r4.A00;
                f2 = r3.A00;
            } else {
                throw C18180wK.A0a("This function should only be used for 2-D focus search");
            }
            if (f < f2) {
                return true;
            }
            return false;
        }
        if (f3 > f4) {
            return true;
        }
        return false;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0086 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    public static final void A03(X.AnonymousClass84X r7, X.C147778pt r8) {
        /*
            r6 = 1024(0x400, float:1.435E-42)
            X.7YG r8 = (X.AnonymousClass7YG) r8
            X.7YG r5 = r8.A03
            boolean r0 = r5.A08
            if (r0 == 0) goto L_0x0087
            r0 = 16
            X.7YG[] r0 = new X.AnonymousClass7YG[r0]
            X.84X r4 = X.AnonymousClass84X.A01(r0)
            X.7YG r0 = r5.A02
            if (r0 == 0) goto L_0x0082
            r4.A0C(r0)
        L_0x0019:
            int r0 = r4.A00
            if (r0 == 0) goto L_0x0086
            X.7YG r5 = X.AnonymousClass84X.A02(r4, r0)
            int r0 = r5.A00
            r0 = r0 & r6
            if (r0 == 0) goto L_0x0082
            r3 = r5
        L_0x0027:
            int r0 = r3.A01
            r0 = r0 & r6
            if (r0 == 0) goto L_0x007d
            boolean r0 = r3 instanceof X.C875353d
            if (r0 == 0) goto L_0x007d
            r1 = r3
            X.53d r1 = (X.C875353d) r1
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x0019
            boolean r0 = X.C146948n8.A00(r1)
            if (r0 == 0) goto L_0x0041
            r7.A0C(r1)
            goto L_0x0019
        L_0x0041:
            X.8n8 r0 = r1.A06()
            X.7Wv r0 = (X.C123417Wv) r0
            X.0YY r2 = r0.A08
            r1 = 7
            X.6sl r0 = new X.6sl
            r0.<init>(r1)
            java.lang.Object r1 = r2.invoke(r0)
            X.77X r0 = X.AnonymousClass77X.A02
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x005c
            r1 = 0
        L_0x005c:
            X.77X r1 = (X.AnonymousClass77X) r1
            if (r1 == 0) goto L_0x007d
            X.77X r0 = X.AnonymousClass77X.A01
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0019
            X.84X r0 = r1.A00
            int r3 = r0.A00
            if (r3 <= 0) goto L_0x0019
            java.lang.Object[] r2 = r0.A01
            r1 = 0
        L_0x0071:
            r0 = r2[r1]
            X.8pt r0 = (X.C147778pt) r0
            A03(r7, r0)
            int r1 = r1 + 1
            if (r1 < r3) goto L_0x0071
            goto L_0x0019
        L_0x007d:
            X.7YG r3 = r3.A02
            if (r3 == 0) goto L_0x0082
            goto L_0x0027
        L_0x0082:
            X.C121847Ik.A05(r4, r5)
            goto L_0x0019
        L_0x0086:
            return
        L_0x0087:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7KH.A03(X.84X, X.8pt):void");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0049 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    public static final boolean A04(X.C875353d r7, X.C875353d r8, X.AnonymousClass0YY r9, int r10) {
        /*
            r2 = 16
            X.53d[] r0 = new X.C875353d[r2]
            r6 = 0
            X.84X r3 = X.AnonymousClass84X.A01(r0)
            r5 = 1024(0x400, float:1.435E-42)
            X.7YG r1 = r7.A03
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x0098
            X.7YG[] r0 = new X.AnonymousClass7YG[r2]
            X.84X r2 = X.AnonymousClass84X.A01(r0)
            X.7YG r0 = r1.A02
            if (r0 == 0) goto L_0x0030
            r2.A0C(r0)
        L_0x001e:
            int r1 = r2.A00
            boolean r0 = X.C18180wK.A1V(r1)
            r4 = 1
            if (r0 == 0) goto L_0x0049
            X.7YG r1 = X.AnonymousClass84X.A02(r2, r1)
            int r0 = r1.A00
            r0 = r0 & r5
            if (r0 != 0) goto L_0x0034
        L_0x0030:
            X.C121847Ik.A05(r2, r1)
            goto L_0x001e
        L_0x0034:
            int r0 = r1.A01
            r0 = r0 & r5
            if (r0 == 0) goto L_0x0041
            boolean r0 = r1 instanceof X.C875353d
            if (r0 == 0) goto L_0x001e
            r3.A0C(r1)
            goto L_0x001e
        L_0x0041:
            X.7YG r1 = r1.A02
            if (r1 == 0) goto L_0x001e
            goto L_0x0034
        L_0x0046:
            r3.A0E(r2)
        L_0x0049:
            int r0 = r3.A00
            if (r0 == 0) goto L_0x0065
            X.7F6 r0 = X.AnonymousClass7FM.A02(r8)
            X.53d r2 = A01(r3, r0, r10)
            if (r2 == 0) goto L_0x0065
            boolean r0 = X.C146948n8.A00(r2)
            if (r0 == 0) goto L_0x0066
            java.lang.Object r0 = r9.invoke(r2)
            boolean r6 = X.AnonymousClass0wJ.A1X(r0)
        L_0x0065:
            return r6
        L_0x0066:
            X.8n8 r0 = r2.A06()
            X.7Wv r0 = (X.C123417Wv) r0
            X.0YY r1 = r0.A08
            X.6sl r0 = new X.6sl
            r0.<init>(r10)
            java.lang.Object r1 = r1.invoke(r0)
            X.77X r0 = X.AnonymousClass77X.A02
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0080
            r1 = 0
        L_0x0080:
            X.77X r1 = (X.AnonymousClass77X) r1
            if (r1 == 0) goto L_0x0091
            X.77X r0 = X.AnonymousClass77X.A01
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0065
            boolean r6 = r1.A00(r9)
            return r6
        L_0x0091:
            boolean r0 = A05(r2, r8, r9, r10)
            if (r0 == 0) goto L_0x0046
            return r4
        L_0x0098:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7KH.A04(X.53d, X.53d, X.0YY, int):boolean");
    }

    public static final boolean A06(C875353d r6, AnonymousClass0YY r7, int i) {
        float f;
        float f2;
        Object A01;
        char A1X = C18240wQ.A1X(r7);
        Object invoke = ((C123417Wv) r6.A06()).A08.invoke(new C114146sl(i));
        if (C04220Ms.A0I(invoke, AnonymousClass77X.A02)) {
            invoke = null;
        }
        AnonymousClass77X r2 = (AnonymousClass77X) invoke;
        if (r2 == null) {
            AnonymousClass84X A012 = AnonymousClass84X.A01(new C875353d[16]);
            A03(A012, r6);
            int i2 = A012.A00;
            if (i2 > 1) {
                if (i == 7) {
                    i = 4;
                } else if (!(i == 4 || i == 6)) {
                    if (i == 3 || i == 5) {
                        AnonymousClass7F6 A02 = AnonymousClass7FM.A02(r6);
                        f = A02.A02;
                        f2 = A02.A00;
                        A01 = A01(A012, new AnonymousClass7F6(f, f2, f, f2), i);
                    } else {
                        throw C18180wK.A0a("This function should only be used for 2-D focus search");
                    }
                }
                AnonymousClass7F6 A022 = AnonymousClass7FM.A02(r6);
                f = A022.A01;
                f2 = A022.A03;
                A01 = A01(A012, new AnonymousClass7F6(f, f2, f, f2), i);
            } else if (i2 == 0) {
                return false;
            } else {
                A01 = A012.A01[A1X];
            }
            if (A01 != null) {
                return AnonymousClass0wJ.A1X(r7.invoke(A01));
            }
            return false;
        } else if (!r2.equals(AnonymousClass77X.A01)) {
            return r2.A00(r7);
        } else {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        if (r1 <= r0) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        if (r8 == 4) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002c, code lost:
        if (r8 != 5) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002e, code lost:
        r1 = r5.A03;
        r0 = r6.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0032, code lost:
        r2 = java.lang.Math.max(com.facebook.react.uimanager.BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, r1 - r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        if (r8 != 5) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        r1 = r5.A03;
        r0 = r7.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        if (r2 >= java.lang.Math.max(1.0f, r1 - r0)) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004a, code lost:
        r1 = r7.A00;
        r0 = r5.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004f, code lost:
        r1 = r6.A03;
        r0 = r5.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r8 != 3) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A09(X.AnonymousClass7F6 r5, X.AnonymousClass7F6 r6, X.AnonymousClass7F6 r7, int r8) {
        /*
            boolean r0 = A07(r7, r5, r8)
            r4 = 0
            if (r0 != 0) goto L_0x001c
            boolean r0 = A07(r6, r5, r8)
            if (r0 == 0) goto L_0x001c
            r0 = 3
            r2 = 3
            if (r8 != r0) goto L_0x001d
            float r1 = r5.A01
            float r0 = r7.A02
        L_0x0015:
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x001b
            if (r8 != r2) goto L_0x0028
        L_0x001b:
            r4 = 1
        L_0x001c:
            return r4
        L_0x001d:
            r0 = 4
            if (r8 != r0) goto L_0x0054
            float r1 = r5.A02
            float r0 = r7.A01
        L_0x0024:
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x001b
        L_0x0028:
            r0 = 4
            if (r8 == r0) goto L_0x001b
            r3 = 5
            if (r8 != r3) goto L_0x004f
            float r1 = r5.A03
            float r0 = r6.A00
        L_0x0032:
            float r1 = r1 - r0
            r0 = 0
            float r2 = java.lang.Math.max(r0, r1)
            if (r8 != r3) goto L_0x004a
            float r1 = r5.A03
            float r0 = r7.A03
        L_0x003e:
            float r1 = r1 - r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.max(r0, r1)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x001c
            goto L_0x001b
        L_0x004a:
            float r1 = r7.A00
            float r0 = r5.A00
            goto L_0x003e
        L_0x004f:
            float r1 = r6.A03
            float r0 = r5.A00
            goto L_0x0032
        L_0x0054:
            r0 = 5
            if (r8 != r0) goto L_0x005c
            float r1 = r5.A03
            float r0 = r7.A00
            goto L_0x0015
        L_0x005c:
            r0 = 6
            if (r8 != r0) goto L_0x0064
            float r1 = r5.A00
            float r0 = r7.A03
            goto L_0x0024
        L_0x0064:
            java.lang.String r0 = "This function should only be used for 2-D focus search"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7KH.A09(X.7F6, X.7F6, X.7F6, int):boolean");
    }
}
