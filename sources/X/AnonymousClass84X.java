package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.84X  reason: invalid class name */
public final class AnonymousClass84X implements RandomAccess {
    public int A00 = 0;
    public Object[] A01;
    public List A02;

    public AnonymousClass84X(Object[] objArr) {
        this.A01 = objArr;
    }

    public static AnonymousClass7YG A02(AnonymousClass84X r1, int i) {
        return (AnonymousClass7YG) r1.A03(i - 1);
    }

    public final void A09(AnonymousClass84X r5, int i) {
        C04220Ms.A0B(r5, 1);
        int i2 = r5.A00;
        if (i2 != 0) {
            A06(this.A00 + i2);
            Object[] objArr = this.A01;
            int i3 = this.A00;
            if (i != i3) {
                AnonymousClass8AQ.A0G(objArr, objArr, r5.A00 + i, i, i3);
            }
            AnonymousClass8AQ.A0G(r5.A01, objArr, i, 0, r5.A00);
            this.A00 += r5.A00;
        }
    }

    public final void A0A(Comparator comparator) {
        Arrays.sort(this.A01, 0, this.A00, comparator);
    }

    public final boolean A0B(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        A06(this.A00 + collection.size());
        Object[] objArr = this.A01;
        if (i != this.A00) {
            AnonymousClass8AQ.A0G(objArr, objArr, collection.size() + i, i, this.A00);
        }
        for (Object next : collection) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C06750aI.A1A();
                throw null;
            }
            objArr[i2 + i] = next;
            i2 = i3;
        }
        this.A00 += collection.size();
        return true;
    }

    public static AnonymousClass84X A01(Object[] objArr) {
        return new AnonymousClass84X(objArr);
    }

    public final Object A03(int i) {
        Object[] objArr = this.A01;
        Object obj = objArr[i];
        int i2 = this.A00;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.A00 - 1;
        this.A00 = i4;
        objArr[i4] = null;
        return obj;
    }

    public final List A04() {
        List list = this.A02;
        if (list != null) {
            return list;
        }
        AnonymousClass84H r0 = new AnonymousClass84H(this);
        this.A02 = r0;
        return r0;
    }

    public final void A05() {
        Object[] objArr = this.A01;
        int i = this.A00;
        while (true) {
            i--;
            if (-1 < i) {
                objArr[i] = null;
            } else {
                this.A00 = 0;
                return;
            }
        }
    }

    public final void A06(int i) {
        Object[] objArr = this.A01;
        int length = objArr.length;
        if (length < i) {
            this.A01 = C86124wJ.A1b(objArr, Math.max(i, length << 1));
        }
    }

    public final void A07(int i, int i2) {
        if (i2 > i) {
            int i3 = this.A00;
            if (i2 < i3) {
                Object[] objArr = this.A01;
                AnonymousClass8AQ.A0G(objArr, objArr, i, i2, i3);
            }
            int i4 = this.A00;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.A01[i7] = null;
                    if (i7 == i6) {
                        break;
                    }
                    i7++;
                }
            }
            this.A00 = i5;
        }
    }

    public final void A08(int i, Object obj) {
        A06(this.A00 + 1);
        Object[] objArr = this.A01;
        int i2 = this.A00;
        if (i != i2) {
            AnonymousClass8AQ.A0G(objArr, objArr, i + 1, i, i2);
        }
        objArr[i] = obj;
        this.A00++;
    }

    public final boolean A0C(Object obj) {
        A06(this.A00 + 1);
        Object[] objArr = this.A01;
        int i = this.A00;
        objArr[i] = obj;
        this.A00 = i + 1;
        return true;
    }

    public final boolean A0D(Object obj) {
        int i = this.A00 - 1;
        if (i >= 0) {
            int i2 = 0;
            while (!C04220Ms.A0I(this.A01[i2], obj)) {
                if (i2 != i) {
                    i2++;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean A0E(Object obj) {
        int i = this.A00;
        if (i <= 0) {
            return false;
        }
        int i2 = 0;
        Object[] objArr = this.A01;
        while (!C04220Ms.A0I(obj, objArr[i2])) {
            i2++;
            if (i2 >= i) {
                return false;
            }
        }
        if (i2 < 0) {
            return false;
        }
        A03(i2);
        return true;
    }

    public static int A00(AnonymousClass84X r0) {
        return r0.A04().size();
    }
}
