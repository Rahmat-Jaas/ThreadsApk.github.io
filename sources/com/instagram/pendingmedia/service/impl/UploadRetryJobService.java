package com.instagram.pendingmedia.service.impl;

import X.AnonymousClass000;
import X.AnonymousClass0RA;
import X.AnonymousClass0RF;
import X.AnonymousClass0RG;
import X.C04220Ms;
import X.C04530Oa;
import X.EAW;
import android.app.job.JobParameters;
import android.app.job.JobService;
import com.instagram.service.session.UserSession;

public final class UploadRetryJobService extends JobService {
    public final boolean onStartJob(JobParameters jobParameters) {
        UserSession A08;
        C04220Ms.A0B(jobParameters, 0);
        if ("ACTION_CONNECTED_ALARM".equals(jobParameters.getExtras().getString("ACTION"))) {
            AnonymousClass0RG r2 = AnonymousClass0RA.A0C;
            C04530Oa r0 = AnonymousClass0RF.A00;
            if (!(r0 == null || !r0.BV5() || (A08 = r2.A08(jobParameters.getExtras())) == null)) {
                EAW.A0I.A01(this, A08, AnonymousClass000.A00(973)).A0D();
            }
        }
        return false;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
