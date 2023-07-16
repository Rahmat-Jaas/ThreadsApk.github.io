package X;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.Lock;

/* renamed from: X.7li  reason: invalid class name and case insensitive filesystem */
public final class C129337li implements C146538mP {
    public final C129387ln A00;

    public C129337li(C129387ln r1) {
        this.A00 = r1;
    }

    public final void DBi(Bundle bundle) {
    }

    public final void DBj(ConnectionResult connectionResult, C108946jD r2, boolean z) {
    }

    public final void DBk(int i) {
    }

    public final boolean DBl() {
        return true;
    }

    public final C93345lQ DBW(C93345lQ r2) {
        this.A00.A07.A0G.add(r2);
        return r2;
    }

    public final C93345lQ DBY(C93345lQ r2) {
        throw C18180wK.A0a("GoogleApiClient is not connected yet.");
    }

    public final void DBc() {
        C129387ln r2 = this.A00;
        Iterator A14 = C86104wH.A14(r2.A03);
        while (A14.hasNext()) {
            ((C148598rX) A14.next()).AI7();
        }
        r2.A07.A03 = Collections.emptySet();
    }

    public final void DBf() {
        C129387ln r4 = this.A00;
        Lock lock = r4.A0D;
        lock.lock();
        try {
            C110886mR r5 = r4.A09;
            Map map = r4.A0B;
            r4.A0E = new C129347lj(r4.A04, r4.A05, r4.A06, r4, r5, map, lock);
            r4.A0E.DBc();
            r4.A0C.signalAll();
        } finally {
            lock.unlock();
        }
    }
}
