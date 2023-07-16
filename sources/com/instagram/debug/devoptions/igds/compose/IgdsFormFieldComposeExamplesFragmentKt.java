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
import X.C146288ly;
import X.C147178nW;
import X.C147188nY;
import X.C86104wH;
import X.C98236Es;
import androidx.compose.ui.Modifier;

public final class IgdsFormFieldComposeExamplesFragmentKt {
    public static final void FormFieldExample(String str, AnonymousClass0YM r5, C147188nY r6, int i, int i2) {
        int i3;
        r6.Cvd(-876834744);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r6, str) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0A(r6, r5);
        }
        if ((i3 & 91) != 18 || !r6.BCM()) {
            if (i4 != 0) {
                str = "";
            }
            AnonymousClass7W3 r3 = (AnonymousClass7W3) r6;
            Object A13 = r3.A13();
            if (A13 == AnonymousClass7GN.A00) {
                A13 = new FormFieldExampleScope(str);
                r3.A14(A13);
            }
            C86104wH.A1R(A13, r6, r5, (i3 & 112) | 6);
        } else {
            r6.CuJ();
        }
        C147178nW AKE = r6.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new IgdsFormFieldComposeExamplesFragmentKt$FormFieldExample$1(str, r5, i, i2));
        }
    }

    public static final void IgdsFormFieldComposeExamples(C147188nY r10, int i) {
        r10.Cvd(-932594516);
        if (i != 0 || !r10.BCM()) {
            Modifier A01 = AnonymousClass7Ad.A01(AnonymousClass7Ad.A00(r10), Modifier.A04(Modifier.A00));
            C146288ly A05 = AnonymousClass7KV.A05(r10);
            Object A0p = C147188nY.A0p(r10);
            Object A0n = C147188nY.A0n(r10);
            Object A0m = C147188nY.A0m(r10);
            AnonymousClass0ZU r1 = AnonymousClass74X.A00;
            AnonymousClass0YM A00 = C98236Es.A00(A01);
            AnonymousClass7W3 r3 = (AnonymousClass7W3) r10;
            C147188nY.A0w(r10, r3, r1);
            AnonymousClass7W3.A0a(r10, r3, A05, A0p);
            AnonymousClass7KP.A07(r10, A0n, A0m, A00);
            r10.Cvb(-947580254);
            FormFieldExample((String) null, ComposableSingletons$IgdsFormFieldComposeExamplesFragmentKt.f23lambda3, r10, 48, 1);
            FormFieldExample((String) null, ComposableSingletons$IgdsFormFieldComposeExamplesFragmentKt.f24lambda4, r10, 48, 1);
            FormFieldExample((String) null, ComposableSingletons$IgdsFormFieldComposeExamplesFragmentKt.f25lambda5, r10, 48, 1);
            FormFieldExample((String) null, ComposableSingletons$IgdsFormFieldComposeExamplesFragmentKt.f26lambda6, r10, 48, 1);
            FormFieldExample("Text horizontally scrolls in a single line form field when the text is too long to fit in view.", ComposableSingletons$IgdsFormFieldComposeExamplesFragmentKt.f27lambda7, r10, 54, 0);
            FormFieldExample("Text vertically scrolls when maxLines is set to a value greater than one. Here's an example of being to display up to 2 lines of text at once.", ComposableSingletons$IgdsFormFieldComposeExamplesFragmentKt.f28lambda8, r10, 54, 0);
            AnonymousClass7W3.A0v(r3, true);
        } else {
            r10.CuJ();
        }
        C147178nW AKE = r10.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new IgdsFormFieldComposeExamplesFragmentKt$IgdsFormFieldComposeExamples$2(i));
        }
    }
}
