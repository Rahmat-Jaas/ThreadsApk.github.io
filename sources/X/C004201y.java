package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.PowerManager;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.01y  reason: invalid class name and case insensitive filesystem */
public final class C004201y {
    public static final IntentFilter A06;
    public final BroadcastReceiver A00;
    public final Context A01;
    public final Handler A02;
    public final AtomicLong A03 = new AtomicLong(-1);
    public final AtomicReference A04 = new AtomicReference((Object) null);
    public final AnonymousClass0OX A05;

    static {
        IntentFilter intentFilter = new IntentFilter();
        A06 = intentFilter;
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.setPriority(999);
    }

    public final boolean A00() {
        Boolean bool = (Boolean) this.A04.get();
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            C09740gb A002 = this.A05.A00(PowerManager.class, "power");
            if (A002.A01()) {
                return ((PowerManager) A002.A00()).isInteractive();
            }
            return false;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    public C004201y(Context context, Handler handler, RealtimeSinceBootClock realtimeSinceBootClock, AnonymousClass0OX r9) {
        this.A01 = context;
        this.A05 = r9;
        this.A02 = handler;
        C012105p r3 = new C012105p(realtimeSinceBootClock, this);
        this.A00 = r3;
        try {
            this.A01.registerReceiver(r3, A06, (String) null, this.A02);
        } catch (Exception e) {
            if (!(e.getCause() instanceof DeadObjectException)) {
                throw e;
            }
        }
    }
}
