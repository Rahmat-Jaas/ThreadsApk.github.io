package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.proxygen.TraceEventType;
import com.facebook.redex.IDxCListenerShape20S0400000_1_I2;
import com.google.common.collect.ImmutableMap;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3WA  reason: invalid class name */
public final class AnonymousClass3WA {
    public static final void A01(FragmentActivity fragmentActivity, AnonymousClass3HX r11, AnonymousClass601 r12, C127397h3 r13) {
        C04220Ms.A0B(fragmentActivity, 0);
        AnonymousClass601 r6 = r12;
        AnonymousClass0wJ.A1Q(r12, r13);
        C25828Dsm A0W = C18190wL.A0W(fragmentActivity);
        String A0N = r13.A0N(40);
        if (!(A0N == null || A0N.length() == 0)) {
            A0W.A02 = A0N;
        }
        String A0N2 = r13.A0N(35);
        if (!(A0N2 == null || A0N2.length() == 0)) {
            A0W.A0p(A0N2);
        }
        C127397h3 A0K = r13.A0K(36);
        AnonymousClass3HX r5 = r11;
        if (A0K != null) {
            C109326jp A0L = A0K.A0L(35);
            String A0N3 = A0K.A0N(36);
            if (!(A0N3 == null || A0L == null)) {
                A0W.A0c(new IDxCListenerShape20S0400000_1_I2(r5, r6, A0K, A0L, 0), A0N3);
            }
        }
        C127397h3 A0K2 = r13.A0K(38);
        if (A0K2 != null) {
            C109326jp A0L2 = A0K2.A0L(35);
            String A0N4 = A0K2.A0N(36);
            if (!(A0N4 == null || A0L2 == null)) {
                A0W.A0b(new IDxCListenerShape20S0400000_1_I2(r5, r6, A0K2, A0L2, 1), A0N4);
            }
        }
        AnonymousClass0wJ.A1K(A0W);
    }

    public static final void A02(AnonymousClass601 r12, C127397h3 r13, C127397h3 r14, Map map) {
        boolean z;
        boolean z2;
        boolean z3;
        String A0O;
        boolean A1Z = AnonymousClass0wJ.A1Z(r12, r13);
        C04220Ms.A0B(map, 2);
        Map map2 = null;
        AnonymousClass3TP A00 = C62863b2.A00((AnonymousClass4nQ) null, C63913ic.A0D(r12), C63763iI.A03(r13));
        C130667qT A08 = C63913ic.A08(r12);
        int i = r13.A03;
        if (i == 13647) {
            z = r13.A0T(49, false);
        } else if (AnonymousClass0wJ.A1T(i, 13784)) {
            z = false;
        } else {
            throw C18190wL.A0a("screen should be an instance of BloksScreenData or BloksScreenV2Data");
        }
        C127397h3 A04 = C63763iI.A04(r13, 13883);
        boolean z4 = false;
        if (A04 != null) {
            z = !A04.A0T(43, A1Z);
            z2 = A04.A0T(41, false);
            z3 = A04.A0T(42, false);
            C109326jp A0L = A04.A0L(46);
            map2 = null;
            if (A0L != null) {
                Object A002 = C61043Rr.A00(r12, C63893iY.A01, A0L);
                if (A002 == null) {
                    C30967GcS.A02("BloksInterpreter", "Evaluating BKBloksDataContribScreenScreenIgConstants.ANALYTICS_EXTRAS returned null. A map was expected");
                } else {
                    ImmutableMap.Builder builder = new ImmutableMap.Builder();
                    Iterator A0u = C18190wL.A0u((AbstractMap) A002);
                    while (A0u.hasNext()) {
                        Map.Entry A0o = C18180wK.A0o(A0u);
                        Object key = A0o.getKey();
                        Object value = A0o.getValue();
                        if (!(key == null || value == null)) {
                            builder.put(key, value);
                        }
                    }
                    map2 = builder.build();
                }
            }
        } else {
            z2 = false;
            z3 = false;
        }
        String A07 = C63763iI.A07(r13);
        if (C63763iI.A04(r13, 15855) != null) {
            z4 = true;
        }
        C62343Yl r10 = new C62343Yl(A00, C63913ic.A0F(r12));
        IgBloksScreenConfig igBloksScreenConfig = r10.A00;
        igBloksScreenConfig.A0h = !z;
        igBloksScreenConfig.A0c = z2;
        igBloksScreenConfig.A0d = z3;
        igBloksScreenConfig.A0Y = A08.A00;
        igBloksScreenConfig.A03 = new C72284Ni();
        igBloksScreenConfig.A0Z = z4;
        String str = TraceEventType.Push;
        if (!(r14 == null || (A0O = r14.A0O(35, str)) == null)) {
            str = A0O;
        }
        igBloksScreenConfig.A0O = AnonymousClass2JP.A00(str);
        if (z4) {
            C121997Jj A01 = C63763iI.A01(r12, r13);
            if (A01 == null) {
                C30967GcS.A02("IgBloksScreenActionUtils", "ActionLoad contrib was sent but action_loaded_screen_parse_result doesn't exist in bk.data.screen.screen");
            }
            igBloksScreenConfig.A08 = A01;
        } else {
            C127397h3 A02 = C63763iI.A02(r13);
            C121997Jj r0 = null;
            if (A02 != null) {
                r0 = C121997Jj.A00(r12, A02);
            }
            r10.A02(r0);
        }
        igBloksScreenConfig.A0W = map2;
        r10.A03(C63763iI.A06(r13));
        C63763iI.A0C(igBloksScreenConfig, r13);
        C63743iE r1 = new C63743iE(C63913ic.A0N(map), C63763iI.A0B(r12, r14, 38), A07);
        r1.A00 = C63763iI.A00(r13);
        r1.A03 = r13;
        r1.A04 = r14;
        if (map2 == null) {
            map2 = AnonymousClass0wJ.A0y();
        }
        r1.A0G(map2);
        r1.A0G(C63763iI.A0A(r12, r13));
        r1.A05 = C63763iI.A08(r13);
        r1.A0C(C63913ic.A05(r12), igBloksScreenConfig);
    }

    public static final void A00(FragmentActivity fragmentActivity, C12560m7 r2) {
        AnonymousClass0wJ.A1N(r2, fragmentActivity);
        if (r2.A0I() <= 0 || r2.A0F) {
            fragmentActivity.onBackPressed();
        } else {
            r2.A0d();
        }
    }
}
