package X;

/* renamed from: X.72B  reason: invalid class name */
public final class AnonymousClass72B {
    public static final Object A00(Object obj, AnonymousClass0YP r2, C27399Emr emr) {
        Object obj2;
        Object A0B;
        try {
            C03940Lk.A03(r2, 2);
            obj2 = r2.invoke(obj, emr);
        } catch (Throwable th) {
            obj2 = new C25463Dm5(false, th);
        }
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        if (obj2 == d0e || (A0B = emr.A0B(obj2)) == C25299DjK.A04) {
            return d0e;
        }
        if (!(A0B instanceof C25463Dm5)) {
            return C25299DjK.A00(A0B);
        }
        throw ((C25463Dm5) A0B).A00;
    }

    public static final void A01(Object obj, C146958n9 r2, AnonymousClass0YP r3) {
        try {
            C03940Lk.A03(r3, 2);
            Object invoke = r3.invoke(obj, r2);
            if (invoke != D0E.COROUTINE_SUSPENDED) {
                r2.resumeWith(invoke);
            }
        } catch (Throwable th) {
            C146958n9.A00(th, r2);
        }
    }
}
