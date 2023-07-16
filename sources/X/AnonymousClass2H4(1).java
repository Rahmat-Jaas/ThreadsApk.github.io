package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxOSessionShape141S0000000_1_I2;
import com.instagram.service.session.UserSession;
import kotlin.Unit;

/* renamed from: X.2H4  reason: invalid class name */
public final class AnonymousClass2H4 {
    public static final Object A00(AnonymousClass601 r6) {
        String token;
        C04220Ms.A0B(r6, 1);
        FragmentActivity A05 = C63913ic.A05(r6);
        C10300i6 A0F = C63913ic.A0F(r6);
        if (A0F instanceof UserSession) {
            AnonymousClass0RA.A0C.A05(new IDxOSessionShape141S0000000_1_I2(0));
            token = "IgSessionManager.LOGGED_OUT_TOKEN";
        } else {
            token = A0F.getToken();
        }
        C25786Drz A00 = C63463hW.A00(A05, A0F);
        Bundle A06 = C18180wK.A06();
        C18190wL.A13(A06, token);
        A06.putString("com.instagram.android.login.fragment.ARGUMENT_OMNISTRING", "");
        A06.putBoolean("com.instagram.android.login.fragment.ARGUMENT_USER_IS_VALID", true);
        C18180wK.A0x(A06, new AnonymousClass1c9(), A00);
        return Unit.A00;
    }
}
