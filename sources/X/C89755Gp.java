package X;

import com.google.common.collect.ImmutableList;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import org.json.JSONObject;

/* renamed from: X.5Gp  reason: invalid class name and case insensitive filesystem */
public final class C89755Gp extends C58933Ih implements C41867MfG {
    public final int ARQ() {
        return this.A00.optInt("asset_count");
    }

    public final AnonymousClass20D Ag1() {
        return (AnonymousClass20D) A04("entry_point", AnonymousClass20D.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    public final int AwB() {
        return this.A00.optInt("model_count");
    }

    public final ImmutableList AwH() {
        return A02("models", C89745Go.class);
    }

    public final AnonymousClass21A BDk() {
        return (AnonymousClass21A) A04(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, AnonymousClass21A.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    public final String BDo() {
        return A05("status_details");
    }

    public final boolean BNi() {
        return !this.A00.isNull("asset_count");
    }

    public final boolean BOF() {
        return !this.A00.isNull("model_count");
    }

    public C89755Gp(JSONObject jSONObject) {
        super(jSONObject);
    }
}
