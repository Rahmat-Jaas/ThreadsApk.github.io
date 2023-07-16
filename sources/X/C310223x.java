package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.23x  reason: invalid class name and case insensitive filesystem */
public enum C310223x {
    ALL(0),
    DIAGONAL(1),
    ANTI_DIAGONAL(2);
    
    public static final Map A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C310223x[] values = values();
        int length = values.length;
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0L(length));
        while (i < length) {
            C310223x r1 = values[i];
            i = C18200wM.A08(r1, A0v, r1.A00, i);
        }
        A01 = A0v;
    }

    /* access modifiers changed from: public */
    C310223x(int i) {
        this.A00 = i;
    }
}
