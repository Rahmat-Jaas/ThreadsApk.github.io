package X;

import android.app.job.JobParameters;
import android.content.Context;
import com.facebook.common.jobscheduler.compat.JobServiceCompat;

/* renamed from: X.7dj  reason: invalid class name and case insensitive filesystem */
public final class C125667dj implements C143288gT {
    public final JobParameters A00;
    public final Context A01;
    public final /* synthetic */ JobServiceCompat A02;

    public C125667dj(JobParameters jobParameters, Context context, JobServiceCompat jobServiceCompat) {
        this.A02 = jobServiceCompat;
        this.A00 = jobParameters;
        this.A01 = context;
    }

    public final void C3z(boolean z) {
        JobServiceCompat jobServiceCompat = this.A02;
        JobParameters jobParameters = this.A00;
        jobServiceCompat.jobFinished(jobParameters, z);
        if (!z) {
            AnonymousClass758 A002 = AnonymousClass758.A00(this.A01);
            synchronized (A002) {
                A002.A00.put(jobParameters.getJobId(), false);
            }
        }
    }
}
