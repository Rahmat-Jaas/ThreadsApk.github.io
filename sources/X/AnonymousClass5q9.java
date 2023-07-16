package X;

import java.util.Iterator;

/* renamed from: X.5q9  reason: invalid class name */
public final class AnonymousClass5q9 extends AnonymousClass5qB {
    public final transient Object A00;

    public final /* synthetic */ Iterator iterator() {
        return new AnonymousClass5qC(this.A00);
    }

    public final int size() {
        return 1;
    }

    public final boolean contains(Object obj) {
        return this.A00.equals(obj);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AnonymousClass00U.A0M("[", this.A00.toString(), ']');
    }

    public AnonymousClass5q9(Object obj) {
        this.A00 = obj;
    }
}
