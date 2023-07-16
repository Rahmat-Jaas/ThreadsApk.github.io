package X;

import com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem;
import com.facebookpay.paymentmethod.model.PaymentMethod;

/* renamed from: X.7SD  reason: invalid class name */
public final class AnonymousClass7SD implements C142618fJ {
    public final /* synthetic */ boolean A00;

    public AnonymousClass7SD(boolean z) {
        this.A00 = z;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        PaymentMethod paymentMethod;
        C108806iy r7 = (C108806iy) obj;
        if (r7 != null) {
            paymentMethod = (PaymentMethod) r7.A01;
        } else {
            paymentMethod = null;
        }
        return new PuxPaymentMethodItem(AnonymousClass69U.A0a, paymentMethod, (Integer) null, false, !this.A00);
    }
}
