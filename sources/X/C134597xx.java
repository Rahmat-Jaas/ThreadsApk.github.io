package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7xx  reason: invalid class name and case insensitive filesystem */
public final class C134597xx implements C146028lV {
    public final AnonymousClass3Z0 A00;

    public final void A5B(C142128du r1, C37284Jnx jnx, C2R c2r) {
    }

    public final void A5F(C142128du r1, C37284Jnx jnx, C2R c2r) {
    }

    public C134597xx(AnonymousClass3Z0 r1) {
        this.A00 = r1;
    }

    public final void A5D(C142128du r6, C37284Jnx jnx, C2R c2r) {
        boolean A1X = C18240wQ.A1X(r6);
        List<C107146gF> list = ((C126897g8) r6).A02;
        ArrayList A0w = AnonymousClass0wJ.A0w(list);
        for (C107146gF r0 : list) {
            A0w.add(r0.A00);
        }
        if (C18250wR.A1K(A0w) && AnonymousClass6HC.A00((AnonymousClass78x) A0w.get(A1X ? 1 : 0)) >= 250) {
            Object obj = jnx.A02;
            C04220Ms.A05(obj);
            this.A00.A02(AnonymousClass6TE.A00((BKU) obj));
        }
    }
}
