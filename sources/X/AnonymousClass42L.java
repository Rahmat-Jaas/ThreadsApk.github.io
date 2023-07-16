package X;

import android.content.Context;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.service.session.UserSession;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.42L  reason: invalid class name */
public final class AnonymousClass42L implements C33788HuV {
    public final UserSession A00;

    public final String getFilenamePrefix() {
        return "mobileconfigs";
    }

    public final String getFilenameSuffix() {
        return OptSvcAnalyticsStore.FILE_SUFFIX;
    }

    public final String getTag() {
        return "MobileConfigValueLogger";
    }

    public final String getContentInBackground(Context context) {
        Map A02;
        Map A022;
        C61823Vx r4 = C61823Vx.A01;
        if (r4 == null) {
            return "{}";
        }
        TreeMap treeMap = new TreeMap();
        treeMap.put("1:mobileconfig_test", C18210wN.A0h("0: notice: ======== visit http://fburl.com/decode_mc_ids to decode the config/param ids of this file to names ========"));
        AnonymousClass3Ie A03 = r4.A03();
        if (A03 == null) {
            A02 = new TreeMap();
        } else {
            A02 = A03.A01.A02(true);
        }
        treeMap.putAll(A02);
        AnonymousClass3Ie A04 = r4.A04(this.A00);
        if (A04 == null) {
            A022 = new TreeMap();
        } else {
            A022 = A04.A01.A02(true);
        }
        treeMap.putAll(A022);
        return A00(treeMap);
    }

    public AnonymousClass42L(UserSession userSession) {
        this.A00 = userSession;
    }

    public static String A00(Map map) {
        try {
            JSONObject A0y = C18230wP.A0y();
            Iterator A0z = AnonymousClass0wJ.A0z(map);
            while (A0z.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0z);
                JSONArray A0i = C18250wR.A0i();
                Iterator it = ((List) A0o.getValue()).iterator();
                while (it.hasNext()) {
                    C18210wN.A1R(it, A0i);
                }
                A0y.put(C18200wM.A0p(A0o), A0i);
            }
            return A0y.toString();
        } catch (JSONException e) {
            AnonymousClass0LU.A0E("MobileConfigValueLogger", "Unable to create log", e);
            return "{}";
        }
    }
}
