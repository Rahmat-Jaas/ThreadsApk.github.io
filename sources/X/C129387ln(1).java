package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* renamed from: X.7ln  reason: invalid class name and case insensitive filesystem */
public final class C129387ln implements C146548mQ, C148608rY {
    public int A00;
    public ConnectionResult A01 = null;
    public final C145878lG A02;
    public final Map A03;
    public final Context A04;
    public final C121217Ev A05;
    public final C93175l8 A06;
    public final C93285lJ A07;
    public final AnonymousClass5pt A08;
    public final C110886mR A09;
    public final Map A0A = AnonymousClass0wJ.A0y();
    public final Map A0B;
    public final Condition A0C;
    public final Lock A0D;
    public volatile C146538mP A0E;

    public final void DBp() {
    }

    public final boolean DBr(AnonymousClass8eG r2) {
        return false;
    }

    public final void A00(ConnectionResult connectionResult) {
        Lock lock = this.A0D;
        lock.lock();
        try {
            this.A01 = connectionResult;
            this.A0E = new C129337li(this);
            this.A0E.DBc();
            this.A0C.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public final void Brh(Bundle bundle) {
        Lock lock = this.A0D;
        lock.lock();
        try {
            this.A0E.DBi(bundle);
        } finally {
            lock.unlock();
        }
    }

    public final void Brq(int i) {
        Lock lock = this.A0D;
        lock.lock();
        try {
            this.A0E.DBk(i);
        } finally {
            lock.unlock();
        }
    }

    public final void DBm() {
        this.A0E.DBf();
    }

    public final void DBn() {
        this.A0E.DBl();
        this.A0A.clear();
    }

    public final void DBo(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        IInterface iInterface;
        IGmsServiceBroker iGmsServiceBroker;
        String A002;
        String str2;
        String str3 = str;
        String concat = String.valueOf(str3).concat("  ");
        PrintWriter printWriter2 = printWriter;
        printWriter2.append(str3).append("mState=").println(this.A0E);
        Iterator A0x = C18220wO.A0x(this.A0B);
        while (A0x.hasNext()) {
            C108946jD r2 = (C108946jD) A0x.next();
            printWriter2.append(str3).append(r2.A02).println(":");
            Object obj = this.A03.get(r2.A01);
            C13320nQ.A01(obj);
            C121837Ij r7 = (C121837Ij) ((C148598rX) obj);
            synchronized (r7.A0J) {
                i = r7.A02;
                iInterface = r7.A06;
            }
            synchronized (r7.A0K) {
                iGmsServiceBroker = r7.A09;
            }
            printWriter2.append(concat).append("mConnectState=");
            if (i == 1) {
                A002 = AnonymousClass000.A00(639);
            } else if (i == 2) {
                A002 = "REMOTE_CONNECTING";
            } else if (i == 3) {
                A002 = "LOCAL_CONNECTING";
            } else if (i != 4) {
                A002 = "DISCONNECTING";
            } else {
                A002 = "CONNECTED";
            }
            printWriter2.print(A002);
            printWriter2.append(" mService=");
            if (iInterface == null) {
                printWriter2.append("null");
            } else {
                printWriter2.append(r7.A04()).append("@").append(C86144wL.A0u(iInterface.asBinder()));
            }
            printWriter2.append(" mServiceBroker=");
            if (iGmsServiceBroker == null) {
                printWriter2.println("null");
            } else {
                printWriter2.append("IGmsServiceBroker@").println(C86144wL.A0u(iGmsServiceBroker.asBinder()));
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
            if (r7.A04 > 0) {
                PrintWriter append = printWriter2.append(concat).append("lastConnectedTime=");
                long j = r7.A04;
                String A0i = C18240wQ.A0i(simpleDateFormat, j);
                StringBuilder A0s = C86114wI.A0s(C86104wH.A0A(A0i) + 21);
                A0s.append(j);
                A0s.append(" ");
                append.println(C18180wK.A0i(A0i, A0s));
            }
            if (r7.A03 > 0) {
                printWriter2.append(concat).append("lastSuspendedCause=");
                int i2 = r7.A00;
                if (i2 == 1) {
                    str2 = "CAUSE_SERVICE_DISCONNECTED";
                } else if (i2 == 2) {
                    str2 = "CAUSE_NETWORK_LOST";
                } else if (i2 != 3) {
                    str2 = String.valueOf(i2);
                } else {
                    str2 = "CAUSE_DEAD_OBJECT_EXCEPTION";
                }
                printWriter2.append(str2);
                PrintWriter append2 = printWriter2.append(" lastSuspendedTime=");
                long j2 = r7.A03;
                String A0i2 = C18240wQ.A0i(simpleDateFormat, j2);
                StringBuilder A0s2 = C86114wI.A0s(C86104wH.A0A(A0i2) + 21);
                A0s2.append(j2);
                A0s2.append(" ");
                append2.println(C18180wK.A0i(A0i2, A0s2));
            }
            if (r7.A05 > 0) {
                printWriter2.append(concat).append("lastFailedStatus=").append(C99296Iw.A00(r7.A01));
                PrintWriter append3 = printWriter2.append(" lastFailedTime=");
                long j3 = r7.A05;
                String A0i3 = C18240wQ.A0i(simpleDateFormat, j3);
                StringBuilder A0s3 = C86114wI.A0s(C86104wH.A0A(A0i3) + 21);
                A0s3.append(j3);
                A0s3.append(" ");
                append3.println(C18180wK.A0i(A0i3, A0s3));
            }
        }
    }

    public final boolean DBq() {
        return this.A0E instanceof C129327lh;
    }

    public C129387ln(Context context, Looper looper, C121217Ev r6, C93175l8 r7, C93285lJ r8, C145878lG r9, C110886mR r10, ArrayList arrayList, Map map, Map map2, Lock lock) {
        this.A04 = context;
        this.A0D = lock;
        this.A05 = r6;
        this.A03 = map;
        this.A09 = r10;
        this.A0B = map2;
        this.A06 = r7;
        this.A07 = r8;
        this.A02 = r9;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C129137lM) arrayList.get(i)).A00 = this;
        }
        this.A08 = new AnonymousClass5pt(looper, this);
        this.A0C = lock.newCondition();
        this.A0E = new C129337li(this);
    }

    public final C93345lQ DBe(C93345lQ r2) {
        r2.A06();
        this.A0E.DBW(r2);
        return r2;
    }

    public final C93345lQ DBh(C93345lQ r2) {
        r2.A06();
        return this.A0E.DBY(r2);
    }
}
