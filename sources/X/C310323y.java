package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.23y  reason: invalid class name and case insensitive filesystem */
public enum C310323y {
    NONE(0),
    PERSISTENT(1),
    PAUSED_ONLY(2);
    
    public static final Map A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C310323y[] values = values();
        int length = values.length;
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0L(length));
        while (i < length) {
            C310323y r1 = values[i];
            i = C18200wM.A08(r1, A0v, r1.A00, i);
        }
        A01 = A0v;
    }

    /* access modifiers changed from: public */
    C310323y(int i) {
        this.A00 = i;
    }
}
