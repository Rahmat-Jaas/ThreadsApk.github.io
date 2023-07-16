package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0111000_I2;

/* renamed from: X.2FZ  reason: invalid class name */
public final class AnonymousClass2FZ {
    public static final AnonymousClass3GB A00(FragmentActivity fragmentActivity, UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        AnonymousClass3GB r4 = new AnonymousClass3GB(fragmentActivity, userSession);
        if (!r4.A01.A02()) {
            return null;
        }
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape1S0111000_I2((Object) r4, (C146958n9) null, 5, false), r4.A09, 3);
        return r4;
    }
}
