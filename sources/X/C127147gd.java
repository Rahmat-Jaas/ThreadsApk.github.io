package X;

import android.os.Bundle;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.privacy.zone.policy.ZonePolicy;
import com.instagram.inappbrowser.service.BrowserLiteCallbackService;
import kotlin.Unit;

/* renamed from: X.7gd  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C127147gd implements C143448gk {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ IABEvent A01;
    public final /* synthetic */ BrowserLiteCallbackService.BrowserLiteCallbackImpl A02;

    public /* synthetic */ C127147gd(Bundle bundle, IABEvent iABEvent, BrowserLiteCallbackService.BrowserLiteCallbackImpl browserLiteCallbackImpl) {
        this.A02 = browserLiteCallbackImpl;
        this.A01 = iABEvent;
        this.A00 = bundle;
    }

    public final Object get() {
        BrowserLiteCallbackService.BrowserLiteCallbackImpl browserLiteCallbackImpl = this.A02;
        IABEvent iABEvent = this.A01;
        Bundle bundle = this.A00;
        int A03 = C14030oh.A03(1459988051);
        try {
            C98866Hf.A00(new C127137gc(bundle, iABEvent, browserLiteCallbackImpl), ZonePolicy.A03);
        } catch (AnonymousClass88G unused) {
        }
        Unit unit = Unit.A00;
        C14030oh.A0A(1268872687, A03);
        return unit;
    }
}
