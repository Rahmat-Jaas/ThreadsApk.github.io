package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7Xf  reason: invalid class name and case insensitive filesystem */
public final class C123517Xf implements C146288ly {
    public final C122637Tg A00;

    public C123517Xf(C122637Tg r2) {
        C04220Ms.A0B(r2, 1);
        this.A00 = r2;
    }

    public final C146098ld Bg2(C147618pd r13, List list, long j) {
        Object obj;
        int i;
        int A1Z = AnonymousClass0wJ.A1Z(r13, list);
        ArrayList A0w = AnonymousClass0wJ.A0w(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C147578pZ.A01(A0w, it, j);
        }
        Object obj2 = null;
        int i2 = 1;
        int i3 = 0;
        if (A0w.isEmpty()) {
            obj = null;
        } else {
            obj = A0w.get(0);
            int i4 = ((C123657Xy) obj).A01;
            int A0B = C86104wH.A0B(A0w);
            if (A1Z <= A0B) {
                int i5 = 1;
                while (true) {
                    Object obj3 = A0w.get(i5);
                    int i6 = ((C123657Xy) obj3).A01;
                    if (i4 < i6) {
                        obj = obj3;
                        i4 = i6;
                    }
                    if (i5 == A0B) {
                        break;
                    }
                    i5++;
                }
            }
        }
        C123657Xy r11 = (C123657Xy) obj;
        if (r11 != null) {
            i = r11.A01;
        } else {
            i = 0;
        }
        if (!A0w.isEmpty()) {
            obj2 = A0w.get(0);
            int i7 = ((C123657Xy) obj2).A00;
            int A0B2 = C86104wH.A0B(A0w);
            if (A1Z <= A0B2) {
                while (true) {
                    Object obj4 = A0w.get(i2);
                    int i8 = ((C123657Xy) obj4).A00;
                    if (i7 < i8) {
                        obj2 = obj4;
                        i7 = i8;
                    }
                    if (i2 == A0B2) {
                        break;
                    }
                    i2++;
                }
            }
        }
        C123657Xy r5 = (C123657Xy) obj2;
        if (r5 != null) {
            i3 = r5.A00;
        }
        this.A00.A01.CrC(new C114336t4(AnonymousClass7FV.A00(i, i3)));
        return C147618pd.A00(r13, C86144wL.A16(A0w, 2), i, i3);
    }

    public final int Bf9(C147838q0 r3, List list, int i) {
        return AnonymousClass8bL.A07(C86134wK.A0Q(list), i, 4);
    }

    public final int BfC(C147838q0 r3, List list, int i) {
        return AnonymousClass8bL.A07(C86134wK.A0Q(list), i, 5);
    }

    public final int BgK(C147838q0 r3, List list, int i) {
        return AnonymousClass8bL.A07(C86134wK.A0Q(list), i, 6);
    }

    public final int BgN(C147838q0 r3, List list, int i) {
        return AnonymousClass8bL.A07(C86134wK.A0Q(list), i, 7);
    }
}
