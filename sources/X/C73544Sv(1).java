package X;

import android.app.Activity;
import android.view.View;
import com.instagram.igds.components.tooltip.IDxTCallbackShape55S0200000_1_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Sv  reason: invalid class name and case insensitive filesystem */
public final class C73544Sv implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C83624ri A02;
    public final /* synthetic */ UserSession A03;

    public C73544Sv(Activity activity, View view, C83624ri r3, UserSession userSession) {
        this.A01 = view;
        this.A00 = activity;
        this.A03 = userSession;
        this.A02 = r3;
    }

    public final void run() {
        View view = this.A01;
        if (view.isAttachedToWindow()) {
            Activity activity = this.A00;
            C25553Dnn A012 = AnonymousClass4DS.A01(activity, C18190wL.A0g(activity.getResources(), 2131822290));
            A012.A02(view, 0, ((-view.getHeight()) >> 1) - 8, true);
            A012.A03(D0f.ABOVE_ANCHOR);
            A012.A04(AnonymousClass3TC.A05);
            A012.A0B = false;
            A012.A0A = true;
            A012.A05 = new IDxTCallbackShape55S0200000_1_I2(1, this.A03, this.A02);
            C18200wM.A1Q(A012);
        }
    }
}
