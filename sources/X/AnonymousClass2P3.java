package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.2P3  reason: invalid class name */
public final class AnonymousClass2P3 {
    public static final Integer A00(UserSession userSession) {
        String str;
        String A06 = C28161tl.A06(AnonymousClass3WS.A00(userSession), "gallery_suggestions_setting", "auto_created_reels");
        for (Integer num : AnonymousClass006.A00(2)) {
            if (1 - num.intValue() != 0) {
                str = "off";
            } else {
                str = "auto_created_reels";
            }
            if (C04220Ms.A0I(str, A06)) {
                return num;
            }
        }
        return AnonymousClass006.A00;
    }
}
