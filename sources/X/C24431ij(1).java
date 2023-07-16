package X;

import android.app.Activity;
import android.net.Uri;
import android.os.Handler;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.1ij  reason: invalid class name and case insensitive filesystem */
public class C24431ij extends C63873iU {
    public String A00;
    public final Activity A01;
    public final Handler A02;
    public final AnonymousClass3LL A03;
    public final C11630kW A04;
    public final C84634tZ A05;
    public final AnonymousClass3GT A06;
    public final C07530bf A07;
    public final AnonymousClass265 A08;
    public final Integer A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final Uri A0D;
    public final C13330nS A0E;

    public final void A01(User user, AnonymousClass269 r14) {
        USLEBaseShape0S0000000 A0I;
        String str = "";
        if (r14 == AnonymousClass269.LogInSso) {
            double A002 = C18200wM.A00();
            double A003 = AnonymousClass269.A00();
            A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A0E, "log_in_sso"), 2380);
            AnonymousClass269.A05(A0I);
            A0I.A0T("containermodule", "waterfall_log_in");
            AnonymousClass0wJ.A1A(A0I, A002, A003);
            C18240wQ.A13(AnonymousClass280.UNKNOWN, A0I);
            A0I.A0T("login_userid", user.getId());
            C18200wM.A1K(A0I, A003);
            AnonymousClass265 r0 = this.A08;
            if (r0 != null) {
                str = r0.A01;
            }
            C18190wL.A1I(A0I, str);
            C63683i7.A08(A0I);
            C11630kW r02 = this.A04;
            r02.getClass();
            C18180wK.A1C(A0I, r02);
            C63683i7.A09(A0I, this.A07);
            A0I.A0Q("multi_tap_enabled", C18180wK.A0Y());
        } else if (r14 == AnonymousClass269.A0Q) {
            double A004 = C18200wM.A00();
            double A005 = AnonymousClass269.A00();
            A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A0E, "ig_log_in"), 1330);
            AnonymousClass0wJ.A1B(A0I, A004, A005);
            C63683i7.A05(A0I);
            A0I.A0T("instagram_id", user.getId());
            A0I.A0T("login_type", C36142Qe.A00(this.A09));
            C18180wK.A1A(A0I, A005);
            AnonymousClass265 r03 = this.A08;
            if (r03 != null) {
                str = r03.A01;
            }
            AnonymousClass269.A08(A0I, str);
            A0I.A0T("containermodule", "waterfall_log_in");
            C63683i7.A09(A0I, this.A07);
        } else {
            C07530bf r5 = this.A07;
            AnonymousClass265 r04 = this.A08;
            if (r04 != null) {
                str = r04.A01;
            }
            String id = user.getId();
            AnonymousClass0wJ.A1N(r5, str);
            C54182z2.A00(r5, (AnonymousClass3V1) null, str, id, (String) null, (String) null, (String) null);
            return;
        }
        A0I.Bb4();
    }

    public void A03(UserSession userSession, User user) {
        C67323zM.A06(this.A01, this.A0D, this.A04, userSession);
    }

    public C24431ij(Activity activity, Uri uri, C11630kW r4, C84634tZ r5, AnonymousClass3GT r6, C07530bf r7, AnonymousClass265 r8, Integer num, String str, String str2, String str3) {
        this.A02 = AnonymousClass0wJ.A0F();
        this.A03 = new AnonymousClass3LL();
        this.A00 = "other";
        this.A07 = r7;
        this.A01 = activity;
        this.A08 = r8;
        this.A04 = r4;
        this.A09 = num;
        this.A0A = str;
        this.A05 = r5;
        this.A0D = uri;
        this.A0E = C13330nS.A01(r4, r7);
        this.A0C = str2;
        this.A0B = str3;
        this.A06 = r6;
    }

    public void A02(C26641qy r7) {
        int i;
        int A032 = C14030oh.A03(-1814401752);
        Activity activity = this.A01;
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            i = 1332225129;
        } else {
            C07530bf r4 = this.A07;
            AnonymousClass01V.A0p.markerAnnotate(2293785, "login_type", C36142Qe.A00(this.A09));
            AnonymousClass1mV r3 = new AnonymousClass1mV(r7, this);
            if (C63803iN.A0E(AnonymousClass0TJ.A05, r4, 36312251975598980L)) {
                AnonymousClass0gN.A00().AKp(r3);
            } else {
                r3.run();
            }
            i = 824890844;
        }
        C14030oh.A0A(i, A032);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0072, code lost:
        if (((X.AnonymousClass1TP) r3).A02 == false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00cc, code lost:
        if ((r4.getCause() instanceof java.lang.SecurityException) == false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a1, code lost:
        if (r2.isCheckpointRequired() != false) goto L_0x00eb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onFail(X.AnonymousClass3XX r25) {
        /*
            r24 = this;
            r0 = -250697028(0xfffffffff10eaabc, float:-7.064524E29)
            int r8 = X.C14030oh.A03(r0)
            r0 = r24
            android.app.Activity r1 = r0.A01
            if (r1 == 0) goto L_0x01a9
            boolean r2 = r1.isFinishing()
            if (r2 != 0) goto L_0x01a9
            boolean r2 = r1.isDestroyed()
            if (r2 != 0) goto L_0x01a9
            X.0bf r7 = r0.A07
            X.01V r6 = X.AnonymousClass01V.A0p
            java.lang.Integer r5 = r0.A09
            r4 = 2293785(0x230019, float:3.214277E-39)
            java.lang.String r3 = X.C36142Qe.A00(r5)
            java.lang.String r2 = "login_type"
            r6.markerAnnotate((int) r4, (java.lang.String) r2, (java.lang.String) r3)
            r2 = 3
            r6.markerEnd(r4, r2)
            java.lang.Integer r2 = X.AnonymousClass006.A0C
            if (r5 == r2) goto L_0x0036
            X.C63593hs.A02()
        L_0x0036:
            java.lang.String r2 = r0.A0B
            if (r2 == 0) goto L_0x004f
            X.3Yh r9 = X.C62323Yh.A00
            X.265 r2 = r0.A08
            if (r2 != 0) goto L_0x01a5
            java.lang.String r2 = ""
        L_0x0042:
            java.lang.String r14 = "registration_flow"
            java.lang.String r15 = "ar_code_sms"
            java.lang.String r12 = "client_reg_invalid_login_response"
            java.lang.String r13 = "login failed during auto conf reg"
            r10 = r7
            r11 = r2
            r9.A03(r10, r11, r12, r13, r14, r15)
        L_0x004f:
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r6 = r25
            java.lang.Throwable r4 = r6.A01
            boolean r14 = X.AnonymousClass0wJ.A1W(r4)
            java.lang.Object r3 = r6.A00
            if (r3 == 0) goto L_0x0074
            r2 = r3
            X.1TP r2 = (X.AnonymousClass1TP) r2
            boolean r2 = r2.A02
            r22 = 1
            if (r2 != 0) goto L_0x0076
        L_0x0074:
            r22 = 0
        L_0x0076:
            r2 = r3
            X.1j3 r2 = (X.AnonymousClass1j3) r2
            if (r3 == 0) goto L_0x00ab
            if (r2 == 0) goto L_0x00ab
            boolean r16 = r2.isCheckpointRequired()
            java.lang.String r5 = "invalid_one_tap_nonce"
            boolean r19 = r2.hasErrorType(r5)
            java.lang.String r5 = "invalid_google_token_nonce"
            boolean r18 = r2.hasErrorType(r5)
            java.lang.String r5 = "bad_password"
            boolean r15 = r2.hasErrorType(r5)
            java.lang.String r5 = "invalid_user"
            boolean r21 = r2.hasErrorType(r5)
            java.lang.String r5 = "inactive user"
            boolean r17 = r2.hasErrorType(r5)
            java.lang.String r5 = "invalid_trusted_device"
            boolean r20 = r2.hasErrorType(r5)
            java.lang.String r5 = "unusable_password"
            boolean r23 = r2.hasErrorType(r5)
        L_0x00ab:
            X.3GF r12 = new X.3GF
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.String r9 = r12.toString()
            java.lang.String r5 = "LoginFailed"
            X.AnonymousClass0LU.A0E(r5, r9, r4)
            boolean r5 = r12.A01
            if (r5 == 0) goto L_0x00f2
            if (r4 == 0) goto L_0x00ce
            java.lang.Throwable r0 = r4.getCause()
            if (r0 == 0) goto L_0x00ce
            java.lang.Throwable r0 = r4.getCause()
            boolean r0 = r0 instanceof java.lang.SecurityException
            r2 = 1
            if (r0 != 0) goto L_0x00cf
        L_0x00ce:
            r2 = 0
        L_0x00cf:
            r0 = 2131826851(0x7f1118a3, float:1.9286598E38)
            java.lang.String r3 = r1.getString(r0)
            r0 = 2131831662(0x7f112b6e, float:1.9296356E38)
            if (r2 == 0) goto L_0x00de
            r0 = 2131835359(0x7f1139df, float:1.9303854E38)
        L_0x00de:
            java.lang.String r2 = r1.getString(r0)
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L_0x00eb
            X.C62973bE.A04(r1, r2, r3)
        L_0x00eb:
            r0 = -1754235413(0xffffffff97707deb, float:-7.7707113E-25)
        L_0x00ee:
            X.C14030oh.A0A(r0, r8)
            return
        L_0x00f2:
            X.4tZ r9 = r0.A05
            if (r9 == 0) goto L_0x0139
            r4 = r3
            X.1TP r4 = (X.AnonymousClass1TP) r4
            if (r4 == 0) goto L_0x0139
            X.3DR r10 = r4.A01
            if (r10 == 0) goto L_0x0139
            boolean r5 = r12.A09
            if (r5 == 0) goto L_0x0139
            java.lang.String r1 = "two_factor_required"
            r0.A00 = r1
            if (r10 == 0) goto L_0x011a
            java.lang.String r2 = r10.A01
            java.lang.String r1 = r10.A03
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x011a
            X.3YZ r0 = X.C62653aT.A02()
            r0.A02(r2, r1)
        L_0x011a:
            X.3DR r1 = r4.A01
            boolean r0 = r1.A09
            if (r0 == 0) goto L_0x0135
            java.lang.String r0 = r1.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0135
            X.3YZ r2 = X.C62653aT.A02()
            X.3DR r0 = r4.A01
            java.lang.String r1 = r0.A01
            java.lang.String r0 = r0.A04
            r2.A03(r1, r0)
        L_0x0135:
            r9.CM6(r4, r7)
            goto L_0x00eb
        L_0x0139:
            if (r3 == 0) goto L_0x00ce
            boolean r4 = r12.A03
            if (r4 != 0) goto L_0x019d
            boolean r4 = r12.A06
            if (r4 != 0) goto L_0x019d
            boolean r4 = r12.A05
            if (r4 != 0) goto L_0x019d
            X.1qy r3 = (X.C26641qy) r3
            java.lang.String r10 = r3.A03
            boolean r2 = r12.A02
            if (r2 == 0) goto L_0x0182
            if (r9 == 0) goto L_0x0182
            boolean r2 = r3.A0C
            if (r2 == 0) goto L_0x0191
            java.util.concurrent.atomic.AtomicBoolean r11 = X.C18230wP.A0w()
            android.os.Handler r7 = r0.A02
            X.4T7 r5 = new X.4T7
            r13 = r5
            r14 = r6
            r15 = r12
            r16 = r0
            r17 = r10
            r18 = r11
            r13.<init>(r14, r15, r16, r17, r18)
            long r1 = android.os.SystemClock.uptimeMillis()
            r3 = 150(0x96, double:7.4E-322)
            long r1 = r1 + r3
            r7.postAtTime(r5, r11, r1)
            X.3Fr r1 = new X.3Fr
            r2 = r6
            r3 = r12
            r4 = r0
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r9.C5y(r1)
            goto L_0x00eb
        L_0x0182:
            boolean r2 = r12.A07
            if (r2 == 0) goto L_0x0191
            java.lang.String r1 = r12.toString()
            java.lang.String r0 = "Trusted device login"
            X.C10450iM.A03(r0, r1)
            goto L_0x00eb
        L_0x0191:
            java.lang.String r0 = r0.A0A
            r2 = r12
            r4 = r9
            r5 = r7
            r6 = r0
            r7 = r10
            X.AnonymousClass3NC.A01(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x00eb
        L_0x019d:
            boolean r0 = r2.isCheckpointRequired()
            if (r0 == 0) goto L_0x00ce
            goto L_0x00eb
        L_0x01a5:
            java.lang.String r2 = r2.A01
            goto L_0x0042
        L_0x01a9:
            r0 = -439196809(0xffffffffe5d26377, float:-1.2419147E23)
            goto L_0x00ee
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24431ij.onFail(X.3XX):void");
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C14030oh.A0A(-151875483, C63873iU.A04(this, obj, -1616027747));
    }

    public C24431ij(Activity activity, Uri uri, C11630kW r15, C84634tZ r16, C07530bf r17, AnonymousClass265 r18, Integer num, String str) {
        this(activity, uri, r15, r16, (AnonymousClass3GT) null, r17, r18, num, str, (String) null, (String) null);
    }
}
