package X;

import android.content.Context;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import com.instagram.service.session.UserSession;
import java.util.HashMap;
import kotlin.Pair;

/* renamed from: X.7Bs  reason: invalid class name */
public final class AnonymousClass7Bs {
    public static final void A02(Context context, UserSession userSession, String str) {
        boolean A1Z = AnonymousClass0wJ.A1Z(userSession, context);
        C04220Ms.A0B(str, 2);
        HashMap A00 = A00(str, A1Z);
        M4x.A03(context, new C210718u(userSession), C18170wI.A00(152), str, A00, SandboxRepository.CACHE_TTL);
    }

    public static final HashMap A00(String str, boolean z) {
        String str2;
        Pair A0p = C18180wK.A0p(C61953Wm.A00(), str);
        if (z) {
            str2 = "true";
        } else {
            str2 = "false";
        }
        return AnonymousClass4WJ.A09(A0p, C18180wK.A0p(I17.A00(56), str2));
    }

    public static final void A01(Context context, UserSession userSession, String str) {
        boolean A1Z = AnonymousClass0wJ.A1Z(userSession, context);
        C04220Ms.A0B(str, 2);
        M4x.A01(context, new C210718u(userSession), C18170wI.A00(152), str, A00(str, A1Z));
    }
}
