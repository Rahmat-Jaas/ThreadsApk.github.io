package X;

import java.util.ListIterator;

/* renamed from: X.84O  reason: invalid class name */
public final class AnonymousClass84O implements ListIterator, AnonymousClass0Wi {
    public final /* synthetic */ AnonymousClass84J A00;
    public final /* synthetic */ AnonymousClass0MZ A01;

    public AnonymousClass84O(AnonymousClass84J r1, AnonymousClass0MZ r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void add(Object obj) {
        throw C18180wK.A0a("Cannot modify a state list through an iterator");
    }

    public final boolean hasNext() {
        if (this.A01.A00 >= this.A00.size() - 1) {
            return false;
        }
        return true;
    }

    public final boolean hasPrevious() {
        return C86114wI.A1S(this.A01.A00);
    }

    public final Object next() {
        AnonymousClass0MZ r3 = this.A01;
        int i = r3.A00 + 1;
        AnonymousClass84J r1 = this.A00;
        C1187272a.A00(i, r1.size());
        r3.A00 = i;
        return r1.get(i);
    }

    public final int nextIndex() {
        return this.A01.A00 + 1;
    }

    public final Object previous() {
        AnonymousClass0MZ r3 = this.A01;
        int i = r3.A00;
        AnonymousClass84J r1 = this.A00;
        C1187272a.A00(i, r1.size());
        r3.A00 = i - 1;
        return r1.get(i);
    }

    public final int previousIndex() {
        return this.A01.A00;
    }

    public final /* bridge */ /* synthetic */ void remove() {
        throw C18180wK.A0a("Cannot modify a state list through an iterator");
    }

    public final /* bridge */ /* synthetic */ void set(Object obj) {
        throw C18180wK.A0a("Cannot modify a state list through an iterator");
    }
}
