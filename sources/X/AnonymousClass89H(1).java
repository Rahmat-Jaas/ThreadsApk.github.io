package X;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.89H  reason: invalid class name */
public final class AnonymousClass89H extends AbstractList<Boolean> implements RandomAccess, Serializable {
    public final int A00;
    public final int A01;
    public final boolean[] A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof AnonymousClass89H)) {
                return super.equals(obj);
            }
            AnonymousClass89H r8 = (AnonymousClass89H) obj;
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
        if (obj instanceof Boolean) {
            boolean[] zArr = this.A02;
            boolean A1X = AnonymousClass0wJ.A1X(obj);
            int i = this.A01;
            int i2 = this.A00;
            while (true) {
                if (i >= i2) {
                    break;
                } else if (zArr[i] != A1X) {
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
            i = (i * 31) + C86124wJ.A04(this.A02[i2] ? 1 : 0);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (obj instanceof Boolean) {
            boolean[] zArr = this.A02;
            boolean A1X = AnonymousClass0wJ.A1X(obj);
            int i = this.A01;
            int i2 = this.A00;
            int i3 = i;
            while (true) {
                if (i3 >= i2) {
                    break;
                } else if (zArr[i3] == A1X) {
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
        if (obj instanceof Boolean) {
            boolean[] zArr = this.A02;
            boolean A1X = AnonymousClass0wJ.A1X(obj);
            int i = this.A01;
            int i2 = this.A00;
            while (true) {
                i2--;
                if (i2 < i) {
                    break;
                } else if (zArr[i2] == A1X) {
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
        Boolean bool = (Boolean) obj;
        AnonymousClass7Ko.A01(i, size());
        boolean[] zArr = this.A02;
        int i2 = this.A01 + i;
        boolean z = zArr[i2];
        bool.getClass();
        zArr[i2] = bool.booleanValue();
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.A00 - this.A01;
    }

    public AnonymousClass89H(boolean[] zArr, int i, int i2) {
        this.A02 = zArr;
        this.A01 = i;
        this.A00 = i2;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        AnonymousClass7Ko.A01(i, size());
        return Boolean.valueOf(this.A02[this.A01 + i]);
    }

    public final List subList(int i, int i2) {
        AnonymousClass7Ko.A03(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        boolean[] zArr = this.A02;
        int i3 = this.A01;
        return new AnonymousClass89H(zArr, i + i3, i3 + i2);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder A0s = C86114wI.A0s(size() * 7);
        boolean[] zArr = this.A02;
        int i = this.A01;
        if (zArr[i]) {
            str = "[true";
        } else {
            str = "[false";
        }
        while (true) {
            A0s.append(str);
            i++;
            if (i >= this.A00) {
                return C86114wI.A0q(A0s, ']');
            }
            if (zArr[i]) {
                str2 = ", true";
            } else {
                str2 = ", false";
            }
        }
    }
}
