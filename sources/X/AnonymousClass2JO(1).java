package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.common.dextricks.DexStore;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.service.session.UserSession;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2JO  reason: invalid class name */
public final class AnonymousClass2JO {
    public static void A00(Context context, UserSession userSession, String str) {
        HashMap hashMap;
        C62343Yl r3;
        String optString;
        AnonymousClass33T r0;
        AnonymousClass3BE r7;
        JSONObject jSONObject = null;
        Uri A01 = C15430rJ.A01(str);
        String queryParameter = A01.getQueryParameter("app_id");
        queryParameter.getClass();
        String queryParameter2 = A01.getQueryParameter("params");
        if (queryParameter2 == null || queryParameter2.length() == 0) {
            hashMap = AnonymousClass0wJ.A0y();
        } else {
            try {
                JSONObject A0j = C18250wR.A0j(queryParameter2);
                if ((A0j.has("server_params") || A0j.has("client_input_params")) && (!A0j.has("server_params") || (queryParameter2 = A0j.getString("server_params")) == null)) {
                    hashMap = AnonymousClass0wJ.A0y();
                } else {
                    hashMap = AnonymousClass2LR.A00(C18180wK.A0L(queryParameter2));
                    if (hashMap == null) {
                        hashMap = AnonymousClass0wJ.A0y();
                    }
                }
            } catch (IOException | JSONException unused) {
                hashMap = AnonymousClass0wJ.A0y();
            }
        }
        String queryParameter3 = A01.getQueryParameter("bloks_screen_options");
        String str2 = null;
        if (queryParameter3 != null) {
            try {
                jSONObject = C18250wR.A0j(queryParameter3);
            } catch (JSONException unused2) {
            }
        }
        String queryParameter4 = A01.getQueryParameter(DexStore.CONFIG_FILENAME);
        if (queryParameter4 != null) {
            try {
                AnonymousClass33S r02 = AnonymousClass2JU.parseFromJson(C04690Os.A02.A04(userSession, queryParameter4)).A00;
                if (!(r02 == null || (r0 = r02.A00) == null || (r7 = r0.A00) == null)) {
                    String str3 = r7.A00;
                    if (str3 != null) {
                        r3.A03(str3);
                    }
                    String str4 = r7.A01;
                    if (str4 != null) {
                        r3.A00.A0S = str4;
                    }
                    boolean z = r7.A02;
                    IgBloksScreenConfig igBloksScreenConfig = r3.A00;
                    igBloksScreenConfig.A0f = z;
                    igBloksScreenConfig.A0g = C18180wK.A1W(r7.A03 ? 1 : 0);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            r3 = new C62343Yl(userSession);
            r3.A00.A0g = false;
        }
        C63743iE A02 = C63743iE.A02(queryParameter, hashMap);
        if (jSONObject != null) {
            if (jSONObject.has("hides_tab_bar")) {
                boolean optBoolean = jSONObject.optBoolean("hides_tab_bar");
                if (Boolean.valueOf(optBoolean) != null) {
                    r3.A00.A0h = !optBoolean;
                }
            }
            if (jSONObject.has("presentation_method") && (optString = jSONObject.optString("presentation_method")) != null) {
                r3.A00.A0O = AnonymousClass2JP.A00(optString);
            }
            if (jSONObject.has("respect_safe_area_insets")) {
                boolean optBoolean2 = jSONObject.optBoolean("respect_safe_area_insets");
                if (Boolean.valueOf(optBoolean2) != null) {
                    r3.A00.A0b = !optBoolean2;
                }
            }
            if (jSONObject.has("ttrc_marker_id")) {
                int optInt = jSONObject.optInt("ttrc_marker_id");
                if (Integer.valueOf(optInt) != null) {
                    A02.A00 = optInt;
                }
            }
            if (jSONObject.has("screen_id")) {
                str2 = jSONObject.optString("screen_id");
            }
            r3.A00.A0Q = str2;
        }
        A02.A0C(context, r3.A00);
    }
}
