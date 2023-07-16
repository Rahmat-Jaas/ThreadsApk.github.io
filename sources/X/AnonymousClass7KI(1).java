package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.redex.IDxComparatorShape95S0000000_2_I2;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7KI  reason: invalid class name */
public final class AnonymousClass7KI {
    public static String A01(Set set) {
        TreeSet treeSet;
        if (set != null) {
            treeSet = new TreeSet(set);
        }
        treeSet.remove("id");
        return TextUtils.join(", ", treeSet);
    }

    public static String A02(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = new JSONArray(jSONObject.getString("autofillFields"));
            ArrayList A0v = AnonymousClass0wJ.A0v();
            for (int i = 0; i < jSONArray.length(); i = C86154wM.A07(A0v, jSONArray, i)) {
            }
            Collections.sort(A0v);
            return TextUtils.join(", ", A0v);
        } catch (JSONException e) {
            C37252JnL.A00("AutofillSharedUtil", "Failed to parseRequestedFields", e, e);
            return null;
        }
    }

    public static Set A04(List list) {
        if (list == null || list.isEmpty() || list.get(0) == null) {
            return C18200wM.A0u();
        }
        return C86164wN.A0l((AutofillData) list.get(0)).keySet();
    }

    public static AutofillData A00(JSONObject jSONObject) {
        HashMap A0y = AnonymousClass0wJ.A0y();
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("raw_autofill_data");
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String A0k = C18180wK.A0k(keys);
                A0y.put(A0k, jSONObject2.getJSONArray(A0k).getString(0));
            }
        } catch (JSONException e) {
            Log.e("AutofillSharedUtil", "Save autofill JSON wrongly formatted", e);
        }
        return new AutofillData((Map) A0y);
    }

    public static List A03(List list) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    A0v.add(new AutofillData(C18250wR.A0j(C18180wK.A0k(it))));
                } catch (JSONException e) {
                    Log.e("AutofillSharedUtil", "Wrong JSON format for autofill", e);
                }
            }
        }
        Collections.sort(A0v, new IDxComparatorShape95S0000000_2_I2(3));
        return A0v;
    }

    public static Set A05(Map map, Map map2) {
        HashSet A0u = C18200wM.A0u();
        Iterator A0z = AnonymousClass0wJ.A0z(map);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            Object key = A0o.getKey();
            String A0u2 = C18230wP.A0u(A0o);
            if (A0u2 != null) {
                String trim = A0u2.trim();
                if (trim.length() != 0 && (map2.get(key) == null || !C18220wO.A0r(key, map2).trim().equals(trim))) {
                    A0u.add(key);
                }
            }
        }
        return A0u;
    }

    public static Set A06(Map map, Map map2) {
        HashSet A0u = C18200wM.A0u();
        Iterator A0z = AnonymousClass0wJ.A0z(map2);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            Object key = A0o.getKey();
            String A0u2 = C18230wP.A0u(A0o);
            if (!(A0u2 == null || A0u2.trim().length() == 0 || TextUtils.isEmpty((CharSequence) map.get(key)))) {
                A0u.add(key);
            }
        }
        return A0u;
    }

    public static JSONObject A07(AutofillData autofillData) {
        JSONObject A0y = C18230wP.A0y();
        Iterator A0z = AnonymousClass0wJ.A0z(C86164wN.A0l(autofillData));
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            JSONArray A0i = C18250wR.A0i();
            A0i.put(A0o.getValue());
            try {
                A0y.put(C18200wM.A0p(A0o), A0i);
            } catch (JSONException unused) {
            }
        }
        JSONObject A0y2 = C18230wP.A0y();
        try {
            A0y2.put("raw_autofill_data", A0y);
            A0y2.put("callbackID", "placeholder");
        } catch (JSONException unused2) {
        }
        return A0y2;
    }

    public static void A08(C111316n8 r8) {
        AnonymousClass7Ep A00 = AnonymousClass7Ep.A00();
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("action", I17.A00(363));
        A0y.put("user_action", r8.A0G);
        A0y.put(C18170wI.A00(1127), r8.A09);
        String str = r8.A0E;
        if (str != null) {
            A0y.put(I17.A00(854), str);
        }
        String str2 = r8.A0D;
        if (str2 != null) {
            A0y.put("requested_fields", str2);
        }
        String str3 = r8.A04;
        if (str3 != null) {
            A0y.put("all_fields", str3);
        }
        String str4 = r8.A05;
        if (str4 != null) {
            A0y.put(I17.A00(HttpStatus.SC_HTTP_VERSION_NOT_SUPPORTED), str4);
        }
        String str5 = r8.A0A;
        if (str5 != null) {
            A0y.put("new_fields", str5);
        }
        String str6 = r8.A06;
        if (str6 != null) {
            A0y.put("current_url", str6);
        }
        String str7 = r8.A0B;
        if (str7 != null) {
            A0y.put("origin_host", str7);
        }
        String str8 = r8.A08;
        if (str8 != null) {
            A0y.put(I17.A00(649), str8);
        }
        String str9 = r8.A07;
        if (str9 != null) {
            A0y.put("edited_fields", str9);
        }
        String str10 = r8.A0F;
        if (str10 != null) {
            A0y.put("type", str10);
        }
        String str11 = r8.A0C;
        if (str11 != null) {
            A0y.put(I17.A00(799), str11);
        }
        A0y.put(I17.A00(913), String.valueOf(r8.A0L));
        long j = r8.A02;
        if (j != 0) {
            A0y.put(I17.A00(648), String.valueOf(j));
        }
        int i = r8.A00;
        if (i != 0) {
            A0y.put("event_times", String.valueOf(i));
        }
        int i2 = r8.A01;
        if (i2 != 0) {
            A0y.put("time_spend", String.valueOf(i2));
        }
        long j2 = r8.A03;
        if (j2 > 0) {
            A0y.put("index", String.valueOf(j2));
        }
        Map map = r8.A0I;
        if (map != null) {
            A0y.put(I17.A00(622), new Gson().A09(map, new AnonymousClass5sS(r8).type));
        }
        String str12 = r8.A0H;
        if (str12 != null) {
            A0y.put(I17.A00(899), str12);
        }
        A0y.put(I17.A00(730), String.valueOf(r8.A0K));
        A0y.put(I17.A00(722), String.valueOf(r8.A0J));
        A00.A04(A0y, Bundle.EMPTY);
    }

    public static boolean A09(AutofillData autofillData, AutofillData autofillData2) {
        HashMap A0j = C86164wN.A0j(C86164wN.A0l(autofillData));
        HashMap A0j2 = C86164wN.A0j(C86164wN.A0l(autofillData2));
        A0j.remove("id");
        A0j2.remove("id");
        A0j.remove("last_used_time");
        A0j2.remove("last_used_time");
        if (A0j2.size() <= A0j.size()) {
            Iterator A0r = C86154wM.A0r(A0j2);
            while (A0r.hasNext()) {
                if (!A0j.containsKey(A0r.next())) {
                }
            }
            return true;
        }
        return false;
    }
}
