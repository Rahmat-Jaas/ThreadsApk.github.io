package X;

/* renamed from: X.2zw  reason: invalid class name and case insensitive filesystem */
public abstract class C54742zw {
    /* JADX WARNING: Removed duplicated region for block: B:41:0x010b A[Catch:{ JSONException -> 0x014b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List A00(java.lang.String r26, java.lang.String r27, X.AnonymousClass3ZN r28, libraries.access.src.main.sharedstorage.common.ReplicatedStorageRequest r29) {
        /*
            r6 = r29
            java.util.List r0 = r6.A00
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r2 = r0.iterator()
        L_0x0010:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r1 = r2.next()
            X.3Sl r1 = (X.C61243Sl) r1
            X.24m r0 = r1.A01
            X.C18210wN.A1O(r0, r4)
            X.24G r0 = r1.A02
            X.C18210wN.A1O(r0, r3)
            goto L_0x0010
        L_0x0027:
            java.lang.String r0 = "waterfall_id"
            r1 = r26
            r2 = r28
            java.util.Map r8 = X.AnonymousClass3ZN.A00(r0, r1, r2)
            boolean r5 = r3.isEmpty()
            r19 = r27
            if (r5 != 0) goto L_0x006f
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x006f
            java.util.Iterator r9 = r4.iterator()
        L_0x0043:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L_0x006f
            java.lang.String r14 = X.C18220wO.A0t(r9)
            java.util.Iterator r7 = r3.iterator()
        L_0x0051:
            boolean r5 = r7.hasNext()
            if (r5 == 0) goto L_0x0043
            java.lang.String r15 = X.C18220wO.A0t(r7)
            X.29w r12 = X.C320229w.REPLICATED_STORAGE_TARGET_APP_FETCH_START
            java.lang.Integer r13 = X.AnonymousClass006.A00
            r16 = 0
            java.lang.String r18 = X.C18210wN.A0g(r0, r8)
            r17 = r16
            r20 = r8
            r21 = r2
            X.AnonymousClass3ZN.A01(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x0051
        L_0x006f:
            java.util.ArrayList r18 = X.AnonymousClass0wJ.A0v()
            java.util.ArrayList r12 = X.AnonymousClass0wJ.A0v()     // Catch:{ JSONException -> 0x014b }
            X.4nE r5 = new X.4nE     // Catch:{ JSONException -> 0x014b }
            r5.<init>()     // Catch:{ JSONException -> 0x014b }
            r5.A00(r12, r6)     // Catch:{ JSONException -> 0x014b }
            java.util.ArrayList r11 = X.AnonymousClass0wJ.A0v()     // Catch:{ JSONException -> 0x014b }
            java.util.ArrayList r10 = X.AnonymousClass0wJ.A0v()     // Catch:{ JSONException -> 0x014b }
            java.util.Iterator r7 = r12.iterator()     // Catch:{ JSONException -> 0x014b }
        L_0x008b:
            boolean r5 = r7.hasNext()     // Catch:{ JSONException -> 0x014b }
            if (r5 == 0) goto L_0x00a2
            java.lang.Object r6 = r7.next()     // Catch:{ JSONException -> 0x014b }
            X.3HZ r6 = (X.AnonymousClass3HZ) r6     // Catch:{ JSONException -> 0x014b }
            X.24m r5 = r6.A04     // Catch:{ JSONException -> 0x014b }
            X.C18210wN.A1O(r5, r11)     // Catch:{ JSONException -> 0x014b }
            X.24G r5 = r6.A05     // Catch:{ JSONException -> 0x014b }
            X.C18210wN.A1O(r5, r10)     // Catch:{ JSONException -> 0x014b }
            goto L_0x008b
        L_0x00a2:
            long r16 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x014b }
            boolean r5 = r12.isEmpty()     // Catch:{ JSONException -> 0x014b }
            if (r5 == 0) goto L_0x00be
            java.lang.Integer r21 = X.AnonymousClass006.A0N     // Catch:{ JSONException -> 0x014b }
        L_0x00ae:
            java.util.Map r25 = X.AnonymousClass3ZN.A00(r0, r1, r2)     // Catch:{ JSONException -> 0x014b }
            r20 = r2
            r22 = r19
            r23 = r11
            r24 = r10
            r20.A0A(r21, r22, r23, r24, r25)     // Catch:{ JSONException -> 0x014b }
            goto L_0x0100
        L_0x00be:
            java.util.ArrayList r14 = X.AnonymousClass0wJ.A0v()     // Catch:{ JSONException -> 0x014b }
            java.util.Iterator r15 = r12.iterator()     // Catch:{ JSONException -> 0x014b }
        L_0x00c6:
            boolean r5 = r15.hasNext()     // Catch:{ JSONException -> 0x014b }
            if (r5 == 0) goto L_0x00f7
            java.lang.Object r13 = r15.next()     // Catch:{ JSONException -> 0x014b }
            X.3HZ r13 = (X.AnonymousClass3HZ) r13     // Catch:{ JSONException -> 0x014b }
            java.lang.String r8 = java.lang.String.valueOf(r16)     // Catch:{ JSONException -> 0x014b }
            java.util.Map r7 = r13.A03     // Catch:{ JSONException -> 0x014b }
            java.lang.String r6 = "last_access_timestamp"
            java.lang.Object r5 = r7.get(r6)     // Catch:{ JSONException -> 0x014b }
            if (r5 == 0) goto L_0x00e4
            java.lang.String r8 = X.C18220wO.A0r(r6, r7)     // Catch:{ JSONException -> 0x014b }
        L_0x00e4:
            long r5 = java.lang.Long.parseLong(r8)     // Catch:{ JSONException -> 0x014b }
            long r8 = r16 - r5
            r6 = 7344000000(0x1b5bc8c00, double:3.628418103E-314)
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x00c6
            r14.add(r13)     // Catch:{ JSONException -> 0x014b }
            goto L_0x00c6
        L_0x00f7:
            boolean r5 = r14.isEmpty()     // Catch:{ JSONException -> 0x014b }
            if (r5 == 0) goto L_0x0103
            java.lang.Integer r21 = X.AnonymousClass006.A00     // Catch:{ JSONException -> 0x014b }
            goto L_0x00ae
        L_0x0100:
            r18 = r12
            goto L_0x0105
        L_0x0103:
            r18 = r14
        L_0x0105:
            boolean r5 = r18.isEmpty()     // Catch:{ JSONException -> 0x014b }
            if (r5 != 0) goto L_0x0159
            java.util.Map r8 = X.AnonymousClass3ZN.A00(r0, r1, r2)     // Catch:{ JSONException -> 0x014b }
            boolean r5 = r3.isEmpty()     // Catch:{ JSONException -> 0x014b }
            if (r5 != 0) goto L_0x0159
            boolean r5 = r4.isEmpty()     // Catch:{ JSONException -> 0x014b }
            if (r5 != 0) goto L_0x0159
            java.util.Iterator r7 = r4.iterator()     // Catch:{ JSONException -> 0x014b }
        L_0x011f:
            boolean r5 = r7.hasNext()     // Catch:{ JSONException -> 0x014b }
            if (r5 == 0) goto L_0x0159
            java.lang.String r22 = X.C18220wO.A0t(r7)     // Catch:{ JSONException -> 0x014b }
            java.util.Iterator r6 = r3.iterator()     // Catch:{ JSONException -> 0x014b }
        L_0x012d:
            boolean r5 = r6.hasNext()     // Catch:{ JSONException -> 0x014b }
            if (r5 == 0) goto L_0x011f
            java.lang.String r23 = X.C18220wO.A0t(r6)     // Catch:{ JSONException -> 0x014b }
            X.29w r20 = X.C320229w.REPLICATED_STORAGE_TARGET_APP_FETCH_SUCCESS     // Catch:{ JSONException -> 0x014b }
            java.lang.Integer r21 = X.AnonymousClass006.A00     // Catch:{ JSONException -> 0x014b }
            r24 = 0
            java.lang.String r26 = X.C18210wN.A0g(r0, r8)     // Catch:{ JSONException -> 0x014b }
            r25 = r24
            r28 = r8
            r29 = r2
            X.AnonymousClass3ZN.A01(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ JSONException -> 0x014b }
            goto L_0x012d
        L_0x014b:
            java.lang.Integer r6 = X.AnonymousClass006.A0C
            java.util.Map r10 = X.AnonymousClass3ZN.A00(r0, r1, r2)
            r5 = r2
            r7 = r19
            r8 = r4
            r9 = r3
            r5.A0A(r6, r7, r8, r9, r10)
        L_0x0159:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54742zw.A00(java.lang.String, java.lang.String, X.3ZN, libraries.access.src.main.sharedstorage.common.ReplicatedStorageRequest):java.util.List");
    }
}
