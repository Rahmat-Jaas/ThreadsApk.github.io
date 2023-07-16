package X;

import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.24a  reason: invalid class name and case insensitive filesystem */
public enum C310524a {
    XAR_UPSELL_VARIANT_V1("0"),
    XAR_UPSELL_REBRAND_VARIANT_1(RealtimeSubscription.GRAPHQL_MQTT_VERSION),
    XAR_UPSELL_REBRAND_VARIANT_2("2"),
    XAR_UPSELL_VARIANT_V2("11"),
    XAR_UPSELL_VARIANT_BUTTON_TEST("12"),
    XAR_UPSELL_VARIANT_SIZE_TEST("13");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0L(r3));
        for (C310524a r1 : values()) {
            A0v.put(r1.A00, r1);
        }
        A01 = A0v;
    }

    /* access modifiers changed from: public */
    C310524a(String str) {
        this.A00 = str;
    }
}
