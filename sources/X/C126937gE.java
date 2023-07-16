package X;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;

/* renamed from: X.7gE  reason: invalid class name and case insensitive filesystem */
public abstract class C126937gE implements Mck {
    public final Handler A00 = AnonymousClass0wJ.A0F();

    public final boolean AAh(Context context, Intent intent, ServiceConnection serviceConnection) {
        C04220Ms.A0B(serviceConnection, 2);
        this.A00.postDelayed(new C135297zC(serviceConnection), 500);
        return true;
    }

    public final void D86(Context context, ServiceConnection serviceConnection) {
    }
}
