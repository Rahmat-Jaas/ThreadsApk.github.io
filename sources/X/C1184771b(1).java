package X;

import android.content.Context;
import androidx.compose.ui.Modifier;
import androidx.fragment.app.Fragment;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape100S0100000_I2_80;
import kotlin.jvm.internal.KtLambdaShape18S0301000_I2;
import kotlin.jvm.internal.KtLambdaShape33S0200000_I2_17;
import kotlin.jvm.internal.KtLambdaShape5S0400000_I2_1;
import kotlin.jvm.internal.KtLambdaShape8S0300000_I2_3;

/* renamed from: X.71b  reason: invalid class name and case insensitive filesystem */
public final class C1184771b {
    public static final void A00(C147188nY r30, Fragment fragment, AnonymousClass3EY r32, UserSession userSession, int i) {
        C147188nY r5 = r30;
        r5.Cvd(1991637465);
        Context A0T = C147188nY.A0T(r5);
        C12560m7 parentFragmentManager = fragment.getParentFragmentManager();
        UserSession userSession2 = userSession;
        boolean A1Z = AnonymousClass0wJ.A1Z(A0T, userSession2);
        Object A01 = userSession2.A01(AnonymousClass3D2.class, new KtLambdaShape33S0200000_I2_17(12, A0T.getApplicationContext(), userSession2));
        AnonymousClass7W3 A0Y = C147188nY.A0Y(r5);
        Object A13 = A0Y.A13();
        Object obj = AnonymousClass7GN.A00;
        if (A13 == obj) {
            A13 = AnonymousClass7WR.A00(A0Y, false);
        }
        AnonymousClass7W3.A0w(A0Y, false);
        C81784oM r8 = (C81784oM) A13;
        r5.Cvb(523133517);
        AnonymousClass3EY r15 = r32;
        if (C86104wH.A1X(r8)) {
            boolean A0z = C147188nY.A0z(r5, r8, 1157296644);
            Object A132 = A0Y.A13();
            if (A0z || A132 == obj) {
                A132 = new KtLambdaShape100S0100000_I2_80(r8, A1Z ? 1 : 0);
                A0Y.A14(A132);
            }
            A01(r5, AnonymousClass7W3.A09(A0Y, A132, false), new KtLambdaShape5S0400000_I2_1(10, A0T, parentFragmentManager, A01, r15), 0);
        }
        AnonymousClass7W3.A0w(A0Y, false);
        AnonymousClass6QZ.A00(r5, new C132797uW(AnonymousClass6QP.A00(r5, R.drawable.instagram), (float) 56), (AnonymousClass670) null, AnonymousClass7JS.A01(r5, 2131830104), AnonymousClass7JS.A01(r5, 2131830101), (String) null, (String) null, (AnonymousClass0ZU) null, 64, 113);
        C145058jl r10 = AnonymousClass7J3.A06;
        C123327Wm A00 = Modifier.A00(r5);
        C146288ly A002 = AnonymousClass72M.A00(r10, r5, AnonymousClass7KV.A02);
        Object A0p = C147188nY.A0p(r5);
        Object A0n = C147188nY.A0n(r5);
        Object A0m = C147188nY.A0m(r5);
        AnonymousClass0ZU r102 = AnonymousClass74X.A00;
        AnonymousClass0YM A003 = C98236Es.A00(A00);
        C147188nY.A0w(r5, A0Y, r102);
        AnonymousClass7W3.A0a(r5, A0Y, A002, A0p);
        AnonymousClass7KP.A07(r5, A0n, A0m, A003);
        r5.Cvb(-1934099505);
        String A012 = AnonymousClass7JS.A01(r5, 2131830102);
        boolean A0y = C147188nY.A0y(r5, r8);
        Object A133 = A0Y.A13();
        if (A0y || A133 == obj) {
            A133 = new KtLambdaShape100S0100000_I2_80(r8, 2);
            A0Y.A14(A133);
        }
        C147188nY r16 = r5;
        AnonymousClass6QT.A00(r16, (Modifier) null, A012, AnonymousClass7JS.A01(r5, 2131830103), (String) null, AnonymousClass7W3.A08(A0Y, A133, false), new KtLambdaShape8S0300000_I2_3(14, parentFragmentManager, A01, r15), 0, 0, 1948, false, false, false, false, false);
        AnonymousClass7W3.A0v(A0Y, A1Z);
        C147178nW AKE = r5.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape18S0301000_I2(i, 32, fragment, r32, userSession));
        }
    }

    public static final void A01(C147188nY r13, AnonymousClass0ZU r14, AnonymousClass0ZU r15, int i) {
        int i2;
        C147188nY r4 = r13;
        r13.Cvd(1838211607);
        int i3 = i;
        AnonymousClass0ZU r10 = r14;
        if ((i & 14) == 0) {
            i2 = C147188nY.A09(r13, r14) | i;
        } else {
            i2 = i3;
        }
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0A(r13, r15);
        }
        if ((i2 & 91) != 18 || !r13.BCM()) {
            AnonymousClass6QY.A00(r4, AnonymousClass6QW.A00(r13, (Integer) null, r15, 2131831976, 14), (KtCSuperShape0S2210000_I2) null, (KtCSuperShape0S2210000_I2) null, AnonymousClass7JS.A01(r13, 2131830100), AnonymousClass7JS.A01(r13, 2131830099), r10, i2 & 14, 240, false, false);
        } else {
            r13.CuJ();
        }
        C147178nW AKE = r4.AKE();
        if (AKE != null) {
            C147178nW.A05(AKE, r15, r10, i3, 38);
        }
    }
}
