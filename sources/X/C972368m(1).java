package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.68m  reason: invalid class name and case insensitive filesystem */
public enum C972368m {
    UNKNOWN("UNKNOWN"),
    FEED("FEED"),
    STORY("STORY"),
    NO_LOCATION("NO_LOCATION");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0L(r3));
        for (C972368m r1 : values()) {
            A0v.put(r1.A00, r1);
        }
        A01 = A0v;
    }

    /* access modifiers changed from: public */
    C972368m(String str) {
        this.A00 = str;
    }
}
