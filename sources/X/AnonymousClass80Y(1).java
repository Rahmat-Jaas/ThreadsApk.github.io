package X;

import com.facebook.browser.lite.extensions.autofill.base.AutofillSharedJSBridgeProxy;
import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.80Y  reason: invalid class name */
public final class AnonymousClass80Y implements Runnable {
    public final /* synthetic */ AutofillSharedJSBridgeProxy A00;
    public final /* synthetic */ IF5 A01;

    public AnonymousClass80Y(AutofillSharedJSBridgeProxy autofillSharedJSBridgeProxy, IF5 if5) {
        this.A00 = autofillSharedJSBridgeProxy;
        this.A01 = if5;
    }

    public final void run() {
        this.A01.A0B(StringFormatUtil.formatStrLocaleSafe("%s();", (Object) this.A00.A02));
    }
}
