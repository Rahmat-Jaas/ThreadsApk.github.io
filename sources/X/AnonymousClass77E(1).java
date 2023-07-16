package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxFListenerShape1S1600000_2_I2;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import org.json.JSONObject;

/* renamed from: X.77E  reason: invalid class name */
public final class AnonymousClass77E {
    public static final AnonymousClass77E A00 = new AnonymousClass77E();

    public final Object A00(AnonymousClass601 r25, C63893iY r26) {
        String str;
        String str2;
        AnonymousClass601 r4 = r25;
        C63893iY r5 = r26;
        boolean A1Z = AnonymousClass0wJ.A1Z(r5, r4);
        String obj = C63893iY.A0A(r5, 0).toString();
        C109326jp A06 = C63893iY.A06(r5, A1Z ? 1 : 0);
        C109326jp A062 = C63893iY.A06(r5, 2);
        C127397h3 r6 = (C127397h3) C63893iY.A0B(r5, 3);
        UserSession userSession = (UserSession) C63913ic.A0F(r4);
        FragmentActivity A05 = C63913ic.A05(r4);
        if (r6 == null || (str = C127397h3.A0B(r6)) == null) {
            str = "SINGLE_BLOCK";
        }
        if (str.equals("SINGLE_BLOCK")) {
            Integer num = AnonymousClass006.A00;
            if (r6 == null || (str2 = C18220wO.A0o(r6)) == null) {
                str2 = "";
            }
            C134427xg r11 = new C134427xg(r4, A06, A062);
            User A0P = C18210wN.A0P(userSession, obj);
            if (A0P != null) {
                String A002 = C24269DFl.A00(str2);
                String BK7 = A0P.BK7();
                C04220Ms.A0B(A05, 0);
                AnonymousClass0wJ.A1O(userSession, str2);
                C18230wP.A1R(A002, 3, BK7);
                C35794J4e.A00(A05, userSession, A0P, r11, str2, A002, (JSONObject) null, 0, false);
                return null;
            }
            AnonymousClass3Y8.A02.A00(userSession, new IDxFListenerShape1S1600000_2_I2(A05, r11, num, r4, A062, userSession, str2, 0), obj);
            return null;
        }
        throw C18190wL.A0a(str);
    }
}
