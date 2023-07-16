package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import com.facebook.redex.IDxBReceiverShape6S0100000_I2;

/* renamed from: X.0af  reason: invalid class name and case insensitive filesystem */
public final class C06960af implements AnonymousClass0MF {
    public final boolean A00;
    public final BroadcastReceiver A01 = new IDxBReceiverShape6S0100000_I2(this, 1);
    public final Context A02;
    public final Handler A03;
    public volatile boolean A04;

    public C06960af(Context context, Handler handler) {
        this.A02 = context;
        this.A03 = handler;
        this.A00 = true;
        AnonymousClass0MI.A04(this, true);
    }

    public final void Bkt() {
        if (!this.A04) {
            this.A02.registerReceiver(this.A01, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"), (String) null, this.A03);
            this.A04 = true;
        }
    }

    public final void Bkw() {
        try {
            if (this.A04) {
                this.A04 = false;
                this.A02.unregisterReceiver(this.A01);
            }
        } catch (IllegalArgumentException unused) {
            C04790Pd.A00();
        }
    }
}
