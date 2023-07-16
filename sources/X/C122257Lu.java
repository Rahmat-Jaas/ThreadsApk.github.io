package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: X.7Lu  reason: invalid class name and case insensitive filesystem */
public final class C122257Lu implements ServiceConnection {
    public final /* synthetic */ AnonymousClass7EO A00;

    public /* synthetic */ C122257Lu(AnonymousClass7EO r1) {
        this.A00 = r1;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AnonymousClass7EO r3 = this.A00;
        r3.A06.A01("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        r3.A01().post(new AnonymousClass5rE(iBinder, this));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        AnonymousClass7EO r3 = this.A00;
        r3.A06.A01("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        r3.A01().post(new AnonymousClass5rC(this));
    }
}
