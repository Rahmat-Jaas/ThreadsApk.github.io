package X;

import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import org.json.JSONObject;

/* renamed from: X.167  reason: invalid class name */
public final class AnonymousClass167 extends C58933Ih implements AnonymousClass4vN {
    public final AnonymousClass216 BDj() {
        return (AnonymousClass216) A04(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, AnonymousClass216.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    public final int getCount() {
        return this.A00.optInt("count");
    }

    public AnonymousClass167(JSONObject jSONObject) {
        super(jSONObject);
    }
}
