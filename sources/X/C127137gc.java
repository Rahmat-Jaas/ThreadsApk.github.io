package X;

import android.os.Bundle;
import com.facebook.iabeventlogging.model.IABEvent;
import com.instagram.inappbrowser.service.BrowserLiteCallbackService;
import kotlin.Unit;

/* renamed from: X.7gc  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C127137gc implements C143448gk {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ IABEvent A01;
    public final /* synthetic */ BrowserLiteCallbackService.BrowserLiteCallbackImpl A02;

    public /* synthetic */ C127137gc(Bundle bundle, IABEvent iABEvent, BrowserLiteCallbackService.BrowserLiteCallbackImpl browserLiteCallbackImpl) {
        this.A02 = browserLiteCallbackImpl;
        this.A01 = iABEvent;
        this.A00 = bundle;
    }

    public final Object get() {
        BrowserLiteCallbackService.BrowserLiteCallbackImpl browserLiteCallbackImpl = this.A02;
        IABEvent iABEvent = this.A01;
        Bundle bundle = this.A00;
        int A03 = C14030oh.A03(-12069381);
        BrowserLiteCallbackService.BrowserLiteCallbackImpl.A03(bundle, iABEvent, browserLiteCallbackImpl);
        Unit unit = Unit.A00;
        C14030oh.A0A(-282329842, A03);
        return unit;
    }
}
