package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.service.session.UserSession;
import fxcache.model.FxCalAccount;
import fxcache.model.FxCalAccountLinkageInfo;
import fxcache.model.FxCalAccountLinkageInfoForSwitcher;
import fxcache.model.FxCalAccountWithSwitcherInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.3yw  reason: invalid class name and case insensitive filesystem */
public final class C67143yw implements CallerContextable {
    public static final CallerContext A00 = CallerContext.A00(C67143yw.class);
    public static final String __redex_internal_original_name = "BKBloksFxActionUpdateClientLinkageCacheImpl";

    public static Object A00(AnonymousClass601 r19, C63893iY r20) {
        List list = r20.A00;
        List<Object> list2 = (List) list.get(0);
        ArrayList<Map> A0v = AnonymousClass0wJ.A0v();
        C109326jp A0R = C18190wL.A0R(list, 1);
        if (list2 != null) {
            for (Object add : list2) {
                A0v.add(add);
            }
        }
        AnonymousClass601 r7 = r19;
        UserSession A0J = C63913ic.A0J(r7);
        C29691z7 A002 = C35702Om.A00(A0J);
        CallerContext callerContext = A00;
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        for (Map map : A0v) {
            String A0g = C18210wN.A0g("account_id", map);
            String A0g2 = C18210wN.A0g("instagram_id", map);
            String A0g3 = C18210wN.A0g("account_type", map);
            String A0g4 = C18210wN.A0g("account_name", map);
            String A0g5 = C18210wN.A0g("profile_picture_url", map);
            String A0g6 = C18210wN.A0g(C61973Wo.A01(229, 8, 73), map);
            String A0g7 = C18210wN.A0g("obfuscated_id", map);
            String A0r = C18220wO.A0r("badge_count", map);
            int i = 0;
            if (A0r != null) {
                try {
                    i = Integer.parseInt(A0r);
                } catch (NumberFormatException unused) {
                }
            }
            if (!C121687Hl.A02(A0g) && !C121687Hl.A02(A0g3)) {
                if (A0g == null) {
                    throw C18180wK.A0a("Required value was null.");
                } else if (A0g3 != null) {
                    A0v2.add(new FxCalAccount(i, A0g, A0g2, A0g3, A0g4, A0g5, A0g6, A0g7));
                } else {
                    throw C18180wK.A0a("Required value was null.");
                }
            }
        }
        A002.A07(callerContext, new FxCalAccountLinkageInfo(A0v2, System.currentTimeMillis()), "ig_android_fx_bloks");
        C38040KHr.A01.CWx(new AnonymousClass459());
        AnonymousClass3NS.A01(A0J).A03(AnonymousClass2AP.A0Q);
        if (C63793iM.A0E(A0J) && C63173fJ.A05(AnonymousClass0TJ.A05, 18312967456106486L)) {
            C29691z7 A003 = C35702Om.A00(A0J);
            ArrayList A0v3 = AnonymousClass0wJ.A0v();
            for (Map map2 : A0v) {
                String A0g8 = C18210wN.A0g("account_id", map2);
                String A0g9 = C18210wN.A0g("instagram_id", map2);
                String A0g10 = C18210wN.A0g("account_type", map2);
                String A0g11 = C18210wN.A0g("account_name", map2);
                String A0g12 = C18210wN.A0g("profile_picture_url", map2);
                String A0g13 = C18210wN.A0g(C61973Wo.A01(229, 8, 73), map2);
                String A0g14 = C18210wN.A0g("obfuscated_id", map2);
                String A0r2 = C18220wO.A0r("badge_count", map2);
                int i2 = 0;
                if (A0r2 != null) {
                    try {
                        i2 = Integer.parseInt(A0r2);
                    } catch (NumberFormatException unused2) {
                    }
                }
                if (!C121687Hl.A02(A0g8) && !C121687Hl.A02(A0g10)) {
                    if (A0g8 == null) {
                        throw C18180wK.A0a("Required value was null.");
                    } else if (A0g10 != null) {
                        A0v3.add(new FxCalAccountWithSwitcherInfo(i2, A0g8, A0g9, A0g10, A0g11, A0g12, A0g13, A0g14));
                    } else {
                        throw C18180wK.A0a("Required value was null.");
                    }
                }
            }
            A003.A08(callerContext, new FxCalAccountLinkageInfoForSwitcher(A0v3, System.currentTimeMillis()), "ig_android_fx_bloks");
        }
        if (A0R == null) {
            return null;
        }
        C63893iY.A0G(r7, A0R);
        return null;
    }
}
