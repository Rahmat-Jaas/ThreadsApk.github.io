package X;

import android.content.Context;
import android.content.Intent;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.3Qw  reason: invalid class name and case insensitive filesystem */
public final class C60873Qw {
    public static final List A00 = C18210wN.A0h("StellaDirectMessagingService");

    public static Integer A00(Context context, Intent intent, C15710rl r3) {
        if (!r3.A01(context, intent, (C16240si) null)) {
            return AnonymousClass006.A0C;
        }
        C10300i6 A0W = C18200wM.A0W(context);
        if (A0W == null || !(A0W instanceof UserSession)) {
            return AnonymousClass006.A1C;
        }
        if (C63803iN.A0E(AnonymousClass0TJ.A05, C05030Qo.A02(A0W), 36310761622012136L)) {
            return AnonymousClass006.A00;
        }
        return AnonymousClass006.A1L;
    }
}
