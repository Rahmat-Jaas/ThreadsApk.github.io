package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7wI  reason: invalid class name and case insensitive filesystem */
public final class C133757wI implements C27901EvC {
    public C145888lH A00;

    public final List B2y() {
        List<C144248i4> B2y = this.A00.B2y();
        ArrayList A0w = AnonymousClass0wJ.A0w(B2y);
        for (C144248i4 r1 : B2y) {
            C04220Ms.A0B(r1, 1);
            A0w.add(new AnonymousClass7HP(r1.B1z()));
        }
        return A0w;
    }

    public final String BH2() {
        return this.A00.BH2();
    }

    public final String getId() {
        return this.A00.getId();
    }

    public C133757wI(C145888lH r1) {
        this.A00 = r1;
    }
}
