package X;

import androidx.webkit.internal.WebViewFeatureInternal;
import com.facebook.browser.lite.webview.SystemWebView;
import java.lang.ref.WeakReference;
import java.util.Set;

/* renamed from: X.5EZ  reason: invalid class name */
public final class AnonymousClass5EZ extends C114926u8 {
    public WeakReference A00;
    public final C113336rB A01;
    public final C04530Oa A02;
    public final C04530Oa A03 = C86114wI.A0w(this, 23);
    public final boolean A04;

    public final void A00(IF5 if5) {
        super.A00(if5);
        if (this.A04) {
            C91235fr r2 = ((SystemWebView) if5).A01;
            C04220Ms.A0C(r2, "null cannot be cast to non-null type android.webkit.WebView");
            Set A0c = C18250wR.A0c("*");
            C141968da r5 = (C141968da) this.A03.getValue();
            if (WebViewFeatureInternal.WEB_MESSAGE_LISTENER.A01()) {
                AnonymousClass07Q.A01(r2).addWebMessageListener("fbpayIAWIFrameBridge", (String[]) A0c.toArray(new String[0]), new AnonymousClass83U(new AnonymousClass888(r5)));
                return;
            }
            throw C86134wK.A0s("This method is not supported by the current version of the framework and the current WebView APK");
        }
        AnonymousClass0LU.A0B("FbPaySDKIFrameInjector", AnonymousClass00U.A0o("WEB_MESSAGE_LISTENER feature supported: ", AnonymousClass0wJ.A1X(this.A02.getValue())));
    }

    public final void A01(IF5 if5, String str) {
        WeakReference weakReference;
        if (!AnonymousClass0wJ.A1X(this.A02.getValue()) || (weakReference = this.A00) == null) {
            super.A01(if5, str);
            return;
        }
        C1192574g r1 = (C1192574g) weakReference.get();
        if (r1 == null) {
            return;
        }
        if (WebViewFeatureInternal.WEB_MESSAGE_LISTENER.A01()) {
            r1.A00.postMessage(str);
            return;
        }
        throw C86134wK.A0s("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public AnonymousClass5EZ(C113336rB r2) {
        super(r2);
        this.A01 = r2;
        C04530Oa A022 = AnonymousClass0OY.A02(AnonymousClass8G8.A00);
        this.A02 = A022;
        this.A04 = AnonymousClass0wJ.A1X(A022.getValue());
    }
}
