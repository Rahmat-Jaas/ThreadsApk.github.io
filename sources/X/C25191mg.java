package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.1mg  reason: invalid class name and case insensitive filesystem */
public final class C25191mg extends AnonymousClass0gG {
    public final /* synthetic */ AnonymousClass3YQ A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ AnonymousClass224[] A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25191mg(AnonymousClass3YQ r2, UserSession userSession, String str, AnonymousClass224[] r5) {
        super(583345440);
        this.A01 = userSession;
        this.A00 = r2;
        this.A02 = str;
        this.A03 = r5;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x0205 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:70:0x020f */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0306 A[Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x022a A[Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0257 A[Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r42 = this;
            X.0Ok r0 = X.C06810aP.A01
            r14 = r42
            com.instagram.service.session.UserSession r4 = r14.A01
            com.instagram.user.model.User r9 = r0.A01(r4)
            android.content.Context r26 = X.C10600ic.A00
            if (r26 == 0) goto L_0x0397
            r4.getUserId()
            X.4nC r3 = new X.4nC
            r3.<init>(r4)
            r25 = 2
            java.lang.String r1 = "AuthHeaderPrefs"
            r0 = r26
            X.7M8 r2 = X.AnonymousClass3SL.A00(r0, r1)     // Catch:{ NullPointerException -> 0x035e }
            java.lang.String r1 = r4.getUserId()     // Catch:{ NullPointerException -> 0x035e }
            java.lang.String r0 = ""
            java.lang.String r17 = r2.getString(r1, r0)     // Catch:{ NullPointerException -> 0x035e }
            if (r17 == 0) goto L_0x0397
            java.lang.String r0 = r14.A02     // Catch:{ NullPointerException -> 0x035e }
            r41 = r0
            X.224[] r6 = r14.A03     // Catch:{ NullPointerException -> 0x035e }
            int r5 = r6.length     // Catch:{ NullPointerException -> 0x035e }
            java.util.ArrayList r2 = X.C18240wQ.A0k(r5)     // Catch:{ NullPointerException -> 0x035e }
            r1 = 0
        L_0x0038:
            if (r1 >= r5) goto L_0x007d
            r7 = r6[r1]     // Catch:{ NullPointerException -> 0x035e }
            java.lang.String r16 = r4.getUserId()     // Catch:{ NullPointerException -> 0x035e }
            java.lang.String r18 = "INSTAGRAM"
            X.24m r20 = X.C311624m.INSTAGRAM     // Catch:{ NullPointerException -> 0x035e }
            boolean r0 = r7 instanceof X.C26591qt     // Catch:{ NullPointerException -> 0x035e }
            if (r0 == 0) goto L_0x0070
            X.24G r21 = X.AnonymousClass24G.SAVED_ACCOUNTS     // Catch:{ NullPointerException -> 0x035e }
        L_0x004a:
            java.lang.String r7 = "user_name"
            java.lang.String r0 = r9.Ak1()     // Catch:{ NullPointerException -> 0x035e }
            kotlin.Pair r8 = X.C18180wK.A0p(r7, r0)     // Catch:{ NullPointerException -> 0x035e }
            java.lang.String r7 = "profile_photo_url"
            java.lang.String r0 = X.C18250wR.A0a(r9)     // Catch:{ NullPointerException -> 0x035e }
            kotlin.Pair r0 = X.C18180wK.A0p(r7, r0)     // Catch:{ NullPointerException -> 0x035e }
            kotlin.Pair[] r0 = new kotlin.Pair[]{r8, r0}     // Catch:{ NullPointerException -> 0x035e }
            java.util.Map r19 = X.AnonymousClass4WJ.A0I(r0)     // Catch:{ NullPointerException -> 0x035e }
            X.3HZ r0 = new X.3HZ     // Catch:{ NullPointerException -> 0x035e }
            r15 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21)     // Catch:{ NullPointerException -> 0x035e }
            r2.add(r0)     // Catch:{ NullPointerException -> 0x035e }
            goto L_0x007a
        L_0x0070:
            boolean r0 = r7 instanceof X.C26581qs     // Catch:{ NullPointerException -> 0x035e }
            if (r0 == 0) goto L_0x0077
            X.24G r21 = X.AnonymousClass24G.INACTIVE_LOGGED_IN_ACCOUNTS     // Catch:{ NullPointerException -> 0x035e }
            goto L_0x004a
        L_0x0077:
            X.24G r21 = X.AnonymousClass24G.ACTIVE_ACCOUNT     // Catch:{ NullPointerException -> 0x035e }
            goto L_0x004a
        L_0x007a:
            int r1 = r1 + 1
            goto L_0x0038
        L_0x007d:
            r0 = 0
            X.3HZ[] r0 = new X.AnonymousClass3HZ[r0]     // Catch:{ NullPointerException -> 0x035e }
            java.lang.Object[] r1 = r2.toArray(r0)     // Catch:{ NullPointerException -> 0x035e }
            X.3HZ[] r1 = (X.AnonymousClass3HZ[]) r1     // Catch:{ NullPointerException -> 0x035e }
            int r0 = r1.length     // Catch:{ NullPointerException -> 0x035e }
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r1, r0)     // Catch:{ NullPointerException -> 0x035e }
            X.3HZ[] r2 = (X.AnonymousClass3HZ[]) r2     // Catch:{ NullPointerException -> 0x035e }
            r1 = r25
            r0 = r41
            X.C18180wK.A1P(r0, r1, r2)     // Catch:{ NullPointerException -> 0x035e }
            java.lang.String r0 = "3.0"
            r3.A00 = r0     // Catch:{ NullPointerException -> 0x035e }
            java.util.UUID r0 = X.C03480Iw.A00()     // Catch:{ NullPointerException -> 0x035e }
            java.lang.String r1 = X.C18190wL.A0n(r0)     // Catch:{ NullPointerException -> 0x035e }
            X.258[] r9 = X.C18180wK.A1b()     // Catch:{ NullPointerException -> 0x035e }
            int r0 = r2.length     // Catch:{ NullPointerException -> 0x035e }
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)     // Catch:{ NullPointerException -> 0x035e }
            X.3HZ[] r2 = (X.AnonymousClass3HZ[]) r2     // Catch:{ NullPointerException -> 0x035e }
            r0 = 4
            X.C04220Ms.A0B(r2, r0)     // Catch:{ NullPointerException -> 0x035e }
            int r0 = r9.length     // Catch:{ NullPointerException -> 0x035e }
            r40 = r0
            int[] r0 = new int[r0]     // Catch:{ NullPointerException -> 0x035e }
            r24 = r0
            X.0rs r23 = X.C54752zx.A00()     // Catch:{ NullPointerException -> 0x035e }
            int r0 = r2.length     // Catch:{ NullPointerException -> 0x035e }
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r2, r0)     // Catch:{ NullPointerException -> 0x035e }
            X.3HZ[] r6 = (X.AnonymousClass3HZ[]) r6     // Catch:{ NullPointerException -> 0x035e }
            java.util.ArrayList r22 = X.AnonymousClass0wJ.A0v()     // Catch:{ NullPointerException -> 0x035e }
            int r0 = r6.length     // Catch:{ NullPointerException -> 0x035e }
            r39 = r0
            r4 = 0
        L_0x00c9:
            r0 = r39
            if (r4 >= r0) goto L_0x00d9
            r0 = r6[r4]     // Catch:{ NullPointerException -> 0x035e }
            X.24G r2 = r0.A05     // Catch:{ NullPointerException -> 0x035e }
            r0 = r22
            X.C18210wN.A1O(r2, r0)     // Catch:{ NullPointerException -> 0x035e }
            int r4 = r4 + 1
            goto L_0x00c9
        L_0x00d9:
            r4 = 0
        L_0x00da:
            r0 = r40
            if (r4 >= r0) goto L_0x0397
            r21 = r9[r4]     // Catch:{ NullPointerException -> 0x035e }
            java.lang.String r38 = "2.0"
            java.lang.String r37 = "replicated_storage"
            java.lang.String r20 = "errors"
            java.lang.String r0 = "waterfall_id"
            r5 = 1
            java.lang.String r7 = r21.name()     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            java.util.Map r35 = X.AnonymousClass3ZN.A00(r0, r1, r3)     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            boolean r2 = r22.isEmpty()     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            if (r2 != 0) goto L_0x012d
            java.util.Iterator r12 = r22.iterator()     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
        L_0x00fb:
            boolean r2 = r12.hasNext()     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            if (r2 == 0) goto L_0x012d
            java.lang.String r2 = X.C18180wK.A0k(r12)     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            X.29w r27 = X.C320229w.WRITE_START     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            java.lang.Integer r28 = X.AnonymousClass006.A00     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            r31 = 0
            r29 = r7
            r30 = r2
            r32 = r31
            r33 = r31
            r34 = r41
            r36 = r3
            X.AnonymousClass3ZN.A01(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            X.3Eh r8 = r3.A03()     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            if (r8 == 0) goto L_0x00fb
            X.3Eh r11 = r3.A03()     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            r10 = 857814589(0x3321363d, float:3.7535063E-8)
            r8 = r41
            r11.A00(r10, r7, r2, r8)     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            goto L_0x00fb
        L_0x012d:
            r2 = r9[r4]     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            java.lang.String r2 = r2.A01     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            r19 = 0
            android.net.Uri r8 = X.C15430rJ.A01(r2)     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            r7 = r23
            r2 = r26
            android.content.ContentProviderClient r8 = r7.A03(r2, r8)     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            if (r8 == 0) goto L_0x031a
            r15 = r9[r4]     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            java.util.ArrayList r18 = X.AnonymousClass0wJ.A0v()     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ UnsupportedOperationException -> 0x020e, RemoteException -> 0x020c, JSONException -> 0x0204, Exception -> 0x01f1 }
            r7.<init>()     // Catch:{ UnsupportedOperationException -> 0x020e, RemoteException -> 0x020c, JSONException -> 0x0204, Exception -> 0x01f1 }
            r13 = 0
        L_0x014d:
            r2 = r39
            if (r13 >= r2) goto L_0x017b
            r12 = r6[r13]     // Catch:{ UnsupportedOperationException -> 0x020e, RemoteException -> 0x020c, JSONException -> 0x0204, Exception -> 0x01f1 }
            java.util.Map r11 = r12.A03     // Catch:{ UnsupportedOperationException -> 0x020e, RemoteException -> 0x020c, JSONException -> 0x0204, Exception -> 0x01f1 }
            java.lang.String r10 = "last_access_timestamp"
            long r16 = java.lang.System.currentTimeMillis()     // Catch:{ UnsupportedOperationException -> 0x020e, RemoteException -> 0x020c, JSONException -> 0x0204, Exception -> 0x01f1 }
            java.lang.String r2 = java.lang.String.valueOf(r16)     // Catch:{ UnsupportedOperationException -> 0x020e, RemoteException -> 0x020c, JSONException -> 0x0204, Exception -> 0x01f1 }
            r11.put(r10, r2)     // Catch:{ UnsupportedOperationException -> 0x020e, RemoteException -> 0x020c, JSONException -> 0x0204, Exception -> 0x01f1 }
            X.24G r11 = r12.A05     // Catch:{ UnsupportedOperationException -> 0x020e, RemoteException -> 0x020c, JSONException -> 0x0204, Exception -> 0x01f1 }
            java.lang.String r10 = r11.A00     // Catch:{ UnsupportedOperationException -> 0x020e, RemoteException -> 0x020c, JSONException -> 0x0204, Exception -> 0x01f1 }
            java.lang.String r2 = r12.A02     // Catch:{ UnsupportedOperationException -> 0x020e, RemoteException -> 0x020c, JSONException -> 0x0204, Exception -> 0x01f1 }
            java.lang.String r2 = X.AnonymousClass00U.A0L(r10, r2)     // Catch:{ UnsupportedOperationException -> 0x020e, RemoteException -> 0x020c, JSONException -> 0x0204, Exception -> 0x01f1 }
            java.lang.String r10 = X.AnonymousClass3Q2.A00(r12)     // Catch:{ UnsupportedOperationException -> 0x020e, RemoteException -> 0x020c, JSONException -> 0x0204, Exception -> 0x01f1 }
            r7.put(r2, r10)     // Catch:{ UnsupportedOperationException -> 0x020e, RemoteException -> 0x020c, JSONException -> 0x0204, Exception -> 0x01f1 }
            r2 = r18
            X.C18210wN.A1O(r11, r2)     // Catch:{ UnsupportedOperationException -> 0x020e, RemoteException -> 0x020c, JSONException -> 0x0204, Exception -> 0x01f1 }
            int r13 = r13 + 1
            goto L_0x014d
        L_0x017b:
            java.lang.String r29 = r15.name()     // Catch:{ UnsupportedOperationException -> 0x020e, RemoteException -> 0x020c, JSONException -> 0x0204, Exception -> 0x01f1 }
            java.util.Map r2 = X.AnonymousClass3ZN.A00(r0, r1, r3)     // Catch:{ UnsupportedOperationException -> 0x020e, RemoteException -> 0x020c, JSONException -> 0x0204, Exception -> 0x01f1 }
            boolean r10 = r18.isEmpty()     // Catch:{ UnsupportedOperationException -> 0x020e, RemoteException -> 0x020c, JSONException -> 0x0204, Exception -> 0x01f1 }
            if (r10 != 0) goto L_0x01ad
            java.util.Iterator r11 = r18.iterator()     // Catch:{ UnsupportedOperationException -> 0x020e, RemoteException -> 0x020c, JSONException -> 0x0204, Exception -> 0x01f1 }
        L_0x018d:
            boolean r10 = r11.hasNext()     // Catch:{ UnsupportedOperationException -> 0x020e, RemoteException -> 0x020c, JSONException -> 0x0204, Exception -> 0x01f1 }
            if (r10 == 0) goto L_0x01ad
            java.lang.String r30 = X.C18220wO.A0t(r11)     // Catch:{ UnsupportedOperationException -> 0x020e, RemoteException -> 0x020c, JSONException -> 0x0204, Exception -> 0x01f1 }
            X.29w r27 = X.C320229w.REPLICATED_STORAGE_INIT_APP_SAVE_SENT     // Catch:{ UnsupportedOperationException -> 0x020e, RemoteException -> 0x020c, JSONException -> 0x0204, Exception -> 0x01f1 }
            java.lang.Integer r28 = X.AnonymousClass006.A00     // Catch:{ UnsupportedOperationException -> 0x020e, RemoteException -> 0x020c, JSONException -> 0x0204, Exception -> 0x01f1 }
            java.lang.String r33 = X.C18210wN.A0g(r0, r2)     // Catch:{ UnsupportedOperationException -> 0x020e, RemoteException -> 0x020c, JSONException -> 0x0204, Exception -> 0x01f1 }
            r31 = r19
            r32 = r19
            r34 = r41
            r35 = r2
            r36 = r3
            X.AnonymousClass3ZN.A01(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)     // Catch:{ UnsupportedOperationException -> 0x020e, RemoteException -> 0x020c, JSONException -> 0x0204, Exception -> 0x01f1 }
            goto L_0x018d
        L_0x01ad:
            java.lang.String r2 = r15.A01     // Catch:{ UnsupportedOperationException -> 0x020e, RemoteException -> 0x020c, JSONException -> 0x0204, Exception -> 0x01f1 }
            android.net.Uri r11 = X.C15430rJ.A01(r2)     // Catch:{ UnsupportedOperationException -> 0x020e, RemoteException -> 0x020c, JSONException -> 0x0204, Exception -> 0x01f1 }
            r2 = r41
            java.lang.String[] r10 = new java.lang.String[]{r1, r2}     // Catch:{ UnsupportedOperationException -> 0x020e, RemoteException -> 0x020c, JSONException -> 0x0204, Exception -> 0x01f1 }
            r2 = r19
            int r2 = r8.update(r11, r7, r2, r10)     // Catch:{ UnsupportedOperationException -> 0x020e, RemoteException -> 0x020c, JSONException -> 0x0204, Exception -> 0x01f1 }
            if (r2 != r5) goto L_0x0250
            java.util.Map r7 = X.AnonymousClass3ZN.A00(r0, r1, r3)     // Catch:{ UnsupportedOperationException -> 0x020f, RemoteException -> 0x0216, JSONException -> 0x0205, Exception -> 0x01ef }
            boolean r8 = r18.isEmpty()     // Catch:{ UnsupportedOperationException -> 0x020f, RemoteException -> 0x0216, JSONException -> 0x0205, Exception -> 0x01ef }
            if (r8 != 0) goto L_0x0250
            java.util.Iterator r10 = r18.iterator()     // Catch:{ UnsupportedOperationException -> 0x020f, RemoteException -> 0x0216, JSONException -> 0x0205, Exception -> 0x01ef }
        L_0x01cf:
            boolean r8 = r10.hasNext()     // Catch:{ UnsupportedOperationException -> 0x020f, RemoteException -> 0x0216, JSONException -> 0x0205, Exception -> 0x01ef }
            if (r8 == 0) goto L_0x0250
            java.lang.String r30 = X.C18220wO.A0t(r10)     // Catch:{ UnsupportedOperationException -> 0x020f, RemoteException -> 0x0216, JSONException -> 0x0205, Exception -> 0x01ef }
            X.29w r27 = X.C320229w.REPLICATED_STORAGE_INIT_APP_SAVE_SUCCESS     // Catch:{ UnsupportedOperationException -> 0x020f, RemoteException -> 0x0216, JSONException -> 0x0205, Exception -> 0x01ef }
            java.lang.Integer r28 = X.AnonymousClass006.A00     // Catch:{ UnsupportedOperationException -> 0x020f, RemoteException -> 0x0216, JSONException -> 0x0205, Exception -> 0x01ef }
            java.lang.String r33 = X.C18210wN.A0g(r0, r7)     // Catch:{ UnsupportedOperationException -> 0x020f, RemoteException -> 0x0216, JSONException -> 0x0205, Exception -> 0x01ef }
            r31 = r19
            r32 = r19
            r34 = r41
            r35 = r7
            r36 = r3
            X.AnonymousClass3ZN.A01(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)     // Catch:{ UnsupportedOperationException -> 0x020f, RemoteException -> 0x0216, JSONException -> 0x0205, Exception -> 0x01ef }
            goto L_0x01cf
        L_0x01ef:
            r7 = move-exception
            goto L_0x01f3
        L_0x01f1:
            r7 = move-exception
            r2 = 0
        L_0x01f3:
            java.lang.String r29 = r15.name()     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            java.lang.Integer r11 = X.AnonymousClass006.A05     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            java.lang.String r8 = r7.getMessage()     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            r7 = r20
            java.lang.String[] r7 = new java.lang.String[]{r7, r8, r0, r1}     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            goto L_0x0220
        L_0x0204:
            r2 = 0
        L_0x0205:
            java.lang.String r29 = r15.name()     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            java.lang.Integer r11 = X.AnonymousClass006.A0C     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            goto L_0x021c
        L_0x020c:
            r2 = 0
            goto L_0x0216
        L_0x020e:
            r2 = 0
        L_0x020f:
            java.lang.String r29 = r15.name()     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            java.lang.Integer r11 = X.AnonymousClass006.A02     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            goto L_0x021c
        L_0x0216:
            java.lang.String r29 = r15.name()     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            java.lang.Integer r11 = X.AnonymousClass006.A1C     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
        L_0x021c:
            java.lang.String[] r7 = new java.lang.String[]{r0, r1}     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
        L_0x0220:
            java.util.Map r7 = r3.A02(r7)     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            boolean r8 = r18.isEmpty()     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            if (r8 != 0) goto L_0x0250
            java.util.Iterator r10 = r18.iterator()     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
        L_0x022e:
            boolean r8 = r10.hasNext()     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            if (r8 == 0) goto L_0x0250
            java.lang.String r30 = X.C18220wO.A0t(r10)     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            X.29w r27 = X.C320229w.REPLICATED_STORAGE_INIT_APP_SAVE_FAILURE     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            java.lang.Integer r28 = X.AnonymousClass006.A00     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            java.lang.String r32 = X.C54712zt.A00(r11)     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            java.lang.String r33 = X.C18210wN.A0g(r0, r7)     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            r31 = r19
            r34 = r41
            r35 = r7
            r36 = r3
            X.AnonymousClass3ZN.A01(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            goto L_0x022e
        L_0x0250:
            r24[r4] = r2     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            r7 = r24[r4]     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            r2 = -3
            if (r7 == r2) goto L_0x0306
            r2 = -2
            if (r7 == r2) goto L_0x02f2
            r2 = -1
            if (r7 == r2) goto L_0x02de
            if (r7 == 0) goto L_0x02ca
            if (r7 == r5) goto L_0x0286
            java.lang.String r29 = r21.name()     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            java.lang.Integer r28 = X.AnonymousClass006.A05     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            r2 = r24[r4]     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            java.lang.String r34 = java.lang.String.valueOf(r2)     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            r33 = r20
            r35 = r0
            r36 = r1
            java.lang.String[] r2 = new java.lang.String[]{r33, r34, r35, r36, r37, r38}     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            java.util.Map r32 = r3.A02(r2)     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            r27 = r3
            r30 = r41
            r31 = r22
            r27.A06(r28, r29, r30, r31, r32)     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            goto L_0x035a
        L_0x0286:
            java.lang.String r29 = r21.name()     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            java.util.Map r35 = X.AnonymousClass3ZN.A00(r0, r1, r3)     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            boolean r2 = r22.isEmpty()     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            if (r2 != 0) goto L_0x035a
            java.util.Iterator r8 = r22.iterator()     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
        L_0x0298:
            boolean r2 = r8.hasNext()     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            if (r2 == 0) goto L_0x035a
            java.lang.String r30 = X.C18220wO.A0t(r8)     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            X.29w r27 = X.C320229w.WRITE_SUCCESS     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            java.lang.Integer r28 = X.AnonymousClass006.A00     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            r31 = r19
            r32 = r19
            r33 = r19
            r34 = r41
            r36 = r3
            X.AnonymousClass3ZN.A01(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            X.3Eh r2 = r3.A03()     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            if (r2 == 0) goto L_0x0298
            X.3Eh r2 = r3.A03()     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            r7 = 857814589(0x3321363d, float:3.7535063E-8)
            com.facebook.quicklog.QuickPerformanceLogger r5 = r2.A00     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            if (r5 == 0) goto L_0x0298
            r2 = r25
            r5.markerEnd(r7, r2)     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            goto L_0x0298
        L_0x02ca:
            java.lang.String r29 = r21.name()     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            java.lang.Integer r28 = X.AnonymousClass006.A0j     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            java.util.Map r32 = X.AnonymousClass3ZN.A00(r0, r1, r3)     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            r27 = r3
            r30 = r41
            r31 = r22
            r27.A06(r28, r29, r30, r31, r32)     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            goto L_0x035a
        L_0x02de:
            java.lang.String r29 = r21.name()     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            java.lang.Integer r28 = X.AnonymousClass006.A0C     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            java.util.Map r32 = X.AnonymousClass3ZN.A00(r0, r1, r3)     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            r27 = r3
            r30 = r41
            r31 = r22
            r27.A06(r28, r29, r30, r31, r32)     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            goto L_0x035a
        L_0x02f2:
            java.lang.String r29 = r21.name()     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            java.lang.Integer r28 = X.AnonymousClass006.A0N     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            java.util.Map r32 = X.AnonymousClass3ZN.A00(r0, r1, r3)     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            r27 = r3
            r30 = r41
            r31 = r22
            r27.A06(r28, r29, r30, r31, r32)     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            goto L_0x035a
        L_0x0306:
            java.lang.String r29 = r21.name()     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            java.lang.Integer r28 = X.AnonymousClass006.A01     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            java.util.Map r32 = X.AnonymousClass3ZN.A00(r0, r1, r3)     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            r27 = r3
            r30 = r41
            r31 = r22
            r27.A06(r28, r29, r30, r31, r32)     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            goto L_0x035a
        L_0x031a:
            java.lang.String r29 = r21.name()     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            java.lang.Integer r28 = X.AnonymousClass006.A0u     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            java.util.Map r32 = X.AnonymousClass3ZN.A00(r0, r1, r3)     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            r27 = r3
            r30 = r41
            r31 = r22
            r27.A06(r28, r29, r30, r31, r32)     // Catch:{ SecurityException -> 0x0344, Exception -> 0x032e }
            goto L_0x035a
        L_0x032e:
            r2 = move-exception
            java.lang.String r17 = r21.name()     // Catch:{ NullPointerException -> 0x035e }
            java.lang.Integer r16 = X.AnonymousClass006.A05     // Catch:{ NullPointerException -> 0x035e }
            java.lang.String r34 = r2.getMessage()     // Catch:{ NullPointerException -> 0x035e }
            r33 = r20
            r35 = r0
            r36 = r1
            java.lang.String[] r0 = new java.lang.String[]{r33, r34, r35, r36, r37, r38}     // Catch:{ NullPointerException -> 0x035e }
            goto L_0x034e
        L_0x0344:
            java.lang.String r17 = r21.name()     // Catch:{ NullPointerException -> 0x035e }
            java.lang.Integer r16 = X.AnonymousClass006.A15     // Catch:{ NullPointerException -> 0x035e }
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}     // Catch:{ NullPointerException -> 0x035e }
        L_0x034e:
            java.util.Map r20 = r3.A02(r0)     // Catch:{ NullPointerException -> 0x035e }
            r15 = r3
            r18 = r41
            r19 = r22
            r15.A06(r16, r17, r18, r19, r20)     // Catch:{ NullPointerException -> 0x035e }
        L_0x035a:
            int r4 = r4 + 1
            goto L_0x00da
        L_0x035e:
            r7 = move-exception
            java.lang.String r9 = "INSTAGRAM"
            X.224[] r6 = r14.A03
            int r5 = r6.length
            java.util.ArrayList r4 = X.C18240wQ.A0k(r5)
            r2 = 0
        L_0x0369:
            if (r2 >= r5) goto L_0x0383
            r1 = r6[r2]
            boolean r0 = r1 instanceof X.C26591qt
            if (r0 == 0) goto L_0x0379
            X.24G r0 = X.AnonymousClass24G.SAVED_ACCOUNTS
        L_0x0373:
            X.C18230wP.A1O(r0, r4)
            int r2 = r2 + 1
            goto L_0x0369
        L_0x0379:
            boolean r0 = r1 instanceof X.C26581qs
            if (r0 == 0) goto L_0x0380
            X.24G r0 = X.AnonymousClass24G.INACTIVE_LOGGED_IN_ACCOUNTS
            goto L_0x0373
        L_0x0380:
            X.24G r0 = X.AnonymousClass24G.ACTIVE_ACCOUNT
            goto L_0x0373
        L_0x0383:
            java.lang.Integer r8 = X.AnonymousClass006.A05
            java.lang.String r1 = "errors"
            java.lang.String r0 = r7.getMessage()
            java.util.Map r12 = X.AnonymousClass3ZN.A00(r1, r0, r3)
            java.lang.String r0 = r14.A02
            r7 = r3
            r10 = r0
            r11 = r4
            r7.A06(r8, r9, r10, r11, r12)
        L_0x0397:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25191mg.run():void");
    }
}
