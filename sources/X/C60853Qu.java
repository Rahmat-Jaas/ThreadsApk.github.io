package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.service.session.UserSession;

/* renamed from: X.3Qu  reason: invalid class name and case insensitive filesystem */
public final class C60853Qu {
    public static final String A00 = AnonymousClass00U.A0L(AnonymousClass320.A03, "profile/");

    public static void A00(Context context, C11630kW r10, UserSession userSession, Long l, String str) {
        String formatStrLocaleSafe;
        String A0L;
        if (l != null) {
            if (!TextUtils.isEmpty((CharSequence) null)) {
                formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("https://m.facebook.com/profile.php?id=%s&v=info&ref=%s", l, (Object) null);
            } else {
                formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("https://m.facebook.com/profile.php?id=%s&v=info", (Object) l);
            }
            StringBuilder A0r = C18200wM.A0r();
            A0r.append(A00);
            A0r.append(l);
            if (TextUtils.isEmpty((CharSequence) null)) {
                A0L = "";
            } else {
                A0L = AnonymousClass00U.A0L("?ref=", (String) null);
            }
            C60903Qz.A00(context, r10, userSession, str, formatStrLocaleSafe, C18180wK.A0i(A0L, A0r), (String) null, (String) null, true);
        }
    }
}
