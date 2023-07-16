package X;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zaar;
import java.util.concurrent.locks.Lock;

/* renamed from: X.7lL  reason: invalid class name and case insensitive filesystem */
public final class C129127lL implements C148648rc, C148658rd {
    public final /* synthetic */ C129347lj A00;

    public /* synthetic */ C129127lL(C129347lj r1) {
        this.A00 = r1;
    }

    public final void Brq(int i) {
    }

    public final void Brh(Bundle bundle) {
        C129347lj r2 = this.A00;
        C13320nQ.A01(r2.A0E);
        C148588rW r1 = r2.A01;
        C13320nQ.A01(r1);
        r1.DBd(new zaar(r2));
    }

    public final void Bro(ConnectionResult connectionResult) {
        C129347lj r2 = this.A00;
        Lock lock = r2.A0G;
        lock.lock();
        try {
            if (!r2.A02 || !(connectionResult.A01 == 0 || connectionResult.A02 == null)) {
                C129347lj.A02(connectionResult, r2);
            } else {
                C129347lj.A03(r2);
                C129347lj.A04(r2);
            }
        } finally {
            lock.unlock();
        }
    }
}
