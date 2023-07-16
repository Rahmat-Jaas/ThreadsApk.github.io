package X;

import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import kotlin.Unit;

/* renamed from: X.8JQ  reason: invalid class name */
public final class AnonymousClass8JQ extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ C146058lZ A00;
    public final /* synthetic */ C142708fS A01;
    public final /* synthetic */ C967266l A02;
    public final /* synthetic */ C146258lv A03;
    public final /* synthetic */ C147258p3 A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8JQ(C146058lZ r2, C142708fS r3, C967266l r4, C146258lv r5, C147258p3 r6, boolean z, boolean z2) {
        super(1);
        this.A02 = r4;
        this.A03 = r5;
        this.A00 = r2;
        this.A05 = z;
        this.A06 = z2;
        this.A01 = r3;
        this.A04 = r6;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C1371586i A002 = AnonymousClass75O.A00(obj);
        A002.A01("orientation", this.A02);
        A002.A01(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, this.A03);
        A002.A01("overscrollEffect", this.A00);
        A002.A01("enabled", Boolean.valueOf(this.A05));
        A002.A01("reverseDirection", Boolean.valueOf(this.A06));
        A002.A01("flingBehavior", this.A01);
        A002.A01("interactionSource", this.A04);
        return Unit.A00;
    }
}
