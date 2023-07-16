package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3P7  reason: invalid class name */
public final class AnonymousClass3P7 {
    public static final void A00(FragmentActivity fragmentActivity, C11630kW r8, C63893iY r9, UserSession userSession) {
        Object obj;
        Object obj2;
        String A0N;
        boolean A1Z = AnonymousClass0wJ.A1Z(userSession, fragmentActivity);
        C04220Ms.A0B(r8, 2);
        List list = r9.A00;
        list.get(0);
        list.get(A1Z ? 1 : 0);
        list.get(3);
        list.get(4);
        list.get(5);
        if (12 < list.size()) {
            obj = list.get(12);
        } else {
            obj = null;
        }
        C127397h3 r4 = (C127397h3) obj;
        if (r4 != null) {
            C127397h3 A0K = r4.A0K(35);
            if ((A0K == null || (obj2 = A0K.A0N(38)) == null) && (9 >= list.size() || (obj2 = list.get(9)) == null)) {
                obj2 = "";
            }
            C04220Ms.A09(obj2);
            if (A0K != null) {
                A0K.A0H(40, -1);
                A0K.A0H(35, -1);
            }
            if (C18230wP.A0o(r4) == null && 10 < list.size()) {
                list.get(10);
            }
            if (r4.A0N(41) == null && 11 < list.size()) {
                list.get(11);
            }
            List<C127397h3> A0R = r4.A0R(38);
            C04220Ms.A06(A0R);
            ArrayList A0v = AnonymousClass0wJ.A0v();
            for (C127397h3 r0 : A0R) {
                if (!(r0 == null || (A0N = r0.A0N(38)) == null)) {
                    A0v.add(A0N);
                }
            }
            C04220Ms.A06(r4.A0O(44, ""));
            C19496AxJ.A03(fragmentActivity, Long.valueOf(r4.A0I(43, 0) * 1000));
            if (C18220wO.A0b(fragmentActivity) != null) {
                throw C18200wM.A0d();
            }
        }
    }

    public static final void A01(FragmentActivity fragmentActivity, C11630kW r6, C63893iY r7, UserSession userSession) {
        String A0N;
        boolean A1Z = AnonymousClass0wJ.A1Z(userSession, fragmentActivity);
        C04220Ms.A0B(r6, 2);
        Object A0B = C63893iY.A0B(r7, 0);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type kotlin.String");
        Object A0B2 = C63893iY.A0B(r7, A1Z ? 1 : 0);
        A0B2.getClass();
        C04220Ms.A0C(A0B2, "null cannot be cast to non-null type kotlin.String");
        Object A0B3 = C63893iY.A0B(r7, 3);
        A0B3.getClass();
        C04220Ms.A0C(A0B3, "null cannot be cast to non-null type kotlin.String");
        List list = r7.A00;
        Object obj = null;
        if (7 < list.size()) {
            list.get(7);
        }
        if (8 < list.size()) {
            obj = list.get(8);
        }
        C127397h3 r2 = (C127397h3) obj;
        if (r2 != null) {
            r2.A0T(40, false);
            C04220Ms.A06(r2.A0O(38, ""));
            C04220Ms.A06(r2.A0O(41, ""));
            C04220Ms.A06(r2.A0R(35));
            List<C127397h3> A0R = r2.A0R(36);
            C04220Ms.A06(A0R);
            ArrayList A0v = AnonymousClass0wJ.A0v();
            for (C127397h3 r0 : A0R) {
                if (!(r0 == null || (A0N = r0.A0N(38)) == null)) {
                    A0v.add(A0N);
                }
            }
            if (C18220wO.A0b(fragmentActivity) != null) {
                throw C18200wM.A0d();
            }
        }
    }
}
