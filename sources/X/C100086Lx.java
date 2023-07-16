package X;

import android.content.Context;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2010000_I2;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape2S0402000_I2;
import kotlin.jvm.internal.KtLambdaShape31S0100000_I2_11;
import kotlin.jvm.internal.KtLambdaShape6S1000000_I2;

/* renamed from: X.6Lx  reason: invalid class name and case insensitive filesystem */
public final class C100086Lx {
    public static final void A00(C147188nY r43, Modifier modifier, Double d, List list, AnonymousClass0ZU r47, int i, int i2) {
        List list2 = list;
        AnonymousClass0ZU r15 = r47;
        int A02 = C18200wM.A02(0, list2, r15);
        C147188nY r1 = r43;
        int i3 = i2;
        Modifier A0d = C147188nY.A0d(r1, modifier, 1444370315, i3);
        Double d2 = d;
        int i4 = i;
        if (!list2.isEmpty()) {
            int i5 = ((i >> 9) & 14) | 432;
            C146288ly A0e = C147188nY.A0e(AnonymousClass7J3.A01, r1, AnonymousClass7KV.A04);
            Object A0p = C147188nY.A0p(r1);
            Object A0n = C147188nY.A0n(r1);
            Object A0m = C147188nY.A0m(r1);
            AnonymousClass0ZU r5 = AnonymousClass74X.A00;
            AnonymousClass0YM A00 = C98236Es.A00(A0d);
            int A01 = C86114wI.A01((i5 << 3) & 112);
            AnonymousClass7W3 r2 = (AnonymousClass7W3) r1;
            C147188nY.A0w(r1, r2, r5);
            AnonymousClass7W3.A0a(r1, r2, A0e, A0p);
            AnonymousClass7KP.A08(r1, A0n, A0m, A00, A01);
            AnonymousClass7VA r3 = AnonymousClass7VA.A00;
            int A05 = C86124wJ.A05(i5);
            r1.Cvb(1336620874);
            if ((A05 & 14) == 0) {
                A05 |= C147188nY.A0F(r1, r3);
            }
            if ((A05 & 91) != 18 || !r1.BCM()) {
                int size = list2.size();
                Modifier modifier2 = Modifier.A00;
                Modifier modifier3 = modifier2;
                if (size == 1) {
                    modifier2 = r3.DB5(modifier2, 1.0f, false);
                }
                String str = ((KtCSuperShape0S2010000_I2) list2.get(0)).A01;
                boolean A0z = C147188nY.A0z(r1, r15, 1157296644);
                Object A13 = r2.A13();
                if (A0z || A13 == AnonymousClass7GN.A00) {
                    A13 = new KtLambdaShape31S0100000_I2_11(r15, 10);
                    r2.A14(A13);
                }
                int i6 = A02;
                C147188nY r17 = r1;
                AnonymousClass7I9.A02(r17, C117646z1.A00(modifier3, (AnonymousClass799) null, (String) null, AnonymousClass7W3.A08(r2, A13, false), 15, false).Cx6(modifier2), AnonymousClass7J9.A04(r1), (C114236su) null, (C134817yQ) null, (C121117Ee) null, str, 0, 1, i6, 805306368, 6, 508, 0, 0, false);
                r1.Cvb(-977490107);
                if (((KtCSuperShape0S2010000_I2) list2.get(0)).A02) {
                    C115286uo A002 = AnonymousClass6QP.A00(r1, R.drawable.instagram_verified_pano_filled_24);
                    float f = (float) 0;
                    C147188nY r32 = r1;
                    C97846Dc.A00(r32, (Alignment) null, AnonymousClass7K4.A05(AnonymousClass7Kq.A0F(modifier3, 14), (float) A02, f, f, f), C115866w2.A01(C120537Bh.A00(r1).A0D), A002, (C146878n1) null, (String) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 440, 56);
                }
                AnonymousClass7W3.A0w(r2, false);
                r1.Cvb(-977489726);
                if (list2.size() >= A02) {
                    String str2 = ((KtCSuperShape0S2010000_I2) list2.get(1)).A01;
                    AnonymousClass7I9.A02(r17, r3.DB5(modifier3, 1.0f, false), AnonymousClass7J9.A02(r1), (C114236su) null, (C134817yQ) null, (C121117Ee) null, str2, 0, 1, i6, 805306368, 6, 508, 0, 0, false);
                }
                AnonymousClass7W3.A0w(r2, false);
                if (d != null) {
                    Context A0T = C147188nY.A0T(r1);
                    boolean A0z2 = C147188nY.A0z(r1, d2, 1157296644);
                    Object A132 = r2.A13();
                    if (A0z2 || A132 == AnonymousClass7GN.A00) {
                        double doubleValue = d2.doubleValue();
                        A132 = C19591Ayr.A09(A0T.getResources(), AnonymousClass68E.MINUTES, AnonymousClass006.A00, doubleValue, false);
                        r2.A14(A132);
                    }
                    AnonymousClass7W3.A0w(r2, false);
                    C04220Ms.A09(A132);
                    String str3 = (String) A132;
                    boolean A0z3 = C147188nY.A0z(r1, d2, 1157296644);
                    Object A133 = r2.A13();
                    if (A0z3 || A133 == AnonymousClass7GN.A00) {
                        double doubleValue2 = d2.doubleValue();
                        A133 = C19591Ayr.A09(A0T.getResources(), AnonymousClass68E.SECONDS, AnonymousClass006.A0N, doubleValue2, false);
                        r2.A14(A133);
                    }
                    AnonymousClass7W3.A0w(r2, false);
                    C04220Ms.A09(A133);
                    String str4 = (String) A133;
                    float f2 = (float) 0;
                    Modifier A052 = AnonymousClass7K4.A05(modifier3, (float) 4, f2, f2, f2);
                    boolean A0z4 = C147188nY.A0z(r1, str4, 1157296644);
                    Object A134 = r2.A13();
                    if (A0z4 || A134 == AnonymousClass7GN.A00) {
                        A134 = new KtLambdaShape6S1000000_I2(str4, 13);
                        r2.A14(A134);
                    }
                    AnonymousClass7I9.A02(r17, AnonymousClass6FI.A00(A052, AnonymousClass7W3.A0B(r2, A134, false), false), (C121807If) null, (C114236su) null, (C134817yQ) null, (C121117Ee) null, str3, 0, 1, A02, 805306368, 6, 2552, AnonymousClass7KB.A03(r1), 0, false);
                }
            } else {
                r1.CuJ();
            }
            AnonymousClass7W3.A0v(r2, true);
        }
        C147178nW AKE = r1.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape2S0402000_I2(A0d, d2, list2, r15, i4, i3, 5));
        }
    }
}
