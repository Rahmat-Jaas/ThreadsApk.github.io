package X;

import java.util.Locale;
import java.util.Map;

/* renamed from: X.2SD  reason: invalid class name */
public final class AnonymousClass2SD {
    public static final C35355ItJ A00(String str) {
        String str2;
        Map map = C35355ItJ.A01;
        if (str != null) {
            str2 = C18190wL.A0r(Locale.ROOT, str);
        } else {
            str2 = null;
        }
        C35355ItJ itJ = (C35355ItJ) map.get(str2);
        if (itJ == null) {
            return C35355ItJ.SETTINGS;
        }
        return itJ;
    }
}
