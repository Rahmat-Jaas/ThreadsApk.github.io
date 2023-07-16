package X;

/* renamed from: X.7x7  reason: invalid class name and case insensitive filesystem */
public final class C134157x7 implements C04860Pl {
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0061, code lost:
        if (r12 == null) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void AKs(com.instagram.service.session.UserSession r18, X.C04850Pk r19, X.AnonymousClass0PT r20) {
        /*
            r17 = this;
            r0 = r20
            X.7x9 r0 = (X.C134167x9) r0
            X.6iC r14 = new X.6iC
            r2 = r17
            r1 = r19
            r14.<init>(r2, r1)
            android.content.Context r7 = r0.A01
            android.content.Intent r8 = r0.A00
            r0 = 402(0x192, float:5.63E-43)
            java.lang.String r2 = X.C28174Ezk.A00(r0)
            java.lang.String r3 = "IgPushRegistrationService"
            android.os.Bundle r4 = r8.getExtras()     // Catch:{ RuntimeException -> 0x0106 }
            if (r4 == 0) goto L_0x010d
            r0 = 400(0x190, float:5.6E-43)
            java.lang.String r0 = X.C28174Ezk.A00(r0)     // Catch:{ RuntimeException -> 0x0106 }
            java.lang.String r5 = r4.getString(r0)     // Catch:{ RuntimeException -> 0x0106 }
            r0 = 399(0x18f, float:5.59E-43)
            java.lang.String r0 = X.C28174Ezk.A00(r0)     // Catch:{ RuntimeException -> 0x0106 }
            java.lang.String r1 = r4.getString(r0)     // Catch:{ RuntimeException -> 0x0106 }
            r0 = 403(0x193, float:5.65E-43)
            java.lang.String r0 = X.C28174Ezk.A00(r0)     // Catch:{ RuntimeException -> 0x0106 }
            java.lang.String r11 = r4.getString(r0)     // Catch:{ RuntimeException -> 0x0106 }
            if (r11 == 0) goto L_0x0055
            com.instagram.common.notifications.push.intf.PushChannelType[] r10 = com.instagram.common.notifications.push.intf.PushChannelType.values()     // Catch:{ RuntimeException -> 0x0106 }
            int r9 = r10.length     // Catch:{ RuntimeException -> 0x0106 }
            r6 = 0
            goto L_0x0048
        L_0x0046:
            int r6 = r6 + 1
        L_0x0048:
            if (r6 >= r9) goto L_0x0063
            r12 = r10[r6]     // Catch:{ RuntimeException -> 0x0106 }
            java.lang.String r0 = r12.A01     // Catch:{ RuntimeException -> 0x0106 }
            boolean r0 = r0.equals(r11)     // Catch:{ RuntimeException -> 0x0106 }
            if (r0 != 0) goto L_0x0069
            goto L_0x0046
        L_0x0055:
            r0 = 405(0x195, float:5.68E-43)
            java.lang.String r0 = X.C28174Ezk.A00(r0)     // Catch:{ RuntimeException -> 0x0106 }
            java.io.Serializable r12 = r4.getSerializable(r0)     // Catch:{ RuntimeException -> 0x0106 }
            com.instagram.common.notifications.push.intf.PushChannelType r12 = (com.instagram.common.notifications.push.intf.PushChannelType) r12     // Catch:{ RuntimeException -> 0x0106 }
            if (r12 != 0) goto L_0x0069
        L_0x0063:
            java.lang.String r0 = "Received null PushChannelType"
            X.C10450iM.A03(r3, r0)     // Catch:{ RuntimeException -> 0x0106 }
            return
        L_0x0069:
            r0 = 401(0x191, float:5.62E-43)
            java.lang.String r0 = X.C28174Ezk.A00(r0)     // Catch:{ RuntimeException -> 0x0106 }
            boolean r16 = r4.getBoolean(r0)     // Catch:{ RuntimeException -> 0x0106 }
            r0 = 404(0x194, float:5.66E-43)
            java.lang.String r0 = X.C28174Ezk.A00(r0)     // Catch:{ RuntimeException -> 0x0106 }
            int r9 = r4.getInt(r0)     // Catch:{ RuntimeException -> 0x0106 }
            r13 = r18
            X.H1T r4 = X.AnonymousClass0wJ.A0N(r13)     // Catch:{ RuntimeException -> 0x0106 }
            java.lang.String r0 = "push/register/"
            r4.A0J(r0)     // Catch:{ RuntimeException -> 0x0106 }
            java.lang.String r0 = "device_token"
            r4.A0O(r0, r1)     // Catch:{ RuntimeException -> 0x0106 }
            r0 = 60
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ RuntimeException -> 0x0106 }
            java.lang.String r6 = r12.A01     // Catch:{ RuntimeException -> 0x0106 }
            r4.A0O(r0, r6)     // Catch:{ RuntimeException -> 0x0106 }
            java.lang.String r1 = "is_main_push_channel"
            java.lang.String r0 = java.lang.String.valueOf(r16)     // Catch:{ RuntimeException -> 0x0106 }
            r4.A0O(r1, r0)     // Catch:{ RuntimeException -> 0x0106 }
            java.lang.String r0 = "guid"
            r4.A0O(r0, r5)     // Catch:{ RuntimeException -> 0x0106 }
            r0 = 155(0x9b, float:2.17E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)     // Catch:{ RuntimeException -> 0x0106 }
            X.0rQ r0 = X.C15500rQ.A01(r13)     // Catch:{ RuntimeException -> 0x0106 }
            java.lang.String r0 = r0.BJN()     // Catch:{ RuntimeException -> 0x0106 }
            r4.A0O(r1, r0)     // Catch:{ RuntimeException -> 0x0106 }
            r0 = 982(0x3d6, float:1.376E-42)
            java.lang.String r0 = X.C18170wI.A00(r0)     // Catch:{ RuntimeException -> 0x0106 }
            java.lang.String r5 = java.lang.Integer.toString(r9)     // Catch:{ RuntimeException -> 0x0106 }
            r4.A0O(r0, r5)     // Catch:{ RuntimeException -> 0x0106 }
            java.lang.Class<X.4vo> r1 = X.C85814vo.class
            java.lang.Class<X.3Za> r0 = X.AnonymousClass3Za.class
            r4.A0B(r1, r0)     // Catch:{ RuntimeException -> 0x0106 }
            boolean r0 = r8.hasExtra(r2)     // Catch:{ RuntimeException -> 0x0106 }
            if (r0 == 0) goto L_0x00da
            java.lang.String r1 = r8.getStringExtra(r2)     // Catch:{ RuntimeException -> 0x0106 }
            java.lang.String r0 = "users"
            r4.A0O(r0, r1)     // Catch:{ RuntimeException -> 0x0106 }
        L_0x00da:
            X.3Vp r2 = X.C61793Vp.A00(r13)     // Catch:{ RuntimeException -> 0x0106 }
            r0 = 319(0x13f, float:4.47E-43)
            java.lang.String r1 = X.C28174Ezk.A00(r0)     // Catch:{ RuntimeException -> 0x0106 }
            java.lang.String r0 = r2.A01()     // Catch:{ RuntimeException -> 0x0106 }
            r4.A0N(r1, r0)     // Catch:{ RuntimeException -> 0x0106 }
            X.76T r15 = new X.76T     // Catch:{ RuntimeException -> 0x0106 }
            r15.<init>(r7, r13, r6, r5)     // Catch:{ RuntimeException -> 0x0106 }
            java.lang.String r2 = "registration_initiated"
            r1 = 1
            r0 = 0
            X.AnonymousClass76T.A00(r15, r2, r0, r0, r1)     // Catch:{ RuntimeException -> 0x0106 }
            X.H8c r0 = r4.A02()     // Catch:{ RuntimeException -> 0x0106 }
            X.5yh r11 = new X.5yh     // Catch:{ RuntimeException -> 0x0106 }
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ RuntimeException -> 0x0106 }
            r0.A00 = r11     // Catch:{ RuntimeException -> 0x0106 }
            X.C31155GhB.A02(r0)     // Catch:{ RuntimeException -> 0x0106 }
            return
        L_0x0106:
            r2 = move-exception
            r1 = 1
            java.lang.String r0 = "RegisterPushCallable.Call - runtime exception"
            X.C10450iM.A05(r3, r0, r1, r2)
        L_0x010d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C134157x7.AKs(com.instagram.service.session.UserSession, X.0Pk, X.0PT):void");
    }
}
