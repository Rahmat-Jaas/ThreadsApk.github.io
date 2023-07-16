package X;

import android.content.Context;
import com.facebook.wellbeing.timeinapp.jnibindings.TimeInAppControllerWrapper;
import com.facebook.xanalytics.XAnalyticsHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.4T8  reason: invalid class name */
public final class AnonymousClass4T8 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass376 A02;
    public final /* synthetic */ XAnalyticsHolder A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ ScheduledExecutorService A05;

    public AnonymousClass4T8(Context context, AnonymousClass376 r2, XAnalyticsHolder xAnalyticsHolder, String str, ScheduledExecutorService scheduledExecutorService, int i) {
        this.A02 = r2;
        this.A04 = str;
        this.A05 = scheduledExecutorService;
        this.A01 = context;
        this.A03 = xAnalyticsHolder;
        this.A00 = i;
    }

    public final void run() {
        TimeInAppControllerWrapper timeInAppControllerWrapper;
        AnonymousClass376 r4 = this.A02;
        TimeInAppControllerWrapper timeInAppControllerWrapper2 = new TimeInAppControllerWrapper();
        synchronized (r4) {
            r4.A00 = timeInAppControllerWrapper2;
            ArrayList arrayList = r4.A01;
            if (arrayList.isEmpty()) {
                timeInAppControllerWrapper2.dispatch(AnonymousClass22G.BACKGROUND);
            } else {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    r4.A00.dispatch((AnonymousClass22G) it.next());
                }
                arrayList.clear();
            }
            timeInAppControllerWrapper = r4.A00;
        }
        if (timeInAppControllerWrapper != null) {
            timeInAppControllerWrapper.initController(this.A05, this.A01.getDatabasePath(AnonymousClass00U.A0V("time_in_app_", this.A04, ".db")).getPath(), this.A03, 8, this.A00);
        }
    }
}
