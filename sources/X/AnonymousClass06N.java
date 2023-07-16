package X;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* renamed from: X.06N  reason: invalid class name */
public final class AnonymousClass06N {
    public boolean A00;
    public boolean A01;
    public final BroadcastReceiver A02;
    public final IntentFilter A03;

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("Receiver{");
        sb.append(this.A02);
        sb.append(" filter=");
        sb.append(this.A03);
        if (this.A01) {
            sb.append(" DEAD");
        }
        sb.append("}");
        return sb.toString();
    }

    public AnonymousClass06N(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.A03 = intentFilter;
        this.A02 = broadcastReceiver;
    }
}
