package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.23h  reason: invalid class name and case insensitive filesystem */
public enum C308723h {
    VIEWER("viewer"),
    CHANNEL("channel");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        LinkedHashMap A0y = C18220wO.A0y();
        for (C308723h r1 : values()) {
            A0y.put(r1.A00, r1);
        }
        A01 = A0y;
    }

    /* access modifiers changed from: public */
    C308723h(String str) {
        this.A00 = str;
    }
}
