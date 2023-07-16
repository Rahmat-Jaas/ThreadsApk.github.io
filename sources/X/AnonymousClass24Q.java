package X;

import java.util.Map;

/* renamed from: X.24Q  reason: invalid class name */
public enum AnonymousClass24Q {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    ASPECT_FIT("ASPECT_FIT"),
    FULL_SCREEN("FULL_SCREEN"),
    ASPECT_FILL("ASPECT_FILL"),
    ASPECT_FIT_ONLY("ASPECT_FIT_ONLY");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = AnonymousClass0wJ.A0y();
        for (AnonymousClass24Q r2 : values()) {
            A01.put(r2.A00, r2);
        }
    }

    /* access modifiers changed from: public */
    AnonymousClass24Q(String str) {
        this.A00 = str;
    }
}
