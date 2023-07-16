package X;

import com.facebook.mobileconfig.MobileConfigCrashReportUtils;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Map;

/* renamed from: X.0bC  reason: invalid class name and case insensitive filesystem */
public final class C07240bC implements AnonymousClass0PC {
    public static C07240bC A02;
    public static final Object A03 = new Object();
    public static final Object A04 = new Object();
    public String A00 = "";
    public final C04100Mg A01;

    public final void A00() {
        MobileConfigCrashReportUtils mobileConfigCrashReportUtils;
        try {
            synchronized (MobileConfigCrashReportUtils.class) {
                try {
                    mobileConfigCrashReportUtils = MobileConfigCrashReportUtils.sInstance;
                    if (mobileConfigCrashReportUtils == null) {
                        mobileConfigCrashReportUtils = new MobileConfigCrashReportUtils();
                        MobileConfigCrashReportUtils.sInstance = mobileConfigCrashReportUtils;
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            }
            Map allCanaryData = mobileConfigCrashReportUtils.getAllCanaryData();
            StringBuilder sb = new StringBuilder((allCanaryData.size() * 100) + 50);
            sb.append("[");
            boolean z = true;
            for (Map.Entry entry : allCanaryData.entrySet()) {
                if (!z) {
                    sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                }
                z = false;
                sb.append("\"");
                sb.append((String) entry.getKey());
                sb.append("\"");
            }
            sb.append("]");
            String obj = sb.toString();
            synchronized (A03) {
                if (obj != null) {
                    try {
                        if (!obj.equals(this.A00)) {
                            this.A00 = obj;
                            C04170Mn r2 = new C04170Mn((Throwable) null);
                            r2.A03(AnonymousClass0MU.A6b, obj);
                            C04100Mg r1 = this.A01;
                            r1.A07(r2, AnonymousClass0ND.CRITICAL_REPORT, this);
                            r1.A07(r2, AnonymousClass0ND.LARGE_REPORT, this);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            }
        } catch (Throwable th3) {
            AnonymousClass0LU.A0G("MobileConfigDetector", "Mobile config canary retrieval failed.", th3);
            C04790Pd.A00();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r1 = com.facebook.mobileconfig.MobileConfigCrashReportUtils.sInstance;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0014, code lost:
        if (r1 != null) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0016, code lost:
        r1 = new com.facebook.mobileconfig.MobileConfigCrashReportUtils();
        com.facebook.mobileconfig.MobileConfigCrashReportUtils.sInstance = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x001e, code lost:
        r1.setUpdateListener(new X.C07230bB(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0026, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002a, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x002b, code lost:
        X.C04790Pd.A00();
        X.AnonymousClass0LU.A0H("MobileConfigDetector", "Unable to add the MobileConfigCanaryChangeListener, Failed to create MobileConfigCrashReportUtils instance.", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0035, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000c, code lost:
        A00();
        r2 = com.facebook.mobileconfig.MobileConfigCrashReportUtils.class;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void start() {
        /*
            r3 = this;
            java.lang.Object r1 = A04
            monitor-enter(r1)
            X.0bC r0 = A02     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r1)     // Catch:{ all -> 0x0036 }
            return
        L_0x0009:
            A02 = r3     // Catch:{ all -> 0x0036 }
            monitor-exit(r1)     // Catch:{ all -> 0x0036 }
            r3.A00()
            java.lang.Class<com.facebook.mobileconfig.MobileConfigCrashReportUtils> r2 = com.facebook.mobileconfig.MobileConfigCrashReportUtils.class
            monitor-enter(r2)     // Catch:{ UnsatisfiedLinkError -> 0x002a }
            com.facebook.mobileconfig.MobileConfigCrashReportUtils r1 = com.facebook.mobileconfig.MobileConfigCrashReportUtils.sInstance     // Catch:{ all -> 0x0027 }
            if (r1 != 0) goto L_0x001d
            com.facebook.mobileconfig.MobileConfigCrashReportUtils r1 = new com.facebook.mobileconfig.MobileConfigCrashReportUtils     // Catch:{ all -> 0x0027 }
            r1.<init>()     // Catch:{ all -> 0x0027 }
            com.facebook.mobileconfig.MobileConfigCrashReportUtils.sInstance = r1     // Catch:{ all -> 0x0027 }
        L_0x001d:
            monitor-exit(r2)     // Catch:{ UnsatisfiedLinkError -> 0x002a }
            X.0bB r0 = new X.0bB     // Catch:{ UnsatisfiedLinkError -> 0x002a }
            r0.<init>(r3)     // Catch:{ UnsatisfiedLinkError -> 0x002a }
            r1.setUpdateListener(r0)     // Catch:{ UnsatisfiedLinkError -> 0x002a }
            return
        L_0x0027:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ UnsatisfiedLinkError -> 0x002a }
            throw r0     // Catch:{ UnsatisfiedLinkError -> 0x002a }
        L_0x002a:
            r2 = move-exception
            X.C04790Pd.A00()
            java.lang.String r1 = "MobileConfigDetector"
            java.lang.String r0 = "Unable to add the MobileConfigCanaryChangeListener, Failed to create MobileConfigCrashReportUtils instance."
            X.AnonymousClass0LU.A0H(r1, r0, r2)
            return
        L_0x0036:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0036 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07240bC.start():void");
    }

    public C07240bC(C04100Mg r2) {
        this.A01 = r2;
    }

    public final /* synthetic */ C06820aQ As3() {
        return null;
    }

    public final AnonymousClass0PD Awx() {
        return AnonymousClass0PD.MOBILE_CONFIG;
    }
}
