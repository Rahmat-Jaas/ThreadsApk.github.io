package X;

import android.graphics.Outline;
import android.os.Build;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.7A6  reason: invalid class name */
public final class AnonymousClass7A6 {
    public float A00;
    public long A01;
    public long A02;
    public long A03;
    public C147018nF A04;
    public C147018nF A05;
    public boolean A06;
    public boolean A07 = true;
    public boolean A08;
    public C1203079q A09;
    public C98106Ef A0A;
    public C147018nF A0B;
    public C142918fo A0C;
    public C147168nV A0D;
    public AnonymousClass69J A0E;
    public boolean A0F;
    public final Outline A0G;

    public AnonymousClass7A6(C147168nV r5) {
        C04220Ms.A0B(r5, 1);
        this.A0D = r5;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.A0G = outline;
        long j = AnonymousClass7JK.A02;
        this.A03 = j;
        this.A0C = C102746Wj.A00;
        this.A02 = AnonymousClass7KC.A03;
        this.A01 = j;
        this.A0E = AnonymousClass69J.Ltr;
    }

    public static final void A00(AnonymousClass7A6 r15) {
        C147018nF r2;
        if (r15.A06) {
            r15.A02 = AnonymousClass7KC.A03;
            long j = r15.A03;
            r15.A01 = j;
            r15.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            r15.A05 = null;
            r15.A06 = false;
            r15.A08 = false;
            if (!r15.A0F || AnonymousClass7JK.A02(j) <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || AnonymousClass7JK.A00(j) <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                r15.A0G.setEmpty();
                return;
            }
            r15.A07 = true;
            C98106Ef AG2 = r15.A0C.AG2(r15.A0D, r15.A0E, j);
            r15.A0A = AG2;
            if (AG2 instanceof C876453o) {
                AnonymousClass7F6 r4 = ((C876453o) AG2).A00;
                float f = r4.A01;
                float f2 = r4.A03;
                r15.A02 = C86104wH.A0C(f, f2);
                float f3 = r4.A02;
                float f4 = r4.A00;
                r15.A01 = C86104wH.A0C(f3 - f, f4 - f2);
                r15.A0G.setRect(AnonymousClass8bA.A02(f), AnonymousClass8bA.A02(f2), AnonymousClass8bA.A02(f3), AnonymousClass8bA.A02(f4));
                return;
            }
            if (AG2 instanceof C876853s) {
                C1203079q r6 = ((C876853s) AG2).A00;
                float A002 = C86104wH.A00(r6.A06);
                float f5 = r6.A01;
                float f6 = r6.A03;
                r15.A02 = C86104wH.A0C(f5, f6);
                float f7 = r6.A02;
                float f8 = r6.A00;
                r15.A01 = C86104wH.A0C(f7 - f5, f8 - f6);
                if (AnonymousClass6EZ.A00(r6)) {
                    r15.A0G.setRoundRect(AnonymousClass8bA.A02(f5), AnonymousClass8bA.A02(f6), AnonymousClass8bA.A02(f7), AnonymousClass8bA.A02(f8), A002);
                    r15.A00 = A002;
                    return;
                }
                r2 = r15.A04;
                if (r2 == null) {
                    r2 = new AnonymousClass7X1(C86144wL.A0G());
                    r15.A04 = r2;
                }
                ((AnonymousClass7X1) r2).A01.reset();
                r2.A7Y(r6);
            } else if (AG2 instanceof C876353n) {
                r2 = ((C876353n) AG2).A00;
            } else {
                return;
            }
            if (Build.VERSION.SDK_INT > 28 || ((AnonymousClass7X1) r2).A01.isConvex()) {
                Outline outline = r15.A0G;
                if (r2 instanceof AnonymousClass7X1) {
                    outline.setConvexPath(((AnonymousClass7X1) r2).A01);
                    r15.A08 = !outline.canClip();
                } else {
                    throw C86134wK.A0s("Unable to obtain android.graphics.Path");
                }
            } else {
                r15.A07 = false;
                r15.A0G.setEmpty();
                r15.A08 = true;
            }
            r15.A05 = r2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0059, code lost:
        if (X.C86104wH.A00(r10.A06) == r7) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C146678mg r22) {
        /*
            r21 = this;
            r4 = r21
            A00(r4)
            X.8nF r1 = r4.A05
            r5 = r22
            if (r1 == 0) goto L_0x0010
            r0 = 1
            r5.ADN(r1, r0)
            return
        L_0x0010:
            float r7 = r4.A00
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b3
            X.8nF r6 = r4.A0B
            X.79q r10 = r4.A09
            if (r6 == 0) goto L_0x0060
            long r2 = r4.A02
            long r0 = r4.A01
            if (r10 == 0) goto L_0x0060
            boolean r8 = X.AnonymousClass6EZ.A00(r10)
            if (r8 == 0) goto L_0x0060
            float r9 = r10.A01
            float r8 = X.AnonymousClass7KC.A01(r2)
            int r8 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r8 != 0) goto L_0x0060
            float r9 = r10.A03
            float r8 = X.AnonymousClass7KC.A02(r2)
            int r8 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r8 != 0) goto L_0x0060
            float r9 = r10.A02
            float r8 = X.C86144wL.A01(r2, r0)
            int r8 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r8 != 0) goto L_0x0060
            float r8 = r10.A00
            float r0 = X.C86134wK.A02(r2, r0)
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0060
            long r0 = r10.A06
            float r0 = X.C86104wH.A00(r0)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0060
        L_0x005b:
            r0 = 1
            r5.ADN(r6, r0)
            return
        L_0x0060:
            long r2 = r4.A02
            float r9 = X.AnonymousClass7KC.A01(r2)
            float r10 = X.AnonymousClass7KC.A02(r2)
            float r11 = X.AnonymousClass7KC.A01(r2)
            long r0 = r4.A01
            float r8 = X.AnonymousClass7JK.A02(r0)
            float r11 = r11 + r8
            float r12 = X.C86134wK.A02(r2, r0)
            long r2 = X.C86104wH.A0C(r7, r7)
            float r1 = X.C86104wH.A00(r2)
            int r0 = X.C86104wH.A08(r2)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            long r13 = X.C86104wH.A0C(r1, r0)
            X.79q r8 = new X.79q
            r15 = r13
            r17 = r13
            r19 = r13
            r8.<init>(r9, r10, r11, r12, r13, r15, r17, r19)
            if (r6 != 0) goto L_0x00aa
            android.graphics.Path r0 = X.C86144wL.A0G()
            X.7X1 r6 = new X.7X1
            r6.<init>(r0)
        L_0x00a2:
            r6.A7Y(r8)
            r4.A09 = r8
            r4.A0B = r6
            goto L_0x005b
        L_0x00aa:
            r0 = r6
            X.7X1 r0 = (X.AnonymousClass7X1) r0
            android.graphics.Path r0 = r0.A01
            r0.reset()
            goto L_0x00a2
        L_0x00b3:
            long r0 = r4.A02
            float r6 = X.AnonymousClass7KC.A01(r0)
            float r7 = X.AnonymousClass7KC.A02(r0)
            float r8 = X.AnonymousClass7KC.A01(r0)
            long r2 = r4.A01
            float r4 = X.AnonymousClass7JK.A02(r2)
            float r8 = r8 + r4
            float r9 = X.C86134wK.A02(r0, r2)
            r10 = 1
            r5.ADO(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7A6.A02(X.8mg):void");
    }

    public final boolean A03(long j) {
        C98106Ef r1;
        if (!this.A0F || (r1 = this.A0A) == null) {
            return true;
        }
        float A012 = AnonymousClass7KC.A01(j);
        float A022 = AnonymousClass7KC.A02(j);
        if (r1 instanceof C876453o) {
            AnonymousClass7F6 r12 = ((C876453o) r1).A00;
            if (r12.A01 > A012 || A012 >= r12.A02 || r12.A03 > A022 || A022 >= r12.A00) {
                return false;
            }
        } else if (r1 instanceof C876853s) {
            C1203079q r10 = ((C876853s) r1).A00;
            float f = r10.A01;
            if (A012 < f) {
                return false;
            }
            float f2 = r10.A02;
            if (A012 >= f2) {
                return false;
            }
            float f3 = r10.A03;
            if (A022 < f3) {
                return false;
            }
            float f4 = r10.A00;
            if (A022 >= f4) {
                return false;
            }
            long j2 = r10.A06;
            float A023 = C86124wJ.A02(j2);
            long j3 = r10.A07;
            float A024 = C86124wJ.A02(j3);
            float f5 = f2 - f;
            if (A023 + A024 <= f5) {
                long j4 = r10.A04;
                float A025 = C86124wJ.A02(j4);
                long j5 = r10.A05;
                float A026 = C86124wJ.A02(j5);
                if (A025 + A026 <= f5) {
                    float intBitsToFloat = Float.intBitsToFloat(C86104wH.A08(j2));
                    float intBitsToFloat2 = Float.intBitsToFloat(C86104wH.A08(j4));
                    float f6 = f4 - f3;
                    if (intBitsToFloat + intBitsToFloat2 <= f6) {
                        float intBitsToFloat3 = Float.intBitsToFloat(C86104wH.A08(j3));
                        float intBitsToFloat4 = Float.intBitsToFloat(C86104wH.A08(j5));
                        if (intBitsToFloat3 + intBitsToFloat4 <= f6) {
                            float f7 = A023 + f;
                            float f8 = intBitsToFloat + f3;
                            float f9 = f2 - A024;
                            float f10 = intBitsToFloat3 + f3;
                            float f11 = f2 - A026;
                            float f12 = f4 - intBitsToFloat4;
                            float f13 = f4 - intBitsToFloat2;
                            float f14 = A025 + f;
                            if (A012 < f7 && A022 < f8) {
                                return C115936w9.A00(A012, A022, f7, f8, j2);
                            }
                            if (A012 < f14 && A022 > f13) {
                                return C115936w9.A00(A012, A022, f14, f13, j4);
                            }
                            if (A012 > f9 && A022 < f10) {
                                return C115936w9.A00(A012, A022, f9, f10, j3);
                            }
                            if (A012 > f11 && A022 > f12) {
                                return C115936w9.A00(A012, A022, f11, f12, j5);
                            }
                        }
                    }
                }
            }
            AnonymousClass7X1 r0 = new AnonymousClass7X1(C86144wL.A0G());
            r0.A7Y(r10);
            return C115936w9.A01(r0, A012, A022);
        } else if (r1 instanceof C876353n) {
            return C115936w9.A01(((C876353n) r1).A00, A012, A022);
        } else {
            throw AnonymousClass4VZ.A00();
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r9 > com.facebook.react.uimanager.BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A04(X.C142918fo r5, X.C147168nV r6, X.AnonymousClass69J r7, float r8, float r9, boolean r10) {
        /*
            r4 = this;
            android.graphics.Outline r0 = r4.A0G
            r0.setAlpha(r8)
            X.8fo r0 = r4.A0C
            boolean r0 = X.C04220Ms.A0I(r0, r5)
            r3 = 1
            r2 = r0 ^ 1
            if (r2 == 0) goto L_0x0014
            r4.A0C = r5
            r4.A06 = r3
        L_0x0014:
            if (r10 != 0) goto L_0x001c
            r0 = 0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            r1 = 0
            if (r0 <= 0) goto L_0x001d
        L_0x001c:
            r1 = 1
        L_0x001d:
            boolean r0 = r4.A0F
            if (r0 == r1) goto L_0x0025
            r4.A0F = r1
            r4.A06 = r3
        L_0x0025:
            X.69J r0 = r4.A0E
            if (r0 == r7) goto L_0x002d
            r4.A0E = r7
            r4.A06 = r3
        L_0x002d:
            X.8nV r0 = r4.A0D
            boolean r0 = X.C04220Ms.A0I(r0, r6)
            if (r0 != 0) goto L_0x0039
            r4.A0D = r6
            r4.A06 = r3
        L_0x0039:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7A6.A04(X.8fo, X.8nV, X.69J, float, float, boolean):boolean");
    }

    public final Outline A01() {
        A00(this);
        if (!this.A0F || !this.A07) {
            return null;
        }
        return this.A0G;
    }
}
