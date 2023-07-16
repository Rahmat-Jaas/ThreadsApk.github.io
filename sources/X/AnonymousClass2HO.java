package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2HO  reason: invalid class name */
public final class AnonymousClass2HO {
    public static Object A00(AnonymousClass601 r7, C63893iY r8) {
        HashMap hashMap;
        String str = (String) C63893iY.A07(r8);
        List list = r8.A00;
        Map map = (Map) list.get(1);
        if (map != null) {
            hashMap = C63913ic.A0N(map);
        } else {
            hashMap = null;
        }
        C04220Ms.A0B(r7, 0);
        FragmentActivity A05 = C63913ic.A05(r7);
        UserSession A0J = C63913ic.A0J(r7);
        C550831r.A01 = C18190wL.A0R(list, 2);
        C550831r.A00 = r7;
        AnonymousClass3IR r0 = AnonymousClass3IR.A00;
        if (r0 != null) {
            r0.A00(A05, A0J, str, hashMap);
            return null;
        }
        C550831r.A00();
        return null;
    }
}
