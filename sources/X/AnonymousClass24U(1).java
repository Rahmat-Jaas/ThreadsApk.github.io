package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.24U  reason: invalid class name */
public enum AnonymousClass24U {
    PRODUCTION(""),
    ENDCARD_AUTOPLAY("endcard_autoplay"),
    THREE_CARDS("three_cards"),
    UP_NEXT_OVERLAY("up_next_overlay"),
    RIFU_OVERLAY("rifu_overlay");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0L(r3));
        for (AnonymousClass24U r1 : values()) {
            A0v.put(r1.A00, r1);
        }
        A01 = A0v;
    }

    /* access modifiers changed from: public */
    AnonymousClass24U(String str) {
        this.A00 = str;
    }
}
