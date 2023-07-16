package X;

import java.util.Iterator;

/* renamed from: X.5qZ  reason: invalid class name */
public final class AnonymousClass5qZ extends C93645qb {
    public final transient AnonymousClass5qX A00;
    public final transient AnonymousClass84U A01;

    public final AnonymousClass5qX A08() {
        return this.A00;
    }

    public final int A06(Object[] objArr, int i) {
        return this.A00.A06(objArr, 0);
    }

    public final boolean contains(Object obj) {
        return AnonymousClass0wJ.A1W(this.A01.get(obj));
    }

    public final /* synthetic */ Iterator iterator() {
        return this.A00.listIterator(0);
    }

    public final int size() {
        return this.A01.size();
    }

    public AnonymousClass5qZ(AnonymousClass5qX r1, AnonymousClass84U r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
