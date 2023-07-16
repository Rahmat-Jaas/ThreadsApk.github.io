package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.6JS  reason: invalid class name */
public final class AnonymousClass6JS {
    public static void A00(QuickPerformanceLogger quickPerformanceLogger, Map map, int i, int i2) {
        Iterator A0z = AnonymousClass0wJ.A0z(map);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            String str = (String) A0o.getKey();
            Object value = A0o.getValue();
            if (value != null) {
                QuickPerformanceLogger quickPerformanceLogger2 = quickPerformanceLogger;
                int i3 = i;
                int i4 = i2;
                if (value instanceof String) {
                    quickPerformanceLogger.markerAnnotate(i, i2, str, (String) value);
                } else if (value instanceof Integer) {
                    quickPerformanceLogger.markerAnnotate(i, i2, str, AnonymousClass0wJ.A04(value));
                } else if (value instanceof Double) {
                    quickPerformanceLogger2.markerAnnotate(i3, i4, str, C86124wJ.A00(value));
                } else if (value instanceof Long) {
                    quickPerformanceLogger2.markerAnnotate(i3, i4, str, C18190wL.A08(value));
                } else if (value instanceof Boolean) {
                    quickPerformanceLogger.markerAnnotate(i, i2, str, AnonymousClass0wJ.A1X(value));
                } else if (value instanceof String[]) {
                    quickPerformanceLogger.markerAnnotate(i, i2, str, (String[]) value);
                } else if (value instanceof int[]) {
                    quickPerformanceLogger.markerAnnotate(i, i2, str, (int[]) value);
                } else if (value instanceof double[]) {
                    quickPerformanceLogger.markerAnnotate(i, i2, str, (double[]) value);
                } else if (value instanceof long[]) {
                    quickPerformanceLogger.markerAnnotate(i, i2, str, (long[]) value);
                } else if (value instanceof boolean[]) {
                    quickPerformanceLogger.markerAnnotate(i, i2, str, (boolean[]) value);
                } else {
                    C10450iM.A03("VideoQpl", String.format(Locale.US, "Failed to annotate marker: markerId %d instanceId %d key %s value %s class %s", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str, value, C18210wN.A0e(value)}));
                }
            }
        }
    }
}
