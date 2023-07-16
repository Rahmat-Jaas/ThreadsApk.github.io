package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.2J2  reason: invalid class name */
public final class AnonymousClass2J2 {
    public static Object A00(AnonymousClass601 r23, C63893iY r24) {
        C63893iY r4 = r24;
        List list = r4.A00;
        C127397h3 r0 = (C127397h3) list.get(7);
        if (r0 == null) {
            C30967GcS.A02("IgBloksExtensions", "openProductDetailsPageExtras is null");
            return null;
        }
        AnonymousClass601 r8 = r23;
        AnonymousClass3WF.A02(C61043Rr.A00(r8, C63893iY.A01, C18230wP.A0V(r0)));
        String A0q = C18190wL.A0q(list, 3);
        String A0q2 = C18190wL.A0q(list, 5);
        String A0q3 = C18190wL.A0q(list, 6);
        UserSession A0J = C63913ic.A0J(r8);
        C04220Ms.A0B(r8, 0);
        FragmentActivity A05 = C63913ic.A05(r8);
        C11630kW A0A = C63913ic.A0A(r8);
        String A0N = r0.A0N(45);
        String A0N2 = r0.A0N(43);
        C18617AiW.A01(A05, A0A, r8, (C127397h3) C63893iY.A09(r4), A0J, Integer.valueOf(r0.A0H(59, 0)), Integer.valueOf(r0.A0H(57, 0)), Long.valueOf(r0.A0I(46, 0)), A0q, A0N, A0q2, A0q3, A0N2, r0.A0N(44), r0.A0N(42), r0.A0N(50), r0.A0N(48), r0.A0N(56), r0.A0N(58));
        return null;
    }
}
