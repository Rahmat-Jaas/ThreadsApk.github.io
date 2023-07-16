package X;

import com.instagram.service.session.UserSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.70i  reason: invalid class name and case insensitive filesystem */
public final class C1182870i {
    public static List A00() {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C1366783w it = C41233M1c.A04.iterator();
        while (it.hasNext()) {
            A0v.add(((C41233M1c) it.next()).A02);
        }
        return A0v;
    }

    public static List A01(UserSession userSession) {
        String A0h = C18200wM.A0h(C28161tl.A04(userSession), C28174Ezk.A00(523));
        if (A0h != null) {
            try {
                return C18220wO.A0S(C101446Rf.parseFromJson(C18180wK.A0L(A0h)).A00);
            } catch (IOException e) {
                C10450iM.A06(C28174Ezk.A00(349), "failed to parse reaction set", e);
            }
        }
        return A00();
    }
}
