package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.4Tl  reason: invalid class name and case insensitive filesystem */
public abstract class C73694Tl implements Iterator, C03740Kn {
    public Integer A00 = AnonymousClass006.A01;
    public Object A01;

    public void A00() {
        Integer num;
        AnonymousClass4WG r3 = (AnonymousClass4WG) this;
        while (true) {
            Iterator it = r3.A01;
            if (!it.hasNext()) {
                num = AnonymousClass006.A0C;
                break;
            }
            Object next = it.next();
            if (r3.A00.add(r3.A02.invoke(next))) {
                r3.A01 = next;
                num = AnonymousClass006.A00;
                break;
            }
        }
        r3.A00 = num;
    }

    public final boolean hasNext() {
        Integer num = this.A00;
        Integer num2 = AnonymousClass006.A0N;
        if (num != num2) {
            int intValue = num.intValue();
            if (intValue == 2) {
                return false;
            }
            if (intValue == 0) {
                return true;
            }
            this.A00 = num2;
            A00();
            return C18180wK.A1Z(this.A00, AnonymousClass006.A00);
        }
        throw C18190wL.A0a(AnonymousClass000.A00(259));
    }

    public final Object next() {
        if (hasNext()) {
            this.A00 = AnonymousClass006.A01;
            return this.A01;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw C18220wO.A0v();
    }
}
