package X;

import androidx.compose.ui.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape27S0201000_I2;
import kotlin.jvm.internal.KtLambdaShape3S0302000_I2;
import kotlin.jvm.internal.KtLambdaShape9S0400000_I2;

/* renamed from: X.6EG  reason: invalid class name */
public final class AnonymousClass6EG {
    public static final void A00(C147188nY r21, Modifier modifier, AnonymousClass0YM r23, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C147188nY r13 = r21;
        r13.Cvd(2036134589);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r13, (Object) null) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0G(r13, modifier2);
        }
        AnonymousClass0YM r17 = r23;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= C147188nY.A0B(r13, r17);
        }
        if ((i3 & 731) != 146 || !r13.BCM()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            AnonymousClass7W3 A0Y = C147188nY.A0Y(r13);
            Object A13 = A0Y.A13();
            if (A13 == AnonymousClass7GN.A00) {
                A13 = new C108536iW();
                A0Y.A14(A13);
            }
            AnonymousClass7W3.A0w(A0Y, false);
            C108536iW r9 = (C108536iW) A13;
            if (r9.A01 != null) {
                r9.A01 = null;
                List list = r9.A02;
                ArrayList A0w = AnonymousClass0wJ.A0w(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                    A0w.add((Object) null);
                }
                ArrayList A0s = C18200wM.A0s(A0w);
                if (!A0s.contains((Object) null)) {
                    A0s.add((Object) null);
                }
                list.clear();
                Iterator it2 = AnonymousClass00J.A0K(A0s).iterator();
                while (it2.hasNext()) {
                    it2.next();
                    list.add(new C114136sk(AnonymousClass7JR.A00(r13, new KtLambdaShape9S0400000_I2(1, (Object) null, (Object) null, A0s, r9), -94104314)));
                }
            }
            C146288ly A00 = C120767Cj.A00(r13, AnonymousClass7KV.A00(r13), false);
            Object A0p = C147188nY.A0p(r13);
            Object A0n = C147188nY.A0n(r13);
            Object A0m = C147188nY.A0m(r13);
            C147188nY.A0w(r13, A0Y, AnonymousClass74X.A00);
            AnonymousClass7W3.A0a(r13, A0Y, A00, A0p);
            AnonymousClass7KP.A08(r13, A0n, A0m, C98236Es.A00(modifier2), ((((((i3 >> 3) & 14) << 3) & 112) << 9) & 7168) | 6);
            AnonymousClass7WO A12 = A0Y.A12();
            if (A12 != null) {
                A12.A01 |= 1;
                r9.A00 = A12;
                r13.Cvb(-1656513320);
                List list2 = r9.A02;
                int size = list2.size();
                for (int i7 = 0; i7 < size; i7++) {
                    AnonymousClass0YM r5 = ((C114136sk) list2.get(i7)).A00;
                    r13.CvO(-208579897, (Object) null);
                    C86104wH.A1R(AnonymousClass7JR.A00(r13, new KtLambdaShape27S0201000_I2(i3, 18, (Object) null, r17), 2041982076), r13, r5, 6);
                    AnonymousClass7W3.A0w(A0Y, false);
                }
                AnonymousClass7W3.A0f(A0Y);
            } else {
                throw C18180wK.A0a("no recompose scope found");
            }
        } else {
            r13.CuJ();
        }
        C147178nW AKE = r13.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape3S0302000_I2(modifier2, (Object) null, r17, i5, i4, 1));
        }
    }
}
