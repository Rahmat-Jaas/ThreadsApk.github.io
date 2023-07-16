package X;

import java.util.Iterator;

/* renamed from: X.5qA  reason: invalid class name */
public final class AnonymousClass5qA extends AnonymousClass5qB {
    public static final AnonymousClass5qA A05;
    public static final Object[] A06;
    public final transient Object[] A00;
    public final transient int A01;
    public final transient Object[] A02;
    public final transient int A03;
    public final transient int A04;

    static {
        Object[] objArr = new Object[0];
        A06 = objArr;
        A05 = new AnonymousClass5qA(objArr, objArr, 0, 0, 0);
    }

    public final int hashCode() {
        return this.A03;
    }

    public final int size() {
        return this.A01;
    }

    public final boolean contains(Object obj) {
        Object[] objArr = this.A00;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int A022 = C86114wI.A02(obj.hashCode());
        while (true) {
            int i = A022 & this.A04;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            A022 = i + 1;
        }
    }

    public final /* synthetic */ Iterator iterator() {
        AnonymousClass5q8 r1 = this.A00;
        if (r1 == null) {
            Object[] objArr = this.A02;
            int i = this.A01;
            if (i == 0) {
                r1 = AnonymousClass5q7.A02;
            } else {
                r1 = new AnonymousClass5q7(objArr, i);
            }
            this.A00 = r1;
        }
        return r1.listIterator(0);
    }

    public AnonymousClass5qA(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        this.A02 = objArr;
        this.A03 = i;
        this.A00 = objArr2;
        this.A04 = i2;
        this.A01 = i3;
    }
}
