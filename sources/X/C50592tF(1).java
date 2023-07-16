package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.2tF  reason: invalid class name and case insensitive filesystem */
public final class C50592tF {
    public static final boolean A00(UserSession userSession, boolean z, boolean z2) {
        C04220Ms.A0B(userSession, 0);
        if (!C28161tl.A04(userSession).getBoolean("auto_save_reel_media_to_gallery", false) || !z || z2) {
            return false;
        }
        return true;
    }
}
