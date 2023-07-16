package X;

import com.facebook.redex.IDxEListenerShape223S0100000_1_I2;
import com.instagram.business.fragment.OnboardingCheckListFragment;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4R0  reason: invalid class name */
public final class AnonymousClass4R0 implements Runnable {
    public final /* synthetic */ IDxEListenerShape223S0100000_1_I2 A00;
    public final /* synthetic */ AnonymousClass46F A01;

    public AnonymousClass4R0(IDxEListenerShape223S0100000_1_I2 iDxEListenerShape223S0100000_1_I2, AnonymousClass46F r2) {
        this.A00 = iDxEListenerShape223S0100000_1_I2;
        this.A01 = r2;
    }

    public final void run() {
        AnonymousClass3IJ r4 = ((OnboardingCheckListFragment) this.A00.A00).A04;
        Integer num = this.A01.A00;
        C04220Ms.A0B(num, 0);
        List list = r4.A03;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnonymousClass3HW r1 = (AnonymousClass3HW) it.next();
                String str = r1.A05;
                C04220Ms.A06(str);
                if (AnonymousClass2K7.A00(str) == num) {
                    r1.A03 = "complete";
                    break;
                }
            }
            r4.A00();
        }
    }
}
