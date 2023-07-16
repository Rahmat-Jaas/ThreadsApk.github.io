package X;

import java.util.Map;

/* renamed from: X.78z  reason: invalid class name */
public abstract class AnonymousClass78z {
    public C147568pY A00;
    public boolean A01 = true;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final C147568pY A07;
    public final Map A08 = AnonymousClass0wJ.A0y();

    public static final void A00(C104166bL r5, AnonymousClass78z r6, AnonymousClass54T r7, int i) {
        long A0C;
        float A012;
        loop0:
        while (true) {
            float f = (float) i;
            A0C = C86104wH.A0C(f, f);
            do {
                C04220Ms.A0B(r7, 0);
                A0C = r7.A0K(A0C);
                r7 = r7.A07;
                C04220Ms.A0A(r7);
                if (C04220Ms.A0I(r7, r6.A07.Aoy())) {
                    break loop0;
                }
                C04220Ms.A0B(r7, 0);
            } while (!r7.A0G().AQ9().containsKey(r5));
            C18200wM.A1S(r7, r5);
            i = r7.ANp(r5);
        }
        if (r5 instanceof AnonymousClass54E) {
            A012 = AnonymousClass7KC.A02(A0C);
        } else {
            A012 = AnonymousClass7KC.A01(A0C);
        }
        int A022 = AnonymousClass8bA.A02(A012);
        Map map = r6.A08;
        if (map.containsKey(r5)) {
            int A042 = AnonymousClass0wJ.A04(AnonymousClass4WJ.A07(r5, map));
            C04220Ms.A0B(r5, 0);
            A022 = AnonymousClass0wJ.A04(C86164wN.A0a(Integer.valueOf(A042), r5.A00, A022));
        }
        C86154wM.A1T(r5, map, A022);
    }

    public final void A01() {
        this.A01 = true;
        C147568pY r2 = this.A07;
        C147568pY B00 = r2.B00();
        if (B00 != null) {
            if (this.A06) {
                B00.CeB();
            } else if (this.A02 || this.A05) {
                B00.requestLayout();
            }
            if (this.A04) {
                r2.CeB();
            }
            if (this.A03) {
                B00.requestLayout();
            }
            B00.AQ8().A01();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        if (r1.A03 == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0068, code lost:
        r0 = r0.AQ8();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r3.A03 != false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r3 = this;
            boolean r0 = r3.A06
            if (r0 != 0) goto L_0x0011
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x0011
            boolean r0 = r3.A04
            if (r0 != 0) goto L_0x0011
            boolean r1 = r3.A03
            r0 = 0
            if (r1 == 0) goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            X.8pY r2 = r3.A07
            if (r0 != 0) goto L_0x0038
            X.8pY r0 = r2.B00()
            if (r0 == 0) goto L_0x003a
            X.78z r0 = r0.AQ8()
            X.8pY r2 = r0.A00
            if (r2 == 0) goto L_0x003b
            X.78z r1 = r2.AQ8()
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x0038
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x0038
            boolean r0 = r1.A04
            if (r0 != 0) goto L_0x0038
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x003b
        L_0x0038:
            r3.A00 = r2
        L_0x003a:
            return
        L_0x003b:
            X.8pY r2 = r3.A00
            if (r2 == 0) goto L_0x003a
            X.78z r1 = r2.AQ8()
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x003a
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x003a
            boolean r0 = r1.A04
            if (r0 != 0) goto L_0x003a
            boolean r0 = r1.A03
            if (r0 != 0) goto L_0x003a
            X.8pY r0 = r2.B00()
            if (r0 == 0) goto L_0x0062
            X.78z r0 = r0.AQ8()
            if (r0 == 0) goto L_0x0062
            r0.A02()
        L_0x0062:
            X.8pY r0 = r2.B00()
            if (r0 == 0) goto L_0x0071
            X.78z r0 = r0.AQ8()
            if (r0 == 0) goto L_0x0071
            X.8pY r2 = r0.A00
            goto L_0x0038
        L_0x0071:
            r2 = 0
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass78z.A02():void");
    }

    public AnonymousClass78z(C147568pY r2) {
        this.A07 = r2;
    }
}
