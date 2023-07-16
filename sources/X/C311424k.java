package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.24k  reason: invalid class name and case insensitive filesystem */
public enum C311424k {
    PASSWORD("Password"),
    NONCE("Nonce"),
    LOCALAUTH("LocalAuth"),
    IG_SSO("IG_SSO"),
    FB_SSO("FB_SSO"),
    OPENID("OpenID"),
    UNKNOWN("Unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0L(r3));
        for (C311424k r1 : values()) {
            A0v.put(r1.A00, r1);
        }
        A01 = A0v;
    }

    /* access modifiers changed from: public */
    C311424k(String str) {
        this.A00 = str;
    }
}
