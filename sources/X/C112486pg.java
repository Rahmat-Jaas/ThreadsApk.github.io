package X;

import android.view.View;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.6pg  reason: invalid class name and case insensitive filesystem */
public final class C112486pg {
    public final /* synthetic */ C105746dv A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ AtomicBoolean A02;

    public C112486pg(C105746dv r1, List list, AtomicBoolean atomicBoolean) {
        this.A00 = r1;
        this.A01 = list;
        this.A02 = atomicBoolean;
    }

    public final void A00() {
        View view;
        Object obj;
        C144488ia r6 = null;
        for (C144488ia r4 : this.A01) {
            C112196pA BDb = r4.BDb();
            boolean z = BDb instanceof C94875xm;
            if (z) {
                view = ((C94875xm) BDb).A00.A00;
            } else {
                view = ((AnonymousClass5xl) BDb).A00.A00;
            }
            if (view != null) {
                boolean z2 = this.A02.get();
                if (BDb.A01) {
                    if (z) {
                        obj = ((C94875xm) BDb).A00.A00;
                    } else {
                        obj = ((AnonymousClass5xl) BDb).A00.A00;
                    }
                    if (obj != null) {
                        boolean z3 = BDb instanceof AnonymousClass5xl;
                        if (!z2 ? !z3 : z3) {
                            if (r6 == null) {
                                C105746dv r2 = this.A00;
                                r2.A00.execute(new AnonymousClass81V(view, r2));
                                r6 = r4;
                            }
                        }
                    }
                }
                C105746dv r22 = this.A00;
                r22.A00.execute(new AnonymousClass81W(view, r22));
            }
        }
    }
}
