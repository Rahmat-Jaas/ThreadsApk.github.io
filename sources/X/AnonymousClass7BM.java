package X;

import com.fbpay.logging.LoggingContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.7BM  reason: invalid class name */
public final class AnonymousClass7BM {
    public static AnonymousClass6BP A00(String str) {
        Enum enumR = AnonymousClass6BP.A0F;
        Enum A00 = AnonymousClass2C7.A00(AnonymousClass6BP.class, str);
        if (A00 != null) {
            enumR = A00;
        }
        return (AnonymousClass6BP) enumR;
    }

    public static void A02(AnonymousClass5Ck r2, Map map) {
        if (map.containsKey("logging_context")) {
            LoggingContext loggingContext = (LoggingContext) map.get("logging_context");
            C86104wH.A1K(r2, loggingContext);
            C89135Cb A00 = AnonymousClass7Hr.A00(loggingContext);
            if (A00 != null) {
                r2.A06(A00, "logging_policy");
            }
        }
    }

    public static List A01(Map map) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        List list = (List) map.get("DYNAMIC_AUTH_AUTH_TYPES");
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Enum A00 = AnonymousClass2C7.A00(AnonymousClass6BC.class, C18180wK.A0k(it));
                if (A00 != null) {
                    A0v.add(A00);
                }
            }
        }
        return A0v;
    }
}
