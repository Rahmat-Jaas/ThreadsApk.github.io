package X;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.89K  reason: invalid class name */
public final class AnonymousClass89K extends AbstractList<Long> implements RandomAccess, Serializable {
    public final int A00;
    public final int A01;
    public final long[] A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof AnonymousClass89K)) {
                return super.equals(obj);
            }
            AnonymousClass89K r10 = (AnonymousClass89K) obj;
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
        if (obj instanceof Long) {
            long[] jArr = this.A02;
            long A08 = C18190wL.A08(obj);
            int i = this.A01;
            int i2 = this.A00;
            while (true) {
                if (i >= i2) {
                    break;
                } else if (jArr[i] != A08) {
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
            i = (i * 31) + C18190wL.A02(this.A02[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (obj instanceof Long) {
            long[] jArr = this.A02;
            long A08 = C18190wL.A08(obj);
            int i = this.A01;
            int i2 = this.A00;
            int i3 = i;
            while (true) {
                if (i3 >= i2) {
                    break;
                } else if (jArr[i3] == A08) {
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
        if (obj instanceof Long) {
            long[] jArr = this.A02;
            long A08 = C18190wL.A08(obj);
            int i = this.A01;
            int i2 = this.A00;
            while (true) {
                i2--;
                if (i2 < i) {
                    break;
                } else if (jArr[i2] == A08) {
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
        long[] jArr = this.A02;
        int i2 = this.A01 + i;
        long j = jArr[i2];
        number.getClass();
        jArr[i2] = number.longValue();
        return Long.valueOf(j);
    }

    public final int size() {
        return this.A00 - this.A01;
    }

    public AnonymousClass89K(long[] jArr, int i, int i2) {
        this.A02 = jArr;
        this.A01 = i;
        this.A00 = i2;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        AnonymousClass7Ko.A01(i, size());
        return Long.valueOf(this.A02[this.A01 + i]);
    }

    public final List subList(int i, int i2) {
        AnonymousClass7Ko.A03(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        long[] jArr = this.A02;
        int i3 = this.A01;
        return new AnonymousClass89K(jArr, i + i3, i3 + i2);
    }

    public final String toString() {
        StringBuilder A0s = C86114wI.A0s(size() * 10);
        A0s.append('[');
        long[] jArr = this.A02;
        int i = this.A01;
        while (true) {
            A0s.append(jArr[i]);
            i++;
            if (i >= this.A00) {
                return C86114wI.A0q(A0s, ']');
            }
            C86144wL.A1T(A0s);
        }
    }
}
