package X;

import android.content.Context;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import com.instagram.service.session.UserSession;
import java.util.List;
import java.util.Set;

/* renamed from: X.4Fl  reason: invalid class name and case insensitive filesystem */
public final class C70614Fl implements C85894vw {
    public final String BLz() {
        return "client_definition_validator_filters";
    }

    public final C62573aJ DAL(Context context, QuickPromotionSurface quickPromotionSurface, C57833Cq r7, UserSession userSession, Set set, Set set2, long j, long j2) {
        List<AnonymousClass3FV> list;
        AnonymousClass3FV r0 = r7.A02.A00;
        if (!(r0 == null || (list = r0.A01) == null)) {
            for (AnonymousClass3FV r02 : list) {
                List<AnonymousClass3HP> list2 = r02.A02;
                if (list2 != null) {
                    for (AnonymousClass3HP r03 : list2) {
                        if (r03.A01 == null) {
                            return new C62573aJ("Promotion has a filter with missing or invalid data", false, true);
                        }
                    }
                    continue;
                }
            }
        }
        return C62573aJ.A00();
    }
}
