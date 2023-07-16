package X;

import com.instagram.service.session.UserSession;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3UY  reason: invalid class name */
public final class AnonymousClass3UY {
    public static final List A02 = Collections.unmodifiableList(C06750aI.A17(C35377Itf.IAB_LANDING_PAGE_STARTED, C35377Itf.IAB_LANDING_PAGE_INTERACTIVE, C35377Itf.IAB_LANDING_PAGE_FINISHED, C35377Itf.IAB_LANDING_PAGE_VIEW_ENDED));
    public AnonymousClass3R2 A00;
    public final UserSession A01;

    public final String A00(String str) {
        AnonymousClass3R2 r2 = this.A00;
        if (r2 != null) {
            boolean z = true;
            if (AnonymousClass3R2.A00.booleanValue()) {
                if (r2 == null) {
                    z = false;
                }
                if (str == null || !z) {
                    return str;
                }
                return "[Sanitized for ePD Compliance]";
            }
        }
        return str;
    }

    public AnonymousClass3UY(UserSession userSession) {
        AnonymousClass0TJ r4 = AnonymousClass0TJ.A05;
        if (C63803iN.A0E(r4, userSession, 2342158211831892438L)) {
            AnonymousClass3R2 r3 = new AnonymousClass3R2();
            this.A00 = r3;
            if (C63803iN.A0E(r4, userSession, 2342158211831892438L)) {
                C67473zc A002 = C67473zc.A00(C67463zb.A00(), AnonymousClass16P.class, "IGUserConsentQuery");
                C31082GfJ gfJ = new C31082GfJ((C10300i6) userSession);
                gfJ.A06(A002);
                gfJ.A08 = "ads_viewer_context_policy";
                C32165H8c A05 = gfJ.A05(AnonymousClass006.A01);
                C63873iU.A0F(A05, r3, userSession, 24);
                C31155GhB.A03(A05);
            }
        }
        this.A01 = userSession;
    }
}
