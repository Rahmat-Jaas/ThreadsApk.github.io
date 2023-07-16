package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.model.sharelater.ShareLaterMedia;
import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.service.session.UserSession;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.4FD  reason: invalid class name */
public final class AnonymousClass4FD implements C21425Bu8 {
    public BKU A00;
    public String A01 = "";
    public String A02 = "";
    public final UserSession A03;
    public final AtomicReference A04 = new AtomicReference("");

    public final void BzK(PendingMedia pendingMedia) {
        String str;
        C04220Ms.A0B(pendingMedia, 0);
        BKU bku = pendingMedia.A10;
        if (bku != null) {
            String str2 = pendingMedia.A2Y;
            synchronized (this) {
                UserSession userSession = this.A03;
                C61653Us A002 = C17323A5r.A00(userSession);
                if (str2 != null && A002.A04.get()) {
                    A002.A00(AnonymousClass2AD.A0L);
                    if (C04220Ms.A0I(this.A01, str2)) {
                        AtomicReference atomicReference = this.A04;
                        C18190wL.A1S(userSession, 0, "");
                        AnonymousClass266 A0g = AnonymousClass0wJ.A0Y(userSession).A0g();
                        USLEBaseShape0S0000000 A0B = USLEBaseShape0S0000000.A0B(C13330nS.A02(userSession));
                        A0B.A0T("flow_name", "ig_feed_crossposting_to_fb");
                        C18230wP.A1G(A0B, "click_then_upload_success");
                        C18210wN.A1B(A0B, "after_share_upsell");
                        A0B.A0T(C63383hO.A01(40, 10, 59), (String) atomicReference.get());
                        if (A0g != null) {
                            str = String.valueOf(A0g.A00);
                        } else {
                            str = null;
                        }
                        A0B.A0T("ig_user_account_type", str);
                        C18250wR.A0y(A0B, "");
                        A0B.Bb4();
                        Object obj = atomicReference.get();
                        C04220Ms.A06(obj);
                        String str3 = (String) obj;
                        bku.A3g(AnonymousClass24M.SHARING);
                        ShareLaterMedia shareLaterMedia = new ShareLaterMedia(bku);
                        shareLaterMedia.A07 = true;
                        C63353hL.A04(ShareType.FOLLOWERS_SHARE, userSession, "after_share_upsell", str3, "");
                        C32165H8c A003 = C36952Th.A00(shareLaterMedia, userSession, "", "feed_upsell_after_feed_posted");
                        A003.A00 = new AnonymousClass1hP(this, bku, str3);
                        C31155GhB.A03(A003);
                    } else {
                        this.A01 = str2;
                        this.A00 = bku;
                    }
                }
            }
        }
    }

    public AnonymousClass4FD(UserSession userSession) {
        this.A03 = userSession;
    }
}
