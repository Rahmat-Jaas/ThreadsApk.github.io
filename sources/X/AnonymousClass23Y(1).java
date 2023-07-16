package X;

import java.util.Map;

/* renamed from: X.23Y  reason: invalid class name */
public enum AnonymousClass23Y {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    AUTOPLAY("AUTOPLAY");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = AnonymousClass0wJ.A0y();
        for (AnonymousClass23Y r2 : values()) {
            A01.put(r2.A00, r2);
        }
    }

    /* access modifiers changed from: public */
    AnonymousClass23Y(String str) {
        this.A00 = str;
    }
}
