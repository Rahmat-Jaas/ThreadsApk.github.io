package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;

/* renamed from: X.55A  reason: invalid class name */
public final class AnonymousClass55A extends AnonymousClass7YV implements C147528pU {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final boolean A04;

    public final /* synthetic */ boolean A8A(AnonymousClass0YY r2) {
        return AnonymousClass6ES.A00(this, r2);
    }

    public final /* synthetic */ Modifier Cx6(Modifier modifier) {
        return AnonymousClass6ER.A00(this, modifier);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        if (r2 != Integer.MAX_VALUE) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007e, code lost:
        if (r0 != Integer.MAX_VALUE) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long A00(X.C147168nV r9) {
        /*
            r8 = this;
            float r1 = r8.A01
            r7 = 2143289344(0x7fc00000, float:NaN)
            int r0 = java.lang.Float.compare(r1, r7)
            boolean r0 = X.C18180wK.A1W(r0)
            r6 = 2147483647(0x7fffffff, float:NaN)
            r5 = 0
            if (r0 != 0) goto L_0x0087
            X.7yT r2 = X.C134847yT.A00(r1)
            float r0 = (float) r5
            X.7yT r1 = X.C134847yT.A00(r0)
            int r0 = r2.compareTo(r1)
            if (r0 >= 0) goto L_0x0022
            r2 = r1
        L_0x0022:
            float r0 = r2.A00
            int r4 = r9.CfL(r0)
        L_0x0028:
            float r1 = r8.A00
            int r0 = java.lang.Float.compare(r1, r7)
            boolean r0 = X.C18180wK.A1W(r0)
            if (r0 != 0) goto L_0x0083
            X.7yT r2 = X.C134847yT.A00(r1)
            float r0 = (float) r5
            X.7yT r1 = X.C134847yT.A00(r0)
            int r0 = r2.compareTo(r1)
            if (r0 >= 0) goto L_0x0044
            r2 = r1
        L_0x0044:
            float r0 = r2.A00
            int r3 = r9.CfL(r0)
        L_0x004a:
            float r1 = r8.A03
            int r0 = java.lang.Float.compare(r1, r7)
            boolean r0 = X.C18180wK.A1W(r0)
            if (r0 != 0) goto L_0x0081
            int r2 = r9.CfL(r1)
            if (r2 <= r4) goto L_0x005d
            r2 = r4
        L_0x005d:
            if (r2 >= r5) goto L_0x0060
            r2 = 0
        L_0x0060:
            if (r2 == r6) goto L_0x0081
        L_0x0062:
            float r1 = r8.A02
            int r0 = java.lang.Float.compare(r1, r7)
            boolean r0 = X.C18180wK.A1W(r0)
            if (r0 != 0) goto L_0x0079
            int r0 = r9.CfL(r1)
            if (r0 <= r3) goto L_0x0075
            r0 = r3
        L_0x0075:
            if (r0 >= r5) goto L_0x007e
            r0 = 0
        L_0x0078:
            r5 = r0
        L_0x0079:
            long r0 = X.AnonymousClass7JT.A02(r2, r4, r5, r3)
            return r0
        L_0x007e:
            if (r0 == r6) goto L_0x0079
            goto L_0x0078
        L_0x0081:
            r2 = 0
            goto L_0x0062
        L_0x0083:
            r3 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x004a
        L_0x0087:
            r4 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass55A.A00(X.8nV):long");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass55A)) {
            return false;
        }
        AnonymousClass55A r4 = (AnonymousClass55A) obj;
        if (!C18180wK.A1W(Float.compare(this.A03, r4.A03)) || !C18180wK.A1W(Float.compare(this.A02, r4.A02)) || !C18180wK.A1W(Float.compare(this.A01, r4.A01)) || !C18180wK.A1W(Float.compare(this.A00, r4.A00)) || this.A04 != r4.A04) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86104wH.A05(C86104wH.A05(C86104wH.A05(C86134wK.A03(this.A03), this.A02), this.A01), this.A00);
    }

    public AnonymousClass55A(AnonymousClass0YY r1, float f, float f2, float f3, float f4, boolean z) {
        super(r1);
        this.A03 = f;
        this.A02 = f2;
        this.A01 = f3;
        this.A00 = f4;
        this.A04 = z;
    }

    public final /* synthetic */ Object ANM(Object obj, AnonymousClass0YP r3) {
        return C86104wH.A0g(obj, this, r3);
    }

    public final int BfA(C147148nT r5, C147838q0 r6, int i) {
        AnonymousClass0wJ.A1N(r6, r5);
        long A002 = A00(r6);
        int A012 = Constraints.A01(A002);
        if (A012 != Constraints.A03(A002)) {
            return AnonymousClass8bI.A03(A002, r5.Bf8(i));
        }
        return A012;
    }

    public final int BfD(C147148nT r5, C147838q0 r6, int i) {
        AnonymousClass0wJ.A1N(r6, r5);
        long A002 = A00(r6);
        int A022 = Constraints.A02(A002);
        if (A022 != Constraints.A04(A002)) {
            return AnonymousClass8bI.A04(A002, r5.BfB(i));
        }
        return A022;
    }

    public final C146098ld Bg3(C147578pZ r8, C147618pd r9, long j) {
        int A042;
        int A022;
        int A032;
        int A012;
        long A023;
        AnonymousClass0wJ.A1N(r9, r8);
        long A002 = A00(r9);
        if (this.A04) {
            A023 = AnonymousClass7JT.A05(j, A002);
        } else {
            if (!C18180wK.A1W(Float.compare(this.A03, Float.NaN))) {
                A042 = Constraints.A04(A002);
            } else {
                A042 = Constraints.A04(j);
                int A024 = Constraints.A02(A002);
                if (A042 > A024) {
                    A042 = A024;
                }
            }
            if (!C18180wK.A1W(Float.compare(this.A01, Float.NaN))) {
                A022 = Constraints.A02(A002);
            } else {
                A022 = Constraints.A02(j);
                int A043 = Constraints.A04(A002);
                if (A022 < A043) {
                    A022 = A043;
                }
            }
            if (!C18180wK.A1W(Float.compare(this.A02, Float.NaN))) {
                A032 = Constraints.A03(A002);
            } else {
                A032 = Constraints.A03(j);
                int A013 = Constraints.A01(A002);
                if (A032 > A013) {
                    A032 = A013;
                }
            }
            if (!C18180wK.A1W(Float.compare(this.A00, Float.NaN))) {
                A012 = Constraints.A01(A002);
            } else {
                A012 = Constraints.A01(j);
                int A033 = Constraints.A03(A002);
                if (A012 < A033) {
                    A012 = A033;
                }
            }
            A023 = AnonymousClass7JT.A02(A042, A022, A032, A012);
        }
        C123657Xy Bg4 = r8.Bg4(A023);
        return C147618pd.A00(r9, C86144wL.A16(Bg4, 43), Bg4.A01, Bg4.A00);
    }

    public final int BgL(C147148nT r5, C147838q0 r6, int i) {
        AnonymousClass0wJ.A1N(r6, r5);
        long A002 = A00(r6);
        int A012 = Constraints.A01(A002);
        if (A012 != Constraints.A03(A002)) {
            return AnonymousClass8bI.A03(A002, r5.BgJ(i));
        }
        return A012;
    }

    public final int BgO(C147148nT r5, C147838q0 r6, int i) {
        AnonymousClass0wJ.A1N(r6, r5);
        long A002 = A00(r6);
        int A022 = Constraints.A02(A002);
        if (A022 != Constraints.A04(A002)) {
            return AnonymousClass8bI.A04(A002, r5.BgM(i));
        }
        return A022;
    }
}
