package X;

import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import kotlin.Unit;

/* renamed from: X.8Jp  reason: invalid class name and case insensitive filesystem */
public final class C138608Jp extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ C142698fR A00;
    public final /* synthetic */ C967266l A01;
    public final /* synthetic */ C147258p3 A02;
    public final /* synthetic */ AnonymousClass0ZU A03;
    public final /* synthetic */ AnonymousClass0YY A04;
    public final /* synthetic */ AnonymousClass0YM A05;
    public final /* synthetic */ AnonymousClass0YM A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138608Jp(C142698fR r2, C967266l r3, C147258p3 r4, AnonymousClass0ZU r5, AnonymousClass0YY r6, AnonymousClass0YM r7, AnonymousClass0YM r8, boolean z, boolean z2) {
        super(1);
        this.A04 = r6;
        this.A01 = r3;
        this.A07 = z;
        this.A08 = z2;
        this.A02 = r4;
        this.A03 = r5;
        this.A05 = r7;
        this.A06 = r8;
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C1371586i A002 = AnonymousClass75O.A00(obj);
        A002.A01("canDrag", this.A04);
        A002.A01("orientation", this.A01);
        A002.A01("enabled", Boolean.valueOf(this.A07));
        A002.A01("reverseDirection", Boolean.valueOf(this.A08));
        A002.A01("interactionSource", this.A02);
        A002.A01("startDragImmediately", this.A03);
        A002.A01("onDragStarted", this.A05);
        A002.A01("onDragStopped", this.A06);
        A002.A01(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, this.A00);
        return Unit.A00;
    }
}
