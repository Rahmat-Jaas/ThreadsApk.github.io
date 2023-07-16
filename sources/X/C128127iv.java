package X;

import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.expresscheckout.models.CheckoutResponse;
import com.facebookpay.expresscheckout.models.ECPPaymentResponseParams;
import com.fbpay.logging.LoggingContext;

/* renamed from: X.7iv  reason: invalid class name and case insensitive filesystem */
public final class C128127iv implements ECPHandler {
    public final /* synthetic */ C113996sW A00;

    public final /* synthetic */ void BN6(AnonymousClass7Kx r1) {
    }

    public final void BN9(C110326lV r1, LoggingContext loggingContext, Integer num) {
    }

    public final void BNA() {
    }

    public final void BNB(boolean z) {
    }

    public final void Ch0(C111186mv r1) {
    }

    public final void Ciw(C1373788i r1) {
    }

    public final void Cix(CheckoutResponse checkoutResponse) {
    }

    public final void Cqk(AnonymousClass7Kx r1) {
    }

    public C128127iv(C113996sW r1) {
        this.A00 = r1;
    }

    public final M5J BNU(ECPPaymentResponseParams eCPPaymentResponseParams) {
        if (eCPPaymentResponseParams.A0H != null) {
            AnonymousClass0wJ.A0F().postDelayed(this.A00.A06, AnonymousClass7AM.A01.A06(4000, 10000));
        }
        return this.A00.A01;
    }

    public final M5J D7U() {
        return this.A00.A02;
    }

    public final M5J ACm() {
        return C880856r.A03();
    }

    public final M5J ACn() {
        return C880856r.A02();
    }

    public final M5J CWD() {
        return C880856r.A02();
    }
}
