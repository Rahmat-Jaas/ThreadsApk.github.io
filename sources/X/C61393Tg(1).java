package X;

import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.instagram.service.session.UserSession;
import fxcache.model.FxCalAccountWithSwitcherInfo;
import java.lang.reflect.Type;
import java.util.List;

/* renamed from: X.3Tg  reason: invalid class name and case insensitive filesystem */
public final class C61393Tg {
    public final int A01(UserSession userSession, boolean z) {
        String A0W;
        int intValue;
        C04220Ms.A0B(userSession, 0);
        if (z) {
            SharedPreferences A01 = AnonymousClass3Zs.A03(userSession).A01(D2R.A15);
            if (A01.contains("switcher_badge_impression_count") && (A0W = C18250wR.A0W(A01, "switcher_badge_impression_count")) != null) {
                Type type = new AnonymousClass1QW().type;
                C04220Ms.A06(type);
                List list = (List) new Gson().A07(A0W, type);
                if (list != null) {
                    if (C63793iM.A0A(userSession)) {
                        intValue = 2;
                    } else {
                        C61823Vx r0 = C61823Vx.A01;
                        if (r0 == null) {
                            AnonymousClass3X7.A01(18588146011803554L);
                        } else {
                            AnonymousClass3Ie A03 = r0.A03();
                            if (A03 != null) {
                                A03.A01.A00.Bc7(18588146011803554L);
                            }
                        }
                        intValue = C63173fJ.A02(AnonymousClass0TJ.A04, 18588146011803554L).intValue();
                    }
                    if (list.size() > intValue && (C63793iM.A0A(userSession) || C63793iM.A0F(18306671035226624L))) {
                        return 0;
                    }
                }
            }
        }
        List<FxCalAccountWithSwitcherInfo> A00 = C35692Ol.A00(userSession).A00(C550931s.A00);
        AnonymousClass0TJ r3 = AnonymousClass0TJ.A05;
        boolean A05 = C63173fJ.A05(r3, 18306671035488770L);
        boolean A0E = C63803iN.A0E(r3, userSession, 2342171212697839933L);
        if (A05 && A0E) {
            return 0;
        }
        int i = 0;
        for (FxCalAccountWithSwitcherInfo fxCalAccountWithSwitcherInfo : A00) {
            if (!C04220Ms.A0I(fxCalAccountWithSwitcherInfo.A02, "INSTAGRAM")) {
                String A0L = AnonymousClass00U.A0L("switcher_tapped_badge_count_", fxCalAccountWithSwitcherInfo.A01);
                int i2 = fxCalAccountWithSwitcherInfo.A00;
                if (!A00(userSession, A0L, i2)) {
                    i2 = 0;
                }
                i += i2;
            }
        }
        if (!z || A00(userSession, "switcher_aggregate_seen_badge_count", i)) {
            return i;
        }
        return 0;
    }

    public static final boolean A00(UserSession userSession, String str, int i) {
        SharedPreferences A01 = AnonymousClass3Zs.A03(userSession).A01(D2R.A15);
        C208016e r0 = null;
        String string = A01.getString(str, (String) null);
        if (string != null) {
            r0 = (C208016e) new Gson().A06(string, C208016e.class);
        }
        if (r0 != null) {
            if (r0.A00 == i) {
                return false;
            }
            C18180wK.A0u(A01.edit(), str);
        }
        return true;
    }
}
