package X;

import android.content.SharedPreferences;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.service.session.UserSession;

/* renamed from: X.5Eo  reason: invalid class name */
public final class AnonymousClass5Eo extends C31512Gqj {
    public final UserSession A00;
    public final String A01;

    public AnonymousClass5Eo(UserSession userSession, String str) {
        C04220Ms.A0B(str, 2);
        this.A00 = userSession;
        this.A01 = str;
    }

    public final String A01(String str) {
        C04220Ms.A0B(str, 0);
        if (this.A00 == null) {
            return null;
        }
        SharedPreferences A002 = A00(this);
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s_%s", this.A01, str);
        C04220Ms.A06(formatStrLocaleSafe);
        return A002.getString(formatStrLocaleSafe, (String) null);
    }

    public final boolean A02(String str) {
        C04220Ms.A0B(str, 0);
        if (this.A00 == null) {
            return false;
        }
        SharedPreferences.Editor edit = A00(this).edit();
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s_%s", this.A01, str);
        C04220Ms.A06(formatStrLocaleSafe);
        C18180wK.A0u(edit, formatStrLocaleSafe);
        return true;
    }

    public final boolean A03(String str, String str2) {
        boolean A1Z = AnonymousClass0wJ.A1Z(str, str2);
        if (this.A00 == null) {
            return false;
        }
        SharedPreferences.Editor edit = A00(this).edit();
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s_%s", this.A01, str);
        C04220Ms.A06(formatStrLocaleSafe);
        C18180wK.A0v(edit, formatStrLocaleSafe, str2);
        return A1Z;
    }

    public static final SharedPreferences A00(AnonymousClass5Eo r1) {
        UserSession userSession = r1.A00;
        if (userSession != null) {
            return AnonymousClass3Zs.A03(userSession).A01(D2R.CAMERA_EFFECT_PERSISTENCE);
        }
        throw AnonymousClass0wJ.A0b();
    }
}
