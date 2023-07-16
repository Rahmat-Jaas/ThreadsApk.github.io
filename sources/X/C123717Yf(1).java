package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7Yf  reason: invalid class name and case insensitive filesystem */
public final class C123717Yf implements C145758l2 {
    public final C134747yH A00;
    public final List A01;
    public final List A02;
    public final C04530Oa A03;
    public final C04530Oa A04;

    public C123717Yf(C134747yH r34, C121807If r35, C143078g4 r36, C147168nV r37, List list) {
        String str;
        AnonymousClass79N r1;
        C134747yH r10 = r34;
        C04220Ms.A0B(r10, 1);
        C147168nV r30 = r37;
        List list2 = list;
        AnonymousClass0wJ.A1R(list2, r30);
        C143078g4 r31 = r36;
        C04220Ms.A0B(r31, 5);
        this.A00 = r10;
        this.A02 = list2;
        Integer num = AnonymousClass006.A0C;
        this.A04 = AnonymousClass0OY.A01(num, C86154wM.A13(this, 32));
        this.A03 = AnonymousClass0OY.A01(num, C86154wM.A13(this, 31));
        C121807If r32 = r35;
        C121237Ex r9 = r32.A00;
        String str2 = r10.A00;
        int length = str2.length();
        List list3 = r10.A02;
        list3 = list3 == null ? AnonymousClass0ZV.A00 : list3;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        int size = list3.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            AnonymousClass7HE A0H = C86154wM.A0H(list3, i);
            C121237Ex r0 = (C121237Ex) A0H.A02;
            int i3 = A0H.A01;
            int i4 = A0H.A00;
            if (i3 != i2) {
                AnonymousClass7HE.A01(r9, A0v, i2, i3);
            }
            AnonymousClass7HE.A01(r9.A02(r0), A0v, i3, i4);
            i++;
            i2 = i4;
        }
        if (i2 != length) {
            AnonymousClass7HE.A01(r9, A0v, i2, length);
        }
        if (A0v.isEmpty()) {
            A0v.add(new AnonymousClass7HE(r9, "", 0, 0));
        }
        ArrayList A0t = C18200wM.A0t(A0v);
        int size2 = A0v.size();
        for (int i5 = 0; i5 < size2; i5++) {
            AnonymousClass7HE r12 = (AnonymousClass7HE) A0v.get(i5);
            int i6 = r12.A01;
            int i7 = r12.A00;
            if (i6 != i7) {
                str = C18230wP.A0s(str2, i6, i7);
            } else {
                str = "";
            }
            C134747yH r3 = new C134747yH(str, AnonymousClass7G7.A00(r10, i6, i7), (List) null, (List) null);
            C121237Ex r122 = (C121237Ex) r12.A02;
            if (r122.A09 == null) {
                C114326t3 r24 = r9.A09;
                C121117Ee r19 = r122.A08;
                long j = r122.A03;
                AnonymousClass79W r18 = r122.A0A;
                AnonymousClass79A r16 = r122.A04;
                AnonymousClass79A r192 = r16;
                r122 = new C121237Ex(r192, r122.A05, r122.A06, r122.A07, r19, r24, r18, r122.A0B, j);
            }
            String str3 = r3.A00;
            AnonymousClass7F0 r13 = r32.A02;
            C121237Ex A022 = r9.A02(r122);
            C113216qw r2 = r13.A05;
            AnonymousClass79A r02 = A022.A04;
            if (r2 == null && r02 == null) {
                r1 = null;
            } else {
                r1 = new AnonymousClass79N(r02, r2);
            }
            C121807If r03 = new C121807If(A022, r1, r13);
            List list4 = r3.A03;
            list4 = list4 == null ? AnonymousClass0ZV.A00 : list4;
            List list5 = this.A02;
            ArrayList A0t2 = C18200wM.A0t(list5);
            int size3 = list5.size();
            for (int i8 = 0; i8 < size3; i8++) {
                AnonymousClass7HE.A02(A0t2, list5, i8, i6, i7);
            }
            ArrayList A0k = C18240wQ.A0k(A0t2.size());
            int size4 = A0t2.size();
            for (int i9 = 0; i9 < size4; i9++) {
                AnonymousClass7HE r04 = (AnonymousClass7HE) A0t2.get(i9);
                if (i6 > r04.A01 || r04.A00 > i7) {
                    throw C18190wL.A0a("placeholder can not overlap with paragraph.");
                }
                AnonymousClass7HE.A01(r04.A02, A0k, r04.A01 - i6, r04.A00 - i6);
            }
            A0t.add(new C114896u4(new C123727Yg(r03, r31, r30, str3, list4, A0k), i6, i7));
        }
        this.A01 = A0t;
    }

    public final boolean AmN() {
        List list = this.A01;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((C114896u4) list.get(i)).A02.AmN()) {
                return true;
            }
        }
        return false;
    }

    public final float Atb() {
        return C18240wQ.A00(this.A03.getValue());
    }

    public final float Avj() {
        return C18240wQ.A00(this.A04.getValue());
    }
}
