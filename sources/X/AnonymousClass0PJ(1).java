package X;

import android.os.IBinder;
import android.os.RemoteException;
import android.os.ServiceManager;
import ch.boye.httpclientandroidlib.HttpStatus;

/* renamed from: X.0PJ  reason: invalid class name */
public final class AnonymousClass0PJ implements IBinder.DeathRecipient {
    public static AnonymousClass0PJ A01;
    public final AnonymousClass0Q4 A00;

    public final void binderDied() {
        C06040Xk r5 = this.A00.A03;
        C002801h.A02(r5, "Did you call SessionManager.init()?");
        synchronized (r5.A01) {
            r5.A00.A00.put(HttpStatus.SC_PARTIAL_CONTENT, (byte) 49);
            r5.A06(System.currentTimeMillis());
        }
    }

    public AnonymousClass0PJ(AnonymousClass0Q4 r2) {
        this.A00 = r2;
        A00("activity");
        A00("SurfaceFlinger");
    }

    private void A00(String str) {
        IBinder service = ServiceManager.getService(str);
        if (service != null) {
            try {
                service.linkToDeath(this, 0);
            } catch (RemoteException e) {
                AnonymousClass0LU.A0E("SystemBinderDiedDetector", "linkToDeath failed", e);
                C04790Pd.A00();
            }
        }
    }
}
