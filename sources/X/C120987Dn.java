package X;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2;

/* renamed from: X.7Dn  reason: invalid class name and case insensitive filesystem */
public final class C120987Dn {
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

    public static final C106726fV A00(C120987Dn r12, AnonymousClass7VH r13, int i) {
        long A002;
        int i2;
        C106726fV r8 = new C106726fV();
        List list = r13.A04;
        long j = ((C106736fW) list.get(0)).A00;
        if (r12.A09) {
            A002 = AnonymousClass7Hh.A00(C86104wH.A07(j), i);
        } else {
            A002 = AnonymousClass7Hh.A00(i, C86104wH.A08(j));
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            long A022 = AnonymousClass7Hh.A02(((C106736fW) list.get(i3)).A00, j);
            List list2 = r8.A01;
            long A012 = AnonymousClass7Hh.A01(A002, A022);
            C123657Xy r11 = ((C106736fW) list.get(i3)).A01;
            if (r13.A06) {
                i2 = r11.A00;
            } else {
                i2 = r11.A01;
            }
            list2.add(new C109596kG(A012, i2));
        }
        return r8;
    }

    public static final void A01(C106726fV r13, C120987Dn r14, AnonymousClass7VH r15) {
        List list;
        List list2;
        int i;
        int i2;
        while (true) {
            list = r13.A01;
            int size = list.size();
            list2 = r15.A04;
            if (size <= list2.size()) {
                break;
            }
            C000300e.A0q(list);
        }
        while (list.size() < list2.size()) {
            int size2 = list.size();
            long A022 = AnonymousClass7Hh.A02(((C106736fW) list2.get(size2)).A00, r13.A00);
            C123657Xy r3 = ((C106736fW) list2.get(size2)).A01;
            if (r15.A06) {
                i2 = r3.A00;
            } else {
                i2 = r3.A01;
            }
            list.add(new C109596kG(A022, i2));
        }
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            C109596kG r4 = (C109596kG) list.get(i3);
            long A012 = AnonymousClass7Hh.A01(r4.A01, r13.A00);
            long j = ((C106736fW) list2.get(i3)).A00;
            C123657Xy r1 = ((C106736fW) list2.get(i3)).A01;
            if (r15.A06) {
                i = r1.A00;
            } else {
                i = r1.A01;
            }
            r4.A00 = i;
            C147218oz A002 = r15.A00(i3);
            if (A012 != j) {
                r4.A01 = AnonymousClass7Hh.A02(j, r13.A00);
                if (A002 != null) {
                    C147368pE.A04(r4.A03, true);
                    C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape14S0201000_I2((Object) A002, (Object) r4, (C146958n9) null, 11), r14.A08, 3);
                }
            }
        }
    }

    public C120987Dn(C83224qz r2, boolean z) {
        this.A08 = r2;
        this.A09 = z;
    }
}
