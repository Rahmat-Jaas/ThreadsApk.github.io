package X;

import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.24y  reason: invalid class name and case insensitive filesystem */
public enum C312724y {
    UPSELL_DESIGN_VARIANT_0(0, "9"),
    UPSELL_DESIGN_VARIANT_1(1, RealtimeSubscription.GRAPHQL_MQTT_VERSION),
    UPSELL_DESIGN_VARIANT_3(3, "10"),
    UPSELL_DESIGN_VARIANT_NO_UPSELL(4, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
    
    public static final Map A02 = null;
    public final String A00;
    public final long A01;

    /* access modifiers changed from: public */
    static {
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0L(r5));
        for (C312724y r2 : values()) {
            A0v.put(Long.valueOf(r2.A01), r2);
        }
        A02 = A0v;
    }

    /* access modifiers changed from: public */
    C312724y(long j, String str) {
        this.A01 = j;
        this.A00 = str;
    }
}
