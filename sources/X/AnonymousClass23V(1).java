package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.23V  reason: invalid class name */
public enum AnonymousClass23V {
    FINAL("FINAL"),
    ESTIMATED("ESTIMATED");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0L(r3));
        for (AnonymousClass23V r1 : values()) {
            A0v.put(r1.A00, r1);
        }
        A01 = A0v;
    }

    /* access modifiers changed from: public */
    AnonymousClass23V(String str) {
        this.A00 = str;
    }
}
