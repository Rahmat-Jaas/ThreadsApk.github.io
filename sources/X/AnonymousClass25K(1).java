package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.25K  reason: invalid class name */
public enum AnonymousClass25K {
    STORIES_VIEWER_TOP_PARTICIPANTS_BOTTOMSHEET("stories_viewer_top_participants_bottomsheet"),
    NOTIFICATION("notification");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0L(r3));
        for (AnonymousClass25K r1 : values()) {
            A0v.put(r1.A00, r1);
        }
        A01 = A0v;
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    AnonymousClass25K(String str) {
        this.A00 = str;
    }
}
