package X;

import android.util.LruCache;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.7GM  reason: invalid class name */
public final class AnonymousClass7GM {
    public static final AnonymousClass7GM A00 = new AnonymousClass7GM();

    public static final boolean A00(UserSession userSession, User user) {
        C04220Ms.A0B(userSession, 1);
        String id = user.getId();
        C04220Ms.A0B(id, 0);
        LruCache lruCache = ((C131977t7) userSession.A01(C131977t7.class, AnonymousClass8IG.A00)).A00;
        Boolean bool = (Boolean) lruCache.get(id);
        if (bool != null) {
            return bool.booleanValue();
        }
        List A1O = user.A1O();
        if (A1O == null || !C86144wL.A1W(1, A1O)) {
            return false;
        }
        String id2 = user.getId();
        C04220Ms.A0B(id2, 0);
        lruCache.put(id2, true);
        return true;
    }

    public static final boolean A01(User user) {
        List A1O = user.A1O();
        if (A1O == null || !C86144wL.A1W(0, A1O) || !C18200wM.A0C().getBoolean(C18170wI.A00(1409), true)) {
            return false;
        }
        return true;
    }
}
