package X;

import java.util.Map;

/* renamed from: X.2AN  reason: invalid class name */
public enum AnonymousClass2AN implements C14040oi {
    ;
    
    public static final Map A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        A01 = AnonymousClass0wJ.A0y();
        for (AnonymousClass2AN r2 : values()) {
            C18250wR.A1F(r2, A01, r2.A00);
        }
    }

    public static AnonymousClass2AN A00(String str, int i, int i2) {
        return new AnonymousClass2AN(str, i, i2);
    }

    public final int getValue() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    AnonymousClass2AN(int i) {
        this.A00 = i;
    }
}
