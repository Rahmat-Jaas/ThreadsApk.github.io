package com.facebookpay.offsite.models.message;

import X.AnonymousClass00J;
import X.AnonymousClass00U;
import X.AnonymousClass0ZV;
import X.C04220Ms;
import X.C18180wK;
import X.C18190wL;
import X.C18240wQ;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class MessageParamsKt {
    public static final String formatCurrency(PaymentCurrencyAmount paymentCurrencyAmount) {
        C04220Ms.A0B(paymentCurrencyAmount, 0);
        return AnonymousClass00U.A0L(Currency.getInstance(paymentCurrencyAmount.currency).getSymbol(), paymentCurrencyAmount.value);
    }

    public static final List getErrors(PaymentDetailsUpdate paymentDetailsUpdate) {
        C04220Ms.A0B(paymentDetailsUpdate, 0);
        List<PaymentDataError> list = paymentDetailsUpdate.errors;
        if (list != null) {
            return list;
        }
        List mapKeyToErrorField = mapKeyToErrorField(paymentDetailsUpdate.shippingAddressErrors);
        List mapKeyToErrorField2 = mapKeyToErrorField(paymentDetailsUpdate.offerCodeErrors);
        if (mapKeyToErrorField == null) {
            return mapKeyToErrorField2;
        }
        if (mapKeyToErrorField2 == null) {
            mapKeyToErrorField2 = AnonymousClass0ZV.A00;
        }
        return AnonymousClass00J.A0V(mapKeyToErrorField2, mapKeyToErrorField);
    }

    public static final List mapKeyToErrorField(PaymentDetailsUpdatedError paymentDetailsUpdatedError) {
        PaymentDataErrorField paymentDataErrorField;
        if (paymentDetailsUpdatedError == null) {
            return null;
        }
        ArrayList A0k = C18240wQ.A0k(paymentDetailsUpdatedError.size());
        Iterator A0u = C18190wL.A0u(paymentDetailsUpdatedError);
        while (A0u.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0u);
            PaymentDataErrorReason paymentDataErrorReason = ((PaymentDataError) A0o.getValue()).reason;
            PaymentDataErrorField[] values = PaymentDataErrorField.values();
            int i = 0;
            int length = values.length;
            while (true) {
                if (i >= length) {
                    paymentDataErrorField = PaymentDataErrorField.unknown;
                    break;
                }
                paymentDataErrorField = values[i];
                if (C04220Ms.A0I(paymentDataErrorField.name(), A0o.getKey())) {
                    break;
                }
                i++;
            }
            A0k.add(new PaymentDataError(paymentDataErrorReason, paymentDataErrorField, ((PaymentDataError) A0o.getValue()).message));
        }
        return AnonymousClass00J.A0N(A0k);
    }
}
