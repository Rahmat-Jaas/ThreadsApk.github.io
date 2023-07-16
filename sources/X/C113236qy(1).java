package X;

import java.util.List;

/* renamed from: X.6qy  reason: invalid class name and case insensitive filesystem */
public abstract class C113236qy {
    public final void A00(int i, int i2) {
        if (this instanceof AnonymousClass59S) {
            List list = ((AnonymousClass59S) this).A00;
            list.add(C18220wO.A0d());
            C86144wL.A1V(list, i);
            C86144wL.A1V(list, i2);
            return;
        }
        C146128lg r1 = ((AnonymousClass59R) this).A00.A03;
        if (r1 != null) {
            r1.BoV(i, i2, (Object) null);
        } else {
            C04220Ms.A0E("updateCallback");
            throw null;
        }
    }

    public final void A01(int i, int i2) {
        if (this instanceof AnonymousClass59S) {
            List list = ((AnonymousClass59S) this).A00;
            C86144wL.A1V(list, 1);
            C86144wL.A1V(list, i);
            C86144wL.A1V(list, i2);
            return;
        }
        C146128lg r0 = ((AnonymousClass59R) this).A00.A03;
        if (r0 != null) {
            r0.C2k(i, i2);
        } else {
            C04220Ms.A0E("updateCallback");
            throw null;
        }
    }
}
