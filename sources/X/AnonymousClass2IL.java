package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.2IL  reason: invalid class name */
public final class AnonymousClass2IL {
    public static final Object A00(AnonymousClass601 r3, C63893iY r4) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r4, r3);
        AnonymousClass3HX A01 = C63893iY.A01(r4, 0);
        Object A0B = C63893iY.A0B(r4, A1Z ? 1 : 0);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type com.instagram.common.bloks.BloksParseResult");
        String A0o = C18220wO.A0o(C101046Pr.A00(A01, r3, ((C121997Jj) A0B).A02));
        C10300i6 A0F = C63913ic.A0F(r3);
        if (!(A0F instanceof UserSession) || A0o == null) {
            return null;
        }
        C25210Dhq.A01(C63913ic.A05(r3), (UserSession) A0F, A0o).A05();
        return null;
    }
}
