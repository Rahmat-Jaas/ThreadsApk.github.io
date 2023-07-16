package X;

/* renamed from: X.3Dq  reason: invalid class name and case insensitive filesystem */
public final class C58053Dq {
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.H1T A00(X.AnonymousClass3UU r9, com.instagram.service.session.UserSession r10, java.lang.Integer r11, java.util.Map r12, int r13) {
        /*
            r8 = this;
            org.json.JSONObject r4 = X.C18230wP.A0y()
            java.util.Iterator r5 = X.AnonymousClass0wJ.A0z(r12)
        L_0x0008:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0051
            java.util.Map$Entry r0 = X.C18180wK.A0o(r5)
            java.lang.Object r3 = r0.getKey()
            com.instagram.quickpromotion.intf.QuickPromotionSurface r3 = (com.instagram.quickpromotion.intf.QuickPromotionSurface) r3
            org.json.JSONArray r2 = X.C18250wR.A0i()
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            java.util.Iterator r1 = r0.iterator()
        L_0x0026:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0038
            java.lang.Object r0 = r1.next()
            com.instagram.quickpromotion.intf.Trigger r0 = (com.instagram.quickpromotion.intf.Trigger) r0
            java.lang.String r0 = r0.A01
            r2.put(r0)
            goto L_0x0026
        L_0x0038:
            int r0 = r3.A00     // Catch:{ JSONException -> 0x0042 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ JSONException -> 0x0042 }
            r4.put(r0, r2)     // Catch:{ JSONException -> 0x0042 }
            goto L_0x0008
        L_0x0042:
            r3 = move-exception
            java.lang.String r2 = "QuickPromotionApi"
            java.lang.String r0 = "surfaces_to_triggers"
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Failed to create %s parameters"
            X.AnonymousClass0LU.A0K(r2, r0, r3, r1)
            goto L_0x0008
        L_0x0051:
            java.lang.String r5 = r4.toString()
            X.H1T r3 = X.AnonymousClass0wJ.A0N(r10)
            java.lang.String r4 = "qp/batch_fetch/"
            r3.A0J(r4)
            java.util.Set r0 = r12.keySet()
            org.json.JSONObject r7 = X.C18230wP.A0y()
            java.util.Iterator r6 = r0.iterator()     // Catch:{ JSONException -> 0x0082 }
        L_0x006a:
            boolean r0 = r6.hasNext()     // Catch:{ JSONException -> 0x0082 }
            if (r0 == 0) goto L_0x008a
            java.lang.Object r2 = r6.next()     // Catch:{ JSONException -> 0x0082 }
            com.instagram.quickpromotion.intf.QuickPromotionSurface r2 = (com.instagram.quickpromotion.intf.QuickPromotionSurface) r2     // Catch:{ JSONException -> 0x0082 }
            int r0 = r2.A00     // Catch:{ JSONException -> 0x0082 }
            java.lang.String r1 = java.lang.Integer.toString(r0)     // Catch:{ JSONException -> 0x0082 }
            java.lang.String r0 = r2.A01     // Catch:{ JSONException -> 0x0082 }
            r7.put(r1, r0)     // Catch:{ JSONException -> 0x0082 }
            goto L_0x006a
        L_0x0082:
            r2 = move-exception
            java.lang.String r1 = "QuickPromotionApi"
            java.lang.String r0 = "Failed to create surfaces_to_queries parameters"
            X.AnonymousClass0LU.A0E(r1, r0, r2)
        L_0x008a:
            java.lang.String r1 = r7.toString()
            java.lang.String r0 = "surfaces_to_queries"
            r3.A0O(r0, r1)
            java.lang.String r1 = "vc_policy"
            java.lang.String r0 = "default"
            r3.A0O(r1, r0)
            java.lang.String r1 = "version"
            java.lang.String r0 = "1"
            r3.A0O(r1, r0)
            java.lang.String r0 = "surfaces_to_triggers"
            r3.A0O(r0, r5)
            java.lang.String r1 = java.lang.Integer.toString(r13)
            java.lang.String r0 = "scale"
            r3.A0O(r0, r1)
            if (r9 == 0) goto L_0x00dd
            com.google.common.collect.ImmutableMap r1 = r9.A01
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00dd
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r1)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "trigger_context"
            r3.A0O(r0, r1)
        L_0x00c7:
            X.0et r0 = X.C09120et.A02()
            X.0dK r0 = r0.A1w
            java.lang.String r1 = X.C18200wM.A0j(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00dc
            java.lang.String r0 = "qp_override_ip"
            r3.A0O(r0, r1)
        L_0x00dc:
            return r3
        L_0x00dd:
            java.lang.Integer r2 = X.AnonymousClass006.A0Y
            if (r11 != r2) goto L_0x00fa
            java.lang.String r0 = "5f56efad68e1edec7801f630b5c122704ec5378adbee6609a448f105f34a9c73"
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r0, r5}
            java.lang.String r0 = "%s%s/%s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r3.A0I(r0)
            r3.A0E(r2)
            long r1 = X.C60933Rd.A02
            X.H1R r0 = r3.A04
            r0.A00 = r1
            goto L_0x00c7
        L_0x00fa:
            java.lang.Integer r0 = X.AnonymousClass006.A00
            if (r11 == r0) goto L_0x00c7
            java.lang.String r0 = "5f56efad68e1edec7801f630b5c122704ec5378adbee6609a448f105f34a9c73"
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r0, r5}
            java.lang.String r0 = "%s%s/%s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r3.A0I(r0)
            r3.A0E(r11)
            goto L_0x00c7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58053Dq.A00(X.3UU, com.instagram.service.session.UserSession, java.lang.Integer, java.util.Map, int):X.H1T");
    }
}
