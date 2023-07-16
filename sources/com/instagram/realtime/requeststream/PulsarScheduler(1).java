package com.instagram.realtime.requeststream;

import X.AnonymousClass0TJ;
import X.AnonymousClass0gE;
import X.AnonymousClass0i4;
import X.C10390iG;
import X.C1362982e;
import X.C14030oh;
import X.C15020qa;
import X.C63803iN;
import X.C691847d;
import X.C86134wK;
import android.content.Context;
import com.facebook.jni.HybridData;
import com.facebook.realtime.requeststream.api.BaseRequestStreamClient;
import com.facebook.xanalytics.XAnalyticsHolder;
import com.instagram.service.session.UserSession;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class PulsarScheduler implements C10390iG, AnonymousClass0i4 {
    public final HybridData mHybridData;
    public ScheduledFuture mPulsarFuture = null;
    public final UserSession mUserSession;

    public static native HybridData initHybrid(BaseRequestStreamClient baseRequestStreamClient, XAnalyticsHolder xAnalyticsHolder);

    /* access modifiers changed from: private */
    public native void startPulsarTest(ScheduledExecutorService scheduledExecutorService, long j);

    public synchronized void onAppBackgrounded() {
        int A03 = C14030oh.A03(437169909);
        ScheduledFuture scheduledFuture = this.mPulsarFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.mPulsarFuture = null;
        }
        C14030oh.A0A(989340488, A03);
    }

    public synchronized void onAppForegrounded() {
        int A03 = C14030oh.A03(1501260326);
        maybeSchedulePulsarTest();
        C14030oh.A0A(-157342698, A03);
    }

    public synchronized void onSessionWillEnd() {
        ScheduledFuture scheduledFuture = this.mPulsarFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.mPulsarFuture = null;
        }
        C691847d.A03(this);
    }

    static {
        C15020qa.A0A("igrequeststream-jni");
    }

    private void maybeSchedulePulsarTest() {
        if (this.mPulsarFuture == null && !C691847d.A05()) {
            long longValue = C63803iN.A07(AnonymousClass0TJ.A05, this.mUserSession, 36594010420282650L).longValue();
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = AnonymousClass0gE.A00().A00;
            this.mPulsarFuture = scheduledThreadPoolExecutor.schedule(new C1362982e(this, scheduledThreadPoolExecutor, longValue), 10, TimeUnit.SECONDS);
        }
    }

    public static void onUserSessionStart(UserSession userSession, Context context, boolean z) {
        PulsarScheduler pulsarScheduler;
        if (!C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36325785417622775L)) {
            Class<PulsarScheduler> cls = PulsarScheduler.class;
            synchronized (cls) {
                pulsarScheduler = (PulsarScheduler) C86134wK.A0f(userSession, cls, 15);
            }
            synchronized (pulsarScheduler) {
                C691847d.A02(pulsarScheduler);
                pulsarScheduler.maybeSchedulePulsarTest();
            }
        }
    }

    public PulsarScheduler(UserSession userSession, BaseRequestStreamClient baseRequestStreamClient, XAnalyticsHolder xAnalyticsHolder) {
        this.mUserSession = userSession;
        this.mHybridData = initHybrid(baseRequestStreamClient, xAnalyticsHolder);
    }
}
