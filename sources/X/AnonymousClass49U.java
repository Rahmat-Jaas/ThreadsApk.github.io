package X;

import android.content.Context;
import com.instagram.backgroundsync.BackgroundSyncJobService;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.49U  reason: invalid class name */
public final class AnonymousClass49U implements AnonymousClass0i4 {
    public static final AnonymousClass3DX A02 = new AnonymousClass3DX();
    public final Context A00;
    public final UserSession A01;

    public AnonymousClass49U(Context context, UserSession userSession) {
        C04220Ms.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
    }

    public static final C25425DlP A00(AnonymousClass49U r11) {
        UserSession userSession = r11.A01;
        AnonymousClass0TJ r6 = AnonymousClass0TJ.A05;
        long j = (long) 60;
        long j2 = (long) 1000;
        long A03 = C63803iN.A03(r6, userSession, 36600126453648799L) * j * j2;
        return new C25425DlP(BackgroundSyncJobService.class, R.id.background_sync_scheduler_job_id, 2, (C63803iN.A03(r6, userSession, 36600126453714336L) * j * j2) + A03, A03, false, false);
    }

    public final void onSessionWillEnd() {
        AnonymousClass0gN.A00().AKp(new C12340lj(new AnonymousClass4OH(this), 373673427));
    }
}
