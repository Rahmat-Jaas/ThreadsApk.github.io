package X;

import com.facebookpay.paymentmethod.model.PaymentMethod;

/* renamed from: X.8XP  reason: invalid class name */
public final class AnonymousClass8XP extends C02220Ah implements AnonymousClass0YP {
    public static final AnonymousClass8XP A00 = new AnonymousClass8XP();

    public AnonymousClass8XP() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str;
        AnonymousClass7Kx r4 = (AnonymousClass7Kx) obj;
        AnonymousClass7Kx r5 = (AnonymousClass7Kx) obj2;
        AnonymousClass0wJ.A1N(r4, r5);
        PaymentMethod paymentMethod = (PaymentMethod) r4.A01;
        String str2 = null;
        if (paymentMethod != null) {
            str = paymentMethod.Aal();
        } else {
            str = null;
        }
        PaymentMethod paymentMethod2 = (PaymentMethod) r5.A01;
        if (paymentMethod2 != null) {
            str2 = paymentMethod2.Aal();
        }
        return C86124wJ.A0f(str, str2);
    }
}
