package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import com.instagram.publisher.HeartbeatJobService;
import com.instagram.publisher.TransactionRevivalJobService;
import com.instagram.service.session.UserSession;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7wZ  reason: invalid class name and case insensitive filesystem */
public final class C133857wZ implements C33673HsK {
    public static final Map A02;
    public final JobScheduler A00;
    public final String A01;

    private JobInfo A00(UserSession userSession, int i) {
        List<JobInfo> allPendingJobs = this.A00.getAllPendingJobs();
        if (allPendingJobs != null) {
            for (JobInfo next : allPendingJobs) {
                String string = next.getExtras().getString("IgSessionManager.SESSION_TOKEN_KEY");
                if (next.getId() == i && userSession.token.equals(string)) {
                    return next;
                }
            }
        }
        return null;
    }

    public final void Cg6(C134787yN r8, UserSession userSession) {
        Set set = r8.A02;
        Number A0j = C86124wJ.A0j(set, A02);
        if (A0j != null) {
            int intValue = A0j.intValue();
            long j = r8.A00;
            JobInfo A002 = A00(userSession, intValue);
            if (A002 == null || A002.getExtras().getLong("targetTimeMs", 2147483647L) >= j) {
                JobInfo.Builder builder = new JobInfo.Builder(intValue, new ComponentName(this.A01, TransactionRevivalJobService.class.getName()));
                long currentTimeMillis = j - System.currentTimeMillis();
                if (currentTimeMillis < 0) {
                    currentTimeMillis = 0;
                }
                builder.setMinimumLatency(currentTimeMillis);
                PersistableBundle persistableBundle = new PersistableBundle();
                C86134wK.A15(persistableBundle, userSession);
                builder.setExtras(persistableBundle);
                switch (intValue) {
                    case 51500:
                        break;
                    case 51501:
                        builder.setRequiredNetworkType(1);
                        break;
                    default:
                        throw C18250wR.A0V(AnonymousClass00U.A0J("Unknown job id: ", intValue));
                }
                this.A00.schedule(builder.build());
                return;
            }
            return;
        }
        throw C18250wR.A0V(AnonymousClass0wJ.A0t("Cannot schedule job for required conditions: ", set));
    }

    static {
        HashMap A0y = AnonymousClass0wJ.A0y();
        A02 = A0y;
        C86134wK.A1P(Collections.emptySet(), A0y, 51500);
        C86134wK.A1P(EnumSet.of(C28964Ff5.NETWORK), A0y, 51501);
    }

    public C133857wZ(JobScheduler jobScheduler, Context context) {
        this.A00 = jobScheduler;
        this.A01 = context.getPackageName();
    }

    public final void Clp(UserSession userSession, boolean z) {
        JobInfo A002 = A00(userSession, 51400);
        JobInfo.Builder periodic = new JobInfo.Builder(51400, new ComponentName(this.A01, HeartbeatJobService.class.getName())).setPeriodic(HeartbeatJobService.A00);
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36317496131063602L)) {
            PersistableBundle persistableBundle = new PersistableBundle();
            C86134wK.A15(persistableBundle, userSession);
            periodic.setExtras(persistableBundle);
        }
        JobInfo build = periodic.build();
        if (z) {
            if (A002 == null) {
                this.A00.schedule(build);
                return;
            }
        } else if (A002 == null) {
            return;
        }
        this.A00.cancel(A002.getId());
    }
}
