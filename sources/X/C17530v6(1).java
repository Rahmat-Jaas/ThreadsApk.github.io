package X;

import android.content.SharedPreferences;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.redex.IDxComparatorShape301S0100000_I2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0v6  reason: invalid class name and case insensitive filesystem */
public final class C17530v6 {
    public List A00 = new ArrayList();
    public final C12790mU A01;
    public final TreeSet A02 = new TreeSet(new IDxComparatorShape301S0100000_I2(this, 4));

    public final synchronized C17510v2 A00(C17510v2 r4) {
        Iterator it = A01().iterator();
        while (it.hasNext()) {
            C17510v2 r1 = (C17510v2) it.next();
            if (r1.equals(r4)) {
                return r1;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a3, code lost:
        if (r4.A00().isEmpty() != false) goto L_0x00a5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.TreeSet A01() {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.TreeSet r3 = r8.A02     // Catch:{ all -> 0x00b8 }
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x00b6
            X.0mU r0 = r8.A01     // Catch:{ all -> 0x00b8 }
            java.lang.String r2 = "/settings_mqtt_address"
            android.content.SharedPreferences r1 = r0.A00     // Catch:{ all -> 0x00b8 }
            boolean r0 = r1.contains(r2)     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x00b6
            java.lang.String r0 = ""
            java.lang.String r0 = r1.getString(r2, r0)     // Catch:{ all -> 0x00b8 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00ae }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x00ae }
            java.lang.String r0 = "address_entries"
            org.json.JSONArray r6 = r1.optJSONArray(r0)     // Catch:{ JSONException -> 0x00ae }
            if (r6 == 0) goto L_0x00b6
            int r0 = r6.length()     // Catch:{ JSONException -> 0x00ae }
            if (r0 <= 0) goto L_0x00b6
            r5 = 0
        L_0x002f:
            int r0 = r6.length()     // Catch:{ JSONException -> 0x00ae }
            if (r5 >= r0) goto L_0x00b6
            java.lang.String r2 = r6.getString(r5)     // Catch:{ JSONException -> 0x00ae }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ JSONException -> 0x00ae }
            if (r0 == 0) goto L_0x0041
            r4 = 0
            goto L_0x008d
        L_0x0041:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00ae }
            r1.<init>(r2)     // Catch:{ JSONException -> 0x00ae }
            X.0v2 r4 = new X.0v2     // Catch:{ JSONException -> 0x00ae }
            r4.<init>()     // Catch:{ JSONException -> 0x00ae }
            java.lang.String r0 = "host_name"
            java.lang.String r0 = r1.optString(r0)     // Catch:{ JSONException -> 0x00ae }
            r4.A02 = r0     // Catch:{ JSONException -> 0x00ae }
            java.lang.String r0 = "priority"
            int r0 = r1.optInt(r0)     // Catch:{ JSONException -> 0x00ae }
            r4.A01 = r0     // Catch:{ JSONException -> 0x00ae }
            java.lang.String r0 = "fail_count"
            int r0 = r1.optInt(r0)     // Catch:{ JSONException -> 0x00ae }
            r4.A00 = r0     // Catch:{ JSONException -> 0x00ae }
            java.lang.String r0 = "address_list_data"
            org.json.JSONArray r7 = r1.optJSONArray(r0)     // Catch:{ JSONException -> 0x00ae }
            if (r7 == 0) goto L_0x008d
            int r0 = r7.length()     // Catch:{ JSONException -> 0x00ae }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ JSONException -> 0x00ae }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x00ae }
            r1 = 0
        L_0x0075:
            int r0 = r7.length()     // Catch:{ JSONException -> 0x00ae }
            if (r1 >= r0) goto L_0x008b
            boolean r0 = r7.isNull(r1)     // Catch:{ JSONException -> 0x00ae }
            if (r0 != 0) goto L_0x0088
            java.lang.String r0 = r7.getString(r1)     // Catch:{ JSONException -> 0x00ae }
            r2.add(r0)     // Catch:{ JSONException -> 0x00ae }
        L_0x0088:
            int r1 = r1 + 1
            goto L_0x0075
        L_0x008b:
            r4.A04 = r2     // Catch:{ JSONException -> 0x00ae }
        L_0x008d:
            r4.getClass()     // Catch:{ JSONException -> 0x00ae }
            java.util.List r0 = r4.A04     // Catch:{ JSONException -> 0x00ae }
            if (r0 == 0) goto L_0x00a5
            boolean r0 = r0.isEmpty()     // Catch:{ JSONException -> 0x00ae }
            if (r0 != 0) goto L_0x00a5
            java.util.List r0 = r4.A00()     // Catch:{ JSONException -> 0x00ae }
            boolean r1 = r0.isEmpty()     // Catch:{ JSONException -> 0x00ae }
            r0 = 1
            if (r1 == 0) goto L_0x00a6
        L_0x00a5:
            r0 = 0
        L_0x00a6:
            if (r0 == 0) goto L_0x00ab
            r8.A03(r4)     // Catch:{ JSONException -> 0x00ae }
        L_0x00ab:
            int r5 = r5 + 1
            goto L_0x002f
        L_0x00ae:
            r2 = move-exception
            java.lang.String r1 = "AddressEntries"
            java.lang.String r0 = "Cannot create JSONObject from rawJson"
            X.AnonymousClass0LU.A0F(r1, r0, r2)     // Catch:{ all -> 0x00b8 }
        L_0x00b6:
            monitor-exit(r8)
            return r3
        L_0x00b8:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17530v6.A01():java.util.TreeSet");
    }

    public final synchronized void A02() {
        synchronized (this) {
            List<C17510v2> list = this.A00;
            list.clear();
            Iterator it = A01().iterator();
            while (it.hasNext()) {
                list.add((C17510v2) it.next());
            }
            try {
                SharedPreferences.Editor edit = this.A01.A00.edit();
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                for (C17510v2 r8 : list) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt(TraceFieldType.HostName, r8.A02);
                    jSONObject2.put("priority", r8.A01);
                    jSONObject2.put("fail_count", r8.A00);
                    if (r8.A04 != null) {
                        JSONArray jSONArray2 = new JSONArray();
                        for (Object put : r8.A04) {
                            jSONArray2.put(put);
                        }
                        jSONObject2.put("address_list_data", jSONArray2);
                    }
                    jSONArray.put(jSONObject2.toString());
                }
                jSONObject.put("address_entries", jSONArray);
                edit.putString("/settings_mqtt_address", jSONObject.toString());
                edit.apply();
            } catch (JSONException e) {
                AnonymousClass0LU.A0F("AddressEntries", "Failed to save addressEntries", e);
            }
        }
        return;
    }

    public final synchronized void A03(C17510v2 r4) {
        TreeSet treeSet = this.A02;
        if (treeSet.size() >= 10) {
            treeSet.pollLast();
        }
        treeSet.add(r4);
    }

    public final synchronized void A04(C17510v2 r2, C17510v2 r3) {
        this.A02.remove(r2);
        A03(r3);
    }

    public C17530v6(C12790mU r3) {
        this.A01 = r3;
    }
}
