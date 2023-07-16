package X;

import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape61S0100000_I2_41;

/* renamed from: X.3Zh  reason: invalid class name */
public final class AnonymousClass3Zh {
    public static final AnonymousClass2AG A00(int i) {
        if (i == 1) {
            return AnonymousClass2AG.BROADCAST;
        }
        if (i != 2) {
            return AnonymousClass2AG.INSTAGRAM;
        }
        return AnonymousClass2AG.SUBSCRIBER_BROADCAST;
    }

    public static final AnonymousClass49Y A01(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        return (AnonymousClass49Y) userSession.A01(AnonymousClass49Y.class, new KtLambdaShape61S0100000_I2_41(userSession, 2));
    }

    public static void A02(C021109v r1, AnonymousClass0A3 r2, int i) {
        r2.A0O(r1, "surface");
        r2.A0O(A00(i), "parent_surface");
    }

    public static void A03(C021109v r1, AnonymousClass0A3 r2, C307522u r3, String str, int i) {
        AnonymousClass2AA r12;
        r2.A0O(r1, "source");
        if (r3 == C307522u.CHAT_STICKER || r3 == C307522u.MESSAGE_SHARE_STICKER || r3 == C307522u.MESSAGE_SHARE_STICKER_ATTRIBUTION) {
            r12 = AnonymousClass2AA.A0E;
        } else if (r3 == C307522u.CLIPS_CHAT_STICKER) {
            r12 = AnonymousClass2AA.A0D;
        } else {
            r12 = AnonymousClass2AA.A0H;
        }
        r2.A0O(r12, "surface");
        r2.A0O(A00(i), "parent_surface");
        r2.A0T("ig_thread_id", str);
    }
}
