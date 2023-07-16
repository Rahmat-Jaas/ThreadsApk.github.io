package X;

import com.facebook.redex.IDxFunctionShape152S0200000_2_I2;
import com.instagram.fbpay.paymentmethods.data.IGPaymentMethodsAPI;
import java.util.Set;

/* renamed from: X.6q3  reason: invalid class name and case insensitive filesystem */
public final class C112706q3 {
    public C104996ci A00;
    public IGPaymentMethodsAPI A01;
    public M5J A02;
    public final C880756q A03 = C880756q.A01();

    public final void A00(Set set) {
        M5J m5j = this.A02;
        if (m5j != null) {
            this.A03.A0J(m5j);
        }
        M5J A002 = AnonymousClass5k7.A00(new IDxFunctionShape152S0200000_2_I2(15, this, set), this.A00);
        this.A02 = A002;
        C880856r.A05(A002, this.A03, this, 244);
    }

    public C112706q3(C104996ci r2, IGPaymentMethodsAPI iGPaymentMethodsAPI) {
        this.A01 = iGPaymentMethodsAPI;
        this.A00 = r2;
    }
}
