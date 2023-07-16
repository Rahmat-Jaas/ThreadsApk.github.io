package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.24i  reason: invalid class name */
public enum AnonymousClass24i {
    NONE(0),
    CHEVRON_AND_TEXT(1),
    CHEVRON_ONLY(2),
    CHEVRON_BOUNCY_AND_TEXT(3),
    CHEVRON_AND_TEXT_PERSIST(4),
    FILLED_CHEVRON_AND_TEXT_PERSIST(5),
    CHEVRON_ONLY_OVER_CREATIVE(6);
    
    public static final Map A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        AnonymousClass24i[] values = values();
        int length = values.length;
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0L(length));
        while (i < length) {
            AnonymousClass24i r1 = values[i];
            i = C18200wM.A08(r1, A0v, r1.A00, i);
        }
        A01 = A0v;
    }

    /* access modifiers changed from: public */
    AnonymousClass24i(int i) {
        this.A00 = i;
    }
}
