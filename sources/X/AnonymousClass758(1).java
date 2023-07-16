package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.util.SparseBooleanArray;
import java.util.List;

/* renamed from: X.758  reason: invalid class name */
public final class AnonymousClass758 {
    public static AnonymousClass758 A01;
    public final SparseBooleanArray A00 = new SparseBooleanArray();

    public static synchronized AnonymousClass758 A00(Context context) {
        AnonymousClass758 r1;
        synchronized (AnonymousClass758.class) {
            r1 = A01;
            if (r1 == null) {
                r1 = new AnonymousClass758(context.getApplicationContext());
                A01 = r1;
            }
        }
        return r1;
    }

    public AnonymousClass758(Context context) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
            if (allPendingJobs != null) {
                for (JobInfo id : allPendingJobs) {
                    this.A00.put(id.getId(), true);
                }
                return;
            }
            return;
        }
        AnonymousClass0LU.A0D("LollipopJobTracker", "jobScheduler was null");
    }
}
