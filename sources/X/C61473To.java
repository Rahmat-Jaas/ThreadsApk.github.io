package X;

/* renamed from: X.3To  reason: invalid class name and case insensitive filesystem */
public final class C61473To {
    public static final C61473To A00 = new C61473To();

    /* JADX WARNING: Removed duplicated region for block: B:91:0x0356 A[Catch:{ JSONException -> 0x035e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass601 r38, X.C63893iY r39) {
        /*
            r37 = this;
            java.lang.String r14 = "fb_access_token"
            r9 = 0
            r36 = r38
            r3 = r39
            r0 = r36
            boolean r1 = X.AnonymousClass0wJ.A1Z(r3, r0)
            X.7h3 r8 = X.C63893iY.A03(r3, r9)
            r0 = 35
            java.lang.String r5 = ""
            java.lang.String r10 = r8.A0O(r0, r5)
            X.C04220Ms.A06(r10)
            r0 = 41
            boolean r20 = r8.A0T(r0, r9)
            X.0i6 r4 = X.C63913ic.A0F(r36)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.service.session.LoggedOutSession"
            X.C04220Ms.A0C(r4, r0)
            X.0bf r4 = (X.C07530bf) r4
            X.01V r7 = X.AnonymousClass01V.A0p
            X.C04220Ms.A06(r7)
            boolean r0 = X.AnonymousClass8bQ.A0n(r10)
            r21 = 0
            r19 = 3
            r6 = 2293785(0x230019, float:3.214277E-39)
            if (r0 == 0) goto L_0x004a
            java.lang.String r0 = "success_response_empty"
            r7.markerAnnotate((int) r6, (java.lang.String) r0, (boolean) r1)
            r0 = r19
            r7.markerEnd(r6, r0)
        L_0x0049:
            return r21
        L_0x004a:
            r0 = 36
            java.lang.String r2 = r8.A0O(r0, r5)
            java.util.Map r0 = X.C311424k.A01
            java.lang.Object r13 = r0.get(r2)
            X.24k r13 = (X.C311424k) r13
            if (r13 != 0) goto L_0x005c
            X.24k r13 = X.C311424k.UNKNOWN
        L_0x005c:
            r0 = 38
            java.lang.String r2 = r8.A0O(r0, r5)
            java.util.Map r0 = X.C311324j.A01
            java.lang.Object r0 = r0.get(r2)
            X.24j r0 = (X.C311324j) r0
            if (r0 != 0) goto L_0x006e
            X.24j r0 = X.C311324j.UNKNOWN
        L_0x006e:
            java.util.List r2 = r3.A00
            X.6jp r18 = X.C18190wL.A0R(r2, r1)
            X.3LL r15 = new X.3LL
            r15.<init>()
            org.json.JSONObject r3 = X.C18250wR.A0j(r10)     // Catch:{ JSONException -> 0x035e }
            java.lang.String r2 = "headers"
            java.lang.String r12 = r3.getString(r2)     // Catch:{ JSONException -> 0x035e }
            java.lang.String r2 = "login_response"
            java.lang.String r17 = r3.getString(r2)     // Catch:{ JSONException -> 0x035e }
            X.MMo r2 = X.C18180wK.A0L(r17)     // Catch:{ JSONException -> 0x035e }
            X.1qy r5 = X.AnonymousClass3WN.parseFromJson(r2)     // Catch:{ JSONException -> 0x035e }
            org.json.JSONObject r3 = X.C18250wR.A0j(r12)     // Catch:{ JSONException -> 0x035e }
            java.lang.String r2 = "IG-Set-Authorization"
            java.lang.String r16 = r3.getString(r2)     // Catch:{ JSONException -> 0x035e }
            androidx.fragment.app.FragmentActivity r8 = X.C63913ic.A05(r36)     // Catch:{ JSONException -> 0x035e }
            X.C04220Ms.A06(r12)     // Catch:{ JSONException -> 0x035e }
            com.google.gson.Gson r3 = new com.google.gson.Gson     // Catch:{ LWW -> 0x014e }
            r3.<init>()     // Catch:{ LWW -> 0x014e }
            X.1QU r2 = new X.1QU     // Catch:{ LWW -> 0x014e }
            r2.<init>()     // Catch:{ LWW -> 0x014e }
            java.lang.reflect.Type r2 = r2.type     // Catch:{ LWW -> 0x014e }
            java.lang.Object r2 = r3.A07(r12, r2)     // Catch:{ LWW -> 0x014e }
            X.C04220Ms.A06(r2)     // Catch:{ LWW -> 0x014e }
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ LWW -> 0x014e }
            java.util.HashMap r11 = X.AnonymousClass0wJ.A0y()     // Catch:{ LWW -> 0x014e }
            java.util.Iterator r10 = X.AnonymousClass0wJ.A0z(r2)     // Catch:{ LWW -> 0x014e }
        L_0x00bf:
            boolean r2 = r10.hasNext()     // Catch:{ LWW -> 0x014e }
            if (r2 == 0) goto L_0x00dc
            java.util.Map$Entry r2 = X.C18180wK.A0o(r10)     // Catch:{ LWW -> 0x014e }
            java.lang.Object r3 = r2.getKey()     // Catch:{ LWW -> 0x014e }
            java.lang.String r2 = X.C18230wP.A0u(r2)     // Catch:{ LWW -> 0x014e }
            java.util.List r2 = X.C18210wN.A0h(r2)     // Catch:{ LWW -> 0x014e }
            X.C04220Ms.A06(r2)     // Catch:{ LWW -> 0x014e }
            r11.put(r3, r2)     // Catch:{ LWW -> 0x014e }
            goto L_0x00bf
        L_0x00dc:
            java.lang.String r10 = "https://i.instagram.com/api/v1/bloks/apps/com.bloks.www.bloks.caa.login.async.send_login_request/"
            X.44h r3 = new X.44h     // Catch:{ LWW -> 0x014e }
            r3.<init>(r4)     // Catch:{ LWW -> 0x014e }
            java.net.URI r2 = new java.net.URI     // Catch:{ LWW -> 0x014e }
            r2.<init>(r10)     // Catch:{ LWW -> 0x014e }
            r3.D8b(r2, r11)     // Catch:{ LWW -> 0x014e }
            org.json.JSONObject r3 = X.C18250wR.A0j(r12)     // Catch:{ JSONException -> 0x0106 }
            java.lang.String r2 = "X-IG-Set-WWW-Claim"
            java.lang.String r3 = r3.getString(r2)     // Catch:{ JSONException -> 0x0106 }
            X.C04220Ms.A06(r3)     // Catch:{ JSONException -> 0x0106 }
            int r2 = r3.length()     // Catch:{ JSONException -> 0x0106 }
            if (r2 == 0) goto L_0x010e
            X.44b r2 = X.C685044b.A00(r4)     // Catch:{ JSONException -> 0x0106 }
            r2.A01(r3)     // Catch:{ JSONException -> 0x0106 }
            goto L_0x010e
        L_0x0106:
            r10 = move-exception
            java.lang.String r3 = "BKBloksActionCaaHandleLoginResponseImpl"
            java.lang.String r2 = "Exception parsing JSON"
            X.AnonymousClass0LU.A0E(r3, r2, r10)     // Catch:{ LWW -> 0x014e }
        L_0x010e:
            org.json.JSONObject r3 = X.C18250wR.A0j(r12)     // Catch:{ JSONException -> 0x0145 }
            java.lang.String r2 = "IG-Set-Password-Encryption-Pub-Key"
            java.lang.String r10 = r3.getString(r2)     // Catch:{ JSONException -> 0x0145 }
            X.C04220Ms.A06(r10)     // Catch:{ JSONException -> 0x0145 }
            org.json.JSONObject r3 = X.C18250wR.A0j(r12)     // Catch:{ JSONException -> 0x0145 }
            java.lang.String r2 = "IG-Set-Password-Encryption-Key-Id"
            java.lang.String r11 = r3.getString(r2)     // Catch:{ JSONException -> 0x0145 }
            X.C04220Ms.A06(r11)     // Catch:{ JSONException -> 0x0145 }
            int r2 = r10.length()     // Catch:{ JSONException -> 0x0145 }
            if (r2 == 0) goto L_0x0156
            int r2 = r11.length()     // Catch:{ JSONException -> 0x0145 }
            if (r2 == 0) goto L_0x0156
            X.3Gm r3 = X.C58623Gm.A01     // Catch:{ JSONException -> 0x0145 }
            if (r3 != 0) goto L_0x0141
            android.content.Context r2 = X.C10600ic.A00     // Catch:{ JSONException -> 0x0145 }
            X.3Gm r3 = new X.3Gm     // Catch:{ JSONException -> 0x0145 }
            r3.<init>(r2)     // Catch:{ JSONException -> 0x0145 }
            X.C58623Gm.A01 = r3     // Catch:{ JSONException -> 0x0145 }
        L_0x0141:
            r3.A01(r10, r11)     // Catch:{ JSONException -> 0x0145 }
            goto L_0x0156
        L_0x0145:
            r10 = move-exception
            java.lang.String r3 = "BKBloksActionCaaHandleLoginResponseImpl"
            java.lang.String r2 = "Exception parsing JSON"
            X.AnonymousClass0LU.A0E(r3, r2, r10)     // Catch:{ LWW -> 0x014e }
            goto L_0x0156
        L_0x014e:
            r10 = move-exception
            java.lang.String r3 = "BKBloksActionCaaHandleLoginResponseImpl"
            java.lang.String r2 = "Exception parsing JSON"
            X.AnonymousClass0LU.A0E(r3, r2, r10)     // Catch:{ JSONException -> 0x035e }
        L_0x0156:
            X.0et r3 = X.C18190wL.A0X()     // Catch:{ JSONException -> 0x035e }
            java.util.Set r10 = r3.A0E()     // Catch:{ JSONException -> 0x035e }
            com.instagram.user.model.User r2 = r5.A00     // Catch:{ JSONException -> 0x035e }
            java.lang.String r2 = r2.getId()     // Catch:{ JSONException -> 0x035e }
            boolean r2 = r10.contains(r2)     // Catch:{ JSONException -> 0x035e }
            if (r2 == 0) goto L_0x017b
            java.util.Set r10 = r3.A0E()     // Catch:{ JSONException -> 0x035e }
            com.instagram.user.model.User r2 = r5.A00     // Catch:{ JSONException -> 0x035e }
            java.lang.String r2 = r2.getId()     // Catch:{ JSONException -> 0x035e }
            java.util.Set r2 = X.AnonymousClass4WL.A02(r2, r10)     // Catch:{ JSONException -> 0x035e }
            r3.A0G(r2)     // Catch:{ JSONException -> 0x035e }
        L_0x017b:
            int r3 = r13.ordinal()     // Catch:{ JSONException -> 0x035e }
            if (r3 == r9) goto L_0x02c3
            if (r3 == r1) goto L_0x02e7
            r2 = 2
            if (r3 == r2) goto L_0x02e7
            r10 = 4
            if (r3 != r10) goto L_0x02f8
            java.lang.String r2 = "fb_sso_login"
            r7.markerAnnotate((int) r6, (java.lang.String) r2, (boolean) r1)     // Catch:{ JSONException -> 0x035e }
            org.json.JSONObject r3 = X.C18250wR.A0j(r17)     // Catch:{ JSONException -> 0x035e }
            boolean r2 = r3.has(r14)     // Catch:{ JSONException -> 0x035e }
            if (r2 == 0) goto L_0x02f8
            java.lang.String r13 = "fb_user_id"
            java.lang.String r11 = r3.getString(r13)     // Catch:{ JSONException -> 0x035e }
            X.C04220Ms.A06(r11)     // Catch:{ JSONException -> 0x035e }
            java.lang.String r12 = r3.getString(r14)     // Catch:{ JSONException -> 0x035e }
            X.C04220Ms.A06(r12)     // Catch:{ JSONException -> 0x035e }
            X.3HX r2 = X.C63913ic.A0D(r36)     // Catch:{ JSONException -> 0x035e }
            android.content.Context r2 = r2.A00     // Catch:{ JSONException -> 0x035e }
            X.C04220Ms.A06(r2)     // Catch:{ JSONException -> 0x035e }
            com.instagram.user.model.User r15 = r5.A00     // Catch:{ JSONException -> 0x035e }
            X.C04220Ms.A06(r15)     // Catch:{ JSONException -> 0x035e }
            java.lang.String r3 = r5.A06     // Catch:{ JSONException -> 0x035e }
            X.443 r23 = X.AnonymousClass443.A00     // Catch:{ JSONException -> 0x035e }
            r22 = r2
            r24 = r4
            r25 = r15
            r26 = r3
            r27 = r9
            com.instagram.service.session.UserSession r5 = X.C67323zM.A03(r22, r23, r24, r25, r26, r27)     // Catch:{ JSONException -> 0x035e }
            java.lang.String r3 = r15.BK7()     // Catch:{ JSONException -> 0x035e }
            com.instagram.common.typedurl.ImageUrl r2 = r15.B4M()     // Catch:{ JSONException -> 0x035e }
            X.C63593hs.A04(r2, r3)     // Catch:{ JSONException -> 0x035e }
            X.0TJ r14 = X.AnonymousClass0TJ.A05     // Catch:{ JSONException -> 0x035e }
            r2 = 18310802792522733(0x410d94000023ed, double:1.8972136256302725E-307)
            boolean r2 = X.C63173fJ.A05(r14, r2)     // Catch:{ JSONException -> 0x035e }
            if (r2 != 0) goto L_0x01ff
            X.3S9 r3 = X.C49332rD.A00(r4)     // Catch:{ JSONException -> 0x035e }
            com.facebook.AccessToken r2 = r3.A00     // Catch:{ JSONException -> 0x035e }
            if (r2 != 0) goto L_0x01ef
            com.facebook.AccessToken r2 = new com.facebook.AccessToken     // Catch:{ JSONException -> 0x035e }
            r2.<init>(r12, r11)     // Catch:{ JSONException -> 0x035e }
            r3.A00 = r2     // Catch:{ JSONException -> 0x035e }
        L_0x01ef:
            X.C67363zQ.A0B(r2, r5)     // Catch:{ JSONException -> 0x035e }
            java.lang.String r4 = r15.getId()     // Catch:{ JSONException -> 0x035e }
            java.lang.Integer r3 = X.AnonymousClass006.A05     // Catch:{ JSONException -> 0x035e }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r9)     // Catch:{ JSONException -> 0x035e }
            X.C67363zQ.A0D(r5, r2, r3, r12, r4)     // Catch:{ JSONException -> 0x035e }
        L_0x01ff:
            if (r20 == 0) goto L_0x02aa
            X.441 r14 = X.AnonymousClass441.A00     // Catch:{ JSONException -> 0x035e }
            android.net.Uri r2 = X.C67323zM.A00(r8)     // Catch:{ JSONException -> 0x035e }
            if (r2 == 0) goto L_0x0215
            android.net.Uri$Builder r4 = r2.buildUpon()     // Catch:{ JSONException -> 0x035e }
            java.lang.String r3 = "fresh_sign_in"
            java.lang.String r2 = "1"
            android.net.Uri r2 = X.C18220wO.A0F(r4, r3, r2)     // Catch:{ JSONException -> 0x035e }
        L_0x0215:
            java.lang.String r12 = X.C18250wR.A0a(r15)     // Catch:{ JSONException -> 0x035e }
            X.C04220Ms.A06(r12)     // Catch:{ JSONException -> 0x035e }
            X.C04220Ms.A0B(r8, r1)     // Catch:{ JSONException -> 0x035e }
            X.C04220Ms.A0B(r0, r10)     // Catch:{ JSONException -> 0x035e }
            X.24j r3 = X.C311324j.LOGIN     // Catch:{ JSONException -> 0x035e }
            if (r0 != r3) goto L_0x028c
            java.lang.String r23 = "login_with_facebook_education_nux_triggered_native"
            java.lang.String r24 = "login_with_fb"
            java.lang.String r25 = "login_with_fb_interaction"
            java.lang.String r26 = "home_page"
            r22 = r5
            r27 = r21
            r28 = r21
            X.AnonymousClass3LL.A00(r22, r23, r24, r25, r26, r27, r28)     // Catch:{ JSONException -> 0x035e }
        L_0x0237:
            java.lang.String r4 = "com.bloks.www.caa.login.login_with_fb_nux"
            java.lang.Integer r29 = X.C66883yU.A0F     // Catch:{ JSONException -> 0x035e }
            java.lang.Integer r30 = X.AnonymousClass006.A00     // Catch:{ JSONException -> 0x035e }
            java.lang.Integer r28 = X.AnonymousClass006.A0N     // Catch:{ JSONException -> 0x035e }
            java.lang.Integer r27 = X.AnonymousClass006.A0C     // Catch:{ JSONException -> 0x035e }
            X.3yU r3 = new X.3yU     // Catch:{ JSONException -> 0x035e }
            r20 = r3
            r22 = r21
            r23 = r21
            r24 = r21
            r25 = r21
            r26 = r21
            r31 = r21
            r32 = r21
            r33 = r9
            r34 = r9
            r35 = r9
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)     // Catch:{ JSONException -> 0x035e }
            com.instagram.bloks.hosting.IgBloksScreenConfig r5 = X.C18190wL.A0N(r5)     // Catch:{ JSONException -> 0x035e }
            r5.A0P = r4     // Catch:{ JSONException -> 0x035e }
            com.instagram.caa.login.helper.CAABloksIgLoginWithFbNavHelper$Companion$launchLoginWithFbNuxScreen$appScreenConfig$1 r9 = new com.instagram.caa.login.helper.CAABloksIgLoginWithFbNavHelper$Companion$launchLoginWithFbNuxScreen$appScreenConfig$1     // Catch:{ JSONException -> 0x035e }
            r9.<init>(r8, r2, r14)     // Catch:{ JSONException -> 0x035e }
            r5.A04 = r9     // Catch:{ JSONException -> 0x035e }
            r5.A01 = r3     // Catch:{ JSONException -> 0x035e }
            java.util.HashMap r3 = X.AnonymousClass0wJ.A0y()     // Catch:{ JSONException -> 0x035e }
            r3.put(r13, r11)     // Catch:{ JSONException -> 0x035e }
            java.lang.String r2 = r0.A00     // Catch:{ JSONException -> 0x035e }
            java.lang.String r0 = "login_source"
            r3.put(r0, r2)     // Catch:{ JSONException -> 0x035e }
            java.lang.String r0 = "ig_profile_pic"
            r3.put(r0, r12)     // Catch:{ JSONException -> 0x035e }
            X.3iE r2 = X.C63743iE.A02(r4, r3)     // Catch:{ JSONException -> 0x035e }
            r0 = 719983200(0x2aea1260, float:4.15795E-13)
            r2.A00 = r0     // Catch:{ JSONException -> 0x035e }
            r2.A0E(r8, r5)     // Catch:{ JSONException -> 0x035e }
            goto L_0x0354
        L_0x028c:
            X.24j r3 = X.C311324j.ACCOUNT_RECOVERY     // Catch:{ JSONException -> 0x035e }
            if (r0 != r3) goto L_0x0237
            java.util.UUID r3 = X.C03480Iw.A00()     // Catch:{ JSONException -> 0x035e }
            java.lang.String r29 = X.C18190wL.A0n(r3)     // Catch:{ JSONException -> 0x035e }
            X.28L r22 = X.AnonymousClass28L.LOGIN_HOME_PAGE     // Catch:{ JSONException -> 0x035e }
            java.lang.String r24 = "login_with_facebook_education_nux_triggered_native"
            java.lang.String r25 = "login_with_fb"
            java.lang.String r26 = "login_with_fb_interaction"
            java.lang.String r27 = "search"
            r23 = r5
            r28 = r21
            X.C34582Kc.A00(r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ JSONException -> 0x035e }
            goto L_0x0237
        L_0x02aa:
            X.442 r4 = X.AnonymousClass442.A00     // Catch:{ JSONException -> 0x035e }
            android.net.Uri r0 = X.C67323zM.A00(r8)     // Catch:{ JSONException -> 0x035e }
            if (r0 == 0) goto L_0x02be
            android.net.Uri$Builder r3 = r0.buildUpon()     // Catch:{ JSONException -> 0x035e }
            java.lang.String r2 = "fresh_sign_in"
            java.lang.String r0 = "1"
            android.net.Uri r0 = X.C18220wO.A0F(r3, r2, r0)     // Catch:{ JSONException -> 0x035e }
        L_0x02be:
            X.C67323zM.A04(r8, r0, r4, r5)     // Catch:{ JSONException -> 0x035e }
            goto L_0x0354
        L_0x02c3:
            java.lang.String r0 = "password_login"
            r7.markerAnnotate((int) r6, (java.lang.String) r0, (boolean) r1)     // Catch:{ JSONException -> 0x035e }
            X.0TJ r0 = X.AnonymousClass0TJ.A05     // Catch:{ JSONException -> 0x035e }
            r2 = 18303909370007890(0x41074f00001152, double:1.8944889830327905E-307)
            boolean r0 = X.C63173fJ.A05(r0, r2)     // Catch:{ JSONException -> 0x035e }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x02f8
            X.C04220Ms.A06(r16)     // Catch:{ JSONException -> 0x035e }
            X.1rA r3 = new X.1rA     // Catch:{ JSONException -> 0x035e }
            r2 = r36
            r0 = r16
            r3.<init>(r15, r2, r4, r0)     // Catch:{ JSONException -> 0x035e }
        L_0x02e3:
            r3.A02(r5)     // Catch:{ JSONException -> 0x035e }
            goto L_0x0354
        L_0x02e7:
            java.lang.String r0 = "nonce_local_auth_login"
            r7.markerAnnotate((int) r6, (java.lang.String) r0, (boolean) r1)     // Catch:{ JSONException -> 0x035e }
            java.lang.String r2 = r5.A05     // Catch:{ JSONException -> 0x035e }
            if (r2 == 0) goto L_0x0323
            java.lang.String r0 = "one_click_login"
            boolean r0 = X.AnonymousClass8bP.A0j(r2, r0, r9)     // Catch:{ JSONException -> 0x035e }
            if (r0 == 0) goto L_0x0323
        L_0x02f8:
            X.C04220Ms.A06(r16)     // Catch:{ JSONException -> 0x035e }
            androidx.fragment.app.FragmentActivity r23 = X.C63913ic.A05(r36)     // Catch:{ JSONException -> 0x035e }
            X.265 r29 = X.AnonymousClass265.A0z     // Catch:{ JSONException -> 0x035e }
            X.0kW r25 = X.C63913ic.A0A(r36)     // Catch:{ JSONException -> 0x035e }
            java.lang.Integer r30 = X.AnonymousClass006.A0j     // Catch:{ JSONException -> 0x035e }
            androidx.fragment.app.FragmentActivity r0 = X.C63913ic.A05(r36)     // Catch:{ JSONException -> 0x035e }
            android.net.Uri r24 = X.C67323zM.A00(r0)     // Catch:{ JSONException -> 0x035e }
            X.1ij r3 = new X.1ij     // Catch:{ JSONException -> 0x035e }
            r22 = r3
            r26 = r21
            r27 = r21
            r28 = r4
            r31 = r16
            r32 = r21
            r33 = r21
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)     // Catch:{ JSONException -> 0x035e }
            goto L_0x02e3
        L_0x0323:
            X.3hk r2 = X.C63533hk.A02(r4)     // Catch:{ JSONException -> 0x035e }
            com.instagram.user.model.User r0 = r5.A00     // Catch:{ JSONException -> 0x035e }
            java.lang.String r0 = r0.getId()     // Catch:{ JSONException -> 0x035e }
            boolean r0 = r2.A0I(r0)     // Catch:{ JSONException -> 0x035e }
            if (r0 == 0) goto L_0x0340
            X.3hk r2 = X.C63533hk.A02(r4)     // Catch:{ JSONException -> 0x035e }
            com.instagram.user.model.User r0 = r5.A00     // Catch:{ JSONException -> 0x035e }
            java.lang.String r0 = r0.getId()     // Catch:{ JSONException -> 0x035e }
            r2.A0E(r4, r0)     // Catch:{ JSONException -> 0x035e }
        L_0x0340:
            X.3hk r8 = X.C63533hk.A02(r4)     // Catch:{ JSONException -> 0x035e }
            com.instagram.user.model.User r0 = r5.A00     // Catch:{ JSONException -> 0x035e }
            java.lang.String r12 = r0.getId()     // Catch:{ JSONException -> 0x035e }
            X.444 r9 = X.AnonymousClass444.A00     // Catch:{ JSONException -> 0x035e }
            java.lang.Integer r11 = X.AnonymousClass006.A0C     // Catch:{ JSONException -> 0x035e }
            r10 = r4
            r13 = r1
            r8.A0B(r9, r10, r11, r12, r13)     // Catch:{ JSONException -> 0x035e }
            goto L_0x02f8
        L_0x0354:
            if (r18 == 0) goto L_0x0049
            r2 = r36
            r0 = r18
            X.C63893iY.A0G(r2, r0)     // Catch:{ JSONException -> 0x035e }
            return r21
        L_0x035e:
            java.lang.String r0 = "json_parse_exception"
            r7.markerAnnotate((int) r6, (java.lang.String) r0, (boolean) r1)
            r0 = r19
            r7.markerEnd(r6, r0)
            return r21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61473To.A00(X.601, X.3iY):java.lang.Object");
    }
}
