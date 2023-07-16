package X;

import android.app.Activity;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.4Mp  reason: invalid class name and case insensitive filesystem */
public final class C72154Mp implements L1Q {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C11630kW A01;
    public final /* synthetic */ AnonymousClass601 A02;
    public final /* synthetic */ C109326jp A03;
    public final /* synthetic */ C109326jp A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ User A06;
    public final /* synthetic */ String A07;

    public final void Bmc() {
    }

    public final void CNe() {
    }

    public C72154Mp(Activity activity, C11630kW r2, AnonymousClass601 r3, C109326jp r4, C109326jp r5, UserSession userSession, User user, String str) {
        this.A05 = userSession;
        this.A01 = r2;
        this.A06 = user;
        this.A07 = str;
        this.A02 = r3;
        this.A04 = r4;
        this.A00 = activity;
        this.A03 = r5;
    }

    public final void BrW() {
        UserSession userSession = this.A05;
        C54492zX.A00(this.A01, userSession, "block_confirm", userSession.getUserId(), this.A06.getId(), this.A07);
    }

    public final void Bxq() {
        C109326jp r0;
        AnonymousClass601 r1 = this.A02;
        if (r1 != null && (r0 = this.A03) != null) {
            C63893iY.A0G(r1, r0);
        }
    }

    public final void onCancel() {
        UserSession userSession = this.A05;
        C54492zX.A00(this.A01, userSession, "block_cancel", userSession.getUserId(), this.A06.getId(), this.A07);
    }

    public final void onSuccess() {
        C109326jp r0;
        AnonymousClass601 r1 = this.A02;
        if (r1 == null || (r0 = this.A04) == null) {
            if (this.A06.BRq()) {
                Activity activity = this.A00;
                C63813iO.A01(activity, activity.getString(2131822360));
            }
            C63373hN.A01(this.A00);
            return;
        }
        C63893iY.A0G(r1, r0);
    }
}
