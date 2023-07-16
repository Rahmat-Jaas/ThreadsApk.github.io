package com.facebook.analytics2.logger.service;

import X.AnonymousClass0BI;
import X.AnonymousClass0CO;
import X.AnonymousClass0CP;
import X.AnonymousClass0CW;
import X.AnonymousClass0FX;
import X.AnonymousClass0LU;
import X.AnonymousClass0SJ;
import X.C02570By;
import X.C03060Ee;
import X.C03820Ky;
import X.C14030oh;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.facebook.analytics2.logger.LollipopUpload;

public class LollipopUploadSafeService extends JobService implements AnonymousClass0CW {
    public LollipopUpload A00;

    public final boolean onStartJob(JobParameters jobParameters) {
        LollipopUpload lollipopUpload = this.A00;
        if (lollipopUpload == null) {
            return false;
        }
        PersistableBundle extras = jobParameters.getExtras();
        if (extras == null) {
            AnonymousClass0LU.A0B("PostLolliopUploadService", "Job with no build ID, cancelling job");
        } else {
            try {
                if (AnonymousClass0FX.A01() == extras.getInt("__VERSION_CODE", 0)) {
                    try {
                        AnonymousClass0CP r5 = lollipopUpload.A00;
                        AnonymousClass0SJ.A00(r5);
                        int jobId = jobParameters.getJobId();
                        r5.A04(new C02570By(new C03060Ee(new Bundle(jobParameters.getExtras()))), new C03820Ky(jobParameters, lollipopUpload, this), jobParameters.getExtras().getString("action"), jobId);
                        return true;
                    } catch (AnonymousClass0BI e) {
                        AnonymousClass0LU.A0G("PostLolliopUploadService", "Misunderstood job service extras: %s", e);
                        return false;
                    }
                }
            } catch (Exception e2) {
                AnonymousClass0LU.A0F("PostLolliopUploadService", "Corrupt bundle, cancelling job", e2);
            }
        }
        jobParameters.getJobId();
        return false;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        AnonymousClass0CP r1;
        LollipopUpload lollipopUpload = this.A00;
        if (lollipopUpload == null || (r1 = lollipopUpload.A00) == null) {
            return true;
        }
        r1.A03(jobParameters.getJobId());
        return true;
    }

    public final void onCreate() {
        int A04 = C14030oh.A04(-1174714972);
        try {
            LollipopUpload lollipopUpload = (LollipopUpload) Class.forName("com.facebook.analytics2.logger.LollipopUpload").newInstance();
            this.A00 = lollipopUpload;
            lollipopUpload.A00 = AnonymousClass0CP.A00(this);
        } catch (Exception unused) {
        }
        C14030oh.A0B(-1140422133, A04);
    }

    public final void onDestroy() {
        int A04 = C14030oh.A04(2115989313);
        super.onDestroy();
        LollipopUpload lollipopUpload = this.A00;
        if (lollipopUpload != null) {
            lollipopUpload.A00 = null;
        }
        this.A00 = null;
        C14030oh.A0B(-1362703904, A04);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int A02;
        int i3;
        int A04 = C14030oh.A04(-1465034373);
        LollipopUpload lollipopUpload = this.A00;
        if (lollipopUpload == null) {
            A02 = 1;
            i3 = -2147350927;
        } else {
            AnonymousClass0CP r1 = lollipopUpload.A00;
            AnonymousClass0SJ.A00(r1);
            A02 = r1.A02(intent, new AnonymousClass0CO(this, i2));
            i3 = -742844753;
        }
        C14030oh.A0B(i3, A04);
        return A02;
    }
}
