package X;

import android.content.Context;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import com.instagram.service.session.UserSession;
import java.util.List;
import java.util.Set;

/* renamed from: X.4Fn  reason: invalid class name and case insensitive filesystem */
public final class C70634Fn implements C85894vw {
    public final String BLz() {
        return "client_definition_validator_triggers";
    }

    public final C62573aJ DAL(Context context, QuickPromotionSurface quickPromotionSurface, C57833Cq r7, UserSession userSession, Set set, Set set2, long j, long j2) {
        String str;
        List list;
        AnonymousClass3GI r1 = r7.A02;
        if (r1 == null || (list = r1.A07) == null || list.isEmpty()) {
            str = "Promotion has no triggers";
        } else {
            for (Object contains : r1.A07) {
                if (set.contains(contains)) {
                    return C62573aJ.A00();
                }
            }
            str = "Triggers do not match";
        }
        return new C62573aJ(str, false, true);
    }
}
