package X;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.31g  reason: invalid class name and case insensitive filesystem */
public final class C549931g {
    public static final Map A00 = AnonymousClass0wJ.A0y();
    public static final Map A01 = AnonymousClass0wJ.A0y();

    static {
        HashMap A0y = AnonymousClass0wJ.A0y();
        for (AnonymousClass25Y r3 : AnonymousClass25Y.values()) {
            String replace = r3.toString().replace("_", "");
            Locale locale = Locale.US;
            A0y.put(replace.toUpperCase(locale), r3);
            A01.put(r3.toString().toUpperCase(locale), r3);
        }
        for (C28999Ffo ffo : C28999Ffo.values()) {
            Object obj = A0y.get(ffo.toString().toUpperCase(Locale.US));
            if (obj != null) {
                A00.put(obj, ffo);
            }
        }
    }
}
