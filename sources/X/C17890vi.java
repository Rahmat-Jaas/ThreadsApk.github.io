package X;

import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.provider.constants.ExternalProvider;
import com.facebook.profilo.provider.constants.ExternalProviders;
import com.facebook.systrace.Systrace;

/* renamed from: X.0vi  reason: invalid class name and case insensitive filesystem */
public final class C17890vi implements C14270p7 {
    public final void ANJ(C14300pA r11, String str, long j) {
        if (Systrace.A0F(j)) {
            String[] strArr = r11.A01;
            int i = r11.A00;
            ExternalProvider externalProvider = ExternalProviders.A07;
            if (i == 0) {
                externalProvider.A08().A00(6, 22, -1606012197, 0, 0);
            } else if (TraceEvents.isEnabled(externalProvider.A01)) {
                int A00 = externalProvider.A08().A00(7, 22, -1606012197, 0, 0);
                externalProvider.A08().A01(1, 83, A00, str);
                for (int i2 = 1; i2 < i; i2 += 2) {
                    String str2 = strArr[i2 - 1];
                    String str3 = strArr[i2];
                    if (!(str2 == null || str3 == null)) {
                        externalProvider.A08().A01(1, 57, externalProvider.A08().A01(1, 56, A00, str2), str3);
                    }
                }
            }
            if (!TraceEvents.isEnabled(externalProvider.A01)) {
                Systrace.A0E(strArr, i, j);
            }
        }
    }
}
