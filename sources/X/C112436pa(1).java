package X;

import java.lang.reflect.Array;

/* renamed from: X.6pa  reason: invalid class name and case insensitive filesystem */
public final class C112436pa {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Class A01;
    public final /* synthetic */ Object A02;

    public final boolean equals(Object obj) {
        int i;
        if (obj != this) {
            if (obj != null && obj.getClass() == this.A01 && Array.getLength(obj) == (i = this.A00)) {
                int i2 = 0;
                while (i2 < i) {
                    Object obj2 = Array.get(this.A02, i2);
                    Object obj3 = Array.get(obj, i2);
                    if (obj2 == obj3 || obj2 == null || obj2.equals(obj3)) {
                        i2++;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public C112436pa(Class cls, Object obj, int i) {
        this.A01 = cls;
        this.A00 = i;
        this.A02 = obj;
    }
}
