package X;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.webkit.ValueCallback;
import android.webkit.WebViewClient;
import com.facebook.secure.webkit.WebView;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5fq  reason: invalid class name and case insensitive filesystem */
public final class C91225fq extends WebView {
    public AnonymousClass513 A00;
    public AnonymousClass6GI A01;
    public boolean A02 = true;
    public final List A03 = AnonymousClass0wJ.A0v();

    public C91225fq(Context context, AnonymousClass6GI r4) {
        super(context, (AttributeSet) null, 16842885);
        this.A01 = r4;
    }

    public AnonymousClass513 getWebViewClient() {
        return this.A00;
    }

    public final void A00(String str) {
        Looper mainLooper = Looper.getMainLooper();
        if (Looper.myLooper() == mainLooper) {
            String A0L = AnonymousClass00U.A0L("javascript: ", str);
            try {
                evaluateJavascript(str, (ValueCallback) null);
            } catch (IllegalStateException unused) {
                loadUrl(A0L);
            }
        } else {
            new Handler(mainLooper).post(new AnonymousClass80S(this, str));
        }
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A02 && computeVerticalScrollRange() > getHeight()) {
            this.A02 = false;
            Iterator it = this.A03.iterator();
            if (it.hasNext()) {
                it.next();
                throw C18210wN.A0W("onFirstScrollReady");
            }
        }
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        this.A00 = (AnonymousClass513) webViewClient;
    }
}
