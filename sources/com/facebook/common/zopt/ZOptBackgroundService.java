package com.facebook.common.zopt;

import X.C1374788s;
import X.C18230wP;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.PersistableBundle;
import java.util.concurrent.atomic.AtomicBoolean;

public class ZOptBackgroundService extends JobService {
    public final AtomicBoolean A00 = C18230wP.A0w();

    public final boolean onStartJob(JobParameters jobParameters) {
        this.A00.set(false);
        PersistableBundle extras = jobParameters.getExtras();
        extras.getInt("profile_delta_size", 0);
        extras.getInt("profile_delta_pct", 0);
        extras.getBoolean("skip_quickening", false);
        new C1374788s(jobParameters, this, this).start();
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        this.A00.set(true);
        return false;
    }
}
