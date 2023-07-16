package X;

import com.instagram.arlink.fragment.NametagController;
import com.instagram.common.task.IDxCallbackShape128S0100000_1_I2;

/* renamed from: X.4OE  reason: invalid class name */
public final class AnonymousClass4OE implements Runnable {
    public final /* synthetic */ IDxCallbackShape128S0100000_1_I2 A00;

    public AnonymousClass4OE(IDxCallbackShape128S0100000_1_I2 iDxCallbackShape128S0100000_1_I2) {
        this.A00 = iDxCallbackShape128S0100000_1_I2;
    }

    public final void run() {
        NametagController nametagController = ((C72894Qd) this.A00.A00).A00;
        C61873Wd.A01(nametagController.A0D.getParentFragmentManager());
        C61873Wd.A00(nametagController.A07);
    }
}
