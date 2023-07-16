package X;

import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.54Q  reason: invalid class name */
public final class AnonymousClass54Q extends C123497Xd {
    public static final AnonymousClass54Q A00 = new AnonymousClass54Q();

    public final C146098ld Bg2(C147618pd r8, List list, long j) {
        int A04;
        int A03;
        AnonymousClass0YY A10;
        AnonymousClass0YY A102;
        int i = 0;
        boolean A1Z = AnonymousClass0wJ.A1Z(r8, list);
        if (list.isEmpty()) {
            A04 = Constraints.A04(j);
            A03 = Constraints.A03(j);
            A102 = C77934hc.A00;
        } else {
            if (list.size() == A1Z) {
                C123657Xy Bg4 = ((C147578pZ) list.get(0)).Bg4(j);
                A04 = AnonymousClass8bI.A04(j, Bg4.A01);
                A03 = AnonymousClass8bI.A03(j, Bg4.A00);
                A102 = C86154wM.A10(Bg4, 33);
            } else {
                ArrayList A0t = C18200wM.A0t(list);
                int size = list.size();
                int i2 = 0;
                while (i2 < size) {
                    i2 = C147578pZ.A00(A0t, list, i2, j);
                }
                int size2 = A0t.size();
                int i3 = 0;
                for (int i4 = 0; i4 < size2; i4++) {
                    C123657Xy r1 = (C123657Xy) A0t.get(i4);
                    i3 = Math.max(r1.A01, i3);
                    i = Math.max(r1.A00, i);
                }
                A04 = AnonymousClass8bI.A04(j, i3);
                A03 = AnonymousClass8bI.A03(j, i);
                A10 = C86154wM.A10(A0t, 34);
                return C147618pd.A00(r8, A10, A04, A03);
            }
        }
        A10 = A102;
        return C147618pd.A00(r8, A10, A04, A03);
    }

    public AnonymousClass54Q() {
        super("Undefined intrinsics block and it is required");
    }
}
