package X;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* renamed from: X.7cZ  reason: invalid class name and case insensitive filesystem */
public final class C125167cZ implements C145158jw {
    public static final String[] A00 = new String[0];

    public final WebViewProviderBoundaryInterface AGg(WebView webView) {
        throw C86134wK.A0s("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    public final String[] BM3() {
        return A00;
    }
}
