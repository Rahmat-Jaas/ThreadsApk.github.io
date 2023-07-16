package X;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

/* renamed from: X.7lm  reason: invalid class name and case insensitive filesystem */
public final class C129377lm implements C146548mQ {
    public int A00 = 0;
    public Bundle A01;
    public ConnectionResult A02 = null;
    public ConnectionResult A03 = null;
    public boolean A04 = false;
    public final Context A05;
    public final C148598rX A06;
    public final C93285lJ A07;
    public final C129387ln A08;
    public final C129387ln A09;
    public final Map A0A;
    public final Lock A0B;
    public final Looper A0C;
    public final Set A0D = Collections.newSetFromMap(new WeakHashMap());

    public final void DBm() {
        this.A00 = 2;
        this.A04 = false;
        this.A03 = null;
        this.A02 = null;
        this.A08.DBm();
        this.A09.DBm();
    }

    public final void DBn() {
        this.A03 = null;
        this.A02 = null;
        this.A00 = 0;
        this.A08.DBn();
        this.A09.DBn();
        A00();
    }

    public C129377lm(Context context, Looper looper, C121217Ev r30, C93175l8 r31, C148598rX r32, C93285lJ r33, C110886mR r34, ArrayList arrayList, ArrayList arrayList2, Map map, Map map2, Map map3, Map map4, Lock lock) {
        Context context2 = context;
        this.A05 = context2;
        C93285lJ r9 = r33;
        this.A07 = r9;
        Lock lock2 = lock;
        this.A0B = lock2;
        Looper looper2 = looper;
        this.A0C = looper2;
        this.A06 = r32;
        Map map5 = map2;
        C121217Ev r7 = r30;
        this.A08 = new C129387ln(context2, looper2, r7, (C93175l8) null, r9, new C129357lk(this), (C110886mR) null, arrayList2, map5, map4, lock2);
        Map map6 = map;
        Context context3 = context2;
        Looper looper3 = looper2;
        C121217Ev r18 = r7;
        C93285lJ r20 = r9;
        C129367ll r21 = new C129367ll(this);
        this.A09 = new C129387ln(context3, looper3, r18, r31, r20, r21, r34, arrayList, map6, map3, lock2);
        C013306f r4 = new C013306f();
        Iterator A0x = C18220wO.A0x(map5);
        while (A0x.hasNext()) {
            r4.put(A0x.next(), this.A08);
        }
        Iterator A0x2 = C18220wO.A0x(map6);
        while (A0x2.hasNext()) {
            r4.put(A0x2.next(), this.A09);
        }
        this.A0A = Collections.unmodifiableMap(r4);
    }

    private final void A00() {
        Set<AnonymousClass8eG> set = this.A0D;
        for (AnonymousClass8eG r0 : set) {
            ((C884858g) r0).A00.release();
        }
        set.clear();
    }

    private final void A01(ConnectionResult connectionResult) {
        int i = this.A00;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.A00 = 0;
            }
            this.A07.DBX(connectionResult);
        }
        A00();
        this.A00 = 0;
    }

    public static /* bridge */ /* synthetic */ void A02(C129377lm r4) {
        ConnectionResult connectionResult = r4.A02;
        if (connectionResult != null) {
            int i = connectionResult.A01;
            ConnectionResult connectionResult2 = r4.A03;
            if (i == 0) {
                if (connectionResult2 != null) {
                    int i2 = connectionResult2.A01;
                    if (C18180wK.A1W(i2) || i2 == 4) {
                        int i3 = r4.A00;
                        if (i3 != 1) {
                            if (i3 != 2) {
                                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                                r4.A00 = 0;
                            }
                            C93285lJ r1 = r4.A07;
                            C13320nQ.A01(r1);
                            r1.DBZ(r4.A01);
                        }
                        r4.A00();
                        r4.A00 = 0;
                    } else if (r4.A00 == 1) {
                        r4.A00();
                    } else {
                        r4.A01(connectionResult2);
                        r4.A08.DBn();
                    }
                }
            } else if (connectionResult2 != null) {
                if (connectionResult2.A01 == 0) {
                    r4.A09.DBn();
                    connectionResult = r4.A02;
                    C13320nQ.A01(connectionResult);
                } else if (r4.A09.A00 < r4.A08.A00) {
                    connectionResult = connectionResult2;
                }
                r4.A01(connectionResult);
            }
        }
    }

    public final C93345lQ DBe(C93345lQ r10) {
        PendingIntent activity;
        Object obj = this.A0A.get(r10.A00);
        C13320nQ.A02(obj, "GoogleApiClient is not configured to use the API required for this call.");
        C129387ln r1 = this.A09;
        if (obj.equals(r1)) {
            ConnectionResult connectionResult = this.A03;
            if (connectionResult != null && connectionResult.A01 == 4) {
                C148598rX r12 = this.A06;
                if (r12 == null) {
                    activity = null;
                } else {
                    activity = PendingIntent.getActivity(this.A05, System.identityHashCode(this.A07), r12.BC8(), C102956Xf.A00 | 134217728);
                }
                r10.A0A(new Status(activity, (ConnectionResult) null, (String) null, 1, 4));
                return r10;
            }
        } else {
            r1 = this.A08;
        }
        r1.DBe(r10);
        return r10;
    }

    public final C93345lQ DBh(C93345lQ r10) {
        PendingIntent activity;
        Object obj = this.A0A.get(r10.A00);
        C13320nQ.A02(obj, "GoogleApiClient is not configured to use the API required for this call.");
        C129387ln r1 = this.A09;
        if (obj.equals(r1)) {
            ConnectionResult connectionResult = this.A03;
            if (connectionResult != null && connectionResult.A01 == 4) {
                C148598rX r12 = this.A06;
                if (r12 == null) {
                    activity = null;
                } else {
                    activity = PendingIntent.getActivity(this.A05, System.identityHashCode(this.A07), r12.BC8(), C102956Xf.A00 | 134217728);
                }
                r10.A0A(new Status(activity, (ConnectionResult) null, (String) null, 1, 4));
                return r10;
            }
        } else {
            r1 = this.A08;
        }
        return r1.DBh(r10);
    }

    public final void DBp() {
        Lock lock = this.A0B;
        lock.lock();
        try {
            lock.lock();
            boolean A1T = AnonymousClass0wJ.A1T(this.A00, 2);
            lock.unlock();
            this.A09.DBn();
            this.A03 = new ConnectionResult(4);
            if (A1T) {
                new C86854zE(this.A0C).post(new C135437zU(this));
            } else {
                A00();
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            lock.unlock();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        if (r5.A00 == 1) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean DBq() {
        /*
            r5 = this;
            java.util.concurrent.locks.Lock r4 = r5.A0B
            r4.lock()
            X.7ln r0 = r5.A08     // Catch:{ all -> 0x002a }
            X.8mP r0 = r0.A0E     // Catch:{ all -> 0x002a }
            boolean r0 = r0 instanceof X.C129327lh     // Catch:{ all -> 0x002a }
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0026
            X.7ln r0 = r5.A09     // Catch:{ all -> 0x002a }
            X.8mP r0 = r0.A0E     // Catch:{ all -> 0x002a }
            boolean r0 = r0 instanceof X.C129327lh     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x0025
            com.google.android.gms.common.ConnectionResult r0 = r5.A03     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0021
            int r1 = r0.A01     // Catch:{ all -> 0x002a }
            r0 = 4
            if (r1 != r0) goto L_0x0021
            goto L_0x0025
        L_0x0021:
            int r0 = r5.A00     // Catch:{ all -> 0x002a }
            if (r0 != r2) goto L_0x0026
        L_0x0025:
            r3 = 1
        L_0x0026:
            r4.unlock()
            return r3
        L_0x002a:
            r0 = move-exception
            r4.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C129377lm.DBq():boolean");
    }

    public final boolean DBr(AnonymousClass8eG r5) {
        Lock lock = this.A0B;
        lock.lock();
        try {
            lock.lock();
            if (AnonymousClass0wJ.A1T(this.A00, 2) || DBq()) {
                C129387ln r2 = this.A09;
                if (!(r2.A0E instanceof C129327lh)) {
                    this.A0D.add(r5);
                    if (this.A00 == 0) {
                        this.A00 = 1;
                    }
                    this.A03 = null;
                    r2.DBm();
                    return true;
                }
            }
            lock.unlock();
            return false;
        } catch (Throwable th) {
            throw th;
        } finally {
            lock.unlock();
        }
    }

    public final void DBo(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("authClient").println(":");
        this.A09.DBo(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(":");
        this.A08.DBo(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }
}
