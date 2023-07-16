package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.6pG  reason: invalid class name and case insensitive filesystem */
public final class C112256pG {
    public final /* synthetic */ L3B A00;
    public final /* synthetic */ UserSession A01;

    public C112256pG(L3B l3b, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = l3b;
    }

    public final C146668mf A00(String str) {
        C146668mf r0;
        boolean A0I = C04220Ms.A0I(str, "1302814060304063");
        UserSession userSession = this.A01;
        L3B l3b = this.A00;
        FragmentActivity activity = l3b.getActivity();
        C04220Ms.A06(activity);
        if (A0I) {
            r0 = new C128537jl(activity, l3b, userSession);
        } else {
            r0 = new C128547jm(activity, l3b, userSession);
        }
        return r0;
    }
}
