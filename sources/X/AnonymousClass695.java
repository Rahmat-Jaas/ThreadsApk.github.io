package X;

import java.util.regex.Pattern;

/* renamed from: X.695  reason: invalid class name */
public enum AnonymousClass695 {
    UNKNOWN(r3, 0, 16),
    AMEX(r3, 1, 15),
    DISCOVER(r3, 2, 16),
    JCB(r3, 3, 16),
    MASTER_CARD(r3, 4, 16),
    RUPAY(r3, 5, 16),
    VISA(r9, 6, 16);
    
    public final int A00;
    public final String A01;
    public final Pattern A02;

    /* access modifiers changed from: public */
    AnonymousClass695(Pattern pattern, int i, int i2) {
        this.A02 = pattern;
        this.A00 = i2;
        this.A01 = r2;
    }
}
