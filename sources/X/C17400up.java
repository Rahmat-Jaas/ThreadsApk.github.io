package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0up  reason: invalid class name and case insensitive filesystem */
public final class C17400up {
    public int A00;
    public String A01 = "";
    public String A02 = "";
    public String A03 = "";
    public String A04 = "";
    public String A05 = "";

    public final String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("ck", this.A01);
            jSONObject.putOpt("cs", this.A02);
            jSONObject.putOpt("di", this.A03);
            jSONObject.putOpt("ds", this.A04);
            jSONObject.put("sr", this.A00);
            jSONObject.putOpt("rc", this.A05);
            return jSONObject.toString();
        } catch (JSONException e) {
            AnonymousClass0LU.A0H("ConnAckPayload", "failed to serialize", e);
            return "";
        }
    }
}
