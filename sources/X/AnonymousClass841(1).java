package X;

import java.util.Iterator;

/* renamed from: X.841  reason: invalid class name */
public final class AnonymousClass841 implements Iterator, C03740Kn {
    public int A00;
    public final /* synthetic */ AnonymousClass84Z A01;

    public AnonymousClass841(AnonymousClass84Z r1) {
        this.A01 = r1;
    }

    public final boolean hasNext() {
        return C18230wP.A1W(this.A00, this.A01.size());
    }

    public final Object next() {
        Object[] objArr = this.A01.A01;
        int i = this.A00;
        this.A00 = i + 1;
        Object obj = objArr[i];
        C04220Ms.A0C(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
        return obj;
    }

    public final void remove() {
        throw C18220wO.A0v();
    }
}
