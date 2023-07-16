package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.7EA  reason: invalid class name */
public final class AnonymousClass7EA {
    public int A00;
    public Object[] A01;
    public Object[] A02;

    public AnonymousClass7EA() {
        this((DefaultConstructorMarker) null, 0, 1);
    }

    public final void A01(Object obj, Object obj2) {
        boolean z;
        Object[] objArr;
        Object[] objArr2;
        C04220Ms.A0B(obj, 0);
        int A002 = A00(this, obj);
        if (A002 >= 0) {
            this.A02[A002] = obj2;
            return;
        }
        int i = -(A002 + 1);
        int i2 = this.A00;
        Object[] objArr3 = this.A01;
        if (i2 == objArr3.length) {
            z = true;
            objArr = new Object[(i2 << 1)];
        } else {
            z = false;
            objArr = objArr3;
        }
        int i3 = i + 1;
        System.arraycopy(objArr3, i, objArr, i3, i2 - i);
        if (z) {
            AnonymousClass8AQ.A0G(this.A01, objArr, 0, 0, i);
        }
        objArr[i] = obj;
        this.A01 = objArr;
        if (z) {
            objArr2 = new Object[(this.A00 << 1)];
        } else {
            objArr2 = this.A02;
        }
        AnonymousClass8AQ.A0G(this.A02, objArr2, i3, i, this.A00);
        if (z) {
            AnonymousClass8AQ.A0G(this.A02, objArr2, 0, 0, i);
        }
        objArr2[i] = obj2;
        this.A02 = objArr2;
        this.A00++;
    }

    public /* synthetic */ AnonymousClass7EA(DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this.A01 = new Object[16];
        this.A02 = new Object[16];
    }

    public static final int A00(AnonymousClass7EA r8, Object obj) {
        int i;
        int identityHashCode = System.identityHashCode(obj);
        int i2 = r8.A00;
        int i3 = i2 - 1;
        int i4 = 0;
        while (true) {
            if (i4 > i3) {
                i = i4 + 1;
                break;
            }
            int i5 = (i4 + i3) >>> 1;
            Object[] objArr = r8.A01;
            Object obj2 = objArr[i5];
            int identityHashCode2 = System.identityHashCode(obj2);
            if (identityHashCode2 < identityHashCode) {
                i4 = i5 + 1;
            } else if (identityHashCode2 > identityHashCode) {
                i3 = i5 - 1;
            } else if (obj == obj2) {
                return i5;
            } else {
                int i6 = i5 - 1;
                while (-1 < i6) {
                    Object obj3 = objArr[i6];
                    if (obj3 != obj) {
                        i6--;
                        if (System.identityHashCode(obj3) != identityHashCode) {
                            break;
                        }
                    } else {
                        return i6;
                    }
                }
                int i7 = i5 + 1;
                while (true) {
                    if (i7 >= i2) {
                        i7 = i2;
                        break;
                    }
                    Object obj4 = objArr[i7];
                    if (obj4 != obj) {
                        if (System.identityHashCode(obj4) != identityHashCode) {
                            break;
                        }
                        i7++;
                    } else {
                        return i7;
                    }
                }
                i = i7 + 1;
            }
        }
        return -i;
    }
}
