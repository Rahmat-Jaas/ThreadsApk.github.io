package X;

import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.service.session.UserSession;

/* renamed from: X.6OU  reason: invalid class name */
public final class AnonymousClass6OU {
    public static final Object A00(AnonymousClass601 r15, C63893iY r16) {
        C63893iY r1 = r16;
        C127397h3 A03 = C63893iY.A03(r1, AnonymousClass0wJ.A1Z(r1, r15) ? 1 : 0);
        C127397h3 A0K = A03.A0K(40);
        if (A0K != null) {
            AnonymousClass7EW r6 = null;
            String A0O = A03.A0O(41, "");
            String A0O2 = A03.A0O(44, "");
            String A0o = C18230wP.A0o(A03);
            AnonymousClass7EW A00 = AnonymousClass7EW.A00(A0K);
            String A0E = C127397h3.A0E(A03);
            int A0H = A03.A0H(35, 0);
            String A0O3 = A03.A0O(43, "");
            C127397h3 A0K2 = A03.A0K(38);
            if (A0K2 != null) {
                r6 = AnonymousClass7EW.A00(A0K2);
            }
            AnonymousClass792 r4 = new AnonymousClass792((NewFundraiserInfo) null, r6, A00, A0E, A0O3, A0o, A0O, (String) null, A0O2, A0H);
            UserSession A02 = C05030Qo.A02(C63913ic.A0F(r15));
            C19286Atp.A01(C63913ic.A05(r15), C171799zz.A3B, A02, r4);
            return null;
        }
        throw C18190wL.A0a("Requires valid creator model");
    }
}
