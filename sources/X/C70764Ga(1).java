package X;

import com.instagram.service.session.UserSession;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4Ga  reason: invalid class name and case insensitive filesystem */
public final class C70764Ga implements C85804vn {
    public static final String __redex_internal_original_name = "QPClientDebugLogger";
    public final C85804vn A00;
    public final UserSession A01;

    public C70764Ga(UserSession userSession) {
        C85804vn r0;
        C04220Ms.A0B(userSession, 1);
        this.A01 = userSession;
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36318277814718791L)) {
            r0 = new C70774Gb(userSession);
        } else {
            r0 = new AnonymousClass4GZ();
        }
        this.A00 = r0;
    }

    public final void Bbi(AnonymousClass3VC r8, String str, String str2, Collection collection, Collection collection2, List list) {
        C18190wL.A1S(str2, 3, collection2);
        this.A00.Bbi(r8, (String) null, str2, collection, collection2, list);
    }

    public final void Bc5(String str, String str2, String str3, List list, List list2, List list3, List list4, boolean z) {
        C04220Ms.A0B(str, 0);
        this.A00.Bc5(str, (String) null, str3, list, list2, (List) null, (List) null, z);
    }

    public final void BcG(C81644o8 r7, Integer num, String str, String str2, boolean z) {
        AnonymousClass0wJ.A1M(num, 0, r7);
        C04220Ms.A0B(str2, 4);
        this.A00.BcG(r7, num, (String) null, str2, z);
    }

    public final void BdJ(AnonymousClass3VC r3, String str, String str2, Map map) {
        C04220Ms.A0B(str2, 2);
        this.A00.BdJ(r3, (String) null, str2, map);
    }

    public final void Bda(String str, String str2, Map map, boolean z) {
        C04220Ms.A0B(str2, 2);
        this.A00.Bda((String) null, str2, map, z);
    }

    public final void Bdp(String str, String str2, Set set, boolean z) {
        AnonymousClass0wJ.A1Q(str2, set);
        this.A00.Bdp((String) null, str2, set, z);
    }

    public final String getModuleName() {
        return "quick_promotion";
    }

    public final void BbU(String str, String str2, Map map) {
        this.A00.BbU(C18230wP.A0r(str2), str2, map);
    }

    public final void Bc0(String str, String str2, Map map) {
        this.A00.Bc0(C18230wP.A0r(str2), str2, map);
    }

    public final void Bd2(String str, String str2, Map map) {
        this.A00.Bd2(C18230wP.A0r(str2), str2, map);
    }

    public final void Bd5(String str, String str2, Map map) {
        this.A00.Bd5(C18230wP.A0r(str2), str2, map);
    }

    public final void BdF(String str, String str2, Map map) {
        this.A00.BdF(C18230wP.A0r(str2), str2, map);
    }

    public final void BdX(String str, String str2, Map map) {
        this.A00.BdX(C18230wP.A0r(str2), str2, map);
    }
}
