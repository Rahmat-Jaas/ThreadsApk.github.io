package com.facebook.common.jobscheduler.compat;

import X.AnonymousClass0FX;
import X.AnonymousClass0LU;
import X.AnonymousClass758;
import X.C113256r0;
import X.C1196976m;
import X.C125667dj;
import X.C14030oh;
import X.C18210wN;
import X.C89415Eu;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;

public abstract class JobServiceCompat extends JobService {
    public C113256r0 A00() {
        return new C89415Eu();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int A04 = C14030oh.A04(-1247149497);
        A00();
        C14030oh.A0B(925118995, A04);
        return 2;
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        PersistableBundle extras = jobParameters.getExtras();
        boolean z = false;
        if (extras == null) {
            AnonymousClass0LU.A0B("JobServiceCompat", "Job with no build ID, cancelling job");
        } else {
            if (AnonymousClass0FX.A01() == extras.getInt("__VERSION_CODE", 0)) {
                z = true;
            }
        }
        boolean z2 = false;
        if (!z) {
            jobParameters.getJobId();
        } else {
            int jobId = jobParameters.getJobId();
            try {
                C1196976m A00 = C1196976m.A00(this, 0);
                Class<?> cls = getClass();
                Class cls2 = (Class) A00.A02.get(jobId);
                if (cls2 != null && cls2.equals(cls)) {
                    z2 = A00().A01(new Bundle(jobParameters.getExtras()), new C125667dj(jobParameters, this, this), jobParameters.getJobId());
                    if (!z2) {
                        AnonymousClass758 A002 = AnonymousClass758.A00(this);
                        synchronized (A002) {
                            A002.A00.put(jobParameters.getJobId(), false);
                        }
                        return z2;
                    }
                }
            } catch (RuntimeException unused) {
                AnonymousClass0LU.A0N("JobServiceCompat", "Runtime error getting service info, cancelling: %d", C18210wN.A1X(jobId));
            }
            ((JobScheduler) getSystemService("jobscheduler")).cancel(jobParameters.getJobId());
            return false;
        }
        return z2;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        boolean A00 = A00().A00(jobParameters.getJobId());
        if (A00) {
            return A00;
        }
        AnonymousClass758 A002 = AnonymousClass758.A00(this);
        synchronized (A002) {
            A002.A00.put(jobParameters.getJobId(), false);
        }
        return A00;
    }
}
