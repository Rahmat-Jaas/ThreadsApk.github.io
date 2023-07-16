package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.24h  reason: invalid class name and case insensitive filesystem */
public enum C311224h {
    NOT_INVALIDATE("not_invalidate"),
    SEEN_STATE("seen"),
    APP_INSTALL("app_install"),
    X_OUT("x-out"),
    ADS_INSERTED("ads_inserted"),
    ADS_POOL("ads_pool"),
    UNKNOWN("unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0L(r3));
        for (C311224h r1 : values()) {
            A0v.put(r1.A00, r1);
        }
        A01 = A0v;
    }

    /* access modifiers changed from: public */
    C311224h(String str) {
        this.A00 = str;
    }
}
