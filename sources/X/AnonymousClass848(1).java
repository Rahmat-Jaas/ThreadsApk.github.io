package X;

import java.util.Iterator;

/* renamed from: X.848  reason: invalid class name */
public final class AnonymousClass848 implements Iterator, C03740Kn {
    public int A00 = -2;
    public Object A01;
    public final /* synthetic */ C1370986c A02;

    public AnonymousClass848(C1370986c r2) {
        this.A02 = r2;
    }

    private final void A00() {
        Object invoke;
        int i = this.A00;
        C1370986c r0 = this.A02;
        if (i == -2) {
            invoke = r0.A00.invoke();
        } else {
            AnonymousClass0YY r1 = r0.A01;
            Object obj = this.A01;
            C04220Ms.A0A(obj);
            invoke = r1.invoke(obj);
        }
        this.A01 = invoke;
        int i2 = 1;
        if (invoke == null) {
            i2 = 0;
        }
        this.A00 = i2;
    }

    public final boolean hasNext() {
        if (this.A00 < 0) {
            A00();
        }
        if (this.A00 != 1) {
            return false;
        }
        return true;
    }

    public final Object next() {
        if (this.A00 < 0) {
            A00();
        }
        if (this.A00 != 0) {
            Object obj = this.A01;
            C04220Ms.A0C(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.A00 = -1;
            return obj;
        }
        throw C86154wM.A0u();
    }

    public final void remove() {
        throw C18220wO.A0v();
    }
}
