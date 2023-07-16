package X;

import android.app.Activity;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.facebook.privacy.zone.policy.ZonePolicy;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.6Oq  reason: invalid class name and case insensitive filesystem */
public final class C100786Oq {
    public static final Object A00(AnonymousClass601 r10, C63893iY r11) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r11, r10);
        String A0D = C63893iY.A0D(r11, 0);
        List list = r11.A00;
        list.get(A1Z ? 1 : 0);
        String A0q = C18190wL.A0q(list, 2);
        String A0q2 = C18190wL.A0q(list, 3);
        boolean A02 = AnonymousClass3WF.A02(list.get(4));
        Uri A01 = C15430rJ.A01(A0D);
        C10300i6 A0F = C63913ic.A0F(r10);
        FragmentActivity activity = C63913ic.A01(r10).getActivity();
        C18200wM.A1R(A0F);
        UserSession userSession = (UserSession) A0F;
        if (activity == null) {
            return null;
        }
        String A0n = C18190wL.A0n(A01);
        C171209wF r0 = C171209wF.A1D;
        C04220Ms.A0B(userSession, A1Z);
        C37350Jpy jpy = new C37350Jpy((Activity) activity, userSession, r0, A0n);
        jpy.A06(userSession.getUserId());
        jpy.A07("in_app_browser_v2");
        jpy.A0B = A0q;
        if (A0q != null) {
            jpy.A0T.A00.putString(I17.A00(456), A0q);
        }
        jpy.A0T.A00.putString(I17.A00(184), A0q2);
        if (A02) {
            jpy.A0I = false;
            jpy.A02 = new AnonymousClass5N9(AnonymousClass006.A0C, AnonymousClass0ZV.A00);
            jpy.A04 = ZonePolicy.A04;
        }
        jpy.A04();
        return null;
    }
}
