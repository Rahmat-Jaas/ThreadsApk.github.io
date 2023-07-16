package X;

import androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1;
import com.facebook.redex.IDxSequenceShape671S0100000_2_I2;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.7yd  reason: invalid class name and case insensitive filesystem */
public final class C134947yd implements Iterable, C03740Kn {
    public static final C134947yd A04 = new C134947yd(0, 0, (int[]) null, 0);
    public final int A00;
    public final long A01;
    public final long A02;
    public final int[] A03;

    public final C134947yd A02(C134947yd r11) {
        int[] iArr;
        C04220Ms.A0B(r11, 0);
        C134947yd r3 = A04;
        if (r11 == r3) {
            return this;
        }
        if (this == r3) {
            return r3;
        }
        int i = r11.A00;
        int i2 = this.A00;
        if (i == i2 && r11.A03 == (iArr = this.A03)) {
            return new C134947yd((r11.A02 ^ -1) & this.A02, (-1 ^ r11.A01) & this.A01, iArr, i2);
        }
        Iterator it = r11.iterator();
        C134947yd r32 = this;
        while (it.hasNext()) {
            r32 = r32.A00(AnonymousClass0wJ.A04(it.next()));
        }
        return r32;
    }

    public final C134947yd A03(C134947yd r10) {
        int[] iArr;
        C134947yd r2 = r10;
        C04220Ms.A0B(r10, 0);
        C134947yd r0 = A04;
        if (r10 == r0) {
            return this;
        }
        if (this == r0) {
            return r10;
        }
        int i = r10.A00;
        int i2 = this.A00;
        if (i == i2 && r10.A03 == (iArr = this.A03)) {
            return new C134947yd(r10.A02 | this.A02, r10.A01 | this.A01, iArr, i2);
        } else if (this.A03 == null) {
            Iterator it = iterator();
            while (it.hasNext()) {
                r2 = r2.A01(AnonymousClass0wJ.A04(it.next()));
            }
            return r2;
        } else {
            Iterator it2 = r10.iterator();
            C134947yd r22 = this;
            while (it2.hasNext()) {
                r22 = r22.A01(AnonymousClass0wJ.A04(it2.next()));
            }
            return r22;
        }
    }

    public final Iterator iterator() {
        return new IDxSequenceShape671S0100000_2_I2(new SnapshotIdSet$iterator$1(this, (C146958n9) null), 0).iterator();
    }

    public final C134947yd A00(int i) {
        int i2;
        long j;
        long j2;
        int[] iArr;
        int i3 = this.A00;
        int i4 = i;
        int i5 = i - i3;
        if (i5 >= 0) {
            if (i5 < 64) {
                long j3 = 1 << i5;
                long j4 = this.A01;
                if ((j4 & j3) != 0) {
                    j = this.A02;
                    j2 = j4 & (j3 ^ -1);
                }
                return this;
            }
            if (i5 < 128) {
                long j5 = 1 << (i5 - 64);
                long j6 = this.A02;
                if ((j6 & j5) != 0) {
                    j = j6 & (j5 ^ -1);
                    j2 = this.A01;
                }
            }
            return this;
            iArr = this.A03;
        } else {
            int[] iArr2 = this.A03;
            if (iArr2 != null) {
                int length = iArr2.length - 1;
                int i6 = length;
                int i7 = 0;
                while (true) {
                    if (i7 <= length) {
                        i2 = (i7 + length) >>> 1;
                        int i8 = iArr2[i2];
                        if (i4 <= i8) {
                            if (i4 >= i8) {
                                break;
                            }
                            length = i2 - 1;
                        } else {
                            i7 = i2 + 1;
                        }
                    } else {
                        i2 = -(i7 + 1);
                        break;
                    }
                }
                if (i2 >= 0) {
                    if (i6 == 0) {
                        j = this.A02;
                        j2 = this.A01;
                        iArr = null;
                    } else {
                        int[] iArr3 = new int[i6];
                        if (i2 > 0) {
                            System.arraycopy(iArr2, 0, iArr3, 0, i2);
                        }
                        if (i2 < i6) {
                            int i9 = i2 + 1;
                            System.arraycopy(iArr2, i9, iArr3, i2, (i6 + 1) - i9);
                        }
                        return new C134947yd(this.A02, this.A01, iArr3, i3);
                    }
                }
            }
            return this;
        }
        return new C134947yd(j, j2, iArr, i3);
    }

    public final C134947yd A01(int i) {
        int i2;
        int[] iArr;
        long j;
        long j2;
        int[] iArr2;
        int i3 = this.A00;
        int i4 = i;
        int i5 = i - i3;
        if (i5 >= 0) {
            if (i5 < 64) {
                long j3 = 1 << i5;
                long j4 = this.A01;
                if ((j4 & j3) == 0) {
                    j = this.A02;
                    j2 = j4 | j3;
                }
                return this;
            }
            if (i5 < 128) {
                long j5 = 1 << (i5 - 64);
                long j6 = this.A02;
                if ((j6 & j5) == 0) {
                    j = j6 | j5;
                    j2 = this.A01;
                }
            } else if (!A04(i4)) {
                long j7 = this.A02;
                long j8 = this.A01;
                ArrayList arrayList = null;
                int i6 = ((i + 1) / 64) << 6;
                while (true) {
                    if (i3 >= i6) {
                        break;
                    }
                    if (j8 != 0) {
                        if (arrayList == null) {
                            arrayList = AnonymousClass0wJ.A0v();
                            int[] iArr3 = this.A03;
                            if (iArr3 != null) {
                                for (int A1U : iArr3) {
                                    C18200wM.A1U(arrayList, A1U);
                                }
                            }
                        }
                        int i7 = 0;
                        do {
                            if (((1 << i7) & j8) != 0) {
                                C18200wM.A1U(arrayList, i7 + i3);
                            }
                            i7++;
                        } while (i7 < 64);
                    }
                    if (j7 == 0) {
                        j8 = 0;
                        i3 = i6;
                        break;
                    }
                    i3 += 64;
                    j8 = j7;
                    j7 = 0;
                }
                if (arrayList != null) {
                    iArr2 = AnonymousClass00J.A0m(arrayList);
                } else {
                    iArr2 = this.A03;
                }
                return new C134947yd(j7, j8, iArr2, i3).A01(i4);
            }
            return this;
            iArr = this.A03;
        } else {
            int[] iArr4 = this.A03;
            if (iArr4 == null) {
                j = this.A02;
                j2 = this.A01;
                iArr = new int[]{i4};
            } else {
                int length = iArr4.length;
                int i8 = length - 1;
                int i9 = 0;
                while (true) {
                    if (i9 <= i8) {
                        i2 = (i9 + i8) >>> 1;
                        int i10 = iArr4[i2];
                        if (i4 <= i10) {
                            if (i4 >= i10) {
                                break;
                            }
                            i8 = i2 - 1;
                        } else {
                            i9 = i2 + 1;
                        }
                    } else {
                        i2 = -(i9 + 1);
                        break;
                    }
                }
                if (i2 < 0) {
                    int i11 = -(i2 + 1);
                    int i12 = length + 1;
                    iArr = new int[i12];
                    System.arraycopy(iArr4, 0, iArr, 0, i11);
                    System.arraycopy(iArr4, i11, iArr, i11 + 1, (i12 - 1) - i11);
                    iArr[i11] = i;
                    j = this.A02;
                    j2 = this.A01;
                }
                return this;
            }
        }
        return new C134947yd(j, j2, iArr, i3);
    }

    public final boolean A04(int i) {
        int i2;
        long j;
        long j2;
        int i3 = i - this.A00;
        if (i3 >= 0) {
            if (i3 < 64) {
                j = 1 << i3;
                j2 = this.A01;
            } else if (i3 < 128) {
                j = 1 << (i3 - 64);
                j2 = this.A02;
            }
            if ((j & j2) == 0) {
                return false;
            }
            return true;
        }
        int[] iArr = this.A03;
        if (iArr != null) {
            int length = iArr.length - 1;
            int i4 = 0;
            while (true) {
                if (i4 <= length) {
                    i2 = (i4 + length) >>> 1;
                    int i5 = iArr[i2];
                    if (i <= i5) {
                        if (i >= i5) {
                            break;
                        }
                        length = i2 - 1;
                    } else {
                        i4 = i2 + 1;
                    }
                } else {
                    i2 = -(i4 + 1);
                    break;
                }
            }
            if (i2 < 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C134947yd(long j, long j2, int[] iArr, int i) {
        this.A02 = j;
        this.A01 = j2;
        this.A00 = i;
        this.A03 = iArr;
    }

    public final String toString() {
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(super.toString());
        A0r.append(" [");
        ArrayList A0w = AnonymousClass0wJ.A0w(this);
        Iterator it = iterator();
        while (it.hasNext()) {
            A0w.add(String.valueOf(AnonymousClass0wJ.A04(it.next())));
        }
        StringBuilder A0r2 = C18200wM.A0r();
        A0r2.append("");
        int size = A0w.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = A0w.get(i2);
            i++;
            if (i > 1) {
                A0r2.append(", ");
            }
            if (obj != null && !(obj instanceof CharSequence)) {
                if (obj instanceof Character) {
                    A0r2.append(((Character) obj).charValue());
                } else {
                    obj = String.valueOf(obj);
                }
            }
            A0r2.append((CharSequence) obj);
        }
        A0r2.append("");
        A0r.append(C18190wL.A0n(A0r2));
        return C86114wI.A0q(A0r, ']');
    }
}
