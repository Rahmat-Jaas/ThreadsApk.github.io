package X;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

/* renamed from: X.7lM  reason: invalid class name and case insensitive filesystem */
public final class C129137lM implements C148648rc, C148658rd {
    public C148608rY A00;
    public final C108946jD A01;
    public final boolean A02;

    public C129137lM(C108946jD r1, boolean z) {
        this.A01 = r1;
        this.A02 = z;
    }

    public final void Brh(Bundle bundle) {
        C13320nQ.A02(this.A00, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.A00.Brh(bundle);
    }

    public final void Bro(ConnectionResult connectionResult) {
        C13320nQ.A02(this.A00, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        C148608rY r0 = this.A00;
        C108946jD r3 = this.A01;
        boolean z = this.A02;
        C129387ln r02 = (C129387ln) r0;
        Lock lock = r02.A0D;
        lock.lock();
        try {
            r02.A0E.DBj(connectionResult, r3, z);
        } finally {
            lock.unlock();
        }
    }

    public final void Brq(int i) {
        C13320nQ.A02(this.A00, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.A00.Brq(i);
    }
}
