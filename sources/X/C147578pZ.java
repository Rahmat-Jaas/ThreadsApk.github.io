package X;

import androidx.compose.ui.unit.Constraints;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8pZ  reason: invalid class name and case insensitive filesystem */
public interface C147578pZ extends C147148nT {
    static void A02(Iterator it, int i, long j) {
        C123657Xy Bg4 = ((C147578pZ) it.next()).Bg4(Constraints.A05(Constraints.A04(j), Constraints.A02(j), 0, Constraints.A01(j)));
        C122067Jz.A02(Bg4, 0, i - Bg4.A00);
    }

    C123657Xy Bg4(long j);

    static int A00(AbstractCollection abstractCollection, List list, int i, long j) {
        abstractCollection.add(((C147578pZ) list.get(i)).Bg4(j));
        return i + 1;
    }

    static void A01(AbstractCollection abstractCollection, Iterator it, long j) {
        abstractCollection.add(((C147578pZ) it.next()).Bg4(j));
    }
}
