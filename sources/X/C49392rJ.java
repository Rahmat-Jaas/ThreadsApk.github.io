package X;

import com.instagram.service.session.UserSession;
import com.instagram.share.facebook.graphql.FetchCXPNoticesQueryResponseImpl;

/* renamed from: X.2rJ  reason: invalid class name and case insensitive filesystem */
public final class C49392rJ {
    public static final void A00(UserSession userSession, FetchCXPNoticesQueryResponseImpl.XcxpFetchNoticeUser.NoticeEligibility noticeEligibility) {
        C67603zp r0;
        AnonymousClass3Ie A04;
        String stringValue = noticeEligibility.getStringValue("logging_id");
        if (stringValue != null && stringValue.length() != 0 && C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 2342168730208838880L)) {
            C61823Vx r02 = C61823Vx.A01;
            if (r02 == null || (A04 = r02.A04(userSession)) == null) {
                r0 = null;
            } else {
                r0 = A04.A01.A00;
            }
            C67603zp A00 = AnonymousClass2CI.A00(r0);
            if (A00 != null) {
                A00.A06().logExposure(noticeEligibility.getStringValue("logging_id"), AnonymousClass0TF.MANUAL_EXPOSURE.A00);
            }
        }
    }
}
