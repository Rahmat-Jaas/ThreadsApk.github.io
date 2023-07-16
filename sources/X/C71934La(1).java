package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.4La  reason: invalid class name and case insensitive filesystem */
public final class C71934La implements C83034qg {
    public final /* synthetic */ AnonymousClass47I A00;

    public C71934La(AnonymousClass47I r1) {
        this.A00 = r1;
    }

    public final void Bj9(User user) {
        AnonymousClass47I r2 = this.A00;
        C127397h3 r3 = r2.A08;
        C109326jp A0L = r3.A0L(52);
        if (!r2.A03() || !C04220Ms.A0I(r3.A0O(45, ""), "product_detail_page") || A0L == null) {
            if (r2.A03()) {
                C12560m7 r1 = (C12560m7) r2.A07.A00(R.id.bloks_ig_fragment_manager);
                if (r1.A0I() > 0) {
                    r1.A16();
                    return;
                } else if (A0L == null) {
                    return;
                }
            } else if ("profile".equals(r3.A0N(41))) {
                ((Activity) r2.A09.getValue()).finish();
                return;
            } else {
                UserSession userSession = r2.A02;
                if (userSession != null) {
                    C60113Ns.A01((FragmentActivity) r2.A09.getValue(), userSession);
                    throw null;
                }
                return;
            }
        }
        C122047Jt.A03(r2.A07, r3, C63893iY.A01, A0L);
    }
}
