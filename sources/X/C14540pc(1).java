package X;

import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0pc  reason: invalid class name and case insensitive filesystem */
public final class C14540pc {
    public C14560pf A00;
    public List A01;
    public final String A02;
    public final long A03 = System.currentTimeMillis();

    public final String A00() {
        List<String> list = this.A01;
        if (list == null || list.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String append : list) {
            sb.append(append);
            sb.append("_");
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    public final JSONObject A01() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(FXPFAccessLibraryDebugFragment.NAME, "fbns_counters");
            jSONObject.put("time", C14740q4.A00(this.A03));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("key", this.A02);
            jSONObject2.put("dims", A00());
            C14560pf r7 = this.A00;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("cnt", r7.A00);
            jSONObject3.put("avg", (double) (((float) r7.A02) / ((float) r7.A00)));
            jSONObject3.put("max", r7.A01);
            Iterator<String> keys = jSONObject3.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject2.put(next, jSONObject3.get(next));
            }
            jSONObject.put("extra", jSONObject2);
            return jSONObject;
        } catch (JSONException e) {
            AnonymousClass0LU.A0H("CounterEvent", "Failed to serialize", e);
            return jSONObject;
        }
    }

    public C14540pc(String str, long j) {
        this.A02 = str;
        this.A00 = new C14560pf(j);
    }

    public final String toString() {
        return A01().toString();
    }
}
