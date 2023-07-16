package X;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

/* renamed from: X.7lk  reason: invalid class name and case insensitive filesystem */
public final class C129357lk implements C145878lG {
    public final /* synthetic */ C129377lm A00;

    public /* synthetic */ C129357lk(C129377lm r1) {
        this.A00 = r1;
    }

    public final void DBb(int i, boolean z) {
        ConnectionResult connectionResult;
        C129377lm r2 = this.A00;
        Lock lock = r2.A0B;
        lock.lock();
        try {
            if (r2.A04 || (connectionResult = r2.A03) == null || connectionResult.A01 != 0) {
                r2.A04 = false;
                r2.A07.DBb(i, false);
                r2.A03 = null;
                r2.A02 = null;
            } else {
                r2.A04 = true;
                r2.A09.Brq(i);
            }
        } finally {
            lock.unlock();
        }
    }

    public final void DBX(ConnectionResult connectionResult) {
        C129377lm r0 = this.A00;
        Lock lock = r0.A0B;
        lock.lock();
        try {
            r0.A02 = connectionResult;
            C129377lm.A02(r0);
        } finally {
            lock.unlock();
        }
    }

    public final void DBZ(Bundle bundle) {
        C129377lm r2 = this.A00;
        Lock lock = r2.A0B;
        lock.lock();
        try {
            Bundle bundle2 = r2.A01;
            if (bundle2 == null) {
                r2.A01 = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            r2.A02 = ConnectionResult.A04;
            C129377lm.A02(r2);
        } finally {
            lock.unlock();
        }
    }
}
