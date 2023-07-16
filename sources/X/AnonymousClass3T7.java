package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.3T7  reason: invalid class name */
public final class AnonymousClass3T7 {
    public final Fragment A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final C29151wp A03;
    public final AnonymousClass3Ea A04;

    public static boolean A00(UserSession userSession) {
        AnonymousClass0TJ r2 = AnonymousClass0TJ.A06;
        if ((C63803iN.A0E(r2, userSession, 36324316538806699L) || C63803iN.A0E(r2, userSession, 36325991576053107L)) && AnonymousClass0wJ.A0Y(userSession).A31()) {
            return true;
        }
        return false;
    }

    public AnonymousClass3T7(Fragment fragment, UserSession userSession, C29151wp r4, AnonymousClass3Ea r5) {
        this.A02 = userSession;
        this.A00 = fragment;
        FragmentActivity activity = fragment.getActivity();
        activity.getClass();
        this.A01 = activity;
        this.A04 = r5;
        this.A03 = r4;
    }
}
