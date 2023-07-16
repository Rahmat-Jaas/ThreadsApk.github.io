package X;

import androidx.compose.ui.Modifier;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0030000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0500000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3310000_I2;
import com.instagram.barcelona.profile.editor.ProfileEditorViewModel;
import com.instagram.user.model.User;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S1201000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape6S0200000_I2_1;
import kotlin.jvm.internal.KtLambdaShape1S0702000_I2;
import kotlin.jvm.internal.KtLambdaShape2S0701000_I2;
import kotlin.jvm.internal.KtLambdaShape35S0100000_I2_15;

/* renamed from: X.6NR  reason: invalid class name */
public final class AnonymousClass6NR {
    public static final void A00(C147188nY r29, Modifier modifier, C121177En r31, ProfileEditorViewModel profileEditorViewModel, AnonymousClass0ZU r33, AnonymousClass0ZU r34, AnonymousClass0YY r35, AnonymousClass0YY r36, int i, int i2) {
        int i3;
        ProfileEditorViewModel profileEditorViewModel2 = profileEditorViewModel;
        AnonymousClass0YY r16 = r35;
        AnonymousClass0ZU r9 = r34;
        C121177En r13 = r31;
        AnonymousClass0ZU r12 = r33;
        boolean A1Z = AnonymousClass0wJ.A1Z(r12, r13);
        AnonymousClass0YY r14 = r36;
        C04220Ms.A0B(r14, 5);
        C147188nY r0 = r29;
        int i4 = i2;
        Modifier A0c = C147188nY.A0c(r0, modifier, 2000657795, i4);
        if ((i2 & 8) != 0) {
            r9 = C74724au.A00;
        }
        if ((i2 & 16) != 0) {
            r16 = C78624ij.A00;
        }
        int i5 = i;
        if ((i2 & 64) != 0) {
            C124567bO r2 = new C124567bO(C18230wP.A09(C147188nY.A0T(r0)), r13, AnonymousClass7CZ.A00(r0));
            AnonymousClass06C A00 = AnonymousClass7CD.A00(r0);
            if (A00 != null) {
                C62793ak A002 = C98396Fj.A00(r0, r2, A00, C86104wH.A0J(A00), ProfileEditorViewModel.class, (String) null);
                AnonymousClass7W3.A0z(r0, false);
                profileEditorViewModel2 = (ProfileEditorViewModel) A002;
                i3 = i & -3670017;
            } else {
                throw C18180wK.A0a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
        } else {
            i3 = i5;
        }
        C81784oM A01 = AnonymousClass7Aj.A01(r0, profileEditorViewModel2.A06);
        C122847Ub A003 = AnonymousClass7Ad.A00(r0);
        AnonymousClass7W3 A0Y = C147188nY.A0Y(r0);
        Object A13 = A0Y.A13();
        Object obj = AnonymousClass7GN.A00;
        Object A0g = C86144wL.A0g(A0Y, A13, obj, A13);
        AnonymousClass7W3.A0w(A0Y, false);
        User A012 = C06810aP.A01.A01(AnonymousClass7CZ.A00(r0));
        if (((KtCSuperShape0S0030000_I2) ((KtCSuperShape0S0500000_I2) C147188nY.A0u(r0, A01, 1921778098)).A04).A00 || ((KtCSuperShape0S0500000_I2) A01.getValue()).A03 == C970667u.Success) {
            Unit unit = Unit.A00;
            boolean A0z = C147188nY.A0z(r0, r9, 1157296644);
            Object A132 = A0Y.A13();
            if (A0z || A132 == obj) {
                A132 = AnonymousClass7W3.A07(A0Y, r9, 29);
            }
            AnonymousClass7W3.A0b(r0, A0Y, A132, unit, false);
        }
        AnonymousClass7W3.A0w(A0Y, false);
        if (((KtCSuperShape0S0500000_I2) C147188nY.A0u(r0, A01, 1921778279)).A03 == C970667u.Failed) {
            AnonymousClass7K5.A05(r0, Unit.A00, new KtSLambdaShape1S1201000_I2(profileEditorViewModel2, A0g, AnonymousClass7JS.A01(r0, 2131822140), (C146958n9) null, 11));
        }
        AnonymousClass7W3.A0w(A0Y, false);
        if (((KtCSuperShape0S0110000_I2) ((KtCSuperShape0S0500000_I2) C147188nY.A0u(r0, A01, 1921778611)).A02).A00 == AnonymousClass006.A0C) {
            AnonymousClass6NT.A00(r0, new KtLambdaShape35S0100000_I2_15(profileEditorViewModel2, 42), new KtLambdaShape35S0100000_I2_15(profileEditorViewModel2, 43), 0);
        }
        if (((KtCSuperShape0S0030000_I2) ((KtCSuperShape0S0500000_I2) AnonymousClass7W3.A06(A0Y, A01)).A04).A01) {
            r0.Cvb(1921779034);
            boolean A0y = C147188nY.A0y(r0, r9);
            Object A133 = A0Y.A13();
            if (A0y || A133 == obj) {
                A133 = AnonymousClass7W3.A0J(A0Y, r9, 44);
            }
            AnonymousClass6NP.A00(r0, AnonymousClass7W3.A09(A0Y, A133, false), new KtLambdaShape35S0100000_I2_15(profileEditorViewModel2, 45), 0);
            AnonymousClass7W3.A0w(A0Y, false);
        } else if (((KtCSuperShape0S0030000_I2) ((KtCSuperShape0S0500000_I2) A01.getValue()).A04).A02) {
            C100586Nw.A00(r0, new KtLambdaShape35S0100000_I2_15(profileEditorViewModel2, 46), new KtLambdaShape35S0100000_I2_15(profileEditorViewModel2, 40), 0, !((KtCSuperShape0S3310000_I2) ((KtCSuperShape0S0500000_I2) C147188nY.A0u(r0, A01, 1921779247)).A01).A06);
            AnonymousClass7W3.A0w(A0Y, false);
        } else {
            r0.Cvb(1921779714);
            AnonymousClass7W3.A0w(A0Y, false);
        }
        if (((KtCSuperShape0S0110000_I2) ((KtCSuperShape0S0500000_I2) C147188nY.A0u(r0, A01, 1921779718)).A02).A01) {
            AnonymousClass7K5.A05(r0, Unit.A00, new KtSLambdaShape6S0200000_I2_1((Object) r12, (Object) profileEditorViewModel2, (C146958n9) null, 32));
        }
        AnonymousClass7W3.A0w(A0Y, false);
        C147188nY r28 = r0;
        Modifier modifier2 = A0c;
        C117656z2.A00(r28, modifier2, (C142918fo) null, AnonymousClass7JR.A00(r0, new KtLambdaShape2S0701000_I2(i3, A1Z ? 1 : 0, profileEditorViewModel2, A012, r14, r16, A003, A0g, A01), 1435326133), ((i3 >> 6) & 14) | 196608, 26, AnonymousClass7KB.A00(r0));
        C147178nW AKE = r0.AKE();
        if (AKE != null) {
            C121177En r21 = r13;
            AnonymousClass0ZU r20 = r9;
            AnonymousClass0YY r18 = r14;
            AnonymousClass0ZU r17 = r12;
            AKE.D9d(new KtLambdaShape1S0702000_I2(r16, r17, r18, A0c, r20, r21, profileEditorViewModel2, i5, i4, 2));
        }
    }
}
