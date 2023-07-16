package com.instagram.urlhandlers.igme;

import X.C10300i6;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public class IgMeExternalUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009b, code lost:
        if (X.C10650ih.A0B(r11, r0) == false) goto L_0x009d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            r0 = -1981916006(0xffffffff89de5c9a, float:-5.3531638E-33)
            int r4 = X.C14030oh.A00(r0)
            super.onCreate(r12)
            android.os.Bundle r5 = X.AnonymousClass0wJ.A0C(r11)
            if (r5 == 0) goto L_0x019f
            java.lang.String r1 = "original_url"
            boolean r0 = X.C18240wQ.A1T(r5, r1)
            if (r0 != 0) goto L_0x019f
            X.0i6 r0 = X.C18190wL.A0S(r5)
            r11.A00 = r0
            java.lang.String r0 = r5.getString(r1)
            android.net.Uri r6 = X.C15430rJ.A01(r0)
            android.os.Bundle r3 = X.C18180wK.A06()
            java.util.List r9 = r6.getPathSegments()
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x017d
            r0 = 0
            java.lang.String r10 = X.C18190wL.A0p(r9, r0)
            java.lang.String r0 = "w"
            boolean r0 = r0.equalsIgnoreCase(r10)
            r1 = 1
            if (r0 == 0) goto L_0x014d
            java.lang.String r0 = "should_land_on_web"
            r3.putBoolean(r0, r1)
            java.lang.String r0 = "uri"
            r3.putParcelable(r0, r6)
        L_0x004c:
            r5.putAll(r3)
            java.lang.String r0 = "uri"
            android.os.Parcelable r6 = r5.getParcelable(r0)
            android.net.Uri r6 = (android.net.Uri) r6
            if (r6 == 0) goto L_0x00b0
            java.lang.String r0 = r6.toString()
            if (r0 == 0) goto L_0x00b0
            java.lang.String r0 = "should_land_on_web"
            boolean r0 = r5.getBoolean(r0)
            if (r0 == 0) goto L_0x00b0
            java.lang.String r1 = "com.instagram.url.constants.ARGUMENTS_KEY_ANALYTICS_MODULE_NAME"
            java.lang.String r0 = r5.getString(r1)
            if (r0 == 0) goto L_0x00b0
            java.lang.String r5 = r5.getString(r1)
            if (r5 != 0) goto L_0x0077
            java.lang.String r5 = "url_handler"
        L_0x0077:
            X.0i6 r3 = r11.A00
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36326017346184575(0x810e520006257f, double:3.0360578706337244E-306)
            java.lang.Boolean r0 = X.C63803iN.A05(r2, r3, r0)
            boolean r0 = r0.booleanValue()
            X.0i6 r2 = r11.A00
            if (r0 != 0) goto L_0x009d
            java.lang.String r1 = "android.intent.action.MAIN"
            java.lang.String r0 = "android.intent.category.APP_BROWSER"
            android.content.Intent r0 = android.content.Intent.makeMainSelectorActivity(r1, r0)
            r0.setData(r6)
            boolean r0 = X.C10650ih.A0B(r11, r0)
            if (r0 != 0) goto L_0x00a6
        L_0x009d:
            java.lang.String r1 = r6.toString()
            X.9wF r0 = X.C171209wF.A0r
            X.C63753iH.A03(r11, r2, r0, r1, r5)
        L_0x00a6:
            r11.finish()
        L_0x00a9:
            r0 = -805085952(0xffffffffd0035d00, float:-8.8156406E9)
        L_0x00ac:
            X.C14030oh.A07(r0, r4)
            return
        L_0x00b0:
            java.lang.String r0 = "destination"
            java.lang.String r3 = r5.getString(r0)
            java.lang.String r0 = "parameter"
            java.lang.String r2 = r5.getString(r0)
            java.lang.String r0 = "p"
            boolean r0 = r0.equalsIgnoreCase(r3)
            java.lang.String r1 = "destination_id"
            if (r0 == 0) goto L_0x00e9
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0118
            java.lang.Object[] r1 = new java.lang.Object[]{r2}
            java.lang.String r0 = "https://instagram.com/p/%s"
            java.lang.String r0 = X.C18180wK.A0j(r0, r1)
            android.net.Uri r0 = X.C15430rJ.A01(r0)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "com.instagram.url.constants.ARGUMENTS_KEY_MEDIA_SHORT_URL"
            r5.putString(r0, r1)
            X.0i6 r0 = r11.A00
            X.C63753iH.A07(r5, r11, r0)
            goto L_0x00a9
        L_0x00e9:
            java.lang.String r0 = "u"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x0102
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x00fc
            java.lang.String r0 = "InstagramUrlLaunchConstants.EXTRA_USER_NAME"
            r5.putString(r0, r2)
        L_0x00fc:
            X.0i6 r0 = r11.A00
            X.C63753iH.A09(r5, r11, r0)
            goto L_0x00a9
        L_0x0102:
            java.lang.String r0 = "e"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x010d
            java.lang.Integer r0 = X.AnonymousClass006.A01
            goto L_0x011a
        L_0x010d:
            java.lang.String r0 = "n"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x0133
            java.lang.Integer r0 = X.AnonymousClass006.A0N
            goto L_0x011a
        L_0x0118:
            java.lang.Integer r0 = X.AnonymousClass006.A00
        L_0x011a:
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x012a;
                case 1: goto L_0x012d;
                case 2: goto L_0x0130;
                default: goto L_0x0121;
            }
        L_0x0121:
            java.lang.String r0 = "news"
        L_0x0123:
            r5.putString(r1, r0)
            X.C63753iH.A02(r11, r5)
            goto L_0x00a9
        L_0x012a:
            java.lang.String r0 = "mainfeed"
            goto L_0x0123
        L_0x012d:
            java.lang.String r0 = "explore"
            goto L_0x0123
        L_0x0130:
            java.lang.String r0 = "search"
            goto L_0x0123
        L_0x0133:
            java.lang.String r0 = "com.instagram.android.fragment.ARGUMENTS_KEY_SHORT_CODE"
            r5.putString(r0, r3)
            X.0i6 r1 = r11.A00
            com.instagram.util.fragment.IgFragmentFactoryImpl.A00()
            X.1Z5 r0 = new X.1Z5
            r0.<init>()
            X.C18180wK.A0w(r5, r1)
            r0.setArguments(r5)
            X.C18180wK.A16(r0, r11, r1)
            goto L_0x00a9
        L_0x014d:
            int r0 = r9.size()
            java.lang.String r8 = "parameter"
            java.lang.String r7 = "destination"
            if (r0 <= r1) goto L_0x0191
            java.lang.String r0 = X.C18190wL.A0p(r9, r1)
            java.lang.String r2 = "p"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0191
            X.0i6 r1 = r11.A00
            java.lang.String r0 = "IgMeExternalUrlHandlerActivity"
            X.C63753iH.A05(r6, r1, r0)
            r3.putString(r7, r2)
            int r1 = r9.size()
            r0 = 2
            if (r1 <= r0) goto L_0x017d
            java.lang.Object r0 = r9.get(r0)
        L_0x0178:
            java.lang.String r0 = (java.lang.String) r0
            r3.putString(r8, r0)
        L_0x017d:
            java.lang.String r1 = r6.toString()
            java.lang.String r0 = "short_url"
            r3.putString(r0, r1)
            java.lang.String r1 = r6.getEncodedQuery()
            java.lang.String r0 = "encoded_query"
            r3.putString(r0, r1)
            goto L_0x004c
        L_0x0191:
            r3.putString(r7, r10)
            int r0 = r9.size()
            if (r0 <= r1) goto L_0x017d
            java.lang.Object r0 = r9.get(r1)
            goto L_0x0178
        L_0x019f:
            r11.finish()
            r0 = 1672531567(0x63b0ce6f, float:6.523004E21)
            goto L_0x00ac
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.igme.IgMeExternalUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }
}
