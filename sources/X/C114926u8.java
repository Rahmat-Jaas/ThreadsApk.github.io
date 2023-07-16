package X;

import android.webkit.JavascriptInterface;
import com.facebook.browser.lite.webview.SystemWebView;
import com.facebook.redex.IDxJListenerShape168S0000000_2_I2;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.6u8  reason: invalid class name and case insensitive filesystem */
public class C114926u8 {
    public WeakReference A00;
    public final C113336rB A01;
    public final C39639KxH A02 = new IDxJListenerShape168S0000000_2_I2(1);

    public void A01(IF5 if5, String str) {
        if5.A0A(this.A02, C86154wM.A0o(Locale.ROOT, "fbpay.sendMessage(\"%s\")", Arrays.copyOf(new Object[]{str}, 1)), false);
    }

    @JavascriptInterface
    public final void sendMessage(String str) {
        C04220Ms.A0B(str, 0);
        this.A01.A00(str);
    }

    public C114926u8(C113336rB r3) {
        this.A01 = r3;
    }

    public void A00(IF5 if5) {
        this.A00 = C86144wL.A0w(if5);
        ((SystemWebView) if5).A01.addJavascriptInterface(this, "fbpayIAWBridge");
    }
}
