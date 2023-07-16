package X;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7H7  reason: invalid class name */
public final class AnonymousClass7H7 {
    public static HandlerThread A05;
    public static AnonymousClass7H7 A06;
    public static final Object A07 = C86144wL.A0d();
    public final Context A00;
    public final AnonymousClass7Gs A01;
    public final HashMap A02;
    public final AnonymousClass7ME A03;
    public volatile Handler A04;

    public AnonymousClass7H7() {
    }

    public static AnonymousClass7H7 A00(Context context) {
        synchronized (A07) {
            if (A06 == null) {
                A06 = new AnonymousClass7H7(context.getApplicationContext(), context.getMainLooper());
            }
        }
        return A06;
    }

    public final void A01(ServiceConnection serviceConnection, AnonymousClass7Em r7) {
        IllegalStateException illegalStateException;
        HashMap hashMap = this.A02;
        synchronized (hashMap) {
            AnonymousClass7M6 r0 = (AnonymousClass7M6) hashMap.get(r7);
            if (r0 != null) {
                Map map = r0.A05;
                if (map.containsKey(serviceConnection)) {
                    map.remove(serviceConnection);
                    if (map.isEmpty()) {
                        this.A04.sendMessageDelayed(this.A04.obtainMessage(0, r7), 5000);
                    }
                } else {
                    String obj = r7.toString();
                    StringBuilder A0s = C86114wI.A0s(obj.length() + 76);
                    A0s.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    illegalStateException = C18180wK.A0a(C18180wK.A0i(obj, A0s));
                }
            } else {
                String obj2 = r7.toString();
                StringBuilder A0s2 = C86114wI.A0s(obj2.length() + 50);
                A0s2.append("Nonexistent connection status for service config: ");
                illegalStateException = C18180wK.A0a(C18180wK.A0i(obj2, A0s2));
            }
            throw illegalStateException;
        }
    }

    public final boolean A02(ServiceConnection serviceConnection, AnonymousClass7Em r6, String str) {
        boolean z;
        HashMap hashMap = this.A02;
        synchronized (hashMap) {
            AnonymousClass7M6 r2 = (AnonymousClass7M6) hashMap.get(r6);
            if (r2 == null) {
                r2 = new AnonymousClass7M6(r6, this);
                r2.A05.put(serviceConnection, serviceConnection);
                r2.A00(str);
                hashMap.put(r6, r2);
            } else {
                this.A04.removeMessages(0, r6);
                Map map = r2.A05;
                if (!map.containsKey(serviceConnection)) {
                    map.put(serviceConnection, serviceConnection);
                    int i = r2.A00;
                    if (i == 1) {
                        serviceConnection.onServiceConnected(r2.A01, r2.A02);
                    } else if (i == 2) {
                        r2.A00(str);
                    }
                } else {
                    String obj = r6.toString();
                    StringBuilder A0s = C86114wI.A0s(obj.length() + 81);
                    A0s.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    throw C18180wK.A0a(C18180wK.A0i(obj, A0s));
                }
            }
            z = r2.A03;
        }
        return z;
    }

    public AnonymousClass7H7(Context context, Looper looper) {
        this.A02 = AnonymousClass0wJ.A0y();
        AnonymousClass7ME r1 = new AnonymousClass7ME(this);
        this.A03 = r1;
        this.A00 = context.getApplicationContext();
        this.A04 = new C86864zF(looper, r1);
        this.A01 = AnonymousClass7Gs.A00();
    }
}
