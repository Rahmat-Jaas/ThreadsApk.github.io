package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.2O5  reason: invalid class name */
public final class AnonymousClass2O5 {
    public static final AnonymousClass2O6 A00(C81464nq r5, String str, Map map) {
        StringBuilder A0s;
        Set set = (Set) C60893Qy.A00.get(r5);
        if (set != null) {
            Set A00 = AnonymousClass4WL.A00(map.keySet(), set);
            if (!C18190wL.A1a(A00)) {
                return new AnonymousClass1pE(map);
            }
            A0s = C18200wM.A0r();
            A0s.append(str);
            A0s.append(" parameters [");
            A0s.append(AnonymousClass00J.A0H((CharSequence) null, (CharSequence) null, (CharSequence) null, A00, (AnonymousClass0YY) null, 63));
            A0s.append("] have not been set");
        } else {
            A0s = C18190wL.A0s("No parameters have been defined in contract ");
            A0s.append(C18210wN.A0l(r5.getClass()));
        }
        return new AnonymousClass1pD(A0s.toString());
    }
}
