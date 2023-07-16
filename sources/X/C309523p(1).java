package X;

import java.util.HashMap;

/* renamed from: X.23p  reason: invalid class name and case insensitive filesystem */
public enum C309523p {
    DEFAULT(""),
    DATE_FOLLOWED_LATEST("date_followed_latest");
    
    public static final HashMap A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = AnonymousClass0wJ.A0y();
        for (C309523p r2 : values()) {
            A01.put(r2.A00, r2);
        }
    }

    /* access modifiers changed from: public */
    C309523p(String str) {
        this.A00 = str;
    }
}
