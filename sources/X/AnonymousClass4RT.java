package X;

import com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2;
import com.instagram.location.surface.data.LocationPageInfo;

/* renamed from: X.4RT  reason: invalid class name */
public final class AnonymousClass4RT implements Runnable {
    public final /* synthetic */ IDxACallbackShape111S0100000_1_I2 A00;
    public final /* synthetic */ LocationPageInfo A01;

    public AnonymousClass4RT(IDxACallbackShape111S0100000_1_I2 iDxACallbackShape111S0100000_1_I2, LocationPageInfo locationPageInfo) {
        this.A00 = iDxACallbackShape111S0100000_1_I2;
        this.A01 = locationPageInfo;
    }

    public final void run() {
        C23381dg.A02(this.A01, (C23381dg) this.A00.A00);
    }
}
