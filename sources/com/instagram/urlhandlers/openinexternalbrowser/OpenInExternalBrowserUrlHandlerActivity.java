package com.instagram.urlhandlers.openinexternalbrowser;

import X.C10300i6;
import X.C16240si;
import X.C18190wL;
import X.C18200wM;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class OpenInExternalBrowserUrlHandlerActivity extends BaseFragmentActivity {
    public final C16240si A00 = C18190wL.A0I();

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return C18200wM.A0W(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0069, code lost:
        if (r0.A00().A01(r9, (android.content.Intent) r1.getParcelable("extra_source_intent"), (X.C16240si) null) != false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006b, code lost:
        r7 = X.C18230wP.A0Z();
        r4 = new android.content.Intent("android.intent.action.VIEW", r6).addCategory("android.intent.category.BROWSABLE");
        X.C04220Ms.A06(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x008a, code lost:
        if (X.C63803iN.A0E(X.AnonymousClass0TJ.A05, r7, 36315949943163807L) == false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x008c, code lost:
        r0 = new com.instagram.inappbrowser.launcher.ExternalBrowserLauncher(r9, r7).A02(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0095, code lost:
        if (r0 == null) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0097, code lost:
        r4.setPackage(r0.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a0, code lost:
        if (X.C10650ih.A0B(r9, r4) == false) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a2, code lost:
        r4 = X.C18180wK.A0I(X.AnonymousClass0wJ.A0M(X.C13330nS.A02(r7), "iab_browser_choice_selection"), 728);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b2, code lost:
        if (r8 == null) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b4, code lost:
        r2 = X.AnonymousClass4n2.A02(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00bc, code lost:
        if (X.AnonymousClass0wJ.A1U(r4) == false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00be, code lost:
        r4.A0T("selection_experience", "FB_EXTERNAL_SCHEME_EXTERNAL_BROWSER_FLOW_WITH_DEFAULT_BROWSER_CHOSEN");
        r4.A0l(r2);
        r4.A1e(r5);
        r4.A0T("reason", "INSTAGRAM_EXTBROWSER_DEEPLINK_URL_HANDLER");
        r4.Bb4();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00df, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f6, code lost:
        if (r0.A00().A01(r9, getIntent(), (X.C16240si) null) != false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0105, code lost:
        r1 = "OpenInExternalBrowserUrlHandlerActivity";
        r0 = "Open in external browser url handler activity failed";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            r0 = 1449522142(0x5665f3de, float:6.3208891E13)
            int r3 = X.C14030oh.A00(r0)
            super.onCreate(r10)
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r0 = "url"
            java.lang.String r2 = r1.getStringExtra(r0)
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r0 = "ad_id"
            java.lang.String r8 = r1.getStringExtra(r0)
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r0 = "tracking_token"
            java.lang.String r5 = r1.getStringExtra(r0)
            if (r2 == 0) goto L_0x00d5
            java.lang.String r0 = "UTF-8"
            java.lang.String r2 = java.net.URLDecoder.decode(r2, r0)     // Catch:{ UnsupportedEncodingException -> 0x00fa }
            X.C04220Ms.A06(r2)     // Catch:{ UnsupportedEncodingException -> 0x00fa }
            X.0si r1 = r9.A00     // Catch:{ UnsupportedEncodingException -> 0x00fa }
            r0 = 0
            android.net.Uri r6 = X.C15430rJ.A00(r1, r2, r0)     // Catch:{ UnsupportedEncodingException -> 0x00fa }
            if (r6 == 0) goto L_0x0100
            java.lang.String r1 = r6.getScheme()     // Catch:{ UnsupportedEncodingException -> 0x00fa }
            java.lang.String r0 = "https"
            if (r1 == 0) goto L_0x0100
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch:{ UnsupportedEncodingException -> 0x00fa }
            if (r0 == 0) goto L_0x0100
            android.os.Bundle r1 = X.AnonymousClass0wJ.A0C(r9)
            if (r1 == 0) goto L_0x00e1
            java.lang.String r0 = "extra_source_intent"
            android.os.Parcelable r2 = r1.getParcelable(r0)
            android.content.Intent r2 = (android.content.Intent) r2
            X.0ro r0 = new X.0ro
            r0.<init>()
            r0.A01()
            X.0rl r1 = r0.A00()
            r0 = 0
            boolean r0 = r1.A01(r9, r2, r0)
            if (r0 == 0) goto L_0x00e1
        L_0x006b:
            com.instagram.service.session.UserSession r7 = X.C18230wP.A0Z()
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0, r6)
            java.lang.String r0 = "android.intent.category.BROWSABLE"
            android.content.Intent r4 = r1.addCategory(r0)
            X.C04220Ms.A06(r4)
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36315949943163807(0x81052a000b0b9f, double:3.0296912044252126E-306)
            boolean r0 = X.C63803iN.A0E(r2, r7, r0)
            if (r0 == 0) goto L_0x009c
            com.instagram.inappbrowser.launcher.ExternalBrowserLauncher r0 = new com.instagram.inappbrowser.launcher.ExternalBrowserLauncher
            r0.<init>(r9, r7)
            X.3BT r0 = r0.A02(r6)
            if (r0 == 0) goto L_0x009c
            java.lang.String r0 = r0.A01
            r4.setPackage(r0)
        L_0x009c:
            boolean r0 = X.C10650ih.A0B(r9, r4)
            if (r0 == 0) goto L_0x0105
            X.0nS r1 = X.C13330nS.A02(r7)
            java.lang.String r0 = "iab_browser_choice_selection"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 728(0x2d8, float:1.02E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r4 = X.C18180wK.A0I(r1, r0)
            if (r8 == 0) goto L_0x00df
            java.lang.Long r2 = X.AnonymousClass4n2.A02(r8)
        L_0x00b8:
            boolean r0 = X.AnonymousClass0wJ.A1U(r4)
            if (r0 == 0) goto L_0x00d5
            java.lang.String r1 = "FB_EXTERNAL_SCHEME_EXTERNAL_BROWSER_FLOW_WITH_DEFAULT_BROWSER_CHOSEN"
            java.lang.String r0 = "selection_experience"
            r4.A0T(r0, r1)
            r4.A0l(r2)
            r4.A1e(r5)
            java.lang.String r1 = "INSTAGRAM_EXTBROWSER_DEEPLINK_URL_HANDLER"
            java.lang.String r0 = "reason"
            r4.A0T(r0, r1)
            r4.Bb4()
        L_0x00d5:
            r9.finish()
            r0 = -1606128307(0xffffffffa0446d4d, float:-1.663801E-19)
            X.C14030oh.A07(r0, r3)
            return
        L_0x00df:
            r2 = 0
            goto L_0x00b8
        L_0x00e1:
            X.0ro r0 = new X.0ro
            r0.<init>()
            r0.A01()
            X.0rl r2 = r0.A00()
            android.content.Intent r1 = r9.getIntent()
            r0 = 0
            boolean r0 = r2.A01(r9, r1, r0)
            if (r0 == 0) goto L_0x0100
            goto L_0x006b
        L_0x00fa:
            r1 = move-exception
            java.lang.String r0 = "OpenInExternalBrowserUrlHandlerActivity"
            X.C10450iM.A07(r0, r1)
        L_0x0100:
            java.lang.String r1 = "OpenInExternalBrowserUrlHandlerActivity"
            java.lang.String r0 = "Open in external browser url handler invalid URI or untrusted caller"
            goto L_0x0109
        L_0x0105:
            java.lang.String r1 = "OpenInExternalBrowserUrlHandlerActivity"
            java.lang.String r0 = "Open in external browser url handler activity failed"
        L_0x0109:
            X.C10450iM.A03(r1, r0)
            goto L_0x00d5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.openinexternalbrowser.OpenInExternalBrowserUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }
}
