package X;

import java.lang.ref.PhantomReference;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0SR  reason: invalid class name */
public abstract class AnonymousClass0SR extends PhantomReference {
    public AnonymousClass0SR next;
    public AnonymousClass0SR previous;

    public abstract void destruct();

    public AnonymousClass0SR(Object obj) {
        super(obj, AnonymousClass0SU.A02);
        AtomicReference atomicReference;
        AnonymousClass0SR r0;
        AnonymousClass0ST r2 = AnonymousClass0SU.A01;
        do {
            atomicReference = r2.A00;
            r0 = (AnonymousClass0SR) atomicReference.get();
            this.next = r0;
        } while (!atomicReference.compareAndSet(r0, this));
    }

    public /* synthetic */ AnonymousClass0SR(AnonymousClass0SQ r1) {
        this();
    }

    public AnonymousClass0SR() {
        super((Object) null, AnonymousClass0SU.A02);
    }
}
