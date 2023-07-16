package com.instagram.debug.devoptions.igds.compose;

import X.AnonymousClass0YM;
import X.AnonymousClass0ZU;
import X.AnonymousClass54z;
import X.AnonymousClass671;
import X.AnonymousClass6QT;
import X.AnonymousClass74X;
import X.AnonymousClass7Ad;
import X.AnonymousClass7KP;
import X.AnonymousClass7KV;
import X.AnonymousClass7Kq;
import X.AnonymousClass7W3;
import X.AnonymousClass7WO;
import X.C101176Qe;
import X.C123327Wm;
import X.C146288ly;
import X.C147178nW;
import X.C147188nY;
import X.C98236Es;
import androidx.compose.ui.Modifier;

public final class IgdsBottomButtonComposeExamplesFragmentKt {
    public static final void IgdsBottomButtonComposeExamples(C147188nY r37, int i) {
        C147188nY r11 = r37;
        r11.Cvd(-1423448222);
        int i2 = i;
        if (i != 0 || !r11.BCM()) {
            C123327Wm r1 = Modifier.A00;
            AnonymousClass54z r0 = AnonymousClass7Kq.A02;
            Modifier A01 = AnonymousClass7Ad.A01(AnonymousClass7Ad.A00(r11), r1.Cx6(r0));
            C146288ly A05 = AnonymousClass7KV.A05(r11);
            Object A0p = C147188nY.A0p(r11);
            Object A0n = C147188nY.A0n(r11);
            Object A0m = C147188nY.A0m(r11);
            AnonymousClass0ZU r6 = AnonymousClass74X.A00;
            AnonymousClass0YM A00 = C98236Es.A00(A01);
            AnonymousClass7W3 r2 = (AnonymousClass7W3) r11;
            C147188nY.A0w(r11, r2, r6);
            AnonymousClass7W3.A0a(r11, r2, A05, A0p);
            AnonymousClass7KP.A07(r11, A0n, A0m, A00);
            r11.Cvb(-252941096);
            C147188nY r29 = r11;
            C101176Qe.A00(r29, (Modifier) null, (AnonymousClass671) null, "Single action", (String) null, (AnonymousClass0ZU) null, 6, 126, false, false);
            AnonymousClass6QT.A00(r11, r1.Cx6(r0), "Primary Action", (String) null, (String) null, IgdsBottomButtonComposeExamplesFragmentKt$IgdsBottomButtonComposeExamples$1$1.INSTANCE, (AnonymousClass0ZU) null, 438, 0, 2040, false, false, false, false, false);
            C101176Qe.A00(r29, (Modifier) null, (AnonymousClass671) null, "Single action with footer", (String) null, (AnonymousClass0ZU) null, 6, 126, false, false);
            AnonymousClass6QT.A00(r11, r1.Cx6(r0), "Primary Action", (String) null, "Footer which can wrap to several lines. Header can only do two, but footer can do more. Three cheers for the footer.", IgdsBottomButtonComposeExamplesFragmentKt$IgdsBottomButtonComposeExamples$1$2.INSTANCE, (AnonymousClass0ZU) null, 805306806, 0, 1528, false, false, false, false, false);
            C101176Qe.A00(r29, (Modifier) null, (AnonymousClass671) null, "Two actions", (String) null, (AnonymousClass0ZU) null, 6, 126, false, false);
            C147188nY r20 = r11;
            String str = "Primary Action";
            AnonymousClass6QT.A00(r20, r1.Cx6(r0), str, "Secondary Action", (String) null, IgdsBottomButtonComposeExamplesFragmentKt$IgdsBottomButtonComposeExamples$1$3.INSTANCE, (AnonymousClass0ZU) null, 197046, 0, 2008, false, false, false, false, false);
            C101176Qe.A00(r11, (Modifier) null, (AnonymousClass671) null, "Two actions with footer", (String) null, (AnonymousClass0ZU) null, 6, 126, false, false);
            String str2 = "Footer which can wrap to several lines. Header can only do two, but footer can do more. Three cheers for the footer.";
            AnonymousClass6QT.A00(r20, r1.Cx6(r0), str, "Secondary Action", str2, IgdsBottomButtonComposeExamplesFragmentKt$IgdsBottomButtonComposeExamples$1$4.INSTANCE, (AnonymousClass0ZU) null, 805503414, 0, 1496, false, false, false, false, false);
            C101176Qe.A00(r11, (Modifier) null, (AnonymousClass671) null, "Loading states", (String) null, (AnonymousClass0ZU) null, 6, 126, false, false);
            AnonymousClass6QT.A00(r20, r1.Cx6(r0), str, "Secondary Action", str2, IgdsBottomButtonComposeExamplesFragmentKt$IgdsBottomButtonComposeExamples$1$5.INSTANCE, (AnonymousClass0ZU) null, 906191286, 0, 1224, false, true, false, true, false);
            C101176Qe.A00(r11, (Modifier) null, (AnonymousClass671) null, "Disabled states", (String) null, (AnonymousClass0ZU) null, 6, 126, false, false);
            AnonymousClass6QT.A00(r20, r1.Cx6(r0), str, "Secondary Action", str2, IgdsBottomButtonComposeExamplesFragmentKt$IgdsBottomButtonComposeExamples$1$6.INSTANCE, (AnonymousClass0ZU) null, 818089398, 0, 1360, false, false, false, false, false);
            AnonymousClass7W3.A0v(r2, true);
        } else {
            r11.CuJ();
        }
        C147178nW AKE = r11.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new IgdsBottomButtonComposeExamplesFragmentKt$IgdsBottomButtonComposeExamples$2(i2));
        }
    }
}
