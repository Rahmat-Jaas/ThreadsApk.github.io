package com.instagram.debug.devoptions.igds.compose;

import X.AnonymousClass0YM;
import X.AnonymousClass0ZU;
import X.AnonymousClass74X;
import X.AnonymousClass7Ad;
import X.AnonymousClass7GN;
import X.AnonymousClass7KP;
import X.AnonymousClass7KV;
import X.AnonymousClass7W3;
import X.AnonymousClass7WO;
import X.C101156Qc;
import X.C146288ly;
import X.C147178nW;
import X.C147188nY;
import X.C86104wH;
import X.C968867b;
import X.C98236Es;
import androidx.compose.ui.Modifier;

public final class IgdsDialogComposeExamplesFragmentKt {
    public static final void DialogExample(String str, AnonymousClass0YM r15, C147188nY r16, int i) {
        int i2;
        C147188nY r7 = r16;
        r7.Cvd(1544181792);
        int i3 = i;
        String str2 = str;
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r7, str) | i;
        } else {
            i2 = i3;
        }
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0A(r7, r15);
        }
        if ((i2 & 91) != 18 || !r7.BCM()) {
            AnonymousClass7W3 r5 = (AnonymousClass7W3) r7;
            Object A13 = r5.A13();
            Object obj = AnonymousClass7GN.A00;
            if (A13 == obj) {
                A13 = new DialogExampleScopeImpl();
                r5.A14(A13);
            }
            DialogExampleScopeImpl dialogExampleScopeImpl = (DialogExampleScopeImpl) A13;
            boolean A0y = C147188nY.A0y(r7, dialogExampleScopeImpl);
            Object A132 = r5.A13();
            if (A0y || A132 == obj) {
                A132 = new IgdsDialogComposeExamplesFragmentKt$DialogExample$1$1(dialogExampleScopeImpl);
                r5.A14(A132);
            }
            C101156Qc.A00(r7, Modifier.A04(Modifier.A00), (C968867b) null, str2, AnonymousClass7W3.A08(r5, A132, false), ((i2 << 3) & 112) | 384, 24, false);
            if (C86104wH.A1X(dialogExampleScopeImpl.isDialogShowing$delegate)) {
                C86104wH.A1R(dialogExampleScopeImpl, r7, r15, (i2 & 112) | 6);
            }
        } else {
            r7.CuJ();
        }
        C147178nW AKE = r7.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new IgdsDialogComposeExamplesFragmentKt$DialogExample$2(str2, r15, i3));
        }
    }

    public static final void IgdsDialogComposeExamples(C147188nY r7, int i) {
        r7.Cvd(1105902274);
        if (i != 0 || !r7.BCM()) {
            Modifier A01 = AnonymousClass7Ad.A01(AnonymousClass7Ad.A00(r7), Modifier.A04(Modifier.A00));
            C146288ly A05 = AnonymousClass7KV.A05(r7);
            Object A0p = C147188nY.A0p(r7);
            Object A0n = C147188nY.A0n(r7);
            Object A0m = C147188nY.A0m(r7);
            AnonymousClass0ZU r1 = AnonymousClass74X.A00;
            AnonymousClass0YM A00 = C98236Es.A00(A01);
            AnonymousClass7W3 r3 = (AnonymousClass7W3) r7;
            C147188nY.A0w(r7, r3, r1);
            AnonymousClass7W3.A0a(r7, r3, A05, A0p);
            AnonymousClass7KP.A07(r7, A0n, A0m, A00);
            r7.Cvb(904085816);
            DialogExample("Single action", ComposableSingletons$IgdsDialogComposeExamplesFragmentKt.f15lambda3, r7, 54);
            DialogExample("Two actions", ComposableSingletons$IgdsDialogComposeExamplesFragmentKt.f16lambda4, r7, 54);
            DialogExample("Three actions", ComposableSingletons$IgdsDialogComposeExamplesFragmentKt.f17lambda5, r7, 54);
            DialogExample("No message", ComposableSingletons$IgdsDialogComposeExamplesFragmentKt.f18lambda6, r7, 54);
            DialogExample("Cancel on outside touch", ComposableSingletons$IgdsDialogComposeExamplesFragmentKt.f19lambda7, r7, 54);
            DialogExample("Not cancelable", ComposableSingletons$IgdsDialogComposeExamplesFragmentKt.f20lambda8, r7, 54);
            AnonymousClass7W3.A0f(r3);
        } else {
            r7.CuJ();
        }
        C147178nW AKE = r7.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new IgdsDialogComposeExamplesFragmentKt$IgdsDialogComposeExamples$2(i));
        }
    }
}
