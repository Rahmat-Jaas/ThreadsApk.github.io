package X;

import java.util.Map;

/* renamed from: X.23P  reason: invalid class name */
public enum AnonymousClass23P {
    UPDATE_CHECKOUT_API("update_checkout_api");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = AnonymousClass0wJ.A0y();
        for (AnonymousClass23P r2 : values()) {
            A01.put(r2.A00, r2);
        }
    }

    /* access modifiers changed from: public */
    AnonymousClass23P(String str) {
        this.A00 = str;
    }
}
