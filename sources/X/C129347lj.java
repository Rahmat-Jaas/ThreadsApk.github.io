package X;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.internal.base.zaa;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* renamed from: X.7lj  reason: invalid class name and case insensitive filesystem */
public final class C129347lj implements C146538mP {
    public IAccountAccessor A00;
    public C148588rW A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public int A07;
    public int A08 = 0;
    public int A09;
    public ConnectionResult A0A;
    public final Context A0B;
    public final C121217Ev A0C;
    public final C129387ln A0D;
    public final C110886mR A0E;
    public final ArrayList A0F = AnonymousClass0wJ.A0v();
    public final Lock A0G;
    public final Bundle A0H = C18180wK.A06();
    public final C93175l8 A0I;
    public final Map A0J;
    public final Set A0K = C18200wM.A0u();

    public static final void A03(C129347lj r7) {
        r7.A03 = false;
        C129387ln r6 = r7.A0D;
        r6.A07.A03 = Collections.emptySet();
        for (Object next : r7.A0K) {
            Map map = r6.A0A;
            if (!map.containsKey(next)) {
                map.put(next, new ConnectionResult(17, (PendingIntent) null));
            }
        }
    }

    public final void DBf() {
    }

    public final void DBi(Bundle bundle) {
        if (A07(this, 1)) {
            if (bundle != null) {
                this.A0H.putAll(bundle);
            }
            if (A06(this)) {
                A00();
            }
        }
    }

    public final void DBj(ConnectionResult connectionResult, C108946jD r3, boolean z) {
        if (A07(this, 1)) {
            A01(connectionResult, r3, this, z);
            if (A06(this)) {
                A00();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    private final void A00() {
        IBinder iBinder;
        C129387ln r3 = this.A0D;
        Lock lock = r3.A0D;
        lock.lock();
        try {
            r3.A07.A09();
            r3.A0E = new C129327lh(r3);
            r3.A0E.DBc();
            r3.A0C.signalAll();
            lock.unlock();
            C102926Xb.A00.execute(new C135407zP(this));
            C148588rW r1 = this.A01;
            if (r1 != null) {
                if (this.A05) {
                    IAccountAccessor iAccountAccessor = this.A00;
                    C13320nQ.A01(iAccountAccessor);
                    boolean z = this.A06;
                    C93615lt r12 = (C93615lt) r1;
                    try {
                        zaa zaa = (zaa) r12.A03();
                        Integer num = r12.A02;
                        C13320nQ.A01(num);
                        int intValue = num.intValue();
                        int A032 = C14030oh.A03(-1016209369);
                        Parcel A002 = zaa.A00();
                        if (iAccountAccessor == null) {
                            iBinder = null;
                        } else {
                            iBinder = iAccountAccessor.asBinder();
                        }
                        A002.writeStrongBinder(iBinder);
                        A002.writeInt(intValue);
                        A002.writeInt(z ? 1 : 0);
                        zaa.A01(A002, 9);
                        C14030oh.A0A(-1790750157, A032);
                    } catch (RemoteException unused) {
                        Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
                    }
                }
                A05(false);
            }
            Iterator A0x = C18220wO.A0x(r3.A0A);
            while (A0x.hasNext()) {
                Object obj = r3.A03.get(A0x.next());
                C13320nQ.A01(obj);
                ((C148598rX) obj).AI7();
            }
            Bundle bundle = this.A0H;
            if (bundle.isEmpty()) {
                bundle = null;
            }
            r3.A02.DBZ(bundle);
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        if (r5.A02 == null) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(com.google.android.gms.common.ConnectionResult r5, X.C129347lj r6) {
        /*
            java.util.ArrayList r4 = r6.A0F
            int r3 = r4.size()
            r2 = 0
        L_0x0007:
            if (r2 >= r3) goto L_0x0016
            java.lang.Object r1 = r4.get(r2)
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            r0 = 1
            r1.cancel(r0)
            int r2 = r2 + 1
            goto L_0x0007
        L_0x0016:
            r4.clear()
            int r0 = r5.A01
            if (r0 == 0) goto L_0x0022
            android.app.PendingIntent r1 = r5.A02
            r0 = 1
            if (r1 != 0) goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            r0 = r0 ^ 1
            r6.A05(r0)
            X.7ln r0 = r6.A0D
            r0.A00(r5)
            X.8lG r0 = r0.A02
            r0.DBX(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C129347lj.A02(com.google.android.gms.common.ConnectionResult, X.7lj):void");
    }

    public static final void A04(C129347lj r6) {
        if (r6.A09 != 0) {
            return;
        }
        if (!r6.A03 || r6.A04) {
            ArrayList A0v = AnonymousClass0wJ.A0v();
            r6.A08 = 1;
            C129387ln r4 = r6.A0D;
            Map map = r4.A03;
            r6.A09 = map.size();
            Iterator A0x = C18220wO.A0x(map);
            while (A0x.hasNext()) {
                Object next = A0x.next();
                if (!r4.A0A.containsKey(next)) {
                    A0v.add(map.get(next));
                } else if (A06(r6)) {
                    r6.A00();
                }
            }
            if (!A0v.isEmpty()) {
                r6.A0F.add(C102926Xb.A00.submit(new C93395lX(r6, A0v)));
            }
        }
    }

    private final void A05(boolean z) {
        C148588rW r5 = this.A01;
        if (r5 != null) {
            if (r5.isConnected() && z) {
                C93615lt r0 = (C93615lt) r5;
                try {
                    zaa zaa = (zaa) r0.A03();
                    Integer num = r0.A02;
                    C13320nQ.A01(num);
                    int intValue = num.intValue();
                    int A032 = C14030oh.A03(-886822658);
                    Parcel A002 = zaa.A00();
                    A002.writeInt(intValue);
                    zaa.A01(A002, 7);
                    C14030oh.A0A(1596129880, A032);
                } catch (RemoteException unused) {
                    Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
                }
            }
            r5.AI7();
            C13320nQ.A01(this.A0E);
            this.A00 = null;
        }
    }

    public static final boolean A06(C129347lj r6) {
        ConnectionResult connectionResult;
        int i = r6.A09 - 1;
        r6.A09 = i;
        if (i <= 0) {
            if (i < 0) {
                C93285lJ r4 = r6.A0D.A07;
                StringWriter A0d = C18230wP.A0d();
                r4.A08("", (FileDescriptor) null, new PrintWriter(A0d), (String[]) null);
                Log.w("GACConnecting", A0d.toString());
                Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
                connectionResult = new ConnectionResult(8, (PendingIntent) null);
            } else {
                connectionResult = r6.A0A;
                if (connectionResult == null) {
                    return true;
                }
                r6.A0D.A00 = r6.A07;
            }
            A02(connectionResult, r6);
        }
        return false;
    }

    public static final boolean A07(C129347lj r6, int i) {
        String str;
        String str2;
        if (r6.A08 == i) {
            return true;
        }
        C93285lJ r3 = r6.A0D.A07;
        StringWriter A0d = C18230wP.A0d();
        r3.A08("", (FileDescriptor) null, new PrintWriter(A0d), (String[]) null);
        Log.w("GACConnecting", A0d.toString());
        Log.w("GACConnecting", "Unexpected callback in ".concat(r6.toString()));
        Log.w("GACConnecting", C86104wH.A10("mRemainingConnections=", C86114wI.A0s(33), r6.A09));
        if (r6.A08 != 0) {
            str = "STEP_GETTING_REMOTE_SERVICE";
        } else {
            str = "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        }
        if (i != 0) {
            str2 = "STEP_GETTING_REMOTE_SERVICE";
        } else {
            str2 = "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        }
        StringBuilder A0s = C86114wI.A0s(C86154wM.A06(str2, str.length() + 70));
        A0s.append("GoogleApiClient connecting is in step ");
        A0s.append(str);
        A0s.append(" but received callback for step ");
        A0s.append(str2);
        Log.e("GACConnecting", A0s.toString(), new Exception());
        A02(new ConnectionResult(8, (PendingIntent) null), r6);
        return false;
    }

    public final C93345lQ DBW(C93345lQ r2) {
        this.A0D.A07.A0G.add(r2);
        return r2;
    }

    public final C93345lQ DBY(C93345lQ r2) {
        throw C18180wK.A0a("GoogleApiClient is not connected yet.");
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [X.8rX, X.8rW] */
    public final void DBc() {
        C129387ln r2 = this.A0D;
        r2.A0A.clear();
        this.A03 = false;
        this.A0A = null;
        this.A08 = 0;
        this.A02 = true;
        this.A04 = false;
        this.A05 = false;
        HashMap A0y = AnonymousClass0wJ.A0y();
        Map map = this.A0J;
        Iterator A0x = C18220wO.A0x(map);
        while (A0x.hasNext()) {
            C108946jD r6 = (C108946jD) A0x.next();
            Map map2 = r2.A03;
            C99286Iv r5 = r6.A01;
            Object obj = map2.get(r5);
            C13320nQ.A01(obj);
            C148598rX r4 = (C148598rX) obj;
            boolean A1X = AnonymousClass0wJ.A1X(map.get(r6));
            if (r4.CeJ()) {
                this.A03 = true;
                if (A1X) {
                    this.A0K.add(r5);
                } else {
                    this.A02 = false;
                }
            }
            A0y.put(r4, new C129427lr(r6, this, A1X));
        }
        if (this.A03) {
            C110886mR r9 = this.A0E;
            C13320nQ.A01(r9);
            C93175l8 r42 = this.A0I;
            C13320nQ.A01(r42);
            C93285lJ r1 = r2.A07;
            r9.A00 = Integer.valueOf(System.identityHashCode(r1));
            C129127lL r7 = new C129127lL(this);
            this.A01 = r42.A00(this.A0B, r1.A06, r7, r7, r9, r9.A01);
        }
        this.A09 = r2.A03.size();
        this.A0F.add(C102926Xb.A00.submit(new C93385lW(this, A0y)));
    }

    public final void DBk(int i) {
        A02(new ConnectionResult(8, (PendingIntent) null), this);
    }

    public final boolean DBl() {
        ArrayList arrayList = this.A0F;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        arrayList.clear();
        A05(true);
        this.A0D.A00((ConnectionResult) null);
        return true;
    }

    public C129347lj(Context context, C121217Ev r3, C93175l8 r4, C129387ln r5, C110886mR r6, Map map, Lock lock) {
        this.A0D = r5;
        this.A0E = r6;
        this.A0J = map;
        this.A0C = r3;
        this.A0I = r4;
        this.A0G = lock;
        this.A0B = context;
    }

    public static final void A01(ConnectionResult connectionResult, C108946jD r5, C129347lj r6, boolean z) {
        int i;
        if ((!z || !(((i = connectionResult.A01) == 0 || connectionResult.A02 == null) && r6.A0C.A03((Context) null, (String) null, i) == null)) && r6.A0A == null) {
            r6.A0A = connectionResult;
            r6.A07 = Integer.MAX_VALUE;
        }
        r6.A0D.A0A.put(r5.A01, connectionResult);
    }
}
