package X;

import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.618  reason: invalid class name */
public final class AnonymousClass618 extends AnonymousClass0gG {
    public final /* synthetic */ C108476iQ A00;
    public final /* synthetic */ String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass618(C108476iQ r2, String str) {
        super(-14);
        this.A00 = r2;
        this.A01 = str;
    }

    public final void run() {
        C108476iQ r6 = this.A00;
        String str = this.A01;
        HashSet A0u = C18200wM.A0u();
        HashSet A0u2 = C18200wM.A0u();
        try {
            JSONObject A0j = C18250wR.A0j(str);
            if (A0j.has("fully_federated_events")) {
                JSONArray jSONArray = A0j.getJSONArray("fully_federated_events");
                for (int i = 0; i < jSONArray.length(); i = C86154wM.A07(A0u, jSONArray, i)) {
                }
            }
            if (A0j.has("partially_federated_events")) {
                JSONArray jSONArray2 = A0j.getJSONArray("partially_federated_events");
                for (int i2 = 0; i2 < jSONArray2.length(); i2 = C86154wM.A07(A0u2, jSONArray2, i2)) {
                }
            }
        } catch (JSONException e) {
            AnonymousClass0LU.A0L("FederatedAnalyticsEventManager", "Exception when de-serializing federated analytics config: %s", e, str);
        }
        r6.A00 = A0u;
        r6.A01 = A0u2;
    }
}
