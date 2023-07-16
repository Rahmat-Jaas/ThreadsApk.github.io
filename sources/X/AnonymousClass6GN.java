package X;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;

/* renamed from: X.6GN  reason: invalid class name */
public final class AnonymousClass6GN {
    public static final Object A00(C63893iY r8) {
        String str;
        C04220Ms.A0B(r8, 0);
        Object A0B = C63893iY.A0B(r8, 0);
        A0B.getClass();
        String A0h = C86164wN.A0h(A0B);
        Object A08 = C63893iY.A08(r8);
        C04220Ms.A0C(A08, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Int>");
        Object A09 = C63893iY.A09(r8);
        C04220Ms.A0C(A09, C18170wI.A00(9));
        Collection collection = (Collection) A09;
        String str2 = (String) C63893iY.A0C(r8, A0h, 3);
        String str3 = (String) C63893iY.A0C(r8, A0h, 4);
        C40921Lrg lrg = new C40921Lrg(str3, ByteBuffer.wrap(Base64.decode((String) A0B, 0)));
        int[] A0m = AnonymousClass00J.A0m((Collection) A08);
        C04220Ms.A0B(str2, 0);
        String A00 = lrg.A00(str2, A0m);
        if (A00 == null) {
            return null;
        }
        String[] A1b = C18190wL.A1b(str3, "_", 0);
        String str4 = A1b[0];
        if (A1b.length > 1) {
            str = A1b[1];
        } else {
            str = "";
        }
        Locale locale = new Locale(str4, str);
        String[] strArr = (String[]) collection.toArray(new String[0]);
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        return C86104wH.A11(A00, locale, copyOf, copyOf.length);
    }
}
