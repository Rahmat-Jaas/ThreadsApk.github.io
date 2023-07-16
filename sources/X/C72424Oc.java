package X;

import androidx.fragment.app.Fragment;
import com.facebook.redex.IDxObserverShape210S0100000_1_I2;

/* renamed from: X.4Oc  reason: invalid class name and case insensitive filesystem */
public final class C72424Oc implements Runnable {
    public final /* synthetic */ IDxObserverShape210S0100000_1_I2 A00;

    public C72424Oc(IDxObserverShape210S0100000_1_I2 iDxObserverShape210S0100000_1_I2) {
        this.A00 = iDxObserverShape210S0100000_1_I2;
    }

    public final void run() {
        AnonymousClass1cX r2 = (AnonymousClass1cX) this.A00.A00;
        if ("activity_feed".equals(r2.A0E)) {
            Fragment targetFragment = r2.getTargetFragment();
            if (targetFragment instanceof CU7) {
                ((CU7) targetFragment).A02.A02();
            }
        }
        C18180wK.A12(r2);
    }
}
