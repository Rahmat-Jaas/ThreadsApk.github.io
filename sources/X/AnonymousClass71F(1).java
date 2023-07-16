package X;

import java.io.StringWriter;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.71F  reason: invalid class name */
public final class AnonymousClass71F {
    public static C113776s7 parseFromJson(MMo mMo) {
        return (C113776s7) C86104wH.A0e(mMo, 115);
    }

    public static String A00(C113776s7 r5) {
        StringWriter A0d = C18230wP.A0d();
        MMp A0K = C18180wK.A0K(A0d);
        if (r5.A00 != null) {
            A0K.A0U("timestamps");
            A0K.A0J();
            Iterator A0u = C18190wL.A0u(r5.A00);
            while (A0u.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0u);
                if (C86104wH.A0c(A0K, A0o) == null) {
                    A0K.A0H();
                } else {
                    A0K.A0O(C18190wL.A08(A0o.getValue()));
                }
            }
            A0K.A0G();
        }
        if (r5.A01 != null) {
            A0K.A0U("keys");
            A0K.A0I();
            Iterator it = r5.A01.iterator();
            while (it.hasNext()) {
                String A0k = C18180wK.A0k(it);
                if (A0k != null) {
                    A0K.A0Y(A0k);
                }
            }
            A0K.A0F();
        }
        return C18180wK.A0h(A0K, A0d);
    }
}
