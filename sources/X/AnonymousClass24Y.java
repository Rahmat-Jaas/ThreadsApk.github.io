package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.24Y  reason: invalid class name */
public enum AnonymousClass24Y {
    NUM_SELECTED_PRODUCTS("num_selected_products"),
    NUM_SELECTED_COLLECTIONS("num_selected_collections"),
    DISABLE_DISCOUNTS_ON_PRODUCTS_SELECTION("disable_discounts_on_products_selection"),
    DISABLE_PRODUCTS_ON_AUTOTAG_DISCOUNT("disable_products_on_autotag_discount"),
    UNKNOWN("unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0L(r3));
        for (AnonymousClass24Y r1 : values()) {
            A0v.put(r1.A00, r1);
        }
        A01 = A0v;
    }

    /* access modifiers changed from: public */
    AnonymousClass24Y(String str) {
        this.A00 = str;
    }
}
