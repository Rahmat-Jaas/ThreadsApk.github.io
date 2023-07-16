package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import com.google.android.gms.common.internal.zzac;

/* renamed from: X.7M1  reason: invalid class name */
public final class AnonymousClass7M1 implements ServiceConnection {
    public final int A00;
    public final /* synthetic */ C121837Ij A01;

    public AnonymousClass7M1(C121837Ij r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Handler handler;
        Message message;
        IGmsServiceBroker zzac;
        int i;
        int i2;
        C121837Ij r5 = this.A01;
        if (iBinder == null) {
            synchronized (r5.A0J) {
                i = r5.A02;
            }
            if (i == 3) {
                r5.A0C = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            handler = r5.A0G;
            message = handler.obtainMessage(i2, r5.A0B.get(), 16);
        } else {
            synchronized (r5.A0K) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof IGmsServiceBroker)) {
                    zzac = new zzac(iBinder);
                } else {
                    zzac = (IGmsServiceBroker) queryLocalInterface;
                }
                r5.A09 = zzac;
            }
            int i3 = this.A00;
            handler = r5.A0G;
            message = handler.obtainMessage(7, i3, -1, new AnonymousClass5ol(r5, 0));
        }
        handler.sendMessage(message);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C121837Ij r2 = this.A01;
        synchronized (r2.A0K) {
            r2.A09 = null;
        }
        Handler handler = r2.A0G;
        handler.sendMessage(handler.obtainMessage(6, this.A00, 1));
    }
}
