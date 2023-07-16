package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import com.instagram.notifications.local.LocalNotificationFetchInventoryJobService;
import com.instagram.service.session.UserSession;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6Tt  reason: invalid class name and case insensitive filesystem */
public final class C102086Tt {
    public static final void A00(Context context, UserSession userSession) {
        boolean z;
        long A03;
        boolean A1Z = AnonymousClass0wJ.A1Z(context, userSession);
        try {
            if (new AnonymousClass7EV(context).A00.areNotificationsEnabled()) {
                AnonymousClass0TJ r7 = AnonymousClass0TJ.A06;
                if (C63803iN.A0E(r7, userSession, 36318419549032836L)) {
                    z = C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36318419548639617L);
                } else {
                    z = C63803iN.A0E(r7, userSession, 36318419548639617L);
                }
                if (z) {
                    Object systemService = context.getSystemService("jobscheduler");
                    String A00 = C28174Ezk.A00(13);
                    C04220Ms.A0C(systemService, A00);
                    List<JobInfo> allPendingJobs = ((JobScheduler) systemService).getAllPendingJobs();
                    C04220Ms.A06(allPendingJobs);
                    for (JobInfo id : allPendingJobs) {
                        if (id.getId() == 1223781371) {
                            return;
                        }
                    }
                    Object systemService2 = context.getSystemService("jobscheduler");
                    C04220Ms.A0C(systemService2, A00);
                    JobScheduler jobScheduler = (JobScheduler) systemService2;
                    PersistableBundle persistableBundle = new PersistableBundle();
                    C86134wK.A15(persistableBundle, userSession);
                    JobInfo.Builder builder = new JobInfo.Builder(1223781371, new ComponentName(context, LocalNotificationFetchInventoryJobService.class));
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    JobInfo.Builder backoffCriteria = builder.setBackoffCriteria(C86154wM.A08(timeUnit), A1Z ? 1 : 0);
                    if (C63803iN.A0E(r7, userSession, 36318419549032836L)) {
                        A03 = C63803iN.A03(AnonymousClass0TJ.A05, userSession, 36599894525480251L);
                    } else {
                        A03 = C63803iN.A03(r7, userSession, 36599894525480251L);
                    }
                    if (jobScheduler.schedule(backoffCriteria.setPeriodic(timeUnit.toMillis(Long.valueOf(A03).longValue())).setPersisted(A1Z).setRequiredNetworkType(A1Z).setExtras(persistableBundle).build()) != A1Z) {
                        C10450iM.A03("LocalNotification", "fetch job schedule failed");
                    }
                }
            }
        } catch (Exception e) {
            C10450iM.A03("LocalNotification", C18230wP.A0t("fetch job schedule failed with exception: ", e));
        }
    }
}
