package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxRListenerShape228S0200000_1_I2;

/* renamed from: X.2I8  reason: invalid class name */
public final class AnonymousClass2I8 {
    public static final Object A00(AnonymousClass601 r6, C63893iY r7) {
        C109326jp A0R = C18190wL.A0R(r7.A00, AnonymousClass0wJ.A1Z(r7, r6) ? 1 : 0);
        FragmentActivity A05 = C63913ic.A05(r6);
        C10300i6 A0F = C63913ic.A0F(r6);
        C18200wM.A1R(A0F);
        if (A0R != null) {
            A05.getSupportFragmentManager().A0y(new IDxRListenerShape228S0200000_1_I2(r6, A0R, 0), A05, "business_options_fragment_request_key");
        }
        C23411dm.A06(AnonymousClass0wJ.A0Q(A05, A0F));
        return null;
    }
}
