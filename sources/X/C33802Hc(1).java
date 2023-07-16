package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.modal.ModalActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.2Hc  reason: invalid class name and case insensitive filesystem */
public final class C33802Hc {
    public static final Object A00(AnonymousClass601 r7, C63893iY r8) {
        String A0q = C18190wL.A0q(r8.A00, AnonymousClass0wJ.A1Y(r8, r7) ? 1 : 0);
        AnonymousClass3HX r0 = r7.A00;
        if (r0 != null) {
            Context context = r0.A00;
            C04220Ms.A06(context);
            FragmentActivity A05 = C63913ic.A05(r7);
            C10300i6 A0F = C63913ic.A0F(r7);
            if (!(A0F instanceof UserSession) || A0F == null) {
                throw C18190wL.A0a("User session must not be null to access local device cache");
            }
            Bundle A06 = C18180wK.A06();
            A06.putString("entrypoint", A0q);
            C63863iT.A04(A05, A06, A0F, ModalActivity.class, "quiet_mode_settings").A0I(context);
        }
        return null;
    }
}
