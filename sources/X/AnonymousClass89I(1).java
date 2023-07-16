package X;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.89I  reason: invalid class name */
public final class AnonymousClass89I extends AbstractList<Double> implements RandomAccess, Serializable {
    public final int A00;
    public final int A01;
    public final double[] A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof AnonymousClass89I)) {
                return super.equals(obj);
            }
            AnonymousClass89I r10 = (AnonymousClass89I) obj;
            int size = size();
            if (r10.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.A02[this.A01 + i] != r10.A02[r10.A01 + i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        return false;
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Double) {
            double[] dArr = this.A02;
            double A002 = C86124wJ.A00(obj);
            int i = this.A01;
            int i2 = this.A00;
            while (true) {
                if (i >= i2) {
                    break;
                } else if (dArr[i] != A002) {
                    i++;
                } else if (i == -1) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = this.A01; i2 < this.A00; i2++) {
            i = C18220wO.A06(Double.valueOf(this.A02[i2]), i * 31);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (obj instanceof Double) {
            double[] dArr = this.A02;
            double A002 = C86124wJ.A00(obj);
            int i = this.A01;
            int i2 = this.A00;
            int i3 = i;
            while (true) {
                if (i3 >= i2) {
                    break;
                } else if (dArr[i3] == A002) {
                    int i4 = i3 - i;
                    if (i3 < 0) {
                        return -1;
                    }
                    return i4;
                } else {
                    i3++;
                }
            }
        }
        return -1;
    }

    public final int lastIndexOf(Object obj) {
        if (obj instanceof Double) {
            double[] dArr = this.A02;
            double A002 = C86124wJ.A00(obj);
            int i = this.A01;
            int i2 = this.A00;
            while (true) {
                i2--;
                if (i2 < i) {
                    break;
                } else if (dArr[i2] == A002) {
                    int i3 = i2 - i;
                    if (i2 < 0) {
                        return -1;
                    }
                    return i3;
                }
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        Number number = (Number) obj;
        AnonymousClass7Ko.A01(i, size());
        double[] dArr = this.A02;
        int i2 = this.A01 + i;
        double d = dArr[i2];
        number.getClass();
        dArr[i2] = number.doubleValue();
        return Double.valueOf(d);
    }

    public final int size() {
        return this.A00 - this.A01;
    }

    public AnonymousClass89I(double[] dArr, int i, int i2) {
        this.A02 = dArr;
        this.A01 = i;
        this.A00 = i2;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        AnonymousClass7Ko.A01(i, size());
        return Double.valueOf(this.A02[this.A01 + i]);
    }

    public final List subList(int i, int i2) {
        AnonymousClass7Ko.A03(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        double[] dArr = this.A02;
        int i3 = this.A01;
        return new AnonymousClass89I(dArr, i + i3, i3 + i2);
    }

    public final String toString() {
        StringBuilder A0s = C86114wI.A0s(size() * 12);
        A0s.append('[');
        double[] dArr = this.A02;
        int i = this.A01;
        while (true) {
            A0s.append(dArr[i]);
            i++;
            if (i >= this.A00) {
                return C86114wI.A0q(A0s, ']');
            }
            C86144wL.A1T(A0s);
        }
    }
}
