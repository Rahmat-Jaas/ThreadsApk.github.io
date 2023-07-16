package com.instagram.urlhandlers.passwordreset;

import X.AnonymousClass0RJ;
import X.C10300i6;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public class PasswordResetExternalUrlHandlerActivity extends BaseFragmentActivity implements AnonymousClass0RJ {
    public C10300i6 A00;
    public String A01;
    public String A02;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x033c, code lost:
        if (X.C18190wL.A0p(r7, 1).equals("password_reset") != false) goto L_0x033e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r32) {
        /*
            r31 = this;
            r0 = -1478099048(0xffffffffa7e5ff98, float:-6.3837383E-15)
            int r14 = X.C14030oh.A00(r0)
            r5 = r31
            r0 = r32
            super.onCreate(r0)
            android.os.Bundle r3 = X.AnonymousClass0wJ.A0C(r5)
            if (r3 != 0) goto L_0x001e
            r5.finish()
            r0 = -628984745(0xffffffffda827457, float:-1.8359832E16)
        L_0x001a:
            X.C14030oh.A07(r0, r14)
            return
        L_0x001e:
            X.0RG r9 = X.AnonymousClass0RA.A0C
            X.0i6 r0 = r9.A02(r3)
            r5.A00 = r0
            java.lang.String r4 = "original_url"
            java.lang.String r0 = r3.getString(r4)
            if (r0 != 0) goto L_0x0035
            r5.finish()
            r0 = -1516951486(0xffffffffa5952842, float:-2.587466E-16)
            goto L_0x001a
        L_0x0035:
            r16 = 0
            android.net.Uri r1 = X.C15430rJ.A01(r0)
            java.lang.String r2 = r1.getScheme()
            java.lang.String r0 = "http"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L_0x02c8
            java.lang.String r0 = "https"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L_0x02c8
            java.lang.String r0 = "instagram"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x036b
            java.util.Set r7 = r1.getQueryParameterNames()
            java.lang.String r6 = "u"
            boolean r0 = r7.contains(r6)
            if (r0 == 0) goto L_0x036b
            java.lang.String r2 = "t"
            boolean r0 = r7.contains(r2)
            if (r0 == 0) goto L_0x036b
            android.os.Bundle r8 = X.C18180wK.A06()
            java.lang.String r0 = r1.getQueryParameter(r6)
            r12 = 36
            long r6 = java.lang.Long.parseLong(r0, r12)
            java.lang.String r0 = java.lang.Long.toString(r6)
            java.lang.String r6 = "argument_user_id"
            r8.putString(r6, r0)
            java.lang.String r2 = r1.getQueryParameter(r2)
        L_0x0086:
            java.lang.String r7 = "argument_reset_token"
            r8.putString(r7, r2)
            r3.putAll(r8)
            X.01V r0 = X.AnonymousClass01V.A0p
            r8 = 725091390(0x2b38043e, float:6.537582E-13)
            r0.markerStart(r8)
            X.01V r2 = X.AnonymousClass01V.A0p
            java.lang.String r1 = "flow"
            java.lang.String r0 = "prod"
            r2.markerAnnotate((int) r8, (java.lang.String) r1, (java.lang.String) r0)
            X.0i6 r1 = r5.A00
            boolean r0 = r1 instanceof com.instagram.service.session.UserSession
            if (r0 == 0) goto L_0x02c2
            r9.A05(r5)
            java.lang.String r0 = "IgSessionManager.LOGGED_OUT_TOKEN"
        L_0x00aa:
            X.C18190wL.A13(r3, r0)
            X.0bf r0 = r9.A04(r3)
            boolean r1 = X.AnonymousClass2RP.A00(r0)
            if (r1 != 0) goto L_0x00c5
            r0 = 2131830299(0x7f11261b, float:1.9293591E38)
            X.C63813iO.A00(r5, r0)
            r5.finish()
        L_0x00c0:
            r0 = 1455705665(0x56c44e41, float:1.07920189E14)
            goto L_0x001a
        L_0x00c5:
            java.lang.String r13 = r3.getString(r6)
            java.lang.String r9 = r3.getString(r7)
            java.lang.String r2 = r5.A01
            java.lang.String r1 = "one_click_login_email"
            boolean r1 = r2.equals(r1)
            r6 = 1
            if (r1 != 0) goto L_0x00f5
            java.lang.String r1 = "password_reset_sms"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x00f5
            java.lang.String r1 = "password_reset_email"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x014f
            X.0TJ r8 = X.AnonymousClass0TJ.A06
            r1 = 2324148898563626899(0x2041091c00001793, double:2.541143725376759E-153)
            boolean r1 = X.C63173fJ.A05(r8, r1)
            if (r1 != 0) goto L_0x014f
        L_0x00f5:
            r1 = 1
        L_0x00f6:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            X.0i6 r1 = r5.A00
            boolean r1 = r1 instanceof com.instagram.service.session.UserSession
            if (r1 != 0) goto L_0x0204
            boolean r1 = X.AnonymousClass0hA.A08(r13)
            if (r1 != 0) goto L_0x0204
            boolean r1 = X.AnonymousClass0hA.A08(r9)
            if (r1 != 0) goto L_0x0204
            boolean r1 = r2.booleanValue()
            if (r1 == 0) goto L_0x0204
            X.3Y9 r1 = new X.3Y9
            r1.<init>(r5, r0)
            java.lang.Integer r10 = X.AnonymousClass006.A0N
            boolean r1 = r1.A02(r10)
            if (r1 == 0) goto L_0x0204
            X.0m7 r2 = r5.getSupportFragmentManager()
            r4 = 0
            androidx.fragment.app.IDxLCallbacksShape41S0100000_1_I2 r1 = new androidx.fragment.app.IDxLCallbacksShape41S0100000_1_I2
            r1.<init>(r5, r4)
            r2.A0u(r1, r6)
            r1 = 2
            X.C04220Ms.A0B(r13, r1)
            java.lang.String r8 = "token"
            r1 = 3
            X.C04220Ms.A0B(r9, r1)
            java.util.UUID r1 = X.C03480Iw.A00()
            java.lang.String r11 = X.C18190wL.A0n(r1)
            X.K9R r7 = X.K9R.A00
            X.IVw r6 = new X.IVw
            r6.<init>(r7)
            X.3Y9 r3 = new X.3Y9
            r3.<init>(r5, r0)
            X.0et r15 = X.C18190wL.A0X()
            goto L_0x0151
        L_0x014f:
            r1 = 0
            goto L_0x00f6
        L_0x0151:
            long r1 = java.lang.Long.parseLong(r13)     // Catch:{ NumberFormatException -> 0x01f2 }
            X.AnonymousClass725.A00(r12)     // Catch:{ NumberFormatException -> 0x01f2 }
            java.lang.String r2 = java.lang.Long.toString(r1, r12)     // Catch:{ NumberFormatException -> 0x01f2 }
            X.C04220Ms.A06(r2)     // Catch:{ NumberFormatException -> 0x01f2 }
            java.lang.String r1 = "uidb36"
            r6.A04(r1, r2)     // Catch:{ NumberFormatException -> 0x01f2 }
            X.28L r17 = X.AnonymousClass28L.RESET_PASSWORD_LINK
            java.lang.String r19 = "ig_deeplink_controller_invoked_native_client"
            java.lang.String r20 = "account_recovery"
            java.lang.String r21 = "start_account_recovery"
            java.lang.String r22 = "link_recovery_start"
            r23 = r13
            r24 = r11
            r18 = r0
            X.C34582Kc.A00(r17, r18, r19, r20, r21, r22, r23, r24)
            r6.A04(r8, r9)
            java.lang.String r8 = X.C09140ev.A00(r5)
            r2 = 9
            r1 = 48
            java.lang.String r1 = X.C61983Wp.A01(r4, r2, r1)
            r6.A04(r1, r8)
            java.lang.String r2 = X.C18190wL.A0l(r0)
            java.lang.String r1 = "family_device_id"
            r6.A04(r1, r2)
            java.lang.String r2 = X.AnonymousClass3Y9.A00(r3)
            java.lang.String r1 = "offline_experiment_group"
            r6.A04(r1, r2)
            java.lang.String r1 = "event_request_id"
            r6.A04(r1, r11)
            java.lang.String r2 = r15.A0D()
            java.lang.String r1 = "waterfall_id"
            r6.A04(r1, r2)
            X.IVw r1 = X.C18180wK.A0M(r7, r6)
            java.util.HashMap r3 = X.AnonymousClass0wJ.A0y()
            java.lang.String r2 = X.C18190wL.A0n(r1)
            java.lang.String r1 = "params"
            r3.put(r1, r2)
            java.lang.Integer r24 = X.C66883yU.A0F
            java.lang.Integer r25 = X.AnonymousClass006.A00
            java.lang.Integer r22 = X.AnonymousClass006.A01
            X.3yU r15 = new X.3yU
            r17 = r16
            r18 = r16
            r19 = r16
            r20 = r16
            r21 = r16
            r23 = r10
            r26 = r16
            r27 = r16
            r28 = r4
            r29 = r4
            r30 = r4
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            com.instagram.bloks.hosting.IgBloksScreenConfig r2 = X.C18190wL.A0N(r0)
            java.lang.String r1 = "com.bloks.www.caa.ar.ig.deeplink"
            r2.A0P = r1
            r2.A01 = r15
            java.util.HashMap r0 = X.AnonymousClass0wJ.A0y()
            X.3iE r0 = X.C63743iE.A04(r1, r3, r0)
            r0.A0E(r5, r2)
            goto L_0x00c0
        L_0x01f2:
            X.28L r1 = X.AnonymousClass28L.RESET_PASSWORD_LINK
            java.lang.String r3 = "ig_deeplink_controller_uid_conversion_error_client"
            java.lang.String r4 = "account_recovery"
            java.lang.String r5 = "start_account_recovery"
            java.lang.String r6 = "link_recovery_start"
            r7 = r13
            r8 = r11
            r2 = r0
            X.C34582Kc.A00(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x00c0
        L_0x0204:
            java.lang.String r1 = r5.A01
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x026f
            X.0m7 r2 = r5.getSupportFragmentManager()
            androidx.fragment.app.IDxLCallbacksShape41S0100000_1_I2 r1 = new androidx.fragment.app.IDxLCallbacksShape41S0100000_1_I2
            r1.<init>(r5, r6)
            r2.A0u(r1, r6)
            java.lang.String r10 = r5.A02
            java.lang.String r9 = r3.getString(r7)
            java.lang.String r8 = r5.A01
            android.content.Context r7 = r5.getApplicationContext()
            java.lang.String r4 = "uidb36"
            X.C04220Ms.A0B(r10, r6)
            java.lang.String r3 = "token"
            r1 = 2
            X.C04220Ms.A0B(r9, r1)
            java.lang.String r2 = "source"
            X.AnonymousClass0wJ.A1R(r8, r7)
            X.H1T r6 = X.AnonymousClass0wJ.A0O(r0)
            java.lang.String r1 = "accounts/password_reset/"
            r6.A0J(r1)
            r6.A0O(r3, r9)
            r6.A0O(r4, r10)
            java.lang.String r4 = X.C18220wO.A0g(r7, r6, r2, r8)
            r3 = 0
            r2 = 9
            r1 = 48
            java.lang.String r1 = X.C61983Wp.A01(r3, r2, r1)
            X.AnonymousClass269.A0A(r6, r1, r4)
            java.lang.Class<X.1Tq> r2 = X.C22171Tq.class
            java.lang.Class<X.3Ps> r1 = X.C60593Ps.class
            X.H8c r4 = X.AnonymousClass0wJ.A0T(r6, r2, r1)
            X.0m7 r3 = r5.getSupportFragmentManager()
            android.content.Context r2 = r5.getApplicationContext()
            X.1ua r1 = new X.1ua
            r1.<init>(r2, r3, r5, r0)
            r4.A00 = r1
            r5.schedule(r4)
            goto L_0x00c0
        L_0x026f:
            X.1c4 r6 = new X.1c4
            r6.<init>()
            java.lang.String r0 = r3.getString(r4)
            if (r0 == 0) goto L_0x028b
            java.lang.String r0 = r3.getString(r4)
            java.lang.String r1 = "fxcal"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x028b
            java.lang.String r0 = "flow_id"
            r3.putString(r0, r1)
        L_0x028b:
            r3.remove(r4)
            X.3V1 r4 = X.AnonymousClass3V1.A00(r3)
            android.os.Bundle r2 = r4.A00
            java.lang.String r0 = "RECOVERY_TYPE"
            java.lang.String r1 = X.C18240wQ.A0g(r0)
            java.lang.String r0 = "LINK"
            java.lang.String r0 = X.C18240wQ.A0g(r0)
            r2.putString(r1, r0)
            r4.A01()
            android.os.Bundle r0 = X.C18180wK.A06()
            r0.putAll(r2)
            r3.putAll(r0)
            r6.setArguments(r3)
            X.01J r1 = X.C18220wO.A0L(r5)
            r0 = 2131302403(0x7f091803, float:1.8222891E38)
            r1.A0D(r6, r0)
            r1.A00()
            goto L_0x00c0
        L_0x02c2:
            java.lang.String r0 = r1.getToken()
            goto L_0x00aa
        L_0x02c8:
            java.util.List r7 = r1.getPathSegments()
            int r2 = r7.size()
            r0 = 4
            if (r2 != r0) goto L_0x0304
            android.os.Bundle r8 = X.C18180wK.A06()
            java.lang.String r0 = "uidb36"
            java.lang.String r6 = r1.getQueryParameter(r0)
            java.lang.String r0 = "token"
            java.lang.String r2 = r1.getQueryParameter(r0)
            if (r6 == 0) goto L_0x036b
            if (r2 == 0) goto L_0x036b
            java.lang.String r0 = "s"
            java.lang.String r0 = r1.getQueryParameter(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x033e
            r12 = 36
            long r0 = java.lang.Long.parseLong(r6, r12)
            java.lang.String r0 = java.lang.Long.toString(r0)
            java.lang.String r6 = "argument_user_id"
            r8.putString(r6, r0)
            goto L_0x0086
        L_0x0304:
            int r2 = r7.size()
            r0 = 6
            if (r2 != r0) goto L_0x032a
            android.os.Bundle r8 = X.C18180wK.A06()
            r0 = 4
            java.lang.String r0 = X.C18190wL.A0p(r7, r0)
            r12 = 36
            long r0 = java.lang.Long.parseLong(r0, r12)
            java.lang.String r0 = java.lang.Long.toString(r0)
            java.lang.String r6 = "argument_user_id"
            r8.putString(r6, r0)
            r0 = 5
            java.lang.String r2 = X.C18190wL.A0p(r7, r0)
            goto L_0x0086
        L_0x032a:
            int r2 = r7.size()
            r0 = 2
            if (r2 != r0) goto L_0x036b
            r0 = 1
            java.lang.String r2 = X.C18190wL.A0p(r7, r0)
            java.lang.String r0 = "password_reset"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x036b
        L_0x033e:
            android.os.Bundle r8 = X.C18180wK.A06()
            java.lang.String r0 = "uidb36"
            java.lang.String r0 = r1.getQueryParameter(r0)
            r5.A02 = r0
            java.lang.String r0 = "token"
            java.lang.String r2 = r1.getQueryParameter(r0)
            java.lang.String r0 = "s"
            java.lang.String r0 = r1.getQueryParameter(r0)
            r5.A01 = r0
            java.lang.String r0 = r5.A02
            r12 = 36
            long r0 = java.lang.Long.parseLong(r0, r12)
            java.lang.String r0 = java.lang.Long.toString(r0)
            java.lang.String r6 = "argument_user_id"
            r8.putString(r6, r0)
            goto L_0x0086
        L_0x036b:
            r5.finish()
            r0 = -1576846137(0xffffffffa2033cc7, float:-1.7785986E-18)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.passwordreset.PasswordResetExternalUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }
}
