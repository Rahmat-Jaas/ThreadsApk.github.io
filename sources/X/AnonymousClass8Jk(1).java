package X;

import com.instagram.compose.core.SwipeableState;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.Map;
import kotlin.Unit;

/* renamed from: X.8Jk  reason: invalid class name */
public final class AnonymousClass8Jk extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C967266l A01;
    public final /* synthetic */ C147258p3 A02;
    public final /* synthetic */ C114416tG A03;
    public final /* synthetic */ SwipeableState A04;
    public final /* synthetic */ Map A05;
    public final /* synthetic */ AnonymousClass0YP A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Jk(C967266l r2, C147258p3 r3, C114416tG r4, SwipeableState swipeableState, Map map, AnonymousClass0YP r7, float f, boolean z) {
        super(1);
        this.A04 = swipeableState;
        this.A05 = map;
        this.A01 = r2;
        this.A07 = z;
        this.A02 = r3;
        this.A06 = r7;
        this.A03 = r4;
        this.A00 = f;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass75O r5 = (AnonymousClass75O) obj;
        C04220Ms.A0B(r5, 0);
        C1371586i r2 = r5.A01;
        r2.A01(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, this.A04);
        r2.A01("anchors", this.A05);
        r2.A01("orientation", this.A01);
        r2.A01("enabled", Boolean.valueOf(this.A07));
        r2.A01("reverseDirection", false);
        r2.A01("interactionSource", this.A02);
        r2.A01("thresholds", this.A06);
        r2.A01("resistance", this.A03);
        r2.A01("velocityThreshold", C134847yT.A00(this.A00));
        return Unit.A00;
    }
}
