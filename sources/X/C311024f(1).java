package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.24f  reason: invalid class name and case insensitive filesystem */
public enum C311024f {
    CIRCLE("circle"),
    GRAYED_OUT_CIRCLE("grayed_out_circle"),
    SQUARE("square"),
    GRAYED_OUT_SQUARE("grayed_out_square"),
    GRAYED_OUT_SQUARE_WITH_LINE("grayed_out_square_with_line"),
    UNKNOWN("unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0L(r3));
        for (C311024f r1 : values()) {
            A0v.put(r1.A00, r1);
        }
        A01 = A0v;
    }

    /* access modifiers changed from: public */
    C311024f(String str) {
        this.A00 = str;
    }
}
