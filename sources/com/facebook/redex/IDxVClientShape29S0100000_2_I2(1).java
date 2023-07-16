package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass562;
import X.AnonymousClass569;
import X.AnonymousClass56C;
import X.AnonymousClass7Kz;
import X.C04220Ms;
import X.C18180wK;
import X.C99156Ii;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import com.facebook.proxygen.TraceFieldType;

public class IDxVClientShape29S0100000_2_I2 extends WebViewClient {
    public Object A00;
    public final int A01;

    public IDxVClientShape29S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onPageFinished(WebView webView, String str) {
        View view;
        switch (this.A01) {
            case 0:
                AnonymousClass0wJ.A1N(webView, str);
                super.onPageFinished(webView, str);
                view = ((AnonymousClass562) this.A00).A01;
                if (view == null) {
                    C04220Ms.A0E("progressBar");
                    throw null;
                }
                break;
            case 1:
                view = ((AnonymousClass569) this.A00).A00.A01;
                break;
            default:
                view = ((AnonymousClass56C) this.A00).A00;
                break;
        }
        view.setVisibility(8);
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        View view;
        switch (this.A01) {
            case 0:
                boolean A1Y = AnonymousClass0wJ.A1Y(webView, str);
                super.onPageStarted(webView, str, bitmap);
                ProgressBar progressBar = ((AnonymousClass562) this.A00).A01;
                if (progressBar == null) {
                    C04220Ms.A0E("progressBar");
                    throw null;
                } else {
                    progressBar.setVisibility(A1Y ? 1 : 0);
                    return;
                }
            case 1:
                view = ((AnonymousClass569) this.A00).A00.A01;
                break;
            default:
                view = ((AnonymousClass56C) this.A00).A00;
                break;
        }
        view.setVisibility(0);
    }

    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        Bundle bundle;
        int i = this.A01;
        Fragment fragment = (Fragment) this.A00;
        switch (i) {
            case 0:
                bundle = C18180wK.A06();
                bundle.putBoolean("WEB_VIEW_RESULT_ERROR_ENCOUNTERED", true);
                bundle.putString("WEB_VIEW_RESULT_ERROR_MESSAGE_FOR_LOGGING", "Webview received http error");
                break;
            case 1:
                int statusCode = webResourceResponse.getStatusCode();
                String reasonPhrase = webResourceResponse.getReasonPhrase();
                bundle = C18180wK.A06();
                bundle.putString("ERROR_MESSAGE", reasonPhrase);
                bundle.putInt("ERROR_CODE", statusCode);
                break;
            default:
                int statusCode2 = webResourceResponse.getStatusCode();
                String reasonPhrase2 = webResourceResponse.getReasonPhrase();
                Bundle A06 = C18180wK.A06();
                A06.putString("error", reasonPhrase2);
                A06.putInt(TraceFieldType.ErrorCode, statusCode2);
                C99156Ii.A00(A06, fragment, false);
                C18180wK.A0Q(fragment.requireActivity(), AnonymousClass7Kz.A0K().A07().A00).A0D((String) null, 0);
                return;
        }
        C99156Ii.A00(bundle, fragment, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: X.569} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: X.562} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: X.569} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: X.569} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r7, java.lang.String r8) {
        /*
            r6 = this;
            int r0 = r6.A01
            switch(r0) {
                case 0: goto L_0x004c;
                case 1: goto L_0x00be;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r6.A00
            X.56C r3 = (X.AnonymousClass56C) r3
            java.net.URI r5 = new java.net.URI     // Catch:{ URISyntaxException -> 0x011f }
            r5.<init>(r8)     // Catch:{ URISyntaxException -> 0x011f }
            java.util.Set r0 = r3.A03     // Catch:{ URISyntaxException -> 0x011f }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ URISyntaxException -> 0x011f }
        L_0x0014:
            boolean r0 = r4.hasNext()     // Catch:{ URISyntaxException -> 0x011f }
            if (r0 == 0) goto L_0x011f
            java.lang.Object r2 = r4.next()     // Catch:{ URISyntaxException -> 0x011f }
            java.net.URI r2 = (java.net.URI) r2     // Catch:{ URISyntaxException -> 0x011f }
            java.lang.String r1 = r5.getScheme()     // Catch:{ URISyntaxException -> 0x011f }
            java.lang.String r0 = r2.getScheme()     // Catch:{ URISyntaxException -> 0x011f }
            boolean r0 = r1.equals(r0)     // Catch:{ URISyntaxException -> 0x011f }
            if (r0 == 0) goto L_0x0014
            java.lang.String r1 = r5.getHost()     // Catch:{ URISyntaxException -> 0x011f }
            java.lang.String r0 = r2.getHost()     // Catch:{ URISyntaxException -> 0x011f }
            boolean r0 = r1.equals(r0)     // Catch:{ URISyntaxException -> 0x011f }
            if (r0 == 0) goto L_0x0014
            java.lang.String r1 = r5.getPath()     // Catch:{ URISyntaxException -> 0x011f }
            java.lang.String r0 = r2.getPath()     // Catch:{ URISyntaxException -> 0x011f }
            boolean r0 = r1.equals(r0)     // Catch:{ URISyntaxException -> 0x011f }
            if (r0 == 0) goto L_0x0014
            goto L_0x0111
        L_0x004c:
            if (r8 == 0) goto L_0x011f
            java.lang.Object r2 = r6.A00
            X.562 r2 = (X.AnonymousClass562) r2
            java.net.URI r3 = new java.net.URI     // Catch:{ URISyntaxException -> 0x011f }
            r3.<init>(r8)     // Catch:{ URISyntaxException -> 0x011f }
            java.util.HashSet r0 = r2.A05     // Catch:{ URISyntaxException -> 0x011f }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ URISyntaxException -> 0x011f }
        L_0x005d:
            boolean r0 = r5.hasNext()     // Catch:{ URISyntaxException -> 0x011f }
            if (r0 == 0) goto L_0x011f
            java.lang.Object r4 = r5.next()     // Catch:{ URISyntaxException -> 0x011f }
            java.net.URI r4 = (java.net.URI) r4     // Catch:{ URISyntaxException -> 0x011f }
            java.lang.String r0 = r4.getScheme()     // Catch:{ URISyntaxException -> 0x011f }
            if (r0 == 0) goto L_0x0083
            int r0 = r0.length()     // Catch:{ URISyntaxException -> 0x011f }
            if (r0 == 0) goto L_0x0083
            java.lang.String r1 = r4.getScheme()     // Catch:{ URISyntaxException -> 0x011f }
            java.lang.String r0 = r3.getScheme()     // Catch:{ URISyntaxException -> 0x011f }
            boolean r0 = X.C04220Ms.A0I(r1, r0)     // Catch:{ URISyntaxException -> 0x011f }
            if (r0 == 0) goto L_0x005d
        L_0x0083:
            java.lang.String r0 = r4.getHost()     // Catch:{ URISyntaxException -> 0x011f }
            if (r0 == 0) goto L_0x009d
            int r0 = r0.length()     // Catch:{ URISyntaxException -> 0x011f }
            if (r0 == 0) goto L_0x009d
            java.lang.String r1 = r4.getHost()     // Catch:{ URISyntaxException -> 0x011f }
            java.lang.String r0 = r3.getHost()     // Catch:{ URISyntaxException -> 0x011f }
            boolean r0 = X.C04220Ms.A0I(r1, r0)     // Catch:{ URISyntaxException -> 0x011f }
            if (r0 == 0) goto L_0x005d
        L_0x009d:
            java.lang.String r0 = r4.getPath()     // Catch:{ URISyntaxException -> 0x011f }
            if (r0 == 0) goto L_0x00b7
            int r0 = r0.length()     // Catch:{ URISyntaxException -> 0x011f }
            if (r0 == 0) goto L_0x00b7
            java.lang.String r1 = r4.getPath()     // Catch:{ URISyntaxException -> 0x011f }
            java.lang.String r0 = r3.getPath()     // Catch:{ URISyntaxException -> 0x011f }
            boolean r0 = X.C04220Ms.A0I(r1, r0)     // Catch:{ URISyntaxException -> 0x011f }
            if (r0 == 0) goto L_0x005d
        L_0x00b7:
            android.os.Bundle r1 = X.C18180wK.A06()
            java.lang.String r0 = "WEB_VIEW_RESULT_INTERCEPT_URL"
            goto L_0x0109
        L_0x00be:
            java.lang.Object r2 = r6.A00
            X.569 r2 = (X.AnonymousClass569) r2
            java.net.URI r5 = new java.net.URI     // Catch:{ URISyntaxException -> 0x011f }
            r5.<init>(r8)     // Catch:{ URISyntaxException -> 0x011f }
            java.util.Set r0 = r2.A01     // Catch:{ URISyntaxException -> 0x011f }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ URISyntaxException -> 0x011f }
        L_0x00cd:
            boolean r0 = r4.hasNext()     // Catch:{ URISyntaxException -> 0x011f }
            if (r0 == 0) goto L_0x011f
            java.lang.Object r3 = r4.next()     // Catch:{ URISyntaxException -> 0x011f }
            java.net.URI r3 = (java.net.URI) r3     // Catch:{ URISyntaxException -> 0x011f }
            java.lang.String r1 = r5.getScheme()     // Catch:{ URISyntaxException -> 0x011f }
            java.lang.String r0 = r3.getScheme()     // Catch:{ URISyntaxException -> 0x011f }
            boolean r0 = r1.equals(r0)     // Catch:{ URISyntaxException -> 0x011f }
            if (r0 == 0) goto L_0x00cd
            java.lang.String r1 = r5.getHost()     // Catch:{ URISyntaxException -> 0x011f }
            java.lang.String r0 = r3.getHost()     // Catch:{ URISyntaxException -> 0x011f }
            boolean r0 = r1.equals(r0)     // Catch:{ URISyntaxException -> 0x011f }
            if (r0 == 0) goto L_0x00cd
            java.lang.String r1 = r5.getPath()     // Catch:{ URISyntaxException -> 0x011f }
            java.lang.String r0 = r3.getPath()     // Catch:{ URISyntaxException -> 0x011f }
            boolean r0 = r1.equals(r0)     // Catch:{ URISyntaxException -> 0x011f }
            if (r0 == 0) goto L_0x00cd
            android.os.Bundle r1 = X.C18180wK.A06()
            java.lang.String r0 = "WEB_FRAGMENT_INTERCEPTED_URL"
        L_0x0109:
            r1.putString(r0, r8)
            r0 = 1
            X.C99156Ii.A00(r1, r2, r0)
            goto L_0x011d
        L_0x0111:
            android.os.Bundle r1 = X.C18180wK.A06()
            java.lang.String r0 = "web_fragment_intercepted_url"
            r1.putString(r0, r8)
            X.C121817Ig.A03(r1, r3)
        L_0x011d:
            r0 = 1
            return r0
        L_0x011f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxVClientShape29S0100000_2_I2.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }
}
