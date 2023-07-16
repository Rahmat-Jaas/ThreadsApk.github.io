package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* renamed from: X.0tR  reason: invalid class name and case insensitive filesystem */
public final class C16620tR {
    public final C12800mV A00;
    public final C12830mZ A01;

    public static C16630tS A00(C12790mU r2, String str) {
        String str2;
        try {
            str2 = r2.A00.getString(str, "");
        } catch (Exception e) {
            AnonymousClass0LU.A0F("RegistrationState", "get reg state string failed", e);
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            return C16630tS.A00(str2);
        } catch (JSONException e2) {
            AnonymousClass0LU.A0F("RegistrationState", "Parse failed", e2);
            return null;
        }
    }

    public final List A03() {
        Map<String, ?> all;
        C12790mU A002 = this.A00.A00(AnonymousClass006.A1C);
        synchronized (A002) {
            all = A002.A00.getAll();
        }
        LinkedList linkedList = new LinkedList();
        for (Map.Entry next : all.entrySet()) {
            try {
                next.getKey();
                next.getValue();
                C16630tS A003 = C16630tS.A00(next.getValue().toString());
                if (!A003.A04) {
                    linkedList.add(A003);
                }
            } catch (JSONException e) {
                AnonymousClass0LU.A0F("RegistrationState", "Parse failed", e);
            }
        }
        return linkedList;
    }

    public final void A04() {
        Map<String, ?> all;
        C12790mU A002 = this.A00.A00(AnonymousClass006.A1C);
        SharedPreferences sharedPreferences = A002.A00;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        synchronized (A002) {
            all = sharedPreferences.getAll();
        }
        for (String next : all.keySet()) {
            C16630tS A003 = A00(A002, next);
            if (A003 == null) {
                AnonymousClass0LU.A0N("RegistrationState", "invalid value for %s", next);
            } else {
                A003.A03 = "";
                A003.A00 = Long.valueOf(System.currentTimeMillis());
                try {
                    edit.putString(next, A003.A01());
                } catch (JSONException e) {
                    AnonymousClass0LU.A0F("RegistrationState", "RegistrationCacheEntry serialization failed", e);
                }
            }
        }
        edit.apply();
    }

    public C16620tR(C12800mV r5, C12830mZ r6, AnonymousClass0PL r7) {
        this.A01 = r6;
        this.A00 = r5;
        SharedPreferences sharedPreferences = r5.A00(AnonymousClass006.A0N).A00;
        String string = sharedPreferences.getString("mqtt_version", "");
        String str = r7.A00;
        if (!string.equals(str)) {
            A04();
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("mqtt_version", str);
            edit.apply();
        }
    }

    public static boolean A01(C12790mU r0, C16630tS r1, String str) {
        try {
            String A012 = r1.A01();
            SharedPreferences.Editor edit = r0.A00.edit();
            edit.putString(str, A012);
            edit.apply();
            return true;
        } catch (JSONException e) {
            AnonymousClass0LU.A0F("RegistrationState", "RegistrationCacheEntry serialization failed", e);
            return false;
        }
    }

    public final String A02(String str) {
        AnonymousClass0g1.A00(!TextUtils.isEmpty(str));
        C16630tS A002 = A00(this.A00.A00(AnonymousClass006.A1C), str);
        if (A002 == null || A002.A04) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long longValue = A002.A00.longValue();
        if (longValue + 86400000 < currentTimeMillis || longValue > currentTimeMillis) {
            return null;
        }
        return A002.A03;
    }
}
