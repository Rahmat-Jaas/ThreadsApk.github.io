package X;

import java.util.Map;

/* renamed from: X.25E  reason: invalid class name */
public enum AnonymousClass25E {
    OTHER("other");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = AnonymousClass0wJ.A0y();
        for (AnonymousClass25E r2 : values()) {
            A01.put(r2.A00, r2);
        }
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    AnonymousClass25E(String str) {
        this.A00 = str;
    }
}
