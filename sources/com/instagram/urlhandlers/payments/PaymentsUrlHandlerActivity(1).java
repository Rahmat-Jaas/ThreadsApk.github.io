package com.instagram.urlhandlers.payments;

import X.C10300i6;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public class PaymentsUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0075, code lost:
        if (r0 == false) goto L_0x0077;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            r0 = 1923392144(0x72a4a290, float:6.5218647E30)
            int r5 = X.C14030oh.A00(r0)
            super.onCreate(r10)
            android.content.Intent r0 = r9.getIntent()
            java.lang.String r8 = "com.instagram.url.extra.BUNDLE"
            android.os.Bundle r2 = r0.getBundleExtra(r8)
            if (r2 == 0) goto L_0x009b
            java.lang.String r1 = "original_url"
            boolean r0 = X.C18240wQ.A1T(r2, r1)
            if (r0 != 0) goto L_0x009b
            X.0i6 r0 = X.C18190wL.A0S(r2)
            r9.A00 = r0
            java.lang.String r0 = r2.getString(r1)
            android.net.Uri r0 = X.C15430rJ.A01(r0)
            android.os.Bundle r6 = X.C18190wL.A0C(r9)
            r6.getClass()
            android.os.Bundle r4 = X.C18180wK.A06()
            java.lang.String r3 = r0.getHost()
            java.lang.String r1 = "fbpay_hub"
            r7 = r1
            boolean r0 = r3.equals(r1)
            java.lang.String r2 = "PAYMENTS_URL_TYPE"
            if (r0 != 0) goto L_0x0097
            java.lang.String r1 = "settings_payments"
            boolean r0 = r3.equals(r1)
            if (r0 != 0) goto L_0x0097
            r4 = 0
        L_0x004f:
            r6.putAll(r4)
            X.0i6 r1 = r9.A00
            boolean r0 = r1 instanceof com.instagram.service.session.UserSession
            if (r0 != 0) goto L_0x0062
            X.AnonymousClass3YR.A00(r9, r6, r1)
        L_0x005b:
            r0 = 366718100(0x15dbac94, float:8.8725676E-26)
        L_0x005e:
            X.C14030oh.A07(r0, r5)
            return
        L_0x0062:
            java.lang.String r4 = r6.getString(r2)
            android.os.Bundle r1 = r6.getBundle(r8)
            r3 = 1
            r2 = 0
            if (r1 == 0) goto L_0x0077
            java.lang.String r0 = "com.instagram.url.extra.IS_ON_CREATE"
            boolean r0 = r1.getBoolean(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0078
        L_0x0077:
            r1 = 0
        L_0x0078:
            X.0i6 r0 = r9.A00
            X.C18180wK.A0w(r6, r0)
            boolean r0 = r4.equals(r7)
            if (r0 != 0) goto L_0x0091
            java.lang.String r0 = "settings_payments"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x005b
            X.0i6 r0 = r9.A00
            X.C63753iH.A0A(r6, r9, r0, r1, r3)
            goto L_0x005b
        L_0x0091:
            X.0i6 r0 = r9.A00
            X.C63753iH.A0A(r6, r9, r0, r1, r2)
            goto L_0x005b
        L_0x0097:
            r4.putString(r2, r1)
            goto L_0x004f
        L_0x009b:
            r9.finish()
            r0 = 499709393(0x1dc8f5d1, float:5.3193727E-21)
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.payments.PaymentsUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }
}
