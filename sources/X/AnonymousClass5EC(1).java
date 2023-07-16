package X;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.5EC  reason: invalid class name */
public final class AnonymousClass5EC extends C113166qr {
    public long A00 = -1;
    public long A01 = -1;
    public long A02 = -1;
    public long A03 = -1;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;

    public final void A00(JSONObject jSONObject) {
        super.A00(jSONObject);
        try {
            if (this.A06 != null) {
                JSONArray A0i = C18250wR.A0i();
                for (String put : this.A06.split("\n")) {
                    A0i.put(put);
                }
                jSONObject.put("native_stack_trace", A0i);
            }
            if (this.A08 != null) {
                JSONArray A0i2 = C18250wR.A0i();
                for (String put2 : this.A08.split("\n")) {
                    A0i2.put(put2);
                }
                jSONObject.put(AnonymousClass000.A00(1077), A0i2);
            }
            String str = this.A09;
            if (str != null) {
                jSONObject.put("render_thread_sched_stat", str);
            }
            String str2 = this.A07;
            if (str2 != null) {
                jSONObject.put("render_thread_cpu_usage", str2);
            }
            String str3 = this.A05;
            if (str3 != null) {
                jSONObject.put("memory_red_java", str3);
            }
            String str4 = this.A0A;
            if (str4 != null) {
                jSONObject.put("memory_red_system", str4);
            }
            String str5 = this.A04;
            if (str5 != null) {
                jSONObject.put("memory_red_address_space", str5);
            }
            long j = this.A02;
            if (j != -1) {
                jSONObject.put("swap_total", j);
            }
            long j2 = this.A01;
            if (j2 != -1) {
                jSONObject.put("swap_free", j2);
            }
            long j3 = this.A00;
            if (j3 != -1) {
                jSONObject.put("swap_cached", j3);
            }
            long j4 = this.A03;
            if (j4 != -1) {
                jSONObject.put("vm_swap", j4);
            }
        } catch (Throwable unused) {
        }
    }
}
