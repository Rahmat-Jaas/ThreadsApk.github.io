package X;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.89J  reason: invalid class name */
public final class AnonymousClass89J extends AbstractList<Integer> implements RandomAccess, Serializable {
    public final int A00;
    public final int A01;
    public final int[] A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof AnonymousClass89J)) {
                return super.equals(obj);
            }
            AnonymousClass89J r8 = (AnonymousClass89J) obj;
            int size = size();
            if (r8.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.A02[this.A01 + i] != r8.A02[r8.A01 + i]) {
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
        if (obj instanceof Integer) {
            int[] iArr = this.A02;
            int A04 = AnonymousClass0wJ.A04(obj);
            int i = this.A01;
            int i2 = this.A00;
            while (true) {
                if (i >= i2) {
                    break;
                } else if (iArr[i] != A04) {
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
            i = (i * 31) + this.A02[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.A02;
            int A04 = AnonymousClass0wJ.A04(obj);
            int i = this.A01;
            int i2 = this.A00;
            int i3 = i;
            while (true) {
                if (i3 >= i2) {
                    break;
                } else if (iArr[i3] == A04) {
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
        if (obj instanceof Integer) {
            int[] iArr = this.A02;
            int A04 = AnonymousClass0wJ.A04(obj);
            int i = this.A01;
            int i2 = this.A00;
            while (true) {
                i2--;
                if (i2 < i) {
                    break;
                } else if (iArr[i2] == A04) {
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
        int[] iArr = this.A02;
        int i2 = this.A01 + i;
        int i3 = iArr[i2];
        number.getClass();
        iArr[i2] = number.intValue();
        return Integer.valueOf(i3);
    }

    public final int size() {
        return this.A00 - this.A01;
    }

    public AnonymousClass89J(int[] iArr, int i, int i2) {
        this.A02 = iArr;
        this.A01 = i;
        this.A00 = i2;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        AnonymousClass7Ko.A01(i, size());
        return Integer.valueOf(this.A02[this.A01 + i]);
    }

    public final List subList(int i, int i2) {
        AnonymousClass7Ko.A03(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        int[] iArr = this.A02;
        int i3 = this.A01;
        return new AnonymousClass89J(iArr, i + i3, i3 + i2);
    }

    public final String toString() {
        StringBuilder A0s = C86114wI.A0s(size() * 5);
        A0s.append('[');
        int[] iArr = this.A02;
        int i = this.A01;
        while (true) {
            A0s.append(iArr[i]);
            i++;
            if (i >= this.A00) {
                return C86114wI.A0q(A0s, ']');
            }
            C86144wL.A1T(A0s);
        }
    }
}
