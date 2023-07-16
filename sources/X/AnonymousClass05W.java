package X;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Intent;

/* renamed from: X.05W  reason: invalid class name */
public final class AnonymousClass05W implements AnonymousClass01E {
    public final JobWorkItem A00;
    public final /* synthetic */ AnonymousClass05G A01;

    public AnonymousClass05W(JobWorkItem jobWorkItem, AnonymousClass05G r2) {
        this.A01 = r2;
        this.A00 = jobWorkItem;
    }

    public final void ADk() {
        AnonymousClass05G r0 = this.A01;
        synchronized (r0.A02) {
            JobParameters jobParameters = r0.A00;
            if (jobParameters != null) {
                jobParameters.completeWork(this.A00);
            }
        }
    }

    public final Intent getIntent() {
        return this.A00.getIntent();
    }
}
