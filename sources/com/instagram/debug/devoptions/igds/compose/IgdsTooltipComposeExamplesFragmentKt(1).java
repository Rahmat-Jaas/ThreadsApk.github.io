package com.instagram.debug.devoptions.igds.compose;

import X.AnonymousClass00U;
import X.AnonymousClass0YM;
import X.AnonymousClass0ZU;
import X.AnonymousClass672;
import X.AnonymousClass70P;
import X.AnonymousClass72M;
import X.AnonymousClass74X;
import X.AnonymousClass7GN;
import X.AnonymousClass7Hx;
import X.AnonymousClass7J3;
import X.AnonymousClass7KP;
import X.AnonymousClass7KV;
import X.AnonymousClass7Kq;
import X.AnonymousClass7W3;
import X.AnonymousClass7WO;
import X.AnonymousClass7WR;
import X.C04220Ms;
import X.C115686vk;
import X.C120767Cj;
import X.C123327Wm;
import X.C142878fk;
import X.C143128g9;
import X.C146288ly;
import X.C146348m5;
import X.C147178nW;
import X.C147188nY;
import X.C147258p3;
import X.C147368pE;
import X.C305121p;
import X.C86104wH;
import X.C86114wI;
import X.C968666z;
import X.C98236Es;
import androidx.compose.ui.Modifier;

public final class IgdsTooltipComposeExamplesFragmentKt {
    public static final void Example(String str, AnonymousClass672 r19, C305121p r20, String str2, C147188nY r22, int i) {
        int i2;
        C147188nY r3 = r22;
        r3.Cvd(1051319513);
        int i3 = i;
        int i4 = i & 14;
        String str3 = str;
        if (i4 == 0) {
            i2 = C147188nY.A0F(r3, str3) | i3;
        } else {
            i2 = i3;
        }
        AnonymousClass672 r7 = r19;
        if ((i3 & 112) == 0) {
            i2 |= C147188nY.A0G(r3, r7);
        }
        C305121p r5 = r20;
        if ((i3 & 896) == 0) {
            i2 |= C147188nY.A0H(r3, r5);
        }
        String str4 = str2;
        if ((i3 & 7168) == 0) {
            i2 |= C147188nY.A0I(r3, str4);
        }
        if ((i2 & 5851) != 1170 || !r3.BCM()) {
            AnonymousClass7W3 r1 = (AnonymousClass7W3) r3;
            Object A13 = r1.A13();
            Object obj = AnonymousClass7GN.A00;
            if (A13 == obj) {
                A13 = AnonymousClass7WR.A00(r1, false);
            }
            C147368pE r10 = (C147368pE) A13;
            C123327Wm A01 = Modifier.A01(r3);
            C146288ly A00 = C120767Cj.A00(r3, AnonymousClass7KV.A0E, false);
            Object A0p = C147188nY.A0p(r3);
            Object A0n = C147188nY.A0n(r3);
            Object A0m = C147188nY.A0m(r3);
            AnonymousClass0ZU r11 = AnonymousClass74X.A00;
            AnonymousClass0YM A002 = C98236Es.A00(A01);
            C147188nY.A0w(r3, r1, r11);
            AnonymousClass7W3.A0a(r3, r1, A00, A0p);
            AnonymousClass7KP.A07(r3, A0n, A0m, A002);
            r3.Cvb(-1627185773);
            boolean A0z = C147188nY.A0z(r3, r10, 1157296644);
            Object A132 = r1.A13();
            if (A0z || A132 == obj) {
                A132 = new IgdsTooltipComposeExamplesFragmentKt$Example$1$1$1(r10);
                r1.A14(A132);
            }
            AnonymousClass70P.A00((C147258p3) null, r3, (Modifier) null, (C968666z) null, (C146348m5) null, str4, AnonymousClass7W3.A08(r1, A132, false), (i2 >> 6) & 112, 252, false, false);
            boolean A1X = C86104wH.A1X(r10);
            boolean A0z2 = C147188nY.A0z(r3, r10, 1157296644);
            Object A133 = r1.A13();
            if (A0z2 || A133 == obj) {
                A133 = new IgdsTooltipComposeExamplesFragmentKt$Example$1$2$1(r10);
                r1.A14(A133);
            }
            AnonymousClass7Hx.A01(r3, (C143128g9) null, r7, r5, str3, AnonymousClass7W3.A08(r1, A133, false), (i2 & 14) | ((i2 << 3) & 896) | (57344 & (i2 << 6)), 224, 0, A1X, false);
            AnonymousClass7W3.A0f(r1);
        } else {
            r3.CuJ();
        }
        C147178nW AKE = r3.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new IgdsTooltipComposeExamplesFragmentKt$Example$2(str3, r7, r5, str4, i3));
        }
    }

    public static final boolean Example$lambda$2(C147368pE r0) {
        return C86104wH.A1X(r0);
    }

    public static final void TooltipExamples(C147188nY r12, int i) {
        C147188nY r11 = r12;
        r12.Cvd(-1798615909);
        if (i != 0 || !r12.BCM()) {
            C142878fk r1 = AnonymousClass7KV.A00;
            C123327Wm A00 = Modifier.A00(r12);
            C146288ly A002 = AnonymousClass72M.A00(AnonymousClass7J3.A07, r12, r1);
            Object A0p = C147188nY.A0p(r12);
            Object A0n = C147188nY.A0n(r12);
            Object A0m = C147188nY.A0m(r12);
            AnonymousClass0ZU r13 = AnonymousClass74X.A00;
            AnonymousClass0YM A003 = C98236Es.A00(A00);
            AnonymousClass7W3 r4 = (AnonymousClass7W3) r11;
            C147188nY.A0w(r12, r4, r13);
            AnonymousClass7W3.A0a(r12, r4, A002, A0p);
            AnonymousClass7KP.A07(r12, A0n, A0m, A003);
            r12.Cvb(1057589605);
            for (C305121p r9 : C305121p.values()) {
                String replace = C86114wI.A0o(r9.name()).replace('_', ' ');
                C04220Ms.A06(replace);
                ComposeShowcaseComponentsKt.ShowcaseSectionHeader(AnonymousClass00U.A0L("Theme: ", replace), r11, 0);
                Example("Up tooltip", AnonymousClass672.UP_CENTER, r9, "Show Up Tooltip", r11, 3126);
                Example("Down tooltip", AnonymousClass672.DOWN_CENTER, r9, "Show Down Tooltip", r11, 3126);
                C115686vk.A01(r11, AnonymousClass7Kq.A08(A00, (float) 12), 6);
            }
            AnonymousClass7W3.A0f(r4);
        } else {
            r12.CuJ();
        }
        C147178nW AKE = r11.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new IgdsTooltipComposeExamplesFragmentKt$TooltipExamples$2(i));
        }
    }

    public static final void Example$lambda$3(C147368pE r0, boolean z) {
        C147368pE.A04(r0, z);
    }
}
