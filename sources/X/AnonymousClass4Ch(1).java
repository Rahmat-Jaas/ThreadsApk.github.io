package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Ch  reason: invalid class name */
public final class AnonymousClass4Ch implements C83594rf {
    public final /* synthetic */ C34613Ibj A00;
    public final /* synthetic */ String A01;

    public AnonymousClass4Ch(C34613Ibj ibj, String str) {
        this.A00 = ibj;
        this.A01 = str;
    }

    public final void onActionClicked() {
        String str = this.A01;
        if (str != null) {
            C34613Ibj ibj = this.A00;
            C37741K2b k2b = ibj.A07;
            if (k2b != null) {
                k2b.A0I(C35394Iu2.A19, "audience_validation_learn_more");
            }
            FragmentActivity requireActivity = ibj.requireActivity();
            UserSession userSession = ibj.A0H;
            if (userSession == null) {
                C18210wN.A0m();
                throw null;
            }
            C37350Jpy A0Y = C18230wP.A0Y(requireActivity, userSession, C171209wF.A20, str);
            A0Y.A07("promote_review");
            A0Y.A04();
        }
    }

    public final void onBannerDismissed() {
        C37741K2b k2b = this.A00.A07;
        if (k2b != null) {
            k2b.A0I(C35394Iu2.A19, "audience_validation_banner_close");
        }
    }
}
