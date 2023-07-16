package libraries.access.src.main.sharedstorage.common;

import X.AnonymousClass0wJ;
import X.AnonymousClass24G;
import X.C311624m;
import X.C61243Sl;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class ReplicatedStorageRequestSerializer {
    public static ReplicatedStorageRequest A00(String str) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        JSONArray jSONArray = new JSONArray(str);
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            A0v.add(new C61243Sl(jSONObject.getString("target_user_id"), C311624m.valueOf(jSONObject.getString("app_source")), AnonymousClass24G.valueOf(jSONObject.getString("credential_source"))));
        }
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        A0v2.addAll(A0v);
        return new ReplicatedStorageRequest(A0v2);
    }
}
