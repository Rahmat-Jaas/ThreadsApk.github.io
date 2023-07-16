package com.instagram.debug.devoptions.igds.compose;

import X.AnonymousClass0YM;
import X.AnonymousClass0ZU;
import X.AnonymousClass70R;
import X.AnonymousClass74X;
import X.AnonymousClass7Ad;
import X.AnonymousClass7GN;
import X.AnonymousClass7I9;
import X.AnonymousClass7K4;
import X.AnonymousClass7KP;
import X.AnonymousClass7KV;
import X.AnonymousClass7W3;
import X.AnonymousClass7WO;
import X.AnonymousClass7WR;
import X.C114236su;
import X.C115686vk;
import X.C121117Ee;
import X.C121807If;
import X.C122847Ub;
import X.C123327Wm;
import X.C134817yQ;
import X.C146288ly;
import X.C147178nW;
import X.C147188nY;
import X.C147258p3;
import X.C147368pE;
import X.C86164wN;
import X.C98236Es;
import androidx.compose.ui.Modifier;

public final class IgdsSearchBarComposeFragmentKt {
    public static final void IgdsSearchBarExamples(C147188nY r27, int i) {
        C147188nY r11 = r27;
        r11.Cvd(1390911473);
        int i2 = i;
        if (i != 0 || !r11.BCM()) {
            C122847Ub A00 = AnonymousClass7Ad.A00(r11);
            C123327Wm r7 = Modifier.A00;
            Modifier A01 = AnonymousClass7Ad.A01(A00, AnonymousClass7K4.A07(Modifier.A04(r7), 0));
            C146288ly A05 = AnonymousClass7KV.A05(r11);
            Object A0p = C147188nY.A0p(r11);
            Object A0n = C147188nY.A0n(r11);
            Object A0m = C147188nY.A0m(r11);
            AnonymousClass0ZU r3 = AnonymousClass74X.A00;
            AnonymousClass0YM A002 = C98236Es.A00(A01);
            AnonymousClass7W3 r0 = (AnonymousClass7W3) r11;
            C147188nY.A0w(r11, r0, r3);
            AnonymousClass7W3.A0a(r11, r0, A05, A0p);
            AnonymousClass7KP.A07(r11, A0n, A0m, A002);
            r11.Cvb(-47850309);
            AnonymousClass7I9.A02(r11, (Modifier) null, (C121807If) null, (C114236su) null, (C134817yQ) null, (C121117Ee) null, "Default search bar", 0, 0, 0, 6, 0, 4094, 0, 0, false);
            Object A0r = C147188nY.A0r(r11, r0, -492369756);
            Object obj = AnonymousClass7GN.A00;
            if (A0r == obj) {
                A0r = AnonymousClass7WR.A00(r0, "");
            }
            AnonymousClass7W3.A0w(r0, false);
            C147368pE r8 = (C147368pE) A0r;
            String A0e = C86164wN.A0e(r8);
            boolean A0z = C147188nY.A0z(r11, r8, 1157296644);
            Object A13 = r0.A13();
            if (A0z || A13 == obj) {
                A13 = new IgdsSearchBarComposeFragmentKt$IgdsSearchBarExamples$1$1$1(r8);
                r0.A14(A13);
            }
            AnonymousClass70R.A00((C147258p3) null, r11, (Modifier) null, A0e, (String) null, AnonymousClass7W3.A0A(r0, A13, false), 0, 28);
            float f = (float) 12;
            C115686vk.A00(r11, r7, f);
            AnonymousClass7I9.A02(r11, (Modifier) null, (C121807If) null, (C114236su) null, (C134817yQ) null, (C121117Ee) null, "Search bar with long placeholder", 0, 0, 0, 6, 0, 4094, 0, 0, false);
            Object A0r2 = C147188nY.A0r(r11, r0, -492369756);
            if (A0r2 == obj) {
                A0r2 = AnonymousClass7WR.A00(r0, "");
            }
            AnonymousClass7W3.A0w(r0, false);
            C147368pE r82 = (C147368pE) A0r2;
            String A0e2 = C86164wN.A0e(r82);
            boolean A0z2 = C147188nY.A0z(r11, r82, 1157296644);
            Object A132 = r0.A13();
            if (A0z2 || A132 == obj) {
                A132 = new IgdsSearchBarComposeFragmentKt$IgdsSearchBarExamples$1$2$1(r82);
                r0.A14(A132);
            }
            AnonymousClass70R.A00((C147258p3) null, r11, (Modifier) null, A0e2, "Long placeholder meant to ellipsize to show how the placeholder text will ellipsize since the placeholder is way too long to fit.", AnonymousClass7W3.A0A(r0, A132, false), 3072, 20);
            C115686vk.A00(r11, r7, f);
            AnonymousClass7I9.A02(r11, (Modifier) null, (C121807If) null, (C114236su) null, (C134817yQ) null, (C121117Ee) null, "Search bar with value pre-filled", 0, 0, 0, 6, 0, 4094, 0, 0, false);
            Object A0r3 = C147188nY.A0r(r11, r0, -492369756);
            if (A0r3 == obj) {
                A0r3 = AnonymousClass7WR.A00(r0, "Some prefilled value in this search bar");
            }
            AnonymousClass7W3.A0w(r0, false);
            C147368pE r5 = (C147368pE) A0r3;
            String A0e3 = C86164wN.A0e(r5);
            boolean A0z3 = C147188nY.A0z(r11, r5, 1157296644);
            Object A133 = r0.A13();
            if (A0z3 || A133 == obj) {
                A133 = new IgdsSearchBarComposeFragmentKt$IgdsSearchBarExamples$1$3$1(r5);
                r0.A14(A133);
            }
            AnonymousClass70R.A00((C147258p3) null, r11, (Modifier) null, A0e3, (String) null, AnonymousClass7W3.A0A(r0, A133, false), 0, 28);
            AnonymousClass7W3.A0f(r0);
        } else {
            r11.CuJ();
        }
        C147178nW AKE = r11.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new IgdsSearchBarComposeFragmentKt$IgdsSearchBarExamples$2(i2));
        }
    }

    public static final String IgdsSearchBarExamples$lambda$12$lambda$1(C147368pE r0) {
        return C86164wN.A0e(r0);
    }

    public static final String IgdsSearchBarExamples$lambda$12$lambda$5(C147368pE r0) {
        return C86164wN.A0e(r0);
    }

    public static final String IgdsSearchBarExamples$lambda$12$lambda$9(C147368pE r0) {
        return C86164wN.A0e(r0);
    }

    public static final void IgdsSearchBarExamples$lambda$12$lambda$10(C147368pE r0, String str) {
        r0.CrC(str);
    }

    public static final void IgdsSearchBarExamples$lambda$12$lambda$2(C147368pE r0, String str) {
        r0.CrC(str);
    }

    public static final void IgdsSearchBarExamples$lambda$12$lambda$6(C147368pE r0, String str) {
        r0.CrC(str);
    }
}
