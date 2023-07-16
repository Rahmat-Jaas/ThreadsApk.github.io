package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.6qr  reason: invalid class name and case insensitive filesystem */
public class C113166qr {
    public int A00 = -1;
    public long A01;
    public long A02;
    public long A03 = -1;
    public long A04;
    public long A05 = 0;
    public long A06;
    public long A07 = -1;
    public long A08 = -1;
    public String A09;
    public String A0A;
    public String A0B;
    public List A0C;
    public Map A0D;

    public void A00(JSONObject jSONObject) {
        try {
            int i = this.A00;
            if (i != -1) {
                jSONObject.put("queuing_msg_count", i);
            }
            String str = this.A0A;
            if (str != null) {
                jSONObject.put("thread_cpu_usage", str);
            }
            String str2 = this.A09;
            if (str2 != null) {
                jSONObject.put("proc_cpu_usage", str2);
            }
            if (this.A0C != null) {
                JSONArray A0i = C18250wR.A0i();
                Iterator it = this.A0C.iterator();
                while (it.hasNext()) {
                    A0i.put(C18180wK.A0k(it));
                }
                jSONObject.put("whole_cpu_usage", A0i);
            }
            String str3 = this.A0B;
            if (str3 != null) {
                jSONObject.put("thread_sched_stat", str3);
            }
            if (this.A05 > 0) {
                boolean z = false;
                long j = this.A04;
                if (j != 0) {
                    jSONObject.put("gc_count", j);
                    jSONObject.put("gc_time", this.A06);
                    z = true;
                }
                long j2 = this.A01;
                if (j2 != 0) {
                    jSONObject.put("blocking_gc_count", j2);
                    jSONObject.put("blocking_gc_time", this.A02);
                } else if (z) {
                }
                jSONObject.put("gc_monitor_interval", this.A05);
            }
            if (this.A08 != -1) {
                jSONObject.put("max_java_heap_size", this.A07);
                jSONObject.put("current_java_heap_size", this.A08);
                jSONObject.put("available_java_heap", this.A03);
                jSONObject.put("total_available_java_heap", (this.A07 - this.A08) + this.A03);
                long j3 = this.A08;
                jSONObject.put("java_heap_usage_percentage", ((j3 - this.A03) * 100) / j3);
            }
            if (this.A0D != null) {
                JSONObject A0y = C18230wP.A0y();
                Iterator A0x = C18220wO.A0x(this.A0D);
                while (A0x.hasNext()) {
                    C145778l4 r2 = (C145778l4) A0x.next();
                    A0y.put(r2.getName(), this.A0D.get(r2));
                }
                jSONObject.put("monitor_duration", A0y);
            }
        } catch (Throwable unused) {
        }
    }
}
