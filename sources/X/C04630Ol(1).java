package X;

import android.os.Process;
import com.facebook.redex.IDxLInitShape120S0000000_I2;

/* renamed from: X.0Ol  reason: invalid class name and case insensitive filesystem */
public final class C04630Ol implements Runnable {
    public final /* synthetic */ IDxLInitShape120S0000000_I2 A00;

    public final void run() {
        Process.setThreadPriority(-4);
    }

    public C04630Ol(IDxLInitShape120S0000000_I2 iDxLInitShape120S0000000_I2) {
        this.A00 = iDxLInitShape120S0000000_I2;
    }
}
