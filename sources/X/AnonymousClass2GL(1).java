package X;

import android.content.Context;
import java.util.Iterator;

/* renamed from: X.2GL  reason: invalid class name */
public final class AnonymousClass2GL {
    public static final Object A00(AnonymousClass601 r6, C63893iY r7) {
        Context context;
        Object obj;
        boolean A1Z = AnonymousClass0wJ.A1Z(r7, r6);
        String A0D = C63893iY.A0D(r7, 0);
        int A04 = AnonymousClass0wJ.A04(C63893iY.A0A(r7, A1Z ? 1 : 0));
        AnonymousClass3HX r0 = r6.A00;
        if (!(r0 == null || (context = r0.A00) == null)) {
            AnonymousClass3R8.A00(context);
            Iterator it = ((Iterable) C60913Rb.A02.getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((AnonymousClass3YK) obj).A09.equalsIgnoreCase(A0D)) {
                    break;
                }
            }
            AnonymousClass3YK r1 = (AnonymousClass3YK) obj;
            if (r1 != null) {
                r1.A01(C61163Sd.A00(r1.A07.A00, A04));
            }
        }
        return null;
    }
}
