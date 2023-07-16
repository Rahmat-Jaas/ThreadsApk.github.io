package X;

import android.content.Context;
import android.text.TextUtils;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import com.instagram.service.session.UserSession;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.4Fk  reason: invalid class name and case insensitive filesystem */
public final class C70604Fk implements C85894vw {
    public final String BLz() {
        return "client_definition_validator_content";
    }

    public final C62573aJ DAL(Context context, QuickPromotionSurface quickPromotionSurface, C57833Cq r7, UserSession userSession, Set set, Set set2, long j, long j2) {
        String str;
        List list;
        AnonymousClass268 A01;
        AnonymousClass268 A012;
        C28231tu r0;
        if (!r7.A04) {
            AnonymousClass3GI r1 = r7.A02;
            if (r1 == null || (list = r1.A06) == null || list.isEmpty()) {
                str = "Promotion has no creatives";
            } else {
                C28221tt r2 = (C28221tt) C18240wQ.A0b(r1.A06);
                C28251tw r02 = r2.A09;
                if (r02 == null || TextUtils.isEmpty(r02.A00)) {
                    str = "Promotion has no title";
                } else if (quickPromotionSurface == QuickPromotionSurface.TOOLTIP || quickPromotionSurface == QuickPromotionSurface.FLOATING_BANNER || quickPromotionSurface == QuickPromotionSurface.RTC_PEEK || ((r0 = r2.A03) != null && !TextUtils.isEmpty(r0.A00))) {
                    AnonymousClass3CQ r12 = r2.A01;
                    if (r12 != null && !TextUtils.isEmpty(r12.A03) && ((A012 = AnonymousClass268.A01(r12.A03, EnumSet.allOf(AnonymousClass268.class))) == null || !set2.contains(A012))) {
                        return C62573aJ.A03;
                    }
                    AnonymousClass3CQ r13 = r2.A02;
                    if (r13 != null && !TextUtils.isEmpty(r13.A03) && ((A01 = AnonymousClass268.A01(r13.A03, EnumSet.allOf(AnonymousClass268.class))) == null || !set2.contains(A01))) {
                        return C62573aJ.A04;
                    }
                } else {
                    str = "Promotion has no content";
                }
            }
            return new C62573aJ(str, false, true);
        }
        return C62573aJ.A00();
    }
}
