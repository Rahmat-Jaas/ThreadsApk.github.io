package X;

import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.6Ha  reason: invalid class name and case insensitive filesystem */
public final class C98816Ha {
    public static final String A00(Purchase purchase) {
        C04220Ms.A0B(purchase, 0);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        JSONObject jSONObject = purchase.A02;
        if (jSONObject.has("productIds")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    A0v.add(optJSONArray.optString(i));
                }
            }
        } else if (jSONObject.has("productId")) {
            A0v.add(jSONObject.optString("productId"));
        }
        return (String) C86164wN.A0b(A0v, 0);
    }
}
