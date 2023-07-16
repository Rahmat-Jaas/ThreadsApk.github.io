package X;

import com.facebook.browser.lite.bridge.BrowserLiteJSBridgeProxy;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;

/* renamed from: X.0Dy  reason: invalid class name */
public final class AnonymousClass0Dy implements Runnable {
    public final /* synthetic */ BrowserLiteJSBridgeProxy A00;
    public final /* synthetic */ C112646px A01;
    public final /* synthetic */ BrowserLiteJSBridgeCall A02;
    public final /* synthetic */ IF5 A03;
    public final /* synthetic */ String A04;

    public AnonymousClass0Dy(BrowserLiteJSBridgeProxy browserLiteJSBridgeProxy, C112646px r2, BrowserLiteJSBridgeCall browserLiteJSBridgeCall, IF5 if5, String str) {
        this.A00 = browserLiteJSBridgeProxy;
        this.A03 = if5;
        this.A02 = browserLiteJSBridgeCall;
        this.A04 = str;
        this.A01 = r2;
    }

    public final void run() {
        IF5 if5 = this.A03;
        if (BrowserLiteJSBridgeProxy.A00(this.A02, if5, this.A04)) {
            if5.A0B(this.A01.A00());
        } else {
            C37252JnL.A01("BrowserLiteJSBridgeProxy", "Could not invoke js callback due to domain change", new Object[0]);
        }
    }
}
