package X;

import java.util.ArrayList;

/* renamed from: X.7g0  reason: invalid class name and case insensitive filesystem */
public final class C126827g0 implements C143398ge {
    public final C142118dt C7H(C142118dt r3, AnonymousClass0ZU r4) {
        Object r32;
        C04220Ms.A0B(r4, 1);
        if (r3 == null) {
            r32 = r4.invoke();
        } else {
            Object invoke = r4.invoke();
            if (invoke == null) {
                return r3;
            }
            AnonymousClass8rP r1 = (AnonymousClass8rP) invoke;
            C04220Ms.A0B(r1, 1);
            ArrayList A0v = AnonymousClass0wJ.A0v();
            ((AnonymousClass8rP) r3).ALR(A0v);
            r1.ALR(A0v);
            r32 = new C133677wA(A0v);
        }
        return (C142118dt) r32;
    }
}
