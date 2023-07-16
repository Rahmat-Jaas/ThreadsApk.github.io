package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7MH  reason: invalid class name */
public final class AnonymousClass7MH implements Handler.Callback {
    public boolean A00 = false;
    public final Handler A01;
    public final C143828hN A02;
    public final Object A03 = C86144wL.A0d();
    public final ArrayList A04 = AnonymousClass0wJ.A0v();
    public final ArrayList A05 = AnonymousClass0wJ.A0v();
    public final ArrayList A06 = AnonymousClass0wJ.A0v();
    public final AtomicInteger A07 = new AtomicInteger(0);
    public volatile boolean A08 = false;

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            C145398kR r2 = (C145398kR) message.obj;
            synchronized (this.A03) {
                if (this.A08 && this.A02.isConnected() && this.A05.contains(r2)) {
                    r2.Brh((Bundle) null);
                }
            }
            return true;
        }
        StringBuilder A0s = C86114wI.A0s(45);
        A0s.append("Don't know how to handle message: ");
        A0s.append(i);
        Log.wtf("GmsClientEvents", A0s.toString(), new Exception());
        return false;
    }

    public AnonymousClass7MH(Looper looper, C143828hN r4) {
        this.A02 = r4;
        this.A01 = new C86854zE(looper, this);
    }

    public final void A00(C148648rc r6) {
        C13320nQ.A01(r6);
        synchronized (this.A03) {
            ArrayList arrayList = this.A05;
            if (arrayList.contains(r6)) {
                String valueOf = String.valueOf(r6);
                StringBuilder A0s = C86114wI.A0s(C86104wH.A0A(valueOf) + 62);
                A0s.append("registerConnectionCallbacks(): listener ");
                A0s.append(valueOf);
                Log.w("GmsClientEvents", C18180wK.A0i(" is already registered", A0s));
            } else {
                arrayList.add(r6);
            }
        }
        if (this.A02.isConnected()) {
            C86124wJ.A1E(this.A01, r6, 1);
        }
    }

    public final void A01(C148658rd r6) {
        C13320nQ.A01(r6);
        synchronized (this.A03) {
            ArrayList arrayList = this.A06;
            if (arrayList.contains(r6)) {
                String valueOf = String.valueOf(r6);
                StringBuilder A0s = C86114wI.A0s(C86104wH.A0A(valueOf) + 67);
                A0s.append("registerConnectionFailedListener(): listener ");
                A0s.append(valueOf);
                Log.w("GmsClientEvents", C18180wK.A0i(" is already registered", A0s));
            } else {
                arrayList.add(r6);
            }
        }
    }
}
