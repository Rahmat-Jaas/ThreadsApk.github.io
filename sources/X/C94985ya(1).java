package X;

import android.app.Activity;
import com.instagram.service.session.UserSession;

/* renamed from: X.5ya  reason: invalid class name and case insensitive filesystem */
public final class C94985ya extends C63873iU {
    public final Activity A00;
    public final UserSession A01;

    public C94985ya(Activity activity, UserSession userSession) {
        this.A00 = activity;
        this.A01 = userSession;
    }

    public final void onFail(AnonymousClass3XX r4) {
        int A03 = C14030oh.A03(-385617475);
        C63813iO.A00(this.A00, 2131834634);
        C14030oh.A0A(337849076, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C14030oh.A03(1085682101);
        int A032 = C14030oh.A03(993199744);
        C19462Awj.A01(this.A01).A03(((AnonymousClass5uB) obj).A00());
        C63813iO.A00(this.A00, 2131834636);
        C14030oh.A0A(-470650382, A032);
        C14030oh.A0A(1428595596, A03);
    }
}
