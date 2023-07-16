package X;

import android.content.Context;
import android.os.BatteryManager;

/* renamed from: X.0Nl  reason: invalid class name and case insensitive filesystem */
public final class C04400Nl implements C04050Mb {
    public Context A00;

    public final void CWp(C04170Mn r5, AnonymousClass0ND r6) {
        BatteryManager batteryManager = (BatteryManager) this.A00.getSystemService("batterymanager");
        if (batteryManager != null) {
            r5.A01(AnonymousClass0MU.A1A, batteryManager.getIntProperty(4));
            r5.A01(AnonymousClass0MU.A1B, batteryManager.getIntProperty(1));
            r5.A01(AnonymousClass0MU.A1C, batteryManager.getIntProperty(3));
            r5.A01(AnonymousClass0MU.A1D, batteryManager.getIntProperty(2));
            r5.A02(AnonymousClass0MU.A1E, Long.valueOf(batteryManager.getLongProperty(5)));
            r5.A01(AnonymousClass0MU.A1F, batteryManager.getIntProperty(6));
        }
    }

    public C04400Nl(Context context) {
        this.A00 = context;
    }

    public final Integer Awy() {
        return AnonymousClass006.A11;
    }

    public final /* synthetic */ boolean BNv(Integer num) {
        return false;
    }
}
