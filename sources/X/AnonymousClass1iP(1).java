package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.1iP  reason: invalid class name */
public final class AnonymousClass1iP extends C63873iU {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C84274ss A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public AnonymousClass1iP(Context context, C84274ss r2, UserSession userSession, String str, String str2, String str3, String str4, String str5) {
        this.A01 = r2;
        this.A02 = userSession;
        this.A04 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A03 = str4;
        this.A00 = context;
        this.A05 = str5;
    }

    public final void onFail(AnonymousClass3XX r3) {
        int A032 = C14030oh.A03(1876076907);
        super.onFail(r3);
        this.A01.CGF();
        C14030oh.A0A(-1420724449, A032);
    }

    public final void onFinish() {
        int A032 = C14030oh.A03(53270004);
        this.A01.CGO();
        C14030oh.A0A(-184697449, A032);
    }

    public final void onStart() {
        int A032 = C14030oh.A03(-2129184137);
        this.A01.CGY();
        C14030oh.A0A(-112869823, A032);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:14|15|16|(1:18)|19|20|(1:22)|23|24|(1:26)|27|28|(1:30)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0064 */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006a A[Catch:{ 2Ah -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = -507681677(0xffffffffe1bd6473, float:-4.367091E20)
            int r6 = X.C14030oh.A03(r0)
            X.1Sw r12 = (X.C21971Sw) r12
            r0 = 1136830129(0x43c2a6b1, float:389.30228)
            int r5 = X.C14030oh.A03(r0)
            com.instagram.service.session.UserSession r4 = r11.A02
            com.instagram.user.model.User r3 = X.AnonymousClass0wJ.A0Y(r4)
            r0 = 1
            X.MeW r2 = r3.A05
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.Chy(r0)
            java.lang.String r0 = r11.A04
            if (r0 == 0) goto L_0x0027
            r2.Coe(r0)
        L_0x0027:
            java.lang.String r0 = r11.A06
            if (r0 == 0) goto L_0x002e
            r2.Chb(r0)
        L_0x002e:
            java.lang.String r0 = r11.A07
            if (r0 == 0) goto L_0x0035
            r2.Crd(r0)
        L_0x0035:
            java.lang.String r0 = r11.A03
            if (r0 == 0) goto L_0x003c
            r2.Ciz(r0)
        L_0x003c:
            android.content.Context r9 = r11.A00
            java.lang.String r7 = r11.A05
            if (r7 == 0) goto L_0x0083
            r10 = r7
            java.lang.String r8 = "+"
            boolean r0 = r7.startsWith(r8)     // Catch:{ 2Ah -> 0x0064 }
            if (r0 != 0) goto L_0x004f
            java.lang.String r10 = X.AnonymousClass00U.A0L(r8, r7)     // Catch:{ 2Ah -> 0x0064 }
        L_0x004f:
            com.facebook.phonenumbers.PhoneNumberUtil r1 = com.facebook.phonenumbers.PhoneNumberUtil.A01(r9)     // Catch:{ 2Ah -> 0x0064 }
            java.lang.String r0 = "ZZ"
            X.4Np r0 = r1.A0A(r10, r0)     // Catch:{ 2Ah -> 0x0064 }
            long r0 = r0.A02
            java.lang.String r0 = java.lang.String.valueOf(r0)
            if (r0 == 0) goto L_0x0064
            r2.Cog(r0)
        L_0x0064:
            boolean r0 = r7.startsWith(r8)     // Catch:{ 2Ah -> 0x0083 }
            if (r0 != 0) goto L_0x006e
            java.lang.String r7 = X.AnonymousClass00U.A0L(r8, r7)     // Catch:{ 2Ah -> 0x0083 }
        L_0x006e:
            com.facebook.phonenumbers.PhoneNumberUtil r1 = com.facebook.phonenumbers.PhoneNumberUtil.A01(r9)     // Catch:{ 2Ah -> 0x0083 }
            java.lang.String r0 = "ZZ"
            X.4Np r0 = r1.A0A(r7, r0)     // Catch:{ 2Ah -> 0x0083 }
            int r0 = r0.A00
            java.lang.String r0 = java.lang.String.valueOf(r0)
            if (r0 == 0) goto L_0x0083
            r2.Cof(r0)
        L_0x0083:
            X.C18210wN.A1J(r4, r3)
            X.KHq r1 = X.AnonymousClass3LY.A00(r4)
            X.46E r0 = new X.46E
            r0.<init>(r3)
            r1.CWx(r0)
            X.4ss r0 = r11.A01
            r0.CGe(r12)
            r0 = -513563162(0xffffffffe163a5e6, float:-2.6246032E20)
            X.C14030oh.A0A(r0, r5)
            r0 = -2036042440(0xffffffff86a47538, float:-6.186218E-35)
            X.C14030oh.A0A(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1iP.onSuccess(java.lang.Object):void");
    }
}
