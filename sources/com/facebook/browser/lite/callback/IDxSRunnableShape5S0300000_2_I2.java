package com.facebook.browser.lite.callback;

import X.AnonymousClass7Ep;
import X.C111716oC;
import android.os.Bundle;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback;
import com.facebook.browser.lite.ipc.OnShopsLiteCallback;
import java.util.Map;

public class IDxSRunnableShape5S0300000_2_I2 extends C111716oC {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03 = 3;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxSRunnableShape5S0300000_2_I2(AnonymousClass7Ep r2, BrowserLiteJSBridgeCall browserLiteJSBridgeCall, BrowserLiteJSBridgeCallback browserLiteJSBridgeCallback) {
        super(r2);
        this.A00 = r2;
        this.A02 = browserLiteJSBridgeCall;
        this.A01 = browserLiteJSBridgeCallback;
    }

    public final void A00(BrowserLiteCallback browserLiteCallback) {
        switch (this.A03) {
            case 0:
                browserLiteCallback.Cdd((long[]) this.A01, (Bundle) this.A02);
                return;
            case 1:
                browserLiteCallback.CS7((Map) this.A01, (Bundle) this.A02);
                return;
            case 2:
                browserLiteCallback.CVg((Bundle) this.A01, (OnShopsLiteCallback) this.A02);
                return;
            default:
                browserLiteCallback.C3w((BrowserLiteJSBridgeCall) this.A02, (BrowserLiteJSBridgeCallback) this.A01);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxSRunnableShape5S0300000_2_I2(Bundle bundle, AnonymousClass7Ep r3, OnShopsLiteCallback onShopsLiteCallback) {
        super(r3);
        this.A00 = r3;
        this.A01 = bundle;
        this.A02 = onShopsLiteCallback;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxSRunnableShape5S0300000_2_I2(Bundle bundle, AnonymousClass7Ep r3, long[] jArr) {
        super(r3);
        this.A00 = r3;
        this.A01 = jArr;
        this.A02 = bundle;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxSRunnableShape5S0300000_2_I2(Bundle bundle, AnonymousClass7Ep r3, Map map) {
        super(r3);
        this.A00 = r3;
        this.A01 = map;
        this.A02 = bundle;
    }
}
