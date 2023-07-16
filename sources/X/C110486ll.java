package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.6ll  reason: invalid class name and case insensitive filesystem */
public class C110486ll {
    public AnonymousClass6HH A00;
    public C104686cC A01;
    public C82414pa A02;
    public final C131627sW A03 = new C131627sW();
    public final List A04;

    public C110486ll(AnonymousClass6HH r2, C104686cC r3, C82414pa r4, List list) {
        if (r4 instanceof C692947s) {
            this.A02 = r4;
        } else {
            this.A02 = new C692947s(r4);
        }
        this.A00 = r2;
        if (list == null) {
            this.A04 = Collections.emptyList();
        } else {
            this.A04 = list;
        }
        this.A01 = r3;
    }
}
