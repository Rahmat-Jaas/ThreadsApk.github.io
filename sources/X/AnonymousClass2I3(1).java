package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2I3  reason: invalid class name */
public final class AnonymousClass2I3 {
    public static Object A00(AnonymousClass601 r14, C63893iY r15) {
        Object A0B = C63893iY.A0B(r15, 0);
        A0B.getClass();
        User user = ((C1193774x) A0B).A00;
        if (user == null) {
            C30967GcS.A02("ig.action.navigation.LoginWithParam", "Null user in user alien object");
            return null;
        }
        HashMap A0N = C63913ic.A0N((Map) C63893iY.A0B(r15, 1));
        String str = (String) A0N.get("destination_url");
        String A0f = C18240wQ.A0f("show_autoconf_consent", A0N);
        if (A0f == null) {
            A0f = "-1";
        }
        int parseInt = Integer.parseInt(A0f);
        C04220Ms.A0B(r14, 0);
        FragmentActivity A05 = C63913ic.A05(r14);
        C11630kW A0A = C63913ic.A0A(r14);
        UserSession A03 = C67323zM.A03(A05, A0A, C05030Qo.A00(C63913ic.A0F(r14)), user, (String) null, false);
        Uri A01 = C15430rJ.A01(AnonymousClass00U.A0L("instagram://", str));
        if (parseInt == 2 || parseInt == 3 || parseInt == 4) {
            String str2 = (String) A0N.get("register_start_message");
            String str3 = (String) A0N.get("nonce_code");
            if (!(str2 == null || str3 == null)) {
                C25786Drz A00 = C63463hW.A00(A05, A03);
                Bundle A0E = AnonymousClass0wJ.A0E(A03);
                A0E.putString("REGISTER_START_MESSAGE", str2);
                A0E.putString("NONCE", str3);
                A0E.putString("SMS_FLOW_TYPE", "ar_reset_password_link_sms");
                A0E.putInt("CONSENT_MODE", parseInt);
                C18180wK.A0x(A0E, new AnonymousClass1ZO(), A00);
                return null;
            }
        }
        C67323zM.A05(A05, A01, A0A, A03);
        return null;
    }
}
