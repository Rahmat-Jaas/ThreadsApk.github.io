package X;

import java.lang.reflect.Array;
import java.util.AbstractList;

/* renamed from: X.89C  reason: invalid class name */
public final class AnonymousClass89C extends AbstractList {
    public final /* synthetic */ Object A00;

    public AnonymousClass89C(Object obj) {
        this.A00 = obj;
    }

    public final Object get(int i) {
        return Array.get(this.A00, i);
    }

    public final int size() {
        return Array.getLength(this.A00);
    }
}
