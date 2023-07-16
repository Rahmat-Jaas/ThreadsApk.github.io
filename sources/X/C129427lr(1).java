package X;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* renamed from: X.7lr  reason: invalid class name and case insensitive filesystem */
public final class C129427lr implements C143808hL {
    public final boolean A00;
    public final C108946jD A01;
    public final WeakReference A02;

    public final void CGB(ConnectionResult connectionResult) {
        C129347lj r3 = (C129347lj) this.A02.get();
        if (r3 != null) {
            C13320nQ.A07(C18180wK.A1Z(Looper.myLooper(), r3.A0D.A07.A06), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            Lock lock = r3.A0G;
            lock.lock();
            try {
                if (C129347lj.A07(r3, 0)) {
                    if (connectionResult.A01 != 0) {
                        C129347lj.A01(connectionResult, this.A01, r3, this.A00);
                    }
                    if (C129347lj.A06(r3)) {
                        C129347lj.A04(r3);
                    }
                }
            } finally {
                lock.unlock();
            }
        }
    }

    public C129427lr(C108946jD r2, C129347lj r3, boolean z) {
        this.A02 = C86144wL.A0w(r3);
        this.A01 = r2;
        this.A00 = z;
    }
}
