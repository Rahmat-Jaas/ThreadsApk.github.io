package X;

import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0tL  reason: invalid class name and case insensitive filesystem */
public final class C16580tL extends C15170qr {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public boolean A09;
    public boolean A0A;

    public final C15170qr A00(String str) {
        return this;
    }

    public C16580tL(String str, String str2, String str3, String str4, String str5) {
        super("fbns_push_registration_lifecycle", str2, str3, str4, str5);
        this.A08 = str;
    }

    public final JSONObject A01() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(FXPFAccessLibraryDebugFragment.NAME, this.A05);
            jSONObject.put("time", C14740q4.A00(this.A00));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("event", this.A08);
            jSONObject2.put("apn", this.A07);
            jSONObject2.put("appid", this.A06);
            jSONObject2.put("exc", this.A05);
            jSONObject2.put("ctnr", this.A04);
            jSONObject2.put("scn_on", this.A0A);
            jSONObject2.put("s_boot", this.A00);
            jSONObject2.put("s_mqtt", this.A01);
            jSONObject2.put("s_net", this.A02);
            jSONObject2.put("s_scn", this.A03);
            jSONObject2.put("s_svc", this.A04);
            jSONObject2.put("is_emp", this.A09);
            jSONObject2.put("d_model", this.A02);
            jSONObject2.put("d_manuf", this.A01);
            jSONObject2.put("locale", this.A03);
            JSONObject A002 = C16530tG.A00(this.A06);
            if (A002 != null) {
                jSONObject2.put("extra_info", A002);
            }
            jSONObject.put("extra", jSONObject2);
            return jSONObject;
        } catch (JSONException e) {
            AnonymousClass0LU.A0H("FbnsRegistrationLifecycleEvent", "Failed to serialize", e);
            return jSONObject;
        }
    }
}
