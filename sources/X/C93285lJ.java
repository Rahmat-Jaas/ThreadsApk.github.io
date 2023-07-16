package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;

/* renamed from: X.5lJ  reason: invalid class name and case insensitive filesystem */
public final class C93285lJ extends AnonymousClass7AL implements C145878lG {
    public AnonymousClass4x2 A00;
    public C146548mQ A01 = null;
    public Integer A02 = null;
    public Set A03 = C18200wM.A0u();
    public final int A04;
    public final Context A05;
    public final Looper A06;
    public final GoogleApiAvailability A07;
    public final C93175l8 A08;
    public final C105046cn A09 = new C105046cn();
    public final C1195175q A0A;
    public final C110886mR A0B;
    public final AnonymousClass7MH A0C;
    public final ArrayList A0D;
    public final Map A0E;
    public final Map A0F;
    public final Queue A0G = new LinkedList();
    public final Lock A0H;
    public final AnonymousClass5ps A0I;
    public final C143828hN A0J;
    public volatile boolean A0K;

    public final void DBb(int i, boolean z) {
        AtomicInteger atomicInteger;
        if (i == 1) {
            if (!this.A0K) {
                this.A0K = true;
                if (this.A00 == null) {
                    try {
                        this.A00 = this.A07.A05(this.A05.getApplicationContext(), new C93445lc(this));
                    } catch (SecurityException unused) {
                    }
                }
                AnonymousClass5ps r3 = this.A0I;
                r3.sendMessageDelayed(r3.obtainMessage(1), 120000);
                r3.sendMessageDelayed(r3.obtainMessage(2), 5000);
            }
            i = 1;
        }
        for (BasePendingResult A082 : (BasePendingResult[]) this.A0A.A01.toArray(new BasePendingResult[0])) {
            A082.A08(C1195175q.A02);
        }
        AnonymousClass7MH r6 = this.A0C;
        Handler handler = r6.A01;
        if (Looper.myLooper() == handler.getLooper()) {
            handler.removeMessages(1);
            synchronized (r6.A03) {
                r6.A00 = true;
                ArrayList arrayList = r6.A05;
                ArrayList A0s = C18200wM.A0s(arrayList);
                atomicInteger = r6.A07;
                int i2 = atomicInteger.get();
                Iterator it = A0s.iterator();
                while (it.hasNext()) {
                    C148648rc r1 = (C148648rc) it.next();
                    if (!r6.A08 || atomicInteger.get() != i2) {
                        break;
                    } else if (arrayList.contains(r1)) {
                        r1.Brq(i);
                    }
                }
                r6.A04.clear();
                r6.A00 = false;
            }
            r6.A08 = false;
            atomicInteger.incrementAndGet();
            if (i == 2) {
                A00(this);
                return;
            }
            return;
        }
        throw C18180wK.A0a("onUnintentionalDisconnection must only be called on the Handler thread");
    }

    public static final void A00(C93285lJ r2) {
        r2.A0C.A08 = true;
        C146548mQ r0 = r2.A01;
        C13320nQ.A01(r0);
        r0.DBm();
    }

    public static /* bridge */ /* synthetic */ void A01(C93285lJ r2) {
        Lock lock = r2.A0H;
        lock.lock();
        try {
            if (r2.A0K) {
                A00(r2);
            }
        } finally {
            lock.unlock();
        }
    }

    public final boolean A09() {
        boolean z = false;
        if (this.A0K) {
            this.A0K = false;
            AnonymousClass5ps r1 = this.A0I;
            r1.removeMessages(2);
            z = true;
            r1.removeMessages(1);
            AnonymousClass4x2 r0 = this.A00;
            if (r0 != null) {
                r0.A00();
                this.A00 = null;
            }
        }
        return z;
    }

    public final void DBX(ConnectionResult connectionResult) {
        AtomicInteger atomicInteger;
        if (!AnonymousClass7D4.A00(this.A05, connectionResult.A01)) {
            A09();
        }
        if (!this.A0K) {
            AnonymousClass7MH r7 = this.A0C;
            Handler handler = r7.A01;
            if (Looper.myLooper() == handler.getLooper()) {
                handler.removeMessages(1);
                synchronized (r7.A03) {
                    ArrayList arrayList = r7.A06;
                    ArrayList A0s = C18200wM.A0s(arrayList);
                    atomicInteger = r7.A07;
                    int i = atomicInteger.get();
                    Iterator it = A0s.iterator();
                    while (it.hasNext()) {
                        C148658rd r1 = (C148658rd) it.next();
                        if (!r7.A08 || atomicInteger.get() != i) {
                            break;
                        } else if (arrayList.contains(r1)) {
                            r1.Bro(connectionResult);
                        }
                    }
                }
                r7.A08 = false;
                atomicInteger.incrementAndGet();
                return;
            }
            throw C18180wK.A0a("onConnectionFailure must only be called on the Handler thread");
        }
    }

    public final void DBZ(Bundle bundle) {
        IllegalStateException illegalStateException;
        while (true) {
            Queue queue = this.A0G;
            if (queue.isEmpty()) {
                break;
            }
            A04((C93345lQ) queue.remove());
        }
        AnonymousClass7MH r6 = this.A0C;
        Handler handler = r6.A01;
        if (Looper.myLooper() == handler.getLooper()) {
            synchronized (r6.A03) {
                if (!r6.A00) {
                    handler.removeMessages(1);
                    r6.A00 = true;
                    ArrayList arrayList = r6.A04;
                    if (arrayList.isEmpty()) {
                        ArrayList A0s = C18200wM.A0s(r6.A05);
                        AtomicInteger atomicInteger = r6.A07;
                        int i = atomicInteger.get();
                        Iterator it = A0s.iterator();
                        while (it.hasNext()) {
                            C148648rc r1 = (C148648rc) it.next();
                            if (!r6.A08 || !r6.A02.isConnected() || atomicInteger.get() != i) {
                                break;
                            } else if (!arrayList.contains(r1)) {
                                r1.Brh(bundle);
                            }
                        }
                        arrayList.clear();
                        r6.A00 = false;
                    } else {
                        illegalStateException = new IllegalStateException();
                    }
                } else {
                    illegalStateException = new IllegalStateException();
                }
                throw illegalStateException;
            }
            return;
        }
        throw C18180wK.A0a("onConnectionSuccess must only be called on the Handler thread");
    }

    public C93285lJ(Context context, Looper looper, GoogleApiAvailability googleApiAvailability, C93175l8 r7, C110886mR r8, ArrayList arrayList, List list, List list2, Map map, Map map2, Lock lock, int i, int i2) {
        C129467lx r1 = new C129467lx(this);
        this.A0J = r1;
        this.A05 = context;
        this.A0H = lock;
        this.A0C = new AnonymousClass7MH(looper, r1);
        this.A06 = looper;
        this.A0I = new AnonymousClass5ps(looper, this);
        this.A07 = googleApiAvailability;
        this.A04 = i;
        if (i >= 0) {
            this.A02 = Integer.valueOf(i2);
        }
        this.A0F = map;
        this.A0E = map2;
        this.A0D = arrayList;
        this.A0A = new C1195175q();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.A0C.A00((C148648rc) it.next());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            this.A0C.A01((C148658rd) it2.next());
        }
        this.A0B = r8;
        this.A08 = r7;
    }
}
