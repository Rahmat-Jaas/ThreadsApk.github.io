package X;

import java.util.Map;

/* renamed from: X.69G  reason: invalid class name */
public enum AnonymousClass69G {
    ;
    
    public static final Map A02 = null;
    public static final Map A03 = null;
    public final Class A00;
    public final String A01;

    /* access modifiers changed from: public */
    static {
        int i;
        A03 = AnonymousClass0wJ.A0y();
        A02 = AnonymousClass0wJ.A0y();
        for (AnonymousClass69G r2 : values()) {
            A03.put(r2.A01, r2);
            A02.put(r2.A00, r2);
        }
    }

    public abstract Object A00(String str);

    /* access modifiers changed from: public */
    AnonymousClass69G(String str, int i) {
        this.A01 = str;
        this.A00 = r1;
    }
}
