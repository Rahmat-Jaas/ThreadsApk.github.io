package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2BV  reason: invalid class name */
public final class AnonymousClass2BV {
    public static final Object A00(C63893iY r8) {
        C04220Ms.A0B(r8, 0);
        int i = 0;
        Object A0B = C63893iY.A0B(r8, 0);
        A0B.getClass();
        C18240wQ.A1I(A0B);
        Integer num = AnonymousClass006.A0N;
        Integer[] A1a = C18240wQ.A1a();
        int length = A1a.length;
        while (true) {
            if (i >= length) {
                break;
            }
            Integer num2 = A1a[i];
            if (C04220Ms.A0I(C36532Rr.A00(num2), A0B)) {
                num = num2;
                break;
            }
            i++;
        }
        Context A08 = C18230wP.A08();
        C04220Ms.A0B(num, 0);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        List A00 = C50662tM.A00(A08);
        if (!A00.isEmpty()) {
            A0v.addAll(A00);
        }
        String str = AnonymousClass2BE.A00;
        if (!(str == null || str.length() == 0)) {
            A0v.add(str);
        }
        return A0v;
    }
}
