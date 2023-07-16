package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6sJ  reason: invalid class name and case insensitive filesystem */
public final class C113876sJ {
    public int A00;
    public List A01 = AnonymousClass0ZV.A00;
    public final C147288p6 A02;
    public final ArrayList A03;
    public final List A04 = AnonymousClass0wJ.A0v();

    public final int A00(int i) {
        C147288p6 r1 = this.A02;
        if (r1.getItemCount() <= 0) {
            return 0;
        }
        if (C18230wP.A1W(i, r1.getItemCount())) {
            return i / this.A00;
        }
        throw C18190wL.A0a("Failed requirement.");
    }

    public final int A01(int i) {
        C147288p6 r0 = this.A02;
        AnonymousClass7VP r2 = AnonymousClass7VP.A00;
        C108506iT ANr = ((C123077Vf) r0).A00.ANr(i);
        return AnonymousClass8bI.A02((int) ((C114096sg) C86164wN.A0a(r2, ((AnonymousClass7VZ) ANr.A02).A00, i - ANr.A01)).A00, 1, this.A00);
    }

    public C113876sJ(C147288p6 r3) {
        this.A02 = r3;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        A0v.add(new C97966Dq());
        this.A03 = A0v;
    }
}
