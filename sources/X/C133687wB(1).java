package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7wB  reason: invalid class name and case insensitive filesystem */
public final class C133687wB implements C39781Kzp {
    public final AnonymousClass3Z0 A00;

    public final void A5A(C37284Jnx jnx, C2R c2r, C126897g8 r3) {
    }

    public final void A5C(C37284Jnx jnx, C2R c2r, C126897g8 r8) {
        List<C107146gF> list = r8.A02;
        ArrayList A0w = AnonymousClass0wJ.A0w(list);
        for (C107146gF r0 : list) {
            A0w.add(r0.A00);
        }
        if (!A0w.isEmpty() && AnonymousClass6HC.A00((AnonymousClass78x) A0w.get(0)) >= 250) {
            Object obj = jnx.A02;
            C04220Ms.A05(obj);
            this.A00.A02(AnonymousClass6TE.A00((BKU) obj));
        }
    }

    public final void A5E(C37284Jnx jnx, C2R c2r, C126897g8 r3) {
    }

    public C133687wB(AnonymousClass3Z0 r1) {
        this.A00 = r1;
    }
}
