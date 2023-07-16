package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.243  reason: invalid class name */
public enum AnonymousClass243 {
    LIKE_ROW(1),
    HEADER(2),
    HEADER_THIRD_LINE(3);
    
    public static final Map A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        AnonymousClass243[] values = values();
        int length = values.length;
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0L(length));
        while (i < length) {
            AnonymousClass243 r1 = values[i];
            i = C18200wM.A08(r1, A0v, r1.A00, i);
        }
        A01 = A0v;
    }

    /* access modifiers changed from: public */
    AnonymousClass243(int i) {
        this.A00 = i;
    }
}
