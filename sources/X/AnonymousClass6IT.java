package X;

import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.offsite.models.message.PaymentConfiguration;
import com.facebookpay.offsite.models.message.PaymentRequest;
import java.util.Locale;

/* renamed from: X.6IT  reason: invalid class name */
public final /* synthetic */ class AnonymousClass6IT {
    public static PaymentReceiverInfo A00(C146668mf r6, PaymentRequest paymentRequest) {
        String str;
        String str2;
        PaymentConfiguration paymentConfiguration = paymentRequest.content.paymentConfiguration;
        C04220Ms.A0B(paymentConfiguration, 0);
        String str3 = paymentConfiguration.partnerId;
        if (str3 == null || str3.length() == 0 || (str = paymentConfiguration.partnerMerchantId) == null || str.length() == 0) {
            return r6.AXJ().A00();
        }
        String str4 = null;
        PaymentReceiverInfo paymentReceiverInfo = new PaymentReceiverInfo((String) null, paymentConfiguration.merchantName, (String) null, C86154wM.A0o(Locale.ROOT, "%s::%s", C86144wL.A1a(str3, str)));
        PaymentReceiverInfo A00 = r6.AXJ().A00();
        String str5 = null;
        if (A00 != null) {
            str2 = A00.A02;
        } else {
            str2 = null;
        }
        PaymentReceiverInfo A002 = r6.AXJ().A00();
        if (A002 != null) {
            str4 = A002.A03;
        }
        PaymentReceiverInfo A003 = r6.AXJ().A00();
        if (A003 != null) {
            str5 = A003.A01;
        }
        PaymentReceiverInfo paymentReceiverInfo2 = new PaymentReceiverInfo(str2, str4, str5, paymentReceiverInfo.A00);
        String str6 = paymentReceiverInfo2.A02;
        if (str6 == null || str6.length() == 0) {
            return paymentReceiverInfo;
        }
        return paymentReceiverInfo2;
    }
}
