package com.instagram.publisher;

import X.AnonymousClass0RA;
import X.C32337HGt;
import android.app.job.JobParameters;
import android.app.job.JobService;
import com.facebook.redex.IDxIListenerShape261S0200000_5_I2;

public class TransactionRevivalJobService extends JobService {
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        jobParameters.getExtras().getLong("targetTimeMs", Long.MAX_VALUE);
        if (AnonymousClass0RA.A0C.A08(jobParameters.getExtras()) == null) {
            return false;
        }
        C32337HGt.A01().A06(new IDxIListenerShape261S0200000_5_I2(2, jobParameters, this));
        return true;
    }
}
