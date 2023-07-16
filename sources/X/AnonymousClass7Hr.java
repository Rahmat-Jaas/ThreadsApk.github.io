package X;

import com.fbpay.logging.ClientSuppressionPolicy;
import com.fbpay.logging.LoggingContext;
import com.fbpay.logging.LoggingPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.7Hr  reason: invalid class name */
public final class AnonymousClass7Hr {
    public static final C89135Cb A00(LoggingContext loggingContext) {
        LoggingPolicy loggingPolicy = loggingContext.A01;
        if (loggingPolicy == null) {
            return null;
        }
        C89135Cb r3 = new C89135Cb();
        ArrayList arrayList = loggingPolicy.A01;
        ArrayList A0w = AnonymousClass0wJ.A0w(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ClientSuppressionPolicy clientSuppressionPolicy = (ClientSuppressionPolicy) it.next();
            C89125Ca r6 = new C89125Ca();
            String name = clientSuppressionPolicy.A00.name();
            Locale locale = Locale.US;
            C04220Ms.A08(locale);
            r6.A04(AnonymousClass6Az.valueOf(C18220wO.A0u(locale, name)), "suppression_mode");
            String str = clientSuppressionPolicy.A02;
            if (str != null) {
                r6.A0A("event_name", str);
            }
            C40304LcA lcA = clientSuppressionPolicy.A01;
            if (lcA != null) {
                r6.A04(C40323Lcd.valueOf(C18220wO.A0u(locale, lcA.name())), "payload_field");
            }
            A0w.add(r6);
        }
        r3.A0B("client_suppression_policy", A0w);
        r3.A0A("logging_policy_product", loggingPolicy.A00);
        return r3;
    }

    public static void A04(AnonymousClass0V3 r2, LoggingContext loggingContext) {
        r2.A09("product_id", Long.valueOf(loggingContext.A00));
        r2.A06(A00(loggingContext), "logging_policy");
    }

    public static final Set A01(LoggingPolicy loggingPolicy) {
        String str;
        LinkedHashSet A0u = C86134wK.A0u();
        Iterator it = loggingPolicy.A01.iterator();
        while (it.hasNext()) {
            ClientSuppressionPolicy clientSuppressionPolicy = (ClientSuppressionPolicy) it.next();
            if (clientSuppressionPolicy.A00 == AnonymousClass67J.EVENT && (str = clientSuppressionPolicy.A02) != null) {
                A0u.add(str);
            }
        }
        return A0u;
    }

    public static final Set A02(LoggingPolicy loggingPolicy) {
        C40304LcA lcA;
        String str;
        LinkedHashSet A0u = C86134wK.A0u();
        Iterator it = loggingPolicy.A01.iterator();
        while (it.hasNext()) {
            ClientSuppressionPolicy clientSuppressionPolicy = (ClientSuppressionPolicy) it.next();
            if (clientSuppressionPolicy.A00 == AnonymousClass67J.PAYLOAD_FIELD && (lcA = clientSuppressionPolicy.A01) != null) {
                int ordinal = lcA.ordinal();
                if (ordinal == 158 || ordinal == 763 || ordinal == 135) {
                    str = "component_data_id";
                } else {
                    str = lcA.name();
                }
                A0u.add(str);
            }
        }
        return A0u;
    }

    public static void A03(AnonymousClass0V3 r2, LoggingContext loggingContext) {
        r2.A06(A00(loggingContext), "logging_policy");
    }
}
