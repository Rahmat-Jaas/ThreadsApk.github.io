package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.491  reason: invalid class name */
public final class AnonymousClass491 implements AnonymousClass0i4 {
    public Fragment A00;
    public FragmentActivity A01;
    public AnonymousClass1k0 A02;
    public final UserSession A03;

    public final void onSessionWillEnd() {
        UserSession userSession = this.A03;
        C04220Ms.A0B(userSession, 0);
        C63703i9 r2 = C63703i9.A00;
        AnonymousClass0wJ.A11(C63703i9.A00(r2, userSession).edit(), "tag_products_tooltip_seen_count", 0);
        AnonymousClass0wJ.A12(C63703i9.A00(r2, userSession).edit(), "tag_products_tooltip_last_shown_time_sec", 0);
    }

    public final void A00(Fragment fragment, FragmentActivity fragmentActivity) {
        this.A01 = fragmentActivity;
        this.A00 = fragment;
        AnonymousClass1k0 A0U = C19513Axa.A00.A0U(this.A03);
        this.A02 = A0U;
        Fragment fragment2 = this.A00;
        if (fragment2 instanceof C34640IcN) {
            ((C34640IcN) fragment2).registerLifecycleListener(A0U);
        }
    }

    public AnonymousClass491(UserSession userSession) {
        this.A03 = userSession;
    }
}
