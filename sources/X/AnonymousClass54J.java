package X;

import androidx.compose.ui.platform.AndroidComposeView;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape3S0100100_I2;

/* renamed from: X.54J  reason: invalid class name */
public final class AnonymousClass54J extends C123657Xy implements C147578pZ, C147568pY {
    public float A00;
    public long A01 = C121127Eg.A01;
    public Object A02;
    public AnonymousClass0YY A03;
    public boolean A04 = true;
    public boolean A05;
    public boolean A06 = true;
    public boolean A07;
    public boolean A08;
    public final AnonymousClass84X A09 = AnonymousClass84X.A01(new C147578pZ[16]);
    public final AnonymousClass78z A0A = new AnonymousClass54N(this);
    public final /* synthetic */ C113976sU A0B;

    public final void ANO(AnonymousClass0YY r5) {
        C04220Ms.A0B(r5, 0);
        List A042 = this.A0B.A07.A08().A04();
        int size = A042.size();
        for (int i = 0; i < size; i++) {
            r5.invoke(((AnonymousClass7Y3) A042.get(i)).A0Y.A08);
        }
    }

    public final int ANp(C104166bL r8) {
        Integer num;
        C04220Ms.A0B(r8, 0);
        AnonymousClass7Y3 r6 = this.A0B.A07;
        AnonymousClass7Y3 A092 = r6.A09();
        Integer num2 = null;
        if (A092 != null) {
            num = A092.A0Y.A01;
        } else {
            num = null;
        }
        if (num == AnonymousClass006.A00) {
            this.A0A.A06 = true;
        } else {
            if (A092 != null) {
                num2 = A092.A0Y.A01;
            }
            if (num2 == AnonymousClass006.A0C) {
                this.A0A.A05 = true;
            }
        }
        this.A08 = true;
        int ANp = r6.A0a.A04.ANp(r8);
        this.A08 = false;
        return ANp;
    }

    public AnonymousClass54J(C113976sU r3) {
        this.A0B = r3;
    }

    private final void A00() {
        Integer num;
        AnonymousClass7Y3 r4 = this.A0B.A07;
        r4.A0P(false);
        AnonymousClass7Y3 A092 = r4.A09();
        if (A092 != null && r4.A0F == AnonymousClass006.A0C) {
            int intValue = A092.A0Y.A01.intValue();
            if (intValue == 0) {
                num = AnonymousClass006.A00;
            } else if (intValue != 2) {
                num = A092.A0F;
            } else {
                num = AnonymousClass006.A01;
            }
            C04220Ms.A0B(num, 0);
            r4.A0F = num;
        }
    }

    public static final void A01(AnonymousClass54J r4, AnonymousClass0YY r5, float f, long j) {
        r4.A01 = j;
        r4.A00 = f;
        r4.A03 = r5;
        r4.A07 = true;
        r4.A0A.A03 = false;
        C113976sU r42 = r4.A0B;
        AnonymousClass7Y3 r2 = r42.A07;
        C112956qT r1 = ((AndroidComposeView) AnonymousClass6F0.A00(r2)).A0Y;
        r1.A00(r2, new AnonymousClass8E4(r42, r5, f, j), r1.A02);
    }

    public final void A0E(AnonymousClass0YY r4, float f, long j) {
        if (j != this.A01) {
            A0F();
        }
        C113976sU r1 = this.A0B;
        r1.A01 = AnonymousClass006.A0C;
        A01(this, r4, f, j);
        r1.A01 = AnonymousClass006.A0Y;
    }

    public final void A0F() {
        C113976sU r1 = this.A0B;
        if (r1.A00 > 0) {
            List A042 = r1.A07.A08().A04();
            int size = A042.size();
            for (int i = 0; i < size; i++) {
                ((AnonymousClass7Y3) A042.get(i)).A0Y.A08.A0F();
            }
        }
    }

    public final boolean A0G(long j) {
        boolean z;
        C113976sU r9 = this.A0B;
        AnonymousClass7Y3 r10 = r9.A07;
        C147098nO A002 = AnonymousClass6F0.A00(r10);
        AnonymousClass7Y3 A092 = r10.A09();
        boolean z2 = true;
        if (r10.A0K || (A092 != null && A092.A0K)) {
            z = true;
        } else {
            z = false;
        }
        r10.A0K = z;
        if (r10.A0Y.A06 || this.A03 != j) {
            this.A0A.A04 = false;
            ANO(C138698Lc.A00);
            this.A05 = true;
            AnonymousClass7IW r8 = r10.A0a;
            long j2 = r8.A04.A02;
            A0D(j);
            Integer num = r9.A01;
            Integer num2 = AnonymousClass006.A0Y;
            if (num == num2) {
                Integer num3 = AnonymousClass006.A00;
                r9.A01 = num3;
                r9.A06 = false;
                C112956qT r2 = ((AndroidComposeView) AnonymousClass6F0.A00(r10)).A0Y;
                r2.A00(r10, new KtLambdaShape3S0100100_I2(j, r9, 2), r2.A06);
                if (r9.A01 == num3) {
                    r9.A02 = true;
                    r9.A03 = true;
                    r9.A01 = num2;
                }
                AnonymousClass54T r6 = r8.A04;
                if (r6.A02 == j2 && r6.A01 == this.A01 && r6.A00 == this.A00) {
                    z2 = false;
                }
                A0C(AnonymousClass7FV.A00(r6.A01, r6.A00));
                return z2;
            }
            throw C18180wK.A0a("layout state is not idle before measure starts");
        }
        ((AndroidComposeView) A002).A0X.A03(r10);
        r10.A0I();
        return false;
    }

    public final Map ABU() {
        if (!this.A08) {
            C113976sU r3 = this.A0B;
            Integer num = r3.A01;
            Integer num2 = AnonymousClass006.A00;
            AnonymousClass78z r2 = this.A0A;
            if (num == num2) {
                r2.A04 = true;
                if (r2.A01) {
                    r3.A02 = true;
                    r3.A03 = true;
                }
            } else {
                r2.A03 = true;
            }
        }
        AnonymousClass54T Aoy = Aoy();
        Aoy.A00 = true;
        BaV();
        Aoy.A00 = false;
        return this.A0A.A08;
    }

    public final AnonymousClass78z AQ8() {
        return this.A0A;
    }

    public final AnonymousClass54T Aoy() {
        return this.A0B.A07.A0a.A06;
    }

    public final C147568pY B00() {
        C113976sU r0;
        AnonymousClass7Y3 A092 = this.A0B.A07.A09();
        if (A092 == null || (r0 = A092.A0Y) == null) {
            return null;
        }
        return r0.A08;
    }

    public final boolean BX8() {
        return this.A0B.A07.A0N;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r9 = r7.A07;
        r0 = r9.A08();
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BaV() {
        /*
            r11 = this;
            X.78z r3 = r11.A0A
            r3.A02()
            X.6sU r7 = r11.A0B
            boolean r0 = r7.A02
            if (r0 == 0) goto L_0x004d
            X.7Y3 r9 = r7.A07
            X.84X r0 = r9.A08()
            int r8 = r0.A00
            if (r8 <= 0) goto L_0x004d
            java.lang.Object[] r6 = r0.A01
            r5 = 0
        L_0x0018:
            r10 = r6[r5]
            X.7Y3 r10 = (X.AnonymousClass7Y3) r10
            X.6sU r0 = r10.A0Y
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x0049
            java.lang.Integer r1 = r10.A0G
            java.lang.Integer r0 = X.AnonymousClass006.A00
            if (r1 != r0) goto L_0x0049
            X.6sU r0 = r10.A0Y
            X.54J r1 = r0.A08
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x0049
            long r1 = r1.A03
            java.lang.Integer r4 = r10.A0F
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            if (r4 != r0) goto L_0x003b
            r10.A0B()
        L_0x003b:
            X.6sU r0 = r10.A0Y
            X.54J r0 = r0.A08
            boolean r0 = r0.A0G(r1)
            if (r0 == 0) goto L_0x0049
            r0 = 0
            r9.A0P(r0)
        L_0x0049:
            int r5 = r5 + 1
            if (r5 < r8) goto L_0x0018
        L_0x004d:
            boolean r0 = r7.A03
            if (r0 != 0) goto L_0x0061
            boolean r0 = r11.A08
            if (r0 != 0) goto L_0x0082
            X.54T r0 = r11.Aoy()
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0082
            boolean r0 = r7.A02
            if (r0 == 0) goto L_0x0082
        L_0x0061:
            r6 = 0
            r7.A02 = r6
            java.lang.Integer r5 = r7.A01
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            r7.A01 = r0
            X.7Y3 r4 = r7.A07
            X.8nO r0 = X.AnonymousClass6F0.A00(r4)
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
            X.6qT r2 = r0.A0Y
            r0 = 7
            kotlin.jvm.internal.KtLambdaShape5S0300000_I2 r1 = X.C86154wM.A15(r4, r11, r7, r0)
            X.0YY r0 = r2.A01
            r2.A00(r4, r1, r0)
            r7.A01 = r5
            r7.A03 = r6
        L_0x0082:
            boolean r0 = r3.A05
            if (r0 == 0) goto L_0x0089
            r0 = 1
            r3.A02 = r0
        L_0x0089:
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x00b6
            r3.A02()
            X.8pY r0 = r3.A00
            if (r0 == 0) goto L_0x00b6
            java.util.Map r2 = r3.A08
            r2.clear()
            X.8pY r1 = r3.A07
            r0 = 36
            kotlin.jvm.internal.KtLambdaShape147S0100000_I2_2 r0 = X.C86154wM.A10(r3, r0)
            r1.ANO(r0)
            X.54T r0 = r1.Aoy()
            r1 = 0
            X.8ld r0 = r0.A0G()
            java.util.Map r0 = r0.AQ9()
            r2.putAll(r0)
            r3.A01 = r1
        L_0x00b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass54J.BaV():void");
    }

    public final C123657Xy Bg4(long j) {
        String str;
        AnonymousClass7Y3 r4 = this.A0B.A07;
        Integer num = r4.A0F;
        Integer num2 = AnonymousClass006.A0C;
        if (num == num2) {
            r4.A0B();
        }
        AnonymousClass7Y3 A092 = r4.A09();
        if (A092 != null) {
            Integer num3 = r4.A0G;
            if (num3 == num2 || r4.A0K) {
                Integer num4 = A092.A0Y.A01;
                int intValue = num4.intValue();
                if (intValue == 0) {
                    num2 = AnonymousClass006.A00;
                } else if (intValue == 2) {
                    num2 = AnonymousClass006.A01;
                } else {
                    throw C18180wK.A0a(AnonymousClass00U.A0L("Measurable could be only measured from the parent's measure or layout block. Parents state is ", C98306Ez.A00(num4)));
                }
            } else {
                if (num3 != null) {
                    switch (num3.intValue()) {
                        case 1:
                            str = "InLayoutBlock";
                            break;
                        case 2:
                            str = "NotUsed";
                            break;
                        default:
                            str = "InMeasureBlock";
                            break;
                    }
                } else {
                    str = "null";
                }
                throw C18180wK.A0a(AnonymousClass00U.A0e("measure() may not be called multiple times on the same Measurable. Current state ", str, ". Parent state ", C98306Ez.A00(A092.A0Y.A01), '.'));
            }
        }
        r4.A0G = num2;
        A0G(j);
        return this;
    }

    public final void CeB() {
        this.A0B.A07.A0P(false);
    }

    public final void requestLayout() {
        this.A0B.A07.A0O(false);
    }

    public final int Bf8(int i) {
        A00();
        return this.A0B.A07.A0a.A04.Bf8(i);
    }

    public final int BfB(int i) {
        A00();
        return this.A0B.A07.A0a.A04.BfB(i);
    }

    public final int BgJ(int i) {
        A00();
        return this.A0B.A07.A0a.A04.BgJ(i);
    }

    public final int BgM(int i) {
        A00();
        return this.A0B.A07.A0a.A04.BgM(i);
    }
}
