package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.PersistableBundle;
import com.facebook.analytics2.logger.LollipopUploadService;
import java.util.List;

/* renamed from: X.0Kv  reason: invalid class name */
public final class AnonymousClass0Kv extends AnonymousClass0CD {
    public ComponentName A00;
    public final JobScheduler A01;
    public final Context A02;

    public final long A01(int i) {
        JobScheduler jobScheduler = this.A01;
        if (jobScheduler != null) {
            try {
                List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
                if (allPendingJobs != null) {
                    for (JobInfo next : allPendingJobs) {
                        if (next.getId() == i) {
                            return next.getMinLatencyMillis();
                        }
                    }
                }
            } catch (NullPointerException e) {
                AnonymousClass0LU.A0J("LollipopUploadScheduler", "Scheduler binder is null. Skipping scheduling.", e);
                return Long.MAX_VALUE;
            }
        }
        return Long.MAX_VALUE;
    }

    public final void A02(C02570By r8, String str, int i, long j, long j2) {
        ComponentName componentName;
        JobScheduler jobScheduler = this.A01;
        if (jobScheduler != null) {
            componentName = this.A00;
            C03810Kw r5 = new C03810Kw(new PersistableBundle());
            r5.putString("action", str);
            r5.putInt("__VERSION_CODE", AnonymousClass0FX.A01());
            try {
                jobScheduler.schedule(new JobInfo.Builder(i, componentName).setMinimumLatency(j).setOverrideDeadline(j2).setExtras((PersistableBundle) r8.A00(r5)).setRequiredNetworkType(1).setPersisted(false).build());
                return;
            } catch (IllegalArgumentException e) {
                PackageManager packageManager = this.A02.getPackageManager();
                int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
                if (!(componentEnabledSetting == 1 || componentEnabledSetting == 2 || componentEnabledSetting == 3 || componentEnabledSetting == 4)) {
                    packageManager.getServiceInfo(componentName, 512).isEnabled();
                }
            } catch (NullPointerException e2) {
                AnonymousClass0LU.A0H("LollipopUploadScheduler", "Nullpointer exception encountered while scheduling job", e2);
                return;
            } catch (Throwable th) {
                AnonymousClass0LU.A0E("LollipopUploadScheduler", "Error getting serviceInfo from PackageManager", th);
            }
        } else {
            return;
        }
        AnonymousClass0LU.A0L("LollipopUploadScheduler", "The Service is disabled, cannot schedule job for %s", e, componentName);
    }

    public AnonymousClass0Kv(Context context) {
        this.A02 = context;
        this.A01 = (JobScheduler) context.getSystemService("jobscheduler");
        this.A00 = new ComponentName(context, LollipopUploadService.class);
    }
}
