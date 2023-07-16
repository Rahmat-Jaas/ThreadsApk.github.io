package androidx.paging;

import X.AnonymousClass6D2;
import X.C124997cF;
import X.C125027cI;
import X.C141938dV;
import X.C145768l3;
import X.C146128lg;
import X.C148838sG;
import X.C27198Efl;
import X.C27952Ew2;
import X.C84714tk;
import X.C86144wL;
import X.JWT;
import java.util.concurrent.atomic.AtomicInteger;

public final class AsyncPagingDataDiffer {
    public boolean A00;
    public final AsyncPagingDataDiffer$differBase$1 A01;
    public final C145768l3 A02;
    public final JWT A03;
    public final C146128lg A04;
    public final AtomicInteger A05 = C86144wL.A11();
    public final C27952Ew2 A06;
    public final C84714tk A07;
    public final C84714tk A08;
    public final C27952Ew2 A09;

    static {
        C141938dV r0 = AnonymousClass6D2.A00;
        if (r0 == null) {
            r0 = new C125027cI();
        }
        AnonymousClass6D2.A00 = r0;
    }

    public AsyncPagingDataDiffer(JWT jwt, C146128lg r5, C27952Ew2 ew2, C27952Ew2 ew22) {
        this.A03 = jwt;
        this.A04 = r5;
        this.A09 = ew2;
        this.A06 = ew22;
        C124997cF r0 = new C124997cF(this);
        this.A02 = r0;
        AsyncPagingDataDiffer$differBase$1 asyncPagingDataDiffer$differBase$1 = new AsyncPagingDataDiffer$differBase$1(this, r0, ew2);
        this.A01 = asyncPagingDataDiffer$differBase$1;
        this.A07 = asyncPagingDataDiffer$differBase$1.A09;
        this.A08 = new C27198Efl((C148838sG) null, asyncPagingDataDiffer$differBase$1.A0A);
    }
}
