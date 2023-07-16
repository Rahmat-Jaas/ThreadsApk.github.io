package X;

import com.instagram.arlink.fragment.NametagController;
import com.instagram.common.task.IDxCallbackShape128S0100000_1_I2;

/* renamed from: X.4Qd  reason: invalid class name and case insensitive filesystem */
public final class C72894Qd implements Runnable {
    public final /* synthetic */ NametagController A00;
    public final /* synthetic */ String A01;

    public C72894Qd(NametagController nametagController, String str) {
        this.A00 = nametagController;
        this.A01 = str;
    }

    public final void run() {
        NametagController nametagController = this.A00;
        C34640IcN icN = nametagController.A0D;
        H8a h8a = new H8a(new C32990HdW(nametagController.A07, nametagController.mRootView), 448);
        h8a.A00 = new IDxCallbackShape128S0100000_1_I2(this, 0);
        icN.schedule(h8a);
    }
}
