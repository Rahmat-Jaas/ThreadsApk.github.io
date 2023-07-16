package X;

import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.7sa  reason: invalid class name and case insensitive filesystem */
public final class C131667sa implements C82414pa {
    public final C82414pa A00;

    public static String A00(Object obj, boolean z, boolean z2) {
        if ((obj instanceof List) || (obj instanceof Map)) {
            StringWriter A0d = C18230wP.A0d();
            JsonWriter jsonWriter = new JsonWriter(A0d);
            try {
                A03(jsonWriter, obj, z, z2);
                jsonWriter.close();
                return A0d.toString();
            } catch (IOException e) {
                return AnonymousClass0wJ.A0t("Exception in serialization ", e);
            }
        } else if (obj == null) {
            return "";
        } else {
            return String.valueOf(obj);
        }
    }

    public static void A03(JsonWriter jsonWriter, Object obj, boolean z, boolean z2) {
        String valueOf;
        if (obj == null) {
            jsonWriter.nullValue();
        } else if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
        } else if (obj instanceof Boolean) {
            boolean A1X = AnonymousClass0wJ.A1X(obj);
            if (z2) {
                jsonWriter.value(C86114wI.A09(A1X ? 1 : 0));
            } else {
                jsonWriter.value(A1X);
            }
        } else {
            if (obj instanceof String) {
                valueOf = (String) obj;
            } else if (obj instanceof Map) {
                jsonWriter.beginObject();
                if (z) {
                    TreeMap treeMap = new TreeMap();
                    Iterator A0z = AnonymousClass0wJ.A0z((Map) obj);
                    while (A0z.hasNext()) {
                        Map.Entry A0o = C18180wK.A0o(A0z);
                        C86144wL.A1P(String.valueOf(A0o.getKey()), treeMap, A0o);
                    }
                    Iterator A0u = C18190wL.A0u(treeMap);
                    while (A0u.hasNext()) {
                        Map.Entry A0o2 = C18180wK.A0o(A0u);
                        jsonWriter.name(C18200wM.A0p(A0o2));
                        A03(jsonWriter, A0o2.getValue(), z, z2);
                    }
                } else {
                    Iterator A0z2 = AnonymousClass0wJ.A0z((Map) obj);
                    while (A0z2.hasNext()) {
                        Map.Entry A0o3 = C18180wK.A0o(A0z2);
                        jsonWriter.name(String.valueOf(A0o3.getKey()));
                        A03(jsonWriter, A0o3.getValue(), z, z2);
                    }
                }
                jsonWriter.endObject();
                return;
            } else if (obj instanceof List) {
                jsonWriter.beginArray();
                Iterator A0y = C86144wL.A0y(obj);
                while (A0y.hasNext()) {
                    A03(jsonWriter, A0y.next(), z, z2);
                }
                jsonWriter.endArray();
                return;
            } else {
                valueOf = String.valueOf(obj);
            }
            jsonWriter.value(valueOf);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a6, code lost:
        r0 = X.AnonymousClass3WF.A00((double) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0103, code lost:
        X.C41228M0s.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0106, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object AKb(X.C63893iY r7, X.C105926eD r8, X.C110486ll r9) {
        /*
            r6 = this;
            java.lang.String r1 = r8.A00     // Catch:{ all -> 0x0107 }
            X.C41228M0s.A01(r1)     // Catch:{ all -> 0x0107 }
            int r0 = r1.hashCode()     // Catch:{ all -> 0x0107 }
            r2 = 1
            r3 = 0
            r5 = -1
            switch(r0) {
                case -863899808: goto L_0x001c;
                case -826958968: goto L_0x0026;
                case -791813135: goto L_0x0030;
                case -791813134: goto L_0x003a;
                case -362131820: goto L_0x0044;
                case -138615772: goto L_0x004e;
                case -138615771: goto L_0x0058;
                case 1225820697: goto L_0x0062;
                case 1509306073: goto L_0x006c;
                default: goto L_0x000f;
            }     // Catch:{ all -> 0x0107 }
        L_0x000f:
            java.lang.String r4 = "Trying to decode malformed json"
            switch(r5) {
                case 0: goto L_0x00ac;
                case 1: goto L_0x00d5;
                case 2: goto L_0x0077;
                case 3: goto L_0x0083;
                case 4: goto L_0x008f;
                case 5: goto L_0x00de;
                case 6: goto L_0x00f1;
                case 7: goto L_0x009b;
                case 8: goto L_0x00c0;
                default: goto L_0x0014;
            }     // Catch:{ all -> 0x0107 }
        L_0x0014:
            X.4pa r0 = r6.A00     // Catch:{ all -> 0x0107 }
            java.lang.Object r0 = r0.AKb(r7, r8, r9)     // Catch:{ all -> 0x0107 }
            goto L_0x0103
        L_0x001c:
            java.lang.String r0 = "bk.action.string.JsonDecode"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x000f
            r5 = 0
            goto L_0x000f
        L_0x0026:
            java.lang.String r0 = "bk.action.string.JsonEncode"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x000f
            r5 = 1
            goto L_0x000f
        L_0x0030:
            java.lang.String r0 = "bk.action.textspan.GetCenterX"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x000f
            r5 = 2
            goto L_0x000f
        L_0x003a:
            java.lang.String r0 = "bk.action.textspan.GetCenterY"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x000f
            r5 = 3
            goto L_0x000f
        L_0x0044:
            java.lang.String r0 = "bk.action.textspan.GetWidth"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x000f
            r5 = 4
            goto L_0x000f
        L_0x004e:
            java.lang.String r0 = "bk.action.string.JsonEncodeV2"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x000f
            r5 = 5
            goto L_0x000f
        L_0x0058:
            java.lang.String r0 = "bk.action.string.JsonEncodeV3"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x000f
            r5 = 6
            goto L_0x000f
        L_0x0062:
            java.lang.String r0 = "bk.action.textspan.GetHeight"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x000f
            r5 = 7
            goto L_0x000f
        L_0x006c:
            java.lang.String r0 = "bk.action.string.JsonDecodeArray"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x000f
            r5 = 8
            goto L_0x000f
        L_0x0077:
            java.lang.Object r0 = X.C63893iY.A0B(r7, r3)     // Catch:{ all -> 0x0107 }
            r0.getClass()     // Catch:{ all -> 0x0107 }
            X.6ky r0 = (X.C110006ky) r0     // Catch:{ all -> 0x0107 }
            float r0 = r0.A00     // Catch:{ all -> 0x0107 }
            goto L_0x00a6
        L_0x0083:
            java.lang.Object r0 = X.C63893iY.A0B(r7, r3)     // Catch:{ all -> 0x0107 }
            r0.getClass()     // Catch:{ all -> 0x0107 }
            X.6ky r0 = (X.C110006ky) r0     // Catch:{ all -> 0x0107 }
            float r0 = r0.A01     // Catch:{ all -> 0x0107 }
            goto L_0x00a6
        L_0x008f:
            java.lang.Object r0 = X.C63893iY.A0B(r7, r3)     // Catch:{ all -> 0x0107 }
            r0.getClass()     // Catch:{ all -> 0x0107 }
            X.6ky r0 = (X.C110006ky) r0     // Catch:{ all -> 0x0107 }
            float r0 = r0.A03     // Catch:{ all -> 0x0107 }
            goto L_0x00a6
        L_0x009b:
            java.lang.Object r0 = X.C63893iY.A0B(r7, r3)     // Catch:{ all -> 0x0107 }
            r0.getClass()     // Catch:{ all -> 0x0107 }
            X.6ky r0 = (X.C110006ky) r0     // Catch:{ all -> 0x0107 }
            float r0 = r0.A02     // Catch:{ all -> 0x0107 }
        L_0x00a6:
            double r0 = (double) r0     // Catch:{ all -> 0x0107 }
            java.lang.Number r0 = X.AnonymousClass3WF.A00(r0)     // Catch:{ all -> 0x0107 }
            goto L_0x0103
        L_0x00ac:
            java.lang.String r0 = X.C86154wM.A0l(r7, r3)     // Catch:{ JSONException -> 0x00b9 }
            org.json.JSONObject r0 = X.C18250wR.A0j(r0)     // Catch:{ JSONException -> 0x00b9 }
            java.util.HashMap r0 = A02(r0)     // Catch:{ JSONException -> 0x00b9 }
            goto L_0x0103
        L_0x00b9:
            r1 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0107 }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x0107 }
            goto L_0x00d4
        L_0x00c0:
            java.lang.String r1 = X.C86154wM.A0l(r7, r3)     // Catch:{ JSONException -> 0x00ce }
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00ce }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x00ce }
            java.util.ArrayList r0 = A01(r0)     // Catch:{ JSONException -> 0x00ce }
            goto L_0x0103
        L_0x00ce:
            r1 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0107 }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x0107 }
        L_0x00d4:
            throw r0     // Catch:{ all -> 0x0107 }
        L_0x00d5:
            java.lang.Object r0 = X.C63893iY.A0B(r7, r3)     // Catch:{ all -> 0x0107 }
            java.lang.String r0 = A00(r0, r3, r2)     // Catch:{ all -> 0x0107 }
            goto L_0x0103
        L_0x00de:
            java.util.List r0 = r7.A00     // Catch:{ all -> 0x0107 }
            java.lang.Object r1 = r0.get(r3)     // Catch:{ all -> 0x0107 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0107 }
            boolean r0 = X.AnonymousClass3WF.A02(r0)     // Catch:{ all -> 0x0107 }
            java.lang.String r0 = A00(r1, r0, r2)     // Catch:{ all -> 0x0107 }
            goto L_0x0103
        L_0x00f1:
            java.util.List r0 = r7.A00     // Catch:{ all -> 0x0107 }
            java.lang.Object r1 = r0.get(r3)     // Catch:{ all -> 0x0107 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0107 }
            boolean r0 = X.AnonymousClass3WF.A02(r0)     // Catch:{ all -> 0x0107 }
            java.lang.String r0 = A00(r1, r0, r3)     // Catch:{ all -> 0x0107 }
        L_0x0103:
            X.C41228M0s.A00()
            return r0
        L_0x0107:
            r0 = move-exception
            X.C41228M0s.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C131667sa.AKb(X.3iY, X.6eD, X.6ll):java.lang.Object");
    }

    public C131667sa(C82414pa r1) {
        this.A00 = r1;
    }

    public static ArrayList A01(JSONArray jSONArray) {
        int length = jSONArray.length();
        ArrayList A0k = C18240wQ.A0k(length);
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (!(obj instanceof String)) {
                if (obj instanceof JSONObject) {
                    obj = A02((JSONObject) obj);
                } else if (obj instanceof JSONArray) {
                    obj = A01((JSONArray) obj);
                } else if (!(obj instanceof Integer)) {
                    if (obj instanceof Double) {
                        obj = AnonymousClass3WF.A00(C86124wJ.A00(obj));
                    } else if (obj instanceof Float) {
                        obj = AnonymousClass3WF.A00((double) C18240wQ.A00(obj));
                    } else {
                        if (obj instanceof Boolean) {
                            A0k.add(obj);
                        } else if (!(obj instanceof Long)) {
                        }
                    }
                }
            }
            A0k.add(obj);
        }
        return A0k;
    }

    public static HashMap A02(JSONObject jSONObject) {
        HashMap A0y = AnonymousClass0wJ.A0y();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String A0k = C18180wK.A0k(keys);
            Object obj = jSONObject.get(A0k);
            if (!(obj instanceof String)) {
                if (obj instanceof JSONObject) {
                    obj = A02((JSONObject) obj);
                } else if (obj instanceof JSONArray) {
                    obj = A01((JSONArray) obj);
                } else if (!(obj instanceof Integer)) {
                    if (obj instanceof Double) {
                        obj = AnonymousClass3WF.A00(C86124wJ.A00(obj));
                    } else if (obj instanceof Float) {
                        obj = AnonymousClass3WF.A00((double) C18240wQ.A00(obj));
                    } else if (obj instanceof Boolean) {
                        A0y.put(A0k, obj);
                    } else if (!(obj instanceof Long)) {
                    }
                }
            }
            A0y.put(A0k, obj);
        }
        return A0y;
    }
}
