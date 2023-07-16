package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape6S1000000_I2;

/* renamed from: X.7HT  reason: invalid class name */
public final class AnonymousClass7HT {
    public AnonymousClass7HT A00;
    public boolean A01;
    public final int A02;
    public final AnonymousClass7Y3 A03;
    public final C147738pp A04;
    public final C134887yX A05;
    public final boolean A06;

    public AnonymousClass7HT(AnonymousClass7Y3 r2, C147738pp r3, boolean z) {
        C18180wK.A1P(r3, 1, r2);
        this.A04 = r3;
        this.A06 = z;
        this.A03 = r2;
        this.A05 = AnonymousClass6F3.A00(r3);
        this.A02 = r2.A0W;
    }

    private final void A02(List list) {
        List A0B = A0B(false);
        int size = A0B.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass7HT r1 = (AnonymousClass7HT) A0B.get(i);
            if (r1.A06 && r1.A05.A01) {
                list.add(r1);
            } else if (!r1.A05.A00) {
                r1.A02(list);
            }
        }
    }

    public final List A0A() {
        C134887yX r1 = this.A05;
        if (r1.A00) {
            return AnonymousClass0ZV.A00;
        }
        if (!this.A06 || !r1.A01) {
            return A0B(true);
        }
        ArrayList A0v = AnonymousClass0wJ.A0v();
        A02(A0v);
        return A0v;
    }

    public static AnonymousClass7F6 A00(Object obj) {
        AnonymousClass7HT r1 = (AnonymousClass7HT) obj;
        C04220Ms.A0B(r1, 0);
        return r1.A04();
    }

    private final void A01(C134887yX r11) {
        if (!this.A05.A00) {
            List A0B = A0B(false);
            int size = A0B.size();
            for (int i = 0; i < size; i++) {
                AnonymousClass7HT r6 = (AnonymousClass7HT) A0B.get(i);
                if (!r6.A06 || !r6.A05.A01) {
                    C134887yX r1 = r6.A05;
                    C04220Ms.A0B(r1, 0);
                    Iterator A0z = AnonymousClass0wJ.A0z(r1.A02);
                    while (A0z.hasNext()) {
                        Map.Entry A0o = C18180wK.A0o(A0z);
                        AnonymousClass77Z r4 = (AnonymousClass77Z) A0o.getKey();
                        Object value = A0o.getValue();
                        Map map = r11.A02;
                        Object obj = map.get(r4);
                        C04220Ms.A0C(r4, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object invoke = r4.A01.invoke(obj, value);
                        if (invoke != null) {
                            map.put(r4, invoke);
                        }
                    }
                    r6.A01(r11);
                }
            }
        }
    }

    public final AnonymousClass7F6 A05() {
        C147738pp r2;
        if (!this.A05.A01 || (r2 = AnonymousClass7FT.A00(this.A03)) == null) {
            r2 = this.A04;
        }
        if (((AnonymousClass7YG) r2).A03.A08) {
            boolean A1W = AnonymousClass0wJ.A1W(C115946wA.A01(r2.BAK(), C103976b2.A07));
            AnonymousClass54T A022 = C121847Ik.A02(r2, 8);
            if (!A1W) {
                C04220Ms.A0B(A022, 0);
                return C115896w5.A01(A022).Bax(A022, true);
            } else if (A022.BRS()) {
                C146508mM A012 = C115896w5.A01(A022);
                C113796s9 r4 = A022.A02;
                if (r4 == null) {
                    r4 = new C113796s9();
                    A022.A02 = r4;
                }
                long A0I = A022.A0I(A022.A09.D7K(A022.A0H.A0B.Avw()));
                r4.A01 = -AnonymousClass7JK.A02(A0I);
                r4.A03 = -AnonymousClass7JK.A00(A0I);
                r4.A02 = ((float) A022.A0B()) + AnonymousClass7JK.A02(A0I);
                r4.A00 = ((float) A022.A0A()) + AnonymousClass7JK.A00(A0I);
                while (A022 != A012) {
                    A022.A0R(r4, false, true);
                    if (r4.A01 < r4.A02 && r4.A03 < r4.A00) {
                        A022 = A022.A07;
                        C04220Ms.A0A(A022);
                    }
                }
                return new AnonymousClass7F6(r4.A01, r4.A03, r4.A02, r4.A00);
            }
        }
        return AnonymousClass7F6.A04;
    }

    public final AnonymousClass54T A06() {
        if (this.A01) {
            AnonymousClass7HT A08 = A08();
            if (A08 != null) {
                return A08.A06();
            }
            return null;
        }
        C147738pp A002 = AnonymousClass7FT.A00(this.A03);
        if (!this.A05.A01 || A002 == null) {
            A002 = this.A04;
        }
        return C121847Ik.A02(A002, 8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r4.A05.A01 == false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C134887yX A07() {
        /*
            r4 = this;
            boolean r0 = r4.A06
            if (r0 == 0) goto L_0x000b
            X.7yX r0 = r4.A05
            boolean r1 = r0.A01
            r0 = 1
            if (r1 != 0) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            X.7yX r3 = r4.A05
            if (r0 == 0) goto L_0x0028
            X.7yX r2 = new X.7yX
            r2.<init>()
            boolean r0 = r3.A01
            r2.A01 = r0
            boolean r0 = r3.A00
            r2.A00 = r0
            java.util.Map r1 = r2.A02
            java.util.Map r0 = r3.A02
            r1.putAll(r0)
            r3 = r2
            r4.A01(r2)
        L_0x0028:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7HT.A07():X.7yX");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass7HT A08() {
        /*
            r5 = this;
            X.7HT r2 = r5.A00
            if (r2 != 0) goto L_0x002c
            boolean r4 = r5.A06
            r3 = 0
            if (r4 == 0) goto L_0x002d
            X.7Y3 r2 = r5.A03
            X.8M4 r1 = X.AnonymousClass8M4.A00
        L_0x000d:
            X.7Y3 r2 = r2.A09()
            if (r2 == 0) goto L_0x002d
            java.lang.Object r0 = r1.invoke(r2)
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 == 0) goto L_0x000d
        L_0x001d:
            X.8pp r1 = X.AnonymousClass7FT.A01(r2)
            if (r1 == 0) goto L_0x0042
            X.7Y3 r0 = X.C121847Ik.A01(r1)
            X.7HT r2 = new X.7HT
            r2.<init>(r0, r1, r4)
        L_0x002c:
            return r2
        L_0x002d:
            X.7Y3 r2 = r5.A03
            X.8M5 r1 = X.AnonymousClass8M5.A00
        L_0x0031:
            X.7Y3 r2 = r2.A09()
            if (r2 == 0) goto L_0x0042
            java.lang.Object r0 = r1.invoke(r2)
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 == 0) goto L_0x0031
            goto L_0x001d
        L_0x0042:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7HT.A08():X.7HT");
    }

    public final List A09() {
        boolean z = this.A06;
        if (!(!z) && this.A05.A00) {
            return AnonymousClass0ZV.A00;
        }
        if (!z || !this.A05.A01) {
            return A0B(false);
        }
        ArrayList A0v = AnonymousClass0wJ.A0v();
        A02(A0v);
        return A0v;
    }

    public final List A0B(boolean z) {
        List list;
        String str;
        if (this.A01) {
            return AnonymousClass0ZV.A00;
        }
        ArrayList A0v = AnonymousClass0wJ.A0v();
        AnonymousClass7Y3 r0 = this.A03;
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        AnonymousClass7FT.A03(r0, A0v2);
        int size = A0v2.size();
        for (int i = 0; i < size; i++) {
            C147738pp r3 = (C147738pp) A0v2.get(i);
            A0v.add(new AnonymousClass7HT(C121847Ik.A01(r3), r3, this.A06));
        }
        if (!z) {
            return A0v;
        }
        C134887yX r6 = this.A05;
        Object A012 = C115946wA.A01(r6, C103986b3.A0J);
        if (A012 != null && r6.A01 && C18190wL.A1a(A0v)) {
            AnonymousClass7HT r02 = new AnonymousClass7HT(new AnonymousClass7Y3(true, this.A02 + 1000000000), new C876153l(C86154wM.A10(A012, 46)), false);
            r02.A01 = true;
            r02.A00 = this;
            A0v.add(r02);
        }
        AnonymousClass77Z r1 = C103986b3.A02;
        if (!r6.A01(r1) || !C18190wL.A1a(A0v) || !r6.A01 || (list = (List) C115946wA.A01(r6, r1)) == null || (str = (String) AnonymousClass00J.A0D(list)) == null) {
            return A0v;
        }
        AnonymousClass7HT r03 = new AnonymousClass7HT(new AnonymousClass7Y3(true, this.A02 + 2000000000), new C876153l(new KtLambdaShape6S1000000_I2(str, 2)), false);
        r03.A01 = true;
        r03.A00 = this;
        A0v.add(0, r03);
        return A0v;
    }

    public final AnonymousClass7F6 A03() {
        AnonymousClass7F6 Bax;
        AnonymousClass54T A062 = A06();
        if (A062 == null || !A062.BRS() || (Bax = C115896w5.A01(A062).Bax(A062, true)) == null) {
            return AnonymousClass7F6.A04;
        }
        return Bax;
    }

    public final AnonymousClass7F6 A04() {
        AnonymousClass7F6 A002;
        AnonymousClass54T A062 = A06();
        if (A062 == null || !A062.BRS() || (A002 = C115896w5.A00(A062)) == null) {
            return AnonymousClass7F6.A04;
        }
        return A002;
    }
}
