package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0112000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2200000_I2;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape17S0100000_I2_6;
import kotlin.coroutines.jvm.internal.KtSLambdaShape22S0201000_I2_8;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.KtLambdaShape166S0100000_I2_21;
import kotlin.jvm.internal.KtLambdaShape170S0100000_I2_3;
import kotlin.jvm.internal.KtLambdaShape20S0301000_I2;
import kotlin.jvm.internal.KtLambdaShape28S0201000_I2_1;
import kotlin.jvm.internal.KtLambdaShape2S0211000_I2;
import kotlin.jvm.internal.KtLambdaShape2S0801000_I2;
import kotlin.jvm.internal.KtLambdaShape3S0302000_I2;
import kotlin.jvm.internal.KtLambdaShape47S0200000_I2_8;

/* renamed from: X.7KL  reason: invalid class name */
public final class AnonymousClass7KL {
    public static final int A00(BKU bku, UserSession userSession, boolean z) {
        C04220Ms.A0B(userSession, 0);
        if (bku == null || bku.A0f.A3j == null) {
            return 2131829624;
        }
        if (z) {
            AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
            if (C63803iN.A0E(r2, userSession, 36315056589506914L) || C63803iN.A0E(r2, userSession, 36315155373492645L)) {
                return 2131832588;
            }
        }
        if (bku.A4B() || !A73.A00(userSession).A02(bku)) {
            return 2131829624;
        }
        return 2131837967;
    }

    public static final boolean A09(BKU bku, UserSession userSession) {
        if (bku == null || !bku.A4B() || bku.A0f.A0l == null || AnonymousClass3PV.A00(bku, userSession) != AnonymousClass006.A01) {
            return false;
        }
        C04220Ms.A0B(userSession, 0);
        User A2Z = bku.A2Z(userSession);
        if (A2Z != null && !(!C18250wR.A1J(userSession, A2Z.getId()))) {
            return false;
        }
        AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
        return C63803iN.A0E(r2, userSession, 36315056589375841L) || C63803iN.A0E(r2, userSession, 36315155373492645L);
    }

    public static final void A01(C147188nY r8, int i) {
        r8.Cvd(1008948449);
        if (i != 0 || !r8.BCM()) {
            C123327Wm A01 = Modifier.A01(r8);
            C146288ly A00 = C120767Cj.A00(r8, AnonymousClass7KV.A0E, false);
            Object A0p = C147188nY.A0p(r8);
            Object A0n = C147188nY.A0n(r8);
            Object A0m = C147188nY.A0m(r8);
            AnonymousClass0ZU r1 = AnonymousClass74X.A00;
            AnonymousClass0YM A002 = C98236Es.A00(A01);
            AnonymousClass7W3 r2 = (AnonymousClass7W3) r8;
            C147188nY.A0w(r8, r2, r1);
            AnonymousClass7W3.A0a(r8, r2, A00, A0p);
            AnonymousClass7KP.A07(r8, A0n, A0m, A002);
            AnonymousClass7KV.A08(AnonymousClass7V3.A00, r8, A01, -1269863449);
            AnonymousClass7W3.A0f(r2);
        } else {
            r8.CuJ();
        }
        C147178nW AKE = r8.AKE();
        if (AKE != null) {
            C147178nW.A00(AKE, i, 15);
        }
    }

    public static final void A02(C147188nY r38, int i, int i2) {
        int i3;
        AnonymousClass0YY r5;
        AnonymousClass0YY r7;
        C147188nY r11 = r38;
        r11.Cvd(-2051921156);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 14) == 0) {
            i3 = C147188nY.A03(r11, i5) | i2;
        } else {
            i3 = i4;
        }
        if ((i3 & 11) != 2 || !r11.BCM()) {
            C123327Wm r4 = Modifier.A00;
            float f = (float) 16;
            Modifier A05 = AnonymousClass7K4.A05(Modifier.A04(r4), f, f, f, (float) 0);
            C146288ly A02 = AnonymousClass7KV.A02(AnonymousClass7J3.A04, r11);
            Object A0p = C147188nY.A0p(r11);
            Object A0n = C147188nY.A0n(r11);
            Object A0m = C147188nY.A0m(r11);
            AnonymousClass0ZU r52 = AnonymousClass74X.A00;
            AnonymousClass0YM A00 = C98236Es.A00(A05);
            AnonymousClass7W3 r0 = (AnonymousClass7W3) r11;
            C147188nY.A0w(r11, r0, r52);
            AnonymousClass7W3.A0a(r11, r0, A02, A0p);
            AnonymousClass7KP.A07(r11, A0n, A0m, A00);
            r11.Cvb(1968527456);
            String A01 = AnonymousClass7JS.A01(r11, 2131829616);
            AnonymousClass54E r3 = AnonymousClass6ZP.A00;
            if (InspectableValueKt.isDebugInspectorInfoEnabled) {
                r5 = C86144wL.A16(r3, 42);
            } else {
                r5 = InspectableValueKt.A00;
            }
            Modifier Cx6 = r4.Cx6(new C874052p(r3, r5));
            r11.Cvb(-205405799);
            C121807If A002 = AnonymousClass7J9.A00(r11);
            C121807If A003 = C121807If.A00(A002, (C1188372l) null, (C134817yQ) null, A002.A00.A05, (C114316t2) null, (C121117Ee) null, 2097150, AnonymousClass7KB.A02(r11), 0, 0, 0);
            AnonymousClass7W3.A0w(r0, false);
            AnonymousClass7I9.A02(r11, Cx6, A003, (C114236su) null, (C134817yQ) null, (C121117Ee) null, A01, 0, 0, 0, 0, 0, 2044, 0, 0, false);
            Resources resources = C147188nY.A0T(r11).getResources();
            Object A0r = C147188nY.A0r(r11, r0, -492369756);
            if (A0r == AnonymousClass7GN.A00) {
                A0r = AnonymousClass7I1.A00(resources, i5);
                r0.A14(A0r);
            }
            AnonymousClass7W3.A0w(r0, false);
            C04220Ms.A09(A0r);
            String str = (String) A0r;
            if (InspectableValueKt.isDebugInspectorInfoEnabled) {
                r7 = C86144wL.A16(r3, 42);
            } else {
                r7 = InspectableValueKt.A00;
            }
            Modifier Cx62 = r4.Cx6(new C874052p(r3, r7));
            C121807If A022 = AnonymousClass7J9.A02(r11);
            AnonymousClass7I9.A02(r11, Cx62, C121807If.A00(A022, (C1188372l) null, (C134817yQ) null, A022.A00.A05, (C114316t2) null, (C121117Ee) null, 2097150, AnonymousClass7KB.A03(r11), 0, 0, 0), (C114236su) null, (C134817yQ) null, (C121117Ee) null, str, 0, 0, 0, 0, 0, 2044, 0, 0, false);
            AnonymousClass7W3.A0f(r0);
        } else {
            r11.CuJ();
        }
        C147178nW AKE = r11.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new C140028Qo(i5, i4));
        }
    }

    public static final void A03(C147188nY r16, Modifier modifier, KtCSuperShape0S2200000_I2 ktCSuperShape0S2200000_I2, AnonymousClass0ZU r19, int i, int i2) {
        C115286uo r11;
        C147188nY r8 = r16;
        int i3 = i2;
        Modifier A0c = C147188nY.A0c(r8, modifier, -949626646, i3);
        Alignment alignment = AnonymousClass7KV.A06;
        C123327Wm A01 = Modifier.A01(r8);
        C146288ly A00 = C120767Cj.A00(r8, alignment, false);
        Object A0p = C147188nY.A0p(r8);
        Object A0n = C147188nY.A0n(r8);
        Object A0m = C147188nY.A0m(r8);
        AnonymousClass0ZU r1 = AnonymousClass74X.A00;
        AnonymousClass0YM A002 = C98236Es.A00(A01);
        AnonymousClass7W3 r3 = (AnonymousClass7W3) r8;
        C147188nY.A0w(r8, r3, r1);
        AnonymousClass7W3.A0a(r8, r3, A00, A0p);
        AnonymousClass7KP.A07(r8, A0n, A0m, A002);
        r8.Cvb(-1426535696);
        KtCSuperShape0S2200000_I2 ktCSuperShape0S2200000_I22 = ktCSuperShape0S2200000_I2;
        String str = ktCSuperShape0S2200000_I22.A02;
        ImageUrl imageUrl = (ImageUrl) ktCSuperShape0S2200000_I22.A01;
        AnonymousClass7KE r10 = null;
        if (imageUrl != null) {
            r11 = C120577Bm.A02(r8, imageUrl, (AnonymousClass0ZU) null, 6, 0);
        } else {
            r11 = null;
        }
        String str2 = ktCSuperShape0S2200000_I22.A03;
        Number number = (Number) ktCSuperShape0S2200000_I22.A00;
        if (number != null) {
            r10 = C86134wK.A0I(((long) number.intValue()) << 32);
        }
        int i4 = i;
        AnonymousClass0ZU r14 = r19;
        C101316Qs.A00(r8, A0c, r10, r11, str, str2, r14, (i & 112) | 4096 | (i4 & 896), 32, 0);
        AnonymousClass7W3.A0f(r3);
        C147178nW AKE = r8.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape3S0302000_I2(r14, A0c, ktCSuperShape0S2200000_I22, i4, i3, 23));
        }
    }

    public static final void A04(C147188nY r30, KtCSuperShape0S0112000_I2 ktCSuperShape0S0112000_I2, AnonymousClass0ZU r32, int i) {
        String str;
        AnonymousClass7W3 r2;
        C147178nW AKE;
        int i2;
        C147188nY r0 = r30;
        r0.Cvd(-1891229786);
        Number number = (Number) ktCSuperShape0S0112000_I2.A02;
        AnonymousClass0ZU r302 = r32;
        if (number == AnonymousClass006.A0N) {
            AKE = r0.AKE();
            if (AKE != null) {
                i2 = 44;
            } else {
                return;
            }
        } else {
            r0.Cvb(1578305658);
            C134727yF r6 = new C134727yF((DefaultConstructorMarker) null, 0, 1);
            String A01 = AnonymousClass7JS.A01(r0, 2131835628);
            Resources resources = C147188nY.A0T(r0).getResources();
            int intValue = number.intValue();
            if (intValue == 0) {
                r0.Cvb(1289035048);
                str = AnonymousClass7JS.A02(r0, A01, 2131835627);
                r2 = AnonymousClass7W3.A04(r0, false);
            } else if (intValue == 1) {
                r0.Cvb(1289035168);
                String A0m = C86134wK.A0m(resources, ktCSuperShape0S0112000_I2.A01, false);
                int i3 = ktCSuperShape0S0112000_I2.A00;
                if (i3 == 0) {
                    r0.Cvb(1289035339);
                    str = AnonymousClass7JS.A03(r0, new Object[]{A0m, A01}, 2131835631);
                    r2 = AnonymousClass7W3.A04(r0, false);
                } else {
                    r0.Cvb(1289035489);
                    int i4 = 2131835630;
                    if (ktCSuperShape0S0112000_I2.A03) {
                        i4 = 2131835632;
                    }
                    str = AnonymousClass7JS.A03(r0, new Object[]{C86134wK.A0m(resources, i3, false), A0m, A01}, i4);
                    r2 = AnonymousClass7W3.A04(r0, false);
                }
                AnonymousClass7W3.A0w(r2, false);
            } else if (intValue == 2) {
                r0.Cvb(1289036008);
                str = AnonymousClass7JS.A02(r0, A01, 2131835634);
                r2 = AnonymousClass7W3.A04(r0, false);
            } else if (intValue != 3) {
                r0.Cvb(1289012367);
                AnonymousClass7W3.A0z(r0, false);
                throw AnonymousClass4VZ.A00();
            } else {
                r0.Cvb(1289036127);
                AnonymousClass7W3.A0z(r0, false);
                throw C18180wK.A0a("Unsupported type. How'd you get here?");
            }
            r6.A07(str);
            int A0I = AnonymousClass8bP.A0I(str, A01);
            int length = A01.length() + A0I;
            r6.A05(new AnonymousClass7F0((C1201679b) null, (C1188372l) null, (C114236su) null, (C114246sv) null, C134817yQ.A03, (AnonymousClass83Y) null, (C114266sx) null, (AnonymousClass79I) null, (C121147Ei) null, (String) null, 16378, C120537Bh.A00(r0).A0R, 0, 0, 0), A0I, length);
            r6.A09("learn_more", "Clickable learn more link", A0I, length);
            C134747yH A012 = r6.A01();
            AnonymousClass7W3.A0w(r2, false);
            AnonymousClass5I7 r13 = AnonymousClass5I7.A04;
            C123327Wm r7 = Modifier.A00;
            Modifier A06 = AnonymousClass7Kq.A06(AnonymousClass7K4.A02(r13.A03, Modifier.A04(r7)), r13.A02);
            C146288ly A00 = AnonymousClass72N.A00(C147188nY.A0U(r0), r0, AnonymousClass7KV.A04);
            AnonymousClass534 A0b = C147188nY.A0b(r0, -1323940314);
            Object AEA = r0.AEA(A0b);
            AnonymousClass534 r11 = AnonymousClass7DE.A07;
            Object AEA2 = r0.AEA(r11);
            AnonymousClass534 r10 = AnonymousClass7DE.A0B;
            Object AEA3 = r0.AEA(r10);
            AnonymousClass0ZU r9 = AnonymousClass74X.A00;
            AnonymousClass0YM A002 = C98236Es.A00(A06);
            C147188nY.A0w(r0, r2, r9);
            r2.A0T = false;
            AnonymousClass0YP r8 = AnonymousClass74X.A03;
            AnonymousClass0YP A003 = AnonymousClass7Ak.A00(r0, A00, AEA, r8);
            AnonymousClass0YP r62 = AnonymousClass74X.A02;
            AnonymousClass0YP A013 = AnonymousClass7Ak.A01(r0, AEA2, r62);
            Integer A05 = AnonymousClass7KP.A05(r0, AEA3, A013, A002);
            r0.Cvb(2058660585);
            r0.Cvb(-1978879550);
            Modifier A09 = AnonymousClass7Kq.A09(r7, r13.A00);
            C146288ly A0h = C147188nY.A0h(r0, AnonymousClass7KV.A09);
            Object A0t = C147188nY.A0t(r0, A0b, -1323940314);
            Object AEA4 = r0.AEA(r11);
            Object AEA5 = r0.AEA(r10);
            AnonymousClass0YM A004 = C98236Es.A00(A09);
            C147188nY.A0w(r0, r2, r9);
            r2.A0T = false;
            AnonymousClass7Ak.A02(r0, A0h, r8);
            AnonymousClass7Ak.A02(r0, A0t, A003);
            A004.invoke(AnonymousClass7KP.A03(r0, AEA4, AEA5, r62, A013), r0, A05);
            r0.Cvb(2058660585);
            r0.Cvb(452312316);
            C147188nY r82 = r0;
            C97846Dc.A00(r82, (Alignment) null, AnonymousClass7G5.A02(r7, r13.A01), C115866w2.A00(5, C120537Bh.A00(r0).A0B), AnonymousClass6QP.A00(r0, R.drawable.instagram_facebook_circle_filled_24), (C146878n1) null, (String) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 56, 56);
            AnonymousClass7W3.A0v(r2, true);
            float f = (float) 0;
            Modifier A052 = AnonymousClass7K4.A05(r7, (float) 12, f, f, f);
            C121807If A02 = AnonymousClass7J9.A02(r0);
            C134747yH r4 = A012;
            boolean A10 = C147188nY.A10(r0, r4, r302, 511388516);
            Object A13 = r2.A13();
            if (A10 || A13 == AnonymousClass7GN.A00) {
                A13 = new KtLambdaShape47S0200000_I2_8(5, (Object) r4, (Object) r302);
                r2.A14(A13);
            }
            AnonymousClass6E3.A00(r0, A052, r4, A02, (AnonymousClass0YY) null, AnonymousClass7W3.A0B(r2, A13, false), 0, 0, 48, 120, false);
            AnonymousClass7W3.A0v(r2, true);
            AKE = r0.AKE();
            if (AKE != null) {
                i2 = 45;
            } else {
                return;
            }
        }
        AnonymousClass7WO.A00(AKE, new KtLambdaShape28S0201000_I2_1(i, i2, r302, ktCSuperShape0S0112000_I2));
    }

    public static final void A06(C147188nY r35, C142548fC r36, int i) {
        int i2;
        C147188nY r0 = r35;
        r0.Cvd(363404423);
        int i3 = i;
        C142548fC r2 = r36;
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r0, r2) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 11) != 2 || !r0.BCM()) {
            AnonymousClass534 r14 = AnonymousClass7DA.A01;
            Resources resources = ((Context) r0.AEA(r14)).getResources();
            C123327Wm r12 = Modifier.A00;
            float f = (float) 0;
            Modifier A04 = AnonymousClass7K4.A04(Modifier.A04(r12), f, (float) 32);
            C146288ly A0e = C147188nY.A0e(AnonymousClass7J3.A02, r0, AnonymousClass7KV.A04);
            Object A0p = C147188nY.A0p(r0);
            Object A0n = C147188nY.A0n(r0);
            Object A0m = C147188nY.A0m(r0);
            AnonymousClass0ZU r5 = AnonymousClass74X.A00;
            AnonymousClass0YM A00 = C98236Es.A00(A04);
            AnonymousClass7W3 r1 = (AnonymousClass7W3) r0;
            C147188nY.A0w(r0, r1, r5);
            AnonymousClass7W3.A0a(r0, r1, A0e, A0p);
            AnonymousClass7KP.A07(r0, A0n, A0m, A00);
            C147188nY r28 = r0;
            C97846Dc.A00(r28, (Alignment) null, AnonymousClass7K4.A04(r12, (float) 4, f), C115866w2.A01(C120537Bh.A00(r0).A0g), AnonymousClass73J.A00(C40348Lds.A00((Context) C147188nY.A0t(r0, r14, -601926677), R.drawable.instagram_play_pano_outline_16), r0), (C146878n1) null, (String) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 440, 56);
            Object A0r = C147188nY.A0r(r0, r1, -492369756);
            if (A0r == AnonymousClass7GN.A00) {
                if (r2 instanceof C134407xd) {
                    A0r = AnonymousClass7I1.A02(resources, Integer.valueOf(((C134407xd) r2).A00));
                } else if (r2 instanceof C134417xe) {
                    A0r = AnonymousClass7I1.A03(resources, Integer.valueOf(((C134417xe) r2).A00), 2131831838);
                } else {
                    throw AnonymousClass4VZ.A00();
                }
                r1.A14(A0r);
            }
            AnonymousClass7W3.A0w(r1, false);
            C04220Ms.A09(A0r);
            r0.Cvb(-1223939763);
            C121807If r6 = C120537Bh.A02(r0).A08;
            C121807If r20 = r6;
            C121807If A002 = C121807If.A00(r20, (C1188372l) null, C134817yQ.A04, r6.A00.A05, (C114316t2) null, (C121117Ee) null, 2097146, AnonymousClass7KB.A02(r0), 0, 0, 0);
            AnonymousClass7W3.A0w(r1, false);
            AnonymousClass7I9.A02(r0, (Modifier) null, A002, (C114236su) null, (C134817yQ) null, (C121117Ee) null, (String) A0r, 0, 0, 0, 0, 0, 2046, 0, 0, false);
            AnonymousClass7W3.A0f(r1);
            AnonymousClass70V.A01(r0, (Modifier) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 0, 7, 0);
        } else {
            r0.CuJ();
        }
        C147178nW AKE = r0.AKE();
        if (AKE != null) {
            C147178nW.A01(AKE, r2, i3, 19);
        }
    }

    public static final void A07(C147188nY r34, C965165g r35, AnonymousClass0ZU r36, AnonymousClass0ZU r37, AnonymousClass0YY r38, AnonymousClass0YY r39, AnonymousClass0YY r40, AnonymousClass0YY r41, AnonymousClass0YM r42, int i) {
        C147188nY r3 = r34;
        r3.Cvd(-1417528781);
        int A00 = C147188nY.A00(r3);
        AnonymousClass7W3 r7 = (AnonymousClass7W3) r3;
        Object A13 = r7.A13();
        Object obj = AnonymousClass7GN.A00;
        C83224qz A01 = AnonymousClass7WN.A01(r7, C86104wH.A0b(r3, r7, A13, obj, A13));
        Object A0r = C147188nY.A0r(r3, r7, A00);
        if (A0r == obj) {
            A0r = AnonymousClass7WR.A00(r7, (Object) null);
        }
        AnonymousClass7W3.A0w(r7, false);
        C147368pE r13 = (C147368pE) A0r;
        boolean A0y = C147188nY.A0y(r3, r13);
        Object A132 = r7.A13();
        if (A0y || A132 == obj) {
            A132 = new KtLambdaShape170S0100000_I2_3(r13, 6);
            r7.A14(A132);
        }
        AnonymousClass7W3.A0w(r7, false);
        AnonymousClass6QQ.A00(r3, (AnonymousClass066) null, (AnonymousClass0YP) A132, 0, 1);
        LazyListState A002 = C97946Do.A00(r3, 0, 3);
        AnonymousClass0YY r11 = r41;
        boolean A10 = C147188nY.A10(r3, A002, r11, 511388516);
        Object A133 = r7.A13();
        if (A10 || A133 == obj) {
            A133 = new KtSLambdaShape22S0201000_I2_8(A002, r11, (C146958n9) null, 46);
            r7.A14(A133);
        }
        AnonymousClass7W3.A0b(r3, r7, A133, A002, false);
        UserSession userSession = (UserSession) AnonymousClass7CZ.A01(r3);
        Object A0r2 = C147188nY.A0r(r3, r7, A00);
        if (A0r2 == obj) {
            A0r2 = AnonymousClass7WR.A00(r7, new AnonymousClass7JK(AnonymousClass7JK.A01));
        }
        AnonymousClass7W3.A0w(r7, false);
        C147368pE r14 = (C147368pE) A0r2;
        C965165g r0 = r35;
        AnonymousClass0ZU r17 = r37;
        AnonymousClass0YY r18 = r38;
        AnonymousClass0YY r19 = r39;
        AnonymousClass0YY r20 = r40;
        AnonymousClass0YM r21 = r42;
        int i2 = i;
        C115696vl.A01((C142708fS) null, (C145058jl) null, (C145068jm) null, A002, r3, (C142878fk) null, (Modifier) null, new AnonymousClass8K0(r13, r14, userSession, r0, r17, r18, r19, r20, r21, A01, i2), 12582912, 125, false, true);
        Object obj2 = r0.A01.A00;
        AnonymousClass0ZU r15 = r36;
        if (obj2 != null) {
            Object A0r3 = C147188nY.A0r(r3, r7, A00);
            MutableTransitionState mutableTransitionState = A0r3;
            if (A0r3 == obj) {
                MutableTransitionState mutableTransitionState2 = new MutableTransitionState(false);
                mutableTransitionState2.A02.CrC(true);
                r7.A14(mutableTransitionState2);
                mutableTransitionState = mutableTransitionState2;
            }
            AnonymousClass7W3.A0w(r7, false);
            MutableTransitionState mutableTransitionState3 = (MutableTransitionState) mutableTransitionState;
            C147188nY r27 = r3;
            AnonymousClass7JP.A02(AnonymousClass7KU.A03(C122777Tu.A01(AnonymousClass7Hh.A03()), AnonymousClass8QR.A00), (C1203779x) null, mutableTransitionState3, r27, (Modifier) null, (String) null, AnonymousClass7JR.A00(r3, new KtLambdaShape20S0301000_I2(i2, 8, r14, obj2, r15), 421815944), 196992, 26);
        }
        C147178nW AKE = r3.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape2S0801000_I2(r0, r17, r15, r21, r11, r18, r19, r20, i2, 3));
        }
    }

    public static final void A08(C147188nY r23, C88 c88, AnonymousClass0ZU r25, AnonymousClass0ZU r26, AnonymousClass0ZU r27, AnonymousClass0ZU r28, AnonymousClass0YY r29, AnonymousClass0YY r30, AnonymousClass0YM r31, int i) {
        C147188nY r7 = r23;
        r7.Cvd(1413478982);
        C88 c882 = c88;
        C81784oM A01 = AnonymousClass7Aj.A01(r7, c882.A08);
        Object A0o = C147188nY.A0o(r7);
        Object value = A01.getValue();
        AnonymousClass0ZU r5 = r25;
        AnonymousClass0ZU r4 = r26;
        AnonymousClass0ZU r16 = r27;
        AnonymousClass0ZU r15 = r28;
        AnonymousClass0YY r3 = r29;
        AnonymousClass0YY r20 = r30;
        AnonymousClass0YM r17 = r31;
        int i2 = i;
        if (value instanceof C965265i) {
            r7.Cvb(-1481369915);
            A01(r7, 0);
        } else if (value instanceof AnonymousClass65h) {
            r7.Cvb(-1481369854);
            Unit unit = Unit.A00;
            boolean A0z = C147188nY.A0z(r7, r4, 1157296644);
            AnonymousClass7W3 r2 = (AnonymousClass7W3) r7;
            Object A13 = r2.A13();
            if (A0z || A13 == AnonymousClass7GN.A00) {
                A13 = new KtSLambdaShape17S0100000_I2_6(r4, (C146958n9) null, 0);
                r2.A14(A13);
            }
            AnonymousClass7W3.A0b(r7, r2, A13, unit, false);
        } else if (value instanceof C965165g) {
            r7.Cvb(-1481369775);
            Unit unit2 = Unit.A00;
            boolean A0z2 = C147188nY.A0z(r7, r5, 1157296644);
            AnonymousClass7W3 r11 = (AnonymousClass7W3) r7;
            Object A132 = r11.A13();
            if (A0z2 || A132 == AnonymousClass7GN.A00) {
                A132 = new KtSLambdaShape17S0100000_I2_6(r5, (C146958n9) null, 1);
                r11.A14(A132);
            }
            AnonymousClass7W3.A0b(r7, r11, A132, unit2, false);
            AnonymousClass6VU r8 = (AnonymousClass6VU) A01.getValue();
            C04220Ms.A0C(r8, "null cannot be cast to non-null type com.instagram.user.userlist.fragment.LikesListViewModel.ViewState.Data");
            C965165g r82 = (C965165g) r8;
            KtLambdaShape166S0100000_I2_21 ktLambdaShape166S0100000_I2_21 = new KtLambdaShape166S0100000_I2_21(c882, 12);
            boolean A0z3 = C147188nY.A0z(r7, r3, 1157296644);
            Object A133 = r11.A13();
            if (A0z3 || A133 == AnonymousClass7GN.A00) {
                A133 = new KtLambdaShape166S0100000_I2_21(r3, 13);
                r11.A14(A133);
            }
            A07(r23, r82, r16, r15, ktLambdaShape166S0100000_I2_21, AnonymousClass7W3.A0A(r11, A133, false), new KtLambdaShape47S0200000_I2_8(8, A0o, (Object) c882), r30, r31, (458752 & i) | 4104 | (3670016 & i) | (29360128 & i));
        } else {
            r7.Cvb(-1481369166);
        }
        AnonymousClass7W3.A0y(r7);
        C147178nW AKE = r7.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape2S0801000_I2(c882, r15, r16, r17, r4, r5, r20, r3, i2, 4));
        }
    }

    public static final void A05(C147188nY r36, ImageUrl imageUrl, C23894D0g d0g, String str, String str2, String str3, AnonymousClass0ZU r42, AnonymousClass0ZU r43, AnonymousClass0YY r44, int i, int i2, boolean z, boolean z2, boolean z3) {
        int i3;
        int i4;
        C147188nY r7 = r36;
        r7.Cvd(415908769);
        int i5 = i;
        int i6 = 4;
        if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r7, imageUrl) | i;
        } else {
            i3 = i5;
        }
        String str4 = str;
        if ((i & 112) == 0) {
            i3 |= C147188nY.A0G(r7, str4);
        }
        String str5 = str2;
        if ((i5 & 896) == 0) {
            i3 |= C147188nY.A0H(r7, str5);
        }
        String str6 = str3;
        if ((i5 & 7168) == 0) {
            i3 |= C147188nY.A0I(r7, str6);
        }
        boolean z4 = z;
        if ((i & 57344) == 0) {
            i3 |= C147188nY.A0P(r7, z4);
        }
        C23894D0g d0g2 = d0g;
        if ((i & 458752) == 0) {
            i3 |= C147188nY.A0K(r7, d0g2);
        }
        boolean z5 = z2;
        if ((i & 3670016) == 0) {
            i3 |= C86104wH.A01(r7.ACZ(z5) ? 1 : 0);
        }
        boolean z6 = z3;
        if ((i & 29360128) == 0) {
            i3 |= C86104wH.A04(r7.ACZ(z6) ? 1 : 0);
        }
        AnonymousClass0YY r6 = r44;
        if ((i & 234881024) == 0) {
            i3 |= C86104wH.A03(r7.ACa(r6) ? 1 : 0);
        }
        AnonymousClass0ZU r13 = r42;
        if ((i & 1879048192) == 0) {
            i3 |= C86104wH.A02(r7.ACa(r13) ? 1 : 0);
        }
        int i7 = i2;
        AnonymousClass0ZU r12 = r43;
        if ((i2 & 14) == 0) {
            if (!r7.ACa(r12)) {
                i6 = 2;
            }
            i4 = i2 | i6;
        } else {
            i4 = i7;
        }
        if ((i3 & 1533916891) == 306783378 && (i4 & 11) == 2 && r7.BCM()) {
            r7.CuJ();
        } else {
            C148858sI A00 = AnonymousClass7JR.A00(r7, new KtLambdaShape2S0211000_I2(d0g2, r12, i4, 1, z4), -947869698);
            int i8 = i3 << 3;
            int A04 = C86144wL.A04((i3 & 14) | (i3 & 112), i8 & 7168, i8, 57344);
            int i9 = i3 >> 3;
            ImageUrl imageUrl2 = imageUrl;
            String str7 = str4;
            String str8 = str5;
            String str9 = str6;
            AnonymousClass0ZU r24 = r13;
            C147188nY r16 = r7;
            C121747Hv.A00(r16, (Modifier) null, imageUrl2, (C146798ms) null, (AnonymousClass5I7) null, str7, str8, str9, r24, r6, A00, C86144wL.A04(A04, 458752 & i9, i9, 3670016), ((i3 >> 24) & 112) | 3072 | ((i3 >> 18) & 896), 1924, z5, z6, false, false);
        }
        C147178nW AKE = r7.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new C140278Tp(imageUrl, d0g2, str4, str5, str6, r13, r12, r6, i5, i7, z4, z5, z6));
        }
    }
}
