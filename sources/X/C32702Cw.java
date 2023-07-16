package X;

/* renamed from: X.2Cw  reason: invalid class name and case insensitive filesystem */
public final class C32702Cw {
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01aa, code lost:
        r6 = r4.A06;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C85814vo r20, X.C10300i6 r21, java.lang.String r22) {
        /*
            r14 = r21
            java.util.List r0 = r20.getSystemMessages()
            if (r0 == 0) goto L_0x0072
            java.util.Iterator r9 = r0.iterator()
        L_0x000c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0072
            java.lang.Object r8 = r9.next()
            X.37B r8 = (X.AnonymousClass37B) r8
            java.lang.Class<X.3Qc> r4 = X.C60683Qc.class
            monitor-enter(r4)
            java.lang.String r7 = r8.A01     // Catch:{ all -> 0x01eb }
            java.util.Map r0 = X.C60683Qc.A00     // Catch:{ all -> 0x01eb }
            java.lang.Object r5 = r0.get(r7)     // Catch:{ all -> 0x01eb }
            X.4pZ r5 = (X.C82404pZ) r5     // Catch:{ all -> 0x01eb }
            if (r5 == 0) goto L_0x0070
            X.0dD r2 = X.C08360dF.A00()     // Catch:{ all -> 0x01eb }
            r0 = 0
            X.C04220Ms.A0B(r7, r0)     // Catch:{ all -> 0x01eb }
            java.lang.String r6 = "system_message_"
            java.lang.String r1 = X.AnonymousClass00U.A0L(r6, r7)     // Catch:{ all -> 0x01eb }
            android.content.SharedPreferences r3 = r2.A00     // Catch:{ all -> 0x01eb }
            boolean r0 = r3.contains(r1)     // Catch:{ all -> 0x01eb }
            if (r0 == 0) goto L_0x006e
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r0 = r3.getFloat(r1, r0)     // Catch:{ all -> 0x01eb }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ all -> 0x01eb }
        L_0x0047:
            java.lang.Float r2 = r8.A00     // Catch:{ all -> 0x01eb }
            if (r0 == 0) goto L_0x0057
            float r1 = r0.floatValue()     // Catch:{ all -> 0x01eb }
            float r0 = r2.floatValue()     // Catch:{ all -> 0x01eb }
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0070
        L_0x0057:
            float r2 = r2.floatValue()     // Catch:{ all -> 0x01eb }
            android.content.SharedPreferences$Editor r1 = r3.edit()     // Catch:{ all -> 0x01eb }
            java.lang.String r0 = X.AnonymousClass00U.A0L(r6, r7)     // Catch:{ all -> 0x01eb }
            android.content.SharedPreferences$Editor r0 = r1.putFloat(r0, r2)     // Catch:{ all -> 0x01eb }
            r0.apply()     // Catch:{ all -> 0x01eb }
            r5.accept(r14)     // Catch:{ all -> 0x01eb }
            goto L_0x0070
        L_0x006e:
            r0 = 0
            goto L_0x0047
        L_0x0070:
            monitor-exit(r4)
            goto L_0x000c
        L_0x0072:
            boolean r0 = r20.isOk()
            if (r0 != 0) goto L_0x00ec
            boolean r0 = r14.hasEnded()
            if (r0 != 0) goto L_0x00ec
            boolean r2 = r14 instanceof com.instagram.service.session.UserSession
            if (r2 == 0) goto L_0x008a
            com.instagram.service.session.UserSession r0 = X.C05030Qo.A02(r14)
            boolean r0 = r0.isManaged
            if (r0 == 0) goto L_0x00ec
        L_0x008a:
            boolean r0 = r20.isFeedbackRequired()
            if (r0 == 0) goto L_0x00ed
            X.311 r0 = X.AnonymousClass311.A00
            if (r0 == 0) goto L_0x00ed
            boolean r12 = r20.getSpam()
            boolean r13 = r20.getSentryBlockRestrictionDialogueUnificationEnabled()
            java.lang.String r1 = r20.getFeedbackTitle()
            java.lang.String r2 = r20.getFeedbackMessage()
            java.lang.String r3 = r20.getFeedbackAppealLabel()
            java.lang.String r4 = r20.getFeedbackAction()
            java.lang.String r5 = r20.getFeedbackIgnoreLabel()
            java.lang.String r6 = r20.getFeedbackUrl()
            java.lang.String r7 = r20.getEnrollmentTime()
            java.lang.String r8 = r20.getExpirationTime()
            java.lang.String r9 = r20.getDialogueType()
            java.lang.String r10 = r20.getErrorCode()
            java.lang.String r11 = r20.getReasonsThrown()
            X.3VJ r0 = new X.3VJ
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.String r16 = r20.getRestrictionDetailUseCase()
            java.lang.String r17 = r20.getRestrictionType()
            java.lang.String r18 = r20.getResponsiblePolicy()
            java.lang.String r19 = r20.getCategory()
            java.lang.String r20 = r20.getRestrictionExtraData()
            X.45U r13 = new X.45U
            r15 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
        L_0x00e7:
            X.KHr r0 = X.C38040KHr.A01
            r0.CWx(r13)
        L_0x00ec:
            return
        L_0x00ed:
            boolean r0 = r20.isLoginRequired()
            java.lang.String r3 = "IG_API_UTIL"
            if (r0 == 0) goto L_0x0108
            X.3B6 r13 = X.AnonymousClass3B6.A03
            if (r13 == 0) goto L_0x01f3
            java.lang.String r18 = r20.getErrorTitle()
            java.lang.String r19 = r20.getErrorBody()
            java.lang.String r16 = r20.getLogoutReason()
            monitor-enter(r13)
            r1 = 1
            goto L_0x016a
        L_0x0108:
            boolean r0 = r20.isCheckpointRequired()
            if (r0 == 0) goto L_0x0150
            X.3Xf r2 = r20.getCheckpoint()
            if (r2 != 0) goto L_0x0131
            java.lang.String r1 = r20.getCheckpointUrl()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0128
            r0 = 816(0x330, float:1.143E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "Checkpoint is required but none was provided."
            goto L_0x01f5
        L_0x0128:
            boolean r0 = r20.getShouldShowWebviewCancelButton()
            X.3Xf r2 = new X.3Xf
            r2.<init>((java.lang.String) r1, (boolean) r0)
        L_0x0131:
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x0140
            X.3VJ r0 = new X.3VJ
            r0.<init>()
            X.45U r13 = new X.45U
            r13.<init>(r14, r0)
            goto L_0x00e7
        L_0x0140:
            X.3GW r0 = X.AnonymousClass3GW.A00
            if (r0 == 0) goto L_0x019b
            X.49w r1 = r0.A00(r14)
            if (r1 == 0) goto L_0x00ec
            android.content.Context r0 = X.C10600ic.A00
            r1.A02(r0, r2)
            return
        L_0x0150:
            boolean r0 = r20.isConsentRequired()
            if (r0 == 0) goto L_0x00ec
            X.39w r2 = r20.getConsentData()
            X.3GW r0 = X.AnonymousClass3GW.A00
            if (r2 == 0) goto L_0x01ee
            if (r0 == 0) goto L_0x01ee
            X.49w r4 = r0.A00(r14)
            if (r4 == 0) goto L_0x00ec
            android.content.Context r5 = X.C10600ic.A00
            monitor-enter(r4)
            goto L_0x019e
        L_0x016a:
            boolean r0 = r13.A01     // Catch:{ all -> 0x0198 }
            if (r0 != 0) goto L_0x0196
            if (r2 == 0) goto L_0x0196
            r13.A01 = r1     // Catch:{ all -> 0x0198 }
            com.instagram.service.session.UserSession r14 = (com.instagram.service.session.UserSession) r14     // Catch:{ all -> 0x0198 }
            android.os.Handler r0 = r13.A00     // Catch:{ all -> 0x0198 }
            if (r0 == 0) goto L_0x017e
            android.os.Looper r0 = r0.getLooper()     // Catch:{ all -> 0x0198 }
            if (r0 != 0) goto L_0x0184
        L_0x017e:
            android.os.Handler r0 = X.AnonymousClass0wJ.A0F()     // Catch:{ all -> 0x0198 }
            r13.A00 = r0     // Catch:{ all -> 0x0198 }
        L_0x0184:
            com.instagram.user.model.User r15 = X.AnonymousClass0wJ.A0Y(r14)     // Catch:{ all -> 0x0198 }
            X.0gW r0 = X.AnonymousClass0gN.A00()     // Catch:{ all -> 0x0198 }
            X.1mn r12 = new X.1mn     // Catch:{ all -> 0x0198 }
            r17 = r22
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0198 }
            r0.AKp(r12)     // Catch:{ all -> 0x0198 }
        L_0x0196:
            monitor-exit(r13)
            return
        L_0x0198:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        L_0x019b:
            java.lang.String r0 = "CheckpointManagerPlugin.getInstance() hasn't been initialized yet."
            goto L_0x01f5
        L_0x019e:
            boolean r0 = r4.A03     // Catch:{ all -> 0x01eb }
            if (r0 == 0) goto L_0x01e9
            boolean r0 = r4.A02     // Catch:{ all -> 0x01eb }
            if (r0 != 0) goto L_0x01e9
            boolean r0 = r4.A05     // Catch:{ all -> 0x01eb }
            if (r0 != 0) goto L_0x01e9
            X.0i6 r6 = r4.A06     // Catch:{ all -> 0x01eb }
            java.lang.String r1 = X.C05030Qo.A04(r6)     // Catch:{ all -> 0x01eb }
            if (r1 == 0) goto L_0x01e9
            com.instagram.service.session.UserSession r0 = X.C05030Qo.A02(r6)     // Catch:{ all -> 0x01eb }
            X.0BO r0 = r0.multipleAccountHelper     // Catch:{ all -> 0x01eb }
            boolean r0 = r0.A0O(r1)     // Catch:{ all -> 0x01eb }
            if (r0 == 0) goto L_0x01e9
            android.os.Bundle r3 = X.C18180wK.A06()     // Catch:{ all -> 0x01eb }
            java.lang.String r1 = "ConsentFragment.param.headline"
            java.lang.String r0 = r2.A02     // Catch:{ all -> 0x01eb }
            r3.putString(r1, r0)     // Catch:{ all -> 0x01eb }
            java.lang.String r1 = "ConsentFragment.param.content"
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x01eb }
            r3.putString(r1, r0)     // Catch:{ all -> 0x01eb }
            java.lang.String r1 = "ConsentFragment.param.button.text"
            java.lang.String r0 = r2.A00     // Catch:{ all -> 0x01eb }
            r3.putString(r1, r0)     // Catch:{ all -> 0x01eb }
            r0 = 1
            r4.A05 = r0     // Catch:{ all -> 0x01eb }
            java.lang.Integer r2 = X.AnonymousClass006.A01     // Catch:{ all -> 0x01eb }
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01eb }
            java.lang.String r0 = r6.getToken()     // Catch:{ all -> 0x01eb }
            X.C34632Kh.A00(r5, r3, r2, r1, r0)     // Catch:{ all -> 0x01eb }
        L_0x01e9:
            monitor-exit(r4)
            return
        L_0x01eb:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x01ee:
            java.lang.String r3 = "consent"
            java.lang.String r0 = "consent data is required but none was provided."
            goto L_0x01f5
        L_0x01f3:
            java.lang.String r0 = "IgApiLoginRequiredErrorHandler.getInstance() hasn't been initialized yet."
        L_0x01f5:
            X.C10450iM.A03(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32702Cw.A00(X.4vo, X.0i6, java.lang.String):void");
    }
}
