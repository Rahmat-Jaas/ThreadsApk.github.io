package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import com.instagram.barcelona.R;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.service.session.UserSession;
import java.util.Iterator;

/* renamed from: X.7sR  reason: invalid class name and case insensitive filesystem */
public final class C131587sR implements C10390iG, AnonymousClass0i4 {
    public UserSession A00;
    public final Context A01;

    public final void onSessionWillEnd() {
        new AnonymousClass7ED(this.A01.getApplicationContext()).A02(R.id.sim_info_job_service);
        C691847d.A03(this);
    }

    public C131587sR(Context context, UserSession userSession) {
        this.A01 = context;
        this.A00 = userSession;
    }

    public final void onAppBackgrounded() {
        C14030oh.A0A(995437406, C14030oh.A03(152629220));
    }

    public final void onAppForegrounded() {
        int A03 = C14030oh.A03(-755033319);
        long A032 = C63803iN.A03(AnonymousClass0TJ.A05, this.A00, 36595556608378903L);
        if (A032 != -1) {
            Context context = this.A01;
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            if (jobScheduler != null) {
                Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().getId() == R.id.sim_info_job_service) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            long j = A032 * StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS;
            C89425Ew r5 = new C89425Ew();
            r5.A00.putInt("__VERSION_CODE", AnonymousClass0FX.A01());
            AnonymousClass7ED.A01(new AnonymousClass7ED(context.getApplicationContext()), r5, R.id.sim_info_job_service, 0, -1, j);
        }
        C14030oh.A0A(286910604, A03);
    }
}
