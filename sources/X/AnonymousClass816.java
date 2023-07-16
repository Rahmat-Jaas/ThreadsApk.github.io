package X;

import com.instagram.fbpay.w3c.ipc.IsReadyToPayServiceImpl;
import org.chromium.IsReadyToPayServiceCallback;

/* renamed from: X.816  reason: invalid class name */
public final class AnonymousClass816 implements Runnable {
    public final /* synthetic */ IsReadyToPayServiceImpl A00;
    public final /* synthetic */ IsReadyToPayServiceCallback A01;

    public AnonymousClass816(IsReadyToPayServiceImpl isReadyToPayServiceImpl, IsReadyToPayServiceCallback isReadyToPayServiceCallback) {
        this.A00 = isReadyToPayServiceImpl;
        this.A01 = isReadyToPayServiceCallback;
    }

    public final void run() {
        IsReadyToPayServiceImpl isReadyToPayServiceImpl = this.A00;
        IsReadyToPayServiceCallback isReadyToPayServiceCallback = this.A01;
        M5J A002 = C120917Dc.A00().A00();
        A002.A0C(isReadyToPayServiceImpl, C86164wN.A0O(A002, isReadyToPayServiceCallback, 35));
    }
}
