package X;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.86d  reason: invalid class name and case insensitive filesystem */
public final class C1371086d implements C146838mw {
    public final /* synthetic */ Comparator A00;
    public final /* synthetic */ C146838mw A01;

    public C1371086d(Comparator comparator, C146838mw r2) {
        this.A01 = r2;
        this.A00 = comparator;
    }

    public final Iterator iterator() {
        List A02 = AnonymousClass8bJ.A02(this.A01);
        C001300p.A0y(A02, this.A00);
        return A02.iterator();
    }
}
