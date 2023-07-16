package X;

/* renamed from: X.2rZ  reason: invalid class name and case insensitive filesystem */
public final class C49552rZ {
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007d, code lost:
        if (r0 != null) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0081, code lost:
        if (r0 == null) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
        r0 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0088, code lost:
        if (X.C04220Ms.A0I(r1, r9) != false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008e, code lost:
        if (X.C04220Ms.A0I(r0, r9) != false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0090, code lost:
        r7.put(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0093, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C171719zr r18, com.instagram.service.session.UserSession r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, boolean r27) {
        /*
            r13 = r25
            r12 = 0
            r17 = 1
            r0 = 3
            r14 = r18
            X.C04220Ms.A0B(r14, r0)
            r0 = r19
            com.instagram.user.model.User r16 = X.AnonymousClass0wJ.A0Y(r0)
            r11 = 0
            X.0nS r1 = X.C13330nS.A01(r11, r0)
            java.lang.String r0 = "commerce_buyer_ui_events"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 431(0x1af, float:6.04E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r10 = X.C18180wK.A0I(r1, r0)
            java.lang.String r9 = ""
            r1 = r21
            if (r21 == 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r0 = r9
            goto L_0x0034
        L_0x002b:
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ IllegalArgumentException -> 0x0039 }
            X.C04220Ms.A08(r0)     // Catch:{ IllegalArgumentException -> 0x0039 }
            java.lang.String r0 = X.C18220wO.A0u(r0, r1)     // Catch:{ IllegalArgumentException -> 0x0039 }
        L_0x0034:
            X.9zC r8 = X.C171309zC.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x0039 }
            goto L_0x003b
        L_0x0039:
            X.9zC r8 = X.C171309zC.UNKNOWN
        L_0x003b:
            java.util.HashMap r7 = X.AnonymousClass0wJ.A0y()
            java.lang.String r6 = ","
            r1 = r24
            if (r24 == 0) goto L_0x0096
            java.lang.String[] r0 = new java.lang.String[]{r6}     // Catch:{ Exception -> 0x00aa, all -> 0x00a8 }
            r5 = 0
            r4 = 6
            java.util.List r1 = X.AnonymousClass8bP.A0f(r1, r0, r12, r4)     // Catch:{ Exception -> 0x00aa, all -> 0x00a8 }
            if (r1 == 0) goto L_0x0096
            java.lang.String[] r0 = new java.lang.String[r12]     // Catch:{ Exception -> 0x00aa, all -> 0x00a8 }
            java.lang.Object[] r3 = r1.toArray(r0)     // Catch:{ Exception -> 0x00aa, all -> 0x00a8 }
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch:{ Exception -> 0x00aa, all -> 0x00a8 }
            if (r3 == 0) goto L_0x0096
            int r2 = r3.length     // Catch:{ Exception -> 0x00aa, all -> 0x00a8 }
        L_0x005c:
            if (r5 >= r2) goto L_0x0096
            r1 = r3[r5]     // Catch:{ Exception -> 0x00aa, all -> 0x00a8 }
            java.lang.String r0 = ":"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ Exception -> 0x00aa, all -> 0x00a8 }
            java.util.List r1 = X.AnonymousClass8bP.A0f(r1, r0, r12, r4)     // Catch:{ Exception -> 0x00aa, all -> 0x00a8 }
            if (r1 == 0) goto L_0x007b
            java.lang.String[] r0 = new java.lang.String[r12]     // Catch:{ Exception -> 0x00aa, all -> 0x00a8 }
            java.lang.Object[] r0 = r1.toArray(r0)     // Catch:{ Exception -> 0x00aa, all -> 0x00a8 }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ Exception -> 0x00aa, all -> 0x00a8 }
            if (r0 == 0) goto L_0x007c
            r1 = r0[r12]     // Catch:{ Exception -> 0x00aa, all -> 0x00a8 }
            if (r1 != 0) goto L_0x007f
            goto L_0x007c
        L_0x007b:
            r0 = r11
        L_0x007c:
            r1 = r9
            if (r0 == 0) goto L_0x0083
        L_0x007f:
            r0 = r0[r17]     // Catch:{ Exception -> 0x00aa, all -> 0x00a8 }
            if (r0 != 0) goto L_0x0084
        L_0x0083:
            r0 = r9
        L_0x0084:
            boolean r15 = X.C04220Ms.A0I(r1, r9)     // Catch:{ Exception -> 0x00aa, all -> 0x00a8 }
            if (r15 != 0) goto L_0x0093
            boolean r15 = X.C04220Ms.A0I(r0, r9)     // Catch:{ Exception -> 0x00aa, all -> 0x00a8 }
            if (r15 != 0) goto L_0x0093
            r7.put(r1, r0)     // Catch:{ Exception -> 0x00aa, all -> 0x00a8 }
        L_0x0093:
            int r5 = r5 + 1
            goto L_0x005c
        L_0x0096:
            java.lang.String r0 = "deeplink_destination"
            if (r25 != 0) goto L_0x009b
            r13 = r9
        L_0x009b:
            r7.put(r0, r13)     // Catch:{ Exception -> 0x00aa, all -> 0x00a8 }
            java.lang.String r0 = "deeplink_destination_params"
            if (r26 == 0) goto L_0x00a4
            r9 = r26
        L_0x00a4:
            r7.put(r0, r9)     // Catch:{ Exception -> 0x00aa, all -> 0x00a8 }
            goto L_0x00aa
        L_0x00a8:
            r0 = move-exception
            throw r0
        L_0x00aa:
            java.lang.String r0 = "flow_name"
            r10.A0O(r14, r0)
            X.9zp r1 = X.C171699zp.A02
            java.lang.String r0 = "flow_step"
            r10.A0O(r1, r0)
            java.lang.String r0 = "invoice_id"
            r1 = r22
            r10.A0T(r0, r1)
            r0 = r23
            if (r23 == 0) goto L_0x00c5
            java.util.List r11 = X.C81074n3.A07(r0, r6, r12)
        L_0x00c5:
            java.lang.String r0 = "order_item_ids"
            r10.A0U(r0, r11)
            java.lang.String r0 = "referrer_surface"
            r10.A0O(r8, r0)
            java.lang.String r0 = "session"
            r1 = r20
            r10.A0T(r0, r1)
            java.lang.String r0 = r16.getId()
            java.lang.Long r1 = X.AnonymousClass0wJ.A0d(r0)
            java.lang.String r0 = "user_id"
            r10.A0S(r0, r1)
            java.lang.String r0 = "additional_data"
            r10.A0V(r0, r7)
            if (r27 == 0) goto L_0x00f3
            X.28O r0 = X.AnonymousClass28O.SUCCEED
        L_0x00ec:
            X.C18220wO.A1D(r0, r10)
            r10.Bb4()
            return
        L_0x00f3:
            X.28O r0 = X.AnonymousClass28O.FAIL
            goto L_0x00ec
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49552rZ.A00(X.9zr, com.instagram.service.session.UserSession, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }
}
