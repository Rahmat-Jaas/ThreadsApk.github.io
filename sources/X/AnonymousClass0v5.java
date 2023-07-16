package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import com.facebook.redex.IDxBReceiverShape6S0100000_I2;

/* renamed from: X.0v5  reason: invalid class name */
public final class AnonymousClass0v5 {
    public final BroadcastReceiver A00;

    public AnonymousClass0v5(Context context) {
        IDxBReceiverShape6S0100000_I2 iDxBReceiverShape6S0100000_I2 = new IDxBReceiverShape6S0100000_I2(this, 11);
        this.A00 = iDxBReceiverShape6S0100000_I2;
        context.registerReceiver(iDxBReceiverShape6S0100000_I2, new IntentFilter(AnonymousClass00U.A0L(context.getPackageName(), ".FBSYSTRACE_CONFIG_CHANGE")), "android.permission.DUMP", (Handler) null);
    }
}
