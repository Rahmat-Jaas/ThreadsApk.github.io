package X;

import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import org.json.JSONObject;

/* renamed from: X.7i3  reason: invalid class name and case insensitive filesystem */
public final class C127947i3 implements C143518gs {
    public final long A00;
    public final long A01;
    public final long A02;
    public final /* synthetic */ AnonymousClass7i5 A03;

    public C127947i3(AnonymousClass7i5 r1, long j, long j2, long j3) {
        this.A03 = r1;
        this.A01 = j;
        this.A02 = j2;
        this.A00 = j3;
    }

    public final JSONObject CxG() {
        JSONObject A0y = C18230wP.A0y();
        A0y.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, this.A01);
        A0y.put("data", this.A02);
        A0y.put("cache", this.A00);
        return A0y;
    }
}
