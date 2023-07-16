package androidx.navigation;

import X.AnonymousClass060;
import X.AnonymousClass061;
import X.AnonymousClass066;
import X.AnonymousClass7KG;
import X.C04220Ms;
import X.C123917Zx;
import X.C14260p5;
import X.C86154wM;
import java.util.Iterator;

public final /* synthetic */ class NavController$$ExternalSyntheticLambda0 implements C14260p5 {
    public final /* synthetic */ AnonymousClass7KG A00;

    public /* synthetic */ NavController$$ExternalSyntheticLambda0(AnonymousClass7KG r1) {
        this.A00 = r1;
    }

    public final void CMI(AnonymousClass060 r4, AnonymousClass066 r5) {
        AnonymousClass7KG r1 = this.A00;
        C04220Ms.A0B(r4, 2);
        AnonymousClass061 A002 = r4.A00();
        C04220Ms.A06(A002);
        r1.A03 = A002;
        if (r1.A06 != null) {
            Iterator it = r1.A0M.iterator();
            while (it.hasNext()) {
                C123917Zx A0J = C86154wM.A0J(it);
                AnonymousClass061 A003 = r4.A00();
                C04220Ms.A06(A003);
                A0J.A00 = A003;
                A0J.A01();
            }
        }
    }
}
