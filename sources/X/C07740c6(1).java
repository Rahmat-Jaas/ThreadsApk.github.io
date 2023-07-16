package X;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/* renamed from: X.0c6  reason: invalid class name and case insensitive filesystem */
public final class C07740c6 extends PhantomReference implements C05290Sl {
    public final Object A00;

    public C07740c6(Object obj, Object obj2, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        this.A00 = obj2;
    }

    public final Object AnW() {
        return this.A00;
    }
}
