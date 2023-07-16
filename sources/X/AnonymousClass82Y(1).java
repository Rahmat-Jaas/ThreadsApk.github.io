package X;

import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.igds.components.tooltip.IDxTCallbackShape160S0100000_2_I2;

/* renamed from: X.82Y  reason: invalid class name */
public final class AnonymousClass82Y implements Runnable {
    public final /* synthetic */ C24628DTl A00;
    public final /* synthetic */ IgdsMediaButton A01;
    public final /* synthetic */ C28161tl A02;

    public AnonymousClass82Y(C24628DTl dTl, IgdsMediaButton igdsMediaButton, C28161tl r3) {
        this.A00 = dTl;
        this.A01 = igdsMediaButton;
        this.A02 = r3;
    }

    public final void run() {
        C25553Dnn dnn = new C25553Dnn(this.A00.A00, new C26431qd(2131828769));
        dnn.A01(this.A01);
        dnn.A03(D0f.BELOW_ANCHOR);
        dnn.A05 = new IDxTCallbackShape160S0100000_2_I2(this.A02, 1);
        dnn.A00().A05();
    }
}
