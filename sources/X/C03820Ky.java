package X;

import android.app.job.JobParameters;
import android.app.job.JobService;
import com.facebook.analytics2.logger.LollipopUpload;

/* renamed from: X.0Ky  reason: invalid class name and case insensitive filesystem */
public final class C03820Ky implements AnonymousClass0CK {
    public final JobParameters A00;
    public final AnonymousClass0CW A01;
    public final /* synthetic */ LollipopUpload A02;

    public C03820Ky(JobParameters jobParameters, LollipopUpload lollipopUpload, AnonymousClass0CW r3) {
        this.A02 = lollipopUpload;
        this.A00 = jobParameters;
        this.A01 = r3;
    }

    public final void CV4(boolean z) {
        JobParameters jobParameters = this.A00;
        jobParameters.getJobId();
        ((JobService) this.A01).jobFinished(jobParameters, z);
    }
}
