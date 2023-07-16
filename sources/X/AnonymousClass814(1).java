package X;

import com.fbpay.w3c.FBPaymentServiceCardDetailsCallback;
import com.instagram.fbpay.w3c.ipc.FBPaymentServiceImpl;

/* renamed from: X.814  reason: invalid class name */
public final class AnonymousClass814 implements Runnable {
    public final /* synthetic */ FBPaymentServiceCardDetailsCallback A00;
    public final /* synthetic */ FBPaymentServiceImpl A01;

    public AnonymousClass814(FBPaymentServiceCardDetailsCallback fBPaymentServiceCardDetailsCallback, FBPaymentServiceImpl fBPaymentServiceImpl) {
        this.A01 = fBPaymentServiceImpl;
        this.A00 = fBPaymentServiceCardDetailsCallback;
    }

    public final void run() {
        FBPaymentServiceImpl fBPaymentServiceImpl = this.A01;
        C113406rL r0 = fBPaymentServiceImpl.A02;
        if (r0 != null) {
            C99256Is.A00(fBPaymentServiceImpl, r0.A00(), C86164wN.A0s(this.A00, 18));
        }
    }
}
