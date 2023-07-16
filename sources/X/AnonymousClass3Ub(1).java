package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3Ub  reason: invalid class name */
public final class AnonymousClass3Ub {
    public final Map A00;
    public final AnonymousClass3XT A01;
    public final AnonymousClass3YE[] A02;

    public static AnonymousClass3Ub A00(JSONObject jSONObject) {
        AnonymousClass3Ub r0;
        String string;
        if (jSONObject == null) {
            return null;
        }
        HashMap A0y = AnonymousClass0wJ.A0y();
        AnonymousClass3YE[] r2 = new AnonymousClass3YE[0];
        try {
            Iterator<String> keys = jSONObject.keys();
            AnonymousClass3XT r5 = null;
            while (keys.hasNext()) {
                String A0k = C18180wK.A0k(keys);
                if (!A0k.equals("selector_config")) {
                    if (A0k.equals("clip_data")) {
                        r5 = AnonymousClass3XT.A00(jSONObject.getJSONObject("clip_data"));
                    } else if (jSONObject.has(A0k)) {
                        A0y.put(A0k, C62553aH.A00(jSONObject.get(A0k)));
                    }
                }
            }
            if (jSONObject.has("selector_config") && (string = jSONObject.getString("selector_config")) != null) {
                r2 = AnonymousClass3YE.A01(string);
            }
            if (A0y.isEmpty()) {
                return null;
            }
            if (r2.length > 0) {
                return r0;
            }
            r0 = new AnonymousClass3Ub(r5, A0y, (AnonymousClass3YE[]) null);
            return r0;
        } catch (IllegalArgumentException | JSONException unused) {
            return null;
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(android.content.Intent r14, org.json.JSONObject r15) {
        /*
            r13 = this;
            java.lang.String r2 = "clip_data"
            r12 = 0
            java.util.Map r3 = r13.A00     // Catch:{  }
            java.util.Iterator r11 = X.AnonymousClass0wJ.A0z(r3)     // Catch:{  }
        L_0x0009:
            boolean r0 = r11.hasNext()     // Catch:{  }
            if (r0 == 0) goto L_0x00fd
            java.util.Map$Entry r4 = X.C18180wK.A0o(r11)     // Catch:{  }
            java.lang.String r1 = X.C18200wM.A0p(r4)     // Catch:{  }
            java.lang.String r0 = "categories"
            boolean r0 = r0.equals(r1)     // Catch:{  }
            if (r0 == 0) goto L_0x0045
            boolean r0 = r15.has(r1)     // Catch:{  }
            if (r0 == 0) goto L_0x015e
            org.json.JSONArray r5 = r15.getJSONArray(r1)     // Catch:{  }
            if (r5 == 0) goto L_0x015e
            java.lang.Object r4 = r4.getValue()     // Catch:{  }
            X.3aH r4 = (X.C62553aH) r4     // Catch:{  }
            r1 = 0
        L_0x0032:
            int r0 = r5.length()     // Catch:{  }
            if (r1 >= r0) goto L_0x015e
            java.lang.String r0 = r5.getString(r1)     // Catch:{  }
            boolean r0 = X.C62553aH.A01(r4, r0)     // Catch:{  }
            if (r0 != 0) goto L_0x0009
            int r1 = r1 + 1
            goto L_0x0032
        L_0x0045:
            java.lang.String r0 = "extra_names"
            boolean r0 = r0.equals(r1)     // Catch:{  }
            if (r0 == 0) goto L_0x00af
            boolean r0 = r15.has(r1)     // Catch:{  }
            if (r0 == 0) goto L_0x015e
            org.json.JSONArray r9 = r15.getJSONArray(r1)     // Catch:{  }
            if (r9 == 0) goto L_0x015e
            java.lang.Object r8 = r4.getValue()     // Catch:{  }
            X.3aH r8 = (X.C62553aH) r8     // Catch:{  }
            r7 = 0
            java.lang.String r1 = "extra_value_types"
            boolean r0 = r3.containsKey(r1)     // Catch:{  }
            if (r0 == 0) goto L_0x006e
            java.lang.Object r7 = r3.get(r1)     // Catch:{  }
            X.3aH r7 = (X.C62553aH) r7     // Catch:{  }
        L_0x006e:
            r6 = 0
        L_0x006f:
            int r0 = r9.length()     // Catch:{  }
            if (r6 >= r0) goto L_0x015e
            org.json.JSONObject r10 = r9.getJSONObject(r6)     // Catch:{  }
            java.lang.String r1 = "name"
            boolean r0 = r10.has(r1)     // Catch:{  }
            java.lang.String r5 = ""
            if (r0 == 0) goto L_0x00ad
            java.lang.String r4 = r10.getString(r1)     // Catch:{  }
        L_0x0087:
            java.lang.String r1 = "value_type"
            boolean r0 = r10.has(r1)     // Catch:{  }
            if (r0 == 0) goto L_0x00ab
            java.lang.String r0 = r10.getString(r1)     // Catch:{  }
        L_0x0093:
            boolean r1 = X.C62553aH.A01(r8, r4)     // Catch:{  }
            if (r7 != 0) goto L_0x009e
            boolean r0 = r0.equals(r5)     // Catch:{  }
            goto L_0x00a2
        L_0x009e:
            boolean r0 = X.C62553aH.A01(r7, r0)     // Catch:{  }
        L_0x00a2:
            if (r1 == 0) goto L_0x00a8
            if (r0 == 0) goto L_0x00a8
            goto L_0x0009
        L_0x00a8:
            int r6 = r6 + 1
            goto L_0x006f
        L_0x00ab:
            r0 = r5
            goto L_0x0093
        L_0x00ad:
            r4 = r5
            goto L_0x0087
        L_0x00af:
            java.lang.String r0 = "extra_value_types"
            boolean r0 = r0.equals(r1)     // Catch:{  }
            if (r0 != 0) goto L_0x0009
            java.lang.String r0 = "flags"
            boolean r0 = r0.equals(r1)     // Catch:{  }
            if (r0 == 0) goto L_0x00e3
            boolean r0 = r15.has(r1)     // Catch:{  }
            if (r0 == 0) goto L_0x00d2
            int r1 = r15.getInt(r1)     // Catch:{  }
        L_0x00c9:
            java.lang.Object r0 = r4.getValue()     // Catch:{  }
            X.3aH r0 = (X.C62553aH) r0     // Catch:{  }
            java.util.regex.Pattern r0 = r0.A00     // Catch:{  }
            goto L_0x00d4
        L_0x00d2:
            r1 = 0
            goto L_0x00c9
        L_0x00d4:
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x015e }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ JSONException -> 0x015e }
            if (r1 == r0) goto L_0x0009
            r1 = r1 & r0
            if (r1 <= 0) goto L_0x015e
            goto L_0x0009
        L_0x00e3:
            boolean r0 = r15.has(r1)     // Catch:{  }
            if (r0 == 0) goto L_0x00fa
            java.lang.String r1 = r15.getString(r1)     // Catch:{  }
            if (r1 == 0) goto L_0x015e
        L_0x00ef:
            java.lang.Object r0 = r4.getValue()     // Catch:{  }
            X.3aH r0 = (X.C62553aH) r0     // Catch:{  }
            boolean r0 = X.C62553aH.A01(r0, r1)     // Catch:{  }
            goto L_0x015c
        L_0x00fa:
            java.lang.String r1 = ""
            goto L_0x00ef
        L_0x00fd:
            X.3XT r6 = r13.A01     // Catch:{  }
            if (r6 == 0) goto L_0x0145
            boolean r0 = r15.has(r2)     // Catch:{  }
            if (r0 == 0) goto L_0x015e
            org.json.JSONArray r7 = r15.getJSONArray(r2)     // Catch:{  }
            if (r7 == 0) goto L_0x015e
            r5 = 0
        L_0x010e:
            int r0 = r7.length()     // Catch:{  }
            if (r5 >= r0) goto L_0x015e
            org.json.JSONObject r4 = r7.getJSONObject(r5)     // Catch:{  }
            java.util.Map r0 = r6.A00     // Catch:{ JSONException -> 0x0142 }
            java.util.Iterator r3 = X.AnonymousClass0wJ.A0z(r0)     // Catch:{ JSONException -> 0x0142 }
        L_0x011e:
            boolean r0 = r3.hasNext()     // Catch:{ JSONException -> 0x0142 }
            if (r0 == 0) goto L_0x0145
            java.util.Map$Entry r0 = X.C18180wK.A0o(r3)     // Catch:{ JSONException -> 0x0142 }
            java.lang.String r2 = X.C18200wM.A0p(r0)     // Catch:{ JSONException -> 0x0142 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ JSONException -> 0x0142 }
            X.3aH r1 = (X.C62553aH) r1     // Catch:{ JSONException -> 0x0142 }
            boolean r0 = r4.has(r2)     // Catch:{ JSONException -> 0x0142 }
            if (r0 == 0) goto L_0x0142
            java.lang.String r0 = r4.getString(r2)     // Catch:{ JSONException -> 0x0142 }
            boolean r0 = X.C62553aH.A01(r1, r0)     // Catch:{ JSONException -> 0x0142 }
            if (r0 != 0) goto L_0x011e
        L_0x0142:
            int r5 = r5 + 1
            goto L_0x010e
        L_0x0145:
            X.3YE[] r3 = r13.A02
            if (r3 == 0) goto L_0x015f
            int r2 = r3.length
            if (r2 <= 0) goto L_0x015f
            if (r14 == 0) goto L_0x015e
            r1 = 0
        L_0x014f:
            r0 = r3[r1]
            boolean r0 = r0.A02(r14)
            if (r0 == 0) goto L_0x015e
            int r1 = r1 + 1
            if (r1 >= r2) goto L_0x015f
            goto L_0x014f
        L_0x015c:
            if (r0 != 0) goto L_0x0009
        L_0x015e:
            return r12
        L_0x015f:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Ub.A01(android.content.Intent, org.json.JSONObject):boolean");
    }

    public AnonymousClass3Ub(AnonymousClass3XT r1, Map map, AnonymousClass3YE[] r3) {
        this.A00 = map;
        this.A02 = r3;
        this.A01 = r1;
    }
}
