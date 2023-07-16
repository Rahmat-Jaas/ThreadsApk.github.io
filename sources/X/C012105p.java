package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.facebook.rti.common.time.RealtimeSinceBootClock;

/* renamed from: X.05p  reason: invalid class name and case insensitive filesystem */
public final class C012105p extends BroadcastReceiver {
    public final /* synthetic */ RealtimeSinceBootClock A00;
    public final /* synthetic */ C004201y A01;

    public C012105p(RealtimeSinceBootClock realtimeSinceBootClock, C004201y r2) {
        this.A01 = r2;
        this.A00 = realtimeSinceBootClock;
    }

    public final void onReceive(Context context, Intent intent) {
        int i;
        int A012 = C14030oh.A01(-1809977588);
        if (intent == null) {
            i = -1816910882;
        } else if ("android.intent.action.SCREEN_ON".equals(intent.getAction()) || "android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            Boolean valueOf = Boolean.valueOf("android.intent.action.SCREEN_ON".equals(intent.getAction()));
            C004201y r1 = this.A01;
            if (!valueOf.equals(r1.A04.getAndSet(valueOf))) {
                r1.A03.set(SystemClock.elapsedRealtime());
            }
            i = -620312679;
        } else {
            i = 1277524002;
        }
        C14030oh.A0E(i, A012, intent);
    }
}
