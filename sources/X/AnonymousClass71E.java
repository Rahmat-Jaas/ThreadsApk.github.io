package X;

import java.io.StringWriter;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.71E  reason: invalid class name */
public final class AnonymousClass71E {
    public static C113766s6 parseFromJson(MMo mMo) {
        return (C113766s6) C86104wH.A0e(mMo, 114);
    }

    public static String A00(C113766s6 r6) {
        StringWriter A0d = C18230wP.A0d();
        MMp A0K = C18180wK.A0K(A0d);
        if (r6.A01 != null) {
            A0K.A0U("seen_states");
            A0K.A0J();
            Iterator A0u = C18190wL.A0u(r6.A01);
            while (A0u.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0u);
                if (C86104wH.A0c(A0K, A0o) == null) {
                    A0K.A0H();
                } else {
                    C111926of r1 = (C111926of) A0o.getValue();
                    A0K.A0J();
                    if (r1.A00 != null) {
                        A0K.A0U("seen_media_ids");
                        A0K.A0J();
                        Iterator A0u2 = C18190wL.A0u(r1.A00);
                        while (A0u2.hasNext()) {
                            Map.Entry A0o2 = C18180wK.A0o(A0u2);
                            if (C86104wH.A0c(A0K, A0o2) == null) {
                                A0K.A0H();
                            } else {
                                A0K.A0O(C18190wL.A08(A0o2.getValue()));
                            }
                        }
                        A0K.A0G();
                    }
                    A0K.A0G();
                }
            }
            A0K.A0G();
        }
        if (r6.A02 != null) {
            A0K.A0U("keys");
            A0K.A0I();
            Iterator it = r6.A02.iterator();
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
