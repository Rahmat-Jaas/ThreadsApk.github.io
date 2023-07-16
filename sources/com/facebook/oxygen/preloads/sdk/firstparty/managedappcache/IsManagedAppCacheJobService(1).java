package com.facebook.oxygen.preloads.sdk.firstparty.managedappcache;

import X.C13820oM;
import X.C14030oh;
import X.C64473kX;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Handler;
import android.os.HandlerThread;

public class IsManagedAppCacheJobService extends JobService {
    public static HandlerThread A02;
    public Handler A00;
    public volatile boolean A01;

    public final boolean onStartJob(JobParameters jobParameters) {
        this.A01 = false;
        Handler handler = this.A00;
        handler.sendMessage(handler.obtainMessage(1, jobParameters));
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        this.A01 = true;
        return true;
    }

    public final void onCreate() {
        HandlerThread handlerThread;
        int A04 = C14030oh.A04(1923869393);
        synchronized (IsManagedAppCacheJobService.class) {
            if (A02 == null) {
                HandlerThread handlerThread2 = new HandlerThread("th-IsManagedAppCacheJobSvc");
                C13820oM.A00(handlerThread2);
                A02 = handlerThread2;
                handlerThread2.start();
            }
            handlerThread = A02;
        }
        this.A00 = new Handler(handlerThread.getLooper(), new C64473kX(this));
        C14030oh.A0B(2020117912, A04);
    }
}
