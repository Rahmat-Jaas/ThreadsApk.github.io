package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.2IY  reason: invalid class name */
public final class AnonymousClass2IY {
    public static final Object A00(AnonymousClass601 r37, C63893iY r38) {
        AnonymousClass601 r3 = r37;
        C63893iY r5 = r38;
        boolean A1Z = AnonymousClass0wJ.A1Z(r5, r3);
        List list = r5.A00;
        C127397h3 r6 = (C127397h3) list.get(5);
        if (r6 == null) {
            return null;
        }
        boolean A0T = r6.A0T(43, false);
        String A0q = C18190wL.A0q(list, 0);
        String A0E = C63893iY.A0E(r5, A1Z ? 1 : 0);
        String A0q2 = C18190wL.A0q(list, 2);
        String A0q3 = C18190wL.A0q(list, 3);
        String A0q4 = C18190wL.A0q(list, 4);
        String A0o = C18220wO.A0o(r6);
        long A0I = r6.A0I(36, 0);
        boolean A0T2 = r6.A0T(40, false);
        String A0N = r6.A0N(42);
        FragmentActivity A05 = C63913ic.A05(r3);
        UserSession A02 = C05030Qo.A02(C63913ic.A0F(r3));
        C19513Axa axa = C19513Axa.A00;
        Long valueOf = Long.valueOf(A0I);
        Boolean valueOf2 = Boolean.valueOf(A0T2);
        if (A0T) {
            axa.A11(A05, A02, valueOf2, valueOf, A0E, A0q2, A0q3, (String) null, (String) null, A0q4, (String) null, A0o, A0N, false, false, false);
            return null;
        }
        axa.A11(A05, A02, valueOf2, valueOf, A0E, A0q2, A0q3, A0q, (String) null, A0q4, (String) null, A0o, A0N, false, false, false);
        return null;
    }
}
