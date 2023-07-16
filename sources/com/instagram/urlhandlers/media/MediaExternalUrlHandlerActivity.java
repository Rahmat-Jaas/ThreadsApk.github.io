package com.instagram.urlhandlers.media;

import X.C10300i6;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public class MediaExternalUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onBackPressed() {
        super.onBackPressed();
        if (getSupportFragmentManager().A0T.A04().isEmpty()) {
            finish();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        if (r1 != null) goto L_0x007a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            r0 = 493567597(0x1d6b3e6d, float:3.1134264E-21)
            int r2 = X.C14030oh.A00(r0)
            super.onCreate(r10)
            android.os.Bundle r3 = X.AnonymousClass0wJ.A0C(r9)
            if (r3 != 0) goto L_0x001a
            r9.finish()
            r0 = 1016621029(0x3c9867e5, float:0.018604228)
        L_0x0016:
            X.C14030oh.A07(r0, r2)
            return
        L_0x001a:
            X.0i6 r0 = X.C18190wL.A0S(r3)
            r9.A00 = r0
            java.lang.String r1 = X.C18190wL.A0i(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0031
            r9.finish()
            r0 = -1173710205(0xffffffffba0a9a83, float:-5.287306E-4)
            goto L_0x0016
        L_0x0031:
            android.net.Uri r5 = X.C15430rJ.A01(r1)
            java.lang.String r1 = r5.getScheme()
            java.lang.String r0 = "https"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x00cc
            java.lang.String r0 = "http"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x00cc
            java.lang.String r0 = "instagram"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x00de
            java.lang.String r0 = "id"
            java.lang.String r0 = r5.getQueryParameter(r0)
            if (r0 != 0) goto L_0x00b3
            java.lang.String r0 = "shortcode"
            java.lang.String r0 = r5.getQueryParameter(r0)
            if (r0 != 0) goto L_0x00b3
            java.lang.String r0 = "raw_id"
            java.lang.String r1 = r5.getQueryParameter(r0)
            if (r1 == 0) goto L_0x00de
            android.os.Bundle r4 = X.C18180wK.A06()
            java.lang.String r0 = "com.instagram.url.constants.ARGUMENTS_KEY_MEDIA_ID"
        L_0x006f:
            r4.putString(r0, r1)
            java.lang.String r0 = "media_surface"
            java.lang.String r1 = r5.getQueryParameter(r0)
            if (r1 == 0) goto L_0x007f
        L_0x007a:
            java.lang.String r0 = "com.instagram.url.constants.ARGUMENTS_MEDIA_SURFACE"
            r4.putString(r0, r1)
        L_0x007f:
            java.util.Set r0 = r5.getQueryParameterNames()
            java.lang.String r1 = "carousel_share_child_media_id"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0094
            java.lang.String r1 = r5.getQueryParameter(r1)
            java.lang.String r0 = "com.instagram.url.constants.ARGUMENTS_CAROUSEL_CHILD_MEDIA_ID"
            r4.putString(r0, r1)
        L_0x0094:
            r3.putAll(r4)
            X.0i6 r1 = r9.A00
            boolean r0 = r1 instanceof com.instagram.service.session.UserSession
            if (r0 != 0) goto L_0x00af
            r1 = 1
            java.lang.String r0 = "ARGUMENT_SHOW_LOGIN_FOR_CONTENT_DIALOG"
            r3.putBoolean(r0, r1)
            X.3YR r1 = X.AnonymousClass3YR.A00
            X.0i6 r0 = r9.A00
            r1.A02(r9, r3, r0)
        L_0x00aa:
            r0 = -1894487147(0xffffffff8f146b95, float:-7.317683E-30)
            goto L_0x0016
        L_0x00af:
            X.C63753iH.A07(r3, r9, r1)
            goto L_0x00aa
        L_0x00b3:
            android.os.Bundle r4 = X.C18180wK.A06()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "https://instagram.com/p/%s"
            java.lang.String r0 = X.C18180wK.A0j(r0, r1)
            android.net.Uri r0 = X.C15430rJ.A01(r0)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "com.instagram.url.constants.ARGUMENTS_KEY_MEDIA_SHORT_URL"
            goto L_0x006f
        L_0x00cc:
            java.util.List r4 = r5.getPathSegments()
            int r1 = r4.size()
            r0 = 2
            if (r1 == r0) goto L_0x00e6
            int r1 = r4.size()
            r0 = 3
            if (r1 == r0) goto L_0x00e6
        L_0x00de:
            r9.finish()
            r0 = 1465556593(0x575a9e71, float:2.40374036E14)
            goto L_0x0016
        L_0x00e6:
            r0 = 0
            java.lang.String r0 = X.C18190wL.A0p(r4, r0)
            java.lang.String r1 = "p"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0105
            r0 = 1
            java.lang.String r0 = X.C18190wL.A0p(r4, r0)
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x00de
            X.0i6 r1 = r9.A00
            java.lang.String r0 = "MediaExternalUrlHandler"
            X.C63753iH.A05(r5, r1, r0)
        L_0x0105:
            android.os.Bundle r4 = X.C18180wK.A06()
            java.lang.String r1 = X.C18190wL.A0n(r5)
            java.lang.String r8 = "applink"
            r7 = 0
            int r6 = X.AnonymousClass8bP.A0J(r1, r8, r7, r7)
            r0 = -1
            if (r6 == r0) goto L_0x011d
            java.lang.String r0 = "www"
            java.lang.String r1 = X.AnonymousClass8bQ.A0l(r1, r8, r0, r7)
        L_0x011d:
            java.lang.String r0 = "com.instagram.url.constants.ARGUMENTS_KEY_MEDIA_SHORT_URL"
            r4.putString(r0, r1)
            java.util.Set r0 = r5.getQueryParameterNames()
            java.lang.String r1 = "feed_type"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0142
            java.lang.String r1 = r5.getQueryParameter(r1)
            java.lang.String r0 = "com.instagram.url.constants.ARGUMENTS_KEY_FEED_TYPE"
            r4.putString(r0, r1)
            java.lang.String r0 = "id"
            java.lang.String r1 = r5.getQueryParameter(r0)
            java.lang.String r0 = "com.instagram.url.constants.ARGUMENTS_KEY_THREAD_ID"
            r4.putString(r0, r1)
        L_0x0142:
            java.lang.String r1 = "media_surface"
            java.lang.String r0 = r5.getQueryParameter(r1)
            if (r0 == 0) goto L_0x007f
            java.lang.String r1 = r5.getQueryParameter(r1)
            goto L_0x007a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.media.MediaExternalUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }
}
