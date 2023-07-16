package X;

import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape4S0401000_I2;

/* renamed from: X.3J4  reason: invalid class name */
public final class AnonymousClass3J4 {
    public static final Object A00(AnonymousClass061 r5, AnonymousClass062 r6, C146958n9 r7, AnonymousClass0YP r8) {
        Object A01;
        AnonymousClass061 r2 = r5;
        if (r5 != AnonymousClass061.INITIALIZED) {
            AnonymousClass062 r3 = r6;
            if (((C14340pE) r3).A00 == AnonymousClass061.DESTROYED || (A01 = AnonymousClass7Ja.A01(r7, new KtSLambdaShape4S0401000_I2((Object) r2, (Object) r3, (Object) r8, (C146958n9) null, 7))) != D0E.COROUTINE_SUSPENDED) {
                return Unit.A00;
            }
            return A01;
        }
        throw C18190wL.A0a("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
    }

    public static final Object A01(AnonymousClass061 r1, AnonymousClass066 r2, C146958n9 r3, AnonymousClass0YP r4) {
        Object A00 = A00(r1, r2.getLifecycle(), r3, r4);
        if (A00 != D0E.COROUTINE_SUSPENDED) {
            return Unit.A00;
        }
        return A00;
    }
}
