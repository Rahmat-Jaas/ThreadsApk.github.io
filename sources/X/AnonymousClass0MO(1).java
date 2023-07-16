package X;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.proxygen.TraceFieldType;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.0MO  reason: invalid class name */
public final class AnonymousClass0MO {
    public static final AtomicLong A0C = new AtomicLong(0);
    public final Context A00;
    public final C08860eQ A01;
    public final AnonymousClass071 A02;
    public final AnonymousClass068 A03;
    public final long A04;
    public final long A05;
    public final long A06 = SystemClock.elapsedRealtime();
    public final C021209x A07;
    public final C14930qQ A08;
    public final C12830mZ A09;
    public final String A0A;
    public final String A0B;

    public final void A04(String str, int i, int i2, int i3, long j, long j2) {
        A07("mqtt_publish_debug", C14740q4.A01("result", "success", "operation", str, TraceFieldType.QoS, Integer.toString(i), TraceFieldType.MsgId, Integer.toString(i2), "original_ops_id", Integer.toString(i3), "timespan_ms", Long.toString(j), "retry_cnt", Integer.toString(0), "mqtt_session_id", Long.toString(j2)));
    }

    public final void A06(String str, String str2, Throwable th, int i, int i2, int i3, long j) {
        Map A012 = C14740q4.A01("result", str, "operation", str2, TraceFieldType.QoS, Integer.toString(i), TraceFieldType.MsgId, Integer.toString(i2), "original_ops_id", Integer.toString(i3), "retry_cnt", Integer.toString(0), "mqtt_session_id", Long.toString(j));
        if (th != null) {
            A012.put("error_message", th.toString());
        }
        A07("mqtt_publish_debug", A012);
    }

    public static void A01(NetworkInfo networkInfo, AnonymousClass0MO r6, Map map) {
        if (networkInfo != null) {
            String obj = networkInfo.getState().toString();
            String typeName = networkInfo.getTypeName();
            if (typeName == null) {
                typeName = "";
            }
            String subtypeName = networkInfo.getSubtypeName();
            if (subtypeName == null) {
                subtypeName = "";
            }
            String extraInfo = networkInfo.getExtraInfo();
            if (extraInfo == null) {
                extraInfo = "";
            }
            map.put("network_state", obj);
            map.put(TraceFieldType.NetworkType, typeName);
            map.put("network_subtype", subtypeName);
            map.put("network_extra_info", extraInfo);
        } else {
            map.put("network_info", "null");
        }
        boolean z = false;
        try {
            C09740gb A002 = r6.A03.A03.A00(PowerManager.class, "power");
            if (A002.A01() && ((PowerManager) A002.A00()).isDeviceIdleMode()) {
                z = true;
            }
        } catch (Exception unused) {
            AnonymousClass0LU.A0B("MqttNetworkManager", "Exception in getting DeviceIdleMode");
        }
        map.put("is_in_idle_mode", Boolean.toString(z));
    }

    public final void A02(NetworkInfo networkInfo, C09740gb r5, C09740gb r6, String str, String str2, String str3, long j, boolean z) {
        Map A012 = C14740q4.A01("act", str, "running", String.valueOf(z));
        A012.put("process_id", Long.toString(this.A05));
        A012.put("thread_id", Long.toString(Thread.currentThread().getId()));
        if (str2 != null) {
            A012.put("mqtt_persistence_string", str2);
        }
        A00(j, A012);
        A01(networkInfo, this, A012);
        if (!TextUtils.isEmpty(str3)) {
            A012.put("calr", str3);
        }
        if (r5.A01()) {
            A012.put("flg", String.valueOf(r5.A00()));
        }
        if (r6.A01()) {
            A012.put("sta_id", String.valueOf(r6.A00()));
        }
        A07("mqtt_service_state", A012);
    }

    public final void A03(NetworkInfo networkInfo, C09740gb r8, String str, int i, long j, long j2, long j3) {
        Map A012 = C14740q4.A01("timespan_ms", String.valueOf(j), "port", String.valueOf(i), "he_state", str);
        if (r8.A01()) {
            String obj = r8.A00().toString();
            if (((Throwable) r8.A00()).getCause() != null) {
                obj = AnonymousClass00U.A0V(obj, " Caused by: ", ((Throwable) r8.A00()).getCause().toString());
            }
            A012.put("error_message", obj);
        }
        A012.put("mqtt_session_id", Long.toString(j2));
        A00(j3, A012);
        A01(networkInfo, this, A012);
        A07("mqtt_socket_connect", A012);
    }

    public final void A05(String str, String str2, String str3) {
        C021209x r1 = this.A07;
        if (r1 == null) {
            return;
        }
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            USLEBaseShape0S0000000 A002 = C32412Bs.A00(r1);
            if (A002.A00.isSampled()) {
                A002.A0O(C317628w.CLIENT, "start_service");
                A002.A0O(C317628w.MQTT, "end_service");
                A002.A0S("raw_client_ts_ms", Long.valueOf(System.currentTimeMillis()));
                if (TextUtils.isEmpty(str)) {
                    str = null;
                }
                A002.A0T("trace_id", str);
                if (TextUtils.isEmpty(str2)) {
                    str2 = null;
                }
                A002.A0T(TraceFieldType.RequestID, str2);
                if (TextUtils.isEmpty(str3)) {
                    str3 = null;
                }
                A002.A0T("edge_id", str3);
                A002.Bb4();
            }
        }
    }

    public final void A07(String str, Map map) {
        map.put("service_name", this.A0B);
        map.put("service_session_id", Long.toString(this.A06));
        map.put("process_id", Long.toString(this.A05));
        map.put("logger_object_id", Long.toString(this.A04));
        if (!map.containsKey("network_session_id")) {
            map.put("network_session_id", Long.toString(this.A03.A06.get()));
        }
        C15170qr r1 = new C15170qr(str, this.A0A);
        r1.A02(map);
        this.A08.reportEvent(r1);
    }

    public AnonymousClass0MO(Context context, C021209x r4, C14930qQ r5, C08860eQ r6, C12830mZ r7, AnonymousClass071 r8, AnonymousClass068 r9, String str) {
        this.A00 = context;
        this.A0B = str;
        this.A03 = r9;
        this.A02 = r8;
        this.A0A = context.getPackageName();
        this.A08 = r5;
        this.A07 = r4;
        this.A09 = r7;
        this.A05 = (long) Process.myPid();
        this.A04 = A0C.incrementAndGet();
        this.A01 = r6;
    }

    public static void A00(long j, Map map) {
        map.put("network_session_id", Long.toString(j));
    }
}
