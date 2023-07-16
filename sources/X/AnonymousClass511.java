package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.instagram.barcelona.R;

/* renamed from: X.511  reason: invalid class name */
public final class AnonymousClass511 extends WebChromeClient {
    public final Context A00;
    public final C107026g1 A01;
    public final C105756dw A02;
    public final /* synthetic */ C121507Gm A03;

    public AnonymousClass511(Context context, ProgressBar progressBar, C105756dw r4, C121507Gm r5) {
        this.A03 = r5;
        this.A00 = context;
        this.A01 = new C107026g1(progressBar);
        this.A02 = r4;
    }

    public final Bitmap getDefaultVideoPoster() {
        try {
            return BitmapFactory.decodeResource(this.A00.getResources(), R.drawable.play_icon);
        } catch (Exception unused) {
            return super.getDefaultVideoPoster();
        }
    }

    public final void onCloseWindow(WebView webView) {
        C121507Gm r1 = this.A03;
        if (webView == r1.A0D.peek()) {
            C121507Gm.A02(r1);
        }
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        C121507Gm r1 = this.A03;
        if (webView != r1.A0D.peek() || !z2) {
            return false;
        }
        C91225fq A002 = C121507Gm.A00(r1);
        Object obj = message.obj;
        if (!(obj instanceof WebView.WebViewTransport)) {
            return false;
        }
        ((WebView.WebViewTransport) obj).setWebView(A002);
        message.sendToTarget();
        return true;
    }

    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        AnonymousClass0wJ.A0F().post(new AnonymousClass829(webView, this.A01, i));
        C91225fq r1 = (C91225fq) webView;
        if (i > 10) {
            r1.A00("(function() {\n  if (!('__FBLoadedIndicator' in window) \n      && typeof(_FBIXLoggingBridge) !== 'undefined') {\n    window.__FBLoadedIndicator = true;\n    _FBIXLoggingBridge.log('FB_IX_PAGE_READY' + window.location.href);\n  }\n}());");
        }
        webView.getUrl();
    }
}
