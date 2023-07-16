package X;

import com.fbpay.w3c.FBPaymentServiceAddressCallback;
import com.instagram.fbpay.w3c.ipc.FBPaymentServiceImpl;

/* renamed from: X.813  reason: invalid class name */
public final class AnonymousClass813 implements Runnable {
    public final /* synthetic */ FBPaymentServiceAddressCallback A00;
    public final /* synthetic */ FBPaymentServiceImpl A01;

    public AnonymousClass813(FBPaymentServiceAddressCallback fBPaymentServiceAddressCallback, FBPaymentServiceImpl fBPaymentServiceImpl) {
        this.A01 = fBPaymentServiceImpl;
        this.A00 = fBPaymentServiceAddressCallback;
    }

    public final void run() {
        FBPaymentServiceImpl fBPaymentServiceImpl = this.A01;
        C113406rL r0 = fBPaymentServiceImpl.A02;
        if (r0 != null) {
            C145388kQ r2 = ((C111136mq) r0.A00.get()).A01;
            C04220Ms.A0B(r2, 0);
            C99256Is.A00(fBPaymentServiceImpl, C30821GXg.A01(new C880056g(r2), AnonymousClass8NF.A00), C86164wN.A0s(this.A00, 16));
        }
    }
}
