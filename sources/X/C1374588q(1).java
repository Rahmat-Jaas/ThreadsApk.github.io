package X;

import android.app.Dialog;
import com.instagram.common.api.base.IDxACallbackShape16S0300000_2_I2;

/* renamed from: X.88q  reason: invalid class name and case insensitive filesystem */
public final class C1374588q extends Thread {
    public final /* synthetic */ IDxACallbackShape16S0300000_2_I2 A00;

    public C1374588q(IDxACallbackShape16S0300000_2_I2 iDxACallbackShape16S0300000_2_I2) {
        this.A00 = iDxACallbackShape16S0300000_2_I2;
    }

    public final void run() {
        ((Dialog) this.A00.A01).dismiss();
    }
}
