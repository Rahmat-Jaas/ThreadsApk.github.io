package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0MY  reason: invalid class name */
public final class AnonymousClass0MY {
    public static final AnonymousClass0MY A02 = new AnonymousClass0MY("anr_report_file", "__", false);
    public static final AnonymousClass0MY A03 = new AnonymousClass0MY("APP_PROCESS_FILE", "", true);
    public static final AnonymousClass0MY A04 = new AnonymousClass0MY("black_box_trace_file", "_r_", true);
    public static final AnonymousClass0MY A05 = new AnonymousClass0MY("bluetooth_insecure_traffic_file", "", true);
    public static final AnonymousClass0MY A06 = new AnonymousClass0MY("bluetooth_secure_traffic_file", "", true);
    public static final AnonymousClass0MY A07 = new AnonymousClass0MY("CORE_DUMP", "", true);
    public static final AnonymousClass0MY A08 = new AnonymousClass0MY("FAT_MINIDUMP", "", true);
    public static final AnonymousClass0MY A09 = new AnonymousClass0MY("fury_traces_file", "_r_", true);
    public static final AnonymousClass0MY A0A = new AnonymousClass0MY("logcat_file", "", true);
    public static final AnonymousClass0MY A0B = new AnonymousClass0MY("minidump_file", "", false);
    public static final AnonymousClass0MY A0C = new AnonymousClass0MY("msys_crash_reporter_file", "", true);
    public static final AnonymousClass0MY A0D = new AnonymousClass0MY("properties_file", "", true);
    public static final AnonymousClass0MY A0E = new AnonymousClass0MY("report_source_file", "", true);
    public static final AnonymousClass0MY A0F = new AnonymousClass0MY("system_health_file", "", true);
    public static final Set A0G = new HashSet();
    public final String A00;
    public final String A01;

    public AnonymousClass0MY(String str, String str2, boolean z) {
        this.A00 = str;
        this.A01 = str2;
        if (!z) {
            A0G.add(str);
        }
    }

    public final String toString() {
        return this.A00;
    }
}
