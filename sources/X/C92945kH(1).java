package X;

import com.instagram.common.task.IDxLTaskShape29S0300000_2_I2;
import com.instagram.fbpay.paymentmethods.data.IGPaymentMethodsAPI;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.5kH  reason: invalid class name and case insensitive filesystem */
public final class C92945kH extends C129017kq {
    public final AtomicReference A00;
    public final /* synthetic */ C111136mq A01;

    public final void A6o(C143718hC r7) {
        C04220Ms.A0B(r7, 0);
        super.A6o(r7);
        Object obj = this.A00.get();
        if (obj != null) {
            r7.CRe(obj);
        }
        C111136mq r5 = this.A01;
        synchronized (this) {
            C145388kQ r1 = r5.A00;
            if (r1 != null) {
                r1.AHZ(r5.A04);
            }
            IGPaymentMethodsAPI iGPaymentMethodsAPI = r5.A06;
            C04220Ms.A0B(iGPaymentMethodsAPI, 0);
            C31155GhB.A03(new IDxLTaskShape29S0300000_2_I2(1, (Object) null, iGPaymentMethodsAPI, C18250wR.A0c(C969867m.CREDIT_CARD)));
            C145388kQ A002 = C99246Ir.A00(iGPaymentMethodsAPI.A01, AnonymousClass8NE.A00);
            r5.A00 = A002;
            A002.A6o(r5.A04);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C92945kH(C111136mq r1) {
        this();
        this.A01 = r1;
    }

    public final void A01(Object obj) {
        super.A01(obj);
        this.A00.set(obj);
    }

    public C92945kH() {
        this.A00 = new AtomicReference();
    }
}
