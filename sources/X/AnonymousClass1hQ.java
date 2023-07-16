package X;

import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.1hQ  reason: invalid class name */
public final class AnonymousClass1hQ extends C63873iU {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C10300i6 A02;
    public final /* synthetic */ AnonymousClass47k A03;

    public AnonymousClass1hQ(C10300i6 r1, AnonymousClass47k r2, int i, int i2) {
        this.A03 = r2;
        this.A02 = r1;
        this.A00 = i;
        this.A01 = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0140 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0171 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x018d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r20) {
        /*
            r19 = this;
            r2 = r20
            r0 = -690245403(0xffffffffd6dbb0e5, float:-1.20776401E14)
            int r6 = X.C14030oh.A03(r0)
            X.1Tc r2 = (X.C22031Tc) r2
            r0 = -742844693(0xffffffffd3b916eb, float:-1.5899069E12)
            int r5 = X.C14030oh.A03(r0)
            r7 = r19
            super.onSuccess(r2)
            java.lang.String r1 = r2.A04
            if (r1 == 0) goto L_0x0037
            java.lang.String r0 = "off"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0037
        L_0x0023:
            X.47k r0 = r7.A03
            java.util.concurrent.Semaphore r0 = r0.A05
            r0.release()
            r0 = -2054823010(0xffffffff8585e39e, float:-1.2590873E-35)
            X.C14030oh.A0A(r0, r5)
            r0 = -2062260267(0xffffffff851467d5, float:-6.9779975E-36)
            X.C14030oh.A0A(r0, r6)
            return
        L_0x0037:
            int r1 = r2.A00
            int r0 = r7.A01
            if (r1 < r0) goto L_0x0224
            X.47k r3 = r7.A03
            X.0i6 r8 = r7.A02
            int r9 = r7.A00
            X.1TN r11 = r2.A01
            X.1SF r0 = r11.A00
            if (r0 == 0) goto L_0x00d1
            android.content.Context r10 = X.C10600ic.A00
            java.util.Set r1 = r0.A00
            java.lang.Class<X.2CY> r18 = X.AnonymousClass2CY.class
            monitor-enter(r18)
            if (r1 == 0) goto L_0x00ce
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x025d }
            if (r0 != 0) goto L_0x00ce
            X.C04220Ms.A0A(r10)     // Catch:{ all -> 0x025d }
            X.3El r4 = new X.3El     // Catch:{ all -> 0x025d }
            r4.<init>(r10)     // Catch:{ all -> 0x025d }
            java.util.Iterator r17 = r1.iterator()     // Catch:{ all -> 0x025d }
            r16 = 0
            r15 = 0
        L_0x0067:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x025d }
            if (r0 == 0) goto L_0x00c1
            java.lang.String r1 = X.C18180wK.A0k(r17)     // Catch:{ all -> 0x025d }
            r0 = 1
            X.C04220Ms.A0B(r1, r0)     // Catch:{ all -> 0x025d }
            java.lang.String r14 = X.AnonymousClass3QZ.A00(r1)     // Catch:{ all -> 0x025d }
            int r0 = r14.length()     // Catch:{ all -> 0x025d }
            r13 = 0
            if (r0 == 0) goto L_0x00be
            java.lang.String[] r12 = X.AnonymousClass3QZ.A00     // Catch:{ all -> 0x025d }
            int r10 = r12.length     // Catch:{ all -> 0x025d }
            r1 = 0
        L_0x0084:
            if (r1 >= r10) goto L_0x0091
            r0 = r12[r1]     // Catch:{ all -> 0x025d }
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x025d }
            if (r0 != 0) goto L_0x00be
            int r1 = r1 + 1
            goto L_0x0084
        L_0x0091:
            java.lang.String r10 = java.io.File.separator     // Catch:{ all -> 0x025d }
            java.lang.String r12 = X.AnonymousClass00U.A0L(r14, r10)     // Catch:{ all -> 0x025d }
            java.lang.String r1 = "__i_know_what_i_am_doing__"
            boolean r0 = r14.endsWith(r1)     // Catch:{ all -> 0x025d }
            if (r0 == 0) goto L_0x00b3
            java.lang.String r0 = ""
            java.lang.String r0 = X.AnonymousClass8bQ.A0l(r14, r1, r0, r13)     // Catch:{ all -> 0x025d }
            java.lang.String r1 = X.AnonymousClass3QZ.A00(r0)     // Catch:{ all -> 0x025d }
            int r0 = r1.length()     // Catch:{ all -> 0x025d }
            if (r0 == 0) goto L_0x00be
            java.lang.String r12 = X.AnonymousClass00U.A0L(r1, r10)     // Catch:{ all -> 0x025d }
        L_0x00b3:
            if (r12 == 0) goto L_0x00be
            java.io.File r0 = r4.A00(r12)     // Catch:{ all -> 0x025d }
            boolean r15 = X.AnonymousClass0IV.A00(r0)     // Catch:{ all -> 0x025d }
            goto L_0x0067
        L_0x00be:
            r16 = 1
            goto L_0x0067
        L_0x00c1:
            if (r16 == 0) goto L_0x00c6
            java.lang.Integer r0 = X.AnonymousClass006.A01     // Catch:{ all -> 0x025d }
            goto L_0x00d4
        L_0x00c6:
            if (r15 == 0) goto L_0x00cb
            java.lang.Integer r0 = X.AnonymousClass006.A0N     // Catch:{ all -> 0x025d }
            goto L_0x00d4
        L_0x00cb:
            java.lang.Integer r0 = X.AnonymousClass006.A0C     // Catch:{ all -> 0x025d }
            goto L_0x00d4
        L_0x00ce:
            java.lang.Integer r0 = X.AnonymousClass006.A00     // Catch:{ all -> 0x025d }
            goto L_0x00d4
        L_0x00d1:
            java.lang.Integer r1 = X.AnonymousClass006.A00
            goto L_0x00e4
        L_0x00d4:
            monitor-exit(r18)
            int r1 = r0.intValue()
            r0 = 3
            if (r1 == r0) goto L_0x0217
            r0 = 2
            if (r1 == r0) goto L_0x0217
            r0 = 0
            if (r1 == r0) goto L_0x00d1
            java.lang.Integer r1 = X.AnonymousClass006.A0C
        L_0x00e4:
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            boolean r12 = r8 instanceof com.instagram.service.session.UserSession
            if (r12 == 0) goto L_0x011b
            boolean r0 = r11.A01
            if (r0 == 0) goto L_0x00fb
            X.3Vx r10 = X.C61823Vx.A01
            X.0cT r0 = X.C07940cT.User
            X.0hf r0 = r10.A02(r8, r0)
            r4.add(r0)
        L_0x00fb:
            boolean r0 = r11.A02
            if (r0 == 0) goto L_0x011b
            X.3Vx r10 = X.C61823Vx.A01
            if (r12 == 0) goto L_0x011b
            com.instagram.service.session.UserSession r0 = X.C05030Qo.A02(r8)
            X.3Ie r0 = r10.A04(r0)
            if (r0 == 0) goto L_0x011b
            X.3Xz r0 = r0.A01
            X.3zp r0 = r0.A00
            r0.A0A()
            X.3Iv r0 = r0.A06()
            r0.updateEmergencyPushConfigs()
        L_0x011b:
            boolean r0 = r11.A01
            if (r0 == 0) goto L_0x012a
            X.3Vx r10 = X.C61823Vx.A01
            X.0cT r0 = X.C07940cT.Device
            X.0hf r0 = r10.A02(r8, r0)
            r4.add(r0)
        L_0x012a:
            java.util.Iterator r12 = r4.iterator()
        L_0x012e:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0140
            java.lang.Object r10 = r12.next()
            X.0hf r10 = (X.C10060hf) r10
            java.util.concurrent.CountDownLatch r0 = r10.A02     // Catch:{ InterruptedException -> 0x014c }
            r0.await()     // Catch:{ InterruptedException -> 0x014c }
            goto L_0x014c
        L_0x0140:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0149
            java.lang.Integer r4 = X.AnonymousClass006.A00
            goto L_0x016d
        L_0x0149:
            java.lang.Integer r4 = X.AnonymousClass006.A01
            goto L_0x016d
        L_0x014c:
            java.lang.Object r10 = r10.A00
            X.21q r10 = (X.C305221q) r10
            int r11 = r10.ordinal()
            r0 = 1
            if (r11 == r0) goto L_0x016b
            r0 = 0
            if (r11 == r0) goto L_0x016b
            r0 = 3
            if (r11 == r0) goto L_0x012e
            r0 = 2
            if (r11 == r0) goto L_0x012e
            java.lang.String r4 = "EmergencyPushVersionChangeHandler"
            java.lang.String r0 = "Unhandled SynchronizationResult in EmergencyPush: "
            java.lang.String r0 = X.AnonymousClass0wJ.A0t(r0, r10)
            X.C10450iM.A03(r4, r0)
        L_0x016b:
            java.lang.Integer r4 = X.AnonymousClass006.A0C
        L_0x016d:
            java.lang.Integer r0 = X.AnonymousClass006.A01
            if (r1 == r0) goto L_0x0179
            if (r4 == r0) goto L_0x0179
            java.lang.Integer r0 = X.AnonymousClass006.A00
            if (r1 != r0) goto L_0x022f
            if (r4 != r0) goto L_0x022f
        L_0x0179:
            X.0dD r0 = r3.A04
            int r4 = r2.A00
            android.content.SharedPreferences$Editor r1 = X.C18220wO.A0B(r0)
            java.lang.String r0 = "preference_emergency_push_version"
            android.content.SharedPreferences$Editor r0 = r1.putInt(r0, r4)
            boolean r0 = r0.commit()
            if (r0 == 0) goto L_0x021b
            java.lang.Integer r0 = r2.A03
            int r10 = r2.A00
            int r12 = r0.intValue()
            r4 = 1
            if (r12 == r4) goto L_0x0205
            r0 = 2
            if (r12 == r0) goto L_0x0205
        L_0x019b:
            java.lang.String r0 = "ig_emergency_push_will_execute_instructions"
            X.0rn r11 = X.C18230wP.A0T(r0)
            r0 = 0
            if (r12 == r0) goto L_0x01b5
            r0 = 2
            if (r12 == r4) goto L_0x0203
            if (r12 == r0) goto L_0x01b6
            java.lang.String r13 = "EmergencyPushInstructionSetResponse"
            java.lang.String r1 = "Unhandled emergency push handler type: "
            switch(r12) {
                case 1: goto L_0x0200;
                case 2: goto L_0x01fd;
                default: goto L_0x01b0;
            }
        L_0x01b0:
            java.lang.String r0 = "NO_OP"
        L_0x01b2:
            X.C18250wR.A1G(r1, r0, r13)
        L_0x01b5:
            r0 = 0
        L_0x01b6:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "handler_type_will_execute"
            r11.A08(r1, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            java.lang.String r0 = "previous_version"
            r11.A08(r1, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            java.lang.String r0 = "current_version"
            r11.A08(r1, r0)
            X.0kZ r0 = X.C12090lI.A00(r8)
            r0.Ce1(r11)
            java.lang.Integer r0 = r2.A03
            java.lang.Integer r2 = r2.A02
            int r1 = r0.intValue()
            if (r1 == r4) goto L_0x0260
            r0 = 2
            if (r1 != r0) goto L_0x0023
            r3.A01 = r4
            if (r2 == 0) goto L_0x0023
            r3.A00 = r4
            android.os.Handler r8 = r3.A02
            X.0gG r4 = r3.A03
            int r0 = r2.intValue()
            long r2 = (long) r0
            r0 = 60000(0xea60, double:2.9644E-319)
            long r2 = r2 * r0
            r8.postDelayed(r4, r2)
            goto L_0x0023
        L_0x01fd:
            java.lang.String r0 = "CRASH_ON_BACKGROUND"
            goto L_0x01b2
        L_0x0200:
            java.lang.String r0 = "CRASH_NOW"
            goto L_0x01b2
        L_0x0203:
            r0 = 1
            goto L_0x01b6
        L_0x0205:
            android.content.SharedPreferences r0 = X.C18200wM.A0C()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "preference_emergency_push_should_log_after_induced_crash"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r4)
            r0.commit()
            goto L_0x019b
        L_0x0217:
            java.lang.Integer r1 = X.AnonymousClass006.A01
            goto L_0x00e4
        L_0x021b:
            int r0 = r2.A00
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.String r3 = "failed_to_save_version"
            goto L_0x0237
        L_0x0224:
            X.0i6 r8 = r7.A02
            int r9 = r7.A00
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.String r3 = "invalid_server_version"
            goto L_0x0237
        L_0x022f:
            int r0 = r2.A00
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.String r3 = "failed_action_handler"
        L_0x0237:
            java.lang.String r0 = "ig_emergency_push_did_error"
            X.0rn r2 = X.C18230wP.A0T(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            java.lang.String r0 = "current_version"
            r2.A08(r1, r0)
            java.lang.String r0 = "error_description"
            if (r3 == 0) goto L_0x024d
            r2.A0D(r0, r3)
        L_0x024d:
            java.lang.String r0 = "failed_version"
            if (r4 == 0) goto L_0x0254
            r2.A08(r4, r0)
        L_0x0254:
            X.0kZ r0 = X.C12090lI.A00(r8)
            r0.Ce1(r2)
            goto L_0x0023
        L_0x025d:
            r0 = move-exception
            monitor-exit(r18)
            throw r0
        L_0x0260:
            X.4VS r0 = new X.4VS
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1hQ.onSuccess(java.lang.Object):void");
    }

    public final void onFail(AnonymousClass3XX r8) {
        int A032 = C14030oh.A03(2072324170);
        super.onFail(r8);
        C10300i6 r6 = this.A02;
        int i = this.A00;
        Integer valueOf = Integer.valueOf(this.A01);
        C15730rn A0T = C18230wP.A0T("ig_emergency_push_did_error");
        A0T.A08(Integer.valueOf(i), "current_version");
        A0T.A0D(TraceFieldType.Error, "failed_fetch_instructions");
        if (valueOf != null) {
            A0T.A08(valueOf, "failed_version");
        }
        C12090lI.A00(r6).Ce1(A0T);
        this.A03.A05.release();
        C14030oh.A0A(1667767081, A032);
    }
}
