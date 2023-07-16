package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7G7  reason: invalid class name */
public final class AnonymousClass7G7 {
    public static final C134747yH A00 = C134747yH.A04("");

    public static final List A00(C134747yH r8, int i, int i2) {
        List list;
        ArrayList arrayList = null;
        if (!(i == i2 || (list = r8.A03) == null)) {
            if (i == 0 && i2 >= C134747yH.A02(r8)) {
                return list;
            }
            ArrayList A0t = C18200wM.A0t(list);
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                AnonymousClass7HE.A02(A0t, list, i3, i, i2);
            }
            arrayList = C18240wQ.A0k(A0t.size());
            int size2 = A0t.size();
            for (int i4 = 0; i4 < size2; i4++) {
                AnonymousClass7HE r3 = (AnonymousClass7HE) A0t.get(i4);
                AnonymousClass7HE.A01(r3.A02, arrayList, AnonymousClass8bI.A02(r3.A01, i, i2) - i, AnonymousClass8bI.A02(r3.A00, i, i2) - i);
            }
        }
        return arrayList;
    }

    public static final List A01(List list, int i, int i2) {
        if (i <= i2) {
            if (list != null) {
                ArrayList A0t = C18200wM.A0t(list);
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    AnonymousClass7HE.A02(A0t, list, i3, i, i2);
                }
                ArrayList A0k = C18240wQ.A0k(A0t.size());
                int size2 = A0t.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    AnonymousClass7HE r1 = (AnonymousClass7HE) A0t.get(i4);
                    A0k.add(new AnonymousClass7HE(r1.A02, r1.A03, Math.max(i, r1.A01) - i, Math.min(i2, r1.A00) - i));
                }
                if (!A0k.isEmpty()) {
                    return A0k;
                }
            }
            return null;
        }
        throw C18190wL.A0a(C86134wK.A0l(i, i2, "start (", ") should be less than or equal to end ("));
    }

    public static final boolean A02(int i, int i2, int i3, int i4) {
        if (Math.max(i, i3) < Math.min(i2, i4)) {
            return true;
        }
        if (i <= i3 && i4 <= i2 && (i2 != i4 || AnonymousClass0wJ.A1T(i3, i4) == AnonymousClass0wJ.A1T(i, i2))) {
            return true;
        }
        if (i3 > i || i2 > i4) {
            return false;
        }
        if (i4 != i2 || AnonymousClass0wJ.A1T(i, i2) == AnonymousClass0wJ.A1T(i3, i4)) {
            return true;
        }
        return false;
    }
}
