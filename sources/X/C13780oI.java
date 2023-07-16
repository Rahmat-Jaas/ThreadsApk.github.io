package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.provider.constants.ExternalProvider;
import com.facebook.profilo.provider.constants.ExternalProviders;
import com.facebook.systrace.Systrace;
import java.util.IllegalFormatException;

/* renamed from: X.0oI  reason: invalid class name and case insensitive filesystem */
public final class C13780oI {
    public static void A00(int i) {
        ExternalProvider externalProvider = ExternalProviders.A07;
        externalProvider.A08().A00(6, 22, i, 0, 0);
        if (!TraceEvents.isEnabled(externalProvider.A01)) {
            Systrace.A02(32);
        }
    }

    public static void A01(String str, int i) {
        if (TraceEvents.isEnabled(ExternalProviders.A07.A01)) {
            A02(str, i);
        } else if (Systrace.A0F(32)) {
            try {
                str = StringFormatUtil.formatStrLocaleSafe(str);
            } catch (IllegalFormatException e) {
                AnonymousClass0LU.A0I("Tracer", "Bad format string", e);
            }
            Systrace.A03(32, str);
        }
    }

    public static void A02(String str, int i) {
        ExternalProvider externalProvider = ExternalProviders.A07;
        if (TraceEvents.isEnabled(externalProvider.A01)) {
            int A00 = externalProvider.A08().A00(7, 21, i, 0, 0);
            if (str != null) {
                externalProvider.A08().A01(1, 83, A00, str);
            }
        }
    }

    public static void A03(String str, Object obj, int i) {
        if (TraceEvents.isEnabled(ExternalProviders.A07.A01)) {
            A02(StringFormatUtil.formatStrLocaleSafe(str, obj), i);
        } else if (Systrace.A0F(32)) {
            try {
                str = StringFormatUtil.formatStrLocaleSafe(str, obj);
            } catch (IllegalFormatException e) {
                AnonymousClass0LU.A0I("Tracer", "Bad format string", e);
            }
            Systrace.A03(32, str);
        }
    }
}
