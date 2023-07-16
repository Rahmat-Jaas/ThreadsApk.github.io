package X;

import android.content.SharedPreferences;
import com.instagram.service.session.UserSession;

/* renamed from: X.4CR  reason: invalid class name */
public final class AnonymousClass4CR implements C21754Bzf {
    public boolean A00 = false;
    public final C28161tl A01;
    public final UserSession A02;

    public final boolean Cu6() {
        return false;
    }

    public final boolean Cu7() {
        return false;
    }

    public final void CPR() {
        SharedPreferences sharedPreferences = this.A01.A00;
        AnonymousClass0wJ.A11(sharedPreferences.edit(), "topics_nux_count", C18190wL.A04(sharedPreferences, "topics_nux_count") + 1);
        AnonymousClass0wJ.A12(sharedPreferences.edit(), "topics_nux_seen_timestamp", System.currentTimeMillis());
        this.A00 = true;
    }

    public final boolean Ct8() {
        if (this.A00) {
            return false;
        }
        SharedPreferences sharedPreferences = this.A01.A00;
        int A04 = C18190wL.A04(sharedPreferences, "topics_nux_count");
        long currentTimeMillis = System.currentTimeMillis() - C18180wK.A05(sharedPreferences, "topics_nux_seen_timestamp");
        if (A04 >= 3) {
            return false;
        }
        if (A04 == 0 || currentTimeMillis > C18210wN.A06()) {
            return true;
        }
        return false;
    }

    public AnonymousClass4CR(UserSession userSession) {
        this.A02 = userSession;
        this.A01 = AnonymousClass3WS.A01(userSession);
    }
}
