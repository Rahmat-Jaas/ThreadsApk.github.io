package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;

/* renamed from: X.04s  reason: invalid class name and case insensitive filesystem */
public final class C010304s extends AnonymousClass01F {
    public final JobInfo A00;
    public final JobScheduler A01;

    public C010304s(ComponentName componentName, Context context, int i) {
        super(componentName);
        A00(i);
        this.A00 = new JobInfo.Builder(i, this.A02).setOverrideDeadline(0).build();
        this.A01 = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
    }
}
