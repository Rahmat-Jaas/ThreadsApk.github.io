package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.42c  reason: invalid class name and case insensitive filesystem */
public final class C680742c implements C39669Kxo {
    public final /* synthetic */ C34620Ibt A00;
    public final /* synthetic */ KFB A01;
    public final /* synthetic */ L2D A02;

    public final void Bxq() {
    }

    public final void CNL(String str) {
        String str2;
        C25786Drz A0Q;
        Fragment A07;
        C04220Ms.A0B(str, 0);
        C34620Ibt ibt = this.A00;
        C37062Jjm jjm = ibt.A06;
        if (jjm == null) {
            str2 = "adsManagerLogger";
        } else {
            String obj = C35394Iu2.A12.toString();
            KFB kfb = (KFB) this.A02;
            jjm.A05("ads_manager", obj, kfb.Ayo());
            UserSession userSession = ibt.A0J;
            str2 = "userSession";
            if (userSession != null) {
                boolean A04 = C37318JpL.A04(userSession);
                FragmentActivity requireActivity = ibt.requireActivity();
                UserSession userSession2 = ibt.A0J;
                if (A04) {
                    if (userSession2 != null) {
                        A0Q = C18180wK.A0Q(requireActivity, userSession2);
                        A07 = C62883b4.A02().A07(kfb.Ayo(), str, this.A01.A0B);
                    }
                } else if (userSession2 != null) {
                    A0Q = C18180wK.A0Q(requireActivity, userSession2);
                    A07 = C62883b4.A02().A07(kfb.Ayo(), str, (String) null);
                }
                A0Q.A03 = A07;
                A0Q.A05();
                return;
            }
        }
        C04220Ms.A0E(str2);
        throw null;
    }

    public C680742c(C34620Ibt ibt, KFB kfb, L2D l2d) {
        this.A00 = ibt;
        this.A02 = l2d;
        this.A01 = kfb;
    }
}
