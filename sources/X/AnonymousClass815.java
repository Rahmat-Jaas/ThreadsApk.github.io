package X;

import com.fbpay.w3c.FBPaymentServiceContactCallback;
import com.instagram.fbpay.w3c.ipc.FBPaymentServiceImpl;

/* renamed from: X.815  reason: invalid class name */
public final class AnonymousClass815 implements Runnable {
    public final /* synthetic */ FBPaymentServiceContactCallback A00;
    public final /* synthetic */ FBPaymentServiceImpl A01;

    public AnonymousClass815(FBPaymentServiceContactCallback fBPaymentServiceContactCallback, FBPaymentServiceImpl fBPaymentServiceImpl) {
        this.A01 = fBPaymentServiceImpl;
        this.A00 = fBPaymentServiceContactCallback;
    }

    public final void run() {
        FBPaymentServiceImpl fBPaymentServiceImpl = this.A01;
        C113406rL r0 = fBPaymentServiceImpl.A02;
        if (r0 != null) {
            C145388kQ r2 = ((C111136mq) r0.A00.get()).A03;
            C04220Ms.A0B(r2, 0);
            C99256Is.A00(fBPaymentServiceImpl, C30821GXg.A01(new C880056g(r2), AnonymousClass8NH.A00), C86164wN.A0s(this.A00, 19));
        }
    }
}
