package X;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;

/* renamed from: X.05G  reason: invalid class name */
public final class AnonymousClass05G extends JobServiceEngine implements AnonymousClass01D {
    public JobParameters A00;
    public final AnonymousClass01G A01;
    public final Object A02 = new Object();

    public final boolean onStartJob(JobParameters jobParameters) {
        this.A00 = jobParameters;
        this.A01.ensureProcessorRunningLocked(false);
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        boolean doStopCurrentWork = this.A01.doStopCurrentWork();
        synchronized (this.A02) {
            this.A00 = null;
        }
        return doStopCurrentWork;
    }

    public AnonymousClass05G(AnonymousClass01G r2) {
        super(r2);
        this.A01 = r2;
    }
}
