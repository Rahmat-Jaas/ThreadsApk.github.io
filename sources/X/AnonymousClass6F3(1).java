package X;

import java.util.Iterator;
import java.util.Map;
import kotlin.Function;

/* renamed from: X.6F3  reason: invalid class name */
public final class AnonymousClass6F3 {
    public static final C134887yX A00(C147738pp r7) {
        AnonymousClass7YG r1 = ((AnonymousClass7YG) r7).A03.A02;
        C147738pp r2 = null;
        if (r1 != null && (r1.A00 & 8) != 0) {
            while (true) {
                if ((r1.A01 & 8) == 0) {
                    r1 = r1.A02;
                    if (r1 == null) {
                        break;
                    }
                } else {
                    r2 = r1;
                    break;
                }
            }
        }
        if (!(r2 instanceof C147738pp)) {
            r2 = null;
        }
        C147738pp r22 = r2;
        if (r22 == null || r7.BAK().A00) {
            return r7.BAK();
        }
        C134887yX BAK = r7.BAK();
        C134887yX r72 = new C134887yX();
        r72.A01 = BAK.A01;
        r72.A00 = BAK.A00;
        Map map = r72.A02;
        map.putAll(BAK.A02);
        C134887yX A00 = A00(r22);
        C04220Ms.A0B(A00, 0);
        if (A00.A01) {
            r72.A01 = true;
        }
        if (A00.A00) {
            r72.A00 = true;
        }
        Iterator A0z = AnonymousClass0wJ.A0z(A00.A02);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            Object key = A0o.getKey();
            Object value = A0o.getValue();
            if (!map.containsKey(key)) {
                map.put(key, value);
            } else if (value instanceof AnonymousClass79M) {
                Object obj = map.get(key);
                C04220Ms.A0C(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                AnonymousClass79M r12 = (AnonymousClass79M) obj;
                String str = r12.A00;
                if (str == null) {
                    str = ((AnonymousClass79M) value).A00;
                }
                Function function = r12.A01;
                if (function == null) {
                    function = ((AnonymousClass79M) value).A01;
                }
                map.put(key, new AnonymousClass79M(str, function));
            }
        }
        return r72;
    }
}
