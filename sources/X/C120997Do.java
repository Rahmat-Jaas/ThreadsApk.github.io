package X;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2;

/* renamed from: X.7Do  reason: invalid class name and case insensitive filesystem */
public final class C120997Do {
    public int A00;
    public Map A01 = AnonymousClass4WJ.A0A();
    public final LinkedHashSet A02 = C86134wK.A0u();
    public final List A03 = AnonymousClass0wJ.A0v();
    public final List A04 = AnonymousClass0wJ.A0v();
    public final List A05 = AnonymousClass0wJ.A0v();
    public final List A06 = AnonymousClass0wJ.A0v();
    public final Map A07 = C18220wO.A0y();
    public final C83224qz A08;
    public final boolean A09;

    public static final C109606kH A00(C120997Do r10, AnonymousClass7VN r11, int i) {
        long j;
        int A082;
        long A002;
        int i2;
        boolean z = r11.A0D;
        long j2 = r11.A07;
        if (z) {
            j = j2 >> 32;
        } else {
            j = j2 & 4294967295L;
        }
        int i3 = (int) j;
        long j3 = r11.A06;
        if (z) {
            A082 = C86104wH.A07(j3);
        } else {
            A082 = C86104wH.A08(j3);
        }
        C109606kH r9 = new C109606kH(i3, A082);
        if (r10.A09) {
            A002 = AnonymousClass7Hh.A00(C86104wH.A07(j3), i);
        } else {
            A002 = AnonymousClass7Hh.A00(i, C86104wH.A08(j3));
        }
        List list = r11.A0B;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            List list2 = r9.A03;
            C123657Xy r0 = (C123657Xy) list.get(i4);
            if (z) {
                i2 = r0.A00;
            } else {
                i2 = r0.A01;
            }
            list2.add(new C109616kI(A002, i2));
        }
        return r9;
    }

    public static final void A01(C109606kH r13, C120997Do r14, AnonymousClass7VN r15) {
        List list;
        List list2;
        int i;
        int i2;
        while (true) {
            list = r13.A03;
            int size = list.size();
            list2 = r15.A0B;
            if (size <= list2.size()) {
                break;
            }
            C000300e.A0q(list);
        }
        while (list.size() < list2.size()) {
            int size2 = list.size();
            long A022 = AnonymousClass7Hh.A02(r15.A06, r13.A02);
            C123657Xy r3 = (C123657Xy) list2.get(size2);
            if (r15.A0D) {
                i2 = r3.A00;
            } else {
                i2 = r3.A01;
            }
            list.add(new C109616kI(A022, i2));
        }
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            C109616kI r4 = (C109616kI) list.get(i3);
            long A012 = AnonymousClass7Hh.A01(r4.A01, r13.A02);
            long j = r15.A06;
            C123657Xy r1 = (C123657Xy) list2.get(i3);
            if (r15.A0D) {
                i = r1.A00;
            } else {
                i = r1.A01;
            }
            r4.A00 = i;
            Object B01 = ((C123657Xy) list2.get(i3)).B01();
            if (!(B01 instanceof C147218oz)) {
                B01 = null;
            }
            if (A012 != j) {
                r4.A01 = AnonymousClass7Hh.A02(j, r13.A02);
                if (B01 != null) {
                    C147368pE.A04(r4.A03, true);
                    C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape14S0201000_I2(B01, (Object) r4, (C146958n9) null, 12), r14.A08, 3);
                }
            }
        }
    }

    public C120997Do(C83224qz r2, boolean z) {
        this.A08 = r2;
        this.A09 = z;
    }
}
