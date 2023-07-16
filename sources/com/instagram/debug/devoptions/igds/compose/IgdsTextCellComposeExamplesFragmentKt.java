package com.instagram.debug.devoptions.igds.compose;

import X.AnonymousClass0YM;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass54z;
import X.AnonymousClass671;
import X.AnonymousClass6QP;
import X.AnonymousClass70S;
import X.AnonymousClass74X;
import X.AnonymousClass7Ad;
import X.AnonymousClass7GN;
import X.AnonymousClass7KP;
import X.AnonymousClass7KV;
import X.AnonymousClass7Kq;
import X.AnonymousClass7W3;
import X.AnonymousClass7WO;
import X.AnonymousClass7WR;
import X.C101156Qc;
import X.C101166Qd;
import X.C101176Qe;
import X.C115286uo;
import X.C123327Wm;
import X.C132857uc;
import X.C132867ud;
import X.C132877ue;
import X.C146288ly;
import X.C147178nW;
import X.C147188nY;
import X.C147368pE;
import X.C18180wK;
import X.C86104wH;
import X.C968867b;
import X.C98236Es;
import androidx.compose.ui.Modifier;
import com.instagram.barcelona.R;

public final class IgdsTextCellComposeExamplesFragmentKt {
    public static final void IgdsTextCellComposeExamples(C147188nY r44, int i) {
        C147188nY r15 = r44;
        r15.Cvd(-1436387806);
        int i2 = i;
        if (i != 0 || !r15.BCM()) {
            C123327Wm r4 = Modifier.A00;
            AnonymousClass54z r3 = AnonymousClass7Kq.A02;
            Modifier A01 = AnonymousClass7Ad.A01(AnonymousClass7Ad.A00(r15), r4.Cx6(r3));
            C146288ly A05 = AnonymousClass7KV.A05(r15);
            Object A0p = C147188nY.A0p(r15);
            Object A0n = C147188nY.A0n(r15);
            Object A0m = C147188nY.A0m(r15);
            AnonymousClass0ZU r0 = AnonymousClass74X.A00;
            AnonymousClass0YM A00 = C98236Es.A00(A01);
            AnonymousClass7W3 r2 = (AnonymousClass7W3) r15;
            C147188nY.A0w(r15, r2, r0);
            AnonymousClass7W3.A0a(r15, r2, A05, A0p);
            Integer A0l = C147188nY.A0l(r15, AnonymousClass7KP.A01(r15, A0n, A0m), A00);
            C101176Qe.A00(r15, Modifier.A03(r15, r4, r3, 1227280792), (AnonymousClass671) null, "Header", (String) null, (AnonymousClass0ZU) null, 54, 124, false, false);
            C101176Qe.A00(r15, r4.Cx6(r3), (AnonymousClass671) null, "Header with action", "Action", (AnonymousClass0ZU) null, 3126, 116, false, false);
            C101176Qe.A00(r15, r4.Cx6(r3), (AnonymousClass671) null, "Header with disabled action", "Action", (AnonymousClass0ZU) null, 27702, 100, false, false);
            Modifier Cx6 = r4.Cx6(r3);
            AnonymousClass671 r22 = AnonymousClass671.Mini;
            C147188nY r20 = r15;
            C101176Qe.A00(r20, Cx6, r22, "Mini header", (String) null, (AnonymousClass0ZU) null, 438, 120, false, false);
            C101176Qe.A00(r15, r4.Cx6(r3), r22, "Mini header wraps to at most two lines and then ellipsizes. Here's some extra content to help make sure that the mini header isn't going to fit on two lines of the screen.", (String) null, (AnonymousClass0ZU) null, 438, 120, false, false);
            C101176Qe.A00(r15, r4.Cx6(r3), r22, "Mini header", "Action", (AnonymousClass0ZU) null, 3510, 112, false, false);
            Object A0r = C147188nY.A0r(r15, r2, -492369756);
            Object obj = AnonymousClass7GN.A00;
            if (A0r == obj) {
                A0r = AnonymousClass7WR.A00(r2, A0l);
            }
            AnonymousClass7W3.A0w(r2, false);
            C147368pE r1 = (C147368pE) A0r;
            Modifier Cx62 = r4.Cx6(r3);
            boolean A1W = C18180wK.A1W(AnonymousClass0wJ.A04(r1.getValue()));
            boolean A0z = C147188nY.A0z(r15, r1, 1157296644);
            Object A13 = r2.A13();
            if (A0z || A13 == obj) {
                A13 = new IgdsTextCellComposeExamplesFragmentKt$IgdsTextCellComposeExamples$1$1$1(r1);
                r2.A14(A13);
            }
            C147188nY r34 = r15;
            AnonymousClass70S.A00(r34, Cx62, (C115286uo) null, new C132867ud(A1W, AnonymousClass7W3.A09(r2, A13, false)), "RadioButton list cell", (String) null, 54, 28, false);
            Modifier Cx63 = r4.Cx6(r3);
            C115286uo A002 = AnonymousClass6QP.A00(r15, R.drawable.instagram_cake_pano_outline_24);
            boolean A1T = AnonymousClass0wJ.A1T(AnonymousClass0wJ.A04(r1.getValue()), 1);
            boolean A0z2 = C147188nY.A0z(r15, r1, 1157296644);
            Object A132 = r2.A13();
            if (A0z2 || A132 == obj) {
                A132 = new IgdsTextCellComposeExamplesFragmentKt$IgdsTextCellComposeExamples$1$2$1(r1);
                r2.A14(A132);
            }
            AnonymousClass70S.A00(r34, Cx63, A002, new C132867ud(A1T, AnonymousClass7W3.A09(r2, A132, false)), "RadioButton list cell", (String) null, 32822, 12, false);
            AnonymousClass70S.A00(r34, r4.Cx6(r3), AnonymousClass6QP.A00(r15, R.drawable.instagram_cake_pano_outline_24), new C132867ud(false, IgdsTextCellComposeExamplesFragmentKt$IgdsTextCellComposeExamples$1$3.INSTANCE), "RadioButton list cell (disabled)", (String) null, 33206, 8, false);
            AnonymousClass70S.A00(r34, r4.Cx6(r3), AnonymousClass6QP.A00(r15, R.drawable.instagram_cake_pano_outline_24), new C132867ud(true, IgdsTextCellComposeExamplesFragmentKt$IgdsTextCellComposeExamples$1$4.INSTANCE), "RadioButton list cell (disabled and selected)", (String) null, 33206, 8, false);
            Object A0r2 = C147188nY.A0r(r15, r2, -492369756);
            if (A0r2 == obj) {
                A0r2 = AnonymousClass7WR.A00(r2, false);
            }
            AnonymousClass7W3.A0w(r2, false);
            C147368pE r02 = (C147368pE) A0r2;
            Object A0r3 = C147188nY.A0r(r15, r2, -492369756);
            if (A0r3 == obj) {
                A0r3 = AnonymousClass7WR.A00(r2, false);
            }
            AnonymousClass7W3.A0w(r2, false);
            C147368pE r12 = (C147368pE) A0r3;
            Modifier Cx64 = r4.Cx6(r3);
            boolean A1X = C86104wH.A1X(r02);
            boolean A0z3 = C147188nY.A0z(r15, r02, 1157296644);
            Object A133 = r2.A13();
            if (A0z3 || A133 == obj) {
                A133 = new IgdsTextCellComposeExamplesFragmentKt$IgdsTextCellComposeExamples$1$5$1(r02);
                r2.A14(A133);
            }
            AnonymousClass70S.A00(r34, Cx64, (C115286uo) null, new C132877ue(AnonymousClass7W3.A0B(r2, A133, false), A1X), "Switch list cell", (String) null, 54, 28, false);
            Modifier Cx65 = r4.Cx6(r3);
            C115286uo A003 = AnonymousClass6QP.A00(r15, R.drawable.instagram_bulb_pano_outline_24);
            boolean A1X2 = C86104wH.A1X(r02);
            boolean A0z4 = C147188nY.A0z(r15, r02, 1157296644);
            Object A134 = r2.A13();
            if (A0z4 || A134 == obj) {
                A134 = new IgdsTextCellComposeExamplesFragmentKt$IgdsTextCellComposeExamples$1$6$1(r02);
                r2.A14(A134);
            }
            AnonymousClass70S.A00(r34, Cx65, A003, new C132877ue(AnonymousClass7W3.A0B(r2, A134, false), A1X2), "Switch list cell", (String) null, 32822, 12, false);
            Modifier Cx66 = r4.Cx6(r3);
            C115286uo A004 = AnonymousClass6QP.A00(r15, R.drawable.instagram_bulb_pano_outline_24);
            boolean A1X3 = C86104wH.A1X(r02);
            boolean A0z5 = C147188nY.A0z(r15, r02, 1157296644);
            Object A135 = r2.A13();
            if (A0z5 || A135 == obj) {
                A135 = new IgdsTextCellComposeExamplesFragmentKt$IgdsTextCellComposeExamples$1$7$1(r02);
                r2.A14(A135);
            }
            C147188nY r37 = r15;
            AnonymousClass70S.A00(r37, Cx66, A004, new C132877ue(AnonymousClass7W3.A0B(r2, A135, false), A1X3), "Switch list cell (disabled)", (String) null, 33206, 8, false);
            Modifier Cx67 = r4.Cx6(r3);
            boolean A1X4 = C86104wH.A1X(r12);
            boolean A0z6 = C147188nY.A0z(r15, r12, 1157296644);
            Object A136 = r2.A13();
            if (A0z6 || A136 == obj) {
                A136 = new IgdsTextCellComposeExamplesFragmentKt$IgdsTextCellComposeExamples$1$8$1(r12);
                r2.A14(A136);
            }
            AnonymousClass70S.A00(r20, Cx67, (C115286uo) null, new C132857uc(AnonymousClass7W3.A0B(r2, A136, false), A1X4), "Checkbox list cell", (String) null, 438, 24, true);
            Modifier Cx68 = r4.Cx6(r3);
            C115286uo A005 = AnonymousClass6QP.A00(r15, R.drawable.instagram_bulb_pano_outline_24);
            boolean A1X5 = C86104wH.A1X(r12);
            boolean A0z7 = C147188nY.A0z(r15, r12, 1157296644);
            Object A137 = r2.A13();
            if (A0z7 || A137 == obj) {
                A137 = new IgdsTextCellComposeExamplesFragmentKt$IgdsTextCellComposeExamples$1$9$1(r12);
                r2.A14(A137);
            }
            AnonymousClass70S.A00(r37, Cx68, A005, new C132857uc(AnonymousClass7W3.A0B(r2, A137, false), A1X5), "Checkbox list cell", (String) null, 33206, 8, true);
            AnonymousClass70S.A00(r20, r4.Cx6(r3), (C115286uo) null, new C132857uc(IgdsTextCellComposeExamplesFragmentKt$IgdsTextCellComposeExamples$1$10.INSTANCE, true), "Checkbox list cell disabled", (String) null, 438, 24, false);
            C147188nY r16 = r15;
            C101156Qc.A00(r16, r4.Cx6(r3), (C968867b) null, "Action", IgdsTextCellComposeExamplesFragmentKt$IgdsTextCellComposeExamples$1$11.INSTANCE, 438, 24, false);
            IgdsTextCellComposeExamplesFragmentKt$IgdsTextCellComposeExamples$1$12 igdsTextCellComposeExamplesFragmentKt$IgdsTextCellComposeExamples$1$12 = IgdsTextCellComposeExamplesFragmentKt$IgdsTextCellComposeExamples$1$12.INSTANCE;
            Modifier Cx69 = r4.Cx6(r3);
            C968867b r17 = C968867b.Emphasized;
            C101156Qc.A00(r15, Cx69, r17, "Emphasized action", igdsTextCellComposeExamplesFragmentKt$IgdsTextCellComposeExamples$1$12, 3510, 16, false);
            C147188nY r222 = r15;
            C101156Qc.A00(r222, r4.Cx6(r3), r17, "Emphasized action (disabled)", IgdsTextCellComposeExamplesFragmentKt$IgdsTextCellComposeExamples$1$13.INSTANCE, 28086, 0, false);
            C101156Qc.A00(r15, r4.Cx6(r3), C968867b.Destructive, "Destructive action", IgdsTextCellComposeExamplesFragmentKt$IgdsTextCellComposeExamples$1$14.INSTANCE, 3510, 16, false);
            C101166Qd.A00(r15, (Modifier) null, "Footer cell wraps to multiple lines and can display content under other cells.", 6, 2);
            AnonymousClass7W3.A0v(r2, true);
        } else {
            r15.CuJ();
        }
        C147178nW AKE = r15.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new IgdsTextCellComposeExamplesFragmentKt$IgdsTextCellComposeExamples$2(i2));
        }
    }

    public static final int IgdsTextCellComposeExamples$lambda$16$lambda$1(C147368pE r0) {
        return AnonymousClass0wJ.A04(r0.getValue());
    }

    public static final boolean IgdsTextCellComposeExamples$lambda$16$lambda$6(C147368pE r0) {
        return C86104wH.A1X(r0);
    }

    public static final boolean IgdsTextCellComposeExamples$lambda$16$lambda$9(C147368pE r0) {
        return C86104wH.A1X(r0);
    }

    public static final void IgdsTextCellComposeExamples$lambda$16$lambda$10(C147368pE r0, boolean z) {
        C147368pE.A04(r0, z);
    }

    public static final void IgdsTextCellComposeExamples$lambda$16$lambda$2(C147368pE r0, int i) {
        C147368pE.A03(r0, i);
    }

    public static final void IgdsTextCellComposeExamples$lambda$16$lambda$7(C147368pE r0, boolean z) {
        C147368pE.A04(r0, z);
    }
}
