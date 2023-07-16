package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.24e  reason: invalid class name and case insensitive filesystem */
public enum C310924e {
    CONNECTED_LIVE("connected_live"),
    MARQUEE_LIVE("marquee_live"),
    MARQUEE_DROP("marquee_drop"),
    UNCONNECTED_LIVE("unconnected_live"),
    FALLBACK_PRODUCT("fallback_product"),
    UNKNOWN("unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0L(r3));
        for (C310924e r1 : values()) {
            A0v.put(r1.A00, r1);
        }
        A01 = A0v;
    }

    /* access modifiers changed from: public */
    C310924e(String str) {
        this.A00 = str;
    }
}
