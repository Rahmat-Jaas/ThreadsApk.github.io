package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.2IF  reason: invalid class name */
public final class AnonymousClass2IF {
    public static final Object A00(AnonymousClass601 r3, C63893iY r4) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r4, r3);
        AnonymousClass3HX A01 = C63893iY.A01(r4, 0);
        Object A0B = C63893iY.A0B(r4, A1Z ? 1 : 0);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type com.instagram.common.bloks.BloksParseResult");
        C127397h3 r0 = ((C121997Jj) A0B).A02;
        C04220Ms.A06(r0);
        C127397h3 A00 = C101046Pr.A00(A01, r3, r0);
        A00.A0N(35);
        String A0O = A00.A0O(36, "media_share");
        C04220Ms.A06(A0O);
        if (!A0O.equals("media_share") && !A0O.equals("clips_share")) {
            C10450iM.A03("invalid_content_type", AnonymousClass00U.A0L(A0O, " is not a valid content type to share"));
        } else if (C63913ic.A0F(r3) instanceof UserSession) {
            throw C18200wM.A0d();
        }
        return null;
    }
}
