package X;

/* renamed from: X.1mj  reason: invalid class name and case insensitive filesystem */
public final class C25221mj extends AnonymousClass0gG {
    public final /* synthetic */ C10300i6 A00;
    public final /* synthetic */ AnonymousClass224 A01;
    public final /* synthetic */ AnonymousClass3YQ A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25221mj(C10300i6 r2, AnonymousClass224 r3, AnonymousClass3YQ r4, String str, String str2) {
        super(583345440);
        this.A00 = r2;
        this.A04 = str;
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x020a, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x020c, code lost:
        r7 = r17.name();
        r6 = X.AnonymousClass006.A15;
        r1 = new java.lang.String[]{"waterfall_id", r2};
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x0170 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x017a */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x019d A[Catch:{ SecurityException -> 0x020c, Exception -> 0x020a }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01e9 A[Catch:{ SecurityException -> 0x020c, Exception -> 0x0217 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[ExcHandler: SecurityException (unused java.lang.SecurityException), SYNTHETIC, Splitter:B:15:0x008e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r41 = this;
            android.content.Context r22 = X.C10600ic.A00
            X.C04220Ms.A06(r22)
            r7 = r41
            X.0i6 r1 = r7.A00
            java.lang.String r6 = r7.A04
            X.4nC r0 = new X.4nC
            r0.<init>(r1)
            r21 = 0
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0v()
            X.24m r4 = X.C311624m.INSTAGRAM
            X.224 r2 = r7.A01
            boolean r1 = r2 instanceof X.C26591qt
            if (r1 == 0) goto L_0x0074
            X.24G r3 = X.AnonymousClass24G.SAVED_ACCOUNTS
        L_0x0020:
            X.3Bv r2 = new X.3Bv
            r1 = r21
            r2.<init>(r6, r1, r4, r3)
            r5.add(r2)
            X.36n r3 = new X.36n
            r3.<init>(r5)
            java.lang.String r13 = r7.A03
            r1 = 3
            X.C04220Ms.A0B(r13, r1)
            java.lang.String r1 = "3.0"
            r0.A00 = r1
            java.util.UUID r1 = X.C03480Iw.A00()
            java.lang.String r2 = X.C18190wL.A0n(r1)
            libraries.access.src.main.sharedstorage.common.ReplicatedStorageRequest r3 = X.AnonymousClass3YQ.A00(r3)
            X.258[] r20 = X.C18180wK.A1b()
            r1 = r20
            int r1 = r1.length
            r40 = r1
            int[] r15 = new int[r1]
            X.0rs r19 = X.C54752zx.A00()
            java.util.List r1 = r3.A00
            r39 = r1
            java.util.ArrayList r18 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r4 = r39.iterator()
        L_0x0060:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x007e
            java.lang.Object r1 = r4.next()
            X.3Sl r1 = (X.C61243Sl) r1
            X.24G r3 = r1.A02
            r1 = r18
            X.C18210wN.A1O(r3, r1)
            goto L_0x0060
        L_0x0074:
            boolean r1 = r2 instanceof X.C26581qs
            if (r1 == 0) goto L_0x007b
            X.24G r3 = X.AnonymousClass24G.INACTIVE_LOGGED_IN_ACCOUNTS
            goto L_0x0020
        L_0x007b:
            X.24G r3 = X.AnonymousClass24G.ACTIVE_ACCOUNT
            goto L_0x0020
        L_0x007e:
            r4 = 0
        L_0x007f:
            r1 = r40
            if (r4 >= r1) goto L_0x0239
            r17 = r20[r4]
            java.lang.String r38 = "2.0"
            java.lang.String r37 = "replicated_storage"
            java.lang.String r33 = "errors"
            java.lang.String r1 = "waterfall_id"
            r14 = 1
            java.lang.String r25 = r17.name()     // Catch:{ SecurityException -> 0x020c, Exception -> 0x020a }
            java.util.Map r3 = X.AnonymousClass3ZN.A00(r1, r2, r0)     // Catch:{ SecurityException -> 0x020c, Exception -> 0x020a }
            boolean r5 = r18.isEmpty()     // Catch:{ SecurityException -> 0x020c, Exception -> 0x020a }
            if (r5 != 0) goto L_0x00c0
            java.util.Iterator r6 = r18.iterator()     // Catch:{ SecurityException -> 0x020c, Exception -> 0x020a }
        L_0x00a0:
            boolean r5 = r6.hasNext()     // Catch:{ SecurityException -> 0x020c, Exception -> 0x020a }
            if (r5 == 0) goto L_0x00c0
            java.lang.String r26 = X.C18220wO.A0t(r6)     // Catch:{ SecurityException -> 0x020c, Exception -> 0x020a }
            X.29w r23 = X.C320229w.REPLICATED_STORAGE_INIT_APP_REMOVE_START     // Catch:{ SecurityException -> 0x020c, Exception -> 0x020a }
            java.lang.Integer r24 = X.AnonymousClass006.A00     // Catch:{ SecurityException -> 0x020c, Exception -> 0x020a }
            java.lang.String r29 = X.C18210wN.A0g(r1, r3)     // Catch:{ SecurityException -> 0x020c, Exception -> 0x020a }
            r27 = r21
            r28 = r21
            r30 = r13
            r31 = r3
            r32 = r0
            X.AnonymousClass3ZN.A01(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)     // Catch:{ SecurityException -> 0x020c, Exception -> 0x020a }
            goto L_0x00a0
        L_0x00c0:
            r3 = r17
            java.lang.String r7 = r3.A01     // Catch:{ SecurityException -> 0x020c, Exception -> 0x020a }
            android.net.Uri r6 = X.C15430rJ.A01(r7)     // Catch:{ SecurityException -> 0x020c, Exception -> 0x020a }
            r5 = r19
            r3 = r22
            android.content.ContentProviderClient r8 = r5.A03(r3, r6)     // Catch:{ SecurityException -> 0x020c, Exception -> 0x020a }
            if (r8 == 0) goto L_0x01f8
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0v()     // Catch:{ SecurityException -> 0x020c, Exception -> 0x020a }
            java.util.Iterator r5 = r39.iterator()     // Catch:{ SecurityException -> 0x020c, Exception -> 0x020a }
        L_0x00da:
            boolean r3 = r5.hasNext()     // Catch:{ SecurityException -> 0x020c, Exception -> 0x020a }
            if (r3 == 0) goto L_0x00ec
            java.lang.Object r3 = r5.next()     // Catch:{ SecurityException -> 0x020c, Exception -> 0x020a }
            X.3Sl r3 = (X.C61243Sl) r3     // Catch:{ SecurityException -> 0x020c, Exception -> 0x020a }
            X.24G r3 = r3.A02     // Catch:{ SecurityException -> 0x020c, Exception -> 0x020a }
            X.C18210wN.A1O(r3, r6)     // Catch:{ SecurityException -> 0x020c, Exception -> 0x020a }
            goto L_0x00da
        L_0x00ec:
            java.lang.String r3 = r17.name()     // Catch:{ UnsupportedOperationException -> 0x0179, RemoteException -> 0x0177, JSONException -> 0x016f }
            java.util.Map r5 = X.AnonymousClass3ZN.A00(r1, r2, r0)     // Catch:{ UnsupportedOperationException -> 0x0179, RemoteException -> 0x0177, JSONException -> 0x016f }
            boolean r9 = r6.isEmpty()     // Catch:{ UnsupportedOperationException -> 0x0179, RemoteException -> 0x0177, JSONException -> 0x016f }
            if (r9 != 0) goto L_0x0120
            java.util.Iterator r10 = r6.iterator()     // Catch:{ UnsupportedOperationException -> 0x0179, RemoteException -> 0x0177, JSONException -> 0x016f }
        L_0x00fe:
            boolean r9 = r10.hasNext()     // Catch:{ UnsupportedOperationException -> 0x0179, RemoteException -> 0x0177, JSONException -> 0x016f }
            if (r9 == 0) goto L_0x0120
            java.lang.String r26 = X.C18220wO.A0t(r10)     // Catch:{ UnsupportedOperationException -> 0x0179, RemoteException -> 0x0177, JSONException -> 0x016f }
            X.29w r23 = X.C320229w.REPLICATED_STORAGE_INIT_APP_REMOVE_SENT     // Catch:{ UnsupportedOperationException -> 0x0179, RemoteException -> 0x0177, JSONException -> 0x016f }
            java.lang.Integer r24 = X.AnonymousClass006.A00     // Catch:{ UnsupportedOperationException -> 0x0179, RemoteException -> 0x0177, JSONException -> 0x016f }
            java.lang.String r29 = X.C18210wN.A0g(r1, r5)     // Catch:{ UnsupportedOperationException -> 0x0179, RemoteException -> 0x0177, JSONException -> 0x016f }
            r25 = r3
            r27 = r21
            r28 = r21
            r30 = r13
            r31 = r5
            r32 = r0
            X.AnonymousClass3ZN.A01(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)     // Catch:{ UnsupportedOperationException -> 0x0179, RemoteException -> 0x0177, JSONException -> 0x016f }
            goto L_0x00fe
        L_0x0120:
            android.net.Uri r12 = X.C15430rJ.A01(r7)     // Catch:{ UnsupportedOperationException -> 0x0179, RemoteException -> 0x0177, JSONException -> 0x016f }
            org.json.JSONArray r11 = X.C18250wR.A0i()     // Catch:{ UnsupportedOperationException -> 0x0179, RemoteException -> 0x0177, JSONException -> 0x016f }
            java.util.Iterator r16 = r39.iterator()     // Catch:{ UnsupportedOperationException -> 0x0179, RemoteException -> 0x0177, JSONException -> 0x016f }
        L_0x012c:
            boolean r5 = r16.hasNext()     // Catch:{ UnsupportedOperationException -> 0x0179, RemoteException -> 0x0177, JSONException -> 0x016f }
            if (r5 == 0) goto L_0x0155
            java.lang.Object r10 = r16.next()     // Catch:{ UnsupportedOperationException -> 0x0179, RemoteException -> 0x0177, JSONException -> 0x016f }
            X.3Sl r10 = (X.C61243Sl) r10     // Catch:{ UnsupportedOperationException -> 0x0179, RemoteException -> 0x0177, JSONException -> 0x016f }
            org.json.JSONObject r9 = X.C18230wP.A0y()     // Catch:{ UnsupportedOperationException -> 0x0179, RemoteException -> 0x0177, JSONException -> 0x016f }
            X.24m r7 = r10.A01     // Catch:{ UnsupportedOperationException -> 0x0179, RemoteException -> 0x0177, JSONException -> 0x016f }
            java.lang.String r5 = "app_source"
            r9.put(r5, r7)     // Catch:{ UnsupportedOperationException -> 0x0179, RemoteException -> 0x0177, JSONException -> 0x016f }
            X.24G r7 = r10.A02     // Catch:{ UnsupportedOperationException -> 0x0179, RemoteException -> 0x0177, JSONException -> 0x016f }
            java.lang.String r5 = "credential_source"
            r9.put(r5, r7)     // Catch:{ UnsupportedOperationException -> 0x0179, RemoteException -> 0x0177, JSONException -> 0x016f }
            java.lang.String r5 = "target_user_id"
            java.lang.String r7 = r10.A00     // Catch:{ UnsupportedOperationException -> 0x0179, RemoteException -> 0x0177, JSONException -> 0x016f }
            r9.put(r5, r7)     // Catch:{ UnsupportedOperationException -> 0x0179, RemoteException -> 0x0177, JSONException -> 0x016f }
            r11.put(r9)     // Catch:{ UnsupportedOperationException -> 0x0179, RemoteException -> 0x0177, JSONException -> 0x016f }
            goto L_0x012c
        L_0x0155:
            java.lang.String r7 = r11.toString()     // Catch:{ UnsupportedOperationException -> 0x0179, RemoteException -> 0x0177, JSONException -> 0x016f }
            if (r7 != 0) goto L_0x015d
            java.lang.String r7 = ""
        L_0x015d:
            java.lang.String[] r5 = new java.lang.String[]{r2, r13}     // Catch:{ UnsupportedOperationException -> 0x0179, RemoteException -> 0x0177, JSONException -> 0x016f }
            int r7 = r8.delete(r12, r7, r5)     // Catch:{ UnsupportedOperationException -> 0x0179, RemoteException -> 0x0177, JSONException -> 0x016f }
            if (r7 != r14) goto L_0x0196
            java.util.Map r5 = X.AnonymousClass3ZN.A00(r1, r2, r0)     // Catch:{ UnsupportedOperationException -> 0x017a, RemoteException -> 0x0181, JSONException -> 0x0170 }
            r0.A0F(r3, r13, r6, r5)     // Catch:{ UnsupportedOperationException -> 0x017a, RemoteException -> 0x0181, JSONException -> 0x0170 }
            goto L_0x0196
        L_0x016f:
            r7 = 0
        L_0x0170:
            java.lang.String r3 = r17.name()     // Catch:{ SecurityException -> 0x020c, Exception -> 0x020a }
            java.lang.Integer r24 = X.AnonymousClass006.A0C     // Catch:{ SecurityException -> 0x020c, Exception -> 0x020a }
            goto L_0x0187
        L_0x0177:
            r7 = 0
            goto L_0x0181
        L_0x0179:
            r7 = 0
        L_0x017a:
            java.lang.String r3 = r17.name()     // Catch:{ SecurityException -> 0x020c, Exception -> 0x020a }
            java.lang.Integer r24 = X.AnonymousClass006.A02     // Catch:{ SecurityException -> 0x020c, Exception -> 0x020a }
            goto L_0x0187
        L_0x0181:
            java.lang.String r3 = r17.name()     // Catch:{ SecurityException -> 0x020c, Exception -> 0x020a }
            java.lang.Integer r24 = X.AnonymousClass006.A1C     // Catch:{ SecurityException -> 0x020c, Exception -> 0x020a }
        L_0x0187:
            java.util.Map r28 = X.AnonymousClass3ZN.A00(r1, r2, r0)     // Catch:{ SecurityException -> 0x020c, Exception -> 0x020a }
            r23 = r0
            r25 = r3
            r26 = r13
            r27 = r6
            r23.A07(r24, r25, r26, r27, r28)     // Catch:{ SecurityException -> 0x020c, Exception -> 0x020a }
        L_0x0196:
            r15[r4] = r7     // Catch:{ SecurityException -> 0x020c, Exception -> 0x020a }
            r6 = r15[r4]     // Catch:{ SecurityException -> 0x020c, Exception -> 0x020a }
            r5 = -3
            if (r6 == r5) goto L_0x01e9
            r5 = -1
            if (r6 == r5) goto L_0x01da
            if (r6 == 0) goto L_0x01cb
            if (r6 == r14) goto L_0x01c1
            java.lang.Integer r6 = X.AnonymousClass006.A05     // Catch:{ SecurityException -> 0x020c, Exception -> 0x020a }
            r5 = r15[r4]     // Catch:{ SecurityException -> 0x020c, Exception -> 0x020a }
            java.lang.String r34 = java.lang.String.valueOf(r5)     // Catch:{ SecurityException -> 0x020c, Exception -> 0x020a }
            r35 = r1
            r36 = r2
            java.lang.String[] r5 = new java.lang.String[]{r33, r34, r35, r36, r37, r38}     // Catch:{ SecurityException -> 0x020c, Exception -> 0x020a }
            java.util.Map r10 = r0.A02(r5)     // Catch:{ SecurityException -> 0x020c, Exception -> 0x020a }
            r5 = r0
            r7 = r3
            r8 = r13
            r9 = r18
            r5.A07(r6, r7, r8, r9, r10)     // Catch:{ SecurityException -> 0x020c, Exception -> 0x0217 }
            goto L_0x0235
        L_0x01c1:
            java.util.Map r6 = X.AnonymousClass3ZN.A00(r1, r2, r0)     // Catch:{ SecurityException -> 0x020c, Exception -> 0x0217 }
            r5 = r18
            r0.A0F(r3, r13, r5, r6)     // Catch:{ SecurityException -> 0x020c, Exception -> 0x0217 }
            goto L_0x0235
        L_0x01cb:
            java.lang.Integer r6 = X.AnonymousClass006.A0j     // Catch:{ SecurityException -> 0x020c, Exception -> 0x0217 }
            java.util.Map r10 = X.AnonymousClass3ZN.A00(r1, r2, r0)     // Catch:{ SecurityException -> 0x020c, Exception -> 0x0217 }
            r5 = r0
            r7 = r3
            r8 = r13
            r9 = r18
            r5.A07(r6, r7, r8, r9, r10)     // Catch:{ SecurityException -> 0x020c, Exception -> 0x0217 }
            goto L_0x0235
        L_0x01da:
            java.lang.Integer r6 = X.AnonymousClass006.A0C     // Catch:{ SecurityException -> 0x020c, Exception -> 0x0217 }
            java.util.Map r10 = X.AnonymousClass3ZN.A00(r1, r2, r0)     // Catch:{ SecurityException -> 0x020c, Exception -> 0x0217 }
            r5 = r0
            r7 = r3
            r8 = r13
            r9 = r18
            r5.A07(r6, r7, r8, r9, r10)     // Catch:{ SecurityException -> 0x020c, Exception -> 0x0217 }
            goto L_0x0235
        L_0x01e9:
            java.lang.Integer r6 = X.AnonymousClass006.A01     // Catch:{ SecurityException -> 0x020c, Exception -> 0x0217 }
            java.util.Map r10 = X.AnonymousClass3ZN.A00(r1, r2, r0)     // Catch:{ SecurityException -> 0x020c, Exception -> 0x0217 }
            r5 = r0
            r7 = r3
            r8 = r13
            r9 = r18
            r5.A07(r6, r7, r8, r9, r10)     // Catch:{ SecurityException -> 0x020c, Exception -> 0x0217 }
            goto L_0x0235
        L_0x01f8:
            java.lang.String r7 = r17.name()     // Catch:{ SecurityException -> 0x020c, Exception -> 0x0217 }
            java.lang.Integer r6 = X.AnonymousClass006.A0u     // Catch:{ SecurityException -> 0x020c, Exception -> 0x0217 }
            java.util.Map r10 = X.AnonymousClass3ZN.A00(r1, r2, r0)     // Catch:{ SecurityException -> 0x020c, Exception -> 0x0217 }
            r5 = r0
            r8 = r13
            r9 = r18
            r5.A07(r6, r7, r8, r9, r10)     // Catch:{ SecurityException -> 0x020c, Exception -> 0x0217 }
            goto L_0x0235
        L_0x020a:
            r3 = move-exception
            goto L_0x0218
        L_0x020c:
            java.lang.String r7 = r17.name()
            java.lang.Integer r6 = X.AnonymousClass006.A15
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            goto L_0x022a
        L_0x0217:
            r3 = move-exception
        L_0x0218:
            java.lang.String r7 = r17.name()
            java.lang.Integer r6 = X.AnonymousClass006.A05
            java.lang.String r34 = r3.getMessage()
            r35 = r1
            r36 = r2
            java.lang.String[] r1 = new java.lang.String[]{r33, r34, r35, r36, r37, r38}
        L_0x022a:
            java.util.Map r10 = r0.A02(r1)
            r5 = r0
            r8 = r13
            r9 = r18
            r5.A07(r6, r7, r8, r9, r10)
        L_0x0235:
            int r4 = r4 + 1
            goto L_0x007f
        L_0x0239:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25221mj.run():void");
    }
}
