package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;

/* renamed from: X.7ED  reason: invalid class name */
public final class AnonymousClass7ED {
    public C1196976m A00;
    public final JobScheduler A01;
    public final Context A02;
    public final Context A03;

    private Class A00(int i) {
        C1196976m r0;
        C1196976m r02;
        try {
            synchronized (this) {
                r0 = this.A00;
                if (r0 == null) {
                    r0 = C1196976m.A00(this.A02, 0);
                    this.A00 = r0;
                }
            }
            Class cls = (Class) r0.A02.get(i);
            if (cls != null) {
                return cls;
            }
            synchronized (this) {
                r02 = this.A00;
                if (r02 == null) {
                    r02 = C1196976m.A00(this.A02, 0);
                    this.A00 = r02;
                }
            }
            boolean z = r02.A00;
            StringBuilder A0s = C18190wL.A0s("jobId: ");
            A0s.append(i);
            A0s.append(" was not found. buildOutOfSync: ");
            A0s.append(z);
            throw C18250wR.A0V(A0s.toString());
        } catch (RuntimeException e) {
            AnonymousClass0LU.A0E("JobSchedulerCompat", "getServiceInfoParser Runtime Exception", e);
            return null;
        }
    }

    public static void A01(AnonymousClass7ED r8, AnonymousClass6GY r9, int i, int i2, long j, long j2) {
        Class A002 = r8.A00(i);
        if (A002 != null) {
            Context context = r8.A03;
            AnonymousClass758 A003 = AnonymousClass758.A00(context);
            synchronized (A003) {
                ComponentName componentName = new ComponentName(context, A002);
                try {
                    JobScheduler jobScheduler = r8.A01;
                    JobInfo.Builder builder = new JobInfo.Builder(i, componentName);
                    if (j > -1) {
                        builder.setMinimumLatency(j);
                    }
                    if (j2 > -1) {
                        builder.setPeriodic(j2);
                    }
                    if (i2 != 0) {
                        builder.setRequiredNetworkType(1);
                    } else {
                        builder.setRequiredNetworkType(0);
                    }
                    builder.setExtras(((C89425Ew) r9).A00);
                    if (jobScheduler.schedule(builder.build()) > 0) {
                        A003.A00.put(i, true);
                    }
                } catch (IllegalArgumentException e) {
                    AnonymousClass6GX.A00(componentName, context, e);
                } catch (NullPointerException e2) {
                    if (!Build.MANUFACTURER.equalsIgnoreCase("OPPO") && !Build.BRAND.equalsIgnoreCase("OPPO")) {
                        throw e2;
                    }
                }
            }
        }
    }

    public AnonymousClass7ED(Context context) {
        this.A02 = context;
        this.A03 = context;
        this.A01 = (JobScheduler) context.getSystemService("jobscheduler");
    }

    public final void A02(int i) {
        if (A00(i) != null) {
            AnonymousClass758 A002 = AnonymousClass758.A00(this.A03);
            synchronized (A002) {
                this.A01.cancel(i);
                A002.A00.put(i, false);
            }
        }
    }
}
