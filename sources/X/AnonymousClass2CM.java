package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2CM  reason: invalid class name */
public final class AnonymousClass2CM {
    public static final List A00(List list) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        int size = list.size() - 1;
        for (int i = 1; i < size; i++) {
            if (C18230wP.A01(list, i) >= C18230wP.A01(list, i - 1) && C18230wP.A01(list, i) >= C18230wP.A01(list, i + 1)) {
                C18200wM.A1U(A0v, i);
            }
        }
        return A0v;
    }
}
