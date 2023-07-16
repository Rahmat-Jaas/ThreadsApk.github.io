package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1000000_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.3Xe  reason: invalid class name and case insensitive filesystem */
public final class C62113Xe {
    public static final KtCSuperShape0S1000000_I2 A05 = new KtCSuperShape0S1000000_I2("INSTAGRAM_FAN_SUBS", 1);
    public final C37010Jil A00;
    public final C111636o4 A01;
    public final UserSession A02;
    public final C23256Cp4 A03;
    public final C04530Oa A04;

    public /* synthetic */ C62113Xe(UserSession userSession, C23256Cp4 cp4) {
        C111636o4 r0 = C111636o4.A00;
        if (r0 == null) {
            C18250wR.A0k();
            throw null;
        }
        AnonymousClass0wJ.A1O(userSession, cp4);
        this.A02 = userSession;
        this.A03 = cp4;
        this.A01 = r0;
        this.A00 = C37010Jil.A00();
        this.A04 = AnonymousClass0OY.A02(C18250wR.A0f(this, 34));
    }

    public static final void A00(FragmentActivity fragmentActivity, C22153CJj cJj, C62113Xe r5, C86054wC r6) {
        r6.D7w(C25921pf.A00);
        r5.A00.A02(new AnonymousClass47N(fragmentActivity, cJj, r5, r6), ((E1T) r5.A04.getValue()).A00(fragmentActivity, A05));
    }
}
