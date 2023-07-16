package X;

import com.facebook.secure.securewebview.SecureWebView;

/* renamed from: X.52F  reason: invalid class name */
public final class AnonymousClass52F extends AnonymousClass00C {
    public SecureWebView A00;

    public AnonymousClass52F() {
        super(false);
    }

    public final void A01() {
        boolean z;
        SecureWebView secureWebView = this.A00;
        if (secureWebView == null || !secureWebView.canGoBack()) {
            z = false;
        } else {
            this.A00.goBack();
            z = this.A00.canGoBack();
        }
        A02(z);
    }
}
