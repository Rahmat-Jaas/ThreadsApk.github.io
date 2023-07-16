package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.23i  reason: invalid class name and case insensitive filesystem */
public enum C308823i {
    SUBSCRIBERS_ONLY("subscriber_comments_only"),
    NOT_SET("no_filter");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0L(r3));
        for (C308823i r1 : values()) {
            A0v.put(r1.A00, r1);
        }
        A01 = A0v;
    }

    /* access modifiers changed from: public */
    C308823i(String str) {
        this.A00 = str;
    }
}
