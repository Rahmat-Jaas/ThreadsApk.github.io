package X;

import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7el  reason: invalid class name and case insensitive filesystem */
public final class C126207el implements C146138lh {
    public JSONObject A00;

    public final int AXx() {
        try {
            return this.A00.getInt(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
        } catch (JSONException unused) {
            return 0;
        }
    }

    public final String BAh() {
        try {
            return this.A00.getString("severity");
        } catch (JSONException unused) {
            return null;
        }
    }

    public final String BF1() {
        try {
            return this.A00.getString("summary");
        } catch (JSONException unused) {
            return null;
        }
    }

    public final String getDescription() {
        try {
            return this.A00.getString(DevServerEntity.COLUMN_DESCRIPTION);
        } catch (JSONException unused) {
            return null;
        }
    }

    public C126207el(JSONObject jSONObject) {
        this.A00 = jSONObject;
    }
}
