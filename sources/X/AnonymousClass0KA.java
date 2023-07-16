package X;

import android.app.job.JobParameters;
import com.facebook.analytics2.logger.LollipopUploadService;

/* renamed from: X.0KA  reason: invalid class name */
public final class AnonymousClass0KA implements AnonymousClass0CK {
    public final JobParameters A00;
    public final /* synthetic */ LollipopUploadService A01;

    public AnonymousClass0KA(JobParameters jobParameters, LollipopUploadService lollipopUploadService) {
        this.A01 = lollipopUploadService;
        this.A00 = jobParameters;
    }

    public final void CV4(boolean z) {
        JobParameters jobParameters = this.A00;
        jobParameters.getJobId();
        this.A01.jobFinished(jobParameters, z);
    }
}
