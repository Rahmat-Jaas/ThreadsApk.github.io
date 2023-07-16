package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.24L  reason: invalid class name */
public enum AnonymousClass24L {
    UNKNOWN(-1),
    TEXT(0),
    MUSIC(1),
    AVATAR(2);
    
    public static final Map A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        AnonymousClass24L[] values = values();
        int length = values.length;
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0L(length));
        while (i < length) {
            AnonymousClass24L r1 = values[i];
            i = C18200wM.A08(r1, A0v, r1.A00, i);
        }
        A01 = A0v;
    }

    /* access modifiers changed from: public */
    AnonymousClass24L(int i) {
        this.A00 = i;
    }
}
