package X;

import java.io.StringWriter;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.0E6  reason: invalid class name */
public final class AnonymousClass0E6 extends C02530Bu {
    public final boolean A00;

    public final void onEventReceivedWithParamsCollectionMap(AnonymousClass0KD r9, AnonymousClass0CU r10) {
        String str;
        if (!this.A00) {
            AnonymousClass0LU.A0C("JestE2EAnalyticsEventListener", "Not enabled, returning early");
            return;
        }
        C04220Ms.A0B(r9, 0);
        StringWriter stringWriter = new StringWriter();
        try {
            AnonymousClass0KR.A00().A04(r9, stringWriter);
            String obj = stringWriter.toString();
            C04220Ms.A06(obj);
            int length = obj.length();
            int i = length / CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS;
            int i2 = 0;
            int i3 = 1;
            if (length % CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS == 0) {
                i3 = 0;
            }
            int i4 = i + i3;
            while (i2 < i4) {
                if (i2 > 0) {
                    str = "...";
                } else {
                    str = "";
                }
                int i5 = i2 * CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS;
                i2++;
                String substring = obj.substring(i5, Math.min(i2 * CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS, length));
                C04220Ms.A06(substring);
                AnonymousClass0LU.A0C("EndToEnd-AnalyticsEvent#reportEvent", AnonymousClass00U.A0L(str, substring));
            }
        } catch (Exception unused) {
            AnonymousClass0LU.A0B("reportEvent", "Can't encode event data");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (r3.equalsIgnoreCase(java.lang.System.getProperty("analytics_logger_to_logcat")) != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0E6() {
        /*
            r5 = this;
            r5.<init>()
            boolean r0 = X.C550631o.A00()
            java.lang.String r4 = "analytics_logger_to_logcat"
            java.lang.String r3 = "false"
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = java.lang.System.getProperty(r4)
            boolean r1 = r3.equalsIgnoreCase(r0)
            r0 = 1
            if (r1 == 0) goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            r5.A00 = r0
            java.lang.String r2 = "JestE2EAnalyticsEventListener"
            java.lang.String r1 = java.lang.System.getProperty(r4)
            boolean r0 = X.C550631o.A00()
            if (r0 == 0) goto L_0x0029
            java.lang.String r3 = "true"
        L_0x0029:
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r3}
            java.lang.String r0 = "WRITE_ANALYTICS_TO_LOGCAT = %s, EndToEnd.isRunningEndToEndTest() = %s"
            X.AnonymousClass0LU.A0O(r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0E6.<init>():void");
    }
}
