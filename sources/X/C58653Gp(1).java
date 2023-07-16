package X;

import java.util.Collection;
import java.util.List;

/* renamed from: X.3Gp  reason: invalid class name and case insensitive filesystem */
public final class C58653Gp {
    public boolean A00 = false;
    public final List A01 = C18240wQ.A0k(4);

    public final AnonymousClass3GO A00() {
        AnonymousClass3GO r0;
        List list = this.A01;
        int size = list.size();
        if (size == 0) {
            r0 = AnonymousClass30F.A00;
        } else if (size != 1) {
            r0 = new AnonymousClass1Q7((AnonymousClass3GO[]) list.toArray(new AnonymousClass3GO[size]));
        } else {
            r0 = (AnonymousClass3GO) C18240wQ.A0b(list);
        }
        if (this.A00) {
            return new AnonymousClass1Q9(r0);
        }
        return r0;
    }

    public final void A01(Collection collection) {
        if (!collection.isEmpty()) {
            this.A01.add(new AnonymousClass1Q8(collection));
            return;
        }
        throw C18190wL.A0a("Cannot set 0 schemes");
    }
}
