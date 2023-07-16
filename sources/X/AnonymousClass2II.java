package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.2II  reason: invalid class name */
public final class AnonymousClass2II {
    public static final Object A00(AnonymousClass601 r7) {
        C04220Ms.A0B(r7, 1);
        UserSession A02 = C05030Qo.A02(C63913ic.A0F(r7));
        User A0Y = AnonymousClass0wJ.A0Y(A02);
        FragmentActivity A05 = C63913ic.A05(r7);
        if (A05 == null) {
            return null;
        }
        AnonymousClass0wJ.A19(C50452t1.A00().A00.Bhc(A02, AnonymousClass3PT.A00(C23937D1z.FOLLOWERS, A0Y.getId(), 12, false), A0Y.getId()), A05, A02);
        return null;
    }
}
