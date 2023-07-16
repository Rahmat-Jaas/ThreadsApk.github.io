package com.instagram.urlhandlers.mediakit;

import X.C10300i6;
import X.C18200wM;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class MediaKitExternalUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return C18200wM.A0W(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006d, code lost:
        if (X.C63803iN.A0E(r2, r3, r0) == false) goto L_0x00a8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            r0 = 1244953671(0x4a347c47, float:2957073.8)
            int r4 = X.C14030oh.A00(r0)
            super.onCreate(r13)
            android.os.Bundle r2 = X.AnonymousClass0wJ.A0C(r12)
            if (r2 == 0) goto L_0x00a8
            java.lang.String r1 = X.C18190wL.A0i(r2)
            if (r1 == 0) goto L_0x00a8
            X.0i6 r3 = X.C18200wM.A0W(r12)
            boolean r0 = r3 instanceof com.instagram.service.session.UserSession
            if (r0 == 0) goto L_0x014f
            r7 = 0
            android.net.Uri r2 = X.C15430rJ.A01(r1)
            if (r2 == 0) goto L_0x00a8
            java.lang.String r5 = r2.getScheme()
            if (r5 == 0) goto L_0x00a8
            int r1 = r5.hashCode()
            r0 = 3213448(0x310888, float:4.503E-39)
            if (r1 == r0) goto L_0x014b
            r0 = 28903346(0x1b907b2, float:6.796931E-38)
            if (r1 == r0) goto L_0x00bc
            r0 = 99617003(0x5f008eb, float:2.2572767E-35)
            if (r1 != r0) goto L_0x00a8
            java.lang.String r0 = "https"
        L_0x0040:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00a8
            java.util.List r0 = r2.getPathSegments()
            X.C04220Ms.A06(r0)
            java.lang.Object r2 = X.AnonymousClass00J.A0F(r0)
            java.lang.String r2 = (java.lang.String) r2
            com.instagram.mediakit.analytics.MediaKitEntryPoint r1 = com.instagram.mediakit.analytics.MediaKitEntryPoint.EXTERNAL_LINK
            if (r2 == 0) goto L_0x00b2
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            com.instagram.mediakit.config.MediaKitConfig r5 = new com.instagram.mediakit.config.MediaKitConfig
            r5.<init>(r1, r7, r2)
        L_0x0060:
            X.0TJ r2 = X.C18180wK.A0J(r3)
            r0 = 36320944989477290(0x8109b5000119aa, double:3.0328500918272963E-306)
        L_0x0069:
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 == 0) goto L_0x00a8
        L_0x006f:
            android.content.Intent r3 = X.C62333Yi.A00(r12)
            java.lang.String r0 = "instagram://mediakit"
            android.net.Uri$Builder r2 = X.C18220wO.A0E(r0)
            java.lang.String r1 = "destination"
            java.lang.String r0 = "view"
            r2.appendQueryParameter(r1, r0)
            java.lang.String r1 = r5.A02
            if (r1 == 0) goto L_0x0089
            java.lang.String r0 = "short_code"
            r2.appendQueryParameter(r0, r1)
        L_0x0089:
            java.lang.String r1 = r5.A01
            if (r1 == 0) goto L_0x0092
            java.lang.String r0 = "id"
            r2.appendQueryParameter(r0, r1)
        L_0x0092:
            com.instagram.mediakit.analytics.MediaKitEntryPoint r0 = r5.A00
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "entry_point"
            r2.appendQueryParameter(r0, r1)
            android.net.Uri r0 = r2.build()
            X.C04220Ms.A06(r0)
            r3.setData(r0)
            X.C10650ih.A02(r12, r3)
        L_0x00a8:
            r12.finish()
        L_0x00ab:
            r0 = 1710778138(0x65f8671a, float:1.466311E23)
            X.C14030oh.A07(r0, r4)
            return
        L_0x00b2:
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            com.instagram.mediakit.config.MediaKitConfig r5 = new com.instagram.mediakit.config.MediaKitConfig
            r5.<init>(r1, r7, r7)
            goto L_0x0060
        L_0x00bc:
            java.lang.String r0 = "instagram"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00a8
            java.lang.String r1 = r2.getHost()
            java.lang.String r0 = "mediakit"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x00a8
            java.lang.String r0 = "destination"
            java.lang.String r9 = r2.getQueryParameter(r0)
            java.lang.String r0 = "id"
            java.lang.String r11 = r2.getQueryParameter(r0)
            java.lang.String r0 = "short_code"
            java.lang.String r10 = r2.getQueryParameter(r0)
            java.lang.String r0 = "entry_point"
            java.lang.String r8 = r2.getQueryParameter(r0)
            com.instagram.mediakit.analytics.MediaKitEntryPoint[] r5 = com.instagram.mediakit.analytics.MediaKitEntryPoint.values()
            int r2 = r5.length
            r1 = 0
        L_0x00ee:
            if (r1 >= r2) goto L_0x00fd
            r6 = r5[r1]
            java.lang.String r0 = r6.A00
            boolean r0 = X.C04220Ms.A0I(r0, r8)
            if (r0 != 0) goto L_0x00ff
            int r1 = r1 + 1
            goto L_0x00ee
        L_0x00fd:
            com.instagram.mediakit.analytics.MediaKitEntryPoint r6 = com.instagram.mediakit.analytics.MediaKitEntryPoint.UNKNOWN
        L_0x00ff:
            if (r9 == 0) goto L_0x00a8
            java.lang.String r0 = "view"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x012f
            if (r11 != 0) goto L_0x010e
            if (r10 != 0) goto L_0x010e
            goto L_0x00a8
        L_0x010e:
            X.0TJ r2 = X.C18180wK.A0J(r3)
            r0 = 36320944989477290(0x8109b5000119aa, double:3.0328500918272963E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 == 0) goto L_0x00a8
            r1 = 0
            java.lang.String r0 = X.C18230wP.A0r(r6)
            if (r11 == 0) goto L_0x0125
            r1 = r11
        L_0x0125:
            if (r10 == 0) goto L_0x0128
            r0 = r10
        L_0x0128:
            com.instagram.mediakit.config.MediaKitConfig r5 = new com.instagram.mediakit.config.MediaKitConfig
            r5.<init>(r6, r1, r0)
            goto L_0x006f
        L_0x012f:
            java.lang.String r0 = "create"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x00a8
            r0 = 1
            X.C04220Ms.A0B(r6, r0)
            com.instagram.mediakit.config.MediaKitConfig r5 = new com.instagram.mediakit.config.MediaKitConfig
            r5.<init>(r6, r7, r7)
            X.0TJ r2 = X.C18180wK.A0J(r3)
            r0 = 36320944989411753(0x8109b5000019a9, double:3.0328500917858505E-306)
            goto L_0x0069
        L_0x014b:
            java.lang.String r0 = "http"
            goto L_0x0040
        L_0x014f:
            X.AnonymousClass3YR.A00(r12, r2, r3)
            goto L_0x00ab
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.mediakit.MediaKitExternalUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }
}
