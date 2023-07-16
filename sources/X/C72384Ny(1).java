package X;

import ca.psiphon.PsiphonTunnel;
import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.4Ny  reason: invalid class name and case insensitive filesystem */
public final class C72384Ny implements Serializable {
    public final double A00;
    public final double A01;
    public final double A02;
    public final double A03;
    public final double A04;
    public final double A05;
    public final double A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final int A0L;
    public final int A0M;
    public final int A0N;
    public final int A0O;
    public final int A0P;
    public final int A0Q;
    public final int A0R;
    public final int A0S;
    public final AnonymousClass22Z A0T;
    public final AnonymousClass22Z A0U;
    public final String A0V;
    public final String A0W;
    public final String A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final boolean A0d;
    public final boolean A0e;

    public C72384Ny(AnonymousClass22Z r3, AnonymousClass22Z r4, String str, String str2, String str3, double d, double d2, double d3, double d4, double d5, double d6, double d7, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A0X = str3;
        this.A09 = i3;
        this.A00 = d;
        this.A0R = i21;
        this.A01 = d2;
        this.A02 = d3;
        this.A05 = d6;
        this.A06 = d7;
        this.A0N = i17;
        this.A0Q = i20;
        this.A0e = z7;
        this.A0Y = z;
        this.A0Z = z2;
        this.A0a = z3;
        this.A0L = i15;
        this.A0K = i14;
        this.A0M = i16;
        this.A03 = d4;
        this.A04 = d5;
        this.A07 = i;
        this.A08 = i2;
        this.A0A = i4;
        this.A0W = str2;
        this.A0T = r3;
        this.A0U = r4;
        this.A0b = z4;
        this.A0E = i8;
        this.A0O = i18;
        this.A0P = i19;
        this.A0V = str;
        this.A0D = i7;
        this.A0J = i13;
        this.A0S = i22;
        this.A0c = z5;
        this.A0C = i6;
        this.A0I = i12;
        this.A0B = i5;
        this.A0H = i11;
        this.A0d = z6;
        this.A0G = i10;
        this.A0F = i9;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(46:0|1|2|3|4|7|8|9|12|13|14|15|16|19|20|21|24|25|26|29|30|31|32|33|36|37|38|41|42|43|46|47|48|49|50|51|52|53|54|55|56|(1:60)|61|62|63|64) */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0164, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00d0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00db */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00fe  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C72384Ny A01(java.lang.String r54) {
        /*
            r5 = 0
            r11 = r54
            org.json.JSONObject r0 = X.C18250wR.A0j(r11)     // Catch:{ JSONException -> 0x0164 }
            java.lang.String r4 = ""
            java.lang.String r2 = "desired_buffer"
            r1 = 6000(0x1770, float:8.408E-42)
            int r28 = A00(r2, r0, r1)     // Catch:{ JSONException -> 0x0164 }
            java.lang.String r2 = "min_time_between_speed_changes_ms"
            r1 = 2000(0x7d0, float:2.803E-42)
            int r45 = A00(r2, r0, r1)     // Catch:{ JSONException -> 0x0164 }
            java.lang.String r1 = "max_time_between_speed_changes_ms"
            r3 = 10000(0x2710, float:1.4013E-41)
            int r42 = A00(r1, r0, r3)     // Catch:{ JSONException -> 0x0164 }
            java.lang.String r1 = "pid_integral_param"
            double r12 = r0.getDouble(r1)     // Catch:{ JSONException -> 0x0028 }
            goto L_0x002d
        L_0x0028:
            r12 = 4528697575604282452(0x3ed92a737110e454, double:6.0E-6)
        L_0x002d:
            java.lang.String r1 = "pid_proportional_param"
            double r14 = r0.getDouble(r1)     // Catch:{ JSONException -> 0x0034 }
            goto L_0x0039
        L_0x0034:
            r14 = 4530839991990218125(0x3ee0c6f7a0b5ed8d, double:8.0E-6)
        L_0x0039:
            java.lang.String r2 = "adjust_speed_top_threshold_ms"
            r1 = 700(0x2bc, float:9.81E-43)
            int r27 = A00(r2, r0, r1)     // Catch:{ JSONException -> 0x0164 }
            java.lang.String r2 = "adjust_speed_bottom_threshold_ms"
            r1 = 1500(0x5dc, float:2.102E-42)
            int r26 = A00(r2, r0, r1)     // Catch:{ JSONException -> 0x0164 }
            java.lang.String r2 = "desired_buffer_acceptable_error_ms"
            r1 = 200(0xc8, float:2.8E-43)
            int r29 = A00(r2, r0, r1)     // Catch:{ JSONException -> 0x0164 }
            java.lang.String r1 = "pid_integral_bound_ms"
            int r46 = A00(r1, r0, r3)     // Catch:{ JSONException -> 0x0164 }
            java.lang.String r1 = "speedup_bandwidth_multiplier"
            double r16 = r0.getDouble(r1)     // Catch:{ JSONException -> 0x005e }
            goto L_0x0060
        L_0x005e:
            r16 = 4611686018427387904(0x4000000000000000, double:2.0)
        L_0x0060:
            java.lang.String r1 = "threshold_to_adjust_playback_speed"
            double r22 = r0.getDouble(r1)     // Catch:{ JSONException -> 0x0067 }
            goto L_0x006c
        L_0x0067:
            r22 = 4584304132692975288(0x3f9eb851eb851eb8, double:0.03)
        L_0x006c:
            java.lang.String r1 = "threshold_to_set_regular_speed"
            double r24 = r0.getDouble(r1)     // Catch:{ JSONException -> 0x0073 }
            goto L_0x0078
        L_0x0073:
            r24 = 4585925428558828667(0x3fa47ae147ae147b, double:0.04)
        L_0x0078:
            java.lang.String r1 = "use_simple_speed_controller"
            r2 = 0
            boolean r54 = A02(r1, r0)     // Catch:{ JSONException -> 0x0164 }
            java.lang.String r1 = "enable_immediate_live_buffer_trim"
            boolean r48 = A02(r1, r0)     // Catch:{ JSONException -> 0x0164 }
            java.lang.String r1 = "enable_latency_manager_rate_limiting"
            boolean r49 = A02(r1, r0)     // Catch:{ JSONException -> 0x0164 }
            java.lang.String r1 = "enable_live_buffer_meter"
            boolean r50 = A02(r1, r0)     // Catch:{ JSONException -> 0x0164 }
            java.lang.String r3 = "initial_buffer_trim_target_ms"
            r1 = 3500(0xdac, float:4.905E-42)
            int r40 = A00(r3, r0, r1)     // Catch:{ JSONException -> 0x0164 }
            java.lang.String r3 = "initial_buffer_trim_period_ms"
            r1 = 5000(0x1388, float:7.006E-42)
            int r39 = A00(r3, r0, r1)     // Catch:{ JSONException -> 0x0164 }
            java.lang.String r3 = "initial_buffer_trim_threshold_ms"
            r1 = 1000(0x3e8, float:1.401E-42)
            int r41 = A00(r3, r0, r1)     // Catch:{ JSONException -> 0x0164 }
            java.lang.String r1 = "stream_latency_max_speed_delta"
            double r18 = r0.getDouble(r1)     // Catch:{ JSONException -> 0x00b0 }
            goto L_0x00b5
        L_0x00b0:
            r18 = 4596373779694328218(0x3fc999999999999a, double:0.2)
        L_0x00b5:
            java.lang.String r1 = "stream_latency_min_speed_delta"
            double r20 = r0.getDouble(r1)     // Catch:{ JSONException -> 0x00bc }
            goto L_0x00c1
        L_0x00bc:
            r20 = 4591870180066957722(0x3fb999999999999a, double:0.1)
        L_0x00c1:
            java.lang.String r1 = "client_latency_setting"
            java.lang.String r10 = r0.getString(r1)     // Catch:{ JSONException -> 0x00c8 }
            goto L_0x00c9
        L_0x00c8:
            r10 = r5
        L_0x00c9:
            java.lang.String r1 = "fallback_level"
            r3 = r5
            java.lang.String r3 = r0.getString(r1)     // Catch:{ JSONException -> 0x00d0 }
        L_0x00d0:
            X.22Z r7 = X.AnonymousClass3W0.A00(r3)     // Catch:{ JSONException -> 0x0164 }
            java.lang.String r1 = "upgrade_level"
            r3 = r5
            java.lang.String r3 = r0.getString(r1)     // Catch:{ JSONException -> 0x00db }
        L_0x00db:
            X.22Z r8 = X.AnonymousClass3W0.A00(r3)     // Catch:{ JSONException -> 0x0164 }
            java.lang.String r1 = "fallback_on_cell"
            boolean r51 = A02(r1, r0)     // Catch:{ JSONException -> 0x0164 }
            java.lang.String r3 = "fallback_stalls_threshold_ms"
            r1 = 100000(0x186a0, float:1.4013E-40)
            int r33 = A00(r3, r0, r1)     // Catch:{ JSONException -> 0x0164 }
            java.lang.String r1 = "min_playback_duration_to_fallback_ms"
            int r43 = A00(r1, r0, r2)     // Catch:{ JSONException -> 0x0164 }
            java.lang.String r1 = "allowed_data_connection_qualities"
            java.lang.String r9 = r0.getString(r1)     // Catch:{ JSONException -> 0x00fb }
            goto L_0x00fc
        L_0x00fb:
            r9 = r4
        L_0x00fc:
            if (r9 != 0) goto L_0x00ff
            r9 = r4
        L_0x00ff:
            java.lang.String r1 = "min_time_between_latency_level_change_ms"
            int r44 = A00(r1, r0, r2)     // Catch:{ JSONException -> 0x0164 }
            java.lang.String r3 = "fallback_bitrate_threshold"
            r1 = -1
            int r32 = A00(r3, r0, r1)     // Catch:{ JSONException -> 0x0164 }
            java.lang.String r3 = "fallup_bitrate_threshold"
            int r38 = A00(r3, r0, r1)     // Catch:{ JSONException -> 0x0164 }
            java.lang.String r3 = "request_chunking_duration_ms"
            int r47 = A00(r3, r0, r2)     // Catch:{ JSONException -> 0x0164 }
            java.lang.String r2 = "should_fallback_if_not_quic"
            boolean r52 = A02(r2, r0)     // Catch:{ JSONException -> 0x0164 }
            java.lang.String r2 = "fallback_bandwidth_threshold"
            int r31 = A00(r2, r0, r1)     // Catch:{ JSONException -> 0x0164 }
            java.lang.String r2 = "fallup_bandwidth_threshold"
            int r37 = A00(r2, r0, r1)     // Catch:{ JSONException -> 0x0164 }
            java.lang.String r3 = "fallback_bandwidth_confidence"
            r2 = 50
            int r30 = A00(r3, r0, r2)     // Catch:{ JSONException -> 0x0164 }
            java.lang.String r3 = "fallup_bandwidth_confidence"
            int r36 = A00(r3, r0, r2)     // Catch:{ JSONException -> 0x0164 }
            java.lang.String r3 = "fallback_abr_index"
            A00(r3, r0, r1)     // Catch:{ JSONException -> 0x0164 }
            java.lang.String r3 = "fallup_abr_index"
            A00(r3, r0, r1)     // Catch:{ JSONException -> 0x0164 }
            java.lang.String r3 = "use_end_of_transfer_buffer_size"
            boolean r53 = A02(r3, r0)     // Catch:{ JSONException -> 0x0164 }
            java.lang.String r3 = "fallback_ttfb_ms_threshold"
            int r35 = A00(r3, r0, r1)     // Catch:{ JSONException -> 0x0164 }
            java.lang.String r3 = "fallup_ttfb_ms_threshold"
            A00(r3, r0, r1)     // Catch:{ JSONException -> 0x0164 }
            java.lang.String r1 = "fallback_ttfb_ms_confidence"
            int r34 = A00(r1, r0, r2)     // Catch:{ JSONException -> 0x0164 }
            java.lang.String r1 = "fallup_ttfb_ms_confidence"
            A00(r1, r0, r2)     // Catch:{ JSONException -> 0x0164 }
            X.4Ny r6 = new X.4Ny     // Catch:{ JSONException -> 0x0164 }
            r6.<init>(r7, r8, r9, r10, r11, r12, r14, r16, r18, r20, r22, r24, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)     // Catch:{ JSONException -> 0x0164 }
            return r6
        L_0x0164:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72384Ny.A01(java.lang.String):X.4Ny");
    }

    public static boolean A02(String str, JSONObject jSONObject) {
        try {
            return jSONObject.has(str) && jSONObject.getBoolean(str);
        } catch (JSONException unused) {
            return false;
        }
    }

    public C72384Ny(AnonymousClass3W0 r5) {
        this.A0X = "";
        this.A09 = r5.A07;
        this.A00 = r5.A00;
        this.A0R = r5.A0O;
        this.A01 = r5.A01;
        this.A02 = r5.A02;
        this.A05 = r5.A05;
        this.A06 = r5.A06;
        this.A0N = r5.A0K;
        this.A0Q = r5.A0N;
        this.A0e = r5.A0X;
        this.A0Y = r5.A0U;
        this.A0Z = false;
        this.A0a = r5.A0V;
        this.A0L = r5.A0I;
        this.A0K = r5.A0H;
        this.A0M = r5.A0J;
        this.A03 = r5.A03;
        this.A04 = r5.A04;
        this.A07 = 0;
        this.A08 = 0;
        this.A0A = 0;
        this.A0W = r5.A0S;
        this.A0T = r5.A0P;
        this.A0U = r5.A0Q;
        this.A0b = r5.A0W;
        this.A0E = r5.A0B;
        this.A0O = r5.A0L;
        this.A0P = r5.A0M;
        this.A0V = "";
        this.A0D = -1;
        this.A0J = r5.A0G;
        this.A0S = 0;
        this.A0c = false;
        this.A0C = -1;
        this.A0I = -1;
        this.A0B = 50;
        this.A0H = 50;
        this.A0d = false;
        this.A0G = -1;
        this.A0F = 50;
    }

    public static int A00(String str, JSONObject jSONObject, int i) {
        try {
            if (jSONObject.has(str)) {
                return jSONObject.getInt(str);
            }
            return i;
        } catch (JSONException unused) {
            return i;
        }
    }

    public C72384Ny() {
        this.A0X = "";
        this.A09 = 6000;
        this.A00 = 6.0E-6d;
        this.A01 = 8.0E-6d;
        this.A0R = 10000;
        this.A02 = 2.0d;
        this.A05 = 0.03d;
        this.A06 = 0.04d;
        this.A0N = 10000;
        this.A0Q = CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
        this.A0e = false;
        this.A0Y = false;
        this.A0Z = false;
        this.A0a = false;
        this.A0L = 3500;
        this.A0K = 5000;
        this.A0M = 1000;
        this.A03 = 0.2d;
        this.A04 = 0.1d;
        this.A08 = Rfc3492Idn.damp;
        this.A07 = PsiphonTunnel.VPN_INTERFACE_MTU;
        this.A0A = 200;
        this.A0W = "normal:production";
        this.A0T = AnonymousClass22Z.LOW_LATENCY;
        this.A0U = AnonymousClass22Z.UNDEFINED;
        this.A0b = false;
        this.A0E = 100000;
        this.A0O = 0;
        this.A0P = 0;
        this.A0V = "";
        this.A0D = 0;
        this.A0J = 0;
        this.A0S = 0;
        this.A0c = false;
        this.A0I = -1;
        this.A0C = -1;
        this.A0H = 50;
        this.A0B = 50;
        this.A0d = false;
        this.A0G = -1;
        this.A0F = 50;
    }
}
