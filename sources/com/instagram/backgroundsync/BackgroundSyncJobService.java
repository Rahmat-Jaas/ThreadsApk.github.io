package com.instagram.backgroundsync;

import X.AnonymousClass0TJ;
import X.AnonymousClass0gN;
import X.AnonymousClass49U;
import X.AnonymousClass4OI;
import X.C10300i6;
import X.C12340lj;
import X.C18200wM;
import X.C18230wP;
import X.C25643DpN;
import X.C60703Qe;
import X.C63803iN;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import com.instagram.realtimeclient.keepalive.RealtimeClientKeepAlive;
import com.instagram.service.session.UserSession;

public final class BackgroundSyncJobService extends JobService {
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        C60703Qe r0 = C60703Qe.A00;
        Context A09 = C18230wP.A09(this);
        C10300i6 A0W = C18200wM.A0W(r0);
        if (!(A0W instanceof UserSession) || A0W.hasEnded()) {
            return false;
        }
        UserSession userSession = (UserSession) A0W;
        AnonymousClass0TJ r4 = AnonymousClass0TJ.A05;
        if (!C63803iN.A0E(r4, userSession, 36318651476873897L)) {
            return false;
        }
        if (!C25643DpN.A00(A0W).A01("mqtt")) {
            RealtimeClientKeepAlive.getInstance(userSession).doKeepAlive();
        }
        AnonymousClass49U A00 = AnonymousClass49U.A02.A00(A09, userSession);
        if (!C63803iN.A0E(r4, A00.A01, 36318651476873897L)) {
            return false;
        }
        AnonymousClass0gN.A00().AKp(new C12340lj(new AnonymousClass4OI(A00), 373673427));
        return true;
    }
}
