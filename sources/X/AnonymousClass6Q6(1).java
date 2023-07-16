package X;

import com.instagram.common.lispy.lang.BloksScript;
import java.util.Map;

/* renamed from: X.6Q6  reason: invalid class name */
public final class AnonymousClass6Q6 {
    public static Object A00(C110486ll r4, Map map) {
        if (!map.containsKey("initial_lispy")) {
            return map.get("initial");
        }
        try {
            String A0r = C18220wO.A0r("initial_lispy", map);
            return AnonymousClass70N.A00(C63893iY.A01, r4, new C109326jp(new BloksScript(A0r), (C109346jr) null, r4.A04));
        } catch (AnonymousClass6C9 e) {
            C30967GcS.A01((AnonymousClass3HX) null, "StateModule", "Exception gettin initial_lispy value", e, 0);
            return null;
        }
    }
}
