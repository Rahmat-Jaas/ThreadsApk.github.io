package X;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: X.8AG  reason: invalid class name */
public final class AnonymousClass8AG<T> extends AnonymousClass8AJ<T> implements RandomAccess {
    public int A00;
    public int A01;
    public final int A02;
    public final Object[] A03;

    public AnonymousClass8AG(Object[] objArr, int i) {
        C04220Ms.A0B(objArr, 1);
        this.A03 = objArr;
        if (i >= 0) {
            int length = objArr.length;
            if (i <= length) {
                this.A02 = length;
                this.A00 = i;
                return;
            }
            throw C18190wL.A0a(AnonymousClass00U.A01(i, length, "ring buffer filled size: ", " cannot be larger than the buffer size: "));
        }
        throw C18190wL.A0a(AnonymousClass00U.A0J("ring buffer filled size should not be negative but it is ", i));
    }

    public final Object[] toArray(Object[] objArr) {
        C04220Ms.A0B(objArr, 0);
        if (objArr.length < size()) {
            objArr = C86124wJ.A1b(objArr, size());
        }
        int size = size();
        int i = this.A01;
        int i2 = 0;
        int i3 = 0;
        while (i3 < size && i < this.A02) {
            objArr[i3] = this.A03[i];
            i3++;
            i++;
        }
        while (i3 < size) {
            objArr[i3] = this.A03[i2];
            i3++;
            i2++;
        }
        if (objArr.length > size()) {
            objArr[size()] = null;
        }
        return objArr;
    }

    public final void A09(int i) {
        if (i < 0) {
            throw C18190wL.A0a(AnonymousClass00U.A0J("n shouldn't be negative but it is ", i));
        } else if (i > size()) {
            throw C18190wL.A0a(AnonymousClass00U.A01(i, size(), "n shouldn't be greater than the buffer size: n = ", ", size = "));
        } else if (i > 0) {
            int i2 = this.A01;
            int i3 = this.A02;
            int i4 = (i2 + i) % i3;
            if (i2 > i4) {
                Object[] objArr = this.A03;
                Arrays.fill(objArr, i2, i3, (Object) null);
                Arrays.fill(objArr, 0, i4, (Object) null);
            } else {
                Arrays.fill(this.A03, i2, i4, (Object) null);
            }
            this.A01 = i4;
            this.A00 = size() - i;
        }
    }

    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
