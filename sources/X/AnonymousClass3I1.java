package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.3I1  reason: invalid class name */
public final class AnonymousClass3I1 {
    public int A00 = 0;
    public final List A01 = new LinkedList();

    public final List A00() {
        ArrayList A0k = C18240wQ.A0k(this.A00);
        for (Object next : this.A01) {
            if (next instanceof C41882MfV) {
                A0k.add(next);
            } else {
                A0k.addAll((Collection) next);
            }
        }
        return A0k;
    }

    public final void A01(C41882MfV mfV) {
        this.A01.add(mfV);
        this.A00++;
    }

    public final void A02(List list) {
        this.A01.add(list);
        this.A00 += list.size();
    }
}
