package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxRListenerShape228S0200000_1_I2;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.2IK  reason: invalid class name */
public final class AnonymousClass2IK {
    public static final Object A00(AnonymousClass601 r20, C63893iY r21) {
        Fragment ibe;
        AnonymousClass601 r4 = r20;
        C63893iY r0 = r21;
        boolean A1Z = AnonymousClass0wJ.A1Z(r0, r4);
        String A0D = C63893iY.A0D(r0, 0);
        C127397h3 A03 = C63893iY.A03(r0, A1Z ? 1 : 0);
        String A0N = A03.A0N(40);
        boolean A0T = A03.A0T(38, A1Z);
        String str = null;
        boolean z = !A03.A0T(35, false);
        if (A0N != null) {
            str = A0N;
        }
        FragmentActivity A05 = C63913ic.A05(r4);
        A05.getSupportFragmentManager().A0y(new IDxRListenerShape228S0200000_1_I2(r4, A03, 2), A05, "on_failure");
        C10300i6 A0F = C63913ic.A0F(r4);
        Bundle A00 = C98316Fa.A00(C18180wK.A0p("SimpleWebViewFragment.SIMPLE_WEB_VIEW_CONFIG", new SimpleWebViewConfig(A0D, (String) null, str, (String) null, false, false, false, false, false, A0T, z, A1Z, false, false, A1Z)), C18180wK.A0p("IgSessionManager.SESSION_TOKEN_KEY", A0F.getToken()), C18180wK.A0p("IACWebviewFragment.LIVE_CHAT_URL_KEY", A0D));
        if (C63803iN.A0E(AnonymousClass0TJ.A05, A0F, 36325154057364440L)) {
            ibe = new C28961vq();
        } else {
            ibe = new C34608Ibe();
        }
        ibe.setArguments(A00);
        AnonymousClass0wJ.A19(ibe, A05, A0F);
        return null;
    }
}
