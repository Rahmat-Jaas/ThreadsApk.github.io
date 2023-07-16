package com.fbpay.w3c.ipc;

import X.AnonymousClass3VE;
import X.AnonymousClass816;
import X.C04220Ms;
import X.C117036y1;
import X.C14030oh;
import android.content.Intent;
import com.instagram.fbpay.w3c.ipc.IsReadyToPayServiceImpl;
import org.chromium.IsReadyToPayService;
import org.chromium.IsReadyToPayServiceCallback;

public final class BaseIsReadyToPayServiceImpl$handler$1 extends IsReadyToPayService.Stub {
    public final /* synthetic */ IsReadyToPayServiceImpl A00;

    public BaseIsReadyToPayServiceImpl$handler$1(IsReadyToPayServiceImpl isReadyToPayServiceImpl) {
        this.A00 = isReadyToPayServiceImpl;
        C14030oh.A0A(-963490237, C14030oh.A03(1861477710));
    }

    public final void BXi(IsReadyToPayServiceCallback isReadyToPayServiceCallback) {
        int A03 = C14030oh.A03(-1049630147);
        C04220Ms.A0B(isReadyToPayServiceCallback, 0);
        IsReadyToPayServiceImpl isReadyToPayServiceImpl = this.A00;
        if (!((AnonymousClass3VE) C117036y1.A00().A03.getValue()).A01(isReadyToPayServiceImpl, (Intent) null)) {
            isReadyToPayServiceCallback.BNM(false);
        } else {
            isReadyToPayServiceImpl.A00.post(new AnonymousClass816(isReadyToPayServiceImpl, isReadyToPayServiceCallback));
        }
        C14030oh.A0A(-440141967, A03);
    }
}
