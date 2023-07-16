package X;

import com.facebookpay.offsite.models.message.PaymentRequestContent;
import com.facebookpay.offsite.models.message.PaymentUXFlags;
import java.util.Set;

/* renamed from: X.6IW  reason: invalid class name */
public final class AnonymousClass6IW {
    public static final String A00(PaymentRequestContent paymentRequestContent) {
        C04220Ms.A0B(paymentRequestContent, 0);
        Set<PaymentUXFlags> set = paymentRequestContent.paymentConfiguration.uxFlags;
        if (set == null || !set.contains(PaymentUXFlags.META_CHECKOUT)) {
            return "742725890006429";
        }
        return "1302814060304063";
    }
}
