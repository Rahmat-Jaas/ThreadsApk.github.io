package com.instagram.urlhandlers.igtv;

import X.C10300i6;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public class IGTVExternalUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0095, code lost:
        if (r2 != false) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            r0 = -2027743217(0xffffffff8723180f, float:-1.2269827E-34)
            int r5 = X.C14030oh.A00(r0)
            super.onCreate(r9)
            android.os.Bundle r6 = X.AnonymousClass0wJ.A0C(r8)
            if (r6 == 0) goto L_0x00ba
            java.lang.String r1 = "original_url"
            boolean r0 = X.C18240wQ.A1T(r6, r1)
            if (r0 != 0) goto L_0x00ba
            X.0i6 r0 = X.C18190wL.A0S(r6)
            r8.A00 = r0
            java.lang.String r1 = r6.getString(r1)
            android.os.Bundle r4 = X.C18180wK.A06()
            if (r1 == 0) goto L_0x0054
            X.0si r0 = X.AnonymousClass313.A00
            r7 = 1
            android.net.Uri r3 = X.C15430rJ.A00(r0, r1, r7)
            if (r3 == 0) goto L_0x0054
            java.util.List r2 = r3.getPathSegments()
            int r0 = r2.size()
            int r0 = r0 - r7
            java.lang.String r0 = X.C18190wL.A0p(r2, r0)
            int r1 = r0.length()
            r0 = 28
            if (r1 > r0) goto L_0x00ab
            int r0 = r2.size()
            int r0 = r0 - r7
            java.lang.String r1 = X.C18190wL.A0p(r2, r0)
            java.lang.String r0 = "igtv_deeplink_short_url_arg"
            r4.putString(r0, r1)
        L_0x0054:
            r6.putAll(r4)
            java.lang.String r0 = "igtv_deeplink_short_url_arg"
            java.lang.String r3 = r6.getString(r0)
            java.lang.String r0 = "igtv_deeplink_should_open_in_browser"
            boolean r2 = r6.getBoolean(r0)
            X.0i6 r1 = r8.A00
            boolean r0 = r1 instanceof com.instagram.service.session.UserSession
            if (r0 != 0) goto L_0x0073
            X.AnonymousClass3YR.A00(r8, r6, r1)
        L_0x006c:
            r0 = -1343150069(0xffffffffaff1280b, float:-4.3866097E-10)
        L_0x006f:
            X.C14030oh.A07(r0, r5)
            return
        L_0x0073:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0095
            if (r2 != 0) goto L_0x0097
            android.content.Intent r2 = X.C62333Yi.A00(r8)
            java.lang.String r0 = "instagram://tv_viewer"
            android.net.Uri$Builder r1 = X.C18220wO.A0E(r0)
            java.lang.String r0 = "short_url"
            android.net.Uri r0 = X.C18220wO.A0F(r1, r0, r3)
            r2.setData(r0)
            X.C10650ih.A02(r8, r2)
        L_0x0091:
            r8.finish()
            goto L_0x006c
        L_0x0095:
            if (r2 == 0) goto L_0x006c
        L_0x0097:
            X.0i6 r3 = r8.A00
            java.lang.String r0 = "igtv_deeplink_full_url_arg"
            java.lang.String r2 = r6.getString(r0)
            java.lang.String r0 = "com.instagram.url.constants.ARGUMENTS_KEY_ANALYTICS_MODULE_NAME"
            java.lang.String r1 = r6.getString(r0)
            X.9wF r0 = X.C171209wF.A1H
            X.C63753iH.A03(r8, r3, r0, r2, r1)
            goto L_0x0091
        L_0x00ab:
            java.lang.String r1 = r3.toString()
            java.lang.String r0 = "igtv_deeplink_full_url_arg"
            r4.putString(r0, r1)
            java.lang.String r0 = "igtv_deeplink_should_open_in_browser"
            r4.putBoolean(r0, r7)
            goto L_0x0054
        L_0x00ba:
            r8.finish()
            r0 = 532921218(0x1fc3bb82, float:8.289592E-20)
            goto L_0x006f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.igtv.IGTVExternalUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }
}
