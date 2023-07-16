package com.facebook.analytics2.logger;

import X.AnonymousClass0BI;
import X.AnonymousClass0CO;
import X.AnonymousClass0CP;
import X.AnonymousClass0FX;
import X.AnonymousClass0KA;
import X.AnonymousClass0LU;
import X.AnonymousClass0SJ;
import X.C02570By;
import X.C03060Ee;
import X.C14030oh;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;

public class LollipopUploadService extends JobService {
    public AnonymousClass0CP A00;

    public final boolean onStopJob(JobParameters jobParameters) {
        AnonymousClass0CP r1 = this.A00;
        if (r1 == null) {
            return true;
        }
        r1.A03(jobParameters.getJobId());
        return true;
    }

    public final void onCreate() {
        int A04 = C14030oh.A04(1066597169);
        this.A00 = AnonymousClass0CP.A00(this);
        C14030oh.A0B(837422433, A04);
    }

    public final void onDestroy() {
        int A04 = C14030oh.A04(-174633328);
        super.onDestroy();
        this.A00 = null;
        C14030oh.A0B(389850741, A04);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int A04 = C14030oh.A04(970169453);
        AnonymousClass0CP r1 = this.A00;
        AnonymousClass0SJ.A00(r1);
        int A02 = r1.A02(intent, new AnonymousClass0CO(this, i2));
        C14030oh.A0B(1871451629, A04);
        return A02;
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        PersistableBundle extras = jobParameters.getExtras();
        boolean z = false;
        if (extras == null) {
            AnonymousClass0LU.A0B("PostLolliopUploadService", "Job with no build ID, cancelling job");
        } else {
            try {
                if (AnonymousClass0FX.A01() == extras.getInt("__VERSION_CODE", 0)) {
                    z = true;
                }
            } catch (Exception e) {
                AnonymousClass0LU.A0F("PostLolliopUploadService", "Corrupt bundle, cancelling job", e);
            }
        }
        if (!z) {
            jobParameters.getJobId();
            return false;
        }
        try {
            AnonymousClass0CP r5 = this.A00;
            AnonymousClass0SJ.A00(r5);
            int jobId = jobParameters.getJobId();
            r5.A04(new C02570By(new C03060Ee(new Bundle(jobParameters.getExtras()))), new AnonymousClass0KA(jobParameters, this), jobParameters.getExtras().getString("action"), jobId);
            return true;
        } catch (AnonymousClass0BI e2) {
            AnonymousClass0LU.A0G("PostLolliopUploadService", "Misunderstood job service extras: %s", e2);
            return false;
        }
    }
}
