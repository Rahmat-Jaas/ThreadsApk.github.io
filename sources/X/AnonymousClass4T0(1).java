package X;

import android.app.Activity;
import android.view.View;
import com.instagram.igds.components.tooltip.IDxTCallbackShape159S0100000_1_I2;

/* renamed from: X.4T0  reason: invalid class name */
public final class AnonymousClass4T0 implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ C28161tl A03;

    public AnonymousClass4T0(Activity activity, View view, C28161tl r3, String str) {
        this.A01 = view;
        this.A02 = str;
        this.A03 = r3;
        this.A00 = activity;
    }

    public final void run() {
        View view = this.A01;
        if (view.isAttachedToWindow()) {
            C26431qd r3 = new C26431qd((CharSequence) this.A02);
            IDxTCallbackShape159S0100000_1_I2 iDxTCallbackShape159S0100000_1_I2 = new IDxTCallbackShape159S0100000_1_I2(this, 19);
            C25553Dnn dnn = new C25553Dnn(this.A00, r3);
            C18250wR.A0r(view, dnn);
            dnn.A04(AnonymousClass3TC.A05);
            dnn.A05 = iDxTCallbackShape159S0100000_1_I2;
            C18200wM.A1Q(dnn);
        }
    }
}
