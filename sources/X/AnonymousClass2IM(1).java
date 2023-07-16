package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

/* renamed from: X.2IM  reason: invalid class name */
public final class AnonymousClass2IM {
    public static Object A00(AnonymousClass601 r9) {
        C04220Ms.A0B(r9, 0);
        C10300i6 A0F = C63913ic.A0F(r9);
        UserSession A02 = C05030Qo.A02(A0F);
        if (C63803iN.A0E(C18180wK.A0J(A02), A02, 36322186235157745L)) {
            FragmentActivity A05 = C63913ic.A05(r9);
            HashMap A0y = AnonymousClass0wJ.A0y();
            String A0m = C18200wM.A0m(C03480Iw.A00(), C18190wL.A0s("ig_activity_center_"));
            A0y.put(AnonymousClass3QH.A00(24, 10, 87), A0m);
            IgBloksScreenConfig A0N = C18190wL.A0N(A02);
            A0N.A0P = "com.bloks.www.bloks.browser_history.main_screen";
            A0N.A0e = true;
            A0N.A0f = false;
            C63743iE.A02("com.bloks.www.bloks.browser_history.main_screen", A0y).A0C(A05, A0N);
            new C36981JiE(A02, A0m, "in_app_browser_v2", true).A01(C35433Iv2.A0H);
            return null;
        }
        AnonymousClass0wJ.A19(AnonymousClass2Q9.A00(AnonymousClass25Q.ACTIVITY_CENTER, C05030Qo.A02(A0F), true), C63913ic.A05(r9), A0F);
        return null;
    }
}
