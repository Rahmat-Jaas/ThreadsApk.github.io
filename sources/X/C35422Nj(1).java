package X;

import android.content.SharedPreferences;
import com.instagram.service.session.UserSession;

/* renamed from: X.2Nj  reason: invalid class name and case insensitive filesystem */
public final class C35422Nj {
    public static final boolean A00(UserSession userSession) {
        Boolean BWL = AnonymousClass0wJ.A0Y(userSession).A05.BWL();
        if (BWL != null && BWL.booleanValue()) {
            return true;
        }
        SharedPreferences A04 = C28161tl.A04(userSession);
        if (A04.contains("hidden_word_spam_scam_consent_accepted")) {
            return A04.getBoolean("hidden_word_spam_scam_consent_accepted", false);
        }
        return false;
    }
}
