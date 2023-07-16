package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* renamed from: X.0xr  reason: invalid class name and case insensitive filesystem */
public final class C18770xr extends WebChromeClient {
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        if (!z2) {
            return false;
        }
        String extra = webView.getHitTestResult().getExtra();
        Context context = webView.getContext();
        if (extra == null) {
            return false;
        }
        C563436u A00 = new AnonymousClass3UQ().A00();
        Uri A01 = C15430rJ.A01(extra);
        Intent intent = A00.A00;
        intent.setData(A01);
        context.startActivity(intent, A00.A01);
        return true;
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return true;
    }
}
