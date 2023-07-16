package X;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.os.Handler;
import android.os.Message;
import com.facebook.oxygen.preloads.sdk.firstparty.managedappcache.IsManagedAppCacheJobService;

/* renamed from: X.3kX  reason: invalid class name and case insensitive filesystem */
public final class C64473kX implements Handler.Callback {
    public final /* synthetic */ IsManagedAppCacheJobService A00;

    public C64473kX(IsManagedAppCacheJobService isManagedAppCacheJobService) {
        this.A00 = isManagedAppCacheJobService;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            IsManagedAppCacheJobService isManagedAppCacheJobService = this.A00;
            JobParameters jobParameters = (JobParameters) message.obj;
            while (!isManagedAppCacheJobService.A01) {
                try {
                    JobWorkItem dequeueWork = jobParameters.dequeueWork();
                    if (dequeueWork == null) {
                        break;
                    }
                    AnonymousClass2CN.A00(dequeueWork.getIntent(), isManagedAppCacheJobService);
                    if (!isManagedAppCacheJobService.A01) {
                        jobParameters.completeWork(dequeueWork);
                    }
                } catch (SecurityException unused) {
                }
            }
            return true;
        }
        throw C18190wL.A0a(AnonymousClass00U.A0J("Unknown msg: ", i));
    }
}
