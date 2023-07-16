package X;

import com.facebookpay.offsite.models.message.PriceTableAnnotation$Companion;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.68v  reason: invalid class name and case insensitive filesystem */
public enum C973068v {
    SUBTOTAL(PriceTableAnnotation$Companion.SUBTOTAL),
    TAX(PriceTableAnnotation$Companion.ESTIMATED_TAX),
    SHIPPING("SHIPPING"),
    DISCOUNT(PriceTableAnnotation$Companion.OFFER),
    PRE_TAX_DISCOUNT("PRE_TAX_DISCOUNT"),
    FEE(PriceTableAnnotation$Companion.FEE),
    TOTAL(PriceTableAnnotation$Companion.TOTAL),
    FULFILLMENT(PriceTableAnnotation$Companion.FULFILLMENT);
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0L(r3));
        for (C973068v r1 : values()) {
            A0v.put(r1.A00, r1);
        }
        A01 = A0v;
    }

    /* access modifiers changed from: public */
    C973068v(String str) {
        this.A00 = str;
    }
}
