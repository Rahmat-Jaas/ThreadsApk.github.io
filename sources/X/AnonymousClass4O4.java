package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.4O4  reason: invalid class name */
public final class AnonymousClass4O4 implements Iterable {
    public final int A00;
    public final int A01;
    public final List A02;

    public final boolean equals(Object obj) {
        int i;
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                AnonymousClass4O4 r7 = (AnonymousClass4O4) obj;
                int i2 = this.A01;
                if (i2 == r7.A01 && (i = this.A00) == r7.A00) {
                    while (i2 <= i) {
                        if (this.A02.get(i2).equals(r7.A02.get(i2))) {
                            i2++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final Object A00(int i) {
        return this.A02.get(this.A01 + i);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = this.A01; i2 <= this.A00; i2++) {
            i = (i * 31) + AnonymousClass0wJ.A03(this.A02.get(i2));
        }
        return i;
    }

    public final Iterator iterator() {
        return this.A02.subList(this.A01, this.A00 + 1).iterator();
    }

    public AnonymousClass4O4(List list, int i, int i2) {
        this.A02 = list;
        this.A01 = i;
        this.A00 = Math.min(i + i2, list.size()) - 1;
    }
}
