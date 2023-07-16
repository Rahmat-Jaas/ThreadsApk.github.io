package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.igds.components.switchbutton.IgSwitch;
import com.instagram.igds.components.tooltip.IDxTCallbackShape159S0100000_1_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Rw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C73304Rw implements Runnable {
    public final /* synthetic */ IgSwitch A00;
    public final /* synthetic */ C19000yP A01;

    public /* synthetic */ C73304Rw(IgSwitch igSwitch, C19000yP r2) {
        this.A01 = r2;
        this.A00 = igSwitch;
    }

    public final void run() {
        C19000yP r0 = this.A01;
        IgSwitch igSwitch = this.A00;
        C61283Sp r4 = r0.A0Q;
        FragmentActivity fragmentActivity = r0.A0M;
        UserSession userSession = r0.A0P;
        boolean A1Z = AnonymousClass0wJ.A1Z(fragmentActivity, userSession);
        C04220Ms.A0B(igSwitch, 2);
        C25918DvM dvM = r4.A02;
        if (dvM == null) {
            C25553Dnn A012 = AnonymousClass4DS.A01(fragmentActivity, AnonymousClass0wJ.A0k(fragmentActivity, 2131827452));
            C18230wP.A15(igSwitch, A012);
            A012.A0A = A1Z;
            A012.A00 = 3000;
            A012.A05 = new IDxTCallbackShape159S0100000_1_I2(userSession, 17);
            dvM = A012.A00();
            r4.A02 = dvM;
        }
        if (dvM != null) {
            dvM.A05();
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }
}
