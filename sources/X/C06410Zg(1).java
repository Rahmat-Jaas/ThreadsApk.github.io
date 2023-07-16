package X;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: X.0Zg  reason: invalid class name and case insensitive filesystem */
public final class C06410Zg implements ListIterator, C03740Kn {
    public static final C06410Zg A00 = new C06410Zg();

    public final /* bridge */ /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean hasNext() {
        return false;
    }

    public final boolean hasPrevious() {
        return false;
    }

    public final int nextIndex() {
        return 0;
    }

    public final int previousIndex() {
        return -1;
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object next() {
        throw new NoSuchElementException();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        throw new NoSuchElementException();
    }
}
