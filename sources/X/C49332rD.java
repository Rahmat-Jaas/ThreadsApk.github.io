package X;

import com.instagram.service.session.UserSession;
import java.util.WeakHashMap;

/* renamed from: X.2rD  reason: invalid class name and case insensitive filesystem */
public final class C49332rD {
    public static final AnonymousClass3S9 A00(C10300i6 r3) {
        C04220Ms.A0B(r3, 0);
        if (!(r3 instanceof UserSession)) {
            AnonymousClass3S9 r2 = new AnonymousClass3S9();
            WeakHashMap weakHashMap = AnonymousClass3S9.A01;
            if (!weakHashMap.containsKey(r3) || weakHashMap.get(r3) == null) {
                weakHashMap.put(r3, r2);
                return r2;
            }
            AnonymousClass3S9 r0 = (AnonymousClass3S9) weakHashMap.get(r3);
            if (r0 != null) {
                return r0;
            }
            return r2;
        }
        throw C18180wK.A0a("Check failed.");
    }
}
