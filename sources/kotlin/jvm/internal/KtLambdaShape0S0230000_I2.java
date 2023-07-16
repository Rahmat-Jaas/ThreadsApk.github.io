package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.AnonymousClass75O;
import X.AnonymousClass77Z;
import X.C02220Ah;
import X.C04220Ms;
import X.C103976b2;
import X.C103986b3;
import X.C112326pO;
import X.C1371586i;
import X.C146828mv;
import X.C86154wM;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import kotlin.Unit;

public class KtLambdaShape0S0230000_I2 extends C02220Ah implements AnonymousClass0YY {
    public Object A00;
    public Object A01;
    public boolean A02;
    public boolean A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S0230000_I2(Object obj, Object obj2, int i, boolean z, boolean z2) {
        super(1);
        this.A04 = i;
        this.A01 = obj;
        this.A00 = obj2;
        this.A02 = z;
        this.A03 = z2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass77Z r0;
        if (this.A04 != 0) {
            C146828mv r6 = (C146828mv) obj;
            C04220Ms.A0B(r6, 0);
            Object obj2 = this.A01;
            C112326pO r2 = new C112326pO(C86154wM.A12(obj2, 10), C86154wM.A12(obj2, 11), false);
            boolean z = this.A03;
            if (z) {
                r0 = C103986b3.A0R;
            } else {
                r0 = C103986b3.A08;
            }
            r6.ChN(r0, r2);
            if (this.A02) {
                C146828mv.A00(C103976b2.A0F, r6, (String) null, new KtLambdaShape6S0210000_I2(0, obj2, this.A00, z));
            }
        } else {
            AnonymousClass75O r62 = (AnonymousClass75O) obj;
            C04220Ms.A0B(r62, 0);
            C1371586i r22 = r62.A01;
            r22.A01(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, this.A01);
            r22.A01("reverseScrolling", false);
            r22.A01("flingBehavior", this.A00);
            r22.A01("isScrollable", Boolean.valueOf(this.A02));
            r22.A01("isVertical", Boolean.valueOf(this.A03));
        }
        return Unit.A00;
    }
}
