package X;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zact;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* renamed from: X.7lO  reason: invalid class name */
public final class AnonymousClass7lO implements C148648rc, C148658rd, C148608rY {
    public int A00 = 0;
    public ConnectionResult A01 = null;
    public boolean A02;
    public final int A03;
    public final C148598rX A04;
    public final C113816sC A05;
    public final AnonymousClass75Z A06;
    public final List A07 = AnonymousClass0wJ.A0v();
    public final Map A08 = AnonymousClass0wJ.A0y();
    public final Queue A09 = new LinkedList();
    public final zact A0A;
    public final Set A0B = C18200wM.A0u();
    public final /* synthetic */ AnonymousClass7MI A0C;

    public final void Bro(ConnectionResult connectionResult) {
        A0B(connectionResult, (Exception) null);
    }

    public AnonymousClass7lO(C129167lR r20, AnonymousClass7MI r21) {
        AnonymousClass7MI r1 = r21;
        this.A0C = r1;
        Handler handler = r1.A06;
        Looper looper = handler.getLooper();
        C129097lH r14 = C129097lH.A00;
        Set emptySet = Collections.emptySet();
        C001000m r0 = new C001000m(0);
        r0.addAll(emptySet);
        C129167lR r2 = r20;
        Context context = r2.A01;
        String A0q = C18220wO.A0q(context);
        C110886mR r13 = new C110886mR(r14, context.getPackageName(), A0q, (Map) null, r0);
        C93175l8 r7 = r2.A04.A00;
        C13320nQ.A01(r7);
        C148598rX A002 = r7.A00(context, looper, this, this, r13, r2.A03);
        String str = r2.A07;
        if (str != null && (A002 instanceof C121837Ij)) {
            ((C121837Ij) A002).A0R = str;
        }
        this.A04 = A002;
        this.A05 = r2.A06;
        this.A06 = new AnonymousClass75Z();
        this.A03 = r2.A00;
        if (A002.CeJ()) {
            Context context2 = r1.A05;
            Set emptySet2 = Collections.emptySet();
            C001000m r02 = new C001000m(0);
            r02.addAll(emptySet2);
            this.A0A = new zact(context2, handler, new C110886mR(r14, context.getPackageName(), A0q, (Map) null, r02));
        }
    }

    private final void A00(ConnectionResult connectionResult) {
        Set set = this.A0B;
        Iterator it = set.iterator();
        if (it.hasNext()) {
            it.next();
            if (C117046y2.A01(connectionResult, ConnectionResult.A04)) {
                C121837Ij r1 = (C121837Ij) this.A04;
                if (!r1.isConnected() || r1.A0A == null) {
                    throw C18250wR.A0V("Failed to connect when checking package");
                }
            }
            throw C18210wN.A0W("zac");
        }
        set.clear();
    }

    public static final void A01(Status status, AnonymousClass7lO r3) {
        C13320nQ.A00(r3.A0C.A06);
        r3.A02(status, (Exception) null, false);
    }

    private final void A02(Status status, Exception exc, boolean z) {
        C13320nQ.A00(this.A0C.A06);
        boolean z2 = false;
        boolean z3 = true;
        if (status != null) {
            z3 = false;
        }
        if (exc == null) {
            z2 = true;
        }
        if (z3 != z2) {
            Iterator it = this.A09.iterator();
            while (it.hasNext()) {
                C113416rM r2 = (C113416rM) it.next();
                if (!z || r2.A00 == 2) {
                    if (status != null) {
                        r2.A00(status);
                    } else {
                        r2.A01(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw C18190wL.A0a("Status XOR exception should be null");
    }

    public static final void A03(AnonymousClass7lO r6) {
        Queue queue = r6.A09;
        ArrayList A0s = C18200wM.A0s(queue);
        int size = A0s.size();
        int i = 0;
        while (i < size) {
            C113416rM r1 = (C113416rM) A0s.get(i);
            if (r6.A04.isConnected()) {
                if (r6.A08(r1)) {
                    queue.remove(r1);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public static final void A04(AnonymousClass7lO r3) {
        Handler handler = r3.A0C.A06;
        C13320nQ.A00(handler);
        r3.A01 = null;
        r3.A00(ConnectionResult.A04);
        if (r3.A02) {
            C113816sC r1 = r3.A05;
            handler.removeMessages(11, r1);
            handler.removeMessages(9, r1);
            r3.A02 = false;
        }
        Iterator A14 = C86104wH.A14(r3.A08);
        if (A14.hasNext()) {
            A14.next();
            throw C18210wN.A0W("zaa");
        }
        A03(r3);
        A05(r3);
    }

    public static final void A05(AnonymousClass7lO r5) {
        AnonymousClass7MI r4 = r5.A0C;
        Handler handler = r4.A06;
        C113816sC r1 = r5.A05;
        handler.removeMessages(12, r1);
        handler.sendMessageDelayed(handler.obtainMessage(12, r1), r4.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0076 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(X.AnonymousClass7lO r7, int r8) {
        /*
            X.7MI r5 = r7.A0C
            android.os.Handler r4 = r5.A06
            X.C13320nQ.A00(r4)
            r0 = 0
            r7.A01 = r0
            r6 = 1
            r7.A02 = r6
            X.75Z r3 = r7.A06
            X.8rX r0 = r7.A04
            X.7Ij r0 = (X.C121837Ij) r0
            java.lang.String r2 = r0.A0S
            java.lang.String r0 = "The connection to Google Play services was lost"
            java.lang.StringBuilder r1 = X.C18190wL.A0s(r0)
            if (r8 != r6) goto L_0x0070
            java.lang.String r0 = " due to service disconnection."
        L_0x001f:
            r1.append(r0)
        L_0x0022:
            if (r2 == 0) goto L_0x002c
            java.lang.String r0 = " Last reason for disconnect: "
            r1.append(r0)
            r1.append(r2)
        L_0x002c:
            r2 = 20
            java.lang.String r1 = r1.toString()
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r2, r1)
            X.AnonymousClass75Z.A00(r0, r3, r6)
            X.6sC r3 = r7.A05
            r0 = 9
            android.os.Message r2 = android.os.Message.obtain(r4, r0, r3)
            r0 = 5000(0x1388, double:2.4703E-320)
            r4.sendMessageDelayed(r2, r0)
            r0 = 11
            android.os.Message r2 = android.os.Message.obtain(r4, r0, r3)
            r0 = 120000(0x1d4c0, double:5.9288E-319)
            r4.sendMessageDelayed(r2, r0)
            X.77f r0 = r5.A08
            android.util.SparseIntArray r0 = r0.A01
            r0.clear()
            java.util.Map r0 = r7.A08
            java.util.Iterator r1 = X.C86104wH.A14(r0)
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0076
            r1.next()
            java.lang.String r0 = "zac"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x0070:
            r0 = 3
            if (r8 != r0) goto L_0x0022
            java.lang.String r0 = " due to dead object exception."
            goto L_0x001f
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7lO.A06(X.7lO, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A07(com.google.android.gms.common.ConnectionResult r6) {
        /*
            r5 = this;
            java.lang.Object r4 = X.AnonymousClass7MI.A0I
            monitor-enter(r4)
            X.7MI r2 = r5.A0C     // Catch:{ all -> 0x0035 }
            X.5li r0 = r2.A01     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0032
            java.util.Set r1 = r2.A0A     // Catch:{ all -> 0x0035 }
            X.6sC r0 = r5.A05     // Catch:{ all -> 0x0035 }
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0032
            X.5li r3 = r2.A01     // Catch:{ all -> 0x0035 }
            int r0 = r5.A03     // Catch:{ all -> 0x0035 }
            X.6gn r2 = new X.6gn     // Catch:{ all -> 0x0035 }
            r2.<init>(r6, r0)     // Catch:{ all -> 0x0035 }
            java.util.concurrent.atomic.AtomicReference r1 = r3.A02     // Catch:{ all -> 0x0035 }
            r0 = 0
            boolean r0 = r1.compareAndSet(r0, r2)     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x002f
            android.os.Handler r1 = r3.A00     // Catch:{ all -> 0x0035 }
            X.81A r0 = new X.81A     // Catch:{ all -> 0x0035 }
            r0.<init>(r2, r3)     // Catch:{ all -> 0x0035 }
            r1.post(r0)     // Catch:{ all -> 0x0035 }
        L_0x002f:
            monitor-exit(r4)     // Catch:{ all -> 0x0035 }
            r0 = 1
            return r0
        L_0x0032:
            monitor-exit(r4)     // Catch:{ all -> 0x0035 }
            r0 = 0
            return r0
        L_0x0035:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0035 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7lO.A07(com.google.android.gms.common.ConnectionResult):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: X.5lf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: X.5le} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: X.5lf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: X.5lf} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A08(X.C113416rM r22) {
        /*
            r21 = this;
            r12 = r22
            boolean r0 = r12 instanceof X.C93485lg
            r9 = 1
            r10 = r21
            if (r0 == 0) goto L_0x0016
            r8 = r12
            X.5lg r8 = (X.C93485lg) r8
            boolean r7 = r8 instanceof X.C93465le
            if (r7 == 0) goto L_0x0050
            java.util.Map r1 = r10.A08
            r0 = 0
            r1.get(r0)
        L_0x0016:
            X.75Z r5 = r10.A06
            X.8rX r3 = r10.A04
            boolean r6 = r3.CeJ()
            boolean r4 = r12 instanceof X.C93465le
            if (r4 != 0) goto L_0x003a
            boolean r0 = r12 instanceof X.C93475lf
            if (r0 == 0) goto L_0x003d
            r0 = r12
            X.5lf r0 = (X.C93475lf) r0
            X.6rN r2 = r0.A01
            java.util.Map r0 = r5.A01
            X.C86154wM.A1U(r2, r0, r6)
            X.7HU r1 = r2.A00
            X.7mH r0 = new X.7mH
            r0.<init>(r5, r2)
            r1.A07(r0)
        L_0x003a:
            if (r4 == 0) goto L_0x00d1
            goto L_0x00bb
        L_0x003d:
            r0 = r12
            X.5lh r0 = (X.C93495lh) r0
            X.5lQ r1 = r0.A00
            java.util.Map r0 = r5.A00
            X.C86154wM.A1U(r1, r0, r6)
            X.7lS r0 = new X.7lS
            r0.<init>(r1, r5)
            r1.A02(r0)
            goto L_0x003a
        L_0x0050:
            r0 = r8
            X.5lf r0 = (X.C93475lf) r0
            X.76Q r6 = r0.A00
            com.google.android.gms.common.Feature[] r11 = r6.A02
            if (r11 == 0) goto L_0x0016
            int r5 = r11.length
            if (r5 == 0) goto L_0x0016
            X.8rX r0 = r10.A04
            r19 = r0
            r0 = r19
            X.7Ij r0 = (X.C121837Ij) r0
            com.google.android.gms.common.internal.zzj r0 = r0.A0Q
            if (r0 != 0) goto L_0x0094
            r14 = 0
        L_0x0069:
            r4 = 0
            if (r14 != 0) goto L_0x006e
            com.google.android.gms.common.Feature[] r14 = new com.google.android.gms.common.Feature[r4]
        L_0x006e:
            int r13 = r14.length
            X.06f r3 = new X.06f
            r3.<init>((int) r13)
            r2 = 0
        L_0x0075:
            if (r2 >= r13) goto L_0x0097
            r15 = r14[r2]
            java.lang.String r0 = r15.A02
            r20 = r0
            long r0 = r15.A01
            r17 = -1
            int r16 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r16 != 0) goto L_0x0088
            int r0 = r15.A00
            long r0 = (long) r0
        L_0x0088:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = r20
            r3.put(r0, r1)
            int r2 = r2 + 1
            goto L_0x0075
        L_0x0094:
            com.google.android.gms.common.Feature[] r14 = r0.A03
            goto L_0x0069
        L_0x0097:
            if (r4 >= r5) goto L_0x0016
            r2 = r11[r4]
            java.lang.String r0 = r2.A02
            java.lang.Object r0 = r3.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x014d
            long r16 = r0.longValue()
            long r0 = r2.A01
            r14 = -1
            int r13 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r13 != 0) goto L_0x00b4
            int r0 = r2.A00
            long r0 = (long) r0
        L_0x00b4:
            int r13 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r13 < 0) goto L_0x014d
            int r4 = r4 + 1
            goto L_0x0097
        L_0x00bb:
            X.5le r12 = (X.C93465le) r12     // Catch:{ DeadObjectException -> 0x0144 }
            java.util.Map r1 = r10.A08     // Catch:{ DeadObjectException -> 0x011d, RemoteException -> 0x0101, RuntimeException -> 0x00cd }
            r0 = 0
            r1.remove(r0)     // Catch:{ DeadObjectException -> 0x011d, RemoteException -> 0x0101, RuntimeException -> 0x00cd }
            X.6rN r1 = r12.A01     // Catch:{ DeadObjectException -> 0x011d, RemoteException -> 0x0101, RuntimeException -> 0x00cd }
            java.lang.Boolean r0 = X.C18180wK.A0X()     // Catch:{ DeadObjectException -> 0x011d, RemoteException -> 0x0101, RuntimeException -> 0x00cd }
            r1.A01(r0)     // Catch:{ DeadObjectException -> 0x011d, RemoteException -> 0x0101, RuntimeException -> 0x00cd }
            return r9
        L_0x00cd:
            r1 = move-exception
            X.6rN r0 = r12.A01     // Catch:{ DeadObjectException -> 0x0144 }
            goto L_0x00e6
        L_0x00d1:
            boolean r0 = r12 instanceof X.C93475lf     // Catch:{ DeadObjectException -> 0x0144 }
            if (r0 == 0) goto L_0x0137
            X.5lf r12 = (X.C93475lf) r12     // Catch:{ DeadObjectException -> 0x0144 }
            X.76Q r0 = r12.A00     // Catch:{ DeadObjectException -> 0x011b, RemoteException -> 0x00ea, RuntimeException -> 0x00e3 }
            X.6rN r1 = r12.A01     // Catch:{ DeadObjectException -> 0x011b, RemoteException -> 0x00ea, RuntimeException -> 0x00e3 }
            X.783 r0 = r0.A03     // Catch:{ DeadObjectException -> 0x011b, RemoteException -> 0x00ea, RuntimeException -> 0x00e3 }
            X.8hJ r0 = r0.A01     // Catch:{ DeadObjectException -> 0x011b, RemoteException -> 0x00ea, RuntimeException -> 0x00e3 }
            r0.accept(r3, r1)     // Catch:{ DeadObjectException -> 0x011b, RemoteException -> 0x00ea, RuntimeException -> 0x00e3 }
            return r9
        L_0x00e3:
            r1 = move-exception
            X.6rN r0 = r12.A01     // Catch:{ DeadObjectException -> 0x0144 }
        L_0x00e6:
            r0.A00(r1)     // Catch:{ DeadObjectException -> 0x0144 }
            return r9
        L_0x00ea:
            r0 = move-exception
            java.lang.String r2 = X.C18210wN.A0e(r0)     // Catch:{ DeadObjectException -> 0x0144 }
            java.lang.String r1 = ": "
            java.lang.String r0 = r0.getLocalizedMessage()     // Catch:{ DeadObjectException -> 0x0144 }
            java.lang.String r2 = X.AnonymousClass00U.A0V(r2, r1, r0)     // Catch:{ DeadObjectException -> 0x0144 }
            r1 = 19
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status     // Catch:{ DeadObjectException -> 0x0144 }
            r0.<init>(r1, r2)     // Catch:{ DeadObjectException -> 0x0144 }
            goto L_0x0117
        L_0x0101:
            r0 = move-exception
            java.lang.String r2 = X.C18210wN.A0e(r0)     // Catch:{ DeadObjectException -> 0x0144 }
            java.lang.String r1 = ": "
            java.lang.String r0 = r0.getLocalizedMessage()     // Catch:{ DeadObjectException -> 0x0144 }
            java.lang.String r2 = X.AnonymousClass00U.A0V(r2, r1, r0)     // Catch:{ DeadObjectException -> 0x0144 }
            r1 = 19
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status     // Catch:{ DeadObjectException -> 0x0144 }
            r0.<init>(r1, r2)     // Catch:{ DeadObjectException -> 0x0144 }
        L_0x0117:
            r12.A00(r0)     // Catch:{ DeadObjectException -> 0x0144 }
            return r9
        L_0x011b:
            r4 = move-exception
            goto L_0x0136
        L_0x011d:
            r4 = move-exception
            java.lang.String r2 = X.C18210wN.A0e(r4)     // Catch:{ DeadObjectException -> 0x0144 }
            java.lang.String r1 = ": "
            java.lang.String r0 = r4.getLocalizedMessage()     // Catch:{ DeadObjectException -> 0x0144 }
            java.lang.String r2 = X.AnonymousClass00U.A0V(r2, r1, r0)     // Catch:{ DeadObjectException -> 0x0144 }
            r1 = 19
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status     // Catch:{ DeadObjectException -> 0x0144 }
            r0.<init>(r1, r2)     // Catch:{ DeadObjectException -> 0x0144 }
            r12.A00(r0)     // Catch:{ DeadObjectException -> 0x0144 }
        L_0x0136:
            throw r4     // Catch:{ DeadObjectException -> 0x0144 }
        L_0x0137:
            X.5lh r12 = (X.C93495lh) r12     // Catch:{ DeadObjectException -> 0x0144 }
            X.5lQ r0 = r12.A00     // Catch:{ RuntimeException -> 0x013f }
            r0.A09(r3)     // Catch:{ RuntimeException -> 0x013f }
            return r9
        L_0x013f:
            r0 = move-exception
            r12.A01(r0)     // Catch:{ DeadObjectException -> 0x0144 }
            return r9
        L_0x0144:
            r10.Brq(r9)
            java.lang.String r0 = "DeadObjectException thrown while running ApiCallRunner."
            r3.AI8(r0)
            return r9
        L_0x014d:
            java.lang.String r11 = X.C18220wO.A0q(r19)
            java.lang.String r5 = r2.A02
            long r0 = r2.A01
            r12 = -1
            int r3 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r3 != 0) goto L_0x015e
            int r0 = r2.A00
            long r0 = (long) r0
        L_0x015e:
            int r3 = X.C86104wH.A0A(r11)
            int r4 = X.C86104wH.A0A(r5)
            int r3 = r3 + 77
            int r3 = r3 + r4
            java.lang.StringBuilder r4 = X.C86114wI.A0s(r3)
            r4.append(r11)
            java.lang.String r3 = " could not execute call because it requires feature ("
            r4.append(r3)
            r4.append(r5)
            X.C86144wL.A1T(r4)
            r4.append(r0)
            java.lang.String r0 = ")."
            java.lang.String r1 = X.C18180wK.A0i(r0, r4)
            java.lang.String r0 = "GoogleApiManager"
            android.util.Log.w(r0, r1)
            X.7MI r3 = r10.A0C
            boolean r0 = r3.A0E
            if (r0 == 0) goto L_0x0197
            if (r7 == 0) goto L_0x01a0
            java.util.Map r1 = r10.A08
            r0 = 0
            r1.get(r0)
        L_0x0197:
            X.897 r0 = new X.897
            r0.<init>(r2)
            r8.A01(r0)
            return r9
        L_0x01a0:
            boolean r0 = r6.A01
            if (r0 == 0) goto L_0x0197
            X.6sC r0 = r10.A05
            r5 = 0
            X.6tr r6 = new X.6tr
            r6.<init>(r2, r0)
            java.util.List r2 = r10.A07
            int r0 = r2.indexOf(r6)
            r1 = 15
            if (r0 < 0) goto L_0x01ca
            java.lang.Object r0 = r2.get(r0)
            android.os.Handler r3 = r3.A06
            r3.removeMessages(r1, r0)
            android.os.Message r2 = android.os.Message.obtain(r3, r1, r0)
            r0 = 5000(0x1388, double:2.4703E-320)
            r3.sendMessageDelayed(r2, r0)
        L_0x01c8:
            r9 = 0
            return r9
        L_0x01ca:
            r2.add(r6)
            android.os.Handler r4 = r3.A06
            android.os.Message r2 = android.os.Message.obtain(r4, r1, r6)
            r0 = 5000(0x1388, double:2.4703E-320)
            r4.sendMessageDelayed(r2, r0)
            r0 = 16
            android.os.Message r2 = android.os.Message.obtain(r4, r0, r6)
            r0 = 120000(0x1d4c0, double:5.9288E-319)
            r4.sendMessageDelayed(r2, r0)
            r0 = 2
            com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult
            r1.<init>(r0, r5)
            boolean r0 = r10.A07(r1)
            if (r0 != 0) goto L_0x01c8
            int r0 = r10.A03
            r3.A07(r1, r0)
            goto L_0x01c8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7lO.A08(X.6rM):boolean");
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [X.8rX, X.8rW] */
    public final void A09() {
        int i;
        AnonymousClass7MI r3 = this.A0C;
        C13320nQ.A00(r3.A06);
        C148598rX r5 = this.A04;
        if (!r5.isConnected() && !r5.BST()) {
            try {
                int A002 = r3.A08.A00(r3.A05, r5);
                if (A002 != 0) {
                    ConnectionResult connectionResult = new ConnectionResult(A002, (PendingIntent) null);
                    String A0q = C18220wO.A0q(r5);
                    String obj = connectionResult.toString();
                    StringBuilder A0s = C86114wI.A0s(C86154wM.A06(obj, C86104wH.A0A(A0q) + 35));
                    A0s.append("The service for ");
                    A0s.append(A0q);
                    A0s.append(" is not available: ");
                    Log.w("GoogleApiManager", C18180wK.A0i(obj, A0s));
                    A0B(connectionResult, (Exception) null);
                    return;
                }
                C129437ls r4 = new C129437ls(r5, this.A05, r3);
                if (r5.CeJ()) {
                    zact zact = this.A0A;
                    C13320nQ.A01(zact);
                    int A032 = C14030oh.A03(-32086994);
                    C148588rW r0 = zact.A01;
                    if (r0 != null) {
                        r0.AI7();
                    }
                    C110886mR r11 = zact.A05;
                    r11.A00 = Integer.valueOf(System.identityHashCode(zact));
                    C93175l8 r6 = zact.A04;
                    Context context = zact.A02;
                    Handler handler = zact.A03;
                    zact.A01 = r6.A00(context, handler.getLooper(), zact, zact, r11, r11.A01);
                    zact.A00 = r4;
                    Set set = zact.A06;
                    if (set == null || set.isEmpty()) {
                        handler.post(new AnonymousClass7zT(zact));
                        i = 741814066;
                    } else {
                        C121837Ij r1 = (C121837Ij) zact.A01;
                        C121837Ij.A01(new C129417lq(r1), r1);
                        i = -1918310273;
                    }
                    C14030oh.A0A(i, A032);
                }
                try {
                    C121837Ij.A01(r4, (C121837Ij) r5);
                } catch (SecurityException e) {
                    A0B(new ConnectionResult(10), e);
                }
            } catch (IllegalStateException e2) {
                A0B(new ConnectionResult(10), e2);
            }
        }
    }

    public final void A0A() {
        C13320nQ.A00(this.A0C.A06);
        Status status = AnonymousClass7MI.A0G;
        A01(status, this);
        AnonymousClass75Z.A00(status, this.A06, false);
        for (C97756Cq r2 : (C97756Cq[]) this.A08.keySet().toArray(new C97756Cq[0])) {
            A0C(new C93465le(r2, new C113426rN()));
        }
        A00(new ConnectionResult(4));
        if (this.A04.isConnected()) {
            C105066cp r22 = new C105066cp(this);
            r22.A00.A0C.A06.post(new C135427zS(r22));
        }
    }

    public final void A0B(ConnectionResult connectionResult, Exception exc) {
        Status A002;
        int i;
        AnonymousClass7MI r5 = this.A0C;
        Handler handler = r5.A06;
        C13320nQ.A00(handler);
        zact zact = this.A0A;
        if (zact != null) {
            int A032 = C14030oh.A03(1292349397);
            C148588rW r0 = zact.A01;
            if (r0 != null) {
                r0.AI7();
                i = -762160796;
            } else {
                i = 1129041158;
            }
            C14030oh.A0A(i, A032);
        }
        C13320nQ.A00(handler);
        this.A01 = null;
        r5.A08.A01.clear();
        A00(connectionResult);
        if ((this.A04 instanceof C93545lm) && connectionResult.A01 != 24) {
            r5.A03 = true;
            handler.sendMessageDelayed(handler.obtainMessage(19), 300000);
        }
        int i2 = connectionResult.A01;
        if (i2 == 4) {
            A002 = AnonymousClass7MI.A0H;
        } else {
            Queue queue = this.A09;
            if (queue.isEmpty()) {
                this.A01 = connectionResult;
                return;
            } else if (exc != null) {
                C13320nQ.A00(handler);
                A02((Status) null, exc, false);
                return;
            } else {
                boolean z = r5.A0E;
                C113816sC r1 = this.A05;
                if (z) {
                    A02(AnonymousClass7MI.A00(connectionResult, r1), (Exception) null, true);
                    if (!queue.isEmpty() && !A07(connectionResult) && !r5.A07(connectionResult, this.A03)) {
                        if (i2 == 18) {
                            this.A02 = true;
                        }
                        if (this.A02) {
                            handler.sendMessageDelayed(Message.obtain(handler, 9, r1), 5000);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                A002 = AnonymousClass7MI.A00(connectionResult, r1);
            }
        }
        A01(A002, this);
    }

    public final void A0C(C113416rM r3) {
        C13320nQ.A00(this.A0C.A06);
        if (!this.A04.isConnected()) {
            this.A09.add(r3);
            ConnectionResult connectionResult = this.A01;
            if (connectionResult == null || connectionResult.A01 == 0 || connectionResult.A02 == null) {
                A09();
            } else {
                A0B(connectionResult, (Exception) null);
            }
        } else if (A08(r3)) {
            A05(this);
        } else {
            this.A09.add(r3);
        }
    }

    public final void Brh(Bundle bundle) {
        Looper myLooper = Looper.myLooper();
        Handler handler = this.A0C.A06;
        if (myLooper == handler.getLooper()) {
            A04(this);
        } else {
            handler.post(new AnonymousClass7zR(this));
        }
    }

    public final void Brq(int i) {
        Looper myLooper = Looper.myLooper();
        Handler handler = this.A0C.A06;
        if (myLooper == handler.getLooper()) {
            A06(this, i);
        } else {
            handler.post(new AnonymousClass817(this, i));
        }
    }
}
