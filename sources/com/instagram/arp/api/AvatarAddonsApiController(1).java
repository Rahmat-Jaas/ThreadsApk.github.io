package com.instagram.arp.api;

import X.GX6;
import com.instagram.service.session.UserSession;

public final class AvatarAddonsApiController {
    public final GX6 A00;
    public final UserSession A01;

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006d, code lost:
        if (r3 != null) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C146958n9 r10) {
        /*
            r9 = this;
            r3 = 5
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1.A00(r3, r10)
            if (r0 == 0) goto L_0x00ec
            r4 = r10
            kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ec
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r4.A01
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r6 = 1
            if (r0 == 0) goto L_0x0079
            if (r0 != r6) goto L_0x00f7
            X.AnonymousClass0OU.A00(r1)
        L_0x0023:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0070
            X.1jA r1 = (X.AnonymousClass1jA) r1
            java.lang.Object r0 = r1.A00
            X.5tM r0 = (X.AnonymousClass5tM) r0
            X.6dP r3 = r0.A00
            r0 = 0
            if (r3 == 0) goto L_0x006c
            X.6dO r1 = r3.A00
            if (r1 == 0) goto L_0x006c
            X.6hE r1 = r1.A00
            if (r1 == 0) goto L_0x006c
            java.util.List r2 = r1.A00
        L_0x003e:
            X.6dO r1 = r3.A00
            if (r1 == 0) goto L_0x0048
            X.6hE r1 = r1.A00
            if (r1 == 0) goto L_0x0048
            java.util.List r0 = r1.A01
        L_0x0048:
            kotlin.Pair r0 = X.C18180wK.A0p(r2, r0)
            X.1jA r1 = X.AnonymousClass1jA.A00(r0)
        L_0x0050:
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x006b
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x00f2
            X.1jB r1 = (X.AnonymousClass1jB) r1
            java.lang.Object r1 = r1.A00
            java.lang.String r0 = "Error with AvatarAddon graphql query: "
            java.lang.String r1 = X.AnonymousClass0wJ.A0t(r0, r1)
            java.lang.String r0 = "AvatarAddonsApiController"
            X.C10450iM.A03(r0, r1)
            X.1jB r1 = X.AnonymousClass1jB.A01()
        L_0x006b:
            return r1
        L_0x006c:
            r2 = r0
            if (r3 == 0) goto L_0x0048
            goto L_0x003e
        L_0x0070:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x0050
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0079:
            X.AnonymousClass0OU.A00(r1)
            org.json.JSONObject r8 = X.C18230wP.A0y()
            java.lang.String r1 = "device_capabilities"
            com.instagram.service.session.UserSession r0 = r9.A01     // Catch:{ JSONException -> 0x008c }
            org.json.JSONObject r0 = X.C31032GeB.A03(r0)     // Catch:{ JSONException -> 0x008c }
            r8.put(r1, r0)     // Catch:{ JSONException -> 0x008c }
            goto L_0x0098
        L_0x008c:
            r1 = move-exception
            java.lang.String r0 = "Error adding adding device capabilities to JSON Object: "
            java.lang.String r1 = X.C18230wP.A0t(r0, r1)
            java.lang.String r0 = "AvatarAddonsApiController"
            X.C10450iM.A03(r0, r1)
        L_0x0098:
            com.instagram.service.session.UserSession r0 = r9.A01
            X.H1T r2 = X.AnonymousClass0wJ.A0O(r0)
            java.lang.String r0 = "creatives/camera_effects_graphql/"
            r2.A0J(r0)
            r2.A0I(r0)
            java.lang.Integer r0 = X.AnonymousClass006.A0N
            r2.A0E(r0)
            X.GX6 r0 = r9.A00
            com.instagram.service.session.UserSession r7 = r0.A00
            X.0TJ r3 = X.AnonymousClass0TJ.A06
            r0 = 36592773470945874(0x8200ef00150252, double:3.2047555180734676E-306)
            long r0 = X.C63803iN.A03(r3, r7, r0)
            r2.A07(r0)
            X.8l9 r1 = X.AnonymousClass5H4.A00()
            java.lang.String r0 = "IGAvatarAddons"
            java.lang.String r1 = r1.clientDocIdForQuery(r0)
            java.lang.String r0 = "client_doc_id"
            r2.A0P(r0, r1)
            java.lang.String r1 = r8.toString()
            java.lang.String r0 = "query_params"
            r2.A0O(r0, r1)
            java.lang.Class<X.5tM> r1 = X.AnonymousClass5tM.class
            java.lang.Class<X.6yv> r0 = X.C117586yv.class
            X.H8c r3 = X.AnonymousClass0wJ.A0T(r2, r1, r0)
            r2 = 0
            r1 = 14
            r4.A00 = r6
            r0 = 1264292044(0x4b5b90cc, float:1.4389452E7)
            java.lang.Object r1 = X.C63623hv.A01(r3, r4, r0, r2, r1)
            if (r1 != r5) goto L_0x0023
            return r5
        L_0x00ec:
            kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1 r4 = X.C18240wQ.A0m(r9, r10, r3)
            goto L_0x0015
        L_0x00f2:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00f7:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.arp.api.AvatarAddonsApiController.A00(X.8n9):java.lang.Object");
    }

    public /* synthetic */ AvatarAddonsApiController(UserSession userSession) {
        GX6 gx6 = new GX6(userSession);
        this.A01 = userSession;
        this.A00 = gx6;
    }
}
