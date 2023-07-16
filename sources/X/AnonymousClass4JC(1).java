package X;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxAListenerShape459S0100000_1_I2;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.service.session.UserSession;
import java.util.Locale;

/* renamed from: X.4JC  reason: invalid class name */
public final class AnonymousClass4JC implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final Context A02;

    public final void BN1(Uri uri, Bundle bundle) {
        String str;
        String str2;
        if (uri == null || (str = uri.getQueryParameter("entry_point")) == null) {
            Locale locale = Locale.US;
            C04220Ms.A08(locale);
            str = C18190wL.A0r(locale, "IGPC_BLOCKING_INTERSTITIAL");
        }
        IDxAListenerShape459S0100000_1_I2 iDxAListenerShape459S0100000_1_I2 = new IDxAListenerShape459S0100000_1_I2(this, 10);
        UserSession userSession = this.A01;
        AccountFamily A022 = C62813an.A02(C62813an.A01(userSession), userSession);
        if (A022 == null || C50492t5.A00(A022.A04) == null || C50492t5.A00(A022.A04).get(0) == null) {
            str2 = "";
        } else {
            str2 = ((C72144Mm) C50492t5.A00(A022.A04).get(0)).A01();
        }
        C35792Ov.A00(userSession, str, str2);
        C63003bJ.A00(AnonymousClass2AF.A0f, userSession, str, (String) null);
        C35762Os.A00();
        new C26141q7((Activity) this.A00, (C10300i6) userSession, (C83964sH) iDxAListenerShape459S0100000_1_I2).A04(str);
    }

    public AnonymousClass4JC(Context context, UserSession userSession, FragmentActivity fragmentActivity) {
        this.A02 = context;
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }
}
