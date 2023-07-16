package com.facebookpay.offsite.models.message;

import X.C04220Ms;
import kotlin.jvm.internal.DefaultConstructorMarker;

public enum PaymentContainerType {
    BASIC_CARD_V1("basic-card-v1"),
    ECOM_TOKEN_V1("ecom-token-v1"),
    PAYPAL_OTC_V1("paypal-otc-v1");
    
    public static final Companion Companion = null;
    public final String type;

    /* access modifiers changed from: public */
    static {
        Companion = new Companion();
    }

    public final String getType() {
        return this.type;
    }

    /* access modifiers changed from: public */
    PaymentContainerType(String str) {
        this.type = str;
    }

    public final class Companion {
        public final PaymentContainerType fromString(String str) {
            C04220Ms.A0B(str, 0);
            for (PaymentContainerType paymentContainerType : PaymentContainerType.values()) {
                if (str.equals(paymentContainerType.getType())) {
                    return paymentContainerType;
                }
            }
            return null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }
}
