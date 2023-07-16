package X;

import android.content.Context;
import android.os.Build;
import com.instagram.barcelona.R;
import com.instagram.gallery.scanner.MediaScannerJobService;
import com.instagram.service.session.UserSession;

/* renamed from: X.47r  reason: invalid class name and case insensitive filesystem */
public final class C692847r implements C10390iG, AnonymousClass0i1 {
    public int A00;
    public final Context A01;
    public final UserSession A02;

    private final void A00() {
        C25666Dpn.A00(this.A01).A01(new C25425DlP(MediaScannerJobService.class, R.id.media_scanner_job_scheduler_id, 1, 0, 500, false, false));
    }

    public final void A01(boolean z) {
        if (AnonymousClass2P3.A00(this.A02) != AnonymousClass006.A00 && this.A00 < 2) {
            if (Build.VERSION.SDK_INT > 29 || C18180wK.A1W(this.A01.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE"))) {
                A00();
                this.A00++;
                C25666Dpn.A00(this.A01).A02(new C25425DlP(MediaScannerJobService.class, R.id.media_scanner_job_scheduler_id, 1, 0, 500, false, z));
            }
        }
    }

    public C692847r(Context context, UserSession userSession) {
        this.A01 = context;
        this.A02 = userSession;
    }

    public final void onAppBackgrounded() {
        int A03 = C14030oh.A03(-285417652);
        A01(true);
        C14030oh.A0A(1064604974, A03);
    }

    public final void onAppForegrounded() {
        int A03 = C14030oh.A03(-988515033);
        A00();
        C14030oh.A0A(-339703130, A03);
    }

    public final void onUserSessionWillEnd(boolean z) {
    }
}
