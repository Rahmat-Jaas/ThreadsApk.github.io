package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxRListenerShape228S0200000_1_I2;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.2Ie  reason: invalid class name and case insensitive filesystem */
public final class C34082Ie {
    public static final Object A00(AnonymousClass601 r21, C63893iY r22) {
        String str;
        boolean z;
        boolean z2;
        AnonymousClass601 r7 = r21;
        C63893iY r0 = r22;
        boolean A1Z = AnonymousClass0wJ.A1Z(r0, r7);
        String A0D = C63893iY.A0D(r0, 0);
        C127397h3 A02 = C63893iY.A02(r0, A1Z ? 1 : 0);
        if (A02 != null) {
            str = C18230wP.A0o(A02);
            z = A02.A0T(35, A1Z);
            z2 = A02.A0T(38, false);
        } else {
            str = null;
            z = true;
            z2 = false;
        }
        String str2 = null;
        boolean z3 = !z2;
        if (str != null) {
            str2 = str;
        }
        FragmentActivity A05 = C63913ic.A05(r7);
        C10300i6 A0F = C63913ic.A0F(r7);
        A05.getSupportFragmentManager().A0y(new IDxRListenerShape228S0200000_1_I2(r7, A02, 5), A05, "on_failure");
        Bundle A00 = C98316Fa.A00(C18180wK.A0p("SimpleWebViewFragment.SIMPLE_WEB_VIEW_CONFIG", new SimpleWebViewConfig(A0D, (String) null, str2, (String) null, false, false, false, false, false, z, z3, A1Z, false, false, z3)), C18180wK.A0p("IgSessionManager.SESSION_TOKEN_KEY", A0F.getToken()));
        C34608Ibe ibe = new C34608Ibe();
        ibe.setArguments(A00);
        AnonymousClass0wJ.A19(ibe, A05, A0F);
        return null;
    }
}
