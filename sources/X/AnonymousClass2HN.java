package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

/* renamed from: X.2HN  reason: invalid class name */
public final class AnonymousClass2HN {
    public static final Object A00(AnonymousClass601 r7, C63893iY r8) {
        HashMap hashMap;
        boolean A1Z = AnonymousClass0wJ.A1Z(r8, r7);
        if (AnonymousClass0wJ.A1W(AnonymousClass3IR.A00)) {
            C10300i6 A0F = C63913ic.A0F(r7);
            C18200wM.A1R(A0F);
            UserSession userSession = (UserSession) A0F;
            FragmentActivity A05 = C63913ic.A05(r7);
            String A0E = C63893iY.A0E(r8, 0);
            Object A0B = C63893iY.A0B(r8, A1Z ? 1 : 0);
            if (A0B != null) {
                hashMap = AnonymousClass2C4.A00((HashMap) A0B);
            } else {
                hashMap = null;
            }
            C50202sc.A00();
            AnonymousClass3PC.A01(A05, userSession, Boolean.valueOf(A1Z), A0E, hashMap);
        }
        return null;
    }
}
