package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import com.instagram.barcelona.R;
import com.instagram.pendingmedia.service.impl.UploadRetryJobService;
import com.instagram.service.session.UserSession;

/* renamed from: X.78T  reason: invalid class name */
public final class AnonymousClass78T {
    public static final AnonymousClass78T A00 = new AnonymousClass78T();

    public final void A01(Context context, UserSession userSession, long j) {
        Object systemService = context.getSystemService("jobscheduler");
        C04220Ms.A0C(systemService, C28174Ezk.A00(13));
        ComponentName componentName = new ComponentName(context, UploadRetryJobService.class);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("ACTION", "ACTION_CONNECTED_ALARM");
        C86134wK.A15(persistableBundle, userSession);
        ((JobScheduler) systemService).schedule(new JobInfo.Builder(R.id.upload_retry_service_scheduled_at, componentName).setRequiredNetworkType(1).setMinimumLatency(j - System.currentTimeMillis()).setExtras(persistableBundle).build());
    }

    public final void A00(Context context, UserSession userSession) {
        Object systemService = context.getSystemService("jobscheduler");
        C04220Ms.A0C(systemService, C28174Ezk.A00(13));
        ComponentName componentName = new ComponentName(context, UploadRetryJobService.class);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("ACTION", "ACTION_CONNECTED_ALARM");
        C86134wK.A15(persistableBundle, userSession);
        ((JobScheduler) systemService).schedule(new JobInfo.Builder(R.id.upload_retry_service_scheduled_in, componentName).setRequiredNetworkType(1).setMinimumLatency(180000).setExtras(persistableBundle).build());
    }
}
