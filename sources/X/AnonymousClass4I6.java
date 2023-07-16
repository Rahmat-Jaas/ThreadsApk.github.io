package X;

import android.app.Activity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4I6  reason: invalid class name */
public final class AnonymousClass4I6 implements C82924qU {
    public final Activity A00;
    public final UserSession A01;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (java.util.regex.Pattern.compile(".*survey.instagram.com.*").matcher(r6).find() == false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BN1(android.net.Uri r22, android.os.Bundle r23) {
        /*
            r21 = this;
            java.lang.String r0 = "url"
            r1 = r22
            java.lang.String r6 = r1.getQueryParameter(r0)
            if (r6 == 0) goto L_0x001b
            java.lang.String r0 = ".*survey.instagram.com.*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r0 = r0.matcher(r6)
            boolean r0 = r0.find()
            r4 = 1
            if (r0 != 0) goto L_0x001c
        L_0x001b:
            r4 = 0
        L_0x001c:
            r0 = r21
            android.app.Activity r3 = r0.A00
            com.instagram.service.session.UserSession r2 = r0.A01
            r7 = 0
            r10 = 1
            r11 = 0
            com.instagram.simplewebview.SimpleWebViewConfig r5 = new com.instagram.simplewebview.SimpleWebViewConfig
            r8 = r7
            r9 = r7
            r12 = r10
            r13 = r11
            r14 = r11
            r15 = r10
            r16 = r11
            r17 = r10
            r18 = r11
            r19 = r11
            r20 = r11
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r1 = 5652(0x1614, float:7.92E-42)
            X.3Xr r0 = com.instagram.simplewebview.SimpleWebViewActivity.A01
            if (r4 == 0) goto L_0x0048
            android.content.Intent r0 = X.AnonymousClass3Xr.A00(r3, r2, r5)
            X.C10650ih.A08(r3, r0, r1)
            return
        L_0x0048:
            r0.A02(r3, r2, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4I6.BN1(android.net.Uri, android.os.Bundle):void");
    }

    public AnonymousClass4I6(Activity activity, UserSession userSession) {
        this.A00 = activity;
        this.A01 = userSession;
    }
}
