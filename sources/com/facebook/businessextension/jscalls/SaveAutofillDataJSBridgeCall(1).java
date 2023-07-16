package com.facebook.businessextension.jscalls;

import X.C147198oZ;
import android.os.Parcel;
import com.facebook.redex.IDxObjectShape133S0000000_2_I2;

public class SaveAutofillDataJSBridgeCall extends BusinessExtensionJSBridgeCall {
    public static final C147198oZ CREATOR = new IDxObjectShape133S0000000_2_I2(3);

    public SaveAutofillDataJSBridgeCall(Parcel parcel) {
        super(parcel);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SaveAutofillDataJSBridgeCall(android.content.Context r15, android.os.Bundle r16, java.lang.String r17, java.lang.String r18, org.json.JSONObject r19) {
        /*
            r14 = this;
            android.os.Bundle r10 = X.C18180wK.A06()
            java.lang.String r1 = "callbackID"
            r2 = r19
            java.lang.String r0 = r2.getString(r1)
            r10.putString(r1, r0)
            java.lang.String r0 = "raw_autofill_data"
            org.json.JSONObject r9 = r2.getJSONObject(r0)
            r4 = 0
            if (r9 == 0) goto L_0x0073
            java.util.HashMap r8 = X.AnonymousClass0wJ.A0y()
            java.util.Iterator r7 = r9.keys()
        L_0x0020:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0062
            java.lang.String r6 = X.C18180wK.A0k(r7)     // Catch:{ JSONException -> 0x0067 }
            org.json.JSONArray r5 = r9.getJSONArray(r6)     // Catch:{ JSONException -> 0x0067 }
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()     // Catch:{ JSONException -> 0x0067 }
            r1 = 0
        L_0x0033:
            int r0 = r5.length()     // Catch:{ JSONException -> 0x0067 }
            if (r1 >= r0) goto L_0x0047
            java.lang.Object r2 = r5.get(r1)     // Catch:{ JSONException -> 0x0067 }
            boolean r0 = r2 instanceof java.lang.String     // Catch:{ JSONException -> 0x0067 }
            if (r0 == 0) goto L_0x004b
            r3.add(r2)     // Catch:{ JSONException -> 0x0067 }
            int r1 = r1 + 1
            goto L_0x0033
        L_0x0047:
            r8.put(r6, r3)     // Catch:{ JSONException -> 0x0067 }
            goto L_0x0020
        L_0x004b:
            java.lang.StringBuilder r1 = X.C18200wM.A0r()     // Catch:{ JSONException -> 0x0067 }
            java.lang.String r0 = "Value was not a String, was "
            r1.append(r0)     // Catch:{ JSONException -> 0x0067 }
            java.lang.Class r0 = r2.getClass()     // Catch:{ JSONException -> 0x0067 }
            java.lang.String r1 = X.C18200wM.A0m(r0, r1)     // Catch:{ JSONException -> 0x0067 }
            org.json.JSONException r0 = new org.json.JSONException     // Catch:{ JSONException -> 0x0067 }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x0067 }
            throw r0     // Catch:{ JSONException -> 0x0067 }
        L_0x0062:
            com.google.common.collect.ImmutableMap r4 = com.google.common.collect.ImmutableMap.copyOf(r8)
            goto L_0x0073
        L_0x0067:
            r3 = move-exception
            java.lang.String r2 = "SaveAutofillDataJSBridgeCall"
            java.lang.Object[] r1 = new java.lang.Object[]{r3}
            java.lang.String r0 = "Failed to parse raw autofill data"
            X.C37252JnL.A00(r2, r0, r3, r1)
        L_0x0073:
            com.facebook.businessextension.jscalls.SaveAutofillDataJSBridgeCallData r1 = new com.facebook.businessextension.jscalls.SaveAutofillDataJSBridgeCallData
            r1.<init>((com.google.common.collect.ImmutableMap) r4)
            r0 = 844(0x34c, float:1.183E-42)
            java.lang.String r0 = X.I17.A00(r0)
            r10.putParcelable(r0, r1)
            java.lang.String r12 = "saveAutofillData"
            r7 = r14
            r8 = r15
            r9 = r16
            r11 = r17
            r13 = r18
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.businessextension.jscalls.SaveAutofillDataJSBridgeCall.<init>(android.content.Context, android.os.Bundle, java.lang.String, java.lang.String, org.json.JSONObject):void");
    }
}
