package X;

import com.facebookpay.expresscheckout.models.ECPPaymentResponseParams;
import com.facebookpay.offsite.models.message.PaymentRequest;
import com.fbpay.logging.LoggingContext;
import com.fbpay.logging.LoggingPolicy;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* renamed from: X.7Gp  reason: invalid class name and case insensitive filesystem */
public final class C121537Gp {
    public static final C121537Gp A00 = new C121537Gp();
    public static final LoggingPolicy A01 = new LoggingPolicy("payments_offsite_partners", AnonymousClass0wJ.A0v());

    public static final LoggingContext A00(String str, String str2) {
        C04220Ms.A0B(str, 0);
        long parseLong = Long.parseLong(str2);
        LoggingPolicy loggingPolicy = A01;
        AnonymousClass84Y r3 = AnonymousClass84Y.A00;
        return new LoggingContext(loggingPolicy, str, r3, r3, parseLong, false);
    }

    public static final Map A01(PaymentRequest paymentRequest, String str, String str2) {
        C04220Ms.A0B(str, 1);
        LinkedHashMap A0y = C18220wO.A0y();
        C86134wK.A1S(str2, str, A0y);
        A0y.put("PARTNER_MERCHANT_ID", paymentRequest.content.paymentConfiguration.partnerMerchantId);
        A0y.put("PARTNER_ID", paymentRequest.content.paymentConfiguration.partnerId);
        A0y.put("MERCHANT_REQUEST_ID", paymentRequest.msgId);
        return A0y;
    }

    public final Map A02(ECPPaymentResponseParams eCPPaymentResponseParams, String str, String str2, String str3) {
        AnonymousClass0wJ.A1N(eCPPaymentResponseParams, str);
        Pair A0p = C18180wK.A0p("logging_context", A00(str2, str));
        List list = eCPPaymentResponseParams.A0Q;
        Map A0I = AnonymousClass4WJ.A0I(A0p, C18180wK.A0p("APPLIED_DISCOUNTS", list), C18180wK.A0p("APPLIED_DISCOUNTS", list), C18180wK.A0p("CONTAINER_IDS", C18180wK.A0n(eCPPaymentResponseParams.A0A)), C18180wK.A0p("VIEW_NAME", "merchant_validation"));
        C40307LcE lcE = eCPPaymentResponseParams.A03;
        if (lcE != null) {
            A0I.put("CREDENTIAL_TYPE", lcE);
        }
        Long l = eCPPaymentResponseParams.A07;
        if (l != null) {
            A0I.put("CREDENTIAL_ID", l);
        }
        if (str3 != null) {
            A0I.put(C18170wI.A00(48), str3);
        }
        return A0I;
    }
}
