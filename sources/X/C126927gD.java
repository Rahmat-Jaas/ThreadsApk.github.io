package X;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

/* renamed from: X.7gD  reason: invalid class name and case insensitive filesystem */
public abstract class C126927gD implements Mck {
    public final boolean AAh(Context context, Intent intent, ServiceConnection serviceConnection) {
        C04220Ms.A0B(context, 0);
        return context.bindService(intent, serviceConnection, C18200wM.A1Z(serviceConnection) ? 1 : 0);
    }

    public final void D86(Context context, ServiceConnection serviceConnection) {
        AnonymousClass0wJ.A1N(context, serviceConnection);
        context.unbindService(serviceConnection);
    }
}
