package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2Ce  reason: invalid class name and case insensitive filesystem */
public final class C32522Ce {
    public static final String A00(String str, String... strArr) {
        List A0A = AnonymousClass8AP.A0A(strArr);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (Object next : A0A) {
            if (((String) next).length() != 0) {
                A0v.add(next);
            }
        }
        return C18200wM.A0l(str, A0v);
    }
}
