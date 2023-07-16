package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: X.7Lt  reason: invalid class name and case insensitive filesystem */
public final class C122247Lt implements ServiceConnection {
    public final /* synthetic */ C121087Eb A00;

    public /* synthetic */ C122247Lt(C121087Eb r1) {
        this.A00 = r1;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C121087Eb r3 = this.A00;
        r3.A06.A01("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        r3.A01().post(new C93735qz(iBinder, this));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C121087Eb r3 = this.A00;
        r3.A06.A01("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        r3.A01().post(new C93715qx(this));
    }
}
