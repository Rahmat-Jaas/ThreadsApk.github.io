package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.7yc  reason: invalid class name and case insensitive filesystem */
public class C134937yc implements Iterable, C03740Kn {
    public final int A00;
    public final int A01;
    public final int A02;

    public static List A00(Object[] objArr, int i, int i2, int i3) {
        AnonymousClass8bH r2 = new AnonymousClass8bH(i, i2);
        if (r2.isEmpty()) {
            return AnonymousClass0ZV.A00;
        }
        int i4 = r2.A00;
        int i5 = r2.A01 + 1;
        C102556Vq.A00(i5, i3);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i4, i5);
        C04220Ms.A06(copyOfRange);
        List asList = Arrays.asList(copyOfRange);
        C04220Ms.A06(asList);
        return asList;
    }

    /* renamed from: A03 */
    public final C1367083z iterator() {
        return new AnonymousClass8AS(this.A00, this.A01, this.A02);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C134937yc)) {
            return false;
        }
        if (isEmpty() && ((C134937yc) obj).isEmpty()) {
            return true;
        }
        C134937yc r3 = (C134937yc) obj;
        if (this.A00 == r3.A00 && this.A01 == r3.A01 && this.A02 == r3.A02) {
            return true;
        }
        return false;
    }

    public final boolean isEmpty() {
        if (this instanceof AnonymousClass8bH) {
            return C86134wK.A1X(this.A00, this.A01);
        }
        int i = this.A02;
        int i2 = this.A00;
        int i3 = this.A01;
        if (i > 0) {
            if (i2 > i3) {
                return true;
            }
            return false;
        } else if (i2 < i3) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        int i = this.A02;
        StringBuilder A0r = C18200wM.A0r();
        int i2 = this.A00;
        if (i > 0) {
            A0r.append(i2);
            A0r.append("..");
            A0r.append(this.A01);
            A0r.append(" step ");
        } else {
            A0r.append(i2);
            A0r.append(" downTo ");
            A0r.append(this.A01);
            A0r.append(" step ");
            i = -i;
        }
        return C86144wL.A0v(A0r, i);
    }

    public C134937yc(int i, int i2, int i3) {
        if (i3 == 0) {
            throw C18190wL.A0a("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.A00 = i;
            this.A01 = C102586Vt.A00(i, i2, i3);
            this.A02 = i3;
        } else {
            throw C18190wL.A0a("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.A00 * 31) + this.A01) * 31) + this.A02;
    }
}
