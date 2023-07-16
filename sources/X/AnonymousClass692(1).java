package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.692  reason: invalid class name */
public enum AnonymousClass692 {
    BASIC_CARD_V1("BASIC_CARD_V1", "basic-card-v1"),
    FB_TOKEN_V1("FB_TOKEN_V1", "fb-token-v1"),
    ECOM_TOKEN_V1("ECOM_TOKEN_V1", "ecom-token-v1"),
    META_PAYMENT_V1("META_PAYMENT_V1", "meta-payment-v1"),
    PAYPAL_OTC_V1("PAYPAL_OTC_V1", "paypal-otc-v1");
    
    public static final Map A02 = null;
    public final String A00;
    public final String A01;

    /* access modifiers changed from: public */
    static {
        int i;
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0L(r3));
        for (AnonymousClass692 r1 : values()) {
            A0v.put(r1.A01, r1);
        }
        A02 = A0v;
    }

    /* access modifiers changed from: public */
    AnonymousClass692(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
