package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import java.util.Map;

/* renamed from: X.49J  reason: invalid class name */
public final class AnonymousClass49J implements AnonymousClass0i4 {
    public String A00;
    public final C13330nS A01;
    public final UserSession A02;

    public final void onSessionWillEnd() {
        this.A00 = null;
        this.A02.A03(AnonymousClass49J.class);
    }

    public static final void A00(AnonymousClass28X r5, C319929t r6, C320029u r7, C319829s r8, AnonymousClass49J r9, Map map) {
        if (r9.A00 != null) {
            try {
                USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r9.A01, "igd_creator_subscriber_chats_action"), 1538);
                if (AnonymousClass0wJ.A1U(A0I)) {
                    A0I.A0S("actor_id", AnonymousClass0wJ.A0d(r9.A02.getUserId()));
                    A0I.A0O(C314227o.A02, "parent_surface");
                    C18220wO.A1D(r6, A0I);
                    C18220wO.A1E(r5, A0I);
                    C18230wP.A1D(r7, A0I);
                    C18240wQ.A13(r8, A0I);
                    A0I.A0T(C61943Wl.A01(21, 10, 92), r9.A00);
                    if (map != null) {
                        A0I.A0V("extra", map);
                    }
                    A0I.Bb4();
                }
            } catch (NumberFormatException e) {
                C10450iM.A06("CreatorSubscriberChatLogger", "Failed to convert user id to long", e);
            }
        }
    }

    public AnonymousClass49J(UserSession userSession) {
        this.A02 = userSession;
        C10680ik r1 = new C10680ik(userSession);
        r1.A02 = "creator_subscriber_chat";
        this.A01 = r1.A00();
    }

    public final void A01() {
        this.A00 = C18180wK.A0e();
        C319829s r3 = C319829s.STORY;
        C319929t r1 = C319929t.PUBLISH_STORY_WITH_SUBSCRIBER_JOIN_CHAT_STICKER;
        A00(AnonymousClass28X.TAP, r1, C320029u.CREATE_BUTTON, r3, this, (Map) null);
    }
}
