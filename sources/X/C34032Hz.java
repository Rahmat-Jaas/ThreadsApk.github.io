package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.2Hz  reason: invalid class name and case insensitive filesystem */
public final class C34032Hz {
    public static Object A00(AnonymousClass601 r12, C63893iY r13) {
        AnonymousClass25O r8;
        String str = (String) C63893iY.A07(r13);
        int A04 = AnonymousClass0wJ.A04(C63893iY.A08(r13));
        int A042 = AnonymousClass0wJ.A04(C63893iY.A09(r13));
        Object A0B = C63893iY.A0B(r13, 3);
        A0B.getClass();
        int A043 = AnonymousClass0wJ.A04(A0B);
        UserSession A0J = C63913ic.A0J(r12);
        C04220Ms.A0B(r12, 0);
        FragmentActivity A05 = C63913ic.A05(r12);
        C11630kW A0A = C63913ic.A0A(r12);
        String valueOf = String.valueOf(A043);
        AnonymousClass25O[] values = AnonymousClass25O.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                r8 = null;
                break;
            }
            r8 = values[i];
            if (r8.A00.equals(valueOf)) {
                break;
            }
            i++;
        }
        C34022Hy.A00(A05, A0A, A0J, r8, str, A04, A042);
        return null;
    }
}
