package X;

import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.login.LoginClient$Request;

/* renamed from: X.3zm  reason: invalid class name and case insensitive filesystem */
public final class C67573zm implements C83314rB, CallerContextable {
    public static final CallerContext A03 = CallerContext.A00(C67573zm.class);
    public static final String __redex_internal_original_name = "FxCalLoginMethodHandler";
    public AnonymousClass3Z5 A00;
    public AnonymousClass3Z5 A01;
    public C10300i6 A02;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Bja(android.content.Intent r14, int r15, int r16) {
        /*
            r13 = this;
            X.3Z5 r0 = r13.A01
            com.facebook.login.LoginClient$Request r1 = r0.A01
            java.lang.String r2 = "Operation canceled"
            if (r14 == 0) goto L_0x001f
            java.lang.String r0 = "bloks_on_activity_result"
            java.io.Serializable r5 = r14.getSerializableExtra(r0)
            java.util.AbstractMap r5 = (java.util.AbstractMap) r5
            if (r5 == 0) goto L_0x00bc
            java.lang.String r0 = "error"
            java.lang.String r3 = X.C18240wQ.A0f(r0, r5)
        L_0x0018:
            r4 = r16
            if (r16 != 0) goto L_0x002c
            if (r3 == 0) goto L_0x001f
            r2 = r3
        L_0x001f:
            com.facebook.login.LoginClient$Result r0 = com.facebook.login.LoginClient$Result.A01(r1, r2)
        L_0x0023:
            if (r0 == 0) goto L_0x00a8
            X.3Z5 r1 = r13.A00
            r1.A04(r0)
        L_0x002a:
            r0 = 1
            return r0
        L_0x002c:
            r0 = -1
            if (r4 != r0) goto L_0x00af
            if (r5 == 0) goto L_0x00af
            java.lang.String r4 = "userID"
            java.lang.String r0 = "error"
            java.lang.String r3 = X.C18240wQ.A0f(r0, r5)
            java.lang.String r2 = ""
            if (r3 != 0) goto L_0x008c
            java.lang.String r0 = "tokenString"
            java.lang.Object r6 = r5.get(r0)     // Catch:{ 4VW -> 0x0078 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ 4VW -> 0x0078 }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ 4VW -> 0x0078 }
            if (r0 == 0) goto L_0x0053
            java.lang.String r3 = "Token is null"
            r0 = 0
            com.facebook.login.LoginClient$Result r0 = com.facebook.login.LoginClient$Result.A02(r1, r3, r2, r0)     // Catch:{ 4VW -> 0x0078 }
            goto L_0x0023
        L_0x0053:
            java.lang.Object r0 = r5.get(r4)     // Catch:{ 4VW -> 0x0078 }
            if (r0 != 0) goto L_0x005b
            r8 = r2
            goto L_0x005f
        L_0x005b:
            java.lang.String r8 = X.C18240wQ.A0f(r4, r5)     // Catch:{ 4VW -> 0x0078 }
        L_0x005f:
            java.lang.String r7 = X.C60943Re.A02     // Catch:{ 4VW -> 0x0078 }
            X.1zH r0 = X.C29771zH.A02     // Catch:{ 4VW -> 0x0078 }
            java.util.List r9 = r0.A00     // Catch:{ 4VW -> 0x0078 }
            r10 = 0
            java.lang.Integer r5 = X.AnonymousClass006.A1C     // Catch:{ 4VW -> 0x0078 }
            java.util.Date r12 = new java.util.Date     // Catch:{ 4VW -> 0x0078 }
            r12.<init>()     // Catch:{ 4VW -> 0x0078 }
            com.facebook.AccessToken r4 = new com.facebook.AccessToken     // Catch:{ 4VW -> 0x0078 }
            r11 = r10
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ 4VW -> 0x0078 }
            com.facebook.login.LoginClient$Result r0 = com.facebook.login.LoginClient$Result.A00(r4, r1)     // Catch:{ 4VW -> 0x0078 }
            goto L_0x0023
        L_0x0078:
            r3 = move-exception
            java.lang.String r0 = r3.getMessage()
            if (r0 == 0) goto L_0x0089
            java.lang.String r3 = r3.getMessage()
        L_0x0083:
            r0 = 0
            com.facebook.login.LoginClient$Result r0 = com.facebook.login.LoginClient$Result.A02(r1, r2, r3, r0)
            goto L_0x0023
        L_0x0089:
            java.lang.String r3 = "Token invalid"
            goto L_0x0083
        L_0x008c:
            java.util.Collection r0 = X.AnonymousClass3RT.A00
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L_0x00a8
            java.util.Collection r0 = X.AnonymousClass3RT.A01
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x00a1
            com.facebook.login.LoginClient$Result r0 = com.facebook.login.LoginClient$Result.A01(r1, r3)
            goto L_0x0023
        L_0x00a1:
            r0 = 0
            com.facebook.login.LoginClient$Result r0 = com.facebook.login.LoginClient$Result.A02(r1, r3, r2, r0)
            goto L_0x0023
        L_0x00a8:
            X.3Z5 r0 = r13.A00
            r0.A02()
            goto L_0x002a
        L_0x00af:
            if (r3 != 0) goto L_0x00b3
            java.lang.String r3 = "Operation failed"
        L_0x00b3:
            java.lang.String r2 = ""
            r0 = 0
            com.facebook.login.LoginClient$Result r0 = com.facebook.login.LoginClient$Result.A02(r1, r3, r2, r0)
            goto L_0x0023
        L_0x00bc:
            r3 = 0
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67573zm.Bja(android.content.Intent, int, int):boolean");
    }

    public final void D7o(LoginClient$Request loginClient$Request) {
        try {
            Fragment fragment = this.A01.A06;
            if (loginClient$Request.A01 == null) {
                loginClient$Request.A01 = "ig_default";
            }
            C58173Ej A002 = C35762Os.A00();
            if (A002.A00 == null) {
                A002.A00 = new C35752Or();
            }
            new C26161q9().A00(fragment, this.A02, loginClient$Request.A01, (String) null, 64206);
        } catch (Exception unused) {
            this.A00.A02();
        }
    }

    public C67573zm(AnonymousClass3Z5 r1, C10300i6 r2) {
        this.A01 = r1;
        this.A00 = r1;
        this.A02 = r2;
    }
}
