package com.fbpay.w3c.client;

import X.AnonymousClass7IX;
import X.C14030oh;
import X.C143728hD;
import android.content.ServiceConnection;
import org.chromium.IsReadyToPayServiceCallback;

public final class W3CClient$IsReadyToPayCallbackWithConnection extends IsReadyToPayServiceCallback.Stub {
    public ServiceConnection A00;
    public C143728hD A01;
    public final /* synthetic */ AnonymousClass7IX A02;

    public W3CClient$IsReadyToPayCallbackWithConnection(ServiceConnection serviceConnection, C143728hD r4, AnonymousClass7IX r5) {
        this.A02 = r5;
        int A03 = C14030oh.A03(340105661);
        this.A01 = r4;
        this.A00 = serviceConnection;
        C14030oh.A0A(603062361, A03);
    }

    public final void BNM(boolean z) {
        int A03 = C14030oh.A03(571402971);
        try {
            this.A01.C3J(z);
        } finally {
            AnonymousClass7IX r2 = this.A02;
            AnonymousClass7IX.A02(r2.A02, this.A00, r2);
            C14030oh.A0A(2065774221, A03);
        }
    }
}
