package X;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierElement;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.common.ui.sharedelement.SharedElementsOverlayKt$SharedElementOverlay$2;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape2S0601000_I2;
import kotlin.jvm.internal.KtLambdaShape171S0100000_I2;
import kotlin.jvm.internal.KtLambdaShape27S0201000_I2;
import kotlin.jvm.internal.KtLambdaShape6S0400000_I2;

/* renamed from: X.6z6  reason: invalid class name and case insensitive filesystem */
public final class C117696z6 {
    public static final void A00(C147188nY r9, int i) {
        r9.Cvd(541039060);
        if (i != 0 || !r9.BCM()) {
            Object AEA = r9.AEA(C120867Cw.A01);
            if (AEA != null) {
                C115596vX r6 = (C115596vX) AEA;
                if (r6.A05()) {
                    C123327Wm A01 = Modifier.A01(r9);
                    C146288ly A00 = C120767Cj.A00(r9, AnonymousClass7KV.A0E, false);
                    Object A0p = C147188nY.A0p(r9);
                    Object A0n = C147188nY.A0n(r9);
                    Object A0m = C147188nY.A0m(r9);
                    AnonymousClass0ZU r1 = AnonymousClass74X.A00;
                    AnonymousClass0YM A002 = C98236Es.A00(A01);
                    AnonymousClass7W3 r4 = (AnonymousClass7W3) r9;
                    C147188nY.A0w(r9, r4, r1);
                    AnonymousClass7W3.A0a(r9, r4, A00, A0p);
                    AnonymousClass7KP.A07(r9, A0n, A0m, A002);
                    r9.Cvb(-2033427659);
                    Iterator A0q = C86154wM.A0q(r6.A02.getValue());
                    while (A0q.hasNext()) {
                        C89915Hn r2 = (C89915Hn) A0q.next();
                        String str = r2.A08;
                        if (r6.A06(str)) {
                            r9.CvO(-486110265, str);
                            A01(r9, r2, r6, 0);
                            AnonymousClass7W3.A0w(r4, false);
                        }
                    }
                    AnonymousClass7W3.A0f(r4);
                }
            } else {
                throw AnonymousClass0wJ.A0b();
            }
        } else {
            r9.CuJ();
        }
        C147178nW AKE = r9.AKE();
        if (AKE != null) {
            C147178nW.A00(AKE, i, 1);
        }
    }

    public static final void A01(C147188nY r33, C89915Hn r34, C115596vX r35, int i) {
        int i2;
        C147178nW AKE;
        int i3;
        C147188nY r4 = r33;
        r4.Cvd(1842264041);
        int i4 = i;
        int i5 = i & 14;
        C115596vX r36 = r35;
        if (i5 == 0) {
            i2 = C147188nY.A0F(r4, r36) | i4;
        } else {
            i2 = i4;
        }
        C89915Hn r3 = r34;
        if ((i4 & 112) == 0) {
            i2 |= C147188nY.A0G(r4, r3);
        }
        if ((i2 & 91) != 18 || !r4.BCM()) {
            C115556vT r1 = r36.A00;
            String str = ((C123917Zx) MutableTransitionState.A00(r1)).A0A;
            String str2 = ((C123917Zx) r1.A06.getValue()).A0A;
            AnonymousClass7W3 r2 = (AnonymousClass7W3) r4;
            Object A13 = r2.A13();
            Object obj = AnonymousClass7GN.A00;
            if (A13 == obj) {
                A13 = AnonymousClass7WR.A00(r2, (Object) null);
            }
            C147368pE r6 = (C147368pE) A13;
            if (r6.getValue() == null) {
                r6.CrC(r36.A00(r3.A07, str));
            }
            C89915Hn A00 = r36.A00(r3.A07, str2);
            C89915Hn r12 = (C89915Hn) r6.getValue();
            if (A00 == null || r12 == null) {
                AKE = r4.AKE();
                if (AKE != null) {
                    i3 = 32;
                    AnonymousClass7WO.A00(AKE, new KtLambdaShape27S0201000_I2(i4, i3, r36, r3));
                }
                return;
            }
            Object A0r = C147188nY.A0r(r4, r2, -492369756);
            if (A0r == obj) {
                A0r = AnonymousClass7JH.A00(C103866ar.A06, C86124wJ.A0O(AnonymousClass7KC.A04(r12.A01, r3.A01)));
                r2.A14(A0r);
            }
            AnonymousClass7W3.A0w(r2, false);
            AnonymousClass7JH r11 = (AnonymousClass7JH) A0r;
            Object A0r2 = C147188nY.A0r(r4, r2, -492369756);
            if (A0r2 == obj) {
                A0r2 = AnonymousClass6DU.A00((AnonymousClass7JK.A01(r12.A02) * C18240wQ.A00(r12.A0A.invoke())) / AnonymousClass7JK.A01(r3.A02));
                r2.A14(A0r2);
            }
            AnonymousClass7W3.A0w(r2, false);
            AnonymousClass7JH r10 = (AnonymousClass7JH) A0r2;
            Object A0r3 = C147188nY.A0r(r4, r2, -492369756);
            if (A0r3 == obj) {
                A0r3 = AnonymousClass7JH.A00(C103866ar.A01, C134847yT.A00(r12.A00));
                r2.A14(A0r3);
            }
            AnonymousClass7W3.A0w(r2, false);
            AnonymousClass7JH r9 = (AnonymousClass7JH) A0r3;
            Object A0r4 = C147188nY.A0r(r4, r2, -492369756);
            float f = 1.0f;
            if (A0r4 == obj) {
                A0r4 = AnonymousClass6DU.A00(C86164wN.A01(r12.equals(r3) ? 1 : 0));
                r2.A14(A0r4);
            }
            AnonymousClass7W3.A0w(r2, false);
            AnonymousClass7JH r62 = (AnonymousClass7JH) A0r4;
            long A04 = AnonymousClass7KC.A04(A00.A01, r3.A01);
            float A01 = AnonymousClass7JK.A01(A00.A02);
            long j = r3.A02;
            float A012 = A01 / AnonymousClass7JK.A01(j);
            float f2 = A00.A00;
            if (!A00.equals(r3)) {
                f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            r4.Cvb(773894976);
            Object A0r5 = C147188nY.A0r(r4, r2, -492369756);
            AnonymousClass7JH r19 = r11;
            AnonymousClass7JH r20 = r10;
            AnonymousClass7JH r21 = r9;
            AnonymousClass7JH r22 = r62;
            C89915Hn r23 = r3;
            C89915Hn r24 = A00;
            AnonymousClass7K5.A07(r4, new SharedElementsOverlayKt$SharedElementOverlay$2(r19, r20, r21, r22, r23, r24, r36, str, (C146958n9) null, AnonymousClass7WN.A00(r2, C86104wH.A0b(r4, r2, A0r5, obj, A0r5)), A012, f2, f, A04), new Object[]{C86124wJ.A0O(A04), Float.valueOf(A012), C134847yT.A00(f2), Float.valueOf(f), str2});
            AnonymousClass7K5.A05(r4, Unit.A00, new KtSLambdaShape2S0601000_I2(r10, r9, r36, r22, r23, r11, (C146958n9) null, 6));
            AnonymousClass534 r122 = AnonymousClass7DE.A02;
            long CxF = C147188nY.A0k(r4, r122).CxF(j);
            C123327Wm r8 = Modifier.A00;
            boolean A0y = C147188nY.A0y(r4, r3);
            Object A132 = r2.A13();
            if (A0y || A132 == obj) {
                A132 = AnonymousClass7W3.A0F(r2, r3, 38);
            }
            AnonymousClass7W3.A0w(r2, false);
            KtLambdaShape171S0100000_I2 A0w = C86164wN.A0w(A132, 26);
            AnonymousClass0wJ.A1N(r8, A0w);
            Modifier Cx6 = r8.Cx6(new LayoutModifierElement(A0w));
            C04220Ms.A0B(Cx6, 0);
            Modifier A013 = C115876w3.A01(AnonymousClass7Kq.A0D(Cx6, AnonymousClass7HB.A01(CxF), AnonymousClass7HB.A00(CxF)), new KtLambdaShape6S0400000_I2(10, r62, r10, r11, r9));
            C146288ly A002 = C120767Cj.A00(r4, AnonymousClass7KV.A00(r4), true);
            Object A0s = C147188nY.A0s(r4, r122);
            Object A0n = C147188nY.A0n(r4);
            Object A0m = C147188nY.A0m(r4);
            AnonymousClass0ZU r0 = AnonymousClass74X.A00;
            AnonymousClass0YM A003 = C98236Es.A00(A013);
            C147188nY.A0w(r4, r2, r0);
            AnonymousClass7W3.A0a(r4, r2, A002, A0s);
            Integer A0l = C147188nY.A0l(r4, AnonymousClass7KP.A01(r4, A0n, A0m), A003);
            r4.Cvb(-45254673);
            r3.A0B.invoke(r4, A0l);
            AnonymousClass7W3.A0v(r2, true);
        } else {
            r4.CuJ();
        }
        AKE = r4.AKE();
        if (AKE != null) {
            i3 = 33;
            AnonymousClass7WO.A00(AKE, new KtLambdaShape27S0201000_I2(i4, i3, r36, r3));
        }
    }
}
