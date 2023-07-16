package X;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* renamed from: X.7cY  reason: invalid class name and case insensitive filesystem */
public final class C125157cY implements C145158jw {
    public final WebViewProviderFactoryBoundaryInterface A00;

    public final WebViewProviderBoundaryInterface AGg(WebView webView) {
        return (WebViewProviderBoundaryInterface) AnonymousClass72D.A00(WebViewProviderBoundaryInterface.class, this.A00.createWebView(webView));
    }

    public final String[] BM3() {
        return this.A00.getSupportedFeatures();
    }

    public C125157cY(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.A00 = webViewProviderFactoryBoundaryInterface;
    }
}
