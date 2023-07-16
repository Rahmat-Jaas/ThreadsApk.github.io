package X;

import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: X.72I  reason: invalid class name */
public final class AnonymousClass72I {
    public static final AnonymousClass534 A00 = AnonymousClass7Ai.A00(AnonymousClass4ZU.A00);

    public static final AnonymousClass092 A00(C147188nY r4) {
        r4.Cvb(-2068013981);
        AnonymousClass092 r3 = (AnonymousClass092) r4.AEA(A00);
        r4.Cvb(1680121597);
        if (r3 == null) {
            Object AEA = r4.AEA(AnonymousClass7DA.A05);
            C04220Ms.A0B(AEA, 0);
            r3 = (AnonymousClass092) C146838mw.A00(AnonymousClass8Ka.A00, AnonymousClass8bL.A08(AEA, AnonymousClass8KZ.A00));
        }
        AnonymousClass7W3 r2 = (AnonymousClass7W3) r4;
        AnonymousClass7W3.A0w(r2, false);
        if (r3 == null) {
            Context A0T = C147188nY.A0T(r4);
            while (true) {
                if (A0T instanceof ContextWrapper) {
                    if (A0T instanceof AnonymousClass092) {
                        break;
                    }
                    A0T = ((ContextWrapper) A0T).getBaseContext();
                    C04220Ms.A06(A0T);
                } else {
                    A0T = null;
                    break;
                }
            }
            r3 = (AnonymousClass092) A0T;
        }
        AnonymousClass7W3.A0w(r2, false);
        return r3;
    }
}
