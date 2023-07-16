package X;

/* renamed from: X.2t8  reason: invalid class name and case insensitive filesystem */
public final class C50522t8 {
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0080, code lost:
        r2 = X.C18180wK.A0I(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0088, code lost:
        if (X.AnonymousClass0wJ.A1U(r2) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x008a, code lost:
        X.C18180wK.A1C(r2, r4);
        r2.A0T("selected_from", r9);
        r2.A0S("target_user_id", X.AnonymousClass0wJ.A0d(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x009b, code lost:
        if (r8 != null) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x009d, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x009e, code lost:
        r2.A12(r0);
        r2.Bb4();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a5, code lost:
        r0 = X.AnonymousClass0wJ.A0d(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0025, code lost:
        r2 = X.C18180wK.A0I(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002d, code lost:
        if (X.AnonymousClass0wJ.A1U(r2) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002f, code lost:
        X.C18180wK.A1C(r2, r4);
        r2.A0S("target_user_id", X.AnonymousClass0wJ.A0d(r3));
        r2.A0T("selected_from", r9);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C11630kW r4, com.instagram.service.session.UserSession r5, com.instagram.user.model.User r6, java.lang.Integer r7, java.lang.String r8, java.lang.String r9) {
        /*
            java.lang.String r3 = r6.getId()
            int r0 = r7.intValue()
            switch(r0) {
                case 0: goto L_0x0041;
                case 1: goto L_0x0019;
                case 2: goto L_0x000c;
                case 3: goto L_0x000b;
                case 4: goto L_0x0051;
                case 5: goto L_0x0071;
                case 6: goto L_0x0061;
                default: goto L_0x000b;
            }
        L_0x000b:
            return
        L_0x000c:
            X.0nS r1 = X.C13330nS.A01(r4, r5)
            java.lang.String r0 = "ig_mute_stories"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 1355(0x54b, float:1.899E-42)
            goto L_0x0025
        L_0x0019:
            X.0nS r1 = X.C13330nS.A01(r4, r5)
            java.lang.String r0 = "ig_mute_posts"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 1354(0x54a, float:1.897E-42)
        L_0x0025:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r2)
            if (r0 == 0) goto L_0x000b
            X.C18180wK.A1C(r2, r4)
            java.lang.Long r1 = X.AnonymousClass0wJ.A0d(r3)
            java.lang.String r0 = "target_user_id"
            r2.A0S(r0, r1)
            java.lang.String r0 = "selected_from"
            r2.A0T(r0, r9)
            goto L_0x009b
        L_0x0041:
            r9.getClass()
            X.0nS r1 = X.C13330nS.A01(r4, r5)
            java.lang.String r0 = "ig_mute_action_selected"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 1352(0x548, float:1.895E-42)
            goto L_0x0080
        L_0x0051:
            r9.getClass()
            X.0nS r1 = X.C13330nS.A01(r4, r5)
            java.lang.String r0 = "ig_mute_posts_and_stories"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 1353(0x549, float:1.896E-42)
            goto L_0x0080
        L_0x0061:
            r9.getClass()
            X.0nS r1 = X.C13330nS.A01(r4, r5)
            java.lang.String r0 = "ig_unmute_stories"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 1465(0x5b9, float:2.053E-42)
            goto L_0x0080
        L_0x0071:
            r9.getClass()
            X.0nS r1 = X.C13330nS.A01(r4, r5)
            java.lang.String r0 = "ig_unmute_posts"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 1464(0x5b8, float:2.052E-42)
        L_0x0080:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r2)
            if (r0 == 0) goto L_0x000b
            X.C18180wK.A1C(r2, r4)
            java.lang.String r0 = "selected_from"
            r2.A0T(r0, r9)
            java.lang.Long r1 = X.AnonymousClass0wJ.A0d(r3)
            java.lang.String r0 = "target_user_id"
            r2.A0S(r0, r1)
        L_0x009b:
            if (r8 != 0) goto L_0x00a5
            r0 = 0
        L_0x009e:
            r2.A12(r0)
            r2.Bb4()
            return
        L_0x00a5:
            java.lang.Long r0 = X.AnonymousClass0wJ.A0d(r8)
            goto L_0x009e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50522t8.A00(X.0kW, com.instagram.service.session.UserSession, com.instagram.user.model.User, java.lang.Integer, java.lang.String, java.lang.String):void");
    }
}
