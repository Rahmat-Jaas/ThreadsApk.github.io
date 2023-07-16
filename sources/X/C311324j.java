package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.24j  reason: invalid class name and case insensitive filesystem */
public enum C311324j {
    LOGIN("Login"),
    REGISTRATION("Registration"),
    ACCOUNT_RECOVERY("AccountRecovery"),
    AYMH("AccountsYouMayHave"),
    EAR("ExtendedAccountRecovery"),
    EPSILONMAGICLINK("EpsilonMagicLink"),
    UNKNOWN("Unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0L(r3));
        for (C311324j r1 : values()) {
            A0v.put(r1.A00, r1);
        }
        A01 = A0v;
    }

    /* access modifiers changed from: public */
    C311324j(String str) {
        this.A00 = str;
    }
}
