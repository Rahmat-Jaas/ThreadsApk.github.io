package X;

import java.util.Map;

/* renamed from: X.24c  reason: invalid class name and case insensitive filesystem */
public enum C310724c {
    NO_BUTTON("no_button"),
    ONE_BUTTON_PRIMARY("one_button_primary"),
    ONE_BUTTON_PRIMARY_CONDENSED("one_button_primary"),
    TWO_BUTTON_VERTICAL_WITH_SECONDARY("two_button_vertical_with_secondary"),
    TWO_BUTTON_HORIZONTAL("two_button_horizontal"),
    TWO_BUTTON_VERTICAL("two_button_vertical");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = AnonymousClass0wJ.A0y();
        for (C310724c r2 : values()) {
            A01.put(r2.A00, r2);
        }
    }

    /* access modifiers changed from: public */
    C310724c(String str) {
        this.A00 = str;
    }
}
