package X;

import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import com.facebook.forker.Process;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.7Ks  reason: invalid class name and case insensitive filesystem */
public final class C122137Ks {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08 = -1;
    public int A09;
    public int A0A;
    public int A0B;
    public ArrayList A0C;
    public boolean A0D;
    public int[] A0E;
    public Object[] A0F;
    public C1200178b A0G;
    public final AnonymousClass77Y A0H = new AnonymousClass77Y();
    public final C134927yb A0I;
    public final AnonymousClass77Y A0J = new AnonymousClass77Y();
    public final AnonymousClass77Y A0K = new AnonymousClass77Y();

    public static final boolean A0F(C122137Ks r9, int i, int i2) {
        boolean z = false;
        if (i2 > 0) {
            ArrayList arrayList = r9.A0C;
            A08(r9, i);
            if (C18250wR.A1K(arrayList)) {
                int i3 = i2 + i;
                int length = (r9.A0E.length / 5) - r9.A04;
                ArrayList arrayList2 = r9.A0C;
                int A022 = C121627Hb.A02(arrayList2, i3, length);
                if (A022 < 0) {
                    A022 = -(A022 + 1);
                }
                if (A022 >= arrayList2.size()) {
                    A022--;
                }
                int i4 = A022 + 1;
                boolean z2 = false;
                int i5 = 0;
                while (A022 >= 0) {
                    C104036b8 r2 = (C104036b8) C86164wN.A0b(r9.A0C, A022);
                    C04220Ms.A0B(r2, 0);
                    int i6 = r2.A00;
                    if (i6 < 0) {
                        i6 += A00(r9);
                    }
                    if (i6 < i) {
                        break;
                    }
                    if (i6 < i3) {
                        r2.A00 = Process.WAIT_RESULT_TIMEOUT;
                        if (i5 == 0) {
                            i5 = A022 + 1;
                        }
                        i4 = A022;
                    }
                    A022--;
                }
                if (i4 < i5) {
                    z2 = true;
                    r9.A0C.subList(i4, i5).clear();
                }
                z = z2;
            }
            r9.A05 = i;
            r9.A04 += i2;
            int i7 = r9.A0A;
            if (i7 > i) {
                r9.A0A = Math.max(i, i7 - i2);
            }
            int i8 = r9.A01;
            if (i8 >= i) {
                r9.A01 = i8 - i2;
            }
            int i9 = r9.A08;
            if (i9 >= 0 && (r9.A0E[(A01(r9, i9) * 5) + 1] & 67108864) != 0) {
                A09(r9, i9);
            }
        }
        return z;
    }

    public final void A0K() {
        this.A0D = true;
        if (this.A0K.A00 == 0) {
            A08(this, A00(this));
            A0B(this, this.A0F.length - this.A09, this.A05);
            A06(this);
        }
        C134927yb r7 = this.A0I;
        int[] iArr = this.A0E;
        int i = this.A05;
        Object[] objArr = this.A0F;
        int i2 = this.A0B;
        ArrayList arrayList = this.A0C;
        if (r7 != r7 || !r7.A05) {
            throw C18190wL.A0a("Unexpected writer close()");
        }
        r7.A05 = false;
        r7.A06 = iArr;
        r7.A00 = i;
        r7.A07 = objArr;
        r7.A02 = i2;
        r7.A04 = arrayList;
    }

    public static int A00(C122137Ks r2) {
        return (r2.A0E.length / 5) - r2.A04;
    }

    public static final int A01(C122137Ks r1, int i) {
        if (i >= r1.A05) {
            return i + r1.A04;
        }
        return i;
    }

    public static final int A03(C122137Ks r3, int[] iArr, int i) {
        if (i >= r3.A0E.length / 5) {
            return r3.A0F.length - r3.A09;
        }
        int i2 = iArr[(i * 5) + 4];
        int i3 = r3.A09;
        int length = r3.A0F.length;
        if (i2 < 0) {
            return (length - i3) + i2 + 1;
        }
        return i2;
    }

    private final int A05(int[] iArr, int i) {
        if (i >= this.A0E.length / 5) {
            return this.A0F.length - this.A09;
        }
        int A012 = C121627Hb.A01(i, iArr);
        int i2 = this.A09;
        int length = this.A0F.length;
        if (A012 < 0) {
            return (length - i2) + A012 + 1;
        }
        return A012;
    }

    public static final void A06(C122137Ks r9) {
        boolean z;
        C1200178b r7 = r9.A0G;
        if (r7 != null) {
            while (C18190wL.A1a(r7.A00)) {
                int A002 = r7.A00();
                int A012 = A01(r9, A002);
                int i = A002 + 1;
                int[] iArr = r9.A0E;
                int i2 = A012 * 5;
                int i3 = A002 + iArr[i2 + 3];
                while (true) {
                    if (i >= i3) {
                        z = false;
                        break;
                    } else if ((iArr[(A01(r9, i) * 5) + 1] & 201326592) != 0) {
                        z = true;
                        break;
                    } else {
                        i += C86154wM.A03(A01(r9, i), iArr);
                    }
                }
                boolean z2 = true;
                int i4 = i2 + 1;
                int i5 = iArr[i4];
                if ((i5 & 67108864) == 0) {
                    z2 = false;
                }
                if (z2 != z) {
                    int i6 = i5 | 67108864;
                    if (!z) {
                        i6 = -67108865 & i5;
                    }
                    iArr[i4] = i6;
                    int A042 = A04(r9, iArr, A002);
                    if (A042 >= 0) {
                        r7.A01(A042);
                    }
                }
            }
        }
    }

    public static final void A07(C122137Ks r12, int i) {
        int i2;
        if (i > 0) {
            int i3 = r12.A00;
            A08(r12, i3);
            int i4 = r12.A05;
            int i5 = r12.A04;
            int[] iArr = r12.A0E;
            int length = iArr.length / 5;
            int i6 = length - i5;
            int i7 = 0;
            if (i5 < i) {
                int max = Math.max(Math.max(length << 1, i6 + i), 32);
                int[] iArr2 = new int[(max * 5)];
                int i8 = max - i6;
                System.arraycopy(iArr, 0, iArr2, 0, i4 * 5);
                int i9 = (i5 + i4) * 5;
                System.arraycopy(iArr, i9, iArr2, (i4 + i8) * 5, (length * 5) - i9);
                r12.A0E = iArr2;
                iArr = iArr2;
                i5 = i8;
            }
            int i10 = r12.A01;
            if (i10 >= i4) {
                r12.A01 = i10 + i;
            }
            int i11 = i4 + i;
            r12.A05 = i11;
            r12.A04 = i5 - i;
            if (i6 > 0) {
                i2 = A02(r12, iArr, i3 + i);
            } else {
                i2 = 0;
            }
            int i12 = r12.A0A;
            if (i12 >= i4) {
                i7 = r12.A0B;
            }
            int i13 = r12.A09;
            int length2 = r12.A0F.length;
            if (i2 > i7) {
                i2 = -(((length2 - i13) - i2) + 1);
            }
            for (int i14 = i4; i14 < i11; i14++) {
                iArr[(i14 * 5) + 4] = i2;
            }
            if (i12 >= i4) {
                r12.A0A = i12 + i;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        r1 = (X.C104036b8) X.C86164wN.A0b(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        r1 = (X.C104036b8) X.C86164wN.A0b(r1, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A08(X.C122137Ks r8, int r9) {
        /*
            int r4 = r8.A04
            int r3 = r8.A05
            if (r3 == r9) goto L_0x00bc
            java.util.ArrayList r0 = r8.A0C
            boolean r0 = r0.isEmpty()
            r7 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0063
            int r1 = r8.A04
            int[] r0 = r8.A0E
            int r0 = r0.length
            int r5 = r0 / 5
            int r5 = r5 - r1
            java.util.ArrayList r0 = r8.A0C
            if (r3 >= r9) goto L_0x0040
            int r2 = X.C121627Hb.A02(r0, r3, r5)
            if (r2 >= 0) goto L_0x0026
            int r0 = r2 + 1
            int r2 = -r0
        L_0x0026:
            java.util.ArrayList r1 = r8.A0C
            int r0 = r1.size()
            if (r2 >= r0) goto L_0x0063
            java.lang.Object r1 = X.C86164wN.A0b(r1, r2)
            X.6b8 r1 = (X.C104036b8) r1
            int r0 = r1.A00
            if (r0 >= 0) goto L_0x0063
            int r0 = r0 + r5
            if (r0 >= r9) goto L_0x0063
            r1.A00 = r0
            int r2 = r2 + 1
            goto L_0x0026
        L_0x0040:
            int r2 = X.C121627Hb.A02(r0, r9, r5)
            if (r2 >= 0) goto L_0x0049
            int r0 = r2 + 1
            int r2 = -r0
        L_0x0049:
            java.util.ArrayList r1 = r8.A0C
            int r0 = r1.size()
            if (r2 >= r0) goto L_0x0063
            java.lang.Object r1 = X.C86164wN.A0b(r1, r2)
            X.6b8 r1 = (X.C104036b8) r1
            int r0 = r1.A00
            if (r0 < 0) goto L_0x0063
            int r0 = r5 - r0
            int r0 = -r0
            r1.A00 = r0
            int r2 = r2 + 1
            goto L_0x0049
        L_0x0063:
            if (r4 <= 0) goto L_0x0074
            int[] r6 = r8.A0E
            int r5 = r9 * 5
            int r2 = r4 * 5
            int r1 = r3 * 5
            if (r9 >= r3) goto L_0x00b4
            int r2 = r2 + r5
            int r1 = r1 - r5
            java.lang.System.arraycopy(r6, r5, r6, r2, r1)
        L_0x0074:
            if (r9 >= r3) goto L_0x0078
            int r3 = r9 + r4
        L_0x0078:
            int[] r0 = r8.A0E
            int r0 = r0.length
            int r5 = r0 / 5
            if (r3 < r5) goto L_0x0080
            r7 = 0
        L_0x0080:
            X.AnonymousClass7J4.A04(r7)
        L_0x0083:
            if (r3 >= r5) goto L_0x00bc
            int[] r2 = r8.A0E
            int r0 = r3 * 5
            int r0 = r0 + 2
            r6 = r2[r0]
            r7 = r6
            r0 = -2
            if (r6 > r0) goto L_0x009a
            int r0 = r2.length
            int r1 = r0 / 5
            int r0 = r8.A04
            int r1 = r1 - r0
            int r1 = r1 + r6
            int r6 = r1 + 2
        L_0x009a:
            if (r6 < r9) goto L_0x00a6
            int r0 = r2.length
            int r1 = r0 / 5
            int r0 = r8.A04
            int r1 = r1 - r0
            int r1 = r1 - r6
            int r0 = r1 + 2
            int r6 = -r0
        L_0x00a6:
            if (r6 == r7) goto L_0x00ae
            int r0 = r3 * 5
            int r0 = r0 + 2
            r2[r0] = r6
        L_0x00ae:
            int r3 = r3 + 1
            if (r3 != r9) goto L_0x0083
            int r3 = r3 + r4
            goto L_0x0083
        L_0x00b4:
            int r0 = r1 + r2
            int r5 = r5 + r2
            int r5 = r5 - r0
            java.lang.System.arraycopy(r6, r0, r6, r1, r5)
            goto L_0x0074
        L_0x00bc:
            r8.A05 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122137Ks.A08(X.7Ks, int):void");
    }

    public static final void A09(C122137Ks r3, int i) {
        if (i >= 0) {
            C1200178b r2 = r3.A0G;
            if (r2 == null) {
                r2 = new C1200178b((List) null, (DefaultConstructorMarker) null, 1);
                r3.A0G = r2;
            }
            r2.A01(i);
        }
    }

    public static final void A0A(C122137Ks r9, int i, int i2) {
        if (i > 0) {
            A0B(r9, r9.A02, i2);
            int i3 = r9.A0B;
            int i4 = r9.A09;
            if (i4 < i) {
                Object[] objArr = r9.A0F;
                int length = objArr.length;
                int i5 = length - i4;
                int max = Math.max(Math.max(length << 1, i5 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                r9.A0F = objArr2;
                i4 = i7;
            }
            int i9 = r9.A03;
            if (i9 >= i3) {
                r9.A03 = i9 + i;
            }
            r9.A0B = i3 + i;
            r9.A09 = i4 - i;
        }
    }

    public static final void A0B(C122137Ks r9, int i, int i2) {
        String str;
        int i3 = r9.A09;
        int i4 = r9.A0B;
        int i5 = r9.A0A;
        if (i4 != i) {
            Object[] objArr = r9.A0F;
            if (i < i4) {
                AnonymousClass8AQ.A0G(objArr, objArr, i + i3, i, i4);
            } else {
                AnonymousClass8AQ.A0G(objArr, objArr, i4, i4 + i3, i + i3);
            }
            Arrays.fill(objArr, i, i + i3, (Object) null);
        }
        int[] iArr = r9.A0E;
        int i6 = r9.A04;
        int min = Math.min(i2 + 1, (iArr.length / 5) - i6);
        if (i5 != min) {
            int length = r9.A0F.length - i3;
            if (min < i5) {
                int A012 = A01(r9, min);
                int A013 = A01(r9, i5);
                int i7 = r9.A05;
                while (A012 < A013) {
                    int i8 = (A012 * 5) + 4;
                    int i9 = iArr[i8];
                    if (i9 >= 0) {
                        iArr[i8] = -((length - i9) + 1);
                        A012++;
                        if (A012 == i7) {
                            A012 += i6;
                        }
                    } else {
                        str = "Unexpected anchor value, expected a positive anchor";
                    }
                }
                r9.A0A = min;
            } else {
                int A014 = A01(r9, i5);
                int A015 = A01(r9, min);
                while (A014 < A015) {
                    int i10 = iArr[(A014 * 5) + 4];
                    if (i10 < 0) {
                        iArr[(A014 * 5) + 4] = i10 + length + 1;
                        A014++;
                        if (A014 == r9.A05) {
                            A014 += i6;
                        }
                    } else {
                        str = "Unexpected anchor value, expected a negative anchor";
                    }
                }
                r9.A0A = min;
            }
            AnonymousClass7J4.A02(str);
            throw null;
        }
        r9.A0B = i;
    }

    public static final void A0C(C122137Ks r3, int i, int i2, int i3) {
        if (i >= r3.A05) {
            i = -((A00(r3) - i) + 2);
        }
        while (i3 < i2) {
            int[] iArr = r3.A0E;
            int A012 = A01(r3, i3) * 5;
            iArr[A012 + 2] = i;
            int i4 = iArr[A012 + 3] + i3;
            A0C(r3, i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (r14 == r0) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0E(X.C122137Ks r12, java.lang.Object r13, java.lang.Object r14, int r15, boolean r16) {
        /*
            int r0 = r12.A06
            r3 = 0
            r4 = 1
            boolean r2 = X.C18180wK.A1X(r0)
            X.77Y r1 = r12.A0J
            int r0 = r12.A07
            r1.A01(r0)
            if (r2 == 0) goto L_0x0081
            A07(r12, r4)
            int r4 = r12.A00
            int r1 = A01(r12, r4)
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            boolean r11 = X.C18240wQ.A1Y(r13, r0)
            if (r16 != 0) goto L_0x0025
            r10 = 1
            if (r14 != r0) goto L_0x0026
        L_0x0025:
            r10 = 0
        L_0x0026:
            int[] r7 = r12.A0E
            int r9 = r12.A08
            int r6 = r12.A02
            r8 = 0
            if (r16 == 0) goto L_0x0031
            r8 = 1073741824(0x40000000, float:2.0)
        L_0x0031:
            r5 = 0
            if (r11 == 0) goto L_0x0036
            r5 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x0036:
            r2 = 0
            if (r10 == 0) goto L_0x003b
            r2 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x003b:
            int r1 = r1 * 5
            r7[r1] = r15
            int r0 = r1 + 1
            r8 = r8 | r5
            r8 = r8 | r2
            r7[r0] = r8
            int r0 = r1 + 2
            r7[r0] = r9
            int r0 = r1 + 3
            r7[r0] = r3
            int r0 = r1 + 4
            r7[r0] = r6
            r12.A03 = r6
            int r0 = r16 + r11
            int r0 = r0 + r10
            if (r0 <= 0) goto L_0x0076
            A0A(r12, r0, r4)
            java.lang.Object[] r2 = r12.A0F
            int r1 = r12.A02
            if (r16 == 0) goto L_0x0066
            int r0 = r1 + 1
            r2[r1] = r14
            r1 = r0
        L_0x0066:
            if (r11 == 0) goto L_0x006d
            int r0 = r1 + 1
            r2[r1] = r13
            r1 = r0
        L_0x006d:
            if (r10 == 0) goto L_0x0074
            int r0 = r1 + 1
            r2[r1] = r14
            r1 = r0
        L_0x0074:
            r12.A02 = r1
        L_0x0076:
            r12.A07 = r3
            int r3 = r4 + 1
            r12.A08 = r4
            r12.A00 = r3
        L_0x007e:
            r12.A01 = r3
            return
        L_0x0081:
            int r1 = r12.A08
            X.77Y r0 = r12.A0K
            r0.A01(r1)
            X.77Y r2 = r12.A0H
            int r1 = A00(r12)
            int r0 = r12.A01
            int r1 = r1 - r0
            r2.A01(r1)
            int r3 = r12.A00
            int r1 = A01(r12, r3)
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            boolean r0 = X.C04220Ms.A0I(r14, r0)
            if (r0 != 0) goto L_0x00a9
            if (r16 == 0) goto L_0x00cf
            int r0 = r12.A00
            A0D(r12, r14, r0)
        L_0x00a9:
            int[] r2 = r12.A0E
            int r0 = r12.A05(r2, r1)
            r12.A02 = r0
            int r0 = r12.A00
            int r0 = r0 + 1
            int r0 = A02(r12, r2, r0)
            r12.A03 = r0
            int r1 = r1 * 5
            int r0 = X.C86144wL.A05(r1, r2)
            r12.A07 = r0
            r12.A08 = r3
            int r0 = r3 + 1
            r12.A00 = r0
            int r0 = r1 + 3
            r0 = r2[r0]
            int r3 = r3 + r0
            goto L_0x007e
        L_0x00cf:
            r12.A0S(r14)
            goto L_0x00a9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122137Ks.A0E(X.7Ks, java.lang.Object, java.lang.Object, int, boolean):void");
    }

    public final C104036b8 A0G(int i) {
        ArrayList arrayList = this.A0C;
        int A002 = A00(this);
        int A022 = C121627Hb.A02(arrayList, i, A002);
        if (A022 >= 0) {
            return (C104036b8) C86164wN.A0b(arrayList, A022);
        }
        if (i > this.A05) {
            i = -(A002 - i);
        }
        C104036b8 r0 = new C104036b8(i);
        arrayList.add(-(A022 + 1), r0);
        return r0;
    }

    public final Object A0I(int i, Object obj) {
        int i2 = this.A00;
        int A012 = A01(this, i2);
        int[] iArr = this.A0E;
        int A052 = A05(iArr, A012);
        int A022 = A02(this, iArr, i2 + 1);
        int i3 = A052 + i;
        if (i3 < A052 || i3 >= A022) {
            AnonymousClass7J4.A02(AnonymousClass00U.A01(i, i2, "Write to an invalid slot index ", " for group "));
            throw null;
        }
        if (i3 >= this.A0B) {
            i3 += this.A09;
        }
        Object[] objArr = this.A0F;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    public final void A0J() {
        int i = this.A06;
        this.A06 = i + 1;
        if (i == 0) {
            this.A0H.A01(A00(this) - this.A01);
        }
    }

    public final void A0L() {
        int i = 1;
        int i2 = 0;
        boolean A1X = C18180wK.A1X(this.A06);
        int i3 = this.A00;
        int i4 = this.A01;
        int i5 = this.A08;
        int A012 = A01(this, i5);
        int i6 = this.A07;
        int i7 = i3 - i5;
        int[] iArr = this.A0E;
        boolean A042 = C121627Hb.A04(A012, iArr);
        if (A1X) {
            AnonymousClass7J4.A04(C86114wI.A1S(i7));
            iArr[(A012 * 5) + 3] = i7;
            C121627Hb.A03(this.A0E, A012, i6);
            int A002 = AnonymousClass77Y.A00(this.A0J);
            if (!A042) {
                i = i6;
            }
            this.A07 = A002 + i;
            this.A08 = A04(this, this.A0E, i5);
        } else if (i3 == i4) {
            int i8 = A012 * 5;
            int i9 = i8 + 3;
            int i10 = iArr[i9];
            int i11 = iArr[i8 + 1] & 67108863;
            AnonymousClass7J4.A04(C86114wI.A1S(i7));
            iArr[i9] = i7;
            C121627Hb.A03(this.A0E, A012, i6);
            int A003 = AnonymousClass77Y.A00(this.A0K);
            int[] iArr2 = this.A0E;
            this.A01 = ((iArr2.length / 5) - this.A04) - AnonymousClass77Y.A00(this.A0H);
            this.A08 = A003;
            int A043 = A04(this, iArr2, i5);
            int A004 = AnonymousClass77Y.A00(this.A0J);
            this.A07 = A004;
            if (A043 != A003) {
                int i12 = i7 - i10;
                if (!A042) {
                    i2 = i6 - i11;
                }
                if (!(i12 == 0 && i2 == 0)) {
                    while (A043 != 0 && A043 != A003 && (i2 != 0 || i12 != 0)) {
                        int A013 = A01(this, A043);
                        if (i12 != 0) {
                            int A032 = C86154wM.A03(A013, iArr2) + i12;
                            AnonymousClass7J4.A04(C86114wI.A1S(A032));
                            iArr2[(A013 * 5) + 3] = A032;
                        }
                        if (i2 != 0) {
                            int[] iArr3 = this.A0E;
                            C121627Hb.A03(iArr3, A013, (iArr3[(A013 * 5) + 1] & 67108863) + i2);
                        }
                        iArr2 = this.A0E;
                        if (C121627Hb.A04(A013, iArr2)) {
                            i2 = 0;
                        }
                        A043 = A04(this, iArr2, A043);
                    }
                }
                A004 = this.A07;
            } else if (!A042) {
                i2 = i6 - i11;
            }
            this.A07 = A004 + i2;
        } else {
            AnonymousClass7J4.A02("Expected to be at the end of a group");
            throw null;
        }
    }

    public final void A0M() {
        int i = this.A06;
        if (i > 0) {
            int i2 = i - 1;
            this.A06 = i2;
            if (i2 != 0) {
                return;
            }
            if (this.A0J.A00 == this.A0K.A00) {
                this.A01 = A00(this) - AnonymousClass77Y.A00(this.A0H);
            } else {
                AnonymousClass7J4.A02("startGroup/endGroup mismatch while inserting");
                throw null;
            }
        } else {
            throw C18180wK.A0a("Unbalanced begin/end insert");
        }
    }

    public final void A0N() {
        int i = this.A01;
        this.A00 = i;
        this.A02 = A02(this, this.A0E, i);
    }

    public final void A0O() {
        if (this.A06 == 0) {
            Object obj = AnonymousClass7GN.A00;
            A0E(this, obj, obj, 0, false);
            return;
        }
        AnonymousClass7J4.A02("Key must be supplied when inserting");
        throw null;
    }

    public final void A0P(int i) {
        String str;
        if (i < 0) {
            str = "Cannot seek backwards";
        } else if (this.A06 > 0) {
            throw C18180wK.A0a("Cannot call seek() while inserting");
        } else if (i != 0) {
            int i2 = this.A00 + i;
            int i3 = this.A08;
            if (i2 < i3 || i2 > this.A01) {
                StringBuilder A0s = C18190wL.A0s("Cannot seek outside the current group (");
                A0s.append(i3);
                A0s.append(Rfc3492Idn.delimiter);
                A0s.append(this.A01);
                str = AnonymousClass0wJ.A0u(A0s);
            } else {
                this.A00 = i2;
                int A022 = A02(this, this.A0E, i2);
                this.A02 = A022;
                this.A03 = A022;
                return;
            }
        } else {
            return;
        }
        AnonymousClass7J4.A02(str);
        throw null;
    }

    public final void A0Q(int i) {
        String str;
        if (this.A06 <= 0) {
            int i2 = this.A08;
            if (i2 == i) {
                return;
            }
            if (i < i2 || i >= this.A01) {
                str = AnonymousClass00U.A01(i, i2, "Started group at ", " must be a subgroup of the group at ");
            } else {
                int i3 = this.A00;
                int i4 = this.A02;
                int i5 = this.A03;
                this.A00 = i;
                A0O();
                this.A00 = i3;
                this.A02 = i4;
                this.A03 = i5;
                return;
            }
        } else {
            str = "Cannot call ensureStarted() while inserting";
        }
        AnonymousClass7J4.A02(str);
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0074, code lost:
        if ((r7[r1 + 1] & 201326592) == 0) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0R(X.C134927yb r22, int r23) {
        /*
            r21 = this;
            r10 = r23
            r9 = 0
            r6 = r21
            int r0 = r6.A06
            boolean r0 = X.C18180wK.A1X(r0)
            X.AnonymousClass7J4.A04(r0)
            r11 = r22
            if (r23 != 0) goto L_0x004d
            int r0 = r6.A00
            if (r0 != 0) goto L_0x004d
            X.7yb r0 = r6.A0I
            int r0 = r0.A00
            if (r0 != 0) goto L_0x004d
            int[] r8 = r6.A0E
            java.lang.Object[] r7 = r6.A0F
            java.util.ArrayList r5 = r6.A0C
            int[] r4 = r11.A06
            int r3 = r11.A00
            java.lang.Object[] r2 = r11.A07
            int r1 = r11.A02
            r6.A0E = r4
            r6.A0F = r2
            java.util.ArrayList r0 = r11.A04
            r6.A0C = r0
            r6.A05 = r3
            int r0 = r4.length
            int r0 = r0 / 5
            int r0 = r0 - r3
            r6.A04 = r0
            r6.A0B = r1
            int r0 = r2.length
            int r0 = r0 - r1
            r6.A09 = r0
            r6.A0A = r3
            r11.A06 = r8
            r11.A00 = r9
            r11.A07 = r7
            r11.A02 = r9
            r11.A04 = r5
            return
        L_0x004d:
            X.7Ks r3 = r11.A02()
            int[] r7 = r3.A0E     // Catch:{ all -> 0x019c }
            int r5 = A01(r3, r10)     // Catch:{ all -> 0x019c }
            int r1 = r5 * 5
            int r0 = r1 + 3
            r4 = r7[r0]     // Catch:{ all -> 0x019c }
            int r2 = r23 + r4
            int r12 = A03(r3, r7, r5)     // Catch:{ all -> 0x019c }
            int r11 = A02(r3, r7, r2)     // Catch:{ all -> 0x019c }
            int r20 = r11 - r12
            if (r23 < 0) goto L_0x0076
            int r0 = r1 + 1
            r1 = r7[r0]     // Catch:{ all -> 0x019c }
            r0 = 201326592(0xc000000, float:9.8607613E-32)
            r1 = r1 & r0
            r19 = 1
            if (r1 != 0) goto L_0x0078
        L_0x0076:
            r19 = 0
        L_0x0078:
            A07(r6, r4)     // Catch:{ all -> 0x019c }
            int r1 = r6.A00     // Catch:{ all -> 0x019c }
            r0 = r20
            A0A(r6, r0, r1)     // Catch:{ all -> 0x019c }
            int r0 = r3.A05     // Catch:{ all -> 0x019c }
            if (r0 >= r2) goto L_0x0089
            A08(r3, r2)     // Catch:{ all -> 0x019c }
        L_0x0089:
            int r0 = r3.A0B     // Catch:{ all -> 0x019c }
            if (r0 >= r11) goto L_0x0090
            A0B(r3, r11, r2)     // Catch:{ all -> 0x019c }
        L_0x0090:
            int[] r8 = r6.A0E     // Catch:{ all -> 0x019c }
            int r9 = r6.A00     // Catch:{ all -> 0x019c }
            int[] r7 = r3.A0E     // Catch:{ all -> 0x019c }
            int r5 = r9 * 5
            int r1 = r23 * 5
            int r0 = r2 * 5
            int r0 = r0 - r1
            java.lang.System.arraycopy(r7, r1, r8, r5, r0)     // Catch:{ all -> 0x019c }
            java.lang.Object[] r1 = r6.A0F     // Catch:{ all -> 0x019c }
            int r7 = r6.A02     // Catch:{ all -> 0x019c }
            java.lang.Object[] r0 = r3.A0F     // Catch:{ all -> 0x019c }
            X.AnonymousClass8AQ.A0G(r0, r1, r7, r12, r11)     // Catch:{ all -> 0x019c }
            int r0 = r6.A08     // Catch:{ all -> 0x019c }
            r18 = r0
            int r5 = r9 * 5
            int r0 = r5 + 2
            r8[r0] = r18     // Catch:{ all -> 0x019c }
            int r17 = r9 - r23
            int r4 = r4 + r9
            int r0 = A03(r6, r8, r9)     // Catch:{ all -> 0x019c }
            int r16 = r7 - r0
            int r15 = r6.A0A     // Catch:{ all -> 0x019c }
            int r14 = r6.A09     // Catch:{ all -> 0x019c }
            int r13 = r1.length     // Catch:{ all -> 0x019c }
            r12 = r9
        L_0x00c2:
            r11 = 0
            if (r12 >= r4) goto L_0x00f0
            if (r12 == r9) goto L_0x00d1
            int r0 = r12 * 5
            int r1 = r0 + 2
            r0 = r8[r1]     // Catch:{ all -> 0x019c }
            int r0 = r0 + r17
            r8[r1] = r0     // Catch:{ all -> 0x019c }
        L_0x00d1:
            int r1 = A03(r6, r8, r12)     // Catch:{ all -> 0x019c }
            int r1 = r1 + r16
            if (r15 < r12) goto L_0x00db
            int r11 = r6.A0B     // Catch:{ all -> 0x019c }
        L_0x00db:
            if (r1 <= r11) goto L_0x00e3
            int r0 = r13 - r14
            int r0 = r0 - r1
            int r0 = r0 + 1
            int r1 = -r0
        L_0x00e3:
            int r0 = r12 * 5
            int r0 = r0 + 4
            r8[r0] = r1     // Catch:{ all -> 0x019c }
            if (r12 != r15) goto L_0x00ed
            int r15 = r15 + 1
        L_0x00ed:
            int r12 = r12 + 1
            goto L_0x00c2
        L_0x00f0:
            r6.A0A = r15     // Catch:{ all -> 0x019c }
            java.util.ArrayList r14 = r3.A0C     // Catch:{ all -> 0x019c }
            int r1 = A00(r3)     // Catch:{ all -> 0x019c }
            int r13 = X.C121627Hb.A02(r14, r10, r1)     // Catch:{ all -> 0x019c }
            if (r13 >= 0) goto L_0x0101
            int r0 = r13 + 1
            int r13 = -r0
        L_0x0101:
            int r12 = X.C121627Hb.A02(r14, r2, r1)     // Catch:{ all -> 0x019c }
            if (r12 >= 0) goto L_0x010a
            int r0 = r12 + 1
            int r12 = -r0
        L_0x010a:
            if (r13 >= r12) goto L_0x0142
            int r0 = r12 - r13
            java.util.ArrayList r2 = X.C18240wQ.A0k(r0)     // Catch:{ all -> 0x019c }
            r15 = r13
        L_0x0113:
            if (r15 >= r12) goto L_0x0127
            java.lang.Object r1 = X.C86164wN.A0b(r14, r15)     // Catch:{ all -> 0x019c }
            X.6b8 r1 = (X.C104036b8) r1     // Catch:{ all -> 0x019c }
            int r0 = r1.A00     // Catch:{ all -> 0x019c }
            int r0 = r0 + r17
            r1.A00 = r0     // Catch:{ all -> 0x019c }
            r2.add(r1)     // Catch:{ all -> 0x019c }
            int r15 = r15 + 1
            goto L_0x0113
        L_0x0127:
            java.util.ArrayList r1 = r6.A0C     // Catch:{ all -> 0x019c }
            int r15 = r6.A00     // Catch:{ all -> 0x019c }
            int r0 = A00(r6)     // Catch:{ all -> 0x019c }
            int r0 = X.C121627Hb.A02(r1, r15, r0)     // Catch:{ all -> 0x019c }
            if (r0 >= 0) goto L_0x0138
            int r0 = r0 + 1
            int r0 = -r0
        L_0x0138:
            r1.addAll(r0, r2)     // Catch:{ all -> 0x019c }
            java.util.List r0 = r14.subList(r13, r12)     // Catch:{ all -> 0x019c }
            r0.clear()     // Catch:{ all -> 0x019c }
        L_0x0142:
            int[] r0 = r3.A0E     // Catch:{ all -> 0x019c }
            int r2 = A04(r3, r0, r10)     // Catch:{ all -> 0x019c }
            r0 = 1
            if (r2 < 0) goto L_0x0158
            r11 = 1
            r3.A0O()     // Catch:{ all -> 0x019c }
            int r1 = r3.A00     // Catch:{ all -> 0x019c }
            int r2 = r2 - r1
            r3.A0P(r2)     // Catch:{ all -> 0x019c }
            r3.A0O()     // Catch:{ all -> 0x019c }
        L_0x0158:
            int r1 = r3.A00     // Catch:{ all -> 0x019c }
            int r10 = r23 - r1
            r3.A0P(r10)     // Catch:{ all -> 0x019c }
            boolean r1 = r3.A0T()     // Catch:{ all -> 0x019c }
            if (r11 == 0) goto L_0x0171
            r3.A0N()     // Catch:{ all -> 0x019c }
            r3.A0L()     // Catch:{ all -> 0x019c }
            r3.A0N()     // Catch:{ all -> 0x019c }
            r3.A0L()     // Catch:{ all -> 0x019c }
        L_0x0171:
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0195
            int r2 = r6.A07     // Catch:{ all -> 0x019c }
            boolean r1 = X.C121627Hb.A04(r9, r8)     // Catch:{ all -> 0x019c }
            if (r1 != 0) goto L_0x0181
            int r0 = X.C86144wL.A05(r5, r8)     // Catch:{ all -> 0x019c }
        L_0x0181:
            int r2 = r2 + r0
            r6.A07 = r2     // Catch:{ all -> 0x019c }
            r6.A00 = r4     // Catch:{ all -> 0x019c }
            int r7 = r7 + r20
            r6.A02 = r7     // Catch:{ all -> 0x019c }
            if (r19 == 0) goto L_0x0191
            r0 = r18
            A09(r6, r0)     // Catch:{ all -> 0x019c }
        L_0x0191:
            r3.A0K()
            return
        L_0x0195:
            java.lang.String r0 = "Unexpectedly removed anchors"
            X.AnonymousClass7J4.A02(r0)     // Catch:{ all -> 0x019c }
            r0 = 0
            throw r0     // Catch:{ all -> 0x019c }
        L_0x019c:
            r0 = move-exception
            r3.A0K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122137Ks.A0R(X.7yb, int):void");
    }

    public final void A0S(Object obj) {
        int A012 = A01(this, this.A00);
        int[] iArr = this.A0E;
        int i = iArr[(A012 * 5) + 1];
        if ((268435456 & i) != 0) {
            Object[] objArr = this.A0F;
            int A032 = A03(this, iArr, A012) + C121627Hb.A00(i >> 29);
            if (A032 >= this.A0B) {
                A032 += this.A09;
            }
            objArr[A032] = obj;
            return;
        }
        AnonymousClass7J4.A02("Updating the data of a group that was not created with a data slot");
        throw null;
    }

    public final boolean A0T() {
        int A052;
        if (this.A06 == 0) {
            int i = this.A00;
            int i2 = this.A02;
            int A012 = A01(this, i);
            int[] iArr = this.A0E;
            int i3 = A012 * 5;
            int i4 = iArr[i3 + 3] + i;
            this.A00 = i4;
            this.A02 = A02(this, iArr, i4);
            if (C121627Hb.A04(A012, iArr)) {
                A052 = 1;
            } else {
                A052 = C86144wL.A05(i3, iArr);
            }
            C1200178b r1 = this.A0G;
            if (r1 != null) {
                while (C18190wL.A1a(r1.A00) && AnonymousClass0wJ.A04(AnonymousClass00J.A0C(r1.A00)) >= i) {
                    r1.A00();
                }
            }
            boolean A0F2 = A0F(this, i, this.A00 - i);
            int i5 = this.A02 - i2;
            int i6 = i - 1;
            if (i5 > 0) {
                int i7 = this.A09;
                int i8 = i2 + i5;
                A0B(this, i8, i6);
                this.A0B = i2;
                this.A09 = i7 + i5;
                Arrays.fill(this.A0F, i2, i8, (Object) null);
                int i9 = this.A03;
                if (i9 >= i2) {
                    this.A03 = i9 - i5;
                }
            }
            this.A00 = i;
            this.A02 = i2;
            this.A07 -= A052;
            return A0F2;
        }
        AnonymousClass7J4.A02("Cannot remove group while inserting");
        throw null;
    }

    public final boolean A0U(int i, int i2) {
        int A032;
        if (i2 == this.A08) {
            A032 = this.A01;
        } else {
            AnonymousClass77Y r3 = this.A0K;
            int i3 = 0;
            int i4 = r3.A00;
            if (i4 > 0) {
                i3 = r3.A01[i4 - 1];
            }
            if (i2 <= i3) {
                int i5 = 0;
                while (true) {
                    if (i5 >= i4) {
                        break;
                    } else if (r3.A01[i5] != i2) {
                        i5++;
                    } else if (i5 >= 0) {
                        A032 = A00(this) - this.A0H.A01[i5];
                    }
                }
            }
            A032 = C86154wM.A03(A01(this, i2), this.A0E) + i2;
        }
        if (i <= i2 || i >= A032) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("SlotWriter(current = ");
        A0s.append(this.A00);
        A0s.append(" end=");
        A0s.append(this.A01);
        A0s.append(" size = ");
        int i = this.A04;
        A0s.append((this.A0E.length / 5) - i);
        A0s.append(" gap=");
        int i2 = this.A05;
        A0s.append(i2);
        A0s.append(Rfc3492Idn.delimiter);
        A0s.append(i2 + i);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public C122137Ks(C134927yb r5) {
        this.A0I = r5;
        int[] iArr = r5.A06;
        this.A0E = iArr;
        Object[] objArr = r5.A07;
        this.A0F = objArr;
        this.A0C = r5.A04;
        int i = r5.A00;
        this.A05 = i;
        this.A04 = (iArr.length / 5) - i;
        this.A01 = i;
        int i2 = r5.A02;
        this.A0B = i2;
        this.A09 = objArr.length - i2;
        this.A0A = i;
    }

    public static int A02(C122137Ks r1, int[] iArr, int i) {
        return A03(r1, iArr, A01(r1, i));
    }

    public static final int A04(C122137Ks r2, int[] iArr, int i) {
        int i2 = iArr[(A01(r2, i) * 5) + 2];
        if (i2 <= -2) {
            return A00(r2) + i2 + 2;
        }
        return i2;
    }

    public static final void A0D(C122137Ks r4, Object obj, int i) {
        int A012 = A01(r4, i);
        int[] iArr = r4.A0E;
        if (A012 >= iArr.length || !C121627Hb.A04(A012, iArr)) {
            AnonymousClass7J4.A02(AnonymousClass00U.A0S("Updating the node of a group at ", " that was not created with as a node group", i));
            throw null;
        }
        Object[] objArr = r4.A0F;
        int A032 = A03(r4, iArr, A012);
        if (A032 >= r4.A0B) {
            A032 += r4.A09;
        }
        objArr[A032] = obj;
    }

    public final Object A0H(int i, int i2) {
        int A012 = A01(this, i);
        int[] iArr = this.A0E;
        int A052 = A05(iArr, A012);
        int A022 = A02(this, iArr, i + 1);
        int i3 = i2 + A052;
        if (A052 > i3 || i3 >= A022) {
            return AnonymousClass7GN.A00;
        }
        if (i3 >= this.A0B) {
            i3 += this.A09;
        }
        return this.A0F[i3];
    }
}
