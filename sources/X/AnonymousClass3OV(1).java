package X;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3OV  reason: invalid class name */
public final class AnonymousClass3OV {
    public static final List A01(String str, AnonymousClass0YY r4) {
        if (str == null) {
            return AnonymousClass0ZV.A00;
        }
        MMo A08 = C18987Aon.A00.A08(str);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        if (A08.A0g() != C40318LcR.START_ARRAY) {
            return A0v;
        }
        while (A08.A0g() != C40318LcR.END_ARRAY) {
            Object invoke = r4.invoke(A08);
            if (invoke != null) {
                A0v.add(invoke);
            }
        }
        return A0v;
    }

    public static final String A00(List list, AnonymousClass0YP r5) {
        StringWriter A0d = C18230wP.A0d();
        MMp A04 = C18987Aon.A00.A04(A0d);
        A04.A0I();
        for (Object invoke : list) {
            r5.invoke(A04, invoke);
        }
        A04.A0F();
        A04.close();
        return C18190wL.A0n(A0d);
    }
}
