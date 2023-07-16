package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.6P3  reason: invalid class name */
public final class AnonymousClass6P3 {
    public static final Object A00(AnonymousClass601 r14, C63893iY r15) {
        C109326jp r6;
        AnonymousClass601 r5 = r14;
        boolean A1Z = AnonymousClass0wJ.A1Z(r15, r14);
        Object A0B = C63893iY.A0B(r15, 0);
        A0B.getClass();
        Iterable iterable = (Iterable) A0B;
        Object A0B2 = C63893iY.A0B(r15, A1Z ? 1 : 0);
        A0B2.getClass();
        String A0h = C86164wN.A0h(A0B2);
        String str = (String) A0B2;
        String str2 = (String) C63893iY.A0C(r15, A0h, 2);
        Object A0B3 = C63893iY.A0B(r15, 3);
        if (A0B3 == null) {
            r6 = null;
        } else {
            r6 = ((C105916eC) A0B3).A00;
        }
        UserSession userSession = (UserSession) C63913ic.A0F(r14);
        FragmentActivity A05 = C63913ic.A05(r14);
        String A0H = AnonymousClass00J.A0H((CharSequence) null, (CharSequence) null, (CharSequence) null, iterable, (AnonymousClass0YY) null, 63);
        H1T A0P = AnonymousClass0wJ.A0P(userSession);
        A0P.A0J("media/infos/");
        A0P.A0O("media_ids", A0H);
        new C19512AxZ(A05, AnonymousClass06E.A00(A05), userSession).A06(AnonymousClass0wJ.A0T(A0P, C156169Me.class, C19265AtU.class), new C133107v8(A05, r5, r6, userSession, str, str2));
        return null;
    }
}
