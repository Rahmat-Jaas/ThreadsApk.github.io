package X;

import kotlin.Unit;

/* renamed from: X.4tk  reason: invalid class name and case insensitive filesystem */
public interface C84714tk {
    Object collect(C83234r0 r1, C146958n9 r2);

    static Object A00(C146958n9 r0, C84714tk r1, C83234r0 r2) {
        Object collect = r1.collect(r2, r0);
        if (collect != D0E.COROUTINE_SUSPENDED) {
            return Unit.A00;
        }
        return collect;
    }
}
