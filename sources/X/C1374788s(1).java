package X;

import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.DeadObjectException;
import com.facebook.common.zopt.ZOptBackgroundService;

/* renamed from: X.88s  reason: invalid class name and case insensitive filesystem */
public final class C1374788s extends Thread {
    public final /* synthetic */ JobParameters A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ ZOptBackgroundService A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1374788s(JobParameters jobParameters, Context context, ZOptBackgroundService zOptBackgroundService) {
        super("ZOptBackgroundService_optimize");
        this.A02 = zOptBackgroundService;
        this.A01 = context;
        this.A00 = jobParameters;
    }

    public final void run() {
        Context context = this.A01;
        synchronized (C98576Gc.class) {
        }
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            try {
                jobScheduler.cancel(-87105848);
            } catch (SecurityException e) {
                AnonymousClass0LU.A0G("ZOptBackgroundService", "Failure to cancel ZOptBackgroundService", e);
            } catch (RuntimeException e2) {
                if (e2.getCause() instanceof DeadObjectException) {
                    AnonymousClass0LU.A0G("ZOptBackgroundService", "Failure to cancel ZOptBackgroundService", e2);
                } else {
                    throw e2;
                }
            }
        }
        this.A02.jobFinished(this.A00, false);
    }
}
