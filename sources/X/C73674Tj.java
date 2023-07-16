package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.4Tj  reason: invalid class name and case insensitive filesystem */
public abstract class C73674Tj implements Iterator, C03740Kn {
    public final /* bridge */ /* synthetic */ Object next() {
        AnonymousClass0OL r3 = (AnonymousClass0OL) this;
        try {
            byte[] bArr = r3.A01;
            int i = r3.A00;
            r3.A00 = i + 1;
            return Byte.valueOf(bArr[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            r3.A00--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public final void remove() {
        throw C18220wO.A0v();
    }
}
