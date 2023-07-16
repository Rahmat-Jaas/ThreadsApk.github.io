package X;

import com.instagram.service.session.UserSession;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.49W  reason: invalid class name */
public final class AnonymousClass49W implements AnonymousClass0i4 {
    public String A00;
    public final long A01;
    public final C13330nS A02;
    public final UserSession A03;

    public static final C319729r A00(AnonymousClass24S r0, boolean z) {
        if (!z) {
            switch (r0.ordinal()) {
                case 0:
                case 2:
                case 3:
                case 4:
                    return C319729r.DM_CREATION_OMNIPICKER;
                case 1:
                    return C319729r.PROFILE;
                case 5:
                    break;
                default:
                    throw AnonymousClass4VZ.A00();
            }
        }
        return C319729r.CREATE_CHANNEL;
    }

    public static void A03(AnonymousClass0A3 r2, AnonymousClass49W r3) {
        r2.A0S("actor_id", Long.valueOf(r3.A01));
    }

    public final void onSessionWillEnd() {
        this.A03.A03(AnonymousClass49W.class);
    }

    public AnonymousClass49W(UserSession userSession) {
        this.A03 = userSession;
        this.A01 = AnonymousClass4n2.A00(C18230wP.A0q(userSession));
        C10680ik r1 = new C10680ik(userSession);
        r1.A02 = "igd_public_chats_actions";
        this.A02 = r1.A00();
    }

    public static final C319729r A01(C307522u r1) {
        int ordinal = r1.ordinal();
        if (ordinal == 1) {
            return C319729r.STORY;
        }
        if (ordinal == 5) {
            return C319729r.INBOX_SEARCH;
        }
        if (ordinal == 6) {
            return C319729r.DIRECT_INVITE;
        }
        if (ordinal == 7) {
            return C319729r.PROFILE;
        }
        if (ordinal != 8) {
            return null;
        }
        return C319729r.GROUP_LINK_XMA;
    }

    public static Map A02(Boolean bool, Boolean bool2, Boolean bool3, String str) {
        String str2;
        String str3;
        String str4;
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("chat_type", "public");
        if (str != null) {
            A0y.put("chat_creation_source", str);
        }
        if (bool != null) {
            if (bool.booleanValue()) {
                str4 = "True";
            } else {
                str4 = "False";
            }
            A0y.put("has_thread_photo", str4);
        }
        if (bool2 != null) {
            if (bool2.booleanValue()) {
                str3 = "True";
            } else {
                str3 = "False";
            }
            A0y.put("limited_to_subscribers", str3);
        }
        if (bool3 != null) {
            if (bool3.booleanValue()) {
                str2 = "True";
            } else {
                str2 = "False";
            }
            A0y.put("show_on_profile", str2);
        }
        return A0y;
    }
}
