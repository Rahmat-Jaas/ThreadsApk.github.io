package X;

import com.instagram.common.lispy.lang.BloksScript;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6Q8  reason: invalid class name */
public final class AnonymousClass6Q8 {
    public static final C114406tF A00(Map map) {
        C04220Ms.A0B(map, 0);
        LinkedHashMap A0y = C18220wO.A0y();
        Iterator A0z = AnonymousClass0wJ.A0z(map);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            A0y.put(A0o.getKey(), new BloksScript(C18230wP.A0u(A0o)));
        }
        return new C114406tF(A0y);
    }
}
