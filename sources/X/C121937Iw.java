package X;

import androidx.compose.ui.Modifier;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape2S0701000_I2;
import kotlin.jvm.internal.KtLambdaShape34S0200000_I2_18;
import kotlin.jvm.internal.KtLambdaShape46S0200000_I2_7;
import kotlin.jvm.internal.KtLambdaShape8S0300000_I2_3;

/* renamed from: X.7Iw  reason: invalid class name and case insensitive filesystem */
public final class C121937Iw {
    public static final void A00(C147188nY r14, C144938jX r15, C144938jX r16, C144938jX r17, C144938jX r18, C144948jY r19, AnonymousClass0YY r20, AnonymousClass0YY r21, int i) {
        C144948jY r7 = r19;
        C04220Ms.A0B(r7, 0);
        C144938jX r8 = r15;
        AnonymousClass0YY r9 = r20;
        AnonymousClass0wJ.A1O(r9, r15);
        C144938jX r10 = r16;
        C04220Ms.A0B(r10, 3);
        C144938jX r11 = r17;
        C144938jX r12 = r18;
        C18190wL.A1S(r11, 4, r12);
        AnonymousClass0YY r13 = r21;
        C04220Ms.A0B(r13, 6);
        r14.Cvd(-1349677468);
        int i2 = i;
        if (r7.BLm()) {
            if (r7 instanceof AnonymousClass5N4) {
                r14.Cvb(1214584785);
                A04(r14, (AnonymousClass5N4) r7, r9, (i & 112) | 8);
            } else if (r7 instanceof AnonymousClass5N5) {
                r14.Cvb(1214584862);
                A01(r14, r15, (AnonymousClass5N5) r7, ((i >> 3) & 112) | 8);
            } else if (r7 instanceof AnonymousClass5N6) {
                r14.Cvb(1214584957);
                A02(r14, r10, (AnonymousClass5N6) r7, ((i >> 6) & 112) | 8);
            } else if (r7 instanceof AnonymousClass5N7) {
                r14.Cvb(1214585160);
                int i3 = i >> 12;
                A03(r14, r12, (AnonymousClass5N7) r7, r13, (i3 & 896) | (i3 & 112) | 8);
            } else {
                r14.Cvb(1214585248);
            }
            AnonymousClass7W3.A0z(r14, false);
        }
        C147178nW AKE = r14.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape2S0701000_I2(i2, 4, r7, r8, r9, r10, r11, r12, r13));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x007e, code lost:
        if (X.C18190wL.A07() >= java.lang.Long.parseLong(r4)) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C147188nY r17, X.C144938jX r18, X.AnonymousClass5N7 r19, X.AnonymousClass0YY r20, int r21) {
        /*
            r14 = 0
            r2 = r19
            X.C04220Ms.A0B(r2, r14)
            r3 = r18
            r1 = r20
            X.AnonymousClass0wJ.A1O(r3, r1)
            r0 = 379624820(0x16a09d74, float:2.594876E-25)
            r8 = r17
            r8.Cvd(r0)
            java.lang.Boolean r0 = r2.A05
            if (r0 == 0) goto L_0x0069
            boolean r5 = r0.booleanValue()
        L_0x001d:
            boolean r0 = r2.A0A
            if (r0 == 0) goto L_0x0053
            X.3Dd r0 = r2.A01
            r4 = 8
            java.lang.String r12 = X.AnonymousClass70M.A01(r8, r0)
            X.3Dd r0 = r2.A03
            java.lang.String r13 = X.AnonymousClass70M.A01(r8, r0)
            boolean r0 = r2.A09
            r16 = 10
            kotlin.jvm.internal.KtLambdaShape3S0310000_I2 r15 = new kotlin.jvm.internal.KtLambdaShape3S0310000_I2
            r17 = r2
            r18 = r1
            r19 = r3
            r20 = r5
            r15.<init>(r16, r17, r18, r19, r20)
            X.7ue r11 = new X.7ue
            r11.<init>(r15, r5)
            r9 = 0
            r15 = 18
            r10 = r9
            r16 = r0
            X.AnonymousClass70S.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.util.List r0 = r2.A07
            A05(r8, r0, r4)
        L_0x0053:
            X.8nW r0 = r8.AKE()
            if (r0 == 0) goto L_0x0068
            r6 = 33
            kotlin.jvm.internal.KtLambdaShape18S0301000_I2 r4 = new kotlin.jvm.internal.KtLambdaShape18S0301000_I2
            r5 = r21
            r7 = r3
            r8 = r1
            r9 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            r0.D9d(r4)
        L_0x0068:
            return
        L_0x0069:
            java.lang.String r4 = r2.A06
            java.lang.String r0 = "-1"
            boolean r0 = X.C04220Ms.A0I(r4, r0)
            if (r0 != 0) goto L_0x0080
            long r6 = X.C18190wL.A07()
            long r4 = java.lang.Long.parseLong(r4)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r5 = 1
            if (r0 < 0) goto L_0x001d
        L_0x0080:
            r5 = 0
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121937Iw.A03(X.8nY, X.8jX, X.5N7, X.0YY, int):void");
    }

    public static final void A05(C147188nY r5, List list, int i) {
        C04220Ms.A0B(list, 0);
        r5.Cvd(126137165);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C101166Qd.A00(r5, (Modifier) null, AnonymousClass70M.A01(r5, (C57943Dd) it.next()), 0, 2);
        }
        C147178nW AKE = r5.AKE();
        if (AKE != null) {
            C147178nW.A01(AKE, list, i, 18);
        }
    }

    public static final void A02(C147188nY r14, C144938jX r15, AnonymousClass5N6 r16, int i) {
        AnonymousClass5N6 r3 = r16;
        boolean A1Y = AnonymousClass0wJ.A1Y(r3, r15);
        C147188nY r6 = r14;
        r14.Cvd(-1249678339);
        if (r3.A06) {
            r14.Cvb(-547295293);
            Iterator A0z = AnonymousClass0wJ.A0z(r3.A04);
            while (A0z.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0z);
                AnonymousClass70S.A00(r6, (Modifier) null, (C115286uo) null, new C132867ud(C04220Ms.A0I(A0o.getKey(), r3.A02), new KtLambdaShape8S0300000_I2_3(21, r15, A0o, r3)), AnonymousClass70M.A01(r6, (C57943Dd) A0o.getValue()), (String) null, A1Y ? 1 : 0, 26, r3.A05);
            }
            AnonymousClass7W3.A0z(r6, A1Y);
            A05(r6, r3.A03, 8);
        }
        C147178nW AKE = r6.AKE();
        if (AKE != null) {
            C147178nW.A05(AKE, r15, r3, i, 42);
        }
    }

    public static final void A01(C147188nY r12, C144938jX r13, AnonymousClass5N5 r14, int i) {
        boolean A1Y = AnonymousClass0wJ.A1Y(r14, r13);
        C147188nY r4 = r12;
        r12.Cvd(-1810199711);
        if (r14.A06) {
            AnonymousClass70S.A00(r4, (Modifier) null, (C115286uo) null, new C132877ue(new KtLambdaShape46S0200000_I2_7(15, r14, r13), r14.A05), AnonymousClass70M.A01(r12, r14.A01), (String) null, A1Y ? 1 : 0, 26, r14.A04);
            A05(r4, r14.A03, 8);
        }
        C147178nW AKE = r4.AKE();
        if (AKE != null) {
            C147178nW.A05(AKE, r13, r14, i, 40);
        }
    }

    public static final void A04(C147188nY r13, AnonymousClass5N4 r14, AnonymousClass0YY r15, int i) {
        String A01;
        boolean A1Y = AnonymousClass0wJ.A1Y(r14, r15);
        C147188nY r4 = r13;
        r13.Cvd(-1208182455);
        String A012 = AnonymousClass70M.A01(r13, r14.A00);
        C57943Dd r1 = r14.A01;
        r13.Cvb(959697931);
        if (r1 == null) {
            A01 = null;
        } else {
            A01 = AnonymousClass70M.A01(r13, r1);
        }
        AnonymousClass7W3 A04 = AnonymousClass7W3.A04(r13, A1Y);
        Modifier A03 = AnonymousClass7HZ.A03(Modifier.A04(Modifier.A00), new KtLambdaShape34S0200000_I2_18(3, r15, r14), A1Y);
        r13.Cvb(959698090);
        AnonymousClass7W3.A0w(A04, A1Y);
        AnonymousClass70S.A00(r4, A03, (C115286uo) null, (C142508ey) null, A012, A01, 32768, 36, A1Y);
        C147178nW AKE = r13.AKE();
        if (AKE != null) {
            C147178nW.A05(AKE, r15, r14, i, 41);
        }
    }
}
