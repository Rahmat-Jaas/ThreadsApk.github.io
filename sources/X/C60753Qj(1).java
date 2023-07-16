package X;

import android.content.SharedPreferences;
import java.io.IOException;

/* renamed from: X.3Qj  reason: invalid class name and case insensitive filesystem */
public final class C60753Qj {
    public static long A00 = -1;

    public static AnonymousClass1eG A00() {
        String A0W;
        SharedPreferences A01 = C08340dC.A01("com.bloks.www.fx.company-identity-switcher.v1");
        boolean z = true;
        if (C18240wQ.A09(C18180wK.A05(A01, "switcher_app_cache_last_data_saved_time")) > 2592000000L || ((A0W = C18250wR.A0W(A01, "switcher_app_cache_key")) != null && !A0W.equals(A01()))) {
            C18180wK.A0u(C18220wO.A0C("com.bloks.www.fx.company-identity-switcher.v1").remove("switcher_app_cache_data").remove("switcher_app_cache_last_data_saved_time"), "switcher_app_cache_key");
        } else {
            z = false;
        }
        if (z || !C63793iM.A07()) {
            A00 = -1;
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String string = C08340dC.A01("com.bloks.www.fx.company-identity-switcher.v1").getString("switcher_app_cache_data", (String) null);
        if (string != null && !string.isEmpty()) {
            try {
                AnonymousClass1eG parseFromJson = C59443Kv.parseFromJson(C18180wK.A0L(string));
                A00 = C18240wQ.A09(currentTimeMillis);
                return parseFromJson;
            } catch (IOException e) {
                A00 = -1;
                C14090on A002 = C10770iu.A00();
                String message = e.getMessage();
                message.getClass();
                C18250wR.A13(A002, message, 245701013);
            }
        }
        return null;
    }

    public static String A01() {
        int intValue = C63173fJ.A02(AnonymousClass0TJ.A05, 18588146012589992L).intValue();
        String A002 = AnonymousClass3QU.A00();
        String language = C31103Gfm.A02().getLanguage();
        StringBuilder A0s = C18190wL.A0s("switcher_");
        A0s.append(A002);
        A0s.append("_");
        C18230wP.A1S(language, "_", "5f56efad68e1edec7801f630b5c122704ec5378adbee6609a448f105f34a9c73", A0s);
        A0s.append("_");
        A0s.append(intValue);
        return A0s.toString();
    }
}
