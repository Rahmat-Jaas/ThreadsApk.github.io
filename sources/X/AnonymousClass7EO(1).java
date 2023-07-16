package X;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7EO  reason: invalid class name */
public final class AnonymousClass7EO {
    public static final Map A0D = AnonymousClass0wJ.A0y();
    public ServiceConnection A00;
    public IInterface A01;
    public boolean A02;
    public final Context A03;
    public final Intent A04;
    public final IBinder.DeathRecipient A05 = new AnonymousClass7ML(this);
    public final AnonymousClass77Q A06;
    public final Object A07 = C86144wL.A0d();
    public final WeakReference A08;
    public final List A09 = AnonymousClass0wJ.A0v();
    public final Set A0A = C18200wM.A0u();
    public final AtomicInteger A0B = C86144wL.A11();
    public final AnonymousClass73N A0C;

    public static final void A00(AnonymousClass7EO r5) {
        synchronized (r5.A07) {
            Set<C113426rN> set = r5.A0A;
            for (C113426rN A002 : set) {
                A002.A00(C86144wL.A0H("IntegrityService"));
            }
            set.clear();
        }
    }

    public final Handler A01() {
        Handler handler;
        Map map = A0D;
        synchronized (map) {
            if (!map.containsKey("IntegrityService")) {
                HandlerThread handlerThread = new HandlerThread("IntegrityService", 10);
                handlerThread.start();
                map.put("IntegrityService", new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get("IntegrityService");
        }
        return handler;
    }

    public AnonymousClass7EO(Context context, Intent intent, AnonymousClass73N r4, AnonymousClass77Q r5) {
        this.A03 = context;
        this.A06 = r5;
        this.A04 = intent;
        this.A0C = r4;
        this.A08 = C86144wL.A0w((Object) null);
    }
}
