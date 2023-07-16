package com.instagram.publisher;

import X.AnonymousClass0RA;
import X.C32330HGg;
import X.C32337HGt;
import android.app.job.JobParameters;
import android.app.job.JobService;
import java.util.concurrent.TimeUnit;

public class HeartbeatJobService extends JobService {
    public static final long A00 = TimeUnit.MINUTES.toMillis(15);

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        if (AnonymousClass0RA.A0C.A08(jobParameters.getExtras()) == null) {
            return false;
        }
        C32337HGt.A01().A06(new C32330HGg(jobParameters, this));
        return true;
    }
}
