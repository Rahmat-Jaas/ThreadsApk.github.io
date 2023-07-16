package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxFListenerShape0S1600000_1_I2;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.3Tr  reason: invalid class name and case insensitive filesystem */
public final class C61503Tr {
    public static final C61503Tr A00 = new C61503Tr();

    public final Object A00(AnonymousClass601 r27, C63893iY r28) {
        String str;
        String str2;
        AnonymousClass601 r5 = r27;
        C63893iY r3 = r28;
        boolean A1Z = AnonymousClass0wJ.A1Z(r3, r5);
        String obj = C63893iY.A0A(r3, 0).toString();
        C109326jp A06 = C63893iY.A06(r3, A1Z ? 1 : 0);
        C109326jp A062 = C63893iY.A06(r3, 2);
        C127397h3 A02 = C63893iY.A02(r3, 3);
        UserSession userSession = (UserSession) C63913ic.A0F(r5);
        FragmentActivity A05 = C63913ic.A05(r5);
        if (A02 == null || (str = C18230wP.A0o(A02)) == null) {
            str = "DIRECT_RESTRICT";
        }
        if (str.equals("DIRECT_RESTRICT")) {
            Integer num = AnonymousClass006.A00;
            if (A02 == null || (str2 = C18220wO.A0o(A02)) == null) {
                str2 = "";
            }
            AnonymousClass4NH r19 = new AnonymousClass4NH(C63913ic.A05(r5), C13330nS.A01(new AnonymousClass43L(str2), C63913ic.A0F(r5)), r5, A06, A062, obj);
            User A0P = C18210wN.A0P(userSession, obj);
            if (A0P != null) {
                C36480JXd jXd = C36480JXd.A02;
                C04220Ms.A0C(A05, "null cannot be cast to non-null type android.app.Activity");
                jXd.A04(A05, AnonymousClass06E.A00(A05), userSession, r19, A0P.getId(), str2, (String) null);
                return null;
            }
            AnonymousClass3Y8.A02.A00(userSession, new IDxFListenerShape0S1600000_1_I2(A05, r5, A062, r19, userSession, num, str2, 0), obj);
            return null;
        }
        throw C18190wL.A0a(str);
    }
}
