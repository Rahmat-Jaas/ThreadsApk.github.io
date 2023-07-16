package X;

import java.util.Locale;

/* renamed from: X.6BL  reason: invalid class name */
public enum AnonymousClass6BL implements C021109v {
    ;
    
    public final String A00;

    public static AnonymousClass6BL A00(C021109v r1, AnonymousClass0V3 r2, String str) {
        r2.A04(r1, "mutation_data");
        Locale locale = Locale.US;
        C04220Ms.A08(locale);
        String upperCase = str.toUpperCase(locale);
        C04220Ms.A06(upperCase);
        return valueOf(upperCase);
    }

    /* access modifiers changed from: public */
    AnonymousClass6BL(String str) {
        this.A00 = str;
    }
}
