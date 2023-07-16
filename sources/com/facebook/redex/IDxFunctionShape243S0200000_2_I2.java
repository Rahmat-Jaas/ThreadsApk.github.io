package com.facebook.redex;

import X.McB;

public class IDxFunctionShape243S0200000_2_I2 implements McB {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxFunctionShape243S0200000_2_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.A02
            switch(r0) {
                case 0: goto L_0x0013;
                case 1: goto L_0x00b4;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            java.lang.Object r1 = r12.A00
            X.7kq r1 = (X.C129017kq) r1
            X.7EC r0 = X.AnonymousClass7EC.A01(r13)
            r1.A01(r0)
            return r13
        L_0x0013:
            java.util.List r13 = (java.util.List) r13
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            java.lang.Object r4 = r12.A01
            java.util.Set r4 = (java.util.Set) r4
            java.util.Iterator r7 = r13.iterator()
        L_0x0021:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0132
            java.lang.Object r0 = r7.next()
            java.util.Iterator r6 = X.C86144wL.A0y(r0)
        L_0x002f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0021
            java.lang.Object r2 = r6.next()
            com.facebook.android.instantexperiences.autofill.model.FbAutofillData r2 = (com.facebook.android.instantexperiences.autofill.model.FbAutofillData) r2
            com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData r2 = (com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData) r2
            boolean r0 = r2 instanceof com.facebook.android.instantexperiences.autofill.model.TelephoneAutofillData
            if (r0 == 0) goto L_0x008e
            com.facebook.android.instantexperiences.autofill.model.TelephoneAutofillData r2 = (com.facebook.android.instantexperiences.autofill.model.TelephoneAutofillData) r2
            java.util.Map r1 = r2.A02(r4)
            java.lang.String r0 = r2.A00
            com.facebook.android.instantexperiences.autofill.model.TelephoneAutofillData r5 = new com.facebook.android.instantexperiences.autofill.model.TelephoneAutofillData
            r5.<init>(r0, r1)
        L_0x004e:
            java.util.Map r0 = r5.A00
            java.util.Iterator r1 = X.AnonymousClass0wJ.A0z(r0)
        L_0x0054:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002f
            java.util.Map$Entry r0 = X.C18180wK.A0o(r1)
            java.lang.String r0 = X.C18230wP.A0u(r0)
            if (r0 == 0) goto L_0x0054
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0054
            java.util.Iterator r2 = r3.iterator()
        L_0x006e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0083
            java.lang.Object r1 = r2.next()
            com.facebook.android.instantexperiences.autofill.model.FbAutofillData r1 = (com.facebook.android.instantexperiences.autofill.model.FbAutofillData) r1
            boolean r0 = r1.BYu(r5)
            if (r0 == 0) goto L_0x0087
            r3.remove(r1)
        L_0x0083:
            r3.add(r5)
            goto L_0x002f
        L_0x0087:
            boolean r0 = r5.BYu(r1)
            if (r0 == 0) goto L_0x006e
            goto L_0x002f
        L_0x008e:
            boolean r0 = r2 instanceof com.facebook.android.instantexperiences.autofill.model.NameAutofillData
            if (r0 == 0) goto L_0x009c
            java.util.Map r0 = r2.A02(r4)
            com.facebook.android.instantexperiences.autofill.model.NameAutofillData r5 = new com.facebook.android.instantexperiences.autofill.model.NameAutofillData
            r5.<init>((java.util.Map) r0)
            goto L_0x004e
        L_0x009c:
            boolean r0 = r2 instanceof com.facebook.android.instantexperiences.autofill.model.EmailAutofillData
            if (r0 == 0) goto L_0x00aa
            java.util.Map r0 = r2.A02(r4)
            com.facebook.android.instantexperiences.autofill.model.EmailAutofillData r5 = new com.facebook.android.instantexperiences.autofill.model.EmailAutofillData
            r5.<init>((java.util.Map) r0)
            goto L_0x004e
        L_0x00aa:
            java.util.Map r0 = r2.A02(r4)
            com.facebook.android.instantexperiences.autofill.model.AddressAutofillData r5 = new com.facebook.android.instantexperiences.autofill.model.AddressAutofillData
            r5.<init>((java.util.Map) r0)
            goto L_0x004e
        L_0x00b4:
            java.lang.Object r11 = r12.A00
            X.6ju r11 = (X.C109376ju) r11
            java.lang.Object r4 = r12.A01
            com.instagram.service.session.UserSession r4 = (com.instagram.service.session.UserSession) r4
            java.lang.String r13 = (java.lang.String) r13
            r0 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            kotlin.Pair r3 = X.C18180wK.A0p(r1, r0)
            org.json.JSONObject r1 = X.C18250wR.A0j(r13)     // Catch:{ JSONException -> 0x0124 }
            java.lang.String r0 = "pending_imports"
            org.json.JSONArray r10 = r1.optJSONArray(r0)     // Catch:{ JSONException -> 0x0124 }
            java.lang.String r9 = "is_device_ready"
            java.lang.String r8 = "pending_captures_count"
            r7 = 0
            if (r10 == 0) goto L_0x00fa
            int r6 = r10.length()     // Catch:{ JSONException -> 0x0124 }
            r5 = 0
            r2 = 0
        L_0x00e2:
            if (r7 >= r6) goto L_0x00f8
            org.json.JSONObject r1 = r10.optJSONObject(r7)     // Catch:{ JSONException -> 0x0124 }
            if (r1 == 0) goto L_0x00f5
            int r0 = r1.getInt(r8)     // Catch:{ JSONException -> 0x0124 }
            int r5 = r5 + r0
            if (r2 != 0) goto L_0x00f5
            boolean r2 = r1.getBoolean(r9)     // Catch:{ JSONException -> 0x0124 }
        L_0x00f5:
            int r7 = r7 + 1
            goto L_0x00e2
        L_0x00f8:
            r7 = r5
            goto L_0x00fb
        L_0x00fa:
            r2 = 0
        L_0x00fb:
            org.json.JSONObject r0 = X.C18230wP.A0y()     // Catch:{ JSONException -> 0x0124 }
            r0.put(r8, r7)     // Catch:{ JSONException -> 0x0124 }
            r0.put(r9, r2)     // Catch:{ JSONException -> 0x0124 }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x0124 }
            if (r0 == 0) goto L_0x0132
            org.json.JSONObject r2 = X.C18250wR.A0j(r0)     // Catch:{ JSONException -> 0x0128 }
            boolean r0 = r2.getBoolean(r9)     // Catch:{ JSONException -> 0x0128 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ JSONException -> 0x0128 }
            int r0 = r2.getInt(r8)     // Catch:{ JSONException -> 0x0128 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ JSONException -> 0x0128 }
            kotlin.Pair r3 = X.C18180wK.A0p(r1, r0)     // Catch:{ JSONException -> 0x0128 }
            return r3
        L_0x0124:
            r0 = move-exception
            com.instagram.service.session.UserSession r4 = r11.A01
            goto L_0x0129
        L_0x0128:
            r0 = move-exception
        L_0x0129:
            java.lang.Integer r1 = X.AnonymousClass006.A0j
            java.lang.String r0 = r0.toString()
            X.C24128D9z.A00(r4, r1, r0)
        L_0x0132:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxFunctionShape243S0200000_2_I2.apply(java.lang.Object):java.lang.Object");
    }
}
