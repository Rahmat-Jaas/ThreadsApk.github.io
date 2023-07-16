package X;

import androidx.navigation.Navigator$Name;
import java.util.Map;

/* renamed from: X.6nF  reason: invalid class name and case insensitive filesystem */
public final class C111386nF {
    public final String A00(Class cls) {
        C04220Ms.A0B(cls, 0);
        Map map = C1200478h.A02;
        String A0r = C18220wO.A0r(cls, map);
        if (A0r == null) {
            Navigator$Name navigator$Name = (Navigator$Name) cls.getAnnotation(Navigator$Name.class);
            if (navigator$Name == null || (A0r = navigator$Name.value()) == null || A0r.length() <= 0) {
                throw C18190wL.A0a(AnonymousClass00U.A0L("No @Navigator.Name annotation found for ", cls.getSimpleName()));
            }
            map.put(cls, A0r);
        }
        return A0r;
    }
}
