package X;

import java.util.HashMap;

/* renamed from: X.8HA  reason: invalid class name */
public final class AnonymousClass8HA extends C02220Ah implements AnonymousClass0ZU {
    public static final AnonymousClass8HA A00 = new AnonymousClass8HA();

    public AnonymousClass8HA() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("CHECKOUT_ERROR", "Proactive checkout is not supported for this user.");
        A0y.put("SECURITY_ERROR", "Security domain mismatch. Payment availability and request are from different domains.");
        A0y.put("ABORTED", "User cancelled checkout.");
        A0y.put("“MULTIPLE_CHECKOUT_REQUEST", "Payment checkout request issued when there is an outstanding request.");
        A0y.put("INTERNAL_ERROR", "There was an internal error.");
        A0y.put("CHECKOUT_ERROR_RISK", "Risk assessment blocked payment request.");
        A0y.put("PARTNER_MISMATCH", "Partner id mismatch. Payment availability and requests are using different partner id.");
        A0y.put("MERCHANT_MISMATCH", "Merchant id mismatch. Payment availability and requests are using different merchant id.");
        A0y.put("CHECKOUT_UNAVAILABLE", "Checkout requested when unavailable.");
        A0y.put("PAYMENT_MODE_MISMATCH", "Payment mode mismatch. Payment availability and payment request have different modes.");
        A0y.put("ECP_LAUNCH_PARAMS_NULL", "ECPPaymentRequest was null.");
        A0y.put("DISMISSED_FOR_SESSION", "User has dismissed Meta payment for this browser session.");
        return A0y;
    }
}
