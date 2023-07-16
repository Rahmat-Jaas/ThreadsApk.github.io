package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.24T  reason: invalid class name */
public enum AnonymousClass24T {
    WITH_USERNAME("with_username"),
    NO_USERNAME("no_username"),
    NO_DESIGN("no_design"),
    BOTTOM_WITH_ICON_COMPACT("bottom_with_icon_compact"),
    BOTTOM_WITH_ICON_LARGE("bottom_with_icon_large");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0L(r3));
        for (AnonymousClass24T r1 : values()) {
            A0v.put(r1.A00, r1);
        }
        A01 = A0v;
    }

    /* access modifiers changed from: public */
    AnonymousClass24T(String str) {
        this.A00 = str;
    }
}
