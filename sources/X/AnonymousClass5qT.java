package X;

import java.util.AbstractMap;

/* renamed from: X.5qT  reason: invalid class name */
public final class AnonymousClass5qT extends AnonymousClass5qX {
    public final /* synthetic */ C93635qa A00;

    public final int size() {
        return this.A00.A00;
    }

    public AnonymousClass5qT(C93635qa r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        C93635qa r1 = this.A00;
        C121287Fi.A01(i, r1.A00);
        int i2 = i + i;
        Object[] A01 = r1.A02;
        Object obj = A01[i2];
        obj.getClass();
        Object obj2 = A01[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }
}
