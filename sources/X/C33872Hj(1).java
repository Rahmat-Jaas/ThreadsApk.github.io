package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.2Hj  reason: invalid class name and case insensitive filesystem */
public final class C33872Hj {
    public static final Object A00(AnonymousClass601 r8, C63893iY r9) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r9, r8);
        String A0E = C63893iY.A0E(r9, 0);
        UserSession userSession = (UserSession) C63913ic.A0F(r8);
        User A0P = C18210wN.A0P(userSession, A0E);
        if (A0P == null) {
            return null;
        }
        ImageUrl B4M = A0P.B4M();
        String A00 = C25702DqQ.A00(A0P);
        C04220Ms.A0B(userSession, 0);
        C18180wK.A1P(A0E, A1Z ? 1 : 0, A00);
        Bundle A06 = C18180wK.A06();
        C22571Yp r3 = new C22571Yp();
        C18190wL.A13(A06, userSession.token);
        A06.putString("USER_ID_ARGUMENT", A0E);
        A06.putParcelable("PROFILE_PIC_URL_ARGUMENT", B4M);
        A06.putString("DISPLAY_NAME_ARGUMENT", A00);
        A06.putString("ENTRY_POINT", "story");
        r3.setArguments(A06);
        C37032Jj9 A0L = C18210wN.A0L(userSession);
        A0L.A0J = new AnonymousClass4Lf();
        C37383Jqm A002 = A0L.A00();
        FragmentActivity A05 = C63913ic.A05(r8);
        C04220Ms.A0C(A05, "null cannot be cast to non-null type android.app.Activity");
        C37383Jqm.A00(A05, r3, A002);
        return null;
    }
}
