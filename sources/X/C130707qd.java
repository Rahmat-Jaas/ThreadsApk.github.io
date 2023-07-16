package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7qd  reason: invalid class name and case insensitive filesystem */
public final class C130707qd implements C145528ke {
    public final List A00;

    public final C127397h3 A8m(C127397h3 r12) {
        List list;
        int i;
        ArrayList arrayList = null;
        int i2 = 0;
        C127397h3 r5 = r12;
        while (true) {
            list = this.A00;
            if (i2 >= list.size()) {
                break;
            }
            Pair pair = (Pair) list.get(i2);
            if (((C144588ik) pair.first).Cx4(r5)) {
                if (arrayList == null) {
                    arrayList = AnonymousClass0wJ.A0v();
                }
                arrayList.add(pair);
                C111556ns r2 = (C111556ns) pair.second;
                if (r2 instanceof C95275zl) {
                    C04220Ms.A0B(r5, 0);
                    if (r5.A0H(31, 0) == ((C95275zl) r2).A00) {
                    }
                } else if (r2 instanceof C95305zp) {
                    C95305zp r22 = (C95305zp) r2;
                    int i3 = r22.A00;
                    Object obj = r22.A01;
                    Object A0A = C127397h3.A0A(r5, i3);
                    if (A0A != obj) {
                        if (!(obj instanceof Number)) {
                            i = !C100986Pl.A00(A0A, obj);
                        } else if (A0A instanceof Number) {
                            Number number = (Number) A0A;
                            Number number2 = (Number) obj;
                            if (number.longValue() == number2.longValue()) {
                                i = (number.doubleValue() > number2.doubleValue() ? 1 : (number.doubleValue() == number2.doubleValue() ? 0 : -1));
                            }
                        }
                        if (i == 0) {
                        }
                    }
                }
                if (r5 == r12) {
                    r5 = new C127397h3(r12, (C127397h3) null, r12.A07, r12.A02);
                }
                ((C111556ns) pair.second).A00(r5);
            }
            i2++;
        }
        if (arrayList != null) {
            list.removeAll(arrayList);
        }
        return r5;
    }

    public final void CRq(C127397h3 r1) {
    }

    public C130707qd(List list) {
        this.A00 = C18200wM.A0s(list);
    }
}
